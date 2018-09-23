package com.thebrodyaga.vkobjects.groups.responses;




import java.util.Objects;

/**
 * IsMemberExtendedResponse object
 */
public class IsMemberExtendedResponse {
    /**
     * Information whether user is a member of the group
     */

    private Boolean member;

    /**
     * Information whether user has been invited to the group
     */

    private Boolean invitation;

    /**
     * Information whether user has sent request to the group
     */

    private Boolean request;

    public boolean isMember() {
        return member;
    }

    public boolean isInvitation() {
        return invitation;
    }

    public boolean isRequest() {
        return request;
    }

    @Override
    public int hashCode() {
        return Objects.hash(request, invitation, member);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        IsMemberExtendedResponse isMemberExtendedResponse = (IsMemberExtendedResponse) o;
        return Objects.equals(member, isMemberExtendedResponse.member) &&
                Objects.equals(invitation, isMemberExtendedResponse.invitation) &&
                Objects.equals(request, isMemberExtendedResponse.request);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("IsMemberExtendedResponse{");
        sb.append("member=").append(member);
        sb.append(", invitation=").append(invitation);
        sb.append(", request=").append(request);
        sb.append('}');
        return sb.toString();
    }
}
