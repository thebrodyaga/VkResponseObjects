package com.thebrodyaga.vkobjects.groups;


import com.thebrodyaga.vkobjects.base.BoolInt;
import com.thebrodyaga.vkobjects.base.Image;

import java.util.List;
import java.util.Objects;

/**
 * Cover image
 */
public class Cover {

    /**
     * Information whether cover is enabled
     */

    private BoolInt enabled;


    private List<Image> images;

    public boolean isEnabled() {
        return enabled == BoolInt.YES;
    }

    public List<Image> getImages() {
        return images;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cover cover = (Cover) o;
        return enabled == cover.enabled &&
                Objects.equals(images, cover.images);
    }

    @Override
    public int hashCode() {
        return Objects.hash(enabled, images);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Cover{");
        sb.append("enabled=").append(enabled);
        sb.append(", images=").append(images);
        sb.append('}');
        return sb.toString();
    }
}
