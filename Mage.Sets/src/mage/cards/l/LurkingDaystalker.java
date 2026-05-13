package mage.cards.l;

import mage.MageInt;
import mage.abilities.common.BlocksSourceTriggeredAbility;
import mage.abilities.effects.common.continuous.BoostSourceEffect;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;
import mage.constants.Duration;
import mage.constants.SubType;

import java.util.UUID;

public class LurkingDaystalker extends CardImpl {
    public LurkingDaystalker(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId, setInfo, new CardType[]{CardType.CREATURE}, "{W}");

        this.subtype.add(SubType.DAYSTALKER);
        this.power = new MageInt(1);
        this.toughness = new MageInt(1);

        this.addAbility(new BlocksSourceTriggeredAbility(
                new BoostSourceEffect(0, 2, Duration.EndOfTurn),
                false
        ));
    }

    private LurkingDaystalker(final LurkingDaystalker card) {
        super(card);
    }

    @Override
    public LurkingDaystalker copy() {
        return new LurkingDaystalker(this);
    }
}
