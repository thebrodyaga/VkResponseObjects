package com.thebrodyaga.vkobjects.database;


import com.thebrodyaga.vkobjects.base.BaseObject;


import java.util.Objects;

/**
 * City object
 */
public class City extends BaseObject {
    /**
     * Area title
     */

    private String area;

    /**
     * Region title
     */

    private String region;

    /**
     * Information whether the city is included in important cities list
     */

    private Boolean important;

    public String getArea() {
        return area;
    }

    public String getRegion() {
        return region;
    }

    public boolean isImportant() {
        return important;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), area, important, region);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        City city = (City) o;
        return Objects.equals(area, city.area) &&
                Objects.equals(region, city.region) &&
                Objects.equals(important, city.important);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("City{");
        sb.append("area='").append(area).append('\'');
        sb.append(", id=").append(getId());
        sb.append(", important=").append(important);
        sb.append(", region='").append(region).append('\'');
        sb.append(", title='").append(getTitle()).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
