package com.thebrodyaga.vkobjects.search;



/**
 * Section title
 */
public enum HintSection {

    GROUPS("groups"),


    EVENTS("events"),


    PUBLICS("publics"),


    CORRESPONDENTS("correspondents"),


    PEOPLE("people"),


    FRIENDS("friends"),


    MUTUAL_FRIENDS("mutual_friends");

    private final String value;

    HintSection(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
