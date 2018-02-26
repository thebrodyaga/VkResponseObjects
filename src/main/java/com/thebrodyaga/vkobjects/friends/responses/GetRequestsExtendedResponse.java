package com.thebrodyaga.vkobjects.friends.responses;


import com.thebrodyaga.vkobjects.friends.RequestsXtrMessage;

import java.util.List;
import java.util.Objects;

/**
 * GetRequestsExtendedResponse object
 */
public class GetRequestsExtendedResponse {
    /**
     * Total requests number
     */

    private Integer count;


    private List<RequestsXtrMessage> items;

    public Integer getCount() {
        return count;
    }

    public List<RequestsXtrMessage> getItems() {
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
        GetRequestsExtendedResponse getRequestsExtendedResponse = (GetRequestsExtendedResponse) o;
        return Objects.equals(count, getRequestsExtendedResponse.count) &&
                Objects.equals(items, getRequestsExtendedResponse.items);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("GetRequestsExtendedResponse{");
        sb.append("count=").append(count);
        sb.append(", items=").append(items);
        sb.append('}');
        return sb.toString();
    }
}
