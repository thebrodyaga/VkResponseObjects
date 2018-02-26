package com.thebrodyaga.vkobjects.messages;


import com.thebrodyaga.vkobjects.audio.AudioFull;
import com.thebrodyaga.vkobjects.base.Link;
import com.thebrodyaga.vkobjects.base.Sticker;
import com.thebrodyaga.vkobjects.docs.Doc;
import com.thebrodyaga.vkobjects.gifts.Layout;
import com.thebrodyaga.vkobjects.market.MarketAlbum;
import com.thebrodyaga.vkobjects.market.MarketItem;
import com.thebrodyaga.vkobjects.photos.Photo;
import com.thebrodyaga.vkobjects.video.Video;
import com.thebrodyaga.vkobjects.wall.WallComment;
import com.thebrodyaga.vkobjects.wall.WallpostAttached;

import java.util.Objects;

/**
 * MessageAttachment object
 */
public class MessageAttachment {

    private Photo photo;


    private AudioFull audio;


    private Video video;


    private Doc doc;


    private Link link;


    private MarketItem market;


    private MarketAlbum marketMarketAlbum;


    private Layout gift;


    private Sticker sticker;


    private WallpostAttached wall;


    private WallComment wallReply;

    /**
     * Attachment type
     */

    private MessageAttachmentType type;

    public Photo getPhoto() {
        return photo;
    }

    public AudioFull getAudio() {
        return audio;
    }

    public Video getVideo() {
        return video;
    }

    public Doc getDoc() {
        return doc;
    }

    public Link getLink() {
        return link;
    }

    public MarketItem getMarket() {
        return market;
    }

    public MarketAlbum getMarketMarketAlbum() {
        return marketMarketAlbum;
    }

    public Layout getGift() {
        return gift;
    }

    public Sticker getSticker() {
        return sticker;
    }

    public WallpostAttached getWall() {
        return wall;
    }

    public WallComment getWallReply() {
        return wallReply;
    }

    public MessageAttachmentType getType() {
        return type;
    }

    @Override
    public int hashCode() {
        return Objects.hash(market, gift, wallReply, marketMarketAlbum, link, sticker, photo, doc, audio, video, type, wall);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MessageAttachment messageAttachment = (MessageAttachment) o;
        return Objects.equals(photo, messageAttachment.photo) &&
                Objects.equals(audio, messageAttachment.audio) &&
                Objects.equals(video, messageAttachment.video) &&
                Objects.equals(doc, messageAttachment.doc) &&
                Objects.equals(link, messageAttachment.link) &&
                Objects.equals(market, messageAttachment.market) &&
                Objects.equals(marketMarketAlbum, messageAttachment.marketMarketAlbum) &&
                Objects.equals(gift, messageAttachment.gift) &&
                Objects.equals(sticker, messageAttachment.sticker) &&
                Objects.equals(wall, messageAttachment.wall) &&
                Objects.equals(wallReply, messageAttachment.wallReply) &&
                Objects.equals(type, messageAttachment.type);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("MessageAttachment{");
        sb.append("photo=").append(photo);
        sb.append(", com.thebrodyaga.vkobjects.audio=").append(audio);
        sb.append(", com.thebrodyaga.vkobjects.video=").append(video);
        sb.append(", doc=").append(doc);
        sb.append(", link=").append(link);
        sb.append(", com.thebrodyaga.vkobjects.market=").append(market);
        sb.append(", marketMarketAlbum=").append(marketMarketAlbum);
        sb.append(", gift=").append(gift);
        sb.append(", sticker=").append(sticker);
        sb.append(", com.thebrodyaga.vkobjects.wall=").append(wall);
        sb.append(", wallReply=").append(wallReply);
        sb.append(", type='").append(type).append("'");
        sb.append('}');
        return sb.toString();
    }
}
