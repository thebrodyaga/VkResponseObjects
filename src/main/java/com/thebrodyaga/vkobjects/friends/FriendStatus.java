package com.thebrodyaga.vkobjects.friends;


import com.thebrodyaga.vkobjects.base.BoolInt;

import java.util.Objects;

/**
 * FriendStatus object
 */
public class FriendStatus {
    /**
     * User ID
     */

    private Integer userId;

    /**
     * Friend com.thebrodyaga.vkobjects.status with the user
     */

    private FriendStatusFriendStatus friendStatus;

    /**
     * Message sent with request
     */

    private String requestMessage;

    /**
     * Information whether request is unviewed
     */

    private BoolInt readState;

    /**
     * MD5 hash for the result validation
     */

    private String sign;

    public Integer getUserId() {
        return userId;
    }

    public FriendStatusFriendStatus getFriendStatus() {
        return friendStatus;
    }

    public String getRequestMessage() {
        return requestMessage;
    }

    public boolean isReadState() {
        return readState == BoolInt.YES;
    }

    public String getSign() {
        return sign;
    }

    @Override
    public int hashCode() {
        return Objects.hash(requestMessage, friendStatus, readState, sign, userId);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FriendStatus friendStatus = (FriendStatus) o;
        return Objects.equals(userId, friendStatus.userId) &&
                Objects.equals(friendStatus, friendStatus.friendStatus) &&
                Objects.equals(requestMessage, friendStatus.requestMessage) &&
                Objects.equals(readState, friendStatus.readState) &&
                Objects.equals(sign, friendStatus.sign);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("FriendStatus{");
        sb.append("userId=").append(userId);
        sb.append(", friendStatus=").append(friendStatus);
        sb.append(", requestMessage='").append(requestMessage).append("'");
        sb.append(", readState=").append(readState);
        sb.append(", sign='").append(sign).append("'");
        sb.append('}');
        return sb.toString();
    }
}
