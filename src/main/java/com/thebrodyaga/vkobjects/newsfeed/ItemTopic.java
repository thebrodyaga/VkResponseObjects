package com.thebrodyaga.vkobjects.newsfeed;


import com.thebrodyaga.vkobjects.base.CommentsInfo;
import com.thebrodyaga.vkobjects.base.LikesInfo;

import java.util.Objects;

/**
 * ItemTopic object
 */
public class ItemTopic {
    /**
     * Topic post ID
     */

    private Integer postId;

    /**
     * Post text
     */

    private String text;


    private CommentsInfo comments;


    private LikesInfo likes;

    public Integer getPostId() {
        return postId;
    }

    public String getText() {
        return text;
    }

    public CommentsInfo getComments() {
        return comments;
    }

    public LikesInfo getLikes() {
        return likes;
    }

    @Override
    public int hashCode() {
        return Objects.hash(comments, postId, text, likes);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ItemTopic itemTopic = (ItemTopic) o;
        return Objects.equals(postId, itemTopic.postId) &&
                Objects.equals(text, itemTopic.text) &&
                Objects.equals(comments, itemTopic.comments) &&
                Objects.equals(likes, itemTopic.likes);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ItemTopic{");
        sb.append("postId=").append(postId);
        sb.append(", text='").append(text).append("'");
        sb.append(", comments=").append(comments);
        sb.append(", com.thebrodyaga.vkobjects.likes=").append(likes);
        sb.append('}');
        return sb.toString();
    }
}
