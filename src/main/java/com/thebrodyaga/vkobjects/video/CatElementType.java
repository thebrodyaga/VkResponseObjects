package com.thebrodyaga.vkobjects.video;



/**
 * Element type
 */
public enum CatElementType {

    VIDEO("video"),


    ALBUM("album");

    private final String value;

    CatElementType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
