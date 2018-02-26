package com.thebrodyaga.vkobjects.photos.responses;


import com.thebrodyaga.vkobjects.photos.PhotoXtrTagInfo;

import java.util.List;
import java.util.Objects;

/**
 * GetNewTagsResponse object
 */
public class GetNewTagsResponse {
    /**
     * Total number
     */

    private Integer count;


    private List<PhotoXtrTagInfo> items;

    public Integer getCount() {
        return count;
    }

    public List<PhotoXtrTagInfo> getItems() {
        return items;
    }

    @Override
    public int hashCode() {
        return Objects.hash(count, items);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GetNewTagsResponse getNewTagsResponse = (GetNewTagsResponse) o;
        return Objects.equals(count, getNewTagsResponse.count) &&
                Objects.equals(items, getNewTagsResponse.items);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("GetNewTagsResponse{");
        sb.append("count=").append(count);
        sb.append(", items=").append(items);
        sb.append('}');
        return sb.toString();
    }
}
