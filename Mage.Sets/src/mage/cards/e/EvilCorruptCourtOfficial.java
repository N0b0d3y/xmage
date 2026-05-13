package mage.cards.e;

import mage.MageInt;
import mage.abilities.Ability;
import mage.abilities.common.AttacksAndIsNotBlockedTriggeredAbility;
import mage.abilities.common.EntersBattlefieldAbility;
import mage.abilities.common.EntersBattlefieldTriggeredAbility;
import mage.abilities.condition.common.CardsInHandCondition;
import mage.abilities.decorator.ConditionalOneShotEffect;
import mage.abilities.effects.common.DrawCardTargetEffect;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;
import mage.constants.ComparisonType;
import mage.constants.SubType;
import mage.target.common.TargetOpponent;

import java.util.UUID;

public class EvilCorruptCourtOfficial extends CardImpl {
    public EvilCorruptCourtOfficial(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId, setInfo, new CardType[]{CardType.CREATURE}, "{1}{W}");

        this.subtype.add(SubType.ADVISOR);
        this.power = new MageInt(3);
        this.toughness = new MageInt(1);

        Ability ability = new EntersBattlefieldTriggeredAbility(
                new ConditionalOneShotEffect(
                        new DrawCardTargetEffect(1),
                        new CardsInHandCondition(ComparisonType.FEWER_THAN, 7),
                        "your opponent draws a card (if they have fewer than 7 cards in hand)"
                ), false
        );

        ability.addTarget(new TargetOpponent());

        this.addAbility(ability);
    }

    private EvilCorruptCourtOfficial(final EvilCorruptCourtOfficial card) {
        super(card);
    }

    @Override
    public EvilCorruptCourtOfficial copy() {
        return new EvilCorruptCourtOfficial(this);
    }
}
