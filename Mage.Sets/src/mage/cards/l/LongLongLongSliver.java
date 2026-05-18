package mage.cards.l;

import mage.MageInt;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;
import mage.constants.SubType;

import java.util.UUID;

public class LongLongLongSliver extends CardImpl {
    public LongLongLongSliver(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId, setInfo, new CardType[]{CardType.CREATURE}, "{1}{W}");

        this.subtype.add(SubType.SLIVER);
        this.power = new MageInt(1);
        this.toughness = new MageInt(3);
    }

    private LongLongLongSliver(final LongLongLongSliver card) {
        super(card);
    }

    @Override
    public LongLongLongSliver copy() {
        return new LongLongLongSliver(this);
    }
}
