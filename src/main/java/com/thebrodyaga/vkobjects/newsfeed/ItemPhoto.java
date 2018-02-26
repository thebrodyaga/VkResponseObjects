package com.thebrodyaga.vkobjects.newsfeed;



import java.util.Objects;

/**
 * ItemPhoto object
 */
public class ItemPhoto {


    private ItemPhotoPhotos photos;

    /**
     * Post ID
     */

    private Integer postId;

    public ItemPhotoPhotos getPhotos() {
        return photos;
    }

    public Integer getPostId() {
        return postId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(postId, photos);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ItemPhoto itemPhoto = (ItemPhoto) o;
        return Objects.equals(photos, itemPhoto.photos) &&
                Objects.equals(postId, itemPhoto.postId);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ItemPhoto{");
        sb.append("com.thebrodyaga.vkobjects.photos=").append(photos);
        sb.append(", postId=").append(postId);
        sb.append('}');
        return sb.toString();
    }
}
