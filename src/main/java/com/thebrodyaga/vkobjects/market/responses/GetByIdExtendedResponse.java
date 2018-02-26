package com.thebrodyaga.vkobjects.market.responses;


import com.thebrodyaga.vkobjects.market.MarketItemFull;

import java.util.List;
import java.util.Objects;

/**
 * GetByIdExtendedResponse object
 */
public class GetByIdExtendedResponse {
    /**
     * Total number
     */

    private Integer count;


    private List<MarketItemFull> items;

    public Integer getCount() {
        return count;
    }

    public List<MarketItemFull> getItems() {
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
        GetByIdExtendedResponse getByIdExtendedResponse = (GetByIdExtendedResponse) o;
        return Objects.equals(count, getByIdExtendedResponse.count) &&
                Objects.equals(items, getByIdExtendedResponse.items);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("GetByIdExtendedResponse{");
        sb.append("count=").append(count);
        sb.append(", items=").append(items);
        sb.append('}');
        return sb.toString();
    }
}
