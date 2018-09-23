package com.thebrodyaga.vkobjects.groups;


import com.thebrodyaga.vkobjects.audio.AudioFull;
import com.thebrodyaga.vkobjects.base.BaseObject;

import com.thebrodyaga.vkobjects.base.Sex;
import com.thebrodyaga.vkobjects.users.Career;
import com.thebrodyaga.vkobjects.users.CropPhoto;
import com.thebrodyaga.vkobjects.users.Exports;
import com.thebrodyaga.vkobjects.users.LastSeen;
import com.thebrodyaga.vkobjects.users.Military;
import com.thebrodyaga.vkobjects.users.Occupation;
import com.thebrodyaga.vkobjects.users.Personal;
import com.thebrodyaga.vkobjects.users.Relative;
import com.thebrodyaga.vkobjects.users.School;
import com.thebrodyaga.vkobjects.users.University;
import com.thebrodyaga.vkobjects.users.UserMin;

import java.util.List;
import java.util.Objects;

/**
 * UserXtrBanInfo object
 */
public class UserXtrBanInfo {
    /**
     * User ID
     */

    private Integer id;

    /**
     * User first name
     */

    private String firstName;

    /**
     * User last name
     */

    private String lastName;

    /**
     * Returns if a profile is deleted or blocked
     */

    private String deactivated;

    /**
     * Returns if a profile is hidden.
     */

    private Integer hidden;

    /**
     * User sex
     */

    private Sex sex;

    /**
     * Domain name of the user's page
     */

    private String screenName;

    /**
     * URL of square photo of the user with 50 pixels in width
     */

    private String photo50;

    /**
     * URL of square photo of the user with 100 pixels in width
     */

    private String photo100;

    /**
     * Information whether the user is online
     */

    private Boolean online;

    /**
     * Information whether the user is online in mobile site or application
     */

    private Boolean onlineMobile;

    /**
     * Application ID
     */

    private Integer onlineApp;

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


    private BaseObject country;

    /**
     * User's timezone
     */

    private Integer timezone;

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

    private Integer verified;

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


    private BanInfo banInfo;

    public Integer getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getDeactivated() {
        return deactivated;
    }

    public Integer getHidden() {
        return hidden;
    }

    public Sex getSex() {
        return sex;
    }

    public String getScreenName() {
        return screenName;
    }

    public String getPhoto50() {
        return photo50;
    }

    public String getPhoto100() {
        return photo100;
    }

    public boolean isOnline() {
        return online;
    }

    public boolean isOnlineMobile() {
        return online;
    }

    public Integer getOnlineApp() {
        return onlineApp;
    }

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

