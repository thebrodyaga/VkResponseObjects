package com.thebrodyaga.vkobjects.places;



import java.util.Objects;

/**
 * Types object
 */
public class Types {
    /**
     * Place type ID
     */

    private Integer id;

    /**
     * Place type title
     */

    private Integer title;

    /**
     * URL of the place's icon
     */

    private String icon;

    public Integer getId() {
        return id;
    }

    public Integer getTitle() {
        return title;
    }

    public String getIcon() {
        return icon;
    }

    @Override
    public int hashCode() {
        return Objects.hash(icon, id, title);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Types types = (Types) o;
        return Objects.equals(id, types.id) &&
                Objects.equals(title, types.title) &&
                Objects.equals(icon, types.icon);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Types{");
        sb.append("id=").append(id);
        sb.append(", title=").append(title);
        sb.append(", icon='").append(icon).append("'");
        sb.append('}');
        return sb.toString();
    }
}
