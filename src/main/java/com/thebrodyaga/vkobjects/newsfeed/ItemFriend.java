package com.thebrodyaga.vkobjects.newsfeed;


import com.thebrodyaga.vkobjects.base.BaseUserId;

import java.util.List;
import java.util.Objects;

/**
 * ItemFriend object
 */
public class ItemFriend {


    private List<BaseUserId> friends;

    public List<BaseUserId> getFriends() {
        return friends;
    }

    @Override
    public int hashCode() {
        return Objects.hash(friends);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ItemFriend itemFriend = (ItemFriend) o;
        return Objects.equals(friends, itemFriend.friends);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ItemFriend{");
        sb.append("com.thebrodyaga.vkobjects.friends=").append(friends);
        sb.append('}');
        return sb.toString();
    }
}
