package com.thebrodyaga.vkobjects.groups.responses;


import com.thebrodyaga.vkobjects.groups.GroupFull;

import java.util.List;
import java.util.Objects;

/**
 * GetExtendedResponse object
 */
public class GetExtendedResponse {
    /**
     * Total communities number
     */

    private Integer count;


    private List<GroupFull> items;

    public Integer getCount() {
        return count;
    }

    public List<GroupFull> getItems() {
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
        GetExtendedResponse getExtendedResponse = (GetExtendedResponse) o;
        return Objects.equals(count, getExtendedResponse.count) &&
                Objects.equals(items, getExtendedResponse.items);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("GetExtendedResponse{");
        sb.append("count=").append(count);
        sb.append(", items=").append(items);
        sb.append('}');
        return sb.toString();
    }
}
