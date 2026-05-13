package mage.cards.c;

import mage.MageInt;
import mage.abilities.common.AttacksAndIsNotBlockedTriggeredAbility;
import mage.abilities.effects.common.DrawCardTargetEffect;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;
import mage.constants.SetTargetPointer;
import mage.constants.SubType;
import mage.constants.SuperType;
import mage.target.common.TargetOpponent;

import java.util.UUID;

public class CelestialDaystalker extends CardImpl {
    public CelestialDaystalker(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId, setInfo, new CardType[]{CardType.CREATURE}, "{W}{W}");

        this.subtype.add(SubType.DAYSTALKER);
        this.power = new MageInt(4);
        this.toughness = new MageInt(2);

        this.addAbility(new AttacksAndIsNotBlockedTriggeredAbility(
                new DrawCardTargetEffect(1, true),
                false,
                SetTargetPointer.PLAYER
        ));
    }

    private CelestialDaystalker(final CelestialDaystalker card) {
        super(card);
    }

    @Override
    public CelestialDaystalker copy() {
        return new CelestialDaystalker(this);
    }
}
