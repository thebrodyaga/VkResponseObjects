package com.thebrodyaga.vkobjects.utils;



import java.util.Objects;

/**
 * LastShortenedLink object
 */
public class LastShortenedLink {
    /**
     * Creation time in Unixtime
     */

    private Integer timestamp;

    /**
     * Full URL
     */

    private String url;

    /**
     * Shortened URL
     */

    private String shortUrl;

    /**
     * Link key (characters after "vk.cc")
     */

    private String key;

    /**
     * Views number
     */

    private Integer views;

    /**
     * Access key for private com.thebrodyaga.vkobjects.stats
     */

    private String accessKey;

    public Integer getTimestamp() {
        return timestamp;
    }

    public String getUrl() {
        return url;
    }

    public String getShortUrl() {
        return shortUrl;
    }

    public String getKey() {
        return key;
    }

    public Integer getViews() {
        return views;
    }

    public String getAccessKey() {
        return accessKey;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LastShortenedLink that = (LastShortenedLink) o;
        return Objects.equals(timestamp, that.timestamp) &&
                Objects.equals(url, that.url) &&
                Objects.equals(shortUrl, that.shortUrl) &&
                Objects.equals(key, that.key) &&
                Objects.equals(views, that.views) &&
                Objects.equals(accessKey, that.accessKey);
    }

    @Override
    public int hashCode() {
        return Objects.hash(timestamp, url, shortUrl, key, views, accessKey);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("LastShortenedLink{");
        sb.append("timestamp=").append(timestamp);
        sb.append(", url='").append(url).append('\'');
        sb.append(", shortUrl='").append(shortUrl).append('\'');
        sb.append(", key='").append(key).append('\'');
        sb.append(", views=").append(views);
        sb.append(", accessKey='").append(accessKey).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
