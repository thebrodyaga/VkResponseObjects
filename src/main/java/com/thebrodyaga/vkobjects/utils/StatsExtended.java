package com.thebrodyaga.vkobjects.utils;



import java.util.List;
import java.util.Objects;

/**
 * StatsExtended object
 */
public class StatsExtended {
    /**
     * Start time
     */

    private Integer timestamp;

    /**
     * Total views number
     */

    private Integer views;

    /**
     * Object StatsSexAge
     */

    private List<StatsSexAge> sexAge;

    /**
     * Object StatsCountry
     */

    private List<StatsCountry> countries;

    /**
     * Object StatsCity
     */

    private List<StatsCity> cities;

    public Integer getTimestamp() {
        return timestamp;
    }

    public Integer getViews() {
        return views;
    }

    public List<StatsSexAge> getSexAge() {
        return sexAge;
    }

    public List<StatsCountry> getCountries() {
        return countries;
    }

    public List<StatsCity> getCities() {
        return cities;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StatsExtended that = (StatsExtended) o;
        return Objects.equals(timestamp, that.timestamp) &&
                Objects.equals(views, that.views) &&
                Objects.equals(sexAge, that.sexAge) &&
                Objects.equals(countries, that.countries) &&
                Objects.equals(cities, that.cities);
    }

    @Override
    public int hashCode() {
        return Objects.hash(timestamp, views, sexAge, countries, cities);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("StatsExtended{");
        sb.append("timestamp=").append(timestamp);
        sb.append(", views=").append(views);
        sb.append(", sexAge=").append(sexAge);
        sb.append(", countries=").append(countries);
        sb.append(", cities=").append(cities);
        sb.append('}');
        return sb.toString();
    }
}
