package com.thebrodyaga.vkobjects.friends.responses;



/**
 * Returns 1 if suggestion has been declined
 */
public enum DeleteResponseSuggestionDeleted {

    OK(1);

    private final Integer value;

    DeleteResponseSuggestionDeleted(Integer value) {
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }
}
