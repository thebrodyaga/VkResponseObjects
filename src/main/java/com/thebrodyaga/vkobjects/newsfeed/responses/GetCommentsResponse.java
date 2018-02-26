package com.thebrodyaga.vkobjects.newsfeed.responses;


import com.thebrodyaga.vkobjects.groups.GroupFull;
import com.thebrodyaga.vkobjects.newsfeed.NewsfeedItem;
import com.thebrodyaga.vkobjects.users.UserFull;

import java.util.List;
import java.util.Objects;

/**
 * GetCommentsResponse object
 */
public class GetCommentsResponse {

    private List<NewsfeedItem> items;


    private List<UserFull> profiles;


    private List<GroupFull> groups;

    /**
     * New from value
     */

    private String nextFrom;

    public List<NewsfeedItem> getItems() {
        return items;
    }

    public List<UserFull> getProfiles() {
        return profiles;
    }

    public List<GroupFull> getGroups() {
        return groups;
    }

    public String getNextFrom() {
        return nextFrom;
    }

    @Override
    public int hashCode() {
        return Objects.hash(profiles, groups, items, nextFrom);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GetCommentsResponse getCommentsResponse = (GetCommentsResponse) o;
        return Objects.equals(items, getCommentsResponse.items) &&
                Objects.equals(profiles, getCommentsResponse.profiles) &&
                Objects.equals(groups, getCommentsResponse.groups) &&
                Objects.equals(nextFrom, getCommentsResponse.nextFrom);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("GetCommentsResponse{");
        sb.append("items=").append(items);
        sb.append(", profiles=").append(profiles);
        sb.append(", com.thebrodyaga.vkobjects.groups=").append(groups);
        sb.append(", nextFrom='").append(nextFrom).append("'");
        sb.append('}');
        return sb.toString();
    }
}
