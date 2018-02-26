package com.thebrodyaga.vkobjects.account;



import java.util.List;
import java.util.Objects;

/**
 * PushParams object
 */
public class PushParams {


    private List<String> msg;


    private List<String> chat;


    private List<OnoffOptions> friend;


    private List<OnoffOptions> friendFound;


    private List<OnoffOptions> friendAccepted;


    private List<OnoffOptions> reply;


    private List<String> comment;


    private List<String> mention;


    private List<String> like;


    private List<String> repost;


    private List<OnoffOptions> wallPost;


    private List<OnoffOptions> wallPublish;


    private List<OnoffOptions> groupInvite;


    private List<OnoffOptions> groupAccepted;


    private List<OnoffOptions> eventSoon;


    private List<String> photosTag;


    private List<OnoffOptions> appRequest;


    private List<OnoffOptions> sdkOpen;


    private List<OnoffOptions> newPost;


    private List<OnoffOptions> birthday;

    public List<String> getMsg() {
        return msg;
    }

    public List<String> getChat() {
        return chat;
    }

    public List<OnoffOptions> getFriend() {
        return friend;
    }

    public List<OnoffOptions> getFriendFound() {
        return friendFound;
    }

    public List<OnoffOptions> getFriendAccepted() {
        return friendAccepted;
    }

    public List<OnoffOptions> getReply() {
        return reply;
    }

    public List<String> getComment() {
        return comment;
    }

    public List<String> getMention() {
        return mention;
    }

    public List<String> getLike() {
        return like;
    }

    public List<String> getRepost() {
        return repost;
    }

    public List<OnoffOptions> getWallPost() {
        return wallPost;
    }

    public List<OnoffOptions> getWallPublish() {
        return wallPublish;
    }

    public List<OnoffOptions> getGroupInvite() {
        return groupInvite;
    }

    public List<OnoffOptions> getGroupAccepted() {
        return groupAccepted;
    }

    public List<OnoffOptions> getEventSoon() {
        return eventSoon;
    }

    public List<String> getPhotosTag() {
        return photosTag;
    }

    public List<OnoffOptions> getAppRequest() {
        return appRequest;
    }

    public List<OnoffOptions> getSdkOpen() {
        return sdkOpen;
    }

    public List<OnoffOptions> getNewPost() {
        return newPost;
    }

    public List<OnoffOptions> getBirthday() {
        return birthday;
    }

    @Override
    public int hashCode() {
        return Objects.hash(msg, birthday, wallPost, groupAccepted, appRequest, friendAccepted, like, eventSoon, mention, wallPublish, chat, groupInvite, friend, friendFound, newPost, comment, photosTag, reply, sdkOpen, repost);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PushParams pushParams = (PushParams) o;
        return Objects.equals(msg, pushParams.msg) &&
                Objects.equals(chat, pushParams.chat) &&
                Objects.equals(friend, pushParams.friend) &&
                Objects.equals(friendFound, pushParams.friendFound) &&
                Objects.equals(friendAccepted, pushParams.friendAccepted) &&
                Objects.equals(reply, pushParams.reply) &&
                Objects.equals(comment, pushParams.comment) &&
                Objects.equals(mention, pushParams.mention) &&
                Objects.equals(like, pushParams.like) &&
                Objects.equals(repost, pushParams.repost) &&
                Objects.equals(wallPost, pushParams.wallPost) &&
                Objects.equals(wallPublish, pushParams.wallPublish) &&
                Objects.equals(groupInvite, pushParams.groupInvite) &&
                Objects.equals(groupAccepted, pushParams.groupAccepted) &&
                Objects.equals(eventSoon, pushParams.eventSoon) &&
                Objects.equals(photosTag, pushParams.photosTag) &&
                Objects.equals(appRequest, pushParams.appRequest) &&
                Objects.equals(sdkOpen, pushParams.sdkOpen) &&
                Objects.equals(newPost, pushParams.newPost) &&
                Objects.equals(birthday, pushParams.birthday);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PushParams{");
        sb.append("msg='").append(msg).append("'");
        sb.append(", chat='").append(chat).append("'");
        sb.append(", friend=").append(friend);
        sb.append(", friendFound=").append(friendFound);
        sb.append(", friendAccepted=").append(friendAccepted);
        sb.append(", reply=").append(reply);
        sb.append(", comment='").append(comment).append("'");
        sb.append(", mention='").append(mention).append("'");
        sb.append(", like='").append(like).append("'");
        sb.append(", repost='").append(repost).append("'");
        sb.append(", wallPost=").append(wallPost);
        sb.append(", wallPublish=").append(wallPublish);
        sb.append(", groupInvite=").append(groupInvite);
        sb.append(", groupAccepted=").append(groupAccepted);
        sb.append(", eventSoon=").append(eventSoon);
        sb.append(", photosTag='").append(photosTag).append("'");
        sb.append(", appRequest=").append(appRequest);
        sb.append(", sdkOpen=").append(sdkOpen);
        sb.append(", newPost=").append(newPost);
        sb.append(", birthday=").append(birthday);
        sb.append('}');
        return sb.toString();
    }
}
