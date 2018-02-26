package com.thebrodyaga.vkobjects.wall;


import com.thebrodyaga.vkobjects.audio.AudioFull;
import com.thebrodyaga.vkobjects.base.Link;
import com.thebrodyaga.vkobjects.base.Sticker;
import com.thebrodyaga.vkobjects.docs.Doc;
import com.thebrodyaga.vkobjects.market.MarketAlbum;
import com.thebrodyaga.vkobjects.market.MarketItem;
import com.thebrodyaga.vkobjects.pages.WikipageFull;
import com.thebrodyaga.vkobjects.photos.Photo;
import com.thebrodyaga.vkobjects.video.Video;

import java.util.Objects;

/**
 * CommentAttachment object
 */
public class CommentAttachment {

    private Photo photo;


    private AudioFull audio;


    private Video video;


    private Doc doc;


    private Link link;


    private AttachedNote note;


    private WikipageFull page;


    private MarketAlbum marketMarketAlbum;


    private MarketItem market;


    private Sticker sticker;

    /**
     * Attachment type
     */

    private CommentAttachmentType type;

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

    public AttachedNote getNote() {
        return note;
    }

    public WikipageFull getPage() {
        return page;
    }

    public MarketAlbum getMarketMarketAlbum() {
        return marketMarketAlbum;
    }

    public MarketItem getMarket() {
        return market;
    }

    public Sticker getSticker() {
        return sticker;
    }

    public CommentAttachmentType getType() {
        return type;
    }

    @Override
    public int hashCode() {
        return Objects.hash(market, note, marketMarketAlbum, link, sticker, photo, doc, audio, video, page, type);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CommentAttachment commentAttachment = (CommentAttachment) o;
        return Objects.equals(photo, commentAttachment.photo) &&
                Objects.equals(audio, commentAttachment.audio) &&
                Objects.equals(video, commentAttachment.video) &&
                Objects.equals(doc, commentAttachment.doc) &&
                Objects.equals(link, commentAttachment.link) &&
                Objects.equals(note, commentAttachment.note) &&
                Objects.equals(page, commentAttachment.page) &&
                Objects.equals(marketMarketAlbum, commentAttachment.marketMarketAlbum) &&
                Objects.equals(market, commentAttachment.market) &&
                Objects.equals(sticker, commentAttachment.sticker) &&
                Objects.equals(type, commentAttachment.type);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("CommentAttachment{");
        sb.append("photo=").append(photo);
        sb.append(", com.thebrodyaga.vkobjects.audio=").append(audio);
        sb.append(", com.thebrodyaga.vkobjects.video=").append(video);
        sb.append(", doc=").append(doc);
        sb.append(", link=").append(link);
        sb.append(", note=").append(note);
        sb.append(", page=").append(page);
        sb.append(", marketMarketAlbum=").append(marketMarketAlbum);
        sb.append(", com.thebrodyaga.vkobjects.market=").append(market);
        sb.append(", sticker=").append(sticker);
        sb.append(", type='").append(type).append("'");
        sb.append('}');
        return sb.toString();
    }
}
