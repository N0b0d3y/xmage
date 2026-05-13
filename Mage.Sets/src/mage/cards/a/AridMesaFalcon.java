package mage.cards.a;

import mage.MageInt;
import mage.abilities.Ability;
import mage.abilities.common.SimpleActivatedAbility;
import mage.abilities.costs.common.PayLifeCost;
import mage.abilities.costs.common.SacrificeTargetCost;
import mage.abilities.effects.common.continuous.BoostSourceEffect;
import mage.abilities.keyword.FlyingAbility;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;
import mage.constants.Duration;
import mage.constants.SubType;
import mage.filter.common.FilterControlledLandPermanent;
import mage.target.common.TargetControlledLandPermanent;
import mage.target.common.TargetControlledPermanent;

import java.util.UUID;

public class AridMesaFalcon extends CardImpl {

    public AridMesaFalcon(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId, setInfo, new CardType[]{CardType.CREATURE}, "{1}{W}");

        this.subtype.add(SubType.BIRD);
        this.power = new MageInt(1);
        this.toughness = new MageInt(1);

        this.addAbility(FlyingAbility.getInstance());

        Ability ability = new SimpleActivatedAbility(
                new BoostSourceEffect(0, 1, Duration.EndOfTurn),
                new PayLifeCost(1)
        );
        ability.addCost(new SacrificeTargetCost(new FilterControlledLandPermanent("a land")));

        this.addAbility(ability);
    }

    private AridMesaFalcon(final AridMesaFalcon card) {
        super(card);
    }

    @Override
    public AridMesaFalcon copy() {
        return new AridMesaFalcon(this);
    }
}
