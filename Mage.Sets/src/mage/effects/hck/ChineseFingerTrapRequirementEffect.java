package mage.effects.hck;

import mage.abilities.Ability;
import mage.abilities.effects.RequirementEffect;
import mage.constants.Duration;
import mage.game.Game;
import mage.game.permanent.Permanent;

import java.util.UUID;

public class ChineseFingerTrapRequirementEffect extends RequirementEffect {
    private final UUID triggerCreature;
    private final UUID mustAttackIfThisAttacks;

    public ChineseFingerTrapRequirementEffect(UUID triggerCreature, UUID mustAttackIfThisAttacks) {
        super(Duration.EndOfGame);
        this.triggerCreature = triggerCreature;
        this.mustAttackIfThisAttacks = mustAttackIfThisAttacks;
    }

    protected ChineseFingerTrapRequirementEffect(final ChineseFingerTrapRequirementEffect effect) {
        super(effect);
        this.triggerCreature = effect.triggerCreature;
        this.mustAttackIfThisAttacks = effect.mustAttackIfThisAttacks;
    }

    @Override
    public boolean applies(Permanent permanent, Ability source, Game game) {
        return permanent.getId().equals(mustAttackIfThisAttacks);
    }

    @Override
    public boolean mustAttack(Game game) {
        Permanent partner = game.getPermanent(triggerCreature);
        return partner != null && partner.isAttacking();
    }

    @Override
    public boolean mustBlock(Game game) {
        return false;
    }

    @Override
    public ChineseFingerTrapRequirementEffect copy() {
        return new ChineseFingerTrapRequirementEffect(this);
    }
}
