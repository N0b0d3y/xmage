package mage.sets;

import mage.cards.ExpansionSet;
import mage.constants.Rarity;
import mage.constants.SetType;

/**
 * @author N0b0dy
 */
public final class Heckscube extends ExpansionSet {

    private static final Heckscube instance = new Heckscube();

    public static Heckscube getInstance() {
        return instance;
    }

    private Heckscube() {
        super("Heckscube", "HCK", ExpansionSet.buildDate(2026, 5, 12), SetType.CUSTOM_SET);

        // https://mtg.fandom.com/wiki/Magic:_The_Gathering_Foundations
        // TODO: this.enablePlayBooster(361);

        cards.add(new SetCardInfo("Chinese Finger Trap", 1, Rarity.COMMON, mage.cards.c.ChineseFingerTrap.class, RETRO_ART));
        cards.add(new SetCardInfo("Duck", 2, Rarity.COMMON, mage.cards.d.Duck.class, RETRO_ART));
        cards.add(new SetCardInfo("House of Tutors", 3, Rarity.COMMON, mage.cards.h.HouseOfTutors.class, RETRO_ART));
        cards.add(new SetCardInfo("Kongmings Trap", 4, Rarity.COMMON, mage.cards.k.KongmingsTrap.class, RETRO_ART));
    }
}
