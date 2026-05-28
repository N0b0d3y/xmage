package mage.cards.e;

import mage.abilities.effects.common.DestroyAllEffect;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;
import mage.filter.StaticFilters;

import java.util.UUID;

public class EveryPortalSetHadArmageddonInItBtw extends CardImpl {

    public EveryPortalSetHadArmageddonInItBtw(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId,setInfo,new CardType[]{CardType.SORCERY},"{3}{W}");


        this.getSpellAbility().addEffect(new DestroyAllEffect(StaticFilters.FILTER_LANDS));
    }

    private EveryPortalSetHadArmageddonInItBtw(final EveryPortalSetHadArmageddonInItBtw card) {
        super(card);
    }

    @Override
    public EveryPortalSetHadArmageddonInItBtw copy() {
        return new EveryPortalSetHadArmageddonInItBtw(this);
    }
}
