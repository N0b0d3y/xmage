package mage.cards.k;

import mage.abilities.common.CastAsThoughItHadFlashIfConditionAbility;
import mage.abilities.common.SimpleStaticAbility;
import mage.abilities.effects.common.DamageTargetEffect;
import mage.abilities.effects.common.continuous.CastAsThoughItHadFlashSourceEffect;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.conditions.hck.KongmingsTrapCondition;
import mage.constants.CardType;
import mage.constants.Zone;
import mage.game.Game;
import mage.target.common.TargetAttackingCreature;

import java.util.UUID;

public class KongmingsTrap extends CardImpl {

    public KongmingsTrap(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId, setInfo, new CardType[]{CardType.SORCERY}, "{W}");

        this.getSpellAbility().addEffect(new DamageTargetEffect(2));
        this.getSpellAbility().addTarget(new TargetAttackingCreature());

        this.addAbility(new CastAsThoughItHadFlashIfConditionAbility(
                KongmingsTrapCondition.instance,
                "You may cast {this} during the declare blockers step if you were attacked."
        ));
    }

    private KongmingsTrap(final KongmingsTrap card) {
        super(card);
    }

    @Override
    public KongmingsTrap copy() {
        return new KongmingsTrap(this);
    }
}
