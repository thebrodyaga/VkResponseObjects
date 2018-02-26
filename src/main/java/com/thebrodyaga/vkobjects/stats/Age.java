package com.thebrodyaga.vkobjects.stats;



import java.util.Objects;

/**
 * Age object
 */
public class Age {


    private Integer visitors;


    private String value;

    public Integer getVisitors() {
        return visitors;
    }

    public String getValue() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Age age = (Age) o;
        return Objects.equals(visitors, age.visitors) &&
                value == age.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(visitors, value);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Age{");
        sb.append("visitors=").append(visitors);
        sb.append(", value=").append(value);
        sb.append('}');
        return sb.toString();
    }
}
