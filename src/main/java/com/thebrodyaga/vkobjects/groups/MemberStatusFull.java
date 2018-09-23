package com.thebrodyaga.vkobjects.groups;




import java.util.Objects;

/**
 * MemberStatusFull object
 */
public class MemberStatusFull {
    /**
     * Information whether user is a member of the group
     */

    private Boolean member;

    /**
     * User ID
     */

    private Integer userId;

    /**
     * Information whether user has been invited to the group
     */

    private Boolean invitation;

    /**
     * Information whether user has send request to the group
     */

    private Boolean request;

    public boolean isMember() {
        return member;
    }

    public Integer getUserId() {
        return userId;
    }

    public boolean isInvitation() {
        return invitation;
    }

    public boolean isRequest() {
        return request;
    }

    @Override
    public int hashCode() {
        return Objects.hash(request, invitation, member, userId);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MemberStatusFull memberStatusFull = (MemberStatusFull) o;
        return Objects.equals(member, memberStatusFull.member) &&
                Objects.equals(userId, memberStatusFull.userId) &&
                Objects.equals(invitation, memberStatusFull.invitation) &&
                Objects.equals(request, memberStatusFull.request);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("MemberStatusFull{");
        sb.append("member=").append(member);
        sb.append(", userId=").append(userId);
        sb.append(", invitation=").append(invitation);
        sb.append(", request=").append(request);
        sb.append('}');
        return sb.toString();
    }
}
