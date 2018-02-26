package com.thebrodyaga.vkobjects.apps.responses;


import com.thebrodyaga.vkobjects.apps.Leaderboard;

import java.util.List;
import java.util.Objects;

/**
 * GetLeaderboardResponse object
 */
public class GetLeaderboardResponse {
    /**
     * Total number
     */

    private Integer count;


    private List<Leaderboard> items;

    public Integer getCount() {
        return count;
    }

    public List<Leaderboard> getItems() {
        return items;
    }

    @Override
    public int hashCode() {
        return Objects.hash(count, items);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GetLeaderboardResponse getLeaderboardResponse = (GetLeaderboardResponse) o;
        return Objects.equals(count, getLeaderboardResponse.count) &&
                Objects.equals(items, getLeaderboardResponse.items);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("GetLeaderboardResponse{");
        sb.append("count=").append(count);
        sb.append(", items=").append(items);
        sb.append('}');
        return sb.toString();
    }
}
