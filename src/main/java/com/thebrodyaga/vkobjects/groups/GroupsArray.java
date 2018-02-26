package com.thebrodyaga.vkobjects.groups;



import java.util.List;
import java.util.Objects;

/**
 * GroupsArray object
 */
public class GroupsArray {
    /**
     * Communities number
     */

    private Integer count;


    private List<Integer> items;

    public Integer getCount() {
        return count;
    }

    public List<Integer> getItems() {
        return items;
    }

    @Override
    public int hashCode() {
        return Objects.hash(count, items);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GroupsArray groupsArray = (GroupsArray) o;
        return Objects.equals(count, groupsArray.count) &&
                Objects.equals(items, groupsArray.items);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("GroupsArray{");
        sb.append("count=").append(count);
        sb.append(", items=").append(items);
        sb.append('}');
        return sb.toString();
    }
}
