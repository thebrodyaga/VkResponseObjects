package com.thebrodyaga.vkobjects.base;



import java.util.Objects;

/**
 * BaseObjectWithName object
 */
public class BaseObjectWithName {
    /**
     * Object ID
     */

    private Integer id;

    /**
     * Object name
     */

    private String name;

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BaseObjectWithName baseObject = (BaseObjectWithName) o;
        return Objects.equals(id, baseObject.id) &&
                Objects.equals(name, baseObject.name);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("BaseObjectWithName{");
        sb.append("id=").append(id);
        sb.append(", name='").append(name).append("'");
        sb.append('}');
        return sb.toString();
    }
}
