package mage.effects.hck;

import mage.abilities.Ability;
import mage.abilities.effects.OneShotEffect;
import mage.cards.Card;
import mage.cards.Cards;
import mage.cards.CardsImpl;
import mage.constants.Outcome;
import mage.constants.Zone;
import mage.filter.FilterCard;
import mage.filter.common.FilterCreatureCard;
import mage.filter.common.FilterInstantOrSorceryCard;
import mage.filter.common.FilterSorceryCard;
import mage.game.Game;
import mage.players.Player;
import mage.target.TargetCard;
import mage.target.common.TargetCardInLibrary;

import java.util.UUID;

public class HouseOfTutorsEffect extends OneShotEffect {

    public HouseOfTutorsEffect(String name) {
        super(Outcome.DrawCard);
        this.staticText = "Search your library for a sorcery, creature, and any card. Reveal them. " +
                "Shuffle, then your opponent chooses two to put on the bottom. Put the rest on top.";
    }

    public HouseOfTutorsEffect() {
        this("House of Tutors");
    }

    @Override
    public boolean apply(Game game, Ability source) {
        Player controller = game.getPlayer(source.getControllerId());
        UUID opponentId = game.getOpponents(controller.getId()).stream().findFirst().orElse(null);
        Player opponent = game.getPlayer(opponentId);

        if (controller == null || opponent == null) return false;

        Cards searchedCards = new CardsImpl();

        TargetCardInLibrary target1 = new TargetCardInLibrary(new FilterSorceryCard("a sorcery"));
        if (controller.searchLibrary(target1, source, game)) {
            searchedCards.add(target1.getFirstTarget());
        }

        TargetCardInLibrary target2 = new TargetCardInLibrary(new FilterCreatureCard("a creature"));
        if (controller.searchLibrary(target2, source, game)) {
            searchedCards.add(target2.getFirstTarget());
        }

        TargetCardInLibrary target3 = new TargetCardInLibrary(new FilterCard("any card"));
        if (controller.searchLibrary(target3, source, game)) {
            searchedCards.add(target3.getFirstTarget());
        }

        controller.revealCards(source, searchedCards, game);
        controller.shuffleLibrary(source, game);

        if (searchedCards.size() > 0) {
            int toBottomCount = Math.min(searchedCards.size(), 2);
            TargetCard targetToBottom = new TargetCard(toBottomCount, toBottomCount, Zone.LIBRARY, new FilterCard("cards to put on bottom"));

            if (opponent.choose(Outcome.Detriment, searchedCards, targetToBottom, source, game)) {
                for (UUID cardId : targetToBottom.getTargets()) {
                    Card card = searchedCards.get(cardId, game);
                    if (card != null) {
                        controller.putCardsOnBottomOfLibrary(new CardsImpl(card), game, source, false);
                        searchedCards.remove(card);
                    }
                }
            }

            controller.putCardsOnTopOfLibrary(searchedCards, game, source, false);
        }

        return true;
    }

    private HouseOfTutorsEffect(final HouseOfTutorsEffect effect) {
        super(effect);
    }

    @Override
    public HouseOfTutorsEffect copy() {
        return new HouseOfTutorsEffect(this);
    }
}
