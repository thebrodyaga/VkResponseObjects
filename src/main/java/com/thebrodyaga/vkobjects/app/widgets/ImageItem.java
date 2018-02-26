package com.thebrodyaga.vkobjects.app.widgets;


import com.thebrodyaga.vkobjects.base.Image;

import java.util.List;
import java.util.Objects;

public class ImageItem {


    private String id;


    private ImageType type;


    private List<Image> images;

    public String getId() {
        return id;
    }

    public ImageType getType() {
        return type;
    }

    public List<Image> getImages() {
        return images;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ImageItem imageItem = (ImageItem) o;
        return Objects.equals(id, imageItem.id) &&
                type == imageItem.type &&
                Objects.equals(images, imageItem.images);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, type, images);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ImageItem{");
        sb.append("id='").append(id).append('\'');
        sb.append(", type=").append(type);
        sb.append(", images=").append(images);
        sb.append('}');
        return sb.toString();
    }
}
