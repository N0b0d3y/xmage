package mage.cards.u;

import mage.MageInt;
import mage.abilities.Ability;
import mage.abilities.common.SimpleStaticAbility;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;
import mage.constants.SubType;
import mage.constants.Zone;
import mage.effects.hck.UnmannedHorseInterceptEffect;

import java.util.UUID;

public class UnmannedHorse extends CardImpl {

    public UnmannedHorse(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId, setInfo, new CardType[]{CardType.CREATURE}, "{2}{W}");

        this.subtype.add(SubType.HORSE);
        this.power = new MageInt(2);
        this.toughness = new MageInt(2);

        // Unmanned Horse can intercept as though it had Horsemanship.
        this.addAbility(new SimpleStaticAbility(new UnmannedHorseInterceptEffect()));
    }

    private UnmannedHorse(final UnmannedHorse card) {
        super(card);
    }

    @Override
    public UnmannedHorse copy() {
        return new UnmannedHorse(this);
    }
}
