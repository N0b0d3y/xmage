package mage.custom;

import mage.filter.predicate.Predicate;
import mage.game.Game;
import mage.game.permanent.Permanent;

import java.util.List;

public class RulesTextLineCountPredicate implements Predicate<Permanent> {
    private final int minLines;

    public RulesTextLineCountPredicate(int minLines) {
        this.minLines = minLines;
    }

    @Override
    public boolean apply(Permanent input, Game game) {
        List<String> rules = input.getRules(game);
        int totalLines = 0;
        for (String rule : rules) {
            totalLines += Math.max(1, (int) Math.ceil(rule.length() / 35.0));
        }
        return totalLines >= minLines;
    }
}
