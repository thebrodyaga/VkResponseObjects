package com.thebrodyaga.vkobjects.users;



import java.util.Objects;

/**
 * UserCounters object
 */
public class UserCounters {
    /**
     * Albums number
     */

    private Integer albums;

    /**
     * Videos number
     */

    private Integer videos;

    /**
     * Audios number
     */

    private Integer audios;

    /**
     * Notes number
     */

    private Integer notes;

    /**
     * Photos number
     */

    private Integer photos;

    /**
     * Communities number
     */

    private Integer groups;

    /**
     * Gifts number
     */

    private Integer gifts;

    /**
     * Friends number
     */

    private Integer friends;

    /**
     * Online com.thebrodyaga.vkobjects.friends number
     */

    private Integer onlineFriends;

    /**
     * Number of com.thebrodyaga.vkobjects.photos with user
     */

    private Integer userPhotos;

    /**
     * Number of videos with user
     */

    private Integer userVideos;

    /**
     * Followers number
     */

    private Integer followers;

    /**
     * Subscriptions number
     */

    private Integer subscriptions;

    /**
     * Public com.thebrodyaga.vkobjects.pages number
     */

    private Integer pages;

    public Integer getAlbums() {
        return albums;
    }

    public Integer getVideos() {
        return videos;
    }

    public Integer getAudios() {
        return audios;
    }

    public Integer getNotes() {
        return notes;
    }

    public Integer getPhotos() {
        return photos;
    }

    public Integer getGroups() {
        return groups;
    }

    public Integer getGifts() {
        return gifts;
    }

    public Integer getFriends() {
        return friends;
    }

    public Integer getOnlineFriends() {
        return onlineFriends;
    }

    public Integer getUserPhotos() {
        return userPhotos;
    }

    public Integer getUserVideos() {
        return userVideos;
    }

    public Integer getFollowers() {
        return followers;
    }

    public Integer getSubscriptions() {
        return subscriptions;
    }

    public Integer getPages() {
        return pages;
    }

    @Override
    public int hashCode() {
        return Objects.hash(userVideos, albums, subscriptions, notes, groups, videos, photos, friends, userPhotos, onlineFriends, followers, pages, audios, gifts);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserCounters userCounters = (UserCounters) o;
        return Objects.equals(albums, userCounters.albums) &&
                Objects.equals(videos, userCounters.videos) &&
                Objects.equals(audios, userCounters.audios) &&
                Objects.equals(notes, userCounters.notes) &&
                Objects.equals(photos, userCounters.photos) &&
                Objects.equals(groups, userCounters.groups) &&
                Objects.equals(gifts, userCounters.gifts) &&
                Objects.equals(friends, userCounters.friends) &&
                Objects.equals(onlineFriends, userCounters.onlineFriends) &&
                Objects.equals(userPhotos, userCounters.userPhotos) &&
                Objects.equals(userVideos, userCounters.userVideos) &&
                Objects.equals(followers, userCounters.followers) &&
                Objects.equals(subscriptions, userCounters.subscriptions) &&
                Objects.equals(pages, userCounters.pages);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("UserCounters{");
        sb.append("albums=").append(albums);
        sb.append(", videos=").append(videos);
        sb.append(", audios=").append(audios);
        sb.append(", com.thebrodyaga.vkobjects.notes=").append(notes);
        sb.append(", com.thebrodyaga.vkobjects.photos=").append(photos);
        sb.append(", com.thebrodyaga.vkobjects.groups=").append(groups);
        sb.append(", com.thebrodyaga.vkobjects.gifts=").append(gifts);
        sb.append(", com.thebrodyaga.vkobjects.friends=").append(friends);
        sb.append(", onlineFriends=").append(onlineFriends);
        sb.append(", userPhotos=").append(userPhotos);
        sb.append(", userVideos=").append(userVideos);
        sb.append(", followers=").append(followers);
        sb.append(", subscriptions=").append(subscriptions);
        sb.append(", com.thebrodyaga.vkobjects.pages=").append(pages);
        sb.append('}');
        return sb.toString();
    }
}
