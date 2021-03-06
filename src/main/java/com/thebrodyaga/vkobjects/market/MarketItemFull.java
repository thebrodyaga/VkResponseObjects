package com.thebrodyaga.vkobjects.market;



import com.thebrodyaga.vkobjects.base.Likes;
import com.thebrodyaga.vkobjects.photos.Photo;

import java.util.List;
import java.util.Objects;

/**
 * MarketItemFull object
 */
public class MarketItemFull extends MarketItem {

    private List<Photo> photos;

    /**
     * Information whether current use can comment the item
     */

    private Boolean canComment;

    /**
     * Information whether current use can repost the item
     */

    private Boolean canRepost;


    private Likes likes;

    /**
     * Views number
     */

    private Integer viewsCount;

    public List<Photo> getPhotos() {
        return photos;
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

    public Integer getViewsCount() {
        return viewsCount;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), canRepost, viewsCount, canComment, photos, likes);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        MarketItemFull marketItemFull = (MarketItemFull) o;
        return Objects.equals(photos, marketItemFull.photos) &&
                Objects.equals(canComment, marketItemFull.canComment) &&
                Objects.equals(canRepost, marketItemFull.canRepost) &&
                Objects.equals(likes, marketItemFull.likes) &&
                Objects.equals(viewsCount, marketItemFull.viewsCount);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("MarketItemFull{");
        sb.append("availability=").append(getAvailability());
        sb.append(", canComment=").append(canComment);
        sb.append(", canRepost=").append(canRepost);
        sb.append(", category=").append(getCategory());
        sb.append(", date=").append(getDate());
        sb.append(", description='").append(getDescription()).append('\'');
        sb.append(", id=").append(getId());
        sb.append(", com.thebrodyaga.vkobjects.likes=").append(likes);
        sb.append(", ownerId=").append(getOwnerId());
        sb.append(", com.thebrodyaga.vkobjects.photos=").append(photos);
        sb.append(", price=").append(getPrice());
        sb.append(", thumbPhoto='").append(getThumbPhoto()).append('\'');
        sb.append(", title='").append(getTitle()).append('\'');
        sb.append(", viewsCount=").append(viewsCount);
        sb.append('}');
        return sb.toString();
    }
}
