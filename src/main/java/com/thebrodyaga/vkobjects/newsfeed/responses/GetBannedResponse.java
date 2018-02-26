package com.thebrodyaga.vkobjects.newsfeed.responses;



import java.util.List;
import java.util.Objects;

/**
 * GetBannedResponse object
 */
public class GetBannedResponse {

    private List<Integer> groups;


    private List<Integer> members;

    public List<Integer> getGroups() {
        return groups;
    }

    public List<Integer> getMembers() {
        return members;
    }

    @Override
    public int hashCode() {
        return Objects.hash(members, groups);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GetBannedResponse getBannedResponse = (GetBannedResponse) o;
        return Objects.equals(groups, getBannedResponse.groups) &&
                Objects.equals(members, getBannedResponse.members);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("GetBannedResponse{");
        sb.append("com.thebrodyaga.vkobjects.groups=").append(groups);
        sb.append(", members=").append(members);
        sb.append('}');
        return sb.toString();
    }
}
