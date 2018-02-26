package com.thebrodyaga.vkobjects.apps.responses;


import com.thebrodyaga.vkobjects.apps.App;

import java.util.List;
import java.util.Objects;

/**
 * GetCatalogResponse object
 */
public class GetCatalogResponse {
    /**
     * Total number
     */

    private Integer count;


    private List<App> items;

    public Integer getCount() {
        return count;
    }

    public List<App> getItems() {
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
        GetCatalogResponse getCatalogResponse = (GetCatalogResponse) o;
        return Objects.equals(count, getCatalogResponse.count) &&
                Objects.equals(items, getCatalogResponse.items);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("GetCatalogResponse{");
        sb.append("count=").append(count);
        sb.append(", items=").append(items);
        sb.append('}');
        return sb.toString();
    }
}
