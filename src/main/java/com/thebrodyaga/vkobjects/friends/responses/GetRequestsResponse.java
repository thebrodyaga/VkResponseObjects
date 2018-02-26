package com.thebrodyaga.vkobjects.friends.responses;



import java.util.List;
import java.util.Objects;

/**
 * GetRequestsResponse object
 */
public class GetRequestsResponse {
    /**
     * Total requests number
     */

    private Integer count;


    private List<Integer> items;


    private Integer countUnread;

    public Integer getCount() {
        return count;
    }

    public List<Integer> getItems() {
        return items;
    }

    public Integer getCountUnread() {
        return countUnread;
    }

    @Override
    public int hashCode() {
        return Objects.hash(count, items, countUnread);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GetRequestsResponse getRequestsResponse = (GetRequestsResponse) o;
        return Objects.equals(count, getRequestsResponse.count) &&
                Objects.equals(items, getRequestsResponse.items) &&
                Objects.equals(countUnread, getRequestsResponse.countUnread);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("GetRequestsResponse{");
        sb.append("count=").append(count);
        sb.append(", items=").append(items);
        sb.append(", countUnread=").append(countUnread);
        sb.append('}');
        return sb.toString();
    }
}
