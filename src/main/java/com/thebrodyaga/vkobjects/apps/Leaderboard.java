package com.thebrodyaga.vkobjects.apps;



import java.util.Objects;

/**
 * Leaderboard object
 */
public class Leaderboard {
    /**
     * Score number
     */

    private Integer score;

    /**
     * Level
     */

    private Integer level;

    /**
     * Points number
     */

    private Integer points;

    /**
     * User ID
     */

    private Integer userId;

    public Integer getScore() {
        return score;
    }

    public Integer getLevel() {
        return level;
    }

    public Integer getPoints() {
        return points;
    }

    public Integer getUserId() {
        return userId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(score, level, userId, points);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Leaderboard leaderboard = (Leaderboard) o;
        return Objects.equals(score, leaderboard.score) &&
                Objects.equals(level, leaderboard.level) &&
                Objects.equals(points, leaderboard.points) &&
                Objects.equals(userId, leaderboard.userId);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Leaderboard{");
        sb.append("score=").append(score);
        sb.append(", level=").append(level);
        sb.append(", points=").append(points);
        sb.append(", userId=").append(userId);
        sb.append('}');
        return sb.toString();
    }
}
