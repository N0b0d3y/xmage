package mage.cards.e;

import mage.abilities.effects.common.DrawCardSourceControllerEffect;
import mage.abilities.effects.common.PhaseOutAllEffect;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;
import mage.effects.hck.EmptyCityVacationEffect;
import mage.filter.common.FilterControlledCreaturePermanent;
import mage.filter.common.FilterCreaturePermanent;

import java.util.UUID;

public class EmptyCityNotActuallyARuse extends CardImpl {
    public EmptyCityNotActuallyARuse(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId, setInfo, new CardType[]{CardType.SORCERY}, "{1}{W}");

        this.getSpellAbility().addEffect(new EmptyCityVacationEffect());

        this.getSpellAbility().addEffect(new DrawCardSourceControllerEffect(1));
    }

    private EmptyCityNotActuallyARuse(final EmptyCityNotActuallyARuse card) {
        super(card);
    }

    @Override
    public EmptyCityNotActuallyARuse copy() {
        return new EmptyCityNotActuallyARuse(this);
    }
}
