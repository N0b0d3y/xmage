package mage.custom;

import mage.abilities.Ability;
import mage.filter.FilterPermanent;
import mage.game.Game;
import mage.game.permanent.Permanent;
import mage.target.TargetPermanent;

import java.util.UUID;

public class TargetTwoCreaturesThatShareAController extends TargetPermanent {

    public TargetTwoCreaturesThatShareAController(FilterPermanent filter) {
        super(2, 2, filter, false);
    }

    public TargetTwoCreaturesThatShareAController(final TargetTwoCreaturesThatShareAController target) {
        super(target);
    }

    @Override
    public boolean canTarget(UUID controllerId, UUID id, Ability source, Game game) {
        if (super.canTarget(controllerId, id, source, game)) {
            // If we already have one target selected, the second must share a controller
            if (!this.getTargets().isEmpty()) {
                Permanent firstTarget = game.getPermanent(this.getTargets().get(0));
                Permanent currentTarget = game.getPermanent(id);
                if (firstTarget != null && currentTarget != null) {
                    return firstTarget.getControllerId().equals(currentTarget.getControllerId());
                }
            }
            return true;
        }
        return false;
    }

    @Override
    public TargetTwoCreaturesThatShareAController copy() {
        return new TargetTwoCreaturesThatShareAController(this);
    }
}
