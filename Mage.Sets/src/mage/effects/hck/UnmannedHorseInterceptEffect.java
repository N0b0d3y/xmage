package mage.effects.hck;

import mage.abilities.Ability;
import mage.abilities.effects.AsThoughEffectImpl;
import mage.abilities.effects.RestrictionEffect;
import mage.abilities.keyword.HorsemanshipAbility;
import mage.constants.AsThoughEffectType;
import mage.constants.Duration;
import mage.constants.Outcome;
import mage.game.Game;
import mage.game.permanent.Permanent;

import java.util.UUID;

public class UnmannedHorseInterceptEffect extends AsThoughEffectImpl {

    public UnmannedHorseInterceptEffect() {
        super(AsThoughEffectType.BLOCK_HORSEMANSHIP, Duration.WhileOnBattlefield, Outcome.Benefit);
        staticText = "{this} can block as though it had Horsemanship";
    }

    private UnmannedHorseInterceptEffect(final UnmannedHorseInterceptEffect effect) {
        super(effect);
    }

    @Override
    public boolean apply(Game game, Ability source) {
        return true;
    }

    @Override
    public UnmannedHorseInterceptEffect copy() {
        return new UnmannedHorseInterceptEffect(this);
    }

    @Override
    public boolean applies(UUID sourceId, Ability source, UUID affectedControllerId, Game game) {
        return sourceId.equals(source.getSourceId());
    }
}
