package com.thebrodyaga.vkobjects.groups;




import java.util.Objects;

/**
 * LinksItem object
 */
public class LinksItem {
    /**
     * Link ID
     */

    private Integer id;

    /**
     * Link URL
     */

    private String url;

    /**
     * Information whether the link title can be edited
     */

    private Boolean editTitle;

    /**
     * Link title
     */

    private String name;

    /**
     * Link description
     */

    private String desc;

    /**
     * URL of square image of the link with 50 pixels in width
     */

    private String photo50;

    /**
     * URL of square image of the link with 100 pixels in width
     */

    private String photo100;

    public Integer getId() {
        return id;
    }

    public String getUrl() {
        return url;
    }

    public boolean isEditTitle() {
        return editTitle;
    }

    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }

    public String getPhoto50() {
        return photo50;
    }

    public String getPhoto100() {
        return photo100;
    }

    @Override
    public int hashCode() {
        return Objects.hash(photo100, editTitle, name, photo50, id, url, desc);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LinksItem linksItem = (LinksItem) o;
        return Objects.equals(id, linksItem.id) &&
                Objects.equals(url, linksItem.url) &&
                Objects.equals(editTitle, linksItem.editTitle) &&
                Objects.equals(name, linksItem.name) &&
                Objects.equals(desc, linksItem.desc) &&
                Objects.equals(photo50, linksItem.photo50) &&
                Objects.equals(photo100, linksItem.photo100);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("LinksItem{");
        sb.append("id=").append(id);
        sb.append(", url='").append(url).append("'");
        sb.append(", editTitle=").append(editTitle);
        sb.append(", name='").append(name).append("'");
        sb.append(", desc='").append(desc).append("'");
        sb.append(", photo50='").append(photo50).append("'");
        sb.append(", photo100='").append(photo100).append("'");
        sb.append('}');
        return sb.toString();
    }
}
