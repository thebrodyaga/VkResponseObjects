package com.thebrodyaga.vkobjects.video.responses;


import com.thebrodyaga.vkobjects.video.Video;

import java.util.List;
import java.util.Objects;

/**
 * SearchResponse object
 */
public class SearchResponse {
    /**
     * Total number
     */

    private Integer count;


    private List<Video> items;

    public Integer getCount() {
        return count;
    }

    public List<Video> getItems() {
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
        SearchResponse searchResponse = (SearchResponse) o;
        return Objects.equals(count, searchResponse.count) &&
                Objects.equals(items, searchResponse.items);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("SearchResponse{");
        sb.append("count=").append(count);
        sb.append(", items=").append(items);
        sb.append('}');
        return sb.toString();
    }
}
