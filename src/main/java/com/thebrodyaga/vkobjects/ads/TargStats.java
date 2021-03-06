package com.thebrodyaga.vkobjects.ads;



import java.util.Objects;

/**
 * TargStats object
 */
public class TargStats {
    /**
     * Audience
     */

    private Integer audienceCount;

    /**
     * Recommended CPC value
     */

    private Float recommendedCpc;

    /**
     * Recommended CPM value
     */

    private Float recommendedCpm;

    public Integer getAudienceCount() {
        return audienceCount;
    }

    public Float getRecommendedCpc() {
        return recommendedCpc;
    }

    public Float getRecommendedCpm() {
        return recommendedCpm;
    }

    @Override
    public int hashCode() {
        return Objects.hash(recommendedCpm, audienceCount, recommendedCpc);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TargStats targStats = (TargStats) o;
        return Objects.equals(audienceCount, targStats.audienceCount) &&
                Objects.equals(recommendedCpc, targStats.recommendedCpc) &&
                Objects.equals(recommendedCpm, targStats.recommendedCpm);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("TargStats{");
        sb.append("audienceCount=").append(audienceCount);
        sb.append(", recommendedCpc=").append(recommendedCpc);
        sb.append(", recommendedCpm=").append(recommendedCpm);
        sb.append('}');
        return sb.toString();
    }
}
