package com.thebrodyaga.vkobjects.groups;



/**
 * Main section of community
 */
public enum GroupFullMainSection {

    ABSENT(0),


    PHOTOS(1),


    TOPICS(2),


    AUDIO(3),


    VIDEO(4),


    MARKET(5);

    private final Integer value;

    GroupFullMainSection(Integer value) {
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }
}
