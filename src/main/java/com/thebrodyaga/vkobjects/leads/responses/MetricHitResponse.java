package com.thebrodyaga.vkobjects.leads.responses;



import java.util.Objects;

/**
 * MetricHitResponse object
 */
public class MetricHitResponse {
    /**
     * Information whether request has been processed successfully
     */

    private Boolean result;

    /**
     * Redirect link
     */

    private String redirectLink;

    public Boolean getResult() {
        return result;
    }

    public String getRedirectLink() {
        return redirectLink;
    }

    @Override
    public int hashCode() {
        return Objects.hash(result, redirectLink);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MetricHitResponse metricHitResponse = (MetricHitResponse) o;
        return Objects.equals(result, metricHitResponse.result) &&
                Objects.equals(redirectLink, metricHitResponse.redirectLink);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("MetricHitResponse{");
        sb.append("result=").append(result);
        sb.append(", redirectLink='").append(redirectLink).append("'");
        sb.append('}');
        return sb.toString();
    }
}
