package com.thebrodyaga.vkobjects.wall;



/**
 * Attachment type
 */
public enum CommentAttachmentType {

    PHOTO("photo"),


    AUDIO("audio"),


    VIDEO("video"),


    DOC("doc"),


    LINK("link"),


    NOTE("note"),


    PAGE("page"),


    MARKET_MARKET_ALBUM("market_market_album"),


    MARKET("market"),


    STICKER("sticker");

    private final String value;

    CommentAttachmentType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
