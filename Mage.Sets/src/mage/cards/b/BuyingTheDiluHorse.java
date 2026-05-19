package mage.cards.b;

import mage.abilities.effects.common.DrawCardTargetControllerEffect;
import mage.abilities.effects.common.continuous.GainControlTargetEffect;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;
import mage.constants.Duration;
import mage.effects.hck.BuyingTheDiluHorseManaEffect;
import mage.filter.common.FilterOpponentsCreaturePermanent;
import mage.target.common.TargetCreaturePermanent;
import mage.target.common.TargetOpponentsCreaturePermanent;

import java.util.UUID;

public class BuyingTheDiluHorse extends CardImpl {

    public BuyingTheDiluHorse(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId, setInfo, new CardType[]{CardType.SORCERY}, "{1}{W}{W}");

        this.getSpellAbility().addTarget(new TargetOpponentsCreaturePermanent());
        this.getSpellAbility().addEffect(new BuyingTheDiluHorseManaEffect());
        this.getSpellAbility().addEffect(new GainControlTargetEffect(Duration.EndOfGame));
    }

    private BuyingTheDiluHorse(final BuyingTheDiluHorse card) {
        super(card);
    }

    @Override
    public BuyingTheDiluHorse copy() {
        return new BuyingTheDiluHorse(this);
    }
}
