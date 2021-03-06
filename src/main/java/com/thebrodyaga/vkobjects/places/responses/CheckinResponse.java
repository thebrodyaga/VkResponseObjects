package com.thebrodyaga.vkobjects.places.responses;



import java.util.Objects;

/**
 * CheckinResponse object
 */
public class CheckinResponse {
    /**
     * Checkin ID
     */

    private Integer id;

    public Integer getId() {
        return id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CheckinResponse checkinResponse = (CheckinResponse) o;
        return Objects.equals(id, checkinResponse.id);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("CheckinResponse{");
        sb.append("id=").append(id);
        sb.append('}');
        return sb.toString();
    }
}
