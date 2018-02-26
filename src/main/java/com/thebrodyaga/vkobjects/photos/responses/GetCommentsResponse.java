package com.thebrodyaga.vkobjects.photos.responses;


import com.thebrodyaga.vkobjects.wall.WallComment;

import java.util.List;
import java.util.Objects;

/**
 * GetCommentsResponse object
 */
public class GetCommentsResponse {
    /**
     * Total number
     */

    private Integer count;

    /**
     * Real offset of the comments
     */

    private Integer realOffset;


    private List<WallComment> items;

    public Integer getCount() {
        return count;
    }

    public Integer getRealOffset() {
        return realOffset;
    }

    public List<WallComment> getItems() {
        return items;
    }

    @Override
    public int hashCode() {
        return Objects.hash(realOffset, count, items);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GetCommentsResponse getCommentsResponse = (GetCommentsResponse) o;
        return Objects.equals(count, getCommentsResponse.count) &&
                Objects.equals(realOffset, getCommentsResponse.realOffset) &&
                Objects.equals(items, getCommentsResponse.items);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("GetCommentsResponse{");
        sb.append("count=").append(count);
        sb.append(", realOffset=").append(realOffset);
        sb.append(", items=").append(items);
        sb.append('}');
        return sb.toString();
    }
}
