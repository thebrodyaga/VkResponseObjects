package com.thebrodyaga.vkobjects.wall;


import com.thebrodyaga.vkobjects.base.LikesInfo;

import java.util.List;
import java.util.Objects;

/**
 * WallComment object
 */
public class WallComment {
    /**
     * Comment ID
     */

    private Integer id;

    /**
     * Author ID
     */

    private Integer fromId;

    /**
     * Date when the comment has been added in Unixtime
     */

    private Integer date;

    /**
     * Comment text
     */

    private String text;

    /**
     * Likes
     */

    private LikesInfo likes;

    /**
     * Replied user ID
     */

    private Integer replyToUser;

    /**
     * Replied comment ID
     */

    private Integer replyToComment;

    /**
     * Comment attachments
     */

    private List<CommentAttachment> attachments;

    /**
     * Real position of the comment
     */

    private Integer realOffset;

    public Integer getId() {
        return id;
    }

    public Integer getFromId() {
        return fromId;
    }

    public Integer getDate() {
        return date;
    }

    public String getText() {
        return text;
    }

    public LikesInfo getLikes() {
        return likes;
    }

    public Integer getReplyToUser() {
        return replyToUser;
    }

    public Integer getReplyToComment() {
        return replyToComment;
    }

    public List<CommentAttachment> getAttachments() {
        return attachments;
    }

    public Integer getRealOffset() {
        return realOffset;
    }

    @Override
    public int hashCode() {
        return Objects.hash(date, realOffset, attachments, id, text, fromId, replyToUser, replyToComment, likes);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WallComment wallComment = (WallComment) o;
        return Objects.equals(id, wallComment.id) &&
                Objects.equals(fromId, wallComment.fromId) &&
                Objects.equals(date, wallComment.date) &&
                Objects.equals(text, wallComment.text) &&
                Objects.equals(likes, wallComment.likes) &&
                Objects.equals(replyToUser, wallComment.replyToUser) &&
                Objects.equals(replyToComment, wallComment.replyToComment) &&
                Objects.equals(attachments, wallComment.attachments) &&
                Objects.equals(realOffset, wallComment.realOffset);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("WallComment{");
        sb.append("id=").append(id);
        sb.append(", fromId=").append(fromId);
        sb.append(", date=").append(date);
        sb.append(", text='").append(text).append("'");
        sb.append(", com.thebrodyaga.vkobjects.likes=").append(likes);
        sb.append(", replyToUser=").append(replyToUser);
        sb.append(", replyToComment=").append(replyToComment);
        sb.append(", attachments=").append(attachments);
        sb.append(", realOffset=").append(realOffset);
        sb.append('}');
        return sb.toString();
    }
}
