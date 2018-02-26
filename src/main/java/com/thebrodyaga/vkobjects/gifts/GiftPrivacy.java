package com.thebrodyaga.vkobjects.gifts;



/**
 * Gift privacy
 */
public enum GiftPrivacy {

    NAME_AND_MESSAGE_FOR_ALL(0),


    NAME_FOR_ALL(1),


    NAME_AND_MESSAGE_FOR_RECIPIENT_ONLY(2);

    private final Integer value;

    GiftPrivacy(Integer value) {
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }
}
