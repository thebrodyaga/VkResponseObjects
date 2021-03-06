package com.thebrodyaga.vkobjects.groups.responses;



import java.util.List;
import java.util.Objects;

/**
 * GetMembersResponse object
 */
public class GetMembersResponse {
    /**
     * Total members number
     */

    private Integer count;


    private List<Integer> items;

    public Integer getCount() {
        return count;
    }

    public List<Integer> getItems() {
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
        GetMembersResponse getMembersResponse = (GetMembersResponse) o;
        return Objects.equals(count, getMembersResponse.count) &&
                Objects.equals(items, getMembersResponse.items);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("GetMembersResponse{");
        sb.append("count=").append(count);
        sb.append(", items=").append(items);
        sb.append('}');
        return sb.toString();
    }
}
