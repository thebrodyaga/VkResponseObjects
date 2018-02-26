package com.thebrodyaga.vkobjects.ads;



import java.util.Objects;

/**
 * StatsFormat object
 */
public class StatsFormat {
    /**
     * Day as YYYY-MM-DD
     */

    private String day;

    /**
     * Month as YYYY-MM
     */

    private String month;

    /**
     * 1 if period=overall
     */

    private Integer overall;

    /**
     * Spent funds
     */

    private Integer spent;

    /**
     * Impressions number
     */

    private Integer impressions;

    /**
     * Clicks number
     */

    private Integer clicks;

    /**
     * Reach
     */

    private Integer reach;

    /**
     * Video views number
     */

    private Integer videoViews;

    /**
     * Video views (half of com.thebrodyaga.vkobjects.video)
     */

    private Integer videoViewsHalf;

    /**
     * Video views (full com.thebrodyaga.vkobjects.video)
     */

    private Integer videoViewsFull;

    /**
     * Clickthoughs to the advertised site
     */

    private Integer videoClicksSite;

    /**
     * Events number
     */

    private Integer joinRate;

    public String getDay() {
        return day;
    }

    public String getMonth() {
        return month;
    }

    public Integer getOverall() {
        return overall;
    }

    public Integer getSpent() {
        return spent;
    }

    public Integer getImpressions() {
        return impressions;
    }

    public Integer getClicks() {
        return clicks;
    }

    public Integer getReach() {
        return reach;
    }

    public Integer getVideoViews() {
        return videoViews;
    }

    public Integer getVideoViewsHalf() {
        return videoViewsHalf;
    }

    public Integer getVideoViewsFull() {
        return videoViewsFull;
    }

    public Integer getVideoClicksSite() {
        return videoClicksSite;
    }

    public Integer getJoinRate() {
        return joinRate;
    }

    @Override
    public int hashCode() {
        return Objects.hash(videoViewsHalf, month, reach, videoViewsFull, spent, overall, clicks, videoClicksSite, impressions, joinRate, day, videoViews);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StatsFormat statsFormat = (StatsFormat) o;
        return Objects.equals(day, statsFormat.day) &&
                Objects.equals(month, statsFormat.month) &&
                Objects.equals(overall, statsFormat.overall) &&
                Objects.equals(spent, statsFormat.spent) &&
                Objects.equals(impressions, statsFormat.impressions) &&
                Objects.equals(clicks, statsFormat.clicks) &&
                Objects.equals(reach, statsFormat.reach) &&
                Objects.equals(videoViews, statsFormat.videoViews) &&
                Objects.equals(videoViewsHalf, statsFormat.videoViewsHalf) &&
                Objects.equals(videoViewsFull, statsFormat.videoViewsFull) &&
                Objects.equals(videoClicksSite, statsFormat.videoClicksSite) &&
                Objects.equals(joinRate, statsFormat.joinRate);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("StatsFormat{");
        sb.append("day='").append(day).append("'");
        sb.append(", month='").append(month).append("'");
        sb.append(", overall=").append(overall);
        sb.append(", spent=").append(spent);
        sb.append(", impressions=").append(impressions);
        sb.append(", clicks=").append(clicks);
        sb.append(", reach=").append(reach);
        sb.append(", videoViews=").append(videoViews);
        sb.append(", videoViewsHalf=").append(videoViewsHalf);
        sb.append(", videoViewsFull=").append(videoViewsFull);
        sb.append(", videoClicksSite=").append(videoClicksSite);
        sb.append(", joinRate=").append(joinRate);
        sb.append('}');
        return sb.toString();
    }
}
