package com.thebrodyaga.vkobjects.widgets;


import com.thebrodyaga.vkobjects.users.UserFull;

import java.util.Objects;

/**
 * CommentRepliesItem object
 */
public class CommentRepliesItem {
    /**
     * Comment ID
     */

    private Integer cid;

    /**
     * User ID
     */

    private Integer uid;

    /**
     * Date when the comment has been added in Unixtime
     */

    private Integer date;

    /**
     * Comment text
     */

    private String text;


    private WidgetLikes likes;


    private UserFull user;

    public Integer getCid() {
        return cid;
    }

    public Integer getUid() {
        return uid;
    }

    public Integer getDate() {
        return date;
    }

    public String getText() {
        return text;
    }

    public WidgetLikes getLikes() {
        return likes;
    }

    public UserFull getUser() {
        return user;
    }

    @Override
    public int hashCode() {
        return Objects.hash(date, uid, text, user, cid, likes);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CommentRepliesItem commentRepliesItem = (CommentRepliesItem) o;
        return Objects.equals(cid, commentRepliesItem.cid) &&
                Objects.equals(uid, commentRepliesItem.uid) &&
                Objects.equals(date, commentRepliesItem.date) &&
                Objects.equals(text, commentRepliesItem.text) &&
                Objects.equals(likes, commentRepliesItem.likes) &&
                Objects.equals(user, commentRepliesItem.user);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("CommentRepliesItem{");
        sb.append("cid=").append(cid);
        sb.append(", uid=").append(uid);
        sb.append(", date=").append(date);
        sb.append(", text='").append(text).append("'");
        sb.append(", com.thebrodyaga.vkobjects.likes=").append(likes);
        sb.append(", user=").append(user);
        sb.append('}');
        return sb.toString();
    }
}
