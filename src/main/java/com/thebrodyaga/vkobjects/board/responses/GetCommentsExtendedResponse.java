package com.thebrodyaga.vkobjects.board.responses;


import com.thebrodyaga.vkobjects.board.TopicComment;
import com.thebrodyaga.vkobjects.board.TopicPoll;
import com.thebrodyaga.vkobjects.groups.Group;
import com.thebrodyaga.vkobjects.users.User;

import java.util.List;
import java.util.Objects;

/**
 * GetCommentsExtendedResponse object
 */
public class GetCommentsExtendedResponse {
    /**
     * Total number
     */

    private Integer count;


    private List<TopicComment> items;


    private TopicPoll poll;


    private List<User> profiles;


    private List<Group> groups;

    public Integer getCount() {
        return count;
    }

    public List<TopicComment> getItems() {
        return items;
    }

    public TopicPoll getPoll() {
        return poll;
    }

    public List<User> getProfiles() {
        return profiles;
    }

    public List<Group> getGroups() {
        return groups;
    }

    @Override
    public int hashCode() {
        return Objects.hash(count, profiles, groups, poll, items);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GetCommentsExtendedResponse getCommentsExtendedResponse = (GetCommentsExtendedResponse) o;
        return Objects.equals(count, getCommentsExtendedResponse.count) &&
                Objects.equals(items, getCommentsExtendedResponse.items) &&
                Objects.equals(poll, getCommentsExtendedResponse.poll) &&
                Objects.equals(profiles, getCommentsExtendedResponse.profiles) &&
                Objects.equals(groups, getCommentsExtendedResponse.groups);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("GetCommentsExtendedResponse{");
        sb.append("count=").append(count);
        sb.append(", items=").append(items);
        sb.append(", poll=").append(poll);
        sb.append(", profiles=").append(profiles);
        sb.append(", com.thebrodyaga.vkobjects.groups=").append(groups);
        sb.append('}');
        return sb.toString();
    }
}
