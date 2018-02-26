package com.thebrodyaga.vkobjects.wall;



/**
 * Attachment type
 */
public enum WallpostAttachmentType {

    PHOTO("photo"),


    POSTED_PHOTO("posted_photo"),


    AUDIO("audio"),


    VIDEO("video"),


    DOC("doc"),


    LINK("link"),


    GRAFFITI("graffiti"),


    NOTE("note"),


    APP("app"),


    POLL("poll"),


    PAGE("page"),


    ALBUM("album"),


    PHOTOS_LIST("photos_list"),


    MARKET_MARKET_ALBUM("market_market_album"),


    MARKET("market");

    private final String value;

    WallpostAttachmentType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
