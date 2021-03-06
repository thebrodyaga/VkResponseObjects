package com.thebrodyaga.vkobjects.database.responses;


import com.thebrodyaga.vkobjects.database.City;

import java.util.List;
import java.util.Objects;

/**
 * GetCitiesResponse object
 */
public class GetCitiesResponse {
    /**
     * Total number
     */

    private Integer count;


    private List<City> items;

    public Integer getCount() {
        return count;
    }

    public List<City> getItems() {
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
        GetCitiesResponse getCitiesResponse = (GetCitiesResponse) o;
        return Objects.equals(count, getCitiesResponse.count) &&
                Objects.equals(items, getCitiesResponse.items);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("GetCitiesResponse{");
        sb.append("count=").append(count);
        sb.append(", items=").append(items);
        sb.append('}');
        return sb.toString();
    }
}
