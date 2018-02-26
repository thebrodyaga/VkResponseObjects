package com.thebrodyaga.vkobjects.groups.responses;


import com.thebrodyaga.vkobjects.groups.UserXtrBanInfo;

import java.util.List;
import java.util.Objects;

/**
 * GetBannedResponse object
 */
public class GetBannedResponse {
    /**
     * Total com.thebrodyaga.vkobjects.users number
     */

    private Integer count;


    private List<UserXtrBanInfo> items;

    public Integer getCount() {
        return count;
    }

    public List<UserXtrBanInfo> getItems() {
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
