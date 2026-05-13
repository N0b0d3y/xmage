package mage.cards.b;

import mage.MageInt;
import mage.abilities.keyword.PhasingAbility;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;
import mage.constants.SubType;
import mage.constants.SuperType;

import java.util.UUID;

public class BrownPolarBear extends CardImpl {
    public BrownPolarBear(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId, setInfo, new CardType[]{CardType.CREATURE}, "{1}{W}");

        this.supertype.add(SuperType.SNOW);
        this.subtype.add(SubType.BEAR);
        this.power = new MageInt(2);
        this.toughness = new MageInt(2);
    }

    private BrownPolarBear(final BrownPolarBear card) {
        super(card);
    }

    @Override
    public BrownPolarBear copy() {
        return new BrownPolarBear(this);
    }
}
