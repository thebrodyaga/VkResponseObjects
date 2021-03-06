package com.thebrodyaga.vkobjects.pages;



import java.util.Objects;

/**
 * WikipageVersion object
 */
public class WikipageVersion {
    /**
     * Version ID
     */

    private Integer id;

    /**
     * Page size in bytes
     */

    private Integer length;

    /**
     * Date when the page has been edited in Unixtime
     */

    private Integer edited;

    /**
     * Last editor ID
     */

    private Integer editorId;

    /**
     * Last editor name
     */

    private String editorName;

    public Integer getId() {
        return id;
    }

    public Integer getLength() {
        return length;
    }

    public Integer getEdited() {
        return edited;
    }

    public Integer getEditorId() {
        return editorId;
    }

    public String getEditorName() {
        return editorName;
    }

    @Override
    public int hashCode() {
        return Objects.hash(editorName, editorId, edited, length, id);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WikipageVersion wikipageVersion = (WikipageVersion) o;
        return Objects.equals(id, wikipageVersion.id) &&
                Objects.equals(length, wikipageVersion.length) &&
                Objects.equals(edited, wikipageVersion.edited) &&
                Objects.equals(editorId, wikipageVersion.editorId) &&
                Objects.equals(editorName, wikipageVersion.editorName);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("WikipageVersion{");
        sb.append("id=").append(id);
        sb.append(", length=").append(length);
        sb.append(", edited=").append(edited);
        sb.append(", editorId=").append(editorId);
        sb.append(", editorName='").append(editorName).append("'");
        sb.append('}');
        return sb.toString();
    }
}
