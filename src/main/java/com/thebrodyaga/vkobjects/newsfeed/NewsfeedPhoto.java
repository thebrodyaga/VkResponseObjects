package com.thebrodyaga.vkobjects.newsfeed;


import com.thebrodyaga.vkobjects.base.BaseCount;

import com.thebrodyaga.vkobjects.base.Likes;
import com.thebrodyaga.vkobjects.photos.Photo;

import java.util.Objects;

/**
 * NewsfeedPhoto object
 */
public class NewsfeedPhoto extends Photo {


    private Likes likes;


    private BaseCount comments;

    /**
     * Information whether current user can comment the photo
     */

    private Boolean canComment;

    /**
     * Information whether current user can repost the photo
     */

    private Boolean canRepost;

    public Likes getLikes() {
        return likes;
    }

    public BaseCount getComments() {
        return comments;
    }

    public boolean canComment() {
        return canComment;
    }

    public boolean canRepost() {
        return canRepost;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), comments, canRepost, canComment, likes);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        NewsfeedPhoto newsfeedPhoto = (NewsfeedPhoto) o;
        return Objects.equals(likes, newsfeedPhoto.likes) &&
                Objects.equals(comments, newsfeedPhoto.comments) &&
                Objects.equals(canComment, newsfeedPhoto.canComment) &&
                Objects.equals(canRepost, newsfeedPhoto.canRepost);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("NewsfeedPhoto{");
        sb.append("accessKey='").append(getAccessKey()).append('\'');
        sb.append(", albumId=").append(getAlbumId());
        sb.append(", canComment=").append(canComment);
        sb.append(", canRepost=").append(canRepost);
        sb.append(", comments=").append(comments);
        sb.append(", date=").append(getDate());
        sb.append(", height=").append(getHeight());
        sb.append(", id=").append(getId());
        sb.append(", lat=").append(getLat());
        sb.append(", com.thebrodyaga.vkobjects.likes=").append(likes);
        sb.append(", lng=").append(getLng());
        sb.append(", ownerId=").append(getOwnerId());
        sb.append(", photo1280='").append(getPhoto1280()).append('\'');
        sb.append(", photo130='").append(getPhoto130()).append('\'');
        sb.append(", photo2560='").append(getPhoto2560()).append('\'');
        sb.append(", photo604='").append(getPhoto604()).append('\'');
        sb.append(", photo75='").append(getPhoto75()).append('\'');
        sb.append(", photo807='").append(getPhoto807()).append('\'');
        sb.append(", postId=").append(getPostId());
        sb.append(", sizes=").append(getSizes());
        sb.append(", text='").append(getText()).append('\'');
        sb.append(", userId=").append(getUserId());
        sb.append(", width=").append(getWidth());
        sb.append('}');
        return sb.toString();
    }
}
