package com.thebrodyaga.vkobjects.newsfeed;



import java.util.Objects;

/**
 * ItemPhotoTag object
 */
public class ItemPhotoTag {


    private ItemPhotoTagPhotoTags photoTags;

    /**
     * Post ID
     */

    private Integer postId;

    public ItemPhotoTagPhotoTags getPhotoTags() {
        return photoTags;
    }

    public Integer getPostId() {
        return postId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(postId, photoTags);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ItemPhotoTag itemPhotoTag = (ItemPhotoTag) o;
        return Objects.equals(photoTags, itemPhotoTag.photoTags) &&
                Objects.equals(postId, itemPhotoTag.postId);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ItemPhotoTag{");
        sb.append("photoTags=").append(photoTags);
        sb.append(", postId=").append(postId);
        sb.append('}');
        return sb.toString();
    }
}
