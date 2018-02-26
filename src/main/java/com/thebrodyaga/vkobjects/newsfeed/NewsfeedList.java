package com.thebrodyaga.vkobjects.newsfeed;



import java.util.Objects;

/**
 * List object
 */
public class NewsfeedList {
    /**
     * List ID
     */

    private Integer id;

    /**
     * List title
     */

    private String title;

    public Integer getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NewsfeedList list = (NewsfeedList) o;
        return Objects.equals(id, list.id) &&
                Objects.equals(title, list.title);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("NewsfeedList{");
        sb.append("id=").append(id);
        sb.append(", title='").append(title).append("'");
        sb.append('}');
        return sb.toString();
    }
}
