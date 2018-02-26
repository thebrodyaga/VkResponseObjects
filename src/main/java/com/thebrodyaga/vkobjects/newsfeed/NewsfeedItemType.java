package com.thebrodyaga.vkobjects.newsfeed;



/**
 * Item type
 */
public enum NewsfeedItemType {

    POST("post"),


    PHOTO("photo"),


    PHOTO_TAG("photo_tag"),


    WALL_PHOTO("wall_photo"),


    FRIEND("friend"),


    NOTE("note"),


    AUDIO("audio"),


    VIDEO("video"),


    TOPIC("topic");

    private final String value;

    NewsfeedItemType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
