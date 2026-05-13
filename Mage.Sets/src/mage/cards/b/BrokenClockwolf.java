package mage.cards.b;

import mage.MageInt;
import mage.abilities.keyword.FlyingAbility;
import mage.abilities.keyword.PhasingAbility;
import mage.cards.Card;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.cards.a.AridMesaFalcon;
import mage.constants.CardType;
import mage.constants.SubType;

import java.util.UUID;

public class BrokenClockwolf extends CardImpl {
    public BrokenClockwolf(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId, setInfo, new CardType[]{CardType.CREATURE}, "{1/W}{W}");

        this.subtype.add(SubType.WOLF);
        this.power = new MageInt(3);
        this.toughness = new MageInt(3);

        this.addAbility(PhasingAbility.getInstance());
    }

    private BrokenClockwolf(final BrokenClockwolf card) {
        super(card);
    }

    @Override
    public BrokenClockwolf copy() {
        return new BrokenClockwolf(this);
    }
}
