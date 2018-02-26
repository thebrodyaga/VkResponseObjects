package com.thebrodyaga.vkobjects.messages;



/**
 * Attachment type
 */
public enum MessageAttachmentType {

    PHOTO("photo"),


    AUDIO("audio"),


    VIDEO("video"),


    DOC("doc"),


    LINK("link"),


    MARKET("market"),


    MARKET_MARKET_ALBUM("market_market_album"),


    GIFT("gift"),


    STICKER("sticker"),


    WALL("wall"),


    WALL_REPLY("wall_reply");

    private final String value;

    MessageAttachmentType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
