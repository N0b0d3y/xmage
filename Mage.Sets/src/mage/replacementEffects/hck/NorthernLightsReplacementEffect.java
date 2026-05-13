package mage.replacementEffects.hck;

import mage.MageObject;
import mage.abilities.Ability;
import mage.abilities.effects.ReplacementEffectImpl;
import mage.constants.Duration;
import mage.constants.Outcome;
import mage.game.Game;
import mage.game.events.DamageEvent;
import mage.game.events.GameEvent;
import mage.game.permanent.Permanent;
import mage.players.Player;

public class NorthernLightsReplacementEffect extends ReplacementEffectImpl {
    public NorthernLightsReplacementEffect() {
        super(Duration.WhileOnBattlefield, Outcome.Benefit);
        staticText = "If noncreature damage would be dealt, it is instead dealt by a source named The Northern Lights";
    }

    private NorthernLightsReplacementEffect(final NorthernLightsReplacementEffect effect) {
        super(effect);
    }

    @Override
    public boolean replaceEvent(GameEvent event, Ability source, Game game) {
        DamageEvent damageEvent = (DamageEvent) event;
        int amount = damageEvent.getAmount();

        MageObject trooper = game.getObject(source.getSourceId());

        if (trooper != null) {
            String originalName = trooper.getName();
            trooper.setName("The Northern Lights");

            try {
                if (event.getType() == GameEvent.EventType.DAMAGE_PERMANENT) {
                    Permanent permanent = game.getPermanent(event.getTargetId());
                    if (permanent != null) {
                        permanent.damage(amount, source, game);
                    }
                } else {
                    Player player = game.getPlayer(event.getTargetId());
                    if (player != null) {
                        player.damage(amount, source, game);
                    }
                }
            } finally {
                trooper.setName(originalName);
            }
        }

        return true;
    }

    @Override
    public boolean checksEventType(GameEvent event, Game game) {
        return event.getType() == GameEvent.EventType.DAMAGE_PERMANENT
                || event.getType() == GameEvent.EventType.DAMAGE_PLAYER;
    }

    @Override
    public boolean applies(GameEvent event, Ability source, Game game) {
        MageObject damageSource = game.getObject(event.getSourceId());
        return damageSource != null && !damageSource.isCreature(game);
    }

    @Override
    public NorthernLightsReplacementEffect copy() {
        return new NorthernLightsReplacementEffect(this);
    }

    @Override
    public boolean hasSelfScope() {
        return false;
    }
}
