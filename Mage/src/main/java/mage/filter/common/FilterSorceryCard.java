package mage.filter.common;

import mage.constants.CardType;
import mage.filter.FilterCard;
import mage.filter.predicate.Predicates;


public class FilterSorceryCard extends FilterCard {

    public FilterSorceryCard() {
        this("sorcery card");
    }

    public FilterSorceryCard(String name) {
        super(name);
        this.add(CardType.SORCERY.getPredicate());
    }

    protected FilterSorceryCard(final FilterSorceryCard filter) {
        super(filter);
    }

    @Override
    public FilterSorceryCard copy() {
        return new FilterSorceryCard(this);
    }

}
