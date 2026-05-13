package mage.cards.a;

import mage.MageInt;
import mage.abilities.common.SimpleStaticAbility;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;
import mage.constants.SubType;
import mage.constants.Zone;
import mage.replacementEffects.hck.NorthernLightsReplacementEffect;

import java.util.UUID;

public class AlaborealisTrooper extends CardImpl {
    public AlaborealisTrooper(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId, setInfo, new CardType[]{CardType.CREATURE}, "{2}{W}");

        this.subtype.add(SubType.SOLDIER);
        this.power = new MageInt(2);
        this.toughness = new MageInt(3);

        this.addAbility(new SimpleStaticAbility(Zone.BATTLEFIELD, new NorthernLightsReplacementEffect()));
    }

    private AlaborealisTrooper(final AlaborealisTrooper card) {
        super(card);
    }

    @Override
    public AlaborealisTrooper copy() {
        return new AlaborealisTrooper(this);
    }
}
