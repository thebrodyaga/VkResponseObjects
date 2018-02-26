package com.thebrodyaga.vkobjects.widgets;


import com.thebrodyaga.vkobjects.base.LikesInfo;
import com.thebrodyaga.vkobjects.base.RepostsInfo;
import com.thebrodyaga.vkobjects.users.UserFull;
import com.thebrodyaga.vkobjects.wall.CommentAttachment;
import com.thebrodyaga.vkobjects.wall.PostSource;

import java.util.List;
import java.util.Objects;

/**
 * WidgetComment object
 */
public class WidgetComment {
    /**
     * Comment ID
     */

    private Integer id;

    /**
     * Comment author ID
     */

    private Integer fromId;

    /**
     * Wall owner
     */

    private Integer toId;

    /**
     * Date when the comment has been added in Unixtime
     */

    private Integer date;


    private UserFull user;

    /**
     * Post type
     */

    private Integer postType;

    /**
     * Comment text
     */

    private String text;

    /**
     * Information whether current user can delete the comment
     */

    private Integer canDelete;


    private CommentMedia media;


    private List<CommentAttachment> attachments;


    private PostSource postSource;


    private CommentReplies comments;


    private LikesInfo likes;


    private RepostsInfo reposts;

    public Integer getId() {
        return id;
    }

    public Integer getFromId() {
        return fromId;
    }

    public Integer getToId() {
        return toId;
    }

    public Integer getDate() {
        return date;
    }

    public UserFull getUser() {
        return user;
    }

    public Integer getPostType() {
        return postType;
    }

    public String getText() {
        return text;
    }

    public Integer getCanDelete() {
        return canDelete;
    }

    public CommentMedia getMedia() {
        return media;
    }

    public List<CommentAttachment> getAttachments() {
        return attachments;
    }

    public PostSource getPostSource() {
        return postSource;
    }

    public CommentReplies getComments() {
        return comments;
    }

    public LikesInfo getLikes() {
        return likes;
    }

    public RepostsInfo getReposts() {
        return reposts;
    }

    @Override
    public int hashCode() {
        return Objects.hash(toId, date, attachments, comments, postType, postSource, media, fromId, canDelete, id, text, user, reposts, likes);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WidgetComment widgetComment = (WidgetComment) o;
        return Objects.equals(id, widgetComment.id) &&
                Objects.equals(fromId, widgetComment.fromId) &&
                Objects.equals(toId, widgetComment.toId) &&
                Objects.equals(date, widgetComment.date) &&
                Objects.equals(user, widgetComment.user) &&
                Objects.equals(postType, widgetComment.postType) &&
                Objects.equals(text, widgetComment.text) &&
                Objects.equals(canDelete, widgetComment.canDelete) &&
                Objects.equals(media, widgetComment.media) &&
                Objects.equals(attachments, widgetComment.attachments) &&
                Objects.equals(postSource, widgetComment.postSource) &&
                Objects.equals(comments, widgetComment.comments) &&
                Objects.equals(likes, widgetComment.likes) &&
                Objects.equals(reposts, widgetComment.reposts);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("WidgetComment{");
        sb.append("id=").append(id);
        sb.append(", fromId=").append(fromId);
        sb.append(", toId=").append(toId);
        sb.append(", date=").append(date);
        sb.append(", user=").append(user);
        sb.append(", postType=").append(postType);
        sb.append(", text='").append(text).append("'");
        sb.append(", canDelete=").append(canDelete);
        sb.append(", media=").append(media);
        sb.append(", attachments=").append(attachments);
        sb.append(", postSource=").append(postSource);
        sb.append(", comments=").append(comments);
        sb.append(", com.thebrodyaga.vkobjects.likes=").append(likes);
        sb.append(", reposts=").append(reposts);
        sb.append('}');
        return sb.toString();
    }
}
