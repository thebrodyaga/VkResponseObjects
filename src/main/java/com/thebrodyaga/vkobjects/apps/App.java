package com.thebrodyaga.vkobjects.apps;


import com.thebrodyaga.vkobjects.photos.Photo;

import java.util.List;
import java.util.Objects;

/**
 * App object
 */
public class App {
    /**
     * Application ID
     */

    private Integer id;

    /**
     * Application title
     */

    private String title;

    /**
     * Screen name
     */

    private String screenName;

    /**
     * Application description
     */

    private String description;

    /**
     * URL of the com.thebrodyaga.vkobjects.app icon with 139 px in width
     */

    private String icon139;

    /**
     * URL of the com.thebrodyaga.vkobjects.app icon with 278 px in width
     */

    private String icon278;

    /**
     * URL of the com.thebrodyaga.vkobjects.app icon with 75 px in width
     */

    private String icon75;

    /**
     * URL of the com.thebrodyaga.vkobjects.app icon with 150 px in width
     */

    private String icon150;

    /**
     * URL of the com.thebrodyaga.vkobjects.app banner with 186 px in width
     */

    private String banner560;

    /**
     * URL of the com.thebrodyaga.vkobjects.app banner with 896 px in width
     */

    private String banner1120;

    /**
     * Application type
     */

    private AppType type;

    /**
     * Application section name
     */

    private String section;

    /**
     * Application author's URL
     */

    private String authorUrl;

    /**
     * Application author's ID
     */

    private Integer authorId;

    /**
     * Official community's ID
     */

    private Integer authorGroup;

    /**
     * Members number
     */

    private Integer membersCount;

    /**
     * Date when the application has been published in Unixtime
     */

    private Integer publishedDate;

    /**
     * Catalog position
     */

    private Integer catalogPosition;


    private List<Photo> screenshots;

    /**
     * Information whether the application is multilanguage
     */

    private Integer international;

    /**
     * Leaderboard type
     */

    private AppLeaderboardType leaderboardType;

    /**
     * Genre ID
     */

    private Integer genreId;

    /**
     * Genre name
     */

    private String genre;

    /**
     * Application ID in store
     */

    private Integer platformId;

    /**
     * Information whther application is in mobile catalog
     */

    private Integer isInCatalog;

    public Integer getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getScreenName() {
        return screenName;
    }

    public String getDescription() {
        return description;
    }

    public String getIcon139() {
        return icon139;
    }

    public String getIcon278() {
        return icon278;
    }

    public String getIcon75() {
        return icon75;
    }

    public String getIcon150() {
        return icon150;
    }

    public String getBanner560() {
        return banner560;
    }

    public String getBanner1120() {
        return banner1120;
    }

    public AppType getType() {
        return type;
    }

    public String getSection() {
        return section;
    }

    public String getAuthorUrl() {
        return authorUrl;
    }

    public Integer getAuthorId() {
        return authorId;
    }

    public Integer getAuthorGroup() {
        return authorGroup;
    }

    public Integer getMembersCount() {
        return membersCount;
    }

    public Integer getPublishedDate() {
        return publishedDate;
    }

    public Integer getCatalogPosition() {
        return catalogPosition;
    }

    public List<Photo> getScreenshots() {
        return screenshots;
    }

    public Integer getInternational() {
        return international;
    }

    public AppLeaderboardType getLeaderboardType() {
        return leaderboardType;
    }

    public Integer getGenreId() {
        return genreId;
    }

    public String getGenre() {
        return genre;
    }

    public Integer getPlatformId() {
        return platformId;
    }

    public Integer getIsInCatalog() {
        return isInCatalog;
    }

    @Override
    public int hashCode() {
        return Objects.hash(icon150, genreId, isInCatalog, icon75, banner1120, description, section, screenName, title, type, screenshots, authorUrl, genre, leaderboardType, id, authorGroup, international, membersCount, banner560, platformId, authorId, icon278, icon139, catalogPosition, publishedDate);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        App app = (App) o;
        return Objects.equals(id, app.id) &&
                Objects.equals(title, app.title) &&
                Objects.equals(screenName, app.screenName) &&
                Objects.equals(description, app.description) &&
                Objects.equals(icon139, app.icon139) &&
                Objects.equals(icon278, app.icon278) &&
                Objects.equals(icon75, app.icon75) &&
                Objects.equals(icon150, app.icon150) &&
                Objects.equals(banner560, app.banner560) &&
                Objects.equals(banner1120, app.banner1120) &&
                Objects.equals(type, app.type) &&
                Objects.equals(section, app.section) &&
                Objects.equals(authorUrl, app.authorUrl) &&
                Objects.equals(authorId, app.authorId) &&
                Objects.equals(authorGroup, app.authorGroup) &&
                Objects.equals(membersCount, app.membersCount) &&
                Objects.equals(publishedDate, app.publishedDate) &&
                Objects.equals(catalogPosition, app.catalogPosition) &&
                Objects.equals(screenshots, app.screenshots) &&
                Objects.equals(international, app.international) &&
                Objects.equals(leaderboardType, app.leaderboardType) &&
                Objects.equals(genreId, app.genreId) &&
                Objects.equals(genre, app.genre) &&
                Objects.equals(platformId, app.platformId) &&
                Objects.equals(isInCatalog, app.isInCatalog);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("App{");
        sb.append("id=").append(id);
        sb.append(", title='").append(title).append("'");
        sb.append(", screenName='").append(screenName).append("'");
        sb.append(", description='").append(description).append("'");
        sb.append(", icon139='").append(icon139).append("'");
        sb.append(", icon278='").append(icon278).append("'");
        sb.append(", icon75='").append(icon75).append("'");
        sb.append(", icon150='").append(icon150).append("'");
        sb.append(", banner560='").append(banner560).append("'");
        sb.append(", banner1120='").append(banner1120).append("'");
        sb.append(", type='").append(type).append("'");
        sb.append(", section='").append(section).append("'");
        sb.append(", authorUrl='").append(authorUrl).append("'");
        sb.append(", authorId=").append(authorId);
        sb.append(", authorGroup=").append(authorGroup);
        sb.append(", membersCount=").append(membersCount);
        sb.append(", publishedDate=").append(publishedDate);
        sb.append(", catalogPosition=").append(catalogPosition);
        sb.append(", screenshots=").append(screenshots);
        sb.append(", international=").append(international);
        sb.append(", leaderboardType=").append(leaderboardType);
        sb.append(", genreId=").append(genreId);
        sb.append(", genre='").append(genre).append("'");
        sb.append(", platformId=").append(platformId);
        sb.append(", isInCatalog=").append(isInCatalog);
        sb.append('}');
        return sb.toString();
    }
}
