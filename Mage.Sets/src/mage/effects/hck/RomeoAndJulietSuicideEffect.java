package mage.effects.hck;

import mage.abilities.Ability;
import mage.abilities.effects.OneShotEffect;
import mage.constants.Outcome;
import mage.game.Game;
import mage.game.permanent.Permanent;

public class RomeoAndJulietSuicideEffect extends OneShotEffect {

    public RomeoAndJulietSuicideEffect() {
        super(Outcome.Sacrifice);
    }

    private RomeoAndJulietSuicideEffect(final RomeoAndJulietSuicideEffect effect) {
        super(effect);
    }

    @Override
    public boolean apply(Game game, Ability source) {
        // Get the lover that is still alive
        Permanent survivor = game.getPermanent(getTargetPointer().getFirst(game, source));
        if (survivor != null) {
            game.informPlayers("A pair of star-crossed lovers take their life...");
            return survivor.sacrifice(source, game);
        }
        return false;
    }

    @Override
    public RomeoAndJulietSuicideEffect copy() {
        return new RomeoAndJulietSuicideEffect(this);
    }
}
