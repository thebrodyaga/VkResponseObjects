package com.thebrodyaga.vkobjects.video.responses;


import com.thebrodyaga.vkobjects.video.CatBlock;

import java.util.List;
import java.util.Objects;

/**
 * GetCatalogResponse object
 */
public class GetCatalogResponse {

    private List<CatBlock> items;

    /**
     * New value for _from_ parameter
     */

    private String next;

    public List<CatBlock> getItems() {
        return items;
    }

    public String getNext() {
        return next;
    }

    @Override
    public int hashCode() {
        return Objects.hash(next, items);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GetCatalogResponse getCatalogResponse = (GetCatalogResponse) o;
        return Objects.equals(items, getCatalogResponse.items) &&
                Objects.equals(next, getCatalogResponse.next);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("GetCatalogResponse{");
        sb.append("items=").append(items);
        sb.append(", next='").append(next).append("'");
        sb.append('}');
        return sb.toString();
    }
}
