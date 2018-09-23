package com.thebrodyaga.vkobjects.photos;




import java.util.List;
import java.util.Objects;

/**
 * PhotoAlbumFull object
 */
public class PhotoAlbumFull {
    /**
     * Photo album ID
     */

    private Integer id;

    /**
     * Thumb photo ID
     */

    private Integer thumbId;

    /**
     * URL of the thumb image
     */

    private String thumbSrc;

    /**
     * Album owner's ID
     */

    private Integer ownerId;

    /**
     * Photo album title
     */

    private String title;

    /**
     * Photo album description
     */

    private String description;

    /**
     * Date when the album has been created in Unixtime
     */

    private Integer created;

    /**
     * Date when the album has been updated last time in Unixtime
     */

    private Integer updated;

    /**
     * Photos number
     */

    private Integer size;


    private List<String> privacyView;


    private List<String> privacyComment;

    /**
     * Information whether only community administrators can upload com.thebrodyaga.vkobjects.photos
     */

    private Boolean uploadByAdminsOnly;

    /**
     * Information whether album comments are disabled
     */

    private Boolean commentsDisabled;

    /**
     * Information whether current user can upload photo to the album
     */

    private Boolean canUpload;

    /**
     * Information whether the album thumb is last photo
     */

    private Boolean thumbIsLast;


    private List<PhotoSizes> sizes;

    public Integer getId() {
        return id;
    }

    public Integer getThumbId() {
        return thumbId;
    }

    public String getThumbSrc() {
        return thumbSrc;
    }

    public Integer getOwnerId() {
        return ownerId;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public Integer getCreated() {
        return created;
    }

    public Integer getUpdated() {
        return updated;
    }

    public Integer getSize() {
        return size;
    }

    public List<String> getPrivacyView() {
        return privacyView;
    }

    public List<String> getPrivacyComment() {
        return privacyComment;
    }

    public boolean isUploadByAdminsOnly() {
        return uploadByAdminsOnly;
    }

    public boolean isCommentsDisabled() {
        return commentsDisabled;
    }

    public boolean canUpload() {
        return canUpload;
    }

    public boolean isThumbIsLast() {
        return thumbIsLast;
    }

    public List<PhotoSizes> getSizes() {
        return sizes;
    }

    @Override
    public int hashCode() {
        return Objects.hash(created, privacyComment, description, thumbSrc, ownerId, title, uploadByAdminsOnly, canUpload, privacyView, size, sizes, commentsDisabled, id, thumbIsLast, updated, thumbId);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PhotoAlbumFull photoAlbumFull = (PhotoAlbumFull) o;
        return Objects.equals(id, photoAlbumFull.id) &&
                Objects.equals(thumbId, photoAlbumFull.thumbId) &&
                Objects.equals(thumbSrc, photoAlbumFull.thumbSrc) &&
                Objects.equals(ownerId, photoAlbumFull.ownerId) &&
                Objects.equals(title, photoAlbumFull.title) &&
                Objects.equals(description, photoAlbumFull.description) &&
                Objects.equals(created, photoAlbumFull.created) &&
                Objects.equals(updated, photoAlbumFull.updated) &&
                Objects.equals(size, photoAlbumFull.size) &&
                Objects.equals(privacyView, photoAlbumFull.privacyView) &&
                Objects.equals(privacyComment, photoAlbumFull.privacyComment) &&
                Objects.equals(uploadByAdminsOnly, photoAlbumFull.uploadByAdminsOnly) &&
                Objects.equals(commentsDisabled, photoAlbumFull.commentsDisabled) &&
                Objects.equals(canUpload, photoAlbumFull.canUpload) &&
                Objects.equals(thumbIsLast, photoAlbumFull.thumbIsLast) &&
                Objects.equals(sizes, photoAlbumFull.sizes);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PhotoAlbumFull{");
        sb.append("id=").append(id);
        sb.append(", thumbId=").append(thumbId);
        sb.append(", thumbSrc='").append(thumbSrc).append("'");
        sb.append(", ownerId=").append(ownerId);
        sb.append(", title='").append(title).append("'");
        sb.append(", description='").append(description).append("'");
        sb.append(", created=").append(created);
        sb.append(", updated=").append(updated);
        sb.append(", size=").append(size);
        sb.append(", privacyView='").append(privacyView).append("'");
        sb.append(", privacyComment='").append(privacyComment).append("'");
        sb.append(", uploadByAdminsOnly=").append(uploadByAdminsOnly);
        sb.append(", commentsDisabled=").append(commentsDisabled);
        sb.append(", canUpload=").append(canUpload);
        sb.append(", thumbIsLast=").append(thumbIsLast);
        sb.append(", sizes=").append(sizes);
        sb.append('}');
        return sb.toString();
    }
}
