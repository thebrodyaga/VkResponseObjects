package com.thebrodyaga.vkobjects.friends.responses;


import com.thebrodyaga.vkobjects.users.UserFull;

import java.util.List;
import java.util.Objects;

/**
 * GetAvailableForCallFieldsResponse object
 */
public class GetAvailableForCallFieldsResponse {
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
        GetAvailableForCallFieldsResponse getAvailableForCallFieldsResponse = (GetAvailableForCallFieldsResponse) o;
        return Objects.equals(count, getAvailableForCallFieldsResponse.count) &&
                Objects.equals(items, getAvailableForCallFieldsResponse.items);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("GetAvailableForCallFieldsResponse{");
        sb.append("count=").append(count);
        sb.append(", items=").append(items);
        sb.append('}');
        return sb.toString();
    }
}
