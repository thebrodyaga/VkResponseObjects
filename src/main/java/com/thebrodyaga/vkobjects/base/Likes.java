package com.thebrodyaga.vkobjects.base;



import java.util.Objects;

/**
 * Likes object
 */
public class Likes {
    /**
     * Information whether current user com.thebrodyaga.vkobjects.likes the photo
     */

    private Boolean userLikes;

    /**
     * Likes number
     */

    private Integer count;

    public boolean isUserLikes() {
        return userLikes;
    }

    public Integer getCount() {
        return count;
    }

    @Override
    public int hashCode() {
        return Objects.hash(count, userLikes);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Likes likes = (Likes) o;
        return Objects.equals(userLikes, likes.userLikes) &&
                Objects.equals(count, likes.count);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Likes{");
        sb.append("userLikes=").append(userLikes);
        sb.append(", count=").append(count);
        sb.append('}');
        return sb.toString();
    }
}
