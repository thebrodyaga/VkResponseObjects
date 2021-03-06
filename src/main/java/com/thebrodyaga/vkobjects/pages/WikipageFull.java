package com.thebrodyaga.vkobjects.pages;




import java.util.Objects;

/**
 * WikipageFull object
 */
public class WikipageFull {
    /**
     * Page ID
     */

    private Integer id;

    /**
     * Community ID
     */

    private Integer groupId;

    /**
     * Page title
     */

    private String title;

    /**
     * Information whether current user can edit the page
     */

    private Boolean currentUserCanEdit;

    /**
     * Information whether current user can edit the page access settings
     */

    private Boolean currentUserCanEditAccess;

    /**
     * View settings of the page
     */

    private PrivacySettings whoCanView;

    /**
     * Edit settings of the page
     */

    private PrivacySettings whoCanEdit;

    /**
     * Date when the page has been edited in Unixtime
     */

    private Integer edited;

    /**
     * Date when the page has been created in Unixtime
     */

    private Integer created;

    /**
     * Views number
     */

    private Integer views;

    /**
     * Last editor ID
     */

    private Integer editorId;

    /**
     * Page creator ID
     */

    private Integer creatorId;

    /**
     * Page content, wiki
     */

    private String source;

    /**
     * Page content, HTML
     */

    private String html;

    /**
     * URL of the page preview
     */

    private String viewUrl;

    public Integer getId() {
        return id;
    }

    public Integer getGroupId() {
        return groupId;
    }

    public String getTitle() {
        return title;
    }

    public boolean isCurrentUserCanEdit() {
        return currentUserCanEdit;
    }

    public boolean isCurrentUserCanEditAccess() {
        return currentUserCanEditAccess;
    }

    public PrivacySettings getWhoCanView() {
        return whoCanView;
    }

    public PrivacySettings getWhoCanEdit() {
        return whoCanEdit;
    }

    public Integer getEdited() {
        return edited;
    }

    public Integer getCreated() {
        return created;
    }

    public Integer getViews() {
        return views;
    }

    public Integer getEditorId() {
        return editorId;
    }

    public Integer getCreatorId() {
        return creatorId;
    }

    public String getSource() {
        return source;
    }

    public String getHtml() {
        return html;
    }

    public String getViewUrl() {
        return viewUrl;
    }

    @Override
    public int hashCode() {
        return Objects.hash(editorId, edited, currentUserCanEditAccess, whoCanView, created, groupId, creatorId, source, title, whoCanEdit, viewUrl, currentUserCanEdit, html, id, views);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WikipageFull wikipageFull = (WikipageFull) o;
        return Objects.equals(id, wikipageFull.id) &&
                Objects.equals(groupId, wikipageFull.groupId) &&
                Objects.equals(title, wikipageFull.title) &&
                Objects.equals(currentUserCanEdit, wikipageFull.currentUserCanEdit) &&
                Objects.equals(currentUserCanEditAccess, wikipageFull.currentUserCanEditAccess) &&
                Objects.equals(whoCanView, wikipageFull.whoCanView) &&
                Objects.equals(whoCanEdit, wikipageFull.whoCanEdit) &&
                Objects.equals(edited, wikipageFull.edited) &&
                Objects.equals(created, wikipageFull.created) &&
                Objects.equals(views, wikipageFull.views) &&
                Objects.equals(editorId, wikipageFull.editorId) &&
                Objects.equals(creatorId, wikipageFull.creatorId) &&
                Objects.equals(source, wikipageFull.source) &&
                Objects.equals(html, wikipageFull.html) &&
                Objects.equals(viewUrl, wikipageFull.viewUrl);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("WikipageFull{");
        sb.append("id=").append(id);
        sb.append(", groupId=").append(groupId);
        sb.append(", title='").append(title).append("'");
        sb.append(", currentUserCanEdit=").append(currentUserCanEdit);
        sb.append(", currentUserCanEditAccess=").append(currentUserCanEditAccess);
        sb.append(", whoCanView=").append(whoCanView);
        sb.append(", whoCanEdit=").append(whoCanEdit);
        sb.append(", edited=").append(edited);
        sb.append(", created=").append(created);
        sb.append(", views=").append(views);
        sb.append(", editorId=").append(editorId);
        sb.append(", creatorId=").append(creatorId);
        sb.append(", source='").append(source).append("'");
        sb.append(", html='").append(html).append("'");
        sb.append(", viewUrl='").append(viewUrl).append("'");
        sb.append('}');
        return sb.toString();
    }
}
