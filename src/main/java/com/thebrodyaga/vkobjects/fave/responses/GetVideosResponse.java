package com.thebrodyaga.vkobjects.fave.responses;


import com.thebrodyaga.vkobjects.video.Video;

import java.util.List;
import java.util.Objects;

/**
 * GetVideosResponse object
 */
public class GetVideosResponse {
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
        GetVideosResponse getVideosResponse = (GetVideosResponse) o;
        return Objects.equals(count, getVideosResponse.count) &&
                Objects.equals(items, getVideosResponse.items);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("GetVideosResponse{");
        sb.append("count=").append(count);
        sb.append(", items=").append(items);
        sb.append('}');
        return sb.toString();
    }
}
