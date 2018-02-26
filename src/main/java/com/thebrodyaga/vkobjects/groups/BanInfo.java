package com.thebrodyaga.vkobjects.groups;



import java.util.Objects;

/**
 * BanInfo object
 */
public class BanInfo {

    /**
     * Administrator ID
     */

    private Integer adminId;

    /**
     * Date when user has been added to blacklist in Unixtime
     */

    private Integer date;

    /**
     * Ban reason
     */

    private BanInfoReason reason;

    /**
     * Comment for a ban
     */

    private String comment;

    /**
     * Date when user will be removed from blacklist in Unixtime
     */

    private Integer endDate;

    public Integer getAdminId() {
        return adminId;
    }

    public Integer getDate() {
        return date;
    }

    public BanInfoReason getReason() {
        return reason;
    }

    public String getComment() {
        return comment;
    }

    public Integer getEndDate() {
        return endDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BanInfo banInfo = (BanInfo) o;
        return Objects.equals(adminId, banInfo.adminId) &&
                Objects.equals(date, banInfo.date) &&
                reason == banInfo.reason &&
                Objects.equals(comment, banInfo.comment) &&
                Objects.equals(endDate, banInfo.endDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(adminId, date, reason, comment, endDate);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("BanInfo{");
        sb.append("adminId=").append(adminId);
        sb.append(", date=").append(date);
        sb.append(", reason=").append(reason);
        sb.append(", comment='").append(comment).append('\'');
        sb.append(", endDate=").append(endDate);
        sb.append('}');
        return sb.toString();
    }
}
