package com.thebrodyaga.vkobjects.utils;



/**
 * Object type
 */
public enum DomainResolvedType {

    USER("user"),


    GROUP("group"),


    APPLICATION("application"),


    PAGE("page");

    private final String value;

    DomainResolvedType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
