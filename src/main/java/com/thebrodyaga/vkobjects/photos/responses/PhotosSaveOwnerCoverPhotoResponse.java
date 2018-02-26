package com.thebrodyaga.vkobjects.photos.responses;


import com.thebrodyaga.vkobjects.base.Image;

import java.util.List;
import java.util.Objects;

/**
 * PhotosSaveOwnerCoverPhotoResponse object
 */
public class PhotosSaveOwnerCoverPhotoResponse {

    /**
     * Images list
     */

    private List<Image> images;

    public List<Image> getImages() {
        return images;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PhotosSaveOwnerCoverPhotoResponse that = (PhotosSaveOwnerCoverPhotoResponse) o;
        return Objects.equals(images, that.images);
    }

    @Override
    public int hashCode() {
        return Objects.hash(images);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PhotosSaveOwnerCoverPhotoResponse{");
        sb.append("images=").append(images);
        sb.append('}');
        return sb.toString();
    }
}
