package com.thebrodyaga.vkobjects.users;


import com.thebrodyaga.vkobjects.audio.AudioFull;
import com.thebrodyaga.vkobjects.base.BaseObject;

import com.thebrodyaga.vkobjects.base.Country;

import java.util.List;
import java.util.Objects;

/**
 * UserFull object
 */
public class UserFull extends User {
    /**
     * User nickname
     */

    private String nickname;

    /**
     * User maiden name
     */

    private String maidenName;

    /**
     * Domain name of the user's page
     */

    private String domain;

    /**
     * User's date of birth
     */

    private String bdate;


    private BaseObject city;


    private Country country;

    /**
     * User's timezone
     */

    private Integer timezone;

    /**
     * Information whether current user has "little light" on his page
     */

    private Boolean trending;

    /**
     * URL of square photo of the user with 200 pixels in width
     */

    private String photo200;

    /**
     * URL of square photo of the user with maximum width
     */

    private String photoMax;

    /**
     * URL of user's photo with 200 pixels in width
     */

    private String photo200Orig;

    /**
     * URL of user's photo with 400 pixels in width
     */

    private String photo400Orig;

    /**
     * URL of user's photo of maximum size
     */

    private String photoMaxOrig;

    /**
     * ID of the user's main photo
     */

    private String photoId;

    /**
     * Information whether the user has main photo
     */

    private Boolean hasPhoto;

    /**
     * Information whether the user specified his phone number
     */

    private Boolean hasMobile;

    /**
     * Information whether the user is a friend of current user
     */

    private Boolean isFriend;

    /**
     * Friend com.thebrodyaga.vkobjects.status for current user
     */

    private Integer friendStatus;

    /**
     * Information whether current user can comment com.thebrodyaga.vkobjects.wall posts
     */

    private Boolean wallComments;

    /**
     * Information whether current user can post on the user's com.thebrodyaga.vkobjects.wall
     */

    private Boolean canPost;

    /**
     * Information whether current user can see other com.thebrodyaga.vkobjects.users' com.thebrodyaga.vkobjects.audio on the com.thebrodyaga.vkobjects.wall
     */

    private Boolean canSeeAllPosts;

    /**
     * Information whether current user can see the user's com.thebrodyaga.vkobjects.audio
     */

    private Boolean canSeeAudio;

    /**
     * Information whether current user can write private message
     */

    private Boolean canWritePrivateMessage;

    /**
     * Information whether current user can send a friend request
     */

    private Boolean canSendFriendRequest;

    /**
     * Information whether current user can see
     */

    private String mobilePhone;

    /**
     * User's mobile phone number
     */

    private String homePhone;

    /**
     * User's Skype nickname
     */

    private String skype;

    /**
     * User's Facebook com.thebrodyaga.vkobjects.account
     */

    private String facebook;

    /**
     * User's Facebook name
     */

    private String facebookName;

    /**
     * User's Twitter com.thebrodyaga.vkobjects.account
     */

    private String twitter;

    /**
     * User's Livejournal com.thebrodyaga.vkobjects.account
     */

    private String livejournal;

    /**
     * User's Instagram com.thebrodyaga.vkobjects.account
     */

    private String instagram;

    /**
     * User's website
     */

    private String site;


    private AudioFull statusAudio;

    /**
     * User's com.thebrodyaga.vkobjects.status
     */

    private String status;

    /**
     * User's com.thebrodyaga.vkobjects.status
     */

    private String activity;


    private LastSeen lastSeen;


    private Exports exports;


    private CropPhoto cropPhoto;

    /**
     * Information whether the user is verified
     */

    private Boolean verified;

    /**
     * Number of user's followers
     */

    private Integer followersCount;

    /**
     * Information whether current user is in the requested user's blacklist.
     */

    private Boolean blacklisted;

    /**
     * Information whether the requested user is in current user's blacklist
     */

    private Boolean blacklistedByMe;

    /**
     * Information whether the requested user is in faves of current user
     */

    private Boolean isFavorite;

