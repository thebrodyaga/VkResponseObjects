package com.thebrodyaga.vkobjects.gifts.responses;


import com.thebrodyaga.vkobjects.gifts.Gift;

import java.util.List;
import java.util.Objects;

/**
 * GetResponse object
 */
public class GetResponse {
    /**
     * Total number
     */

    private Integer count;


    private List<Gift> items;

    public Integer getCount() {
        return count;
    }

    public List<Gift> getItems() {
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
        GetResponse getResponse = (GetResponse) o;
        return Objects.equals(count, getResponse.count) &&
                Objects.equals(items, getResponse.items);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("GetResponse{");
        sb.append("count=").append(count);
        sb.append(", items=").append(items);
        sb.append('}');
        return sb.toString();
    }
}
