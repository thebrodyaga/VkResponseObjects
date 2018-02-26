package com.thebrodyaga.vkobjects.wall.responses;


import com.thebrodyaga.vkobjects.groups.Group;
import com.thebrodyaga.vkobjects.users.User;
import com.thebrodyaga.vkobjects.wall.WallPostFull;

import java.util.List;
import java.util.Objects;

/**
 * GetRepostsResponse object
 */
public class GetRepostsResponse {

    private List<WallPostFull> items;


    private List<User> profiles;


    private List<Group> groups;

    public List<WallPostFull> getItems() {
        return items;
    }

    public List<User> getProfiles() {
        return profiles;
    }

    public List<Group> getGroups() {
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
        GetRepostsResponse getRepostsResponse = (GetRepostsResponse) o;
        return Objects.equals(items, getRepostsResponse.items) &&
                Objects.equals(profiles, getRepostsResponse.profiles) &&
                Objects.equals(groups, getRepostsResponse.groups);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("GetRepostsResponse{");
        sb.append("items=").append(items);
        sb.append(", profiles=").append(profiles);
        sb.append(", com.thebrodyaga.vkobjects.groups=").append(groups);
        sb.append('}');
        return sb.toString();
    }
}
