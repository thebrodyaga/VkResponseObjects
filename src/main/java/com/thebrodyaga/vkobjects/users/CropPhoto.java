package com.thebrodyaga.vkobjects.users;


import com.thebrodyaga.vkobjects.photos.Photo;

import java.util.Objects;

/**
 * CropPhoto object
 */
public class CropPhoto {

    private Photo photo;


    private CropPhotoCrop crop;


    private CropPhotoRect rect;

    public Photo getPhoto() {
        return photo;
    }

    public CropPhotoCrop getCrop() {
        return crop;
    }

    public CropPhotoRect getRect() {
        return rect;
    }

    @Override
    public int hashCode() {
        return Objects.hash(rect, photo, crop);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CropPhoto cropPhoto = (CropPhoto) o;
        return Objects.equals(photo, cropPhoto.photo) &&
                Objects.equals(crop, cropPhoto.crop) &&
                Objects.equals(rect, cropPhoto.rect);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("CropPhoto{");
        sb.append("photo=").append(photo);
        sb.append(", crop=").append(crop);
        sb.append(", rect=").append(rect);
        sb.append('}');
        return sb.toString();
    }
}
