package com.thebrodyaga.vkobjects.database.responses;


import com.thebrodyaga.vkobjects.base.BaseObject;

import java.util.List;
import java.util.Objects;

/**
 * GetChairsResponse object
 */
public class GetChairsResponse {
    /**
     * Total number
     */

    private Integer count;


    private List<BaseObject> items;

    public Integer getCount() {
        return count;
    }

    public List<BaseObject> getItems() {
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
        GetChairsResponse getChairsResponse = (GetChairsResponse) o;
        return Objects.equals(count, getChairsResponse.count) &&
                Objects.equals(items, getChairsResponse.items);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("GetChairsResponse{");
        sb.append("count=").append(count);
        sb.append(", items=").append(items);
        sb.append('}');
        return sb.toString();
    }
}
