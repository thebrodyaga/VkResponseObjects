package com.thebrodyaga.vkobjects.board;




import java.util.Objects;

/**
 * Topic object
 */
public class Topic {
    /**
     * Topic ID
     */

    private Integer id;

    /**
     * Topic title
     */

    private String title;

    /**
     * Date when the topic has been created in Unixtime
     */

    private Integer created;

    /**
     * Creator ID
     */

    private Integer createdBy;

    /**
     * Date when the topic has been updated in Unixtime
     */

    private Integer updated;

    /**
     * ID of user who updated the topic
     */

    private Integer updatedBy;

    /**
     * Information whether the topic is closed
     */

    private Boolean isClosed;

    /**
     * Information whether the topic is fixed
     */

    private Boolean isFixed;

    /**
     * Comments number
     */

    private Integer comments;

    public Integer getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public Integer getCreated() {
        return created;
    }

    public Integer getCreatedBy() {
        return createdBy;
    }

    public Integer getUpdated() {
        return updated;
    }

    public Integer getUpdatedBy() {
        return updatedBy;
    }

    public boolean isClosed() {
        return isClosed;
    }

    public boolean isFixed() {
        return isFixed;
    }

    public Integer getComments() {
        return comments;
    }

    @Override
    public int hashCode() {
        return Objects.hash(updatedBy, comments, isClosed, createdBy, created, id, title, updated, isFixed);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Topic topic = (Topic) o;
        return Objects.equals(id, topic.id) &&
                Objects.equals(title, topic.title) &&
                Objects.equals(created, topic.created) &&
                Objects.equals(createdBy, topic.createdBy) &&
                Objects.equals(updated, topic.updated) &&
                Objects.equals(updatedBy, topic.updatedBy) &&
                Objects.equals(isClosed, topic.isClosed) &&
                Objects.equals(isFixed, topic.isFixed) &&
                Objects.equals(comments, topic.comments);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Topic{");
        sb.append("id=").append(id);
        sb.append(", title='").append(title).append("'");
        sb.append(", created=").append(created);
        sb.append(", createdBy=").append(createdBy);
        sb.append(", updated=").append(updated);
        sb.append(", updatedBy=").append(updatedBy);
        sb.append(", isClosed=").append(isClosed);
        sb.append(", isFixed=").append(isFixed);
        sb.append(", comments=").append(comments);
        sb.append('}');
        return sb.toString();
    }
}
