package com.thebrodyaga.vkobjects.newsfeed;



import java.util.List;
import java.util.Objects;

/**
 * ItemPhotoPhotos object
 */
public class ItemPhotoPhotos {


    private Integer count;


    private List<NewsfeedPhoto> items;

    public Integer getCount() {
        return count;
    }

    public List<NewsfeedPhoto> getItems() {
        return items;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ItemPhotoPhotos that = (ItemPhotoPhotos) o;
        return Objects.equals(count, that.count) &&
                Objects.equals(items, that.items);
    }

    @Override
    public int hashCode() {
        return Objects.hash(count, items);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ItemPhotoPhotos{");
        sb.append("count=").append(count);
        sb.append(", items=").append(items);
        sb.append('}');
        return sb.toString();
    }
}
