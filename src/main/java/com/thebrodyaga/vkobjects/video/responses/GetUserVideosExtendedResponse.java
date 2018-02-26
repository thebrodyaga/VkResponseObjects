package com.thebrodyaga.vkobjects.video.responses;


import com.thebrodyaga.vkobjects.groups.GroupFull;
import com.thebrodyaga.vkobjects.users.UserMin;
import com.thebrodyaga.vkobjects.video.Video;

import java.util.List;
import java.util.Objects;

/**
 * GetUserVideosExtendedResponse object
 */
public class GetUserVideosExtendedResponse {
    /**
     * Total number
     */

    private Integer count;


    private List<Video> items;


    private List<UserMin> profiles;


    private List<GroupFull> groups;

    public Integer getCount() {
        return count;
    }

    public List<Video> getItems() {
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
        GetUserVideosExtendedResponse getUserVideosExtendedResponse = (GetUserVideosExtendedResponse) o;
        return Objects.equals(count, getUserVideosExtendedResponse.count) &&
                Objects.equals(items, getUserVideosExtendedResponse.items) &&
                Objects.equals(profiles, getUserVideosExtendedResponse.profiles) &&
                Objects.equals(groups, getUserVideosExtendedResponse.groups);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("GetUserVideosExtendedResponse{");
        sb.append("count=").append(count);
        sb.append(", items=").append(items);
        sb.append(", profiles=").append(profiles);
        sb.append(", com.thebrodyaga.vkobjects.groups=").append(groups);
        sb.append('}');
        return sb.toString();
    }
}
