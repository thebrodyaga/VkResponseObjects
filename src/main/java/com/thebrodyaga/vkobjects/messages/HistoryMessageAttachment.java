package com.thebrodyaga.vkobjects.messages;


import com.thebrodyaga.vkobjects.audio.AudioFull;
import com.thebrodyaga.vkobjects.base.Link;
import com.thebrodyaga.vkobjects.docs.Doc;
import com.thebrodyaga.vkobjects.photos.Photo;
import com.thebrodyaga.vkobjects.video.Video;

import java.util.Objects;

/**
 * HistoryMessageAttachment object
 */
public class HistoryMessageAttachment {
    /**
     * Attachments type
     */

    private HistoryMessageAttachmentType type;


    private Photo photo;


    private Video video;


    private AudioFull audio;


    private Doc doc;


    private Link link;


    private Link market;


    private Link wall;


    private Link share;

    public HistoryMessageAttachmentType getType() {
        return type;
    }

    public Photo getPhoto() {
        return photo;
    }

    public Video getVideo() {
        return video;
    }

    public AudioFull getAudio() {
        return audio;
    }

    public Doc getDoc() {
        return doc;
    }

    public Link getLink() {
        return link;
    }

    public Link getMarket() {
        return market;
    }

    public Link getWall() {
        return wall;
    }

    public Link getShare() {
        return share;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HistoryMessageAttachment that = (HistoryMessageAttachment) o;
        return type == that.type &&
                Objects.equals(photo, that.photo) &&
                Objects.equals(video, that.video) &&
                Objects.equals(audio, that.audio) &&
                Objects.equals(doc, that.doc) &&
                Objects.equals(link, that.link) &&
                Objects.equals(market, that.market) &&
                Objects.equals(wall, that.wall) &&
                Objects.equals(share, that.share);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, photo, video, audio, doc, link, market, wall, share);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("HistoryMessageAttachment{");
        sb.append("type=").append(type);
        sb.append(", photo=").append(photo);
        sb.append(", com.thebrodyaga.vkobjects.video=").append(video);
        sb.append(", com.thebrodyaga.vkobjects.audio=").append(audio);
        sb.append(", doc=").append(doc);
        sb.append(", link=").append(link);
        sb.append(", com.thebrodyaga.vkobjects.market=").append(market);
        sb.append(", com.thebrodyaga.vkobjects.wall=").append(wall);
        sb.append(", share=").append(share);
        sb.append('}');
        return sb.toString();
    }
}
