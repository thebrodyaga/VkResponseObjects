package com.thebrodyaga.vkobjects.video;




import java.util.Objects;

/**
 * VideoTag object
 */
public class VideoTag {
    /**
     * Tagged user ID
     */

    private Integer userId;

    /**
     * Tag ID
     */

    private Integer id;

    /**
     * ID of the tag creator
     */

    private Integer placerId;

    /**
     * Tag description
     */

    private String taggedName;

    /**
     * Date when tag has been added in Unixtime
     */

    private Integer date;

    /**
     * Information whether tha tag is reviewed
     */

    private Boolean viewed;

    public Integer getUserId() {
        return userId;
    }

    public Integer getId() {
        return id;
    }

    public Integer getPlacerId() {
        return placerId;
    }

    public String getTaggedName() {
        return taggedName;
    }

    public Integer getDate() {
        return date;
    }

    public boolean isViewed() {
        return viewed;
    }

    @Override
    public int hashCode() {
        return Objects.hash(date, viewed, taggedName, id, placerId, userId);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VideoTag videoTag = (VideoTag) o;
        return Objects.equals(userId, videoTag.userId) &&
                Objects.equals(id, videoTag.id) &&
                Objects.equals(placerId, videoTag.placerId) &&
                Objects.equals(taggedName, videoTag.taggedName) &&
                Objects.equals(date, videoTag.date) &&
                Objects.equals(viewed, videoTag.viewed);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("VideoTag{");
        sb.append("userId=").append(userId);
        sb.append(", id=").append(id);
        sb.append(", placerId=").append(placerId);
        sb.append(", taggedName='").append(taggedName).append("'");
        sb.append(", date=").append(date);
        sb.append(", viewed=").append(viewed);
        sb.append('}');
        return sb.toString();
    }
}
