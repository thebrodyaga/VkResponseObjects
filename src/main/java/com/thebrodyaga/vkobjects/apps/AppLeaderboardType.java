package com.thebrodyaga.vkobjects.apps;



/**
 * Leaderboard type
 */
public enum AppLeaderboardType {

    NOT_SUPPORTED(0),


    LEVELS(1),


    POINTS(2);

    private final Integer value;

    AppLeaderboardType(Integer value) {
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }
}
