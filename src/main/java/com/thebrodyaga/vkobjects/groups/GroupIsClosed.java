package com.thebrodyaga.vkobjects.groups;



/**
 * Information whether community is closed
 */
public enum GroupIsClosed {

    OPEN(0),


    CLOSED(1),


    PRIVATE(2);

    private final Integer value;

    GroupIsClosed(Integer value) {
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }
}
