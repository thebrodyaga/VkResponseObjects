package com.thebrodyaga.vkobjects.base;



import java.util.Objects;

/**
 * LinkButton object
 */
public class LinkButton {

    /**
     * Button title
     */

    private String title;

    /**
     * Button action
     */

    private LinkButtonAction action;

    public LinkButtonAction getAction() {
        return action;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, action);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LinkButton linkButton = (LinkButton) o;
        return Objects.equals(action, linkButton.action) &&
                Objects.equals(title, linkButton.title);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("LinkButton{");
        sb.append("action=").append(action);
        sb.append(", title='").append(title).append("'");
        sb.append('}');
        return sb.toString();
    }
}