    /**
     * Information whether the requested user is hidden from current user's com.thebrodyaga.vkobjects.newsfeed
     */

    private Boolean isHiddenFromFeed;

    /**
     * Number of common com.thebrodyaga.vkobjects.friends with current user
     */

    private Integer commonCount;


    private Occupation occupation;


    private List<Career> career;


    private List<Military> military;

    /**
     * University ID
     */

    private Integer university;

    /**
     * University name
     */

    private String universityName;

    /**
     * Faculty ID
     */

    private Integer faculty;

    /**
     * Faculty name
     */

    private String facultyName;

    /**
     * Graduation year
     */

    private Integer graduation;

    /**
     * Education form
     */

    private String educationForm;

    /**
     * User's education com.thebrodyaga.vkobjects.status
     */

    private String educationStatus;

    /**
     * User hometown
     */

    private String homeTown;

    /**
     * User relationship com.thebrodyaga.vkobjects.status
     */

    private Integer relation;


    private UserMin relationPartner;


    private Personal personal;

    /**
     * User's interests
     */

    private String interests;

    /**
     * User's favorite music
     */

    private String music;

    /**
     * User's activities
     */

    private String activities;

    /**
     * User's favorite movies
     */

    private String movies;

    /**
     * User's favorite tv shows
     */

    private String tv;

    /**
     * User's favorite books
     */

    private String books;

    /**
     * User's favorite games
     */

    private String games;


    private List<University> universities;


    private List<School> schools;

    /**
     * About me field
     */

    private String about;


    private List<Relative> relatives;

    /**
     * Favorite quotes
     */

    private String quotes;

    public String getNickname() {
        return nickname;
    }

    public String getMaidenName() {
        return maidenName;
    }

    public String getDomain() {
        return domain;
    }

    public String getBdate() {
        return bdate;
    }

    public BaseObject getCity() {
        return city;
    }

    public Country getCountry() {
        return country;
    }

    public Integer getTimezone() {
        return timezone;
    }

    public String getPhoto200() {
        return photo200;
    }

    public String getPhotoMax() {
        return photoMax;
    }

    public String getPhoto200Orig() {
        return photo200Orig;
    }

    public String getPhoto400Orig() {
        return photo400Orig;
    }

    public String getPhotoMaxOrig() {
        return photoMaxOrig;
    }

    public String getPhotoId() {
        return photoId;
    }

    public boolean hasPhoto() {
        return hasPhoto;
    }

    public boolean hasMobile() {
        return hasMobile;
    }

    public boolean isFriend() {
        return isFriend;
    }

    public Integer getFriendStatus() {
        return friendStatus;
    }

    public boolean isWallComments() {
        return wallComments;
    }

    public boolean canPost() {
        return canPost;
    }

    public boolean canSeeAllPosts() {
        return canSeeAllPosts;
    }

    public boolean canSeeAudio() {
        return canSeeAudio;
    }

    public boolean canWritePrivateMessage() {
        return canWritePrivateMessage;
    }

