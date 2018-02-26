package com.thebrodyaga.vkobjects.apps.responses;


import com.thebrodyaga.vkobjects.users.UserFull;

import java.util.List;
import java.util.Objects;

/**
 * GetFriendsListResponse object
 */
public class GetFriendsListResponse {
    /**
     * Total number
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
        GetFriendsListResponse getFriendsListResponse = (GetFriendsListResponse) o;
        return Objects.equals(count, getFriendsListResponse.count) &&
                Objects.equals(items, getFriendsListResponse.items);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("GetFriendsListResponse{");
        sb.append("count=").append(count);
        sb.append(", items=").append(items);
        sb.append('}');
        return sb.toString();
    }
}
