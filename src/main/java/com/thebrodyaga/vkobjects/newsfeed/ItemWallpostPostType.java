package com.thebrodyaga.vkobjects.newsfeed;



/**
 * Post type
 */
public enum ItemWallpostPostType {

    POST("post"),


    COPY("copy"),


    REPLY("reply");

    private final String value;

    ItemWallpostPostType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
