package com.thebrodyaga.vkobjects.wall;



/**
 * Post type
 */
public enum PostType {

    POST("post"),


    COPY("copy"),


    REPLY("reply"),


    POSTPONE("postpone"),


    SUGGEST("suggest");

    private final String value;

    PostType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
