package com.thebrodyaga.vkobjects.leads;


import com.thebrodyaga.vkobjects.base.BoolInt;
import com.thebrodyaga.vkobjects.base.responses.OkResponse;

import java.util.Objects;

/**
 * Complete object
 */
public class Complete {
    /**
     * Offer limit
     */

    private Integer limit;

    /**
     * Amount of spent votes
     */

    private Integer spent;

    /**
     * Offer cost
     */

    private Integer cost;

    /**
     * Information whether test mode is enabled
     */

    private BoolInt testMode;


    private OkResponse success;

    public Integer getLimit() {
        return limit;
    }

    public Integer getSpent() {
        return spent;
    }

    public Integer getCost() {
        return cost;
    }

    public boolean isTestMode() {
        return testMode == BoolInt.YES;
    }

    public OkResponse getSuccess() {
        return success;
    }

    @Override
    public int hashCode() {
        return Objects.hash(cost, success, spent, testMode, limit);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Complete complete = (Complete) o;
        return Objects.equals(limit, complete.limit) &&
                Objects.equals(spent, complete.spent) &&
                Objects.equals(cost, complete.cost) &&
                Objects.equals(testMode, complete.testMode) &&
                Objects.equals(success, complete.success);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Complete{");
        sb.append("limit=").append(limit);
        sb.append(", spent=").append(spent);
        sb.append(", cost=").append(cost);
        sb.append(", testMode=").append(testMode);
        sb.append(", success=").append(success);
        sb.append('}');
        return sb.toString();
    }
}
