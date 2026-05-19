package mage.targetAdjuster.hck;

import mage.abilities.Ability;
import mage.filter.common.FilterCreaturePermanent;
import mage.filter.predicate.permanent.ControllerIdPredicate;
import mage.game.Game;
import mage.players.Player;
import mage.target.TargetPermanent;
import mage.target.common.TargetCreaturePermanent;
import mage.target.targetadjustment.TargetAdjuster;

import java.util.UUID;

public class Returning100000ArrowsAdjuster implements TargetAdjuster {
    @Override
    public void adjustTargets(Ability ability, Game game) {
        UUID opponentId = game.getOpponents(ability.getControllerId()).stream().findFirst().orElse(null);
        Player opponent = game.getPlayer(opponentId);

        if (opponent != null) {
            int handSize = opponent.getHand().size();
            ability.getTargets().clear();

            if (handSize > 0) {
                FilterCreaturePermanent filter = new FilterCreaturePermanent("creatures controlled by your opponent");
                filter.add(new ControllerIdPredicate(opponentId));

                ability.addTarget(new TargetPermanent(0, handSize, filter, false));
            }
        }
    }
}
