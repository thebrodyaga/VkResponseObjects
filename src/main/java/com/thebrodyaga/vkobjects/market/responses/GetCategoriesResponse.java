package com.thebrodyaga.vkobjects.market.responses;


import com.thebrodyaga.vkobjects.market.MarketCategory;

import java.util.List;
import java.util.Objects;

/**
 * GetCategoriesResponse object
 */
public class GetCategoriesResponse {
    /**
     * Total number
     */

    private Integer count;


    private List<MarketCategory> items;

    public Integer getCount() {
        return count;
    }

    public List<MarketCategory> getItems() {
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
        GetCategoriesResponse getCategoriesResponse = (GetCategoriesResponse) o;
        return Objects.equals(count, getCategoriesResponse.count) &&
                Objects.equals(items, getCategoriesResponse.items);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("GetCategoriesResponse{");
        sb.append("count=").append(count);
        sb.append(", items=").append(items);
        sb.append('}');
        return sb.toString();
    }
}
