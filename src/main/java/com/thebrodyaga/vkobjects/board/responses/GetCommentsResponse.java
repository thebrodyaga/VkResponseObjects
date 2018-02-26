package com.thebrodyaga.vkobjects.board.responses;


import com.thebrodyaga.vkobjects.board.TopicComment;
import com.thebrodyaga.vkobjects.board.TopicPoll;

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


    private List<TopicComment> items;


    private TopicPoll poll;

    public Integer getCount() {
        return count;
    }

    public List<TopicComment> getItems() {
        return items;
    }

    public TopicPoll getPoll() {
        return poll;
    }

    @Override
    public int hashCode() {
        return Objects.hash(count, poll, items);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GetCommentsResponse getCommentsResponse = (GetCommentsResponse) o;
        return Objects.equals(count, getCommentsResponse.count) &&
                Objects.equals(items, getCommentsResponse.items) &&
                Objects.equals(poll, getCommentsResponse.poll);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("GetCommentsResponse{");
        sb.append("count=").append(count);
        sb.append(", items=").append(items);
        sb.append(", poll=").append(poll);
        sb.append('}');
        return sb.toString();
    }
}
