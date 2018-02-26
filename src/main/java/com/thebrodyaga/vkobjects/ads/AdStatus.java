package com.thebrodyaga.vkobjects.ads;



/**
 * Ad atatus
 */
public enum AdStatus {

    STOPPED(0),


    STARTED(1),


    DELETED(2);

    private final Integer value;

    AdStatus(Integer value) {
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }
}
