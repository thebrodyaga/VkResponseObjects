package com.thebrodyaga.vkobjects.groups;



import java.util.Objects;

/**
 * GroupBanInfo object
 */
public class GroupBanInfo {

    /**
     * End date of ban in Unixtime
     */

    private Integer endDate;

    /**
     * Ban comment
     */

    private String comment;


    public Integer getEndDate() {
        return endDate;
    }

    public String getComment() {
        return comment;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GroupBanInfo that = (GroupBanInfo) o;
        return Objects.equals(endDate, that.endDate) &&
                Objects.equals(comment, that.comment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(endDate, comment);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("GroupBanInfo{");
        sb.append("endDate=").append(endDate);
        sb.append(", comment='").append(comment).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
