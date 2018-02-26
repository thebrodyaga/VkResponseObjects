package com.thebrodyaga.vkobjects.friends.responses;



import java.util.List;
import java.util.Objects;

/**
 * GetResponse object
 */
public class GetResponse {
    /**
     * Total com.thebrodyaga.vkobjects.friends number
     */

    private Integer count;


    private List<Integer> items;

    public Integer getCount() {
        return count;
    }

    public List<Integer> getItems() {
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
