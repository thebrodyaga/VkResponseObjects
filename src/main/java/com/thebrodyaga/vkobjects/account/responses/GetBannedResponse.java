package com.thebrodyaga.vkobjects.account.responses;


import com.thebrodyaga.vkobjects.users.UserMin;

import java.util.List;
import java.util.Objects;

/**
 * GetBannedResponse object
 */
public class GetBannedResponse {
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
        GetBannedResponse getBannedResponse = (GetBannedResponse) o;
        return Objects.equals(count, getBannedResponse.count) &&
                Objects.equals(items, getBannedResponse.items);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("GetBannedResponse{");
        sb.append("count=").append(count);
        sb.append(", items=").append(items);
        sb.append('}');
        return sb.toString();
    }
}
