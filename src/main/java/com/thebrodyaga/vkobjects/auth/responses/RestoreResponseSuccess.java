package com.thebrodyaga.vkobjects.auth.responses;



/**
 * 1 if success
 */
public enum RestoreResponseSuccess {

    OK(1);

    private final Integer value;

    RestoreResponseSuccess(Integer value) {
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }
}
