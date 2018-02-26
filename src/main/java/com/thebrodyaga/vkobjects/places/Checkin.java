package com.thebrodyaga.vkobjects.places;



import java.util.Objects;

/**
 * Checkin object
 */
public class Checkin {
    /**
     * Checkin ID
     */

    private String id;

    /**
     * User ID
     */

    private Integer userId;

    /**
     * Date when the checkin has been added in Unixtime
     */

    private Integer date;

    /**
     * Place latitude
     */

    private Float latitude;

    /**
     * Place longitude
     */

    private Float longitude;

    /**
     * Place ID
     */

    private Integer placeId;

    /**
     * Comment text
     */

    private String text;

    /**
     * Distance to the place
     */

    private Integer distance;

    /**
     * Place title
     */

    private String placeTitle;

    /**
     * Country ID
     */

    private Integer placeCountry;

    /**
     * City ID
     */

    private Integer placeCity;

    /**
     * Place type
     */

    private String placeType;

    /**
     * URL of the place's icon
     */

    private String placeIcon;

    public String getId() {
        return id;
    }

    public Integer getUserId() {
        return userId;
    }

    public Integer getDate() {
        return date;
    }

    public Float getLatitude() {
        return latitude;
    }

    public Float getLongitude() {
        return longitude;
    }

    public Integer getPlaceId() {
        return placeId;
    }

    public String getText() {
        return text;
    }

    public Integer getDistance() {
        return distance;
    }

    public String getPlaceTitle() {
        return placeTitle;
    }

    public Integer getPlaceCountry() {
        return placeCountry;
    }

    public Integer getPlaceCity() {
        return placeCity;
    }

    public String getPlaceType() {
        return placeType;
    }

    public String getPlaceIcon() {
        return placeIcon;
    }

    @Override
    public int hashCode() {
        return Objects.hash(date, distance, latitude, placeId, placeCountry, userId, placeIcon, placeType, placeTitle, placeCity, id, text, longitude);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Checkin checkin = (Checkin) o;
        return Objects.equals(id, checkin.id) &&
                Objects.equals(userId, checkin.userId) &&
                Objects.equals(date, checkin.date) &&
                Objects.equals(latitude, checkin.latitude) &&
                Objects.equals(longitude, checkin.longitude) &&
                Objects.equals(placeId, checkin.placeId) &&
                Objects.equals(text, checkin.text) &&
                Objects.equals(distance, checkin.distance) &&
                Objects.equals(placeTitle, checkin.placeTitle) &&
                Objects.equals(placeCountry, checkin.placeCountry) &&
                Objects.equals(placeCity, checkin.placeCity) &&
                Objects.equals(placeType, checkin.placeType) &&
                Objects.equals(placeIcon, checkin.placeIcon);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Checkin{");
        sb.append("id=").append(id);
        sb.append(", userId=").append(userId);
        sb.append(", date=").append(date);
        sb.append(", latitude=").append(latitude);
        sb.append(", longitude=").append(longitude);
        sb.append(", placeId=").append(placeId);
        sb.append(", text='").append(text).append("'");
        sb.append(", distance=").append(distance);
        sb.append(", placeTitle='").append(placeTitle).append("'");
        sb.append(", placeCountry=").append(placeCountry);
        sb.append(", placeCity=").append(placeCity);
        sb.append(", placeType='").append(placeType).append("'");
        sb.append(", placeIcon='").append(placeIcon).append("'");
        sb.append('}');
        return sb.toString();
    }
}
