package com.thebrodyaga.vkobjects.ads;



import java.util.Objects;

/**
 * TargSuggestionsCities object
 */
public class TargSuggestionsCities {
    /**
     * Object ID
     */

    private Integer id;

    /**
     * Object name
     */

    private String name;

    /**
     * Parent object
     */

    private String parent;

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getParent() {
        return parent;
    }

    @Override
    public int hashCode() {
        return Objects.hash(parent, name, id);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TargSuggestionsCities targSuggestionsCities = (TargSuggestionsCities) o;
        return Objects.equals(id, targSuggestionsCities.id) &&
                Objects.equals(name, targSuggestionsCities.name) &&
                Objects.equals(parent, targSuggestionsCities.parent);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("TargSuggestionsCities{");
        sb.append("id=").append(id);
        sb.append(", name='").append(name).append("'");
        sb.append(", parent='").append(parent).append("'");
        sb.append('}');
        return sb.toString();
    }
}
