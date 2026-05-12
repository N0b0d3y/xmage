
package mage.cards.d;

import java.util.UUID;
import mage.MageInt;
import mage.abilities.ActivatedAbility;
import mage.abilities.common.SimpleActivatedAbility;
import mage.abilities.costs.mana.ColoredManaCost;
import mage.abilities.effects.EntersBattlefieldEffect;
import mage.abilities.effects.SimulatedEnterEffect;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;
import mage.constants.ColoredManaSymbol;
import mage.constants.SubType;
import mage.constants.Zone;
import sun.java2d.pipe.SpanShapeRenderer;

public final class Duck extends CardImpl {

    public Duck(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId,setInfo,new CardType[]{CardType.CREATURE},"{W}");
        this.subtype.add(SubType.BIRD);

        this.power = new MageInt(1);
        this.toughness = new MageInt(1);

        this.addAbility(new SimpleActivatedAbility(Zone.BATTLEFIELD,new SimulatedEnterEffect(), new ColoredManaCost(ColoredManaSymbol.W)));
    }

    private Duck(final Duck card) {
        super(card);
    }

    @Override
    public Duck copy() {
        return new Duck(this);
    }
}
