package com.thebrodyaga.vkobjects.newsfeed.responses;


import com.thebrodyaga.vkobjects.groups.GroupFull;
import com.thebrodyaga.vkobjects.users.UserFull;
import com.thebrodyaga.vkobjects.wall.WallPostFull;

import java.util.List;
import java.util.Objects;

/**
 * SearchExtendedResponse object
 */
public class SearchExtendedResponse {

    private List<WallPostFull> items;


    private List<UserFull> profiles;


    private List<GroupFull> groups;

    public List<WallPostFull> getItems() {
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
        SearchExtendedResponse searchExtendedResponse = (SearchExtendedResponse) o;
        return Objects.equals(items, searchExtendedResponse.items) &&
                Objects.equals(profiles, searchExtendedResponse.profiles) &&
                Objects.equals(groups, searchExtendedResponse.groups);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("SearchExtendedResponse{");
        sb.append("items=").append(items);
        sb.append(", profiles=").append(profiles);
        sb.append(", com.thebrodyaga.vkobjects.groups=").append(groups);
        sb.append('}');
        return sb.toString();
    }
}
