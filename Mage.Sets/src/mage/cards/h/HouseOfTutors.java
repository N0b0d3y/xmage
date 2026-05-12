package mage.cards.h;

import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.cards.c.ChineseFingerTrap;
import mage.constants.CardType;
import mage.constants.TargetController;
import mage.effects.hck.HouseOfTutorsEffect;
import mage.filter.FilterPermanent;
import mage.target.TargetPermanent;

import java.util.UUID;

public class HouseOfTutors extends CardImpl {
    public HouseOfTutors(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId,setInfo,new CardType[]{CardType.SORCERY},"{W}");

        this.getSpellAbility().addEffect(new HouseOfTutorsEffect());
    }

    private HouseOfTutors(final HouseOfTutors card) {
        super(card);
    }

    @Override
    public HouseOfTutors copy() {
        return new HouseOfTutors(this);
    }
}
