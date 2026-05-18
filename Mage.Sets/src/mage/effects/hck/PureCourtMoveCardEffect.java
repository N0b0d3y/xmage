package mage.effects.hck;

import mage.abilities.Ability;
import mage.abilities.effects.OneShotEffect;
import mage.cards.Card;
import mage.constants.Outcome;
import mage.constants.Zone;
import mage.game.Game;
import mage.players.Player;

public class PureCourtMoveCardEffect extends OneShotEffect {

    public PureCourtMoveCardEffect() {
        super(Outcome.Benefit);
        this.staticText = "you choose the top card of your deck and put it into your hand";
    }

    private PureCourtMoveCardEffect(final PureCourtMoveCardEffect effect) {
        super(effect);
    }

    @Override
    public boolean apply(Game game, Ability source) {
        Player controller = game.getPlayer(source.getControllerId());
        if (controller != null && !controller.getLibrary().isEmptyDraw()) {
            Card card = controller.getLibrary().getFromTop(game);
            if (card != null) {
                return controller.moveCards(card, Zone.HAND, source, game);
            }
        }
        return true;
    }

    @Override
    public PureCourtMoveCardEffect copy() {
        return new PureCourtMoveCardEffect(this);
    }
}
