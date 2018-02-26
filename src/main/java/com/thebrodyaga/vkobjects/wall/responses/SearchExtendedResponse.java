package com.thebrodyaga.vkobjects.wall.responses;


import com.thebrodyaga.vkobjects.groups.GroupFull;
import com.thebrodyaga.vkobjects.users.UserFull;
import com.thebrodyaga.vkobjects.wall.WallPostFull;

import java.util.List;
import java.util.Objects;

/**
 * SearchExtendedResponse object
 */
public class SearchExtendedResponse {
    /**
     * Total number
     */

    private Integer count;


    private List<WallPostFull> items;


    private List<UserFull> profiles;


    private List<GroupFull> groups;

    public Integer getCount() {
        return count;
    }

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
        return Objects.hash(count, profiles, groups, items);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SearchExtendedResponse searchExtendedResponse = (SearchExtendedResponse) o;
        return Objects.equals(count, searchExtendedResponse.count) &&
                Objects.equals(items, searchExtendedResponse.items) &&
                Objects.equals(profiles, searchExtendedResponse.profiles) &&
                Objects.equals(groups, searchExtendedResponse.groups);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("SearchExtendedResponse{");
        sb.append("count=").append(count);
        sb.append(", items=").append(items);
        sb.append(", profiles=").append(profiles);
        sb.append(", com.thebrodyaga.vkobjects.groups=").append(groups);
        sb.append('}');
        return sb.toString();
    }
}
