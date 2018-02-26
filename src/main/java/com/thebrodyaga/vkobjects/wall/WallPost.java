package com.thebrodyaga.vkobjects.wall;


import com.thebrodyaga.vkobjects.base.Geo;

import java.util.List;
import java.util.Objects;

/**
 * WallPost object
 */
public class WallPost {
    /**
     * Post ID
     */

    private Integer id;

    /**
     * Post author ID
     */

    private Integer fromId;

    /**
     * Wall owner's ID
     */

    private Integer ownerId;

    /**
     * Date of publishing in Unixtime
     */

    private Integer date;

    /**
     * Count of views
     */

    private Views views;



    private PostType postType;

    /**
     * Post text
     */

    private String text;

    /**
     * Post signer ID
     */

    private Integer signerId;


    private List<WallpostAttachment> attachments;


    private Geo geo;


    private PostSource postSource;

    public Integer getId() {
        return id;
    }

    public Integer getFromId() {
        return fromId;
    }

    public Integer getOwnerId() {
        return ownerId;
    }

    public Integer getDate() {
        return date;
    }

    public Views getViews() {
        return views;
    }

    public PostType getPostType() {
        return postType;
    }

    public String getText() {
        return text;
    }

    public Integer getSignerId() {
        return signerId;
    }

    public List<WallpostAttachment> getAttachments() {
        return attachments;
    }

    public Geo getGeo() {
        return geo;
    }

    public PostSource getPostSource() {
        return postSource;
    }

    @Override
    public int hashCode() {
        return Objects.hash(date, geo, signerId, attachments, postType, postSource, id, text, ownerId, fromId);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WallPost wallPost = (WallPost) o;
        return Objects.equals(id, wallPost.id) &&
                Objects.equals(fromId, wallPost.fromId) &&
                Objects.equals(ownerId, wallPost.ownerId) &&
                Objects.equals(date, wallPost.date) &&
                Objects.equals(views, wallPost.views) &&
                Objects.equals(postType, wallPost.postType) &&
                Objects.equals(text, wallPost.text) &&
                Objects.equals(signerId, wallPost.signerId) &&
                Objects.equals(attachments, wallPost.attachments) &&
                Objects.equals(geo, wallPost.geo) &&
                Objects.equals(postSource, wallPost.postSource);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("WallPost{");
        sb.append("id=").append(id);
        sb.append(", fromId=").append(fromId);
        sb.append(", ownerId=").append(ownerId);
        sb.append(", date=").append(date);
        sb.append(", views=").append(views);
        sb.append(", postType=").append(postType);
        sb.append(", text='").append(text).append("'");
        sb.append(", signerId=").append(signerId);
        sb.append(", attachments=").append(attachments);
        sb.append(", geo=").append(geo);
        sb.append(", postSource=").append(postSource);
        sb.append('}');
        return sb.toString();
    }
}
