package com.thebrodyaga.vkobjects.market.responses;



import java.util.Objects;

/**
 * AddResponse object
 */
public class AddResponse {
    /**
     * Item ID
     */

    private Integer marketItemId;

    public Integer getMarketItemId() {
        return marketItemId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(marketItemId);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AddResponse addResponse = (AddResponse) o;
        return Objects.equals(marketItemId, addResponse.marketItemId);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("AddResponse{");
        sb.append("marketItemId=").append(marketItemId);
        sb.append('}');
        return sb.toString();
    }
}
