package com.thebrodyaga.vkobjects.app.widgets.responses;


import com.thebrodyaga.vkobjects.app.widgets.ImageType;
import com.thebrodyaga.vkobjects.base.Image;

import java.util.List;
import java.util.Objects;

public class SaveImageResponse {


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
        SaveImageResponse that = (SaveImageResponse) o;
        return Objects.equals(id, that.id) &&
                type == that.type &&
                Objects.equals(images, that.images);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, type, images);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("SaveImageResponse{");
        sb.append("id='").append(id).append('\'');
        sb.append(", type=").append(type);
        sb.append(", images=").append(images);
        sb.append('}');
        return sb.toString();
    }
}
