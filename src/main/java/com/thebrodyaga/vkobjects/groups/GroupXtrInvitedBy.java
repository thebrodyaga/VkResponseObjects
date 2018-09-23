package com.thebrodyaga.vkobjects.groups;




import java.util.Objects;

/**
 * GroupXtrInvitedBy object
 */
public class GroupXtrInvitedBy {
    /**
     * Community ID
     */

    private String id;

    /**
     * Community name
     */

    private String name;

    /**
     * Domain of the community page
     */

    private String screenName;

    /**
     * Information whether community is closed
     */

    private Boolean isClosed;

    /**
     * Community type
     */

    private GroupXtrInvitedByType type;

    /**
     * Information whether current user is manager
     */

    private Boolean isAdmin;

    /**
     * Level of current user's credentials as manager
     */

    private GroupXtrInvitedByAdminLevel adminLevel;

    /**
     * Information whether current user is member
     */

    private Boolean isMember;

    /**
     * URL of square photo of the community with 50 pixels in width
     */

    private String photo50;

    /**
     * URL of square photo of the community with 100 pixels in width
     */

    private String photo100;

    /**
     * URL of square photo of the community with 200 pixels in width
     */

    private String photo200;

    /**
     * Inviter ID
     */

    private Integer invitedBy;

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getScreenName() {
        return screenName;
    }

    public boolean isClosed() {
        return isClosed;
    }

    public GroupXtrInvitedByType getType() {
        return type;
    }

    public boolean isAdmin() {
        return isAdmin;
    }

    public GroupXtrInvitedByAdminLevel getAdminLevel() {
        return adminLevel;
    }

    public boolean isMember() {
        return isMember;
    }

    public String getPhoto50() {
        return photo50;
    }

    public String getPhoto100() {
        return photo100;
    }

    public String getPhoto200() {
        return photo200;
    }

    public Integer getInvitedBy() {
        return invitedBy;
    }

    @Override
    public int hashCode() {
        return Objects.hash(invitedBy, isClosed, adminLevel, photo100, name, photo50, id, screenName, isAdmin, isMember, photo200, type);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GroupXtrInvitedBy groupXtrInvitedBy = (GroupXtrInvitedBy) o;
        return Objects.equals(id, groupXtrInvitedBy.id) &&
                Objects.equals(name, groupXtrInvitedBy.name) &&
                Objects.equals(screenName, groupXtrInvitedBy.screenName) &&
                Objects.equals(isClosed, groupXtrInvitedBy.isClosed) &&
                Objects.equals(type, groupXtrInvitedBy.type) &&
                Objects.equals(isAdmin, groupXtrInvitedBy.isAdmin) &&
                Objects.equals(adminLevel, groupXtrInvitedBy.adminLevel) &&
                Objects.equals(isMember, groupXtrInvitedBy.isMember) &&
                Objects.equals(photo50, groupXtrInvitedBy.photo50) &&
                Objects.equals(photo100, groupXtrInvitedBy.photo100) &&
                Objects.equals(photo200, groupXtrInvitedBy.photo200) &&
                Objects.equals(invitedBy, groupXtrInvitedBy.invitedBy);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("GroupXtrInvitedBy{");
        sb.append("id='").append(id).append("'");
        sb.append(", name='").append(name).append("'");
        sb.append(", screenName='").append(screenName).append("'");
        sb.append(", isClosed=").append(isClosed);
        sb.append(", type='").append(type).append("'");
        sb.append(", isAdmin=").append(isAdmin);
        sb.append(", adminLevel=").append(adminLevel);
        sb.append(", isMember=").append(isMember);
        sb.append(", photo50='").append(photo50).append("'");
        sb.append(", photo100='").append(photo100).append("'");
        sb.append(", photo200='").append(photo200).append("'");
        sb.append(", invitedBy=").append(invitedBy);
        sb.append('}');
        return sb.toString();
    }
}
