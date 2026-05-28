package mage.cards.s;

import mage.MageInt;
import mage.abilities.common.SimpleActivatedAbility;
import mage.abilities.costs.mana.ColoredManaCost;
import mage.abilities.effects.SimulatedEnterEffect;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;
import mage.constants.ColoredManaSymbol;
import mage.constants.SubType;
import mage.constants.Zone;

import java.util.UUID;

public class Sundialwolf extends CardImpl {
    public Sundialwolf(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId,setInfo,new CardType[]{CardType.CREATURE},"{1}{W}{1}{W}");
        this.subtype.add(SubType.WOLF);

        this.power = new MageInt(3);
        this.toughness = new MageInt(3);
    }

    private Sundialwolf(final Sundialwolf card) {
        super(card);
    }

    @Override
    public Sundialwolf copy() {
        return new Sundialwolf(this);
    }
}
