package com.thebrodyaga.vkobjects.groups.responses;


import com.thebrodyaga.vkobjects.groups.MemberRole;

import java.util.List;
import java.util.Objects;

/**
 * GetMembersFilterResponse object
 */
public class GetMembersFilterResponse {
    /**
     * Total members number
     */

    private Integer count;


    private List<MemberRole> items;

    public Integer getCount() {
        return count;
    }

    public List<MemberRole> getItems() {
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
        GetMembersFilterResponse getMembersFilterResponse = (GetMembersFilterResponse) o;
        return Objects.equals(count, getMembersFilterResponse.count) &&
                Objects.equals(items, getMembersFilterResponse.items);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("GetMembersFilterResponse{");
        sb.append("count=").append(count);
        sb.append(", items=").append(items);
        sb.append('}');
        return sb.toString();
    }
}
