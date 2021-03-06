package com.thebrodyaga.vkobjects.database;



import java.util.Objects;

/**
 * Region object
 */
public class Region {
    /**
     * Region ID
     */

    private Integer id;

    /**
     * Region title
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
        Region region = (Region) o;
        return Objects.equals(id, region.id) &&
                Objects.equals(title, region.title);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Region{");
        sb.append("id=").append(id);
        sb.append(", title='").append(title).append("'");
        sb.append('}');
        return sb.toString();
    }
}
