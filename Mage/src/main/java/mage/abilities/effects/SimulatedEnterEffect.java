package mage.abilities.effects;

import mage.abilities.Ability;
import mage.constants.Outcome;
import mage.game.Game;
import mage.game.events.GameEvent;
import mage.game.permanent.Permanent;

public class SimulatedEnterEffect extends OneShotEffect {
    public SimulatedEnterEffect() {
        super(Outcome.Benefit);
        staticText = "{this} enters.";
    }

    private SimulatedEnterEffect(final SimulatedEnterEffect effect) {
        super(effect);
    }

    @Override
    public SimulatedEnterEffect copy() {
        return new SimulatedEnterEffect(this);
    }

    //Fires ETB event manually
    @Override
    public boolean apply(Game game, Ability source) {
        Permanent permanent = game.getPermanent(source.getSourceId());
        if (permanent != null) {
            game.fireEvent(GameEvent.getEvent(
                    GameEvent.EventType.ENTERS_THE_BATTLEFIELD,
                    permanent.getId(),
                    source,
                    permanent.getControllerId()
            ));
            return true;
        }
        return false;
    }
}
