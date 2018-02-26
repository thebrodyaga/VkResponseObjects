package com.thebrodyaga.vkobjects.video;



/**
 * Block type
 */
public enum CatBlockType {

    CHANNEL("channel"),


    CATEGORY("category");

    private final String value;

    CatBlockType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
