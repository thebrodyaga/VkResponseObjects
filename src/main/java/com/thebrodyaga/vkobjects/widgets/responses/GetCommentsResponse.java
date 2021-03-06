package com.thebrodyaga.vkobjects.widgets.responses;


import com.thebrodyaga.vkobjects.widgets.WidgetComment;

import java.util.List;
import java.util.Objects;

/**
 * GetCommentsResponse object
 */
public class GetCommentsResponse {
    /**
     * Total number
     */

    private Integer count;


    private List<WidgetComment> posts;

    public Integer getCount() {
        return count;
    }

    public List<WidgetComment> getPosts() {
        return posts;
    }

    @Override
    public int hashCode() {
        return Objects.hash(count, posts);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GetCommentsResponse getCommentsResponse = (GetCommentsResponse) o;
        return Objects.equals(count, getCommentsResponse.count) &&
                Objects.equals(posts, getCommentsResponse.posts);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("GetCommentsResponse{");
        sb.append("count=").append(count);
        sb.append(", posts=").append(posts);
        sb.append('}');
        return sb.toString();
    }
}
