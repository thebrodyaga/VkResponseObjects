package com.thebrodyaga.vkobjects.ads;



/**
 * Sex
 */
public enum CriteriaSex {

    ANY(0),


    MALE(1),


    FEMALE(2);

    private final Integer value;

    CriteriaSex(Integer value) {
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }
}
