package com.thebrodyaga.vkobjects.apps;



/**
 * Application type
 */
public enum AppType {

    APP("app"),


    GAME("game"),


    SITE("site"),


    STANDALONE("standalone");

    private final String value;

    AppType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
