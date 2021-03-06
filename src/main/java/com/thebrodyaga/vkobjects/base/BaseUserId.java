package com.thebrodyaga.vkobjects.base;



import java.util.Objects;

/**
 * BaseUserId object
 */
public class BaseUserId {
    /**
     * User ID
     */

    private Integer userId;

    public Integer getUserId() {
        return userId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BaseUserId baseObject = (BaseUserId) o;
        return Objects.equals(userId, baseObject.userId);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("BaseObject{");
        sb.append("userId=").append(userId);
        sb.append('}');
        return sb.toString();
    }
}
