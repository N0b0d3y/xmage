package mage.cards.p;

import mage.MageInt;
import mage.abilities.common.EntersBattlefieldTriggeredAbility;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;
import mage.constants.SubType;
import mage.effects.hck.PureCourtMoveCardEffect;

import java.util.UUID;

public class PureCourtOffical extends CardImpl {

    public PureCourtOffical(UUID ownerId, CardSetInfo setInfo) {

        super(ownerId, setInfo, new CardType[]{CardType.CREATURE}, "{1}{W}");

        this.subtype.add(SubType.HUMAN);
        this.subtype.add(SubType.ADVISOR);
        this.power = new MageInt(1);
        this.toughness = new MageInt(1);

        this.addAbility(new EntersBattlefieldTriggeredAbility(new PureCourtMoveCardEffect()));
    }

    private PureCourtOffical(final PureCourtOffical card) {
        super(card);
    }

    @Override
    public PureCourtOffical copy() {
        return new PureCourtOffical(this);
    }
}
