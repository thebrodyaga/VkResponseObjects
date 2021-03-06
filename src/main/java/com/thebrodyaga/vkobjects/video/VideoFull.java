package com.thebrodyaga.vkobjects.video;



import com.thebrodyaga.vkobjects.base.Likes;

import java.util.List;
import java.util.Objects;

/**
 * VideoFull object
 */
public class VideoFull {
    /**
     * Video ID
     */

    private Integer id;

    /**
     * Video owner ID
     */

    private Integer ownerId;

    /**
     * Video title
     */

    private String title;

    /**
     * Video duration in seconds
     */

    private Integer duration;

    /**
     * Video description
     */

    private String description;

    /**
     * Date when com.thebrodyaga.vkobjects.video has been uploaded in Unixtime
     */

    private Integer date;

    /**
     * Number of views
     */

    private Integer views;

    /**
     * Number of comments
     */

    private Integer comments;

    /**
     * URL of the preview image with 130 px in width
     */

    private String photo130;

    /**
     * URL of the preview image with 320 px in width
     */

    private String photo320;

    /**
     * URL of the preview image with 800 px in width
     */

    private String photo800;

    /**
     * Video access key
     */

    private String accessKey;

    /**
     * Date when the com.thebrodyaga.vkobjects.video has been added in Unixtime
     */

    private Integer addingDate;

    /**
     * URL of the page with a player that can be used to play the com.thebrodyaga.vkobjects.video in the browser.
     */

    private String player;

    /**
     * Information whether current user can edit the com.thebrodyaga.vkobjects.video
     */

    private Boolean canEdit;

    /**
     * Information whether current user can add the com.thebrodyaga.vkobjects.video
     */

    private Boolean canAdd;

    /**
     * Returns if the com.thebrodyaga.vkobjects.video is processing
     */

    private Boolean processing;

    /**
     * Returns if the com.thebrodyaga.vkobjects.video is live translation
     */

    private Boolean live;


    private VideoFiles files;


    private List<String> privacyView;


    private List<String> privacyComment;

    /**
     * Information whether current user can comment the com.thebrodyaga.vkobjects.video
     */

    private Boolean canComment;

    /**
     * Information whether current user can comment the com.thebrodyaga.vkobjects.video
     */

    private Boolean canRepost;


    private Likes likes;

    /**
     * Information whether the com.thebrodyaga.vkobjects.video is repeated
     */

    private Boolean repeat;

    public Integer getId() {
        return id;
    }

    public Integer getOwnerId() {
        return ownerId;
    }

    public String getTitle() {
        return title;
    }

    public Integer getDuration() {
        return duration;
    }

    public String getDescription() {
        return description;
    }

    public Integer getDate() {
        return date;
    }

    public Integer getViews() {
        return views;
    }

    public Integer getComments() {
        return comments;
    }

    public String getPhoto130() {
        return photo130;
    }

    public String getPhoto320() {
        return photo320;
    }

    public String getPhoto800() {
        return photo800;
    }

    public String getAccessKey() {
        return accessKey;
    }

    public Integer getAddingDate() {
        return addingDate;
    }

    public String getPlayer() {
        return player;
    }

    public boolean canEdit() {
        return canEdit;
    }

    public boolean canAdd() {
        return canAdd;
    }

    public boolean isProcessing() {
        return processing ;
    }

    public boolean isLive() {
        return live ;
    }

    public VideoFiles getFiles() {
        return files;
    }

    public List<String> getPrivacyView() {
        return privacyView;
    }

    public List<String> getPrivacyComment() {
        return privacyComment;
    }

    public boolean canComment() {
        return canComment;
    }

    public boolean canRepost() {
        return canRepost;
    }

    public Likes getLikes() {
        return likes;
    }

    public boolean isRepeat() {
        return repeat;
    }

    @Override
    public int hashCode() {
        return Objects.hash(date, canEdit, canAdd, privacyComment, description, ownerId, title, photo800, duration, privacyView, photo130, repeat, id, canComment, addingDate, views, live, player, likes, comments, canRepost, photo320, accessKey, processing, files);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VideoFull videoFull = (VideoFull) o;
        return Objects.equals(id, videoFull.id) &&
                Objects.equals(ownerId, videoFull.ownerId) &&
                Objects.equals(title, videoFull.title) &&
                Objects.equals(duration, videoFull.duration) &&
                Objects.equals(description, videoFull.description) &&
                Objects.equals(date, videoFull.date) &&
                Objects.equals(views, videoFull.views) &&
                Objects.equals(comments, videoFull.comments) &&
                Objects.equals(photo130, videoFull.photo130) &&
                Objects.equals(photo320, videoFull.photo320) &&
                Objects.equals(photo800, videoFull.photo800) &&
                Objects.equals(accessKey, videoFull.accessKey) &&
                Objects.equals(addingDate, videoFull.addingDate) &&
                Objects.equals(player, videoFull.player) &&
                Objects.equals(canEdit, videoFull.canEdit) &&
                Objects.equals(canAdd, videoFull.canAdd) &&
                Objects.equals(processing, videoFull.processing) &&
                Objects.equals(live, videoFull.live) &&
                Objects.equals(files, videoFull.files) &&
                Objects.equals(privacyView, videoFull.privacyView) &&
                Objects.equals(privacyComment, videoFull.privacyComment) &&
                Objects.equals(canComment, videoFull.canComment) &&
                Objects.equals(canRepost, videoFull.canRepost) &&
                Objects.equals(likes, videoFull.likes) &&
                Objects.equals(repeat, videoFull.repeat);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("VideoFull{");
        sb.append("id=").append(id);
        sb.append(", ownerId=").append(ownerId);
        sb.append(", title='").append(title).append("'");
        sb.append(", duration=").append(duration);
        sb.append(", description='").append(description).append("'");
        sb.append(", date=").append(date);
        sb.append(", views=").append(views);
        sb.append(", comments=").append(comments);
        sb.append(", photo130='").append(photo130).append("'");
        sb.append(", photo320='").append(photo320).append("'");
        sb.append(", photo800='").append(photo800).append("'");
        sb.append(", accessKey='").append(accessKey).append("'");
        sb.append(", addingDate=").append(addingDate);
        sb.append(", player='").append(player).append("'");
        sb.append(", canEdit=").append(canEdit);
        sb.append(", canAdd=").append(canAdd);
        sb.append(", processing=").append(processing);
        sb.append(", live=").append(live);
        sb.append(", files=").append(files);
        sb.append(", privacyView='").append(privacyView).append("'");
        sb.append(", privacyComment='").append(privacyComment).append("'");
        sb.append(", canComment=").append(canComment);
        sb.append(", canRepost=").append(canRepost);
        sb.append(", com.thebrodyaga.vkobjects.likes=").append(likes);
        sb.append(", repeat=").append(repeat);
        sb.append('}');
        return sb.toString();
    }
}
