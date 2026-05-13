package mage.cards.r;

import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;
import mage.effects.hck.RomeoAndJulietEffect;
import mage.filter.common.FilterCreaturePermanent;
import mage.target.common.TargetCreaturePermanent;

import java.util.UUID;

public class RomeoAndJuliet extends CardImpl {

    public RomeoAndJuliet(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId, setInfo, new CardType[]{CardType.SORCERY}, "{W}");

        // Target two creatures controlled by different players
        this.getSpellAbility().addTarget(new TargetCreaturePermanent(2, 2));
        this.getSpellAbility().addEffect(new RomeoAndJulietEffect());
    }

    private RomeoAndJuliet(final RomeoAndJuliet card) {
        super(card);
    }

    @Override
    public RomeoAndJuliet copy() {
        return new RomeoAndJuliet(this);
    }
}
