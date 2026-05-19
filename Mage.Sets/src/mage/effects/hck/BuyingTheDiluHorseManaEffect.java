package mage.effects.hck;

import mage.Mana;
import mage.abilities.Ability;
import mage.abilities.DelayedTriggeredAbility;
import mage.abilities.common.delayed.AtTheBeginOfMainPhaseDelayedTriggeredAbility;
import mage.abilities.effects.Effect;
import mage.abilities.effects.OneShotEffect;
import mage.abilities.effects.common.DrawCardTargetControllerEffect;
import mage.abilities.effects.mana.AddManaToManaPoolTargetControllerEffect;
import mage.constants.Outcome;
import mage.constants.TargetController;
import mage.game.Game;
import mage.game.permanent.Permanent;
import mage.target.targetpointer.FixedTarget;

import java.util.UUID;

public class BuyingTheDiluHorseManaEffect extends OneShotEffect {

    public BuyingTheDiluHorseManaEffect() {
        super(Outcome.Benefit);
        this.staticText = "Gain control of target creature an opponent controls. Its controller draws a card and adds colorless mana equal to its casting cost at the start of their next main phase.";
    }

    private BuyingTheDiluHorseManaEffect(final BuyingTheDiluHorseManaEffect effect) {
        super(effect);
    }

    @Override
    public boolean apply(Game game, Ability source) {

        UUID targetId = getTargetPointer().getFirst(game, source);
        Permanent permanent = game.getPermanent(targetId);

        if (permanent != null) {
            int manaValue = permanent.getManaValue();
            UUID controllerId = permanent.getControllerId();

            DelayedTriggeredAbility delayedAbility = new AtTheBeginOfMainPhaseDelayedTriggeredAbility(
                    new AddManaToManaPoolTargetControllerEffect(Mana.ColorlessMana(manaValue), "their"),
                    false,
                    TargetController.ANY,
                    AtTheBeginOfMainPhaseDelayedTriggeredAbility.PhaseSelection.NEXT_PRECOMBAT_MAIN
            );

            Effect drawEffect = new DrawCardTargetControllerEffect(1);
            delayedAbility.addEffect(drawEffect);

            delayedAbility.getEffects().get(0).setTargetPointer(new FixedTarget(controllerId, game));
            drawEffect.setTargetPointer(new FixedTarget(controllerId, game));

            game.addDelayedTriggeredAbility(delayedAbility, source);
            return true;
        }
        return false;
    }

    @Override
    public BuyingTheDiluHorseManaEffect copy() {
        return new BuyingTheDiluHorseManaEffect(this);
    }
}
