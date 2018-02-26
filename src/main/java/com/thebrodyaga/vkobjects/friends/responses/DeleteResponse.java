package com.thebrodyaga.vkobjects.friends.responses;


import com.thebrodyaga.vkobjects.base.responses.OkResponse;

import java.util.Objects;

/**
 * DeleteResponse object
 */
public class DeleteResponse {

    private OkResponse success;

    /**
     * Returns 1 if friend has been deleted
     */

    private DeleteResponseFriendDeleted friendDeleted;

    /**
     * Returns 1 if out request has been canceled
     */

    private DeleteResponseOutRequestDeleted outRequestDeleted;

    /**
     * Returns 1 if incoming request has been declined
     */

    private DeleteResponseInRequestDeleted inRequestDeleted;

    /**
     * Returns 1 if suggestion has been declined
     */

    private DeleteResponseSuggestionDeleted suggestionDeleted;

    public OkResponse getSuccess() {
        return success;
    }

    public DeleteResponseFriendDeleted getFriendDeleted() {
        return friendDeleted;
    }

    public DeleteResponseOutRequestDeleted getOutRequestDeleted() {
        return outRequestDeleted;
    }

    public DeleteResponseInRequestDeleted getInRequestDeleted() {
        return inRequestDeleted;
    }

    public DeleteResponseSuggestionDeleted getSuggestionDeleted() {
        return suggestionDeleted;
    }

    @Override
    public int hashCode() {
        return Objects.hash(outRequestDeleted, inRequestDeleted, success, suggestionDeleted, friendDeleted);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DeleteResponse deleteResponse = (DeleteResponse) o;
        return Objects.equals(success, deleteResponse.success) &&
                Objects.equals(friendDeleted, deleteResponse.friendDeleted) &&
                Objects.equals(outRequestDeleted, deleteResponse.outRequestDeleted) &&
                Objects.equals(inRequestDeleted, deleteResponse.inRequestDeleted) &&
                Objects.equals(suggestionDeleted, deleteResponse.suggestionDeleted);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("DeleteResponse{");
        sb.append("success=").append(success);
        sb.append(", friendDeleted=").append(friendDeleted);
        sb.append(", outRequestDeleted=").append(outRequestDeleted);
        sb.append(", inRequestDeleted=").append(inRequestDeleted);
        sb.append(", suggestionDeleted=").append(suggestionDeleted);
        sb.append('}');
        return sb.toString();
    }
}
