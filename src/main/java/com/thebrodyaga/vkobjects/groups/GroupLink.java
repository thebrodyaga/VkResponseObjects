package com.thebrodyaga.vkobjects.groups;




import java.util.Objects;

/**
 * GroupLink object
 */
public class GroupLink {
    /**
     * Link ID
     */

    private Integer id;

    /**
     * Link URL
     */

    private String url;

    /**
     * Information whether the title can be edited
     */

    private Boolean editTitle;

    /**
     * Link description
     */

    private String desc;

    /**
     * Information whether the image on processing
     */

    private Boolean imageProcessing;

    public Integer getId() {
        return id;
    }

    public String getUrl() {
        return url;
    }

    public boolean isEditTitle() {
        return editTitle;
    }

    public String getDesc() {
        return desc;
    }

    public boolean isImageProcessing() {
        return imageProcessing;
    }

    @Override
    public int hashCode() {
        return Objects.hash(editTitle, id, imageProcessing, url, desc);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GroupLink groupLink = (GroupLink) o;
        return Objects.equals(id, groupLink.id) &&
                Objects.equals(url, groupLink.url) &&
                Objects.equals(editTitle, groupLink.editTitle) &&
                Objects.equals(desc, groupLink.desc) &&
                Objects.equals(imageProcessing, groupLink.imageProcessing);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("GroupLink{");
        sb.append("id=").append(id);
        sb.append(", url='").append(url).append("'");
        sb.append(", editTitle=").append(editTitle);
        sb.append(", desc='").append(desc).append("'");
        sb.append(", imageProcessing=").append(imageProcessing);
        sb.append('}');
        return sb.toString();
    }
}
