package com.thebrodyaga.vkobjects.video.responses;


import com.thebrodyaga.vkobjects.groups.GroupFull;
import com.thebrodyaga.vkobjects.users.UserMin;
import com.thebrodyaga.vkobjects.video.VideoFull;

import java.util.List;
import java.util.Objects;

/**
 * GetExtendedResponse object
 */
public class GetExtendedResponse {
    /**
     * Total number
     */

    private Integer count;


    private List<VideoFull> items;


    private List<UserMin> profiles;


    private List<GroupFull> groups;

    public Integer getCount() {
        return count;
    }

    public List<VideoFull> getItems() {
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
        GetExtendedResponse getExtendedResponse = (GetExtendedResponse) o;
        return Objects.equals(count, getExtendedResponse.count) &&
                Objects.equals(items, getExtendedResponse.items) &&
                Objects.equals(profiles, getExtendedResponse.profiles) &&
                Objects.equals(groups, getExtendedResponse.groups);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("GetExtendedResponse{");
        sb.append("count=").append(count);
        sb.append(", items=").append(items);
        sb.append(", profiles=").append(profiles);
        sb.append(", com.thebrodyaga.vkobjects.groups=").append(groups);
        sb.append('}');
        return sb.toString();
    }
}
