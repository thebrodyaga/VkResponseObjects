package com.thebrodyaga.vkobjects.board.responses;



import com.thebrodyaga.vkobjects.board.DefaultOrder;
import com.thebrodyaga.vkobjects.board.Topic;
import com.thebrodyaga.vkobjects.users.UserMin;

import java.util.List;
import java.util.Objects;

/**
 * GetTopicsExtendedResponse object
 */
public class GetTopicsExtendedResponse {
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


    private List<UserMin> profiles;

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

    public List<UserMin> getProfiles() {
        return profiles;
    }

    @Override
    public int hashCode() {
        return Objects.hash(canAddTopics, defaultOrder, count, profiles, items);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GetTopicsExtendedResponse getTopicsExtendedResponse = (GetTopicsExtendedResponse) o;
        return Objects.equals(count, getTopicsExtendedResponse.count) &&
                Objects.equals(items, getTopicsExtendedResponse.items) &&
                Objects.equals(defaultOrder, getTopicsExtendedResponse.defaultOrder) &&
                Objects.equals(canAddTopics, getTopicsExtendedResponse.canAddTopics) &&
                Objects.equals(profiles, getTopicsExtendedResponse.profiles);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("GetTopicsExtendedResponse{");
        sb.append("count=").append(count);
        sb.append(", items=").append(items);
        sb.append(", defaultOrder=").append(defaultOrder);
        sb.append(", canAddTopics=").append(canAddTopics);
        sb.append(", profiles=").append(profiles);
        sb.append('}');
        return sb.toString();
    }
}
