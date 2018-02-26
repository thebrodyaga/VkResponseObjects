package com.thebrodyaga.vkobjects.photos.responses;


import com.thebrodyaga.vkobjects.groups.GroupFull;
import com.thebrodyaga.vkobjects.users.UserFull;
import com.thebrodyaga.vkobjects.wall.WallComment;

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

    /**
     * Real offset of the comments
     */

    private Integer realOffset;


    private List<WallComment> items;


    private List<UserFull> profiles;


    private List<GroupFull> groups;

    public Integer getCount() {
        return count;
    }

    public Integer getRealOffset() {
        return realOffset;
    }

    public List<WallComment> getItems() {
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
        return Objects.hash(realOffset, count, profiles, groups, items);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GetCommentsExtendedResponse getCommentsExtendedResponse = (GetCommentsExtendedResponse) o;
        return Objects.equals(count, getCommentsExtendedResponse.count) &&
                Objects.equals(realOffset, getCommentsExtendedResponse.realOffset) &&
                Objects.equals(items, getCommentsExtendedResponse.items) &&
                Objects.equals(profiles, getCommentsExtendedResponse.profiles) &&
                Objects.equals(groups, getCommentsExtendedResponse.groups);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("GetCommentsExtendedResponse{");
        sb.append("count=").append(count);
        sb.append(", realOffset=").append(realOffset);
        sb.append(", items=").append(items);
        sb.append(", profiles=").append(profiles);
        sb.append(", com.thebrodyaga.vkobjects.groups=").append(groups);
        sb.append('}');
        return sb.toString();
    }
}
