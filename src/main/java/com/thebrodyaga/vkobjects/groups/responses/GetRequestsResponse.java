package com.thebrodyaga.vkobjects.groups.responses;



import java.util.List;
import java.util.Objects;

/**
 * GetRequestsResponse object
 */
public class GetRequestsResponse {
    /**
     * Total communities number
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
        GetRequestsResponse getRequestsResponse = (GetRequestsResponse) o;
        return Objects.equals(count, getRequestsResponse.count) &&
                Objects.equals(items, getRequestsResponse.items);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("GetRequestsResponse{");
        sb.append("count=").append(count);
        sb.append(", items=").append(items);
        sb.append('}');
        return sb.toString();
    }
}
