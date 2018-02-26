package com.thebrodyaga.vkobjects.database.responses;


import com.thebrodyaga.vkobjects.database.Faculty;

import java.util.List;
import java.util.Objects;

/**
 * GetFacultiesResponse object
 */
public class GetFacultiesResponse {
    /**
     * Total number
     */

    private Integer count;


    private List<Faculty> items;

    public Integer getCount() {
        return count;
    }

    public List<Faculty> getItems() {
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
        GetFacultiesResponse getFacultiesResponse = (GetFacultiesResponse) o;
        return Objects.equals(count, getFacultiesResponse.count) &&
                Objects.equals(items, getFacultiesResponse.items);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("GetFacultiesResponse{");
        sb.append("count=").append(count);
        sb.append(", items=").append(items);
        sb.append('}');
        return sb.toString();
    }
}
