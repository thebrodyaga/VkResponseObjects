package com.thebrodyaga.vkobjects.wall;


import com.thebrodyaga.vkobjects.audio.AudioFull;
import com.thebrodyaga.vkobjects.base.Link;
import com.thebrodyaga.vkobjects.docs.Doc;
import com.thebrodyaga.vkobjects.market.MarketAlbum;
import com.thebrodyaga.vkobjects.market.MarketItem;
import com.thebrodyaga.vkobjects.pages.WikipageFull;
import com.thebrodyaga.vkobjects.photos.Photo;
import com.thebrodyaga.vkobjects.photos.PhotoAlbum;
import com.thebrodyaga.vkobjects.polls.Poll;
import com.thebrodyaga.vkobjects.video.Video;

import java.util.List;
import java.util.Objects;

/**
 * WallpostAttachment object
 */
public class WallpostAttachment {

    private Photo photo;


    private PostedPhoto postedPhoto;


    private AudioFull audio;


    private Video video;


    private Doc doc;


    private Link link;


    private Graffiti graffiti;


    private AttachedNote note;


    private AppPost app;


    private Poll poll;


    private WikipageFull page;


    private PhotoAlbum album;


    private List<String> photosList;


    private MarketAlbum marketMarketAlbum;


    private MarketItem market;

    /**
     * Attachment type
     */

    private WallpostAttachmentType type;

    public Photo getPhoto() {
        return photo;
    }

    public PostedPhoto getPostedPhoto() {
        return postedPhoto;
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

    public Graffiti getGraffiti() {
        return graffiti;
    }

    public AttachedNote getNote() {
        return note;
    }

    public AppPost getApp() {
        return app;
    }

    public Poll getPoll() {
        return poll;
    }

    public WikipageFull getPage() {
        return page;
    }

    public PhotoAlbum getAlbum() {
        return album;
    }

    public List<String> getPhotosList() {
        return photosList;
    }

    public MarketAlbum getMarketMarketAlbum() {
        return marketMarketAlbum;
    }

    public MarketItem getMarket() {
        return market;
    }

    public WallpostAttachmentType getType() {
        return type;
    }

    @Override
    public int hashCode() {
        return Objects.hash(app, note, marketMarketAlbum, album, link, photo, video, poll, type, postedPhoto, market, doc, photosList, graffiti, audio, page);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WallpostAttachment wallpostAttachment = (WallpostAttachment) o;
        return Objects.equals(photo, wallpostAttachment.photo) &&
                Objects.equals(postedPhoto, wallpostAttachment.postedPhoto) &&
                Objects.equals(audio, wallpostAttachment.audio) &&
                Objects.equals(video, wallpostAttachment.video) &&
                Objects.equals(doc, wallpostAttachment.doc) &&
                Objects.equals(link, wallpostAttachment.link) &&
                Objects.equals(graffiti, wallpostAttachment.graffiti) &&
                Objects.equals(note, wallpostAttachment.note) &&
                Objects.equals(app, wallpostAttachment.app) &&
                Objects.equals(poll, wallpostAttachment.poll) &&
                Objects.equals(page, wallpostAttachment.page) &&
                Objects.equals(album, wallpostAttachment.album) &&
                Objects.equals(photosList, wallpostAttachment.photosList) &&
                Objects.equals(marketMarketAlbum, wallpostAttachment.marketMarketAlbum) &&
                Objects.equals(market, wallpostAttachment.market) &&
                Objects.equals(type, wallpostAttachment.type);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("WallpostAttachment{");
        sb.append("photo=").append(photo);
        sb.append(", postedPhoto=").append(postedPhoto);
        sb.append(", com.thebrodyaga.vkobjects.audio=").append(audio);
        sb.append(", com.thebrodyaga.vkobjects.video=").append(video);
        sb.append(", doc=").append(doc);
        sb.append(", link=").append(link);
        sb.append(", graffiti=").append(graffiti);
        sb.append(", note=").append(note);
        sb.append(", com.thebrodyaga.vkobjects.app=").append(app);
        sb.append(", poll=").append(poll);
        sb.append(", page=").append(page);
        sb.append(", album=").append(album);
        sb.append(", photosList='").append(photosList).append("'");
        sb.append(", marketMarketAlbum=").append(marketMarketAlbum);
        sb.append(", com.thebrodyaga.vkobjects.market=").append(market);
        sb.append(", type='").append(type).append("'");
        sb.append('}');
        return sb.toString();
    }
}
