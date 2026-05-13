package mage.cards.l;

import mage.abilities.common.CastAsThoughItHadFlashIfConditionAbility;
import mage.abilities.effects.common.DamageTargetEffect;
import mage.abilities.effects.common.continuous.BoostTargetEffect;
import mage.abilities.effects.common.continuous.GainAbilityAllEffect;
import mage.abilities.effects.common.continuous.GainAbilityTargetEffect;
import mage.abilities.keyword.PlainswalkAbility;
import mage.abilities.keyword.TrampleAbility;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.cards.k.KongmingsTrap;
import mage.conditions.hck.KongmingsTrapCondition;
import mage.constants.CardType;
import mage.constants.Duration;
import mage.filter.common.FilterControlledCreaturePermanent;
import mage.target.common.TargetAttackingCreature;
import mage.target.common.TargetCreaturePermanent;

import java.util.UUID;

public class LegacyOfThePlaneswalkers extends CardImpl {
    public LegacyOfThePlaneswalkers(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId, setInfo, new CardType[]{CardType.SORCERY}, "{W}");

        this.getSpellAbility().addTarget(new TargetCreaturePermanent());

        this.getSpellAbility().addEffect(new BoostTargetEffect(2, 2, Duration.EndOfTurn));
        this.getSpellAbility().addEffect(new GainAbilityTargetEffect(
                new PlainswalkAbility(),
                Duration.EndOfTurn,
                "and gains plainswalk until end of turn"
        ));
    }

    private LegacyOfThePlaneswalkers(final LegacyOfThePlaneswalkers card) {
        super(card);
    }

    @Override
    public LegacyOfThePlaneswalkers copy() {
        return new LegacyOfThePlaneswalkers(this);
    }
}
