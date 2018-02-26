package com.thebrodyaga.vkobjects.photos;


import com.thebrodyaga.vkobjects.base.LikesInfo;
import com.thebrodyaga.vkobjects.wall.CommentAttachment;

import java.util.List;
import java.util.Objects;

/**
 * CommentXtrPid object
 */
public class CommentXtrPid {
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


    private LikesInfo likes;

    /**
     * Replied user ID
     */

    private Integer replyToUser;

    /**
     * Replied comment ID
     */

    private Integer replyToComment;


    private List<CommentAttachment> attachments;

    /**
     * Photo ID
     */

    private Integer pid;

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

    public Integer getPid() {
        return pid;
    }

    @Override
    public int hashCode() {
        return Objects.hash(date, attachments, pid, id, text, fromId, replyToUser, replyToComment, likes);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CommentXtrPid commentXtrPid = (CommentXtrPid) o;
        return Objects.equals(id, commentXtrPid.id) &&
                Objects.equals(fromId, commentXtrPid.fromId) &&
                Objects.equals(date, commentXtrPid.date) &&
                Objects.equals(text, commentXtrPid.text) &&
                Objects.equals(likes, commentXtrPid.likes) &&
                Objects.equals(replyToUser, commentXtrPid.replyToUser) &&
                Objects.equals(replyToComment, commentXtrPid.replyToComment) &&
                Objects.equals(attachments, commentXtrPid.attachments) &&
                Objects.equals(pid, commentXtrPid.pid);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("CommentXtrPid{");
        sb.append("id=").append(id);
        sb.append(", fromId=").append(fromId);
        sb.append(", date=").append(date);
        sb.append(", text='").append(text).append("'");
        sb.append(", com.thebrodyaga.vkobjects.likes=").append(likes);
        sb.append(", replyToUser=").append(replyToUser);
        sb.append(", replyToComment=").append(replyToComment);
        sb.append(", attachments=").append(attachments);
        sb.append(", pid=").append(pid);
        sb.append('}');
        return sb.toString();
    }
}
