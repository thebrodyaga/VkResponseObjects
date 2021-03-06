package com.thebrodyaga.vkobjects.users.responses;


import com.thebrodyaga.vkobjects.users.UserFull;

import java.util.List;
import java.util.Objects;

/**
 * GetFollowersFieldsResponse object
 */
public class GetFollowersFieldsResponse {
    /**
     * Total number of available results
     */

    private Integer count;


    private List<UserFull> items;

    public Integer getCount() {
        return count;
    }

    public List<UserFull> getItems() {
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
        GetFollowersFieldsResponse getFollowersFieldsResponse = (GetFollowersFieldsResponse) o;
        return Objects.equals(count, getFollowersFieldsResponse.count) &&
                Objects.equals(items, getFollowersFieldsResponse.items);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("GetFollowersFieldsResponse{");
        sb.append("count=").append(count);
        sb.append(", items=").append(items);
        sb.append('}');
        return sb.toString();
    }
}
