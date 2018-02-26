package com.thebrodyaga.vkobjects.video.responses;


import com.thebrodyaga.vkobjects.video.VideoAlbumFull;

import java.util.List;
import java.util.Objects;

/**
 * GetAlbumsByVideoExtendedResponse object
 */
public class GetAlbumsByVideoExtendedResponse {
    /**
     * Total number
     */

    private Integer count;


    private List<VideoAlbumFull> items;

    public Integer getCount() {
        return count;
    }

    public List<VideoAlbumFull> getItems() {
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
        GetAlbumsByVideoExtendedResponse getAlbumsByVideoExtendedResponse = (GetAlbumsByVideoExtendedResponse) o;
        return Objects.equals(count, getAlbumsByVideoExtendedResponse.count) &&
                Objects.equals(items, getAlbumsByVideoExtendedResponse.items);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("GetAlbumsByVideoExtendedResponse{");
        sb.append("count=").append(count);
        sb.append(", items=").append(items);
        sb.append('}');
        return sb.toString();
    }
}
