package com.thebrodyaga.vkobjects.video;


import com.thebrodyaga.vkobjects.base.BoolInt;

import java.util.List;
import java.util.Objects;

/**
 * CatBlock object
 */
public class CatBlock {

    private List<CatElement> items;

    /**
     * New value for _from_ parameter
     */

    private String next;

    /**
     * Block name
     */

    private String name;

    /**
     * Block ID
     */

    private Integer id;

    /**
     * Type of view
     */

    private CatBlockView view;

    /**
     * Information whether the block can be hidden
     */

    private BoolInt canHide;

    /**
     * Block type
     */

    private CatBlockType type;

    public List<CatElement> getItems() {
        return items;
    }

    public String getNext() {
        return next;
    }

    public String getName() {
        return name;
    }

    public Integer getId() {
        return id;
    }

    public CatBlockView getView() {
        return view;
    }

    public boolean canHide() {
        return canHide == BoolInt.YES;
    }

    public CatBlockType getType() {
        return type;
    }

    @Override
    public int hashCode() {
        return Objects.hash(next, view, name, id, type, items, canHide);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CatBlock catBlock = (CatBlock) o;
        return Objects.equals(items, catBlock.items) &&
                Objects.equals(next, catBlock.next) &&
                Objects.equals(name, catBlock.name) &&
                Objects.equals(id, catBlock.id) &&
                Objects.equals(view, catBlock.view) &&
                Objects.equals(canHide, catBlock.canHide) &&
                Objects.equals(type, catBlock.type);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("CatBlock{");
        sb.append("items=").append(items);
        sb.append(", next='").append(next).append("'");
        sb.append(", name='").append(name).append("'");
        sb.append(", id=").append(id);
        sb.append(", view='").append(view).append("'");
        sb.append(", canHide=").append(canHide);
        sb.append(", type='").append(type).append("'");
        sb.append('}');
        return sb.toString();
    }
}
