package com.thebrodyaga.vkobjects.likes.responses;


import com.thebrodyaga.vkobjects.users.UserMin;

import java.util.List;
import java.util.Objects;

/**
 * GetListExtendedResponse object
 */
public class GetListExtendedResponse {
    /**
     * Total number
     */

    private Integer count;


    private List<UserMin> items;

    public Integer getCount() {
        return count;
    }

    public List<UserMin> getItems() {
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
        GetListExtendedResponse getListExtendedResponse = (GetListExtendedResponse) o;
        return Objects.equals(count, getListExtendedResponse.count) &&
                Objects.equals(items, getListExtendedResponse.items);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("GetListExtendedResponse{");
        sb.append("count=").append(count);
        sb.append(", items=").append(items);
        sb.append('}');
        return sb.toString();
    }
}
