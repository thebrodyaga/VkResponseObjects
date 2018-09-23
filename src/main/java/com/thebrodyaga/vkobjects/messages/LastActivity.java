package com.thebrodyaga.vkobjects.messages;




import java.util.Objects;

/**
 * LastActivity object
 */
public class LastActivity {
    /**
     * Information whether user is online
     */

    private Boolean online;

    /**
     * Time when user was online in Unixtime
     */

    private Integer time;

    public boolean isOnline() {
        return online;
    }

    public Integer getTime() {
        return time;
    }

    @Override
    public int hashCode() {
        return Objects.hash(online, time);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LastActivity lastActivity = (LastActivity) o;
        return Objects.equals(online, lastActivity.online) &&
                Objects.equals(time, lastActivity.time);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("LastActivity{");
        sb.append("online=").append(online);
        sb.append(", time=").append(time);
        sb.append('}');
        return sb.toString();
    }
}
