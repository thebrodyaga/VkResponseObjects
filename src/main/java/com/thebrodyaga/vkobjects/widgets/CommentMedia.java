package com.thebrodyaga.vkobjects.widgets;



import java.util.Objects;

/**
 * CommentMedia object
 */
public class CommentMedia {
    /**
     * Media type
     */

    private CommentMediaType type;

    /**
     * Media owner's ID
     */

    private Integer ownerId;

    /**
     * Media item ID
     */

    private Integer itemId;

    /**
     * URL of the preview image (type=photo only)
     */

    private String thumbSrc;

    public CommentMediaType getType() {
        return type;
    }

    public Integer getOwnerId() {
        return ownerId;
    }

    public Integer getItemId() {
        return itemId;
    }

    public String getThumbSrc() {
        return thumbSrc;
    }

    @Override
    public int hashCode() {
        return Objects.hash(itemId, thumbSrc, type, ownerId);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CommentMedia commentMedia = (CommentMedia) o;
        return Objects.equals(type, commentMedia.type) &&
                Objects.equals(ownerId, commentMedia.ownerId) &&
                Objects.equals(itemId, commentMedia.itemId) &&
                Objects.equals(thumbSrc, commentMedia.thumbSrc);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("CommentMedia{");
        sb.append("type='").append(type).append("'");
        sb.append(", ownerId=").append(ownerId);
        sb.append(", itemId=").append(itemId);
        sb.append(", thumbSrc='").append(thumbSrc).append("'");
        sb.append('}');
        return sb.toString();
    }
}
