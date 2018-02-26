package com.thebrodyaga.vkobjects.likes.responses;


import com.thebrodyaga.vkobjects.base.BoolInt;

import java.util.Objects;

/**
 * IsLikedResponse object
 */
public class IsLikedResponse {
    /**
     * Information whether user liked the object
     */

    private BoolInt liked;

    /**
     * Information whether user reposted the object
     */

    private BoolInt copied;

    public boolean isLiked() {
        return liked == BoolInt.YES;
    }

    public boolean isCopied() {
        return copied == BoolInt.YES;
    }

    @Override
    public int hashCode() {
        return Objects.hash(copied, liked);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        IsLikedResponse isLikedResponse = (IsLikedResponse) o;
        return Objects.equals(liked, isLikedResponse.liked) &&
                Objects.equals(copied, isLikedResponse.copied);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("IsLikedResponse{");
        sb.append("liked=").append(liked);
        sb.append(", copied=").append(copied);
        sb.append('}');
        return sb.toString();
    }
}
