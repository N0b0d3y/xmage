package mage.cards.r;

import mage.MageInt;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;
import mage.constants.SubType;

import java.util.UUID;

public class RegularLions extends CardImpl {
    public RegularLions(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId, setInfo, new CardType[]{CardType.CREATURE}, "{W}");

        this.subtype.add(SubType.CAT);
        this.power = new MageInt(1);
        this.toughness = new MageInt(1);
    }

    private RegularLions(final mage.cards.r.RegularLions card) {
        super(card);
    }

    @Override
    public mage.cards.r.RegularLions copy() {
        return new mage.cards.r.RegularLions(this);
    }
}