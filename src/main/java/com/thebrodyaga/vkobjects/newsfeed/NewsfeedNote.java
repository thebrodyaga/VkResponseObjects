package com.thebrodyaga.vkobjects.newsfeed;



import java.util.Objects;

/**
 * NewsfeedNote object
 */
public class NewsfeedNote {


    private Integer id;


    private Integer ownerId;


    private String title;


    private Integer comments;

    public Integer getId() {
        return id;
    }

    public Integer getOwnerId() {
        return ownerId;
    }

    public String getTitle() {
        return title;
    }

    public Integer getComments() {
        return comments;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NewsfeedNote that = (NewsfeedNote) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(ownerId, that.ownerId) &&
                Objects.equals(title, that.title) &&
                Objects.equals(comments, that.comments);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, ownerId, title, comments);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("NewsfeedNote{");
        sb.append("id=").append(id);
        sb.append(", ownerId=").append(ownerId);
        sb.append(", title='").append(title).append('\'');
        sb.append(", comments=").append(comments);
        sb.append('}');
        return sb.toString();
    }
}
