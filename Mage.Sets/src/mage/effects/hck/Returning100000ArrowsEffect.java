package mage.effects.hck;

import mage.abilities.Ability;
import mage.abilities.effects.OneShotEffect;
import mage.constants.Outcome;
import mage.filter.common.FilterCreaturePermanent;
import mage.filter.predicate.permanent.ControllerIdPredicate;
import mage.game.Game;
import mage.game.permanent.Permanent;
import mage.players.Player;
import mage.target.Target;
import mage.target.common.TargetCreaturePermanent;

import java.util.UUID;

public class Returning100000ArrowsEffect extends OneShotEffect {

    public Returning100000ArrowsEffect() {
        super(Outcome.Tap);
        this.staticText = "For each card in target opponent's hand, tap a creature they control";
    }

    private Returning100000ArrowsEffect(final Returning100000ArrowsEffect effect) {
        super(effect);
    }

    @Override
    public boolean apply(Game game, Ability source) {
        if (source.getTargets().isEmpty()) {
            return true;
        }

        for (UUID targetId : source.getTargets().get(0).getTargets()) {
            Permanent permanent = game.getPermanent(targetId);
            if (permanent != null) {
                permanent.tap(source, game);
            }
        }
        return true;
    }

    @Override
    public Returning100000ArrowsEffect copy() {
        return new Returning100000ArrowsEffect(this);
    }
}
