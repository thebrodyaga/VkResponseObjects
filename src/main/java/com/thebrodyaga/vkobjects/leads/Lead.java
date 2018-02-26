package com.thebrodyaga.vkobjects.leads;



import java.util.Objects;

/**
 * Lead object
 */
public class Lead {
    /**
     * Lead limit
     */

    private Integer limit;

    /**
     * Amount of spent votes
     */

    private Integer spent;

    /**
     * Offer cost
     */

    private Integer cost;

    /**
     * Impressions number
     */

    private Integer impressions;

    /**
     * Started offers number
     */

    private Integer started;

    /**
     * Completed offers number
     */

    private Integer completed;


    private LeadDays days;

    public Integer getLimit() {
        return limit;
    }

    public Integer getSpent() {
        return spent;
    }

    public Integer getCost() {
        return cost;
    }

    public Integer getImpressions() {
        return impressions;
    }

    public Integer getStarted() {
        return started;
    }

    public Integer getCompleted() {
        return completed;
    }

    public LeadDays getDays() {
        return days;
    }

    @Override
    public int hashCode() {
        return Objects.hash(cost, spent, limit, days, started, impressions, completed);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Lead lead = (Lead) o;
        return Objects.equals(limit, lead.limit) &&
                Objects.equals(spent, lead.spent) &&
                Objects.equals(cost, lead.cost) &&
                Objects.equals(impressions, lead.impressions) &&
                Objects.equals(started, lead.started) &&
                Objects.equals(completed, lead.completed) &&
                Objects.equals(days, lead.days);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Lead{");
        sb.append("limit=").append(limit);
        sb.append(", spent=").append(spent);
        sb.append(", cost=").append(cost);
        sb.append(", impressions=").append(impressions);
        sb.append(", started=").append(started);
        sb.append(", completed=").append(completed);
        sb.append(", days=").append(days);
        sb.append('}');
        return sb.toString();
    }
}
