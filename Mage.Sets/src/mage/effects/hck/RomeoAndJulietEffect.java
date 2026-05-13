package mage.effects.hck;

import mage.abilities.Ability;
import mage.abilities.effects.OneShotEffect;
import mage.constants.Outcome;
import mage.game.Game;
import mage.game.permanent.Permanent;
import mage.triggeredAbilities.hck.RomeoAndJulietTriggeredAbility;

import java.util.List;
import java.util.UUID;

public class RomeoAndJulietEffect extends OneShotEffect {

    public RomeoAndJulietEffect() {
        super(Outcome.Detriment);
        staticText = "Choose any two creatures controlled by two different players. " +
                "Whenever one of the chosen creatures is put into its owner's discard pile from play, " +
                "do the same to the other of these creatures.";
    }

    private RomeoAndJulietEffect(final RomeoAndJulietEffect effect) {
        super(effect);
    }

    @Override
    public boolean apply(Game game, Ability source) {
        List<UUID> targets = source.getTargets().get(0).getTargets();
        if (targets.size() < 2) return false;

        Permanent p1 = game.getPermanent(targets.get(0));
        Permanent p2 = game.getPermanent(targets.get(1));

        if (p1 != null && p2 != null && !p1.getControllerId().equals(p2.getControllerId())) {
            p1.addInfo("RomeoAndJuliet", "If " + p2.getName() + " dies, this creature will take its own life.", game);
            p2.addInfo("RomeoAndJuliet", "If " + p1.getName() + " dies, this creature will take its own life.", game);

            game.addDelayedTriggeredAbility(new RomeoAndJulietTriggeredAbility(p1.getId(), p2.getId()), source);
            return true;
        }
        return false;
    }

    @Override
    public RomeoAndJulietEffect copy() {
        return new RomeoAndJulietEffect(this);
    }
}