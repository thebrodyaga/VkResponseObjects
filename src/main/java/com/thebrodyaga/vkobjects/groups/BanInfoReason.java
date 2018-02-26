package com.thebrodyaga.vkobjects.groups;



/**
 * Ban info reason
 */
public enum BanInfoReason {


    OTHER(0),


    SPAM(1),


    VERBAL_ABUSE(2),


    STRONG_LANGUAGE(3),


    FLOOD(4);

    private final Integer value;

    BanInfoReason(Integer value) {
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }
}
