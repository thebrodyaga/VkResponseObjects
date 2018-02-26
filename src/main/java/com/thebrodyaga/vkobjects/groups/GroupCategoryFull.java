package com.thebrodyaga.vkobjects.groups;



import java.util.List;
import java.util.Objects;

/**
 * GroupCategoryFull object
 */
public class GroupCategoryFull {
    /**
     * Category ID
     */

    private Integer id;

    /**
     * Category name
     */

    private String name;


    private List<GroupCategory> subcategories;

    /**
     * Pages number
     */

    private Integer pageCount;


    private List<Group> pagePreviews;

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<GroupCategory> getSubcategories() {
        return subcategories;
    }

    public Integer getPageCount() {
        return pageCount;
    }

    public List<Group> getPagePreviews() {
        return pagePreviews;
    }

    @Override
    public int hashCode() {
        return Objects.hash(pagePreviews, pageCount, name, id, subcategories);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GroupCategoryFull groupCategoryFull = (GroupCategoryFull) o;
        return Objects.equals(id, groupCategoryFull.id) &&
                Objects.equals(name, groupCategoryFull.name) &&
                Objects.equals(subcategories, groupCategoryFull.subcategories) &&
                Objects.equals(pageCount, groupCategoryFull.pageCount) &&
                Objects.equals(pagePreviews, groupCategoryFull.pagePreviews);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("GroupCategoryFull{");
        sb.append("id=").append(id);
        sb.append(", name='").append(name).append("'");
        sb.append(", subcategories=").append(subcategories);
        sb.append(", pageCount=").append(pageCount);
        sb.append(", pagePreviews=").append(pagePreviews);
        sb.append('}');
        return sb.toString();
    }
}
