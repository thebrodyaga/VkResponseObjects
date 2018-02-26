package com.thebrodyaga.vkobjects.newsfeed;


import com.thebrodyaga.vkobjects.video.Video;

import java.util.List;
import java.util.Objects;

/**
 * ItemVideoVideo object
 */
public class ItemVideoVideo {


    private Integer count;


    private List<Video> items;

    public Integer getCount() {
        return count;
    }

    public List<Video> getItems() {
        return items;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ItemVideoVideo that = (ItemVideoVideo) o;
        return Objects.equals(count, that.count) &&
                Objects.equals(items, that.items);
    }

    @Override
    public int hashCode() {
        return Objects.hash(count, items);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ItemVideoVideo{");
        sb.append("count=").append(count);
        sb.append(", items=").append(items);
        sb.append('}');
        return sb.toString();
    }
}
