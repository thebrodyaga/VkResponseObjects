package com.thebrodyaga.vkobjects.groups.responses;




import java.util.Objects;

/**
 * IsMessagesFromGroupAllowedResponse object
 */
public class IsMessagesFromGroupAllowedResponse {

    /**
     * Information whether user allowed to send com.thebrodyaga.vkobjects.messages from community
     */

    private Boolean isAllowed;

    public Boolean getIsAllowed() {
        return isAllowed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        IsMessagesFromGroupAllowedResponse that = (IsMessagesFromGroupAllowedResponse) o;
        return isAllowed == that.isAllowed;
    }

    @Override
    public int hashCode() {
        return Objects.hash(isAllowed);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("IsMessagesFromGroupAllowedResponse{");
        sb.append("isAllowed=").append(isAllowed);
        sb.append('}');
        return sb.toString();
    }
}
