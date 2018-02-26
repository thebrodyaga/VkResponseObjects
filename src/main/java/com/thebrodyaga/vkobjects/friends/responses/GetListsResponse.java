package com.thebrodyaga.vkobjects.friends.responses;


import com.thebrodyaga.vkobjects.friends.FriendsList;

import java.util.List;
import java.util.Objects;

/**
 * GetListsResponse object
 */
public class GetListsResponse {
    /**
     * Total communities number
     */

    private Integer count;


    private List<FriendsList> items;

    public Integer getCount() {
        return count;
    }

    public List<FriendsList> getItems() {
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
