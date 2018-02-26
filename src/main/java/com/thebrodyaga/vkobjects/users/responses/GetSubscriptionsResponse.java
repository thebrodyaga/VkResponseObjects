package com.thebrodyaga.vkobjects.users.responses;


import com.thebrodyaga.vkobjects.groups.GroupsArray;
import com.thebrodyaga.vkobjects.users.UsersArray;

import java.util.Objects;

/**
 * GetSubscriptionsResponse object
 */
public class GetSubscriptionsResponse {

    private UsersArray users;


    private GroupsArray groups;

    public UsersArray getUsers() {
        return users;
    }

    public GroupsArray getGroups() {
        return groups;
    }

    @Override
    public int hashCode() {
        return Objects.hash(groups, users);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GetSubscriptionsResponse getSubscriptionsResponse = (GetSubscriptionsResponse) o;
        return Objects.equals(users, getSubscriptionsResponse.users) &&
                Objects.equals(groups, getSubscriptionsResponse.groups);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("GetSubscriptionsResponse{");
        sb.append("com.thebrodyaga.vkobjects.users=").append(users);
        sb.append(", com.thebrodyaga.vkobjects.groups=").append(groups);
        sb.append('}');
        return sb.toString();
    }
}
