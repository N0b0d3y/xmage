package mage.conditions.hck;

import mage.abilities.Ability;
import mage.abilities.condition.Condition;
import mage.constants.PhaseStep;
import mage.game.Game;

public enum KongmingsTrapCondition implements Condition {
    instance;

    @Override
    public boolean apply(Game game, Ability source) {
        return game.getStep().getType() == PhaseStep.DECLARE_BLOCKERS;
    }
}
