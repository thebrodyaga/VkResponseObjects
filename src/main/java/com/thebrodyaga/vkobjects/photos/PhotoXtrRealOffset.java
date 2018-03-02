package com.thebrodyaga.vkobjects.photos;


import java.util.List;
import java.util.Objects;

/**
 * PhotoXtrRealOffset object
 */
public class PhotoXtrRealOffset {
    /**
     * Photo ID
     */

    private Integer id;

    /**
     * Album ID
     */

    private Integer albumId;

    /**
     * Photo owner's ID
     */

    private Integer ownerId;

    /**
     * ID of the user who have uploaded the photo
     */

    private Integer userId;


    private List<PhotoSizes> sizes;

    /**
     * URL of image with 75 px width
     */

    private String photo75;

    /**
     * URL of image with 130 px width
     */

    private String photo130;

    /**
     * URL of image with 604 px width
     */

    private String photo604;

    /**
     * URL of image with 807 px width
     */

    private String photo807;

    /**
     * URL of image with 1280 px width
     */

    private String photo1280;

    /**
     * URL of image with 2560 px width
     */

    private String photo2560;

    /**
     * Post ID
     */

    private Integer postId;

    /**
     * Original photo width
     */

    private Integer width;

    /**
     * Original photo height
     */

    private Integer height;

    /**
     * Photo caption
     */

    private String text;

    /**
     * Date when uploaded
     */

    private Integer date;

    /**
     * Latitude
     */

    private Float lat;

    /**
     * Longitude
     */

    private Float lng;

    /**
     * Access key for the photo
     */

    private String accessKey;

    /**
     * Returns if the photo is hidden above the com.thebrodyaga.vkobjects.wall
     */

    private Boolean hidden;

    /**
     * Real position of the photo
     */

    private Integer realOffset;

    public Integer getId() {
        return id;
    }

    public Integer getAlbumId() {
        return albumId;
    }

    public Integer getOwnerId() {
        return ownerId;
    }

    public Integer getUserId() {
        return userId;
    }

    public List<PhotoSizes> getSizes() {
        return sizes;
    }

    public String getPhoto75() {
        return photo75;
    }

    public String getPhoto130() {
        return photo130;
    }

    public String getPhoto604() {
        return photo604;
    }

    public String getPhoto807() {
        return photo807;
    }

    public String getPhoto1280() {
        return photo1280;
    }

    public String getPhoto2560() {
        return photo2560;
    }

    public Integer getPostId() {
        return postId;
    }

    public Integer getWidth() {
        return width;
    }

    public Integer getHeight() {
        return height;
    }

    public String getText() {
        return text;
    }

    public Integer getDate() {
        return date;
    }

    public Float getLat() {
        return lat;
    }

    public Float getLng() {
        return lng;
    }

    public String getAccessKey() {
        return accessKey;
    }

    public boolean isHidden() {
        return hidden ;
    }

    public Integer getRealOffset() {
        return realOffset;
    }

    @Override
    public int hashCode() {
        return Objects.hash(date, photo604, lng, hidden, photo807, photo1280, photo2560, albumId, postId, ownerId, userId, realOffset, sizes, photo75, accessKey, photo130, width, id, text, lat, height);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PhotoXtrRealOffset photoXtrRealOffset = (PhotoXtrRealOffset) o;
        return Objects.equals(id, photoXtrRealOffset.id) &&
                Objects.equals(albumId, photoXtrRealOffset.albumId) &&
                Objects.equals(ownerId, photoXtrRealOffset.ownerId) &&
                Objects.equals(userId, photoXtrRealOffset.userId) &&
                Objects.equals(sizes, photoXtrRealOffset.sizes) &&
                Objects.equals(photo75, photoXtrRealOffset.photo75) &&
                Objects.equals(photo130, photoXtrRealOffset.photo130) &&
                Objects.equals(photo604, photoXtrRealOffset.photo604) &&
                Objects.equals(photo807, photoXtrRealOffset.photo807) &&
                Objects.equals(photo1280, photoXtrRealOffset.photo1280) &&
                Objects.equals(photo2560, photoXtrRealOffset.photo2560) &&
                Objects.equals(postId, photoXtrRealOffset.postId) &&
                Objects.equals(width, photoXtrRealOffset.width) &&
                Objects.equals(height, photoXtrRealOffset.height) &&
                Objects.equals(text, photoXtrRealOffset.text) &&
                Objects.equals(date, photoXtrRealOffset.date) &&
                Objects.equals(lat, photoXtrRealOffset.lat) &&
                Objects.equals(lng, photoXtrRealOffset.lng) &&
                Objects.equals(accessKey, photoXtrRealOffset.accessKey) &&
                Objects.equals(hidden, photoXtrRealOffset.hidden) &&
                Objects.equals(realOffset, photoXtrRealOffset.realOffset);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PhotoXtrRealOffset{");
        sb.append("id=").append(id);
        sb.append(", albumId=").append(albumId);
        sb.append(", ownerId=").append(ownerId);
        sb.append(", userId=").append(userId);
        sb.append(", sizes=").append(sizes);
        sb.append(", photo75='").append(photo75).append("'");
        sb.append(", photo130='").append(photo130).append("'");
        sb.append(", photo604='").append(photo604).append("'");
        sb.append(", photo807='").append(photo807).append("'");
        sb.append(", photo1280='").append(photo1280).append("'");
        sb.append(", photo2560='").append(photo2560).append("'");
        sb.append(", postId=").append(postId);
        sb.append(", width=").append(width);
        sb.append(", height=").append(height);
        sb.append(", text='").append(text).append("'");
        sb.append(", date=").append(date);
        sb.append(", lat=").append(lat);
        sb.append(", lng=").append(lng);
        sb.append(", accessKey='").append(accessKey).append("'");
        sb.append(", hidden=").append(hidden);
        sb.append(", realOffset=").append(realOffset);
        sb.append('}');
        return sb.toString();
    }
}
