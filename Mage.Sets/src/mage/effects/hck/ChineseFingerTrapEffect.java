package mage.effects.hck;

import mage.abilities.Ability;
import mage.abilities.effects.ContinuousEffect;
import mage.abilities.effects.OneShotEffect;
import mage.abilities.effects.common.continuous.GainAbilityTargetEffect;
import mage.abilities.keyword.BandingAbility;
import mage.cards.Card;
import mage.constants.Duration;
import mage.constants.Outcome;
import mage.game.Game;
import mage.game.permanent.Permanent;
import mage.target.targetpointer.FixedTargets;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class ChineseFingerTrapEffect extends OneShotEffect {

    public ChineseFingerTrapEffect() {
        super(Outcome.Neutral);
        staticText = "two target creatures you control permanently band with each other. " +
                "<i>(If either attacks, the other must as well. While they are in a band, " +
                "you choose how combat damage is assigned to them.)</i>";
    }

    private ChineseFingerTrapEffect(final ChineseFingerTrapEffect effect) {
        super(effect);
    }

    @Override
    public ChineseFingerTrapEffect copy() {
        return new ChineseFingerTrapEffect(this);
    }

    @Override
    public boolean apply(Game game, Ability source) {
        List<UUID> targets = source.getTargets().get(0).getTargets();
        if (targets.size() != 2) return false;

        UUID idA = targets.get(0);
        UUID idB = targets.get(1);

        ContinuousEffect bandingEffect = new GainAbilityTargetEffect(BandingAbility.getInstance(), Duration.EndOfGame);

        List<Card> creatures = new ArrayList<>();
        for (UUID id : targets) {
            Permanent p = game.getPermanent(id);
            if (p != null) {
                creatures.add(p);
            }
        }
        bandingEffect.setTargetPointer(new FixedTargets(creatures, game));

        game.addEffect(bandingEffect, source);

        game.addEffect(new ChineseFingerTrapRequirementEffect(idA, idB), source);
        game.addEffect(new ChineseFingerTrapRequirementEffect(idB, idA), source);

        return true;
    }
}