package com.thebrodyaga.vkobjects.widgets;



/**
 * Media type
 */
public enum CommentMediaType {

    AUDIO("audio"),


    PHOTO("photo"),


    VIDEO("video");

    private final String value;

    CommentMediaType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