    public BaseObject getCountry() {
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

    public boolean wallComments() {
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

    public Integer getVerified() {
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

    public BanInfo getBanInfo() {
        return banInfo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(canSendFriendRequest, universityName, country, career, tv, bdate, occupation, banInfo, about, screenName, instagram, educationForm, deactivated, faculty, relation, quotes, movies, friendStatus, twitter, music, canSeeAudio, homeTown, universities, graduation, photoMaxOrig, games, military, id, canSeeAllPosts, homePhone, livejournal, personal, relatives, firstName, educationStatus, lastSeen, books, hasPhoto, mobilePhone, schools, domain, photo400Orig, followersCount, facultyName, facebookName, isHiddenFromFeed, statusAudio, status, isFavorite, lastName, relationPartner, hidden, activity, city, cropPhoto, timezone, exports, university, photo50, maidenName, photo200, skype, canPost, wallComments, nickname, photoMax, isFriend, commonCount, sex, hasMobile, facebook, verified, photo200Orig, photoId, blacklistedByMe, site, blacklisted, photo100, activities, online, onlineMobile, onlineApp, canWritePrivateMessage, interests);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserXtrBanInfo userXtrBanInfo = (UserXtrBanInfo) o;
        return Objects.equals(id, userXtrBanInfo.id) &&
                Objects.equals(firstName, userXtrBanInfo.firstName) &&
                Objects.equals(lastName, userXtrBanInfo.lastName) &&
                Objects.equals(deactivated, userXtrBanInfo.deactivated) &&
                Objects.equals(hidden, userXtrBanInfo.hidden) &&
                Objects.equals(sex, userXtrBanInfo.sex) &&
                Objects.equals(screenName, userXtrBanInfo.screenName) &&
                Objects.equals(photo50, userXtrBanInfo.photo50) &&
                Objects.equals(photo100, userXtrBanInfo.photo100) &&
                Objects.equals(online, userXtrBanInfo.online) &&
                Objects.equals(onlineMobile, userXtrBanInfo.onlineMobile) &&
                Objects.equals(onlineApp, userXtrBanInfo.onlineApp) &&
                Objects.equals(nickname, userXtrBanInfo.nickname) &&
                Objects.equals(maidenName, userXtrBanInfo.maidenName) &&
                Objects.equals(domain, userXtrBanInfo.domain) &&
                Objects.equals(bdate, userXtrBanInfo.bdate) &&
                Objects.equals(city, userXtrBanInfo.city) &&
                Objects.equals(country, userXtrBanInfo.country) &&
                Objects.equals(timezone, userXtrBanInfo.timezone) &&
                Objects.equals(photo200, userXtrBanInfo.photo200) &&
                Objects.equals(photoMax, userXtrBanInfo.photoMax) &&
                Objects.equals(photo200Orig, userXtrBanInfo.photo200Orig) &&
                Objects.equals(photo400Orig, userXtrBanInfo.photo400Orig) &&
                Objects.equals(photoMaxOrig, userXtrBanInfo.photoMaxOrig) &&
                Objects.equals(photoId, userXtrBanInfo.photoId) &&
                Objects.equals(hasPhoto, userXtrBanInfo.hasPhoto) &&
                Objects.equals(hasMobile, userXtrBanInfo.hasMobile) &&
                Objects.equals(isFriend, userXtrBanInfo.isFriend) &&
                Objects.equals(friendStatus, userXtrBanInfo.friendStatus) &&
                Objects.equals(wallComments, userXtrBanInfo.wallComments) &&
                Objects.equals(canPost, userXtrBanInfo.canPost) &&
                Objects.equals(canSeeAllPosts, userXtrBanInfo.canSeeAllPosts) &&
                Objects.equals(canSeeAudio, userXtrBanInfo.canSeeAudio) &&
                Objects.equals(canWritePrivateMessage, userXtrBanInfo.canWritePrivateMessage) &&
                Objects.equals(canSendFriendRequest, userXtrBanInfo.canSendFriendRequest) &&
                Objects.equals(mobilePhone, userXtrBanInfo.mobilePhone) &&
                Objects.equals(homePhone, userXtrBanInfo.homePhone) &&
                Objects.equals(skype, userXtrBanInfo.skype) &&
                Objects.equals(facebook, userXtrBanInfo.facebook) &&
                Objects.equals(facebookName, userXtrBanInfo.facebookName) &&
                Objects.equals(twitter, userXtrBanInfo.twitter) &&
                Objects.equals(livejournal, userXtrBanInfo.livejournal) &&
                Objects.equals(instagram, userXtrBanInfo.instagram) &&
                Objects.equals(site, userXtrBanInfo.site) &&
                Objects.equals(statusAudio, userXtrBanInfo.statusAudio) &&
                Objects.equals(status, userXtrBanInfo.status) &&
                Objects.equals(activity, userXtrBanInfo.activity) &&
                Objects.equals(lastSeen, userXtrBanInfo.lastSeen) &&
                Objects.equals(exports, userXtrBanInfo.exports) &&
                Objects.equals(cropPhoto, userXtrBanInfo.cropPhoto) &&
                Objects.equals(verified, userXtrBanInfo.verified) &&
                Objects.equals(followersCount, userXtrBanInfo.followersCount) &&
                Objects.equals(blacklisted, userXtrBanInfo.blacklisted) &&
                Objects.equals(blacklistedByMe, userXtrBanInfo.blacklistedByMe) &&
                Objects.equals(isFavorite, userXtrBanInfo.isFavorite) &&
                Objects.equals(isHiddenFromFeed, userXtrBanInfo.isHiddenFromFeed) &&
                Objects.equals(commonCount, userXtrBanInfo.commonCount) &&
                Objects.equals(occupation, userXtrBanInfo.occupation) &&
                Objects.equals(career, userXtrBanInfo.career) &&
                Objects.equals(military, userXtrBanInfo.military) &&
                Objects.equals(university, userXtrBanInfo.university) &&
                Objects.equals(universityName, userXtrBanInfo.universityName) &&
                Objects.equals(faculty, userXtrBanInfo.faculty) &&
                Objects.equals(facultyName, userXtrBanInfo.facultyName) &&
                Objects.equals(graduation, userXtrBanInfo.graduation) &&
                Objects.equals(educationForm, userXtrBanInfo.educationForm) &&
                Objects.equals(educationStatus, userXtrBanInfo.educationStatus) &&
                Objects.equals(homeTown, userXtrBanInfo.homeTown) &&
                Objects.equals(relation, userXtrBanInfo.relation) &&
                Objects.equals(relationPartner, userXtrBanInfo.relationPartner) &&
                Objects.equals(personal, userXtrBanInfo.personal) &&
                Objects.equals(interests, userXtrBanInfo.interests) &&
                Objects.equals(music, userXtrBanInfo.music) &&
                Objects.equals(activities, userXtrBanInfo.activities) &&
                Objects.equals(movies, userXtrBanInfo.movies) &&
                Objects.equals(tv, userXtrBanInfo.tv) &&
                Objects.equals(books, userXtrBanInfo.books) &&
                Objects.equals(games, userXtrBanInfo.games) &&
                Objects.equals(universities, userXtrBanInfo.universities) &&
                Objects.equals(schools, userXtrBanInfo.schools) &&
                Objects.equals(about, userXtrBanInfo.about) &&
                Objects.equals(relatives, userXtrBanInfo.relatives) &&
                Objects.equals(quotes, userXtrBanInfo.quotes) &&
                Objects.equals(banInfo, userXtrBanInfo.banInfo);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("UserXtrBanInfo{");
        sb.append("id=").append(id);
        sb.append(", firstName='").append(firstName).append("'");
        sb.append(", lastName='").append(lastName).append("'");
        sb.append(", deactivated='").append(deactivated).append("'");
        sb.append(", hidden=").append(hidden);
        sb.append(", sex=").append(sex);
        sb.append(", screenName='").append(screenName).append("'");
        sb.append(", photo50='").append(photo50).append("'");
        sb.append(", photo100='").append(photo100).append("'");
        sb.append(", online=").append(online);
        sb.append(", onlineMobile=").append(onlineMobile);
        sb.append(", onlineApp=").append(onlineApp);
        sb.append(", nickname='").append(nickname).append("'");
        sb.append(", maidenName='").append(maidenName).append("'");
        sb.append(", domain='").append(domain).append("'");
        sb.append(", bdate='").append(bdate).append("'");
        sb.append(", city=").append(city);
        sb.append(", country=").append(country);
        sb.append(", timezone=").append(timezone);
        sb.append(", photo200='").append(photo200).append("'");
        sb.append(", photoMax='").append(photoMax).append("'");
        sb.append(", photo200Orig='").append(photo200Orig).append("'");
        sb.append(", photo400Orig='").append(photo400Orig).append("'");
        sb.append(", photoMaxOrig='").append(photoMaxOrig).append("'");
        sb.append(", photoId='").append(photoId).append("'");
        sb.append(", hasPhoto=").append(hasPhoto);
        sb.append(", hasMobile=").append(hasMobile);
        sb.append(", isFriend=").append(isFriend);
        sb.append(", friendStatus=").append(friendStatus);
        sb.append(", wallComments=").append(wallComments);
        sb.append(", canPost=").append(canPost);
        sb.append(", canSeeAllPosts=").append(canSeeAllPosts);
        sb.append(", canSeeAudio=").append(canSeeAudio);
        sb.append(", canWritePrivateMessage=").append(canWritePrivateMessage);
        sb.append(", canSendFriendRequest=").append(canSendFriendRequest);
        sb.append(", mobilePhone='").append(mobilePhone).append("'");
        sb.append(", homePhone='").append(homePhone).append("'");
        sb.append(", skype='").append(skype).append("'");
        sb.append(", facebook='").append(facebook).append("'");
        sb.append(", facebookName='").append(facebookName).append("'");
        sb.append(", twitter='").append(twitter).append("'");
        sb.append(", livejournal='").append(livejournal).append("'");
        sb.append(", instagram='").append(instagram).append("'");
        sb.append(", site='").append(site).append("'");
        sb.append(", statusAudio=").append(statusAudio);
        sb.append(", com.thebrodyaga.vkobjects.status='").append(status).append("'");
        sb.append(", activity='").append(activity).append("'");
        sb.append(", lastSeen=").append(lastSeen);
        sb.append(", exports='").append(exports).append("'");
        sb.append(", cropPhoto=").append(cropPhoto);
        sb.append(", verified=").append(verified);
        sb.append(", followersCount=").append(followersCount);
        sb.append(", blacklisted=").append(blacklisted);
        sb.append(", blacklistedByMe=").append(blacklistedByMe);
        sb.append(", isFavorite=").append(isFavorite);
        sb.append(", isHiddenFromFeed=").append(isHiddenFromFeed);
        sb.append(", commonCount=").append(commonCount);
        sb.append(", occupation=").append(occupation);
        sb.append(", career=").append(career);
        sb.append(", military=").append(military);
        sb.append(", university=").append(university);
        sb.append(", universityName='").append(universityName).append("'");
        sb.append(", faculty=").append(faculty);
        sb.append(", facultyName='").append(facultyName).append("'");
        sb.append(", graduation=").append(graduation);
        sb.append(", educationForm='").append(educationForm).append("'");
        sb.append(", educationStatus='").append(educationStatus).append("'");
        sb.append(", homeTown='").append(homeTown).append("'");
        sb.append(", relation=").append(relation);
        sb.append(", relationPartner=").append(relationPartner);
        sb.append(", personal=").append(personal);
        sb.append(", interests='").append(interests).append("'");
        sb.append(", music='").append(music).append("'");
        sb.append(", activities='").append(activities).append("'");
        sb.append(", movies='").append(movies).append("'");
        sb.append(", tv='").append(tv).append("'");
        sb.append(", books='").append(books).append("'");
        sb.append(", games='").append(games).append("'");
        sb.append(", universities=").append(universities);
        sb.append(", schools=").append(schools);
        sb.append(", about='").append(about).append("'");
        sb.append(", relatives=").append(relatives);
        sb.append(", quotes='").append(quotes).append("'");
        sb.append(", banInfo=").append(banInfo);
        sb.append('}');
        return sb.toString();
    }
}
