package com.thebrodyaga.vkobjects.market.responses;


import com.thebrodyaga.vkobjects.market.MarketAlbum;

import java.util.List;
import java.util.Objects;

/**
 * GetAlbumByIdResponse object
 */
public class GetAlbumByIdResponse {
    /**
     * Total number
     */

    private Integer count;


    private List<MarketAlbum> items;

    public Integer getCount() {
        return count;
    }

    public List<MarketAlbum> getItems() {
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
        GetAlbumByIdResponse getAlbumByIdResponse = (GetAlbumByIdResponse) o;
        return Objects.equals(count, getAlbumByIdResponse.count) &&
                Objects.equals(items, getAlbumByIdResponse.items);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("GetAlbumByIdResponse{");
        sb.append("count=").append(count);
        sb.append(", items=").append(items);
        sb.append('}');
        return sb.toString();
    }
}