    public boolean canSendFriendRequest() {
        return canSendFriendRequest;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public String getHomePhone() {
        return homePhone;
    }

    public String getSkype() {
        return skype;
    }

    public String getFacebook() {
        return facebook;
    }

    public String getFacebookName() {
        return facebookName;
    }

    public String getTwitter() {
        return twitter;
    }

    public String getLivejournal() {
        return livejournal;
    }

    public String getInstagram() {
        return instagram;
    }

    public String getSite() {
        return site;
    }

    public AudioFull getStatusAudio() {
        return statusAudio;
    }

    public String getStatus() {
        return status;
    }

    public String getActivity() {
        return activity;
    }

    public LastSeen getLastSeen() {
        return lastSeen;
    }

    public Exports getExports() {
        return exports;
    }

    public CropPhoto getCropPhoto() {
        return cropPhoto;
    }

    public boolean isVerified() {
        return verified;
    }

    public Integer getFollowersCount() {
        return followersCount;
    }

    public boolean isBlacklisted() {
        return blacklisted;
    }

    public boolean isBlacklistedByMe() {
        return blacklistedByMe;
    }

    public boolean isFavorite() {
        return isFavorite;
    }

    public boolean isHiddenFromFeed() {
        return isHiddenFromFeed;
    }

    public Integer getCommonCount() {
        return commonCount;
    }

    public Occupation getOccupation() {
        return occupation;
    }

    public List<Career> getCareer() {
        return career;
    }

    public List<Military> getMilitary() {
        return military;
    }

    public Integer getUniversity() {
        return university;
    }

    public String getUniversityName() {
        return universityName;
    }

    public Integer getFaculty() {
        return faculty;
    }

    public String getFacultyName() {
        return facultyName;
    }

    public Integer getGraduation() {
        return graduation;
    }

    public String getEducationForm() {
        return educationForm;
    }

    public String getEducationStatus() {
        return educationStatus;
    }

    public String getHomeTown() {
        return homeTown;
    }

    public Integer getRelation() {
        return relation;
    }

    public UserMin getRelationPartner() {
        return relationPartner;
    }

    public Personal getPersonal() {
        return personal;
    }

    public String getInterests() {
        return interests;
    }

    public String getMusic() {
        return music;
    }

    public String getActivities() {
        return activities;
    }

    public String getMovies() {
        return movies;
    }

    public String getTv() {
        return tv;
    }

    public String getBooks() {
        return books;
    }

    public String getGames() {
        return games;
    }

    public List<University> getUniversities() {
        return universities;
    }

    public List<School> getSchools() {
        return schools;
    }

    public String getAbout() {
        return about;
    }

    public List<Relative> getRelatives() {
        return relatives;
    }

    public String getQuotes() {
        return quotes;
    }

    public boolean isTrending() {
        return trending;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), canSendFriendRequest, universityName, country, career, tv, bdate, occupation, about, instagram, educationForm, faculty, relation, quotes, movies, friendStatus, twitter, music, canSeeAudio, homeTown, universities, graduation, photoMaxOrig, games, military, canSeeAllPosts, homePhone, livejournal, personal, relatives, educationStatus, lastSeen, books, hasPhoto, mobilePhone, schools, domain, photo400Orig, followersCount, facultyName, facebookName, isHiddenFromFeed, statusAudio, status, isFavorite, relationPartner, activity, city, cropPhoto, timezone, exports, university, maidenName, photo200, skype, canPost, wallComments, nickname, photoMax, isFriend, commonCount, hasMobile, facebook, verified, photo200Orig, photoId, blacklistedByMe, site, blacklisted, activities, canWritePrivateMessage, interests, trending);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        UserFull userFull = (UserFull) o;
        return Objects.equals(nickname, userFull.nickname) &&
                Objects.equals(maidenName, userFull.maidenName) &&
                Objects.equals(domain, userFull.domain) &&
                Objects.equals(bdate, userFull.bdate) &&
                Objects.equals(city, userFull.city) &&
                Objects.equals(country, userFull.country) &&
                Objects.equals(timezone, userFull.timezone) &&
                Objects.equals(photo200, userFull.photo200) &&
                Objects.equals(photoMax, userFull.photoMax) &&
                Objects.equals(photo200Orig, userFull.photo200Orig) &&
                Objects.equals(photo400Orig, userFull.photo400Orig) &&
                Objects.equals(photoMaxOrig, userFull.photoMaxOrig) &&
                Objects.equals(photoId, userFull.photoId) &&
                Objects.equals(hasPhoto, userFull.hasPhoto) &&
                Objects.equals(hasMobile, userFull.hasMobile) &&
                Objects.equals(isFriend, userFull.isFriend) &&
                Objects.equals(friendStatus, userFull.friendStatus) &&
                Objects.equals(wallComments, userFull.wallComments) &&
                Objects.equals(canPost, userFull.canPost) &&
                Objects.equals(canSeeAllPosts, userFull.canSeeAllPosts) &&
                Objects.equals(canSeeAudio, userFull.canSeeAudio) &&
                Objects.equals(canWritePrivateMessage, userFull.canWritePrivateMessage) &&
                Objects.equals(canSendFriendRequest, userFull.canSendFriendRequest) &&
                Objects.equals(mobilePhone, userFull.mobilePhone) &&
                Objects.equals(homePhone, userFull.homePhone) &&
                Objects.equals(skype, userFull.skype) &&
                Objects.equals(facebook, userFull.facebook) &&
                Objects.equals(facebookName, userFull.facebookName) &&
                Objects.equals(twitter, userFull.twitter) &&
                Objects.equals(livejournal, userFull.livejournal) &&
                Objects.equals(instagram, userFull.instagram) &&
                Objects.equals(site, userFull.site) &&
                Objects.equals(statusAudio, userFull.statusAudio) &&
                Objects.equals(status, userFull.status) &&
                Objects.equals(activity, userFull.activity) &&
                Objects.equals(lastSeen, userFull.lastSeen) &&
                Objects.equals(exports, userFull.exports) &&
                Objects.equals(cropPhoto, userFull.cropPhoto) &&
                Objects.equals(verified, userFull.verified) &&
                Objects.equals(followersCount, userFull.followersCount) &&
                Objects.equals(blacklisted, userFull.blacklisted) &&
                Objects.equals(blacklistedByMe, userFull.blacklistedByMe) &&
                Objects.equals(isFavorite, userFull.isFavorite) &&
                Objects.equals(isHiddenFromFeed, userFull.isHiddenFromFeed) &&
                Objects.equals(commonCount, userFull.commonCount) &&
                Objects.equals(occupation, userFull.occupation) &&
                Objects.equals(career, userFull.career) &&
                Objects.equals(military, userFull.military) &&
                Objects.equals(university, userFull.university) &&
                Objects.equals(universityName, userFull.universityName) &&
                Objects.equals(faculty, userFull.faculty) &&
                Objects.equals(facultyName, userFull.facultyName) &&
                Objects.equals(graduation, userFull.graduation) &&
                Objects.equals(educationForm, userFull.educationForm) &&
                Objects.equals(educationStatus, userFull.educationStatus) &&
                Objects.equals(homeTown, userFull.homeTown) &&
                Objects.equals(relation, userFull.relation) &&
                Objects.equals(relationPartner, userFull.relationPartner) &&
                Objects.equals(personal, userFull.personal) &&
                Objects.equals(interests, userFull.interests) &&
                Objects.equals(music, userFull.music) &&
                Objects.equals(activities, userFull.activities) &&
                Objects.equals(movies, userFull.movies) &&
                Objects.equals(tv, userFull.tv) &&
                Objects.equals(books, userFull.books) &&
                Objects.equals(games, userFull.games) &&
                Objects.equals(universities, userFull.universities) &&
                Objects.equals(schools, userFull.schools) &&
                Objects.equals(about, userFull.about) &&
                Objects.equals(relatives, userFull.relatives) &&
                Objects.equals(quotes, userFull.quotes) &&
                Objects.equals(trending, userFull.trending);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("UserFull{");
        sb.append("about='").append(about).append('\'');
        sb.append(", activities='").append(activities).append('\'');
        sb.append(", activity='").append(activity).append('\'');
        sb.append(", bdate='").append(bdate).append('\'');
        sb.append(", blacklisted=").append(blacklisted);
        sb.append(", blacklistedByMe=").append(blacklistedByMe);
        sb.append(", books='").append(books).append('\'');
        sb.append(", canPost=").append(canPost);
        sb.append(", canSeeAllPosts=").append(canSeeAllPosts);
        sb.append(", canSeeAudio=").append(canSeeAudio);
        sb.append(", canSendFriendRequest=").append(canSendFriendRequest);
        sb.append(", canWritePrivateMessage=").append(canWritePrivateMessage);
        sb.append(", career=").append(career);
        sb.append(", city=").append(city);
        sb.append(", commonCount=").append(commonCount);
        sb.append(", country=").append(country);
        sb.append(", cropPhoto=").append(cropPhoto);
        sb.append(", deactivated='").append(getDeactivated()).append('\'');
        sb.append(", domain='").append(domain).append('\'');
        sb.append(", educationForm='").append(educationForm).append('\'');
        sb.append(", educationStatus='").append(educationStatus).append('\'');
        sb.append(", exports=").append(exports);
        sb.append(", facebook='").append(facebook).append('\'');
        sb.append(", facebookName='").append(facebookName).append('\'');
        sb.append(", faculty=").append(faculty);
        sb.append(", facultyName='").append(facultyName).append('\'');
        sb.append(", favorite=").append(isFavorite());
        sb.append(", firstName='").append(getFirstName()).append('\'');
        sb.append(", followersCount=").append(followersCount);
        sb.append(", friend=").append(isFriend());
        sb.append(", friendStatus=").append(friendStatus);
        sb.append(", games='").append(games).append('\'');
        sb.append(", graduation=").append(graduation);
        sb.append(", hasMobile=").append(hasMobile);
        sb.append(", hasPhoto=").append(hasPhoto);
        sb.append(", hidden=").append(getHidden());
        sb.append(", hiddenFromFeed=").append(isHiddenFromFeed());
        sb.append(", homePhone='").append(homePhone).append('\'');
        sb.append(", homeTown='").append(homeTown).append('\'');
        sb.append(", id=").append(getId());
        sb.append(", instagram='").append(instagram).append('\'');
        sb.append(", interests='").append(interests).append('\'');
        sb.append(", isFavorite=").append(isFavorite);
        sb.append(", isFriend=").append(isFriend);
        sb.append(", isHiddenFromFeed=").append(isHiddenFromFeed);
        sb.append(", lastName='").append(getLastName()).append('\'');
        sb.append(", lastSeen=").append(lastSeen);
        sb.append(", livejournal='").append(livejournal).append('\'');
        sb.append(", maidenName='").append(maidenName).append('\'');
        sb.append(", military=").append(military);
        sb.append(", mobilePhone='").append(mobilePhone).append('\'');
        sb.append(", movies='").append(movies).append('\'');
        sb.append(", music='").append(music).append('\'');
        sb.append(", nickname='").append(nickname).append('\'');
        sb.append(", occupation=").append(occupation);
        sb.append(", online=").append(isOnline());
        sb.append(", onlineApp=").append(getOnlineApp());
        sb.append(", onlineMobile=").append(isOnlineMobile());
        sb.append(", personal=").append(personal);
        sb.append(", photo100='").append(getPhoto100()).append('\'');
        sb.append(", photo200='").append(photo200).append('\'');
        sb.append(", photo200Orig='").append(photo200Orig).append('\'');
        sb.append(", photo400Orig='").append(photo400Orig).append('\'');
        sb.append(", photo50='").append(getPhoto50()).append('\'');
        sb.append(", photoId='").append(photoId).append('\'');
        sb.append(", photoMax='").append(photoMax).append('\'');
        sb.append(", photoMaxOrig='").append(photoMaxOrig).append('\'');
        sb.append(", quotes='").append(quotes).append('\'');
        sb.append(", relation=").append(relation);
        sb.append(", relationPartner=").append(relationPartner);
        sb.append(", relatives=").append(relatives);
        sb.append(", schools=").append(schools);
        sb.append(", screenName='").append(getScreenName()).append('\'');
        sb.append(", sex=").append(getSex());
        sb.append(", site='").append(site).append('\'');
        sb.append(", skype='").append(skype).append('\'');
        sb.append(", com.thebrodyaga.vkobjects.status='").append(status).append('\'');
        sb.append(", statusAudio=").append(statusAudio);
        sb.append(", timezone=").append(timezone);
        sb.append(", tv='").append(tv).append('\'');
        sb.append(", twitter='").append(twitter).append('\'');
        sb.append(", universities=").append(universities);
        sb.append(", university=").append(university);
        sb.append(", universityName='").append(universityName).append('\'');
        sb.append(", verified=").append(verified);
        sb.append(", wallComments=").append(wallComments);
        sb.append(", trending=").append(trending);
        sb.append('}');
        return sb.toString();
    }
}
