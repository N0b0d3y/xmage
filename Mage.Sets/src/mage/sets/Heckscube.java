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

        // https://skeleton.club/hellfall?set=HCK
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
        cards.add(new SetCardInfo("Celestial Daystalker", 13, Rarity.COMMON, mage.cards.c.CelestialDaystalker.class, RETRO_ART));
        cards.add(new SetCardInfo("EVIL Corrupt Court Official", 14, Rarity.COMMON, mage.cards.e.EvilCorruptCourtOfficial.class, RETRO_ART));
        cards.add(new SetCardInfo("Empty City (Not Actually a Ruse)", 15, Rarity.COMMON, mage.cards.e.EmptyCityNotActuallyARuse.class, RETRO_ART));
        cards.add(new SetCardInfo("Long Long Long Sliver", 16, Rarity.COMMON, mage.cards.l.LongLongLongSliver.class, RETRO_ART));
        //TODO: This is a problem for future me. Fuck you future me.
        //cards.add(new SetCardInfo("Passed the Civil Service Exam", 17, Rarity.COMMON, mage.cards.p.PassedTheCivilServiceExam.class, RETRO_ART));
        cards.add(new SetCardInfo("Pure Court Offical", 18, Rarity.COMMON, mage.cards.p.PureCourtOffical.class, RETRO_ART));
        cards.add(new SetCardInfo("Alaborealis Trooper", 19, Rarity.COMMON, mage.cards.a.AlaborealisTrooper.class, RETRO_ART));
        cards.add(new SetCardInfo("Buying the Dilu Horse", 20, Rarity.COMMON, mage.cards.b.BuyingTheDiluHorse.class, RETRO_ART));
        //TODO: Card needs to be tested in multiplayer, bot gets stuck when a creature with horsemanship attacks while this is in play
        cards.add(new SetCardInfo("Unmanned Horse", 21, Rarity.COMMON, mage.cards.u.UnmannedHorse.class, RETRO_ART));
        cards.add(new SetCardInfo("Returning 100,000 Arrows", 22, Rarity.COMMON, mage.cards.r.Returning100000Arrows.class, RETRO_ART));
        cards.add(new SetCardInfo("Domesticated Shadow", 23, Rarity.COMMON, mage.cards.d.DomesticatedShadow.class, RETRO_ART));
    }
}
