package com.thebrodyaga.vkobjects.groups.responses;


import com.thebrodyaga.vkobjects.groups.UserXtrRole;

import java.util.List;
import java.util.Objects;

/**
 * GetMembersFieldsResponse object
 */
public class GetMembersFieldsResponse {
    /**
     * Total members number
     */

    private Integer count;


    private List<UserXtrRole> items;

    public Integer getCount() {
        return count;
    }

    public List<UserXtrRole> getItems() {
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
        GetMembersFieldsResponse getMembersFieldsResponse = (GetMembersFieldsResponse) o;
        return Objects.equals(count, getMembersFieldsResponse.count) &&
                Objects.equals(items, getMembersFieldsResponse.items);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("GetMembersFieldsResponse{");
        sb.append("count=").append(count);
        sb.append(", items=").append(items);
        sb.append('}');
        return sb.toString();
    }
}
