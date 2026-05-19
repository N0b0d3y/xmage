package mage.cards.r;

import mage.abilities.Ability;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;
import mage.effects.hck.Returning100000ArrowsEffect;
import mage.filter.common.FilterCreaturePermanent;
import mage.game.Game;
import mage.targetAdjuster.hck.Returning100000ArrowsAdjuster;

import java.util.UUID;

public class Returning100000Arrows extends CardImpl {

    public Returning100000Arrows(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId, setInfo, new CardType[]{CardType.SORCERY}, "{2}{W}");

        this.getSpellAbility().addEffect(new Returning100000ArrowsEffect());
        this.getSpellAbility().setTargetAdjuster(new Returning100000ArrowsAdjuster());
    }

    private Returning100000Arrows(final Returning100000Arrows card) {
        super(card);
    }

    @Override
    public Returning100000Arrows copy() {
        return new Returning100000Arrows(this);
    }
}
