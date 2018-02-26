package com.thebrodyaga.vkobjects.photos.responses;


import com.thebrodyaga.vkobjects.base.BoolInt;
import com.thebrodyaga.vkobjects.photos.PhotoFullXtrRealOffset;

import java.util.List;
import java.util.Objects;

/**
 * GetAllExtendedResponse object
 */
public class GetAllExtendedResponse {
    /**
     * Total number
     */

    private Integer count;


    private List<PhotoFullXtrRealOffset> items;

    /**
     * Information whether next page is presented
     */

    private BoolInt more;

    public Integer getCount() {
        return count;
    }

    public List<PhotoFullXtrRealOffset> getItems() {
        return items;
    }

    public boolean isMore() {
        return more == BoolInt.YES;
    }

    @Override
    public int hashCode() {
        return Objects.hash(more, count, items);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GetAllExtendedResponse getAllExtendedResponse = (GetAllExtendedResponse) o;
        return Objects.equals(count, getAllExtendedResponse.count) &&
                Objects.equals(items, getAllExtendedResponse.items) &&
                Objects.equals(more, getAllExtendedResponse.more);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("GetAllExtendedResponse{");
        sb.append("count=").append(count);
        sb.append(", items=").append(items);
        sb.append(", more=").append(more);
        sb.append('}');
        return sb.toString();
    }
}
