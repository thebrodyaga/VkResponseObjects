package com.thebrodyaga.vkobjects.market;


import com.thebrodyaga.vkobjects.photos.Photo;

import java.util.Objects;

/**
 * MarketAlbum object
 */
public class MarketAlbum {
    /**
     * Market album ID
     */

    private Integer id;

    /**
     * Market album owner's ID
     */

    private Integer ownerId;

    /**
     * Market album title
     */

    private String title;

    /**
     * Items number
     */

    private Integer count;

    /**
     * Date when album has been updated last time in Unixtime
     */

    private Integer updatedTime;


    private Photo photo;

    public Integer getId() {
        return id;
    }

    public Integer getOwnerId() {
        return ownerId;
    }

    public String getTitle() {
        return title;
    }

    public Integer getCount() {
        return count;
    }

    public Integer getUpdatedTime() {
        return updatedTime;
    }

    public Photo getPhoto() {
        return photo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(updatedTime, count, photo, id, ownerId, title);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MarketAlbum marketAlbum = (MarketAlbum) o;
        return Objects.equals(id, marketAlbum.id) &&
                Objects.equals(ownerId, marketAlbum.ownerId) &&
                Objects.equals(title, marketAlbum.title) &&
                Objects.equals(count, marketAlbum.count) &&
                Objects.equals(updatedTime, marketAlbum.updatedTime) &&
                Objects.equals(photo, marketAlbum.photo);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("MarketAlbum{");
        sb.append("id=").append(id);
        sb.append(", ownerId=").append(ownerId);
        sb.append(", title='").append(title).append("'");
        sb.append(", count=").append(count);
        sb.append(", updatedTime=").append(updatedTime);
        sb.append(", photo=").append(photo);
        sb.append('}');
        return sb.toString();
    }
}
