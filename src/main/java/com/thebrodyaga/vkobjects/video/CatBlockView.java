package com.thebrodyaga.vkobjects.video;



/**
 * Type of view
 */
public enum CatBlockView {

    HORIZONTAL("horizontal"),


    HORIZONTAL_COMPACT("horizontal_compact"),


    VERTICAL("vertical"),


    VERTICAL_COMPACT("vertical_compact");

    private final String value;

    CatBlockView(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
