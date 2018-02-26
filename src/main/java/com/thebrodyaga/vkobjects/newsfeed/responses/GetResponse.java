package com.thebrodyaga.vkobjects.newsfeed.responses;


import com.thebrodyaga.vkobjects.groups.GroupFull;
import com.thebrodyaga.vkobjects.newsfeed.NewsfeedItem;
import com.thebrodyaga.vkobjects.users.UserFull;

import java.util.List;
import java.util.Objects;

/**
 * GetResponse object
 */
public class GetResponse {

    private List<NewsfeedItem> items;


    private List<UserFull> profiles;


    private List<GroupFull> groups;

    public List<NewsfeedItem> getItems() {
        return items;
    }

    public List<UserFull> getProfiles() {
        return profiles;
    }

    public List<GroupFull> getGroups() {
        return groups;
    }

    @Override
    public int hashCode() {
        return Objects.hash(profiles, groups, items);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GetResponse getResponse = (GetResponse) o;
        return Objects.equals(items, getResponse.items) &&
                Objects.equals(profiles, getResponse.profiles) &&
                Objects.equals(groups, getResponse.groups);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("GetResponse{");
        sb.append("items=").append(items);
        sb.append(", profiles=").append(profiles);
        sb.append(", com.thebrodyaga.vkobjects.groups=").append(groups);
        sb.append('}');
        return sb.toString();
    }
}
