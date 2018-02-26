package com.thebrodyaga.vkobjects.video;



import java.util.Objects;

/**
 * VideoAlbumFull object
 */
public class VideoAlbumFull {
    /**
     * Album ID
     */

    private Integer id;

    /**
     * Album owner's ID
     */

    private Integer ownerId;

    /**
     * Album title
     */

    private String title;

    /**
     * Total number of videos in album
     */

    private Integer count;

    /**
     * URL of the preview image with 160px in width
     */

    private String photo160;

    /**
     * URL of the preview image with 320px in width
     */

    private String photo320;

    /**
     * Date when the album has been updated last time in Unixtime
     */

    private Integer updatedTime;

    /**
     * Information whether album is system
     */

    private Integer isSystem;

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

    public String getPhoto160() {
        return photo160;
    }

    public String getPhoto320() {
        return photo320;
    }

    public Integer getUpdatedTime() {
        return updatedTime;
    }

    public Integer getIsSystem() {
        return isSystem;
    }

    @Override
    public int hashCode() {
        return Objects.hash(isSystem, updatedTime, photo160, photo320, count, id, ownerId, title);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VideoAlbumFull videoAlbumFull = (VideoAlbumFull) o;
        return Objects.equals(id, videoAlbumFull.id) &&
                Objects.equals(ownerId, videoAlbumFull.ownerId) &&
                Objects.equals(title, videoAlbumFull.title) &&
                Objects.equals(count, videoAlbumFull.count) &&
                Objects.equals(photo160, videoAlbumFull.photo160) &&
                Objects.equals(photo320, videoAlbumFull.photo320) &&
                Objects.equals(updatedTime, videoAlbumFull.updatedTime) &&
                Objects.equals(isSystem, videoAlbumFull.isSystem);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("VideoAlbumFull{");
        sb.append("id=").append(id);
        sb.append(", ownerId=").append(ownerId);
        sb.append(", title='").append(title).append("'");
        sb.append(", count=").append(count);
        sb.append(", photo160='").append(photo160).append("'");
        sb.append(", photo320='").append(photo320).append("'");
        sb.append(", updatedTime=").append(updatedTime);
        sb.append(", isSystem=").append(isSystem);
        sb.append('}');
        return sb.toString();
    }
}
