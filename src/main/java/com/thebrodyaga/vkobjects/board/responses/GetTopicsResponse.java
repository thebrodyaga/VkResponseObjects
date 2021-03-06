package com.thebrodyaga.vkobjects.board.responses;



import com.thebrodyaga.vkobjects.board.DefaultOrder;
import com.thebrodyaga.vkobjects.board.Topic;

import java.util.List;
import java.util.Objects;

/**
 * GetTopicsResponse object
 */
public class GetTopicsResponse {
    /**
     * Total number
     */

    private Integer count;


    private List<Topic> items;


    private DefaultOrder defaultOrder;

    /**
     * Information whether current user can add topic
     */

    private Boolean canAddTopics;

    public Integer getCount() {
        return count;
    }

    public List<Topic> getItems() {
        return items;
    }

    public DefaultOrder getDefaultOrder() {
        return defaultOrder;
    }

    public boolean canAddTopics() {
        return canAddTopics;
    }

    @Override
    public int hashCode() {
        return Objects.hash(canAddTopics, defaultOrder, count, items);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GetTopicsResponse getTopicsResponse = (GetTopicsResponse) o;
        return Objects.equals(count, getTopicsResponse.count) &&
                Objects.equals(items, getTopicsResponse.items) &&
                Objects.equals(defaultOrder, getTopicsResponse.defaultOrder) &&
                Objects.equals(canAddTopics, getTopicsResponse.canAddTopics);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("GetTopicsResponse{");
        sb.append("count=").append(count);
        sb.append(", items=").append(items);
        sb.append(", defaultOrder=").append(defaultOrder);
        sb.append(", canAddTopics=").append(canAddTopics);
        sb.append('}');
        return sb.toString();
    }
}
