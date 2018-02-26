package com.thebrodyaga.vkobjects.newsfeed;


import com.thebrodyaga.vkobjects.base.BoolInt;

import java.util.List;
import java.util.Objects;

/**
 * List object
 */
public class NewsfeedListFull extends NewsfeedList {
    /**
     * Information whether reposts hiding is enabled
     */

    private BoolInt noReposts;


    private List<Integer> sourceIds;

    public boolean isNoReposts() {
        return noReposts == BoolInt.YES;
    }

    public List<Integer> getSourceIds() {
        return sourceIds;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        NewsfeedListFull that = (NewsfeedListFull) o;
        return noReposts == that.noReposts &&
                Objects.equals(sourceIds, that.sourceIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), noReposts, sourceIds);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("NewsfeedListFull{");
        sb.append("id=").append(getId());
        sb.append(", noReposts=").append(noReposts);
        sb.append(", sourceIds=").append(sourceIds);
        sb.append(", title='").append(getTitle()).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
