package com.thebrodyaga.vkobjects.utils;



import java.util.Objects;

/**
 * StatsCity object
 */
public class StatsCity {
    /**
     * City ID
     */

    private Integer cityId;

    /**
     * Views number
     */

    private Integer views;

    public Integer getCityId() {
        return cityId;
    }

    public Integer getViews() {
        return views;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StatsCity cities = (StatsCity) o;
        return Objects.equals(cityId, cities.cityId) &&
                Objects.equals(views, cities.views);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cityId, views);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("StatsCity{");
        sb.append("cityId=").append(cityId);
        sb.append(", views=").append(views);
        sb.append('}');
        return sb.toString();
    }
}
