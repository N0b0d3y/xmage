package mage.cards.d;

import mage.MageInt;
import mage.abilities.keyword.HorsemanshipAbility;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.cards.b.BarbarianGeneral;
import mage.constants.CardType;
import mage.constants.SubType;

import java.util.UUID;

public class DomesticatedShadow extends CardImpl {
    public DomesticatedShadow(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId,setInfo,new CardType[]{CardType.CREATURE},"{4}{R}");
        this.subtype.add(SubType.DAYSTALKER);
        this.power = new MageInt(2);
        this.toughness = new MageInt(1);

        this.addAbility(HorsemanshipAbility.getInstance());
    }

    private DomesticatedShadow(final DomesticatedShadow card) {
        super(card);
    }

    @Override
    public DomesticatedShadow copy() {
        return new DomesticatedShadow(this);
    }
}
