package com.thebrodyaga.vkobjects.leads;



import java.util.Objects;

/**
 * Created by Anton Tsivarev on 15.11.16.
 */
public class LeadDays {

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

    /**
     * Amount of spent votes
     */

    private Integer spent;

    public Integer getImpressions() {
        return impressions;
    }

    public Integer getStarted() {
        return started;
    }

    public Integer getCompleted() {
        return completed;
    }

    public Integer getSpent() {
        return spent;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LeadDays leadDays = (LeadDays) o;
        return Objects.equals(impressions, leadDays.impressions) &&
                Objects.equals(started, leadDays.started) &&
                Objects.equals(completed, leadDays.completed) &&
                Objects.equals(spent, leadDays.spent);
    }

    @Override
    public int hashCode() {
        return Objects.hash(impressions, started, completed, spent);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("LeadDays{");
        sb.append("impressions=").append(impressions);
        sb.append(", started=").append(started);
        sb.append(", completed=").append(completed);
        sb.append(", spent=").append(spent);
        sb.append('}');
        return sb.toString();
    }
}
