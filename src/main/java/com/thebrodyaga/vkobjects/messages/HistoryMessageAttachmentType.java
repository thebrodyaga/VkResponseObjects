package com.thebrodyaga.vkobjects.messages;



/**
 * Attachments type
 */
public enum HistoryMessageAttachmentType {

    PHOTO("photo"),


    VIDEO("video"),


    AUDIO("audio"),


    DOC("doc"),


    LINK("link"),


    MARKET("market"),


    WALL("wall"),


    SHARE("share");

    private final String value;

    HistoryMessageAttachmentType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
