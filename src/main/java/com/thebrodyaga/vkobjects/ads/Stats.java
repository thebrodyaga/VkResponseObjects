package com.thebrodyaga.vkobjects.ads;



import java.util.Objects;

/**
 * Stats object
 */
public class Stats {
    /**
     * Object ID
     */

    private Integer id;


    private ObjectType type;


    private StatsFormat stats;

    public Integer getId() {
        return id;
    }

    public ObjectType getType() {
        return type;
    }

    public StatsFormat getStats() {
        return stats;
    }

    @Override
    public int hashCode() {
        return Objects.hash(stats, id, type);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Stats stats = (Stats) o;
        return Objects.equals(id, stats.id) &&
                Objects.equals(type, stats.type) &&
                Objects.equals(stats, stats.stats);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Stats{");
        sb.append("id=").append(id);
        sb.append(", type=").append(type);
        sb.append(", com.thebrodyaga.vkobjects.stats=").append(stats);
        sb.append('}');
        return sb.toString();
    }
}
