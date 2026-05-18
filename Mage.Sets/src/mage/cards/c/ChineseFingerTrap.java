
package mage.cards.c;

import mage.MageInt;
import mage.abilities.Ability;
import mage.abilities.common.SimpleActivatedAbility;
import mage.abilities.costs.mana.ColoredManaCost;
import mage.abilities.effects.ContinuousEffect;
import mage.abilities.effects.SimulatedEnterEffect;
import mage.abilities.effects.common.GainsChoiceOfAbilitiesEffect;
import mage.abilities.effects.common.continuous.GainAbilityTargetEffect;
import mage.abilities.keyword.BandingAbility;
import mage.abilities.keyword.ReachAbility;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.*;
import mage.custom.TargetTwoCreaturesThatShareAController;
import mage.effects.hck.ChineseFingerTrapEffect;
import mage.filter.FilterPermanent;
import mage.filter.common.FilterCreaturePermanent;
import mage.game.Game;
import mage.game.permanent.Permanent;
import mage.target.TargetPermanent;
import mage.target.targetpointer.FixedTargets;

import java.util.List;
import java.util.UUID;

public final class ChineseFingerTrap extends CardImpl {

    public ChineseFingerTrap(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId, setInfo, new CardType[]{CardType.SORCERY}, "{W}");

        FilterCreaturePermanent filter = new FilterCreaturePermanent("two creatures that share a controller");

        this.getSpellAbility().addTarget(new TargetTwoCreaturesThatShareAController(filter));

        this.getSpellAbility().addEffect(new ChineseFingerTrapEffect());
    }

    private ChineseFingerTrap(final ChineseFingerTrap card) {
        super(card);
    }

    @Override
    public ChineseFingerTrap copy() {
        return new ChineseFingerTrap(this);
    }
}
