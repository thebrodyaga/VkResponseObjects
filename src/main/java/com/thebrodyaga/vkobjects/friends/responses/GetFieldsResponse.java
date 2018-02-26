package com.thebrodyaga.vkobjects.friends.responses;


import com.thebrodyaga.vkobjects.friends.UserXtrLists;

import java.util.List;
import java.util.Objects;

/**
 * GetFieldsResponse object
 */
public class GetFieldsResponse {
    /**
     * Total com.thebrodyaga.vkobjects.friends number
     */

    private Integer count;


    private List<UserXtrLists> items;

    public Integer getCount() {
        return count;
    }

    public List<UserXtrLists> getItems() {
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
        GetFieldsResponse getFieldsResponse = (GetFieldsResponse) o;
        return Objects.equals(count, getFieldsResponse.count) &&
                Objects.equals(items, getFieldsResponse.items);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("GetFieldsResponse{");
        sb.append("count=").append(count);
        sb.append(", items=").append(items);
        sb.append('}');
        return sb.toString();
    }
}
