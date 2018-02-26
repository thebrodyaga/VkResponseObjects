package com.thebrodyaga.vkobjects.pages;



public enum PrivacySettings {

    COMMUNITY_MANAGERS_ONLY(0),


    COMMUNITY_MEMBERS_ONLY(1),


    EVERYONE(2);

    private final Integer value;

    PrivacySettings(Integer value) {
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }
}
