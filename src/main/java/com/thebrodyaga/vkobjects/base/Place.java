package com.thebrodyaga.vkobjects.base;



import java.util.Objects;

/**
 * Place object
 */
public class Place {
    /**
     * Place ID
     */

    private Integer id;

    /**
     * Place title
     */

    private String title;

    /**
     * Place latitude
     */

    private Float latitude;

    /**
     * Place longitude
     */

    private Float longitude;

    /**
     * Date of the place creation in Unixtime
     */

    private Integer created;

    /**
     * URL of the place's icon
     */

    private String icon;

    /**
     * Checkins number
     */

    private Integer checkins;

    /**
     * Place type
     */

    private String type;

    /**
     * Country name
     */

    private String country;

    /**
     * City name
     */

    private String city;

    /**
     * Place address
     */

    private String address;

    public Integer getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public Float getLatitude() {
        return latitude;
    }

    public Float getLongitude() {
        return longitude;
    }

    public Integer getCreated() {
        return created;
    }

    public String getIcon() {
        return icon;
    }

    public Integer getCheckins() {
        return checkins;
    }

    public String getType() {
        return type;
    }

    public String getCountry() {
        return country;
    }

    public String getCity() {
        return city;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public int hashCode() {
        return Objects.hash(country, address, city, created, latitude, icon, id, title, type, checkins, longitude);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Place place = (Place) o;
        return Objects.equals(id, place.id) &&
                Objects.equals(title, place.title) &&
                Objects.equals(latitude, place.latitude) &&
                Objects.equals(longitude, place.longitude) &&
                Objects.equals(created, place.created) &&
                Objects.equals(icon, place.icon) &&
                Objects.equals(checkins, place.checkins) &&
                Objects.equals(type, place.type) &&
                Objects.equals(country, place.country) &&
                Objects.equals(city, place.city) &&
                Objects.equals(address, place.address);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Place{");
        sb.append("id=").append(id);
        sb.append(", title='").append(title).append("'");
        sb.append(", latitude=").append(latitude);
        sb.append(", longitude=").append(longitude);
        sb.append(", created=").append(created);
        sb.append(", icon='").append(icon).append("'");
        sb.append(", checkins=").append(checkins);
        sb.append(", type='").append(type).append("'");
        sb.append(", country='").append(country).append("'");
        sb.append(", city='").append(city).append("'");
        sb.append(", address='").append(address).append("'");
        sb.append('}');
        return sb.toString();
    }
}
