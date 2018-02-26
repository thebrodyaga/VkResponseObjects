package com.thebrodyaga.vkobjects.wall;



/**
 * Type of post source
 */
public enum PostSourceType {

    VK("vk"),


    WIDGET("widget"),


    API("api"),


    RSS("rss"),


    SMS("sms");

    private final String value;

    PostSourceType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
