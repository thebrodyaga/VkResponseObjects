package com.thebrodyaga.vkobjects.groups;



import java.util.Objects;

/**
 * CountersGroup object
 */
public class CountersGroup {
    /**
     * Photos number
     */

    private Integer photos;

    /**
     * Photo albums number
     */

    private Integer albums;

    /**
     * Topics number
     */

    private Integer topics;

    /**
     * Videos number
     */

    private Integer videos;

    /**
     * Audios number
     */

    private Integer audios;

    /**
     * Docs number
     */

    private Integer docs;

    /**
     * Market items number
     */

    private Integer market;

    public Integer getPhotos() {
        return photos;
    }

    public Integer getAlbums() {
        return albums;
    }

    public Integer getTopics() {
        return topics;
    }

    public Integer getVideos() {
        return videos;
    }

    public Integer getAudios() {
        return audios;
    }

    public Integer getDocs() {
        return docs;
    }

    public Integer getMarket() {
        return market;
    }

    @Override
    public int hashCode() {
        return Objects.hash(market, albums, docs, topics, audios, videos, photos);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CountersGroup countersGroup = (CountersGroup) o;
        return Objects.equals(photos, countersGroup.photos) &&
                Objects.equals(albums, countersGroup.albums) &&
                Objects.equals(topics, countersGroup.topics) &&
                Objects.equals(videos, countersGroup.videos) &&
                Objects.equals(audios, countersGroup.audios) &&
                Objects.equals(docs, countersGroup.docs) &&
                Objects.equals(market, countersGroup.market);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("CountersGroup{");
        sb.append("com.thebrodyaga.vkobjects.photos=").append(photos);
        sb.append(", albums=").append(albums);
        sb.append(", topics=").append(topics);
        sb.append(", videos=").append(videos);
        sb.append(", audios=").append(audios);
        sb.append(", com.thebrodyaga.vkobjects.docs=").append(docs);
        sb.append(", com.thebrodyaga.vkobjects.market=").append(market);
        sb.append('}');
        return sb.toString();
    }
}
