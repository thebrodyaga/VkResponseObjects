package com.thebrodyaga.vkobjects.leads;


import com.thebrodyaga.vkobjects.base.BoolInt;

import java.util.Objects;

/**
 * Entry object
 */
public class Entry {
    /**
     * User ID
     */

    private Integer uid;

    /**
     * Application ID
     */

    private Integer aid;

    /**
     * Session string ID
     */

    private String sid;

    /**
     * Date when the action has been started in Unixtime
     */

    private Integer date;

    /**
     * Action type
     */

    private Integer status;

    /**
     * Information whether test mode is enabled
     */

    private BoolInt testMode;

    /**
     * Start date in Unixtime (for com.thebrodyaga.vkobjects.status=2)
     */

    private Integer startDate;

    /**
     * Comment text
     */

    private String comment;

    public Integer getUid() {
        return uid;
    }

    public Integer getAid() {
        return aid;
    }

    public String getSid() {
        return sid;
    }

    public Integer getDate() {
        return date;
    }

    public Integer getStatus() {
        return status;
    }

    public boolean isTestMode() {
        return testMode == BoolInt.YES;
    }

    public Integer getStartDate() {
        return startDate;
    }

    public String getComment() {
        return comment;
    }

    @Override
    public int hashCode() {
        return Objects.hash(date, uid, testMode, comment, aid, startDate, sid, status);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Entry entry = (Entry) o;
        return Objects.equals(uid, entry.uid) &&
                Objects.equals(aid, entry.aid) &&
                Objects.equals(sid, entry.sid) &&
                Objects.equals(date, entry.date) &&
                Objects.equals(status, entry.status) &&
                Objects.equals(testMode, entry.testMode) &&
                Objects.equals(startDate, entry.startDate) &&
                Objects.equals(comment, entry.comment);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Entry{");
        sb.append("uid=").append(uid);
        sb.append(", aid=").append(aid);
        sb.append(", sid='").append(sid).append("'");
        sb.append(", date=").append(date);
        sb.append(", com.thebrodyaga.vkobjects.status=").append(status);
        sb.append(", testMode=").append(testMode);
        sb.append(", startDate=").append(startDate);
        sb.append(", comment='").append(comment).append("'");
        sb.append('}');
        return sb.toString();
    }
}
