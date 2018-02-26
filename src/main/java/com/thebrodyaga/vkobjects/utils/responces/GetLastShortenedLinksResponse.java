package com.thebrodyaga.vkobjects.utils.responces;


import com.thebrodyaga.vkobjects.utils.LastShortenedLink;

import java.util.List;
import java.util.Objects;

/**
 * GetLastShortenedLinksResponse object
 */
public class GetLastShortenedLinksResponse {

    /**
     * Total number of available results
     */

    private Integer count;


    private List<LastShortenedLink> items;

    public Integer getCount() {
        return count;
    }

    public List<LastShortenedLink> getItems() {
        return items;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GetLastShortenedLinksResponse that = (GetLastShortenedLinksResponse) o;
        return Objects.equals(count, that.count) &&
                Objects.equals(items, that.items);
    }

    @Override
    public int hashCode() {
        return Objects.hash(count, items);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("GetLastShortenedLinksResponse{");
        sb.append("count=").append(count);
        sb.append(", items=").append(items);
        sb.append('}');
        return sb.toString();
    }
}
