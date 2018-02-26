package com.thebrodyaga.vkobjects.groups.responses;


import com.thebrodyaga.vkobjects.users.UserFull;

import java.util.List;
import java.util.Objects;

/**
 * GetRequestsFieldsResponse object
 */
public class GetRequestsFieldsResponse {
    /**
     * Total communities number
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
        GetRequestsFieldsResponse getRequestsFieldsResponse = (GetRequestsFieldsResponse) o;
        return Objects.equals(count, getRequestsFieldsResponse.count) &&
                Objects.equals(items, getRequestsFieldsResponse.items);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("GetRequestsFieldsResponse{");
        sb.append("count=").append(count);
        sb.append(", items=").append(items);
        sb.append('}');
        return sb.toString();
    }
}
