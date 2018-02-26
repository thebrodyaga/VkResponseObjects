package com.thebrodyaga.vkobjects.users;



import java.util.Objects;

/**
 * Relative object
 */
public class Relative {
    /**
     * Relative ID
     */

    private Integer id;

    /**
     * Relative type
     */

    private String type;

    public Integer getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, type);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Relative relative = (Relative) o;
        return Objects.equals(id, relative.id) &&
                Objects.equals(type, relative.type);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Relative{");
        sb.append("id=").append(id);
        sb.append(", type='").append(type).append("'");
        sb.append('}');
        return sb.toString();
    }
}
