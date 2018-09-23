package com.thebrodyaga.vkobjects.groups;


import com.thebrodyaga.vkobjects.base.BaseObject;

import com.thebrodyaga.vkobjects.base.Country;
import com.thebrodyaga.vkobjects.base.Place;

import java.util.List;
import java.util.Objects;

/**
 * GroupFull object
 */
public class GroupFull extends Group {


    private MarketInfo market;

    /**
     * Current user's member com.thebrodyaga.vkobjects.status
     */

    private GroupFullMemberStatus memberStatus;

    /**
     * Information whether community is in faves
     */

    private Boolean isFavorite;

    /**
     * Information whether current user hide posts from community in com.thebrodyaga.vkobjects.newsfeed
     */

    private Boolean isHiddenFromFeed;

    /**
     * Information whether current user is subscribed
     */

    private Boolean isSubscribed;


    private BaseObject city;


    private Country country;

    /**
     * Information whether community is verified
     */

    private Boolean verified;

    /**
     * Information whether the user a "fire" pictogram
     */

    private Boolean trending;

    /**
     * Community description
     */

    private String description;

    /**
     * Community's main wiki page title
     */

    private String wikiPage;

    /**
     * Community members number
     */

    private Integer membersCount;


    private CountersGroup counters;


    private Cover cover;

    /**
     * Information whether current user can post on community's com.thebrodyaga.vkobjects.wall
     */

    private Boolean canPost;

    /**
     * Information whether current user can see all posts on community's com.thebrodyaga.vkobjects.wall
     */

    private Boolean canSeeAllPosts;

    /**
     * Type of group, start date of event or category of public page
     */

    private String activity;

    /**
     * Fixed post ID
     */

    private Integer fixedPost;

    /**
     * Information whether current user can create topic
     */

    private Boolean canCreateTopic;

    /**
     * Information whether current user can upload doc
     */

    private Boolean canUploadDoc;

    /**
     * Information whether current user can upload com.thebrodyaga.vkobjects.video
     */

    private Boolean canUploadVideo;

    /**
     * Community com.thebrodyaga.vkobjects.status
     */

    private String status;

    /**
     * Community's main photo album ID
     */

    private Integer mainAlbumId;


    private List<LinksItem> links;


    private List<ContactsItem> contacts;

    /**
     * Community's website
     */

    private String site;

    /**
     * Main section of community
     */

    private GroupFullMainSection mainSection;

    /**
     * Information whether current user can send a message to community
     */

    private Boolean canMessage;

    /**
     * Information whether current user allow to community send a message
     */

    private Boolean isMessagesAllowed;

    /**
     * Label for star date
     */

    private String publicDateLabel;

    /**
     * Start date of event in Unixtime
     */

    private Integer startDate;

    /**
     * Finish date of event in Unixtime
     */

    private Integer finishDate;

    /**
     * Information whether community has photo
     */

    private Boolean hasPhoto;

    /**
     * Information whether age limit
     */

    private GroupFullAgeLimits ageLimits;

    /**
     * Community's place
     */

    private Place place;

    /**
     * User ban info
     */

    private GroupBanInfo banInfo;

    public MarketInfo getMarket() {
        return market;
    }

    public GroupFullMemberStatus getMemberStatus() {
        return memberStatus;
    }

    public boolean isFavorite() {
        return isFavorite;
    }

    public boolean isHiddenFromFeed() {
        return isHiddenFromFeed;
    }

    public boolean isSubscribed() {
        return isSubscribed;
    }

    public BaseObject getCity() {
        return city;
    }

    public Country getCountry() {
        return country;
    }

    public boolean isVerified() {
        return verified;
    }

    public String getDescription() {
        return description;
    }

    public String getWikiPage() {
        return wikiPage;
    }

    public Integer getMembersCount() {
        return membersCount;
    }

    public CountersGroup getCounters() {
        return counters;
    }

    public Cover getCover() {
        return cover;
    }

    public boolean canPost() {
        return canPost;
    }

    public boolean canSeeAllPosts() {
        return canSeeAllPosts;
    }

    public String getActivity() {
        return activity;
    }

    public Integer getFixedPost() {
        return fixedPost;
    }

    public boolean canCreateTopic() {
        return canCreateTopic;
    }

    public boolean canUploadDoc() {
        return canUploadDoc;
    }

    public boolean canUploadVideo() {
        return canUploadVideo;
    }

    public String getStatus() {
        return status;
    }

    public Integer getMainAlbumId() {
        return mainAlbumId;
    }

    public List<LinksItem> getLinks() {
        return links;
    }

    public List<ContactsItem> getContacts() {
        return contacts;
    }

    public String getSite() {
        return site;
    }

    public GroupFullMainSection getMainSection() {
        return mainSection;
    }

    public boolean canMessage() {
        return canMessage;
    }

    public boolean isMessagesAllowed() {
        return isMessagesAllowed;
    }

    public String getPublicDateLabel() {
        return publicDateLabel;
    }

    public Integer getStartDate() {
        return startDate;
    }

    public Integer getFinishDate() {
        return finishDate;
    }

    public boolean hasPhoto() {
        return hasPhoto;
    }

    public GroupFullAgeLimits getAgeLimits() {
        return ageLimits;
    }

    public Place getPlace() {
        return place;
    }

    public GroupBanInfo getBanInfo() {
        return banInfo;
    }

