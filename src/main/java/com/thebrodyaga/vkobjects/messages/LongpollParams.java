package com.thebrodyaga.vkobjects.messages;



import java.util.Objects;

/**
 * LongpollParams object
 */
public class LongpollParams {
    /**
     * Key
     */

    private String key;

    /**
     * Server URL
     */

    private String server;

    /**
     * Timestamp
     */

    private Integer ts;

    /**
     * PTS
     */

    private Integer pts;

    public String getKey() {
        return key;
    }

    public String getServer() {
        return server;
    }

    public Integer getTs() {
        return ts;
    }

    public Integer getPts() {
        return pts;
    }

    @Override
    public int hashCode() {
        return Objects.hash(server, key, ts, pts);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LongpollParams longpollParams = (LongpollParams) o;
        return Objects.equals(key, longpollParams.key) &&
                Objects.equals(server, longpollParams.server) &&
                Objects.equals(ts, longpollParams.ts) &&
                Objects.equals(pts, longpollParams.pts);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("LongpollParams{");
        sb.append("key='").append(key).append("'");
        sb.append(", server='").append(server).append("'");
        sb.append(", ts=").append(ts);
        sb.append(", pts=").append(pts);
        sb.append('}');
        return sb.toString();
    }
}
