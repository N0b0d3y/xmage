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
        cards.add(new SetCardInfo("Kongming's Trap", 4, Rarity.COMMON, mage.cards.k.KongmingsTrap.class, RETRO_ART));
        cards.add(new SetCardInfo("Legacy of the Planeswalkers", 5, Rarity.COMMON, mage.cards.l.LegacyOfThePlaneswalkers.class, RETRO_ART));
        cards.add(new SetCardInfo("Lurking Daystalker", 6, Rarity.COMMON, mage.cards.l.LurkingDaystalker.class, RETRO_ART));
        cards.add(new SetCardInfo("Regular Lions", 7, Rarity.COMMON, mage.cards.r.RegularLions.class, RETRO_ART));
        cards.add(new SetCardInfo("Romeo and Juliet", 8, Rarity.COMMON, mage.cards.r.RomeoAndJuliet.class, RETRO_ART));
        cards.add(new SetCardInfo("Absolute Cinema", 9, Rarity.COMMON, mage.cards.a.AbsoluteCinema.class, RETRO_ART));
        cards.add(new SetCardInfo("Arid Mesa Falcon", 10, Rarity.COMMON, mage.cards.a.AridMesaFalcon.class, RETRO_ART));
        cards.add(new SetCardInfo("Broken Clockwolf", 11, Rarity.COMMON, mage.cards.b.BrokenClockwolf.class, RETRO_ART));
        cards.add(new SetCardInfo("Brown Polar Bear", 12, Rarity.COMMON, mage.cards.b.BrownPolarBear.class, RETRO_ART));
        cards.add(new SetCardInfo("Alaborealis Trooper", 19, Rarity.COMMON, mage.cards.a.AlaborealisTrooper.class, RETRO_ART));
    }
}
