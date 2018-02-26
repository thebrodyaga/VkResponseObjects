package com.thebrodyaga.vkobjects.ads;



/**
 * School type
 */
public enum TargSuggestionsSchoolsType {

    SCHOOL("school"),


    UNIVERSITY("university"),


    FACULTY("faculty"),


    CHAIR("chair");

    private final String value;

    TargSuggestionsSchoolsType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
