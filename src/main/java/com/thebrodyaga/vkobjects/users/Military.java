package com.thebrodyaga.vkobjects.users;



import java.util.Objects;

/**
 * Military object
 */
public class Military {
    /**
     * Unit name
     */

    private String unit;

    /**
     * Unit ID
     */

    private Integer unitId;

    /**
     * Country ID
     */

    private Integer countryId;

    /**
     * From year
     */

    private Integer from;

    /**
     * Till year
     */

    private Integer until;

    public String getUnit() {
        return unit;
    }

    public Integer getUnitId() {
        return unitId;
    }

    public Integer getCountryId() {
        return countryId;
    }

    public Integer getFrom() {
        return from;
    }

    public Integer getUntil() {
        return until;
    }

    @Override
    public int hashCode() {
        return Objects.hash(unit, unitId, from, until, countryId);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Military military = (Military) o;
        return Objects.equals(unit, military.unit) &&
                Objects.equals(unitId, military.unitId) &&
                Objects.equals(countryId, military.countryId) &&
                Objects.equals(from, military.from) &&
                Objects.equals(until, military.until);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Military{");
        sb.append("unit='").append(unit).append("'");
        sb.append(", unitId=").append(unitId);
        sb.append(", countryId=").append(countryId);
        sb.append(", from=").append(from);
        sb.append(", until=").append(until);
        sb.append('}');
        return sb.toString();
    }
}
