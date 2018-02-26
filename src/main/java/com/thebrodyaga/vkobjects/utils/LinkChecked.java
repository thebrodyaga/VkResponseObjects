package com.thebrodyaga.vkobjects.utils;



import java.util.Objects;

/**
 * LinkChecked object
 */
public class LinkChecked {
    /**
     * Link com.thebrodyaga.vkobjects.status
     */

    private LinkCheckedStatus status;

    /**
     * Link URL
     */

    private String link;

    public LinkCheckedStatus getStatus() {
        return status;
    }

    public String getLink() {
        return link;
    }

    @Override
    public int hashCode() {
        return Objects.hash(link, status);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LinkChecked linkChecked = (LinkChecked) o;
        return Objects.equals(status, linkChecked.status) &&
                Objects.equals(link, linkChecked.link);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("LinkChecked{");
        sb.append("com.thebrodyaga.vkobjects.status='").append(status).append("'");
        sb.append(", link='").append(link).append("'");
        sb.append('}');
        return sb.toString();
    }
}