    public boolean isTrending() {
        return trending;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        GroupFull groupFull = (GroupFull) o;
        return Objects.equals(market, groupFull.market) &&
                memberStatus == groupFull.memberStatus &&
                isFavorite == groupFull.isFavorite &&
                isHiddenFromFeed == groupFull.isHiddenFromFeed &&
                isSubscribed == groupFull.isSubscribed &&
                Objects.equals(city, groupFull.city) &&
                Objects.equals(country, groupFull.country) &&
                verified == groupFull.verified &&
                Objects.equals(description, groupFull.description) &&
                Objects.equals(wikiPage, groupFull.wikiPage) &&
                Objects.equals(membersCount, groupFull.membersCount) &&
                Objects.equals(counters, groupFull.counters) &&
                Objects.equals(cover, groupFull.cover) &&
                canPost == groupFull.canPost &&
                canSeeAllPosts == groupFull.canSeeAllPosts &&
                Objects.equals(activity, groupFull.activity) &&
                Objects.equals(fixedPost, groupFull.fixedPost) &&
                canCreateTopic == groupFull.canCreateTopic &&
                canUploadDoc == groupFull.canUploadDoc &&
                canUploadVideo == groupFull.canUploadVideo &&
                Objects.equals(status, groupFull.status) &&
                Objects.equals(mainAlbumId, groupFull.mainAlbumId) &&
                Objects.equals(links, groupFull.links) &&
                Objects.equals(contacts, groupFull.contacts) &&
                Objects.equals(site, groupFull.site) &&
                mainSection == groupFull.mainSection &&
                canMessage == groupFull.canMessage &&
                isMessagesAllowed == groupFull.isMessagesAllowed &&
                Objects.equals(publicDateLabel, groupFull.publicDateLabel) &&
                Objects.equals(startDate, groupFull.startDate) &&
                Objects.equals(finishDate, groupFull.finishDate) &&
                hasPhoto == groupFull.hasPhoto &&
                ageLimits == groupFull.ageLimits &&
                Objects.equals(place, groupFull.place) &&
                Objects.equals(banInfo, groupFull.banInfo) &&
                Objects.equals(trending, groupFull.trending);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), market, memberStatus, isFavorite, isHiddenFromFeed, isSubscribed, city, country, verified, description, wikiPage, membersCount, counters, cover, canPost, canSeeAllPosts, activity, fixedPost, canCreateTopic, canUploadDoc, canUploadVideo, status, mainAlbumId, links, contacts, site, mainSection, canMessage, isMessagesAllowed, publicDateLabel, startDate, finishDate, hasPhoto, ageLimits, place, banInfo, trending);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("GroupFull{");
        sb.append("activity='").append(activity).append('\'');
        sb.append(", admin=").append(isAdmin());
        sb.append(", adminLevel=").append(getAdminLevel());
        sb.append(", ageLimits=").append(ageLimits);
        sb.append(", banInfo=").append(banInfo);
        sb.append(", canCreateTopic=").append(canCreateTopic);
        sb.append(", canMessage=").append(canMessage);
        sb.append(", canPost=").append(canPost);
        sb.append(", canSeeAllPosts=").append(canSeeAllPosts);
        sb.append(", canUploadDoc=").append(canUploadDoc);
        sb.append(", canUploadVideo=").append(canUploadVideo);
        sb.append(", city=").append(city);
        sb.append(", contacts=").append(contacts);
        sb.append(", counters=").append(counters);
        sb.append(", country=").append(country);
        sb.append(", cover=").append(cover);
        sb.append(", deactivated='").append(getDeactivated()).append('\'');
        sb.append(", description='").append(description).append('\'');
        sb.append(", favorite=").append(isFavorite());
        sb.append(", finishDate=").append(finishDate);
        sb.append(", fixedPost=").append(fixedPost);
        sb.append(", hasPhoto=").append(hasPhoto);
        sb.append(", hiddenFromFeed=").append(isHiddenFromFeed());
        sb.append(", id='").append(getId()).append('\'');
        sb.append(", isClosed=").append(getIsClosed());
        sb.append(", isFavorite=").append(isFavorite);
        sb.append(", isHiddenFromFeed=").append(isHiddenFromFeed);
        sb.append(", isMessagesAllowed=").append(isMessagesAllowed);
        sb.append(", isSubscribed=").append(isSubscribed);
        sb.append(", links=").append(links);
        sb.append(", mainAlbumId=").append(mainAlbumId);
        sb.append(", mainSection=").append(mainSection);
        sb.append(", com.thebrodyaga.vkobjects.market=").append(market);
        sb.append(", member=").append(isMember());
        sb.append(", membersCount=").append(membersCount);
        sb.append(", memberStatus=").append(memberStatus);
        sb.append(", messagesAllowed=").append(isMessagesAllowed());
        sb.append(", name='").append(getName()).append('\'');
        sb.append(", photo100='").append(getPhoto100()).append('\'');
        sb.append(", photo200='").append(getPhoto200()).append('\'');
        sb.append(", photo50='").append(getPhoto50()).append('\'');
        sb.append(", place=").append(place);
        sb.append(", publicDateLabel='").append(publicDateLabel).append('\'');
        sb.append(", screenName='").append(getScreenName()).append('\'');
        sb.append(", site='").append(site).append('\'');
        sb.append(", startDate=").append(startDate);
        sb.append(", com.thebrodyaga.vkobjects.status='").append(status).append('\'');
        sb.append(", subscribed=").append(isSubscribed());
        sb.append(", type=").append(getType());
        sb.append(", verified=").append(verified);
        sb.append(", wikiPage='").append(wikiPage).append('\'');
        sb.append(", trending=").append(trending);
        sb.append('}');
        return sb.toString();
    }
}
