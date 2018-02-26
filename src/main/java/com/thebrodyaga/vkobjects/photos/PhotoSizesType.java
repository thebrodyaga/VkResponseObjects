package com.thebrodyaga.vkobjects.photos;



/**
 * Size type
 */
public enum PhotoSizesType {

    S("s"),


    M("m"),


    X("x"),


    O("o"),


    P("p"),


    Q("q"),


    R("r"),


    Y("y"),


    Z("z"),


    W("w");

    private final String value;

    PhotoSizesType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
