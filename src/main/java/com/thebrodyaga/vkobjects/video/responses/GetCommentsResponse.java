package com.thebrodyaga.vkobjects.video.responses;


import com.thebrodyaga.vkobjects.groups.GroupFull;
import com.thebrodyaga.vkobjects.users.UserMin;
import com.thebrodyaga.vkobjects.wall.WallComment;

import java.util.List;
import java.util.Objects;

/**
 * GetCommentsResponse object
 */
public class GetCommentsResponse {
    /**
     * Total number
     */

    private Integer count;


    private List<WallComment> items;


    private List<UserMin> profiles;


    private List<GroupFull> groups;

    public Integer getCount() {
        return count;
    }

    public List<WallComment> getItems() {
        return items;
    }

    public List<UserMin> getProfiles() {
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
        GetCommentsResponse getCommentsResponse = (GetCommentsResponse) o;
        return Objects.equals(count, getCommentsResponse.count) &&
                Objects.equals(items, getCommentsResponse.items) &&
                Objects.equals(profiles, getCommentsResponse.profiles) &&
                Objects.equals(groups, getCommentsResponse.groups);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("GetCommentsResponse{");
        sb.append("count=").append(count);
        sb.append(", items=").append(items);
        sb.append(", profiles=").append(profiles);
        sb.append(", com.thebrodyaga.vkobjects.groups=").append(groups);
        sb.append('}');
        return sb.toString();
    }
}
