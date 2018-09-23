package com.thebrodyaga.vkobjects.photos.responses;



import com.thebrodyaga.vkobjects.photos.PhotoXtrRealOffset;

import java.util.List;
import java.util.Objects;

/**
 * GetAllResponse object
 */
public class GetAllResponse {
    /**
     * Total number
     */

    private Integer count;


    private List<PhotoXtrRealOffset> items;

    /**
     * Information whether next page is presented
     */

    private Boolean more;

    public Integer getCount() {
        return count;
    }

    public List<PhotoXtrRealOffset> getItems() {
        return items;
    }

    public boolean isMore() {
        return more;
    }

    @Override
    public int hashCode() {
        return Objects.hash(more, count, items);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GetAllResponse getAllResponse = (GetAllResponse) o;
        return Objects.equals(count, getAllResponse.count) &&
                Objects.equals(items, getAllResponse.items) &&
                Objects.equals(more, getAllResponse.more);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("GetAllResponse{");
        sb.append("count=").append(count);
        sb.append(", items=").append(items);
        sb.append(", more=").append(more);
        sb.append('}');
        return sb.toString();
    }
}
