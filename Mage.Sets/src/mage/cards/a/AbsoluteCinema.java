package mage.cards.a;

import mage.ObjectColor;
import mage.abilities.effects.common.continuous.GainAbilityAllEffect;
import mage.abilities.keyword.ProtectionAbility;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;
import mage.constants.Duration;
import mage.filter.common.FilterCreaturePermanent;

import java.util.UUID;

public class AbsoluteCinema extends CardImpl {
    public AbsoluteCinema(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId, setInfo, new CardType[]{CardType.SORCERY}, "{1}{W}");

        this.getSpellAbility().addEffect(new GainAbilityAllEffect(
                ProtectionAbility.from(ObjectColor.BLACK),
                Duration.EndOfTurn,
                new FilterCreaturePermanent("All creatures")
        ));
    }

    private AbsoluteCinema(final AbsoluteCinema card) {
        super(card);
    }

    @Override
    public AbsoluteCinema copy() {
        return new AbsoluteCinema(this);
    }
}
