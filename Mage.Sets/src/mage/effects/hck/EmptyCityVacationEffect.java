package mage.effects.hck;

import mage.abilities.Ability;
import mage.abilities.effects.OneShotEffect;
import mage.constants.Outcome;
import mage.filter.common.FilterControlledCreaturePermanent;
import mage.game.Game;
import mage.game.permanent.Permanent;
import mage.players.Player;

import java.util.List;

public class EmptyCityVacationEffect extends OneShotEffect {

    public EmptyCityVacationEffect() {
        super(Outcome.Benefit);
        staticText = "All your creatures go to the Bahamas";
    }

    private EmptyCityVacationEffect(final EmptyCityVacationEffect effect) {
        super(effect);
    }

    @Override
    public boolean apply(Game game, Ability source) {
        Player controller = game.getPlayer(source.getControllerId());
        if (controller != null) {

            FilterControlledCreaturePermanent filter = new FilterControlledCreaturePermanent();
            List<Permanent> permanents = game.getBattlefield().getAllActivePermanents(filter, controller.getId(), game);

            for (Permanent permanent : permanents) {
                permanent.phaseOut(game);
            }
            return true;
        }
        return false;
    }

    @Override
    public EmptyCityVacationEffect copy() {
        return new EmptyCityVacationEffect(this);
    }
}
