package com.thebrodyaga.vkobjects.newsfeed.responses;


import com.thebrodyaga.vkobjects.newsfeed.NewsfeedList;

import java.util.List;
import java.util.Objects;

/**
 * GetListsResponse object
 */
public class GetListsResponse {
    /**
     * Total number
     */

    private Integer count;


    private List<NewsfeedList> items;

    public Integer getCount() {
        return count;
    }

    public List<NewsfeedList> getItems() {
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
        GetListsResponse getListsResponse = (GetListsResponse) o;
        return Objects.equals(count, getListsResponse.count) &&
                Objects.equals(items, getListsResponse.items);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("GetListsResponse{");
        sb.append("count=").append(count);
        sb.append(", items=").append(items);
        sb.append('}');
        return sb.toString();
    }
}
