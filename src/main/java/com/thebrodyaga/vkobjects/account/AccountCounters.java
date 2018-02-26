package com.thebrodyaga.vkobjects.account;



import java.util.Objects;

/**
 * AccountCounters object
 */
public class AccountCounters {
    /**
     * New com.thebrodyaga.vkobjects.friends requests number
     */

    private Integer friends;

    /**
     * New com.thebrodyaga.vkobjects.messages number
     */

    private Integer messages;

    /**
     * New photo tags number
     */

    private Integer photos;

    /**
     * New com.thebrodyaga.vkobjects.video tags number
     */

    private Integer videos;

    /**
     * New com.thebrodyaga.vkobjects.gifts number
     */

    private Integer gifts;

    /**
     * New events number
     */

    private Integer events;

    /**
     * New com.thebrodyaga.vkobjects.groups number
     */

    private Integer groups;

    /**
     * New com.thebrodyaga.vkobjects.notifications number
     */

    private Integer notifications;

    /**
     * New app_requests number
     */

    private Integer appRequests;

    /**
     * New com.thebrodyaga.vkobjects.friends suggestions number
     */

    private Integer friendsSuggestions;

    public Integer getFriends() {
        return friends;
    }

    public Integer getMessages() {
        return messages;
    }

    public Integer getPhotos() {
        return photos;
    }

    public Integer getVideos() {
        return videos;
    }

    public Integer getGifts() {
        return gifts;
    }

    public Integer getEvents() {
        return events;
    }

    public Integer getGroups() {
        return groups;
    }

    public Integer getNotifications() {
        return notifications;
    }

    public Integer getAppRequests() {
        return appRequests;
    }

    public Integer getFriendsSuggestions() {
        return friendsSuggestions;
    }

    @Override
    public int hashCode() {
        return Objects.hash(appRequests, messages, groups, videos, photos, friends, events, notifications, gifts, friendsSuggestions);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AccountCounters accountCounters = (AccountCounters) o;
        return Objects.equals(friends, accountCounters.friends) &&
                Objects.equals(messages, accountCounters.messages) &&
                Objects.equals(photos, accountCounters.photos) &&
                Objects.equals(videos, accountCounters.videos) &&
                Objects.equals(gifts, accountCounters.gifts) &&
                Objects.equals(events, accountCounters.events) &&
                Objects.equals(groups, accountCounters.groups) &&
                Objects.equals(notifications, accountCounters.notifications) &&
                Objects.equals(friendsSuggestions, accountCounters.friendsSuggestions) &&
                Objects.equals(appRequests, accountCounters.appRequests);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("AccountCounters{");
        sb.append("com.thebrodyaga.vkobjects.friends=").append(friends);
        sb.append(", com.thebrodyaga.vkobjects.messages=").append(messages);
        sb.append(", com.thebrodyaga.vkobjects.photos=").append(photos);
        sb.append(", videos=").append(videos);
        sb.append(", com.thebrodyaga.vkobjects.gifts=").append(gifts);
        sb.append(", events=").append(events);
        sb.append(", com.thebrodyaga.vkobjects.groups=").append(groups);
        sb.append(", com.thebrodyaga.vkobjects.notifications=").append(notifications);
        sb.append(", appRequests=").append(appRequests);
        sb.append(", friendsSuggestions=").append(friendsSuggestions);
        sb.append('}');
        return sb.toString();
    }
}
