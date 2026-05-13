package mage.triggeredAbilities.hck;

import mage.abilities.DelayedTriggeredAbility;
import mage.abilities.TriggeredAbilityImpl;
import mage.constants.Duration;
import mage.constants.Zone;
import mage.effects.hck.RomeoAndJulietSuicideEffect;
import mage.game.Game;
import mage.game.events.GameEvent;
import mage.game.events.ZoneChangeEvent;
import mage.target.targetpointer.FixedTarget;

import java.util.UUID;

public class RomeoAndJulietTriggeredAbility extends DelayedTriggeredAbility {

    private final UUID lover1;
    private final UUID lover2;

    public RomeoAndJulietTriggeredAbility(UUID lover1, UUID lover2) {
        // DelayedTriggeredAbility usually takes (Effect, Duration, triggerOnlyOnce)
        super(new RomeoAndJulietSuicideEffect(), Duration.EndOfGame, false);
        this.lover1 = lover1;
        this.lover2 = lover2;
    }

    private RomeoAndJulietTriggeredAbility(final RomeoAndJulietTriggeredAbility ability) {
        super(ability);
        this.lover1 = ability.lover1;
        this.lover2 = ability.lover2;
    }

    @Override
    public boolean checkEventType(GameEvent event, Game game) {
        return event.getType() == GameEvent.EventType.ZONE_CHANGE;
    }

    @Override
    public boolean checkTrigger(GameEvent event, Game game) {
        ZoneChangeEvent zEvent = (ZoneChangeEvent) event;
        if (zEvent.getFromZone() == Zone.BATTLEFIELD && zEvent.getToZone() == Zone.GRAVEYARD) {
            UUID dyingCreatureId = zEvent.getTargetId();

            if (dyingCreatureId.equals(lover1)) {
                this.getEffects().get(0).setTargetPointer(new FixedTarget(lover2, game));
                return true;
            }
            if (dyingCreatureId.equals(lover2)) {
                this.getEffects().get(0).setTargetPointer(new FixedTarget(lover1, game));
                return true;
            }
        }
        return false;
    }

    @Override
    public RomeoAndJulietTriggeredAbility copy() {
        return new RomeoAndJulietTriggeredAbility(this);
    }

    @Override
    public String getRule() {
        return "Whenever one of the chosen creatures is put into its owner's discard pile from play, do the same to the other.";
    }
}
