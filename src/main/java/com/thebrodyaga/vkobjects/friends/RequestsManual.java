package com.thebrodyaga.vkobjects.friends;



import java.util.List;
import java.util.Objects;

/**
 * RequestsManual object
 */
public class RequestsManual {

    /**
     * Total mutual com.thebrodyaga.vkobjects.friends number
     */

    private Integer count;


    private List<Integer> users;

    public Integer getCount() {
        return count;
    }

    public List<Integer> getUsers() {
        return users;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RequestsManual that = (RequestsManual) o;
        return Objects.equals(count, that.count) &&
                Objects.equals(users, that.users);
    }

    @Override
    public int hashCode() {
        return Objects.hash(count, users);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("RequestsManual{");
        sb.append("count=").append(count);
        sb.append(", com.thebrodyaga.vkobjects.users=").append(users);
        sb.append('}');
        return sb.toString();
    }
}
