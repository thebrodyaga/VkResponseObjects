package com.thebrodyaga.vkobjects.ads;


import com.thebrodyaga.vkobjects.base.BaseObjectWithName;

import java.util.List;
import java.util.Objects;

/**
 * Category object
 */
public class Category {
    /**
     * Category ID
     */

    private Integer id;

    /**
     * Category name
     */

    private String name;


    private List<BaseObjectWithName> subcategories;

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<BaseObjectWithName> getSubcategories() {
        return subcategories;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id, subcategories);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Category category = (Category) o;
        return Objects.equals(id, category.id) &&
                Objects.equals(name, category.name) &&
                Objects.equals(subcategories, category.subcategories);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Category{");
        sb.append("id=").append(id);
        sb.append(", name='").append(name).append("'");
        sb.append(", subcategories=").append(subcategories);
        sb.append('}');
        return sb.toString();
    }
}
