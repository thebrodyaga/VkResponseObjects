package com.thebrodyaga.vkobjects.friends;



import java.util.List;
import java.util.Objects;

/**
 * MutualFriend object
 */
public class MutualFriend {


    private Integer id;


    private List<Integer> commonFriends;


    private Integer commonCount;

    public Integer getId() {
        return id;
    }

    public List<Integer> getCommonFriends() {
        return commonFriends;
    }

    public Integer getCommonCount() {
        return commonCount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MutualFriend that = (MutualFriend) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(commonFriends, that.commonFriends) &&
                Objects.equals(commonCount, that.commonCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, commonFriends, commonCount);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("MutualFriend{");
        sb.append("id=").append(id);
        sb.append(", commonFriends=").append(commonFriends);
        sb.append(", commonCount=").append(commonCount);
        sb.append('}');
        return sb.toString();
    }
}
