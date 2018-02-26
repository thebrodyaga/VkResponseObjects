package com.thebrodyaga.vkobjects.audio;



import java.util.Objects;

/**
 * Audio object
 */
public class Audio {
    /**
     * Audio ID
     */

    private Integer id;

    /**
     * Audio owner's ID
     */

    private Integer ownerId;

    /**
     * Artist name
     */

    private String artist;

    /**
     * Title
     */

    private String title;

    /**
     * URL of mp3 file
     */

    private String url;

    /**
     * Access key for the com.thebrodyaga.vkobjects.audio
     */

    private String accessKey;

    public Integer getId() {
        return id;
    }

    public Integer getOwnerId() {
        return ownerId;
    }

    public String getArtist() {
        return artist;
    }

    public String getTitle() {
        return title;
    }

    public String getUrl() {
        return url;
    }

    public String getAccessKey() {
        return accessKey;
    }

    @Override
    public int hashCode() {
        return Objects.hash(artist, accessKey, id, ownerId, title, url);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Audio audio = (Audio) o;
        return Objects.equals(id, audio.id) &&
                Objects.equals(ownerId, audio.ownerId) &&
                Objects.equals(artist, audio.artist) &&
                Objects.equals(title, audio.title) &&
                Objects.equals(url, audio.url) &&
                Objects.equals(accessKey, audio.accessKey);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Audio{");
        sb.append("id=").append(id);
        sb.append(", ownerId=").append(ownerId);
        sb.append(", artist='").append(artist).append("'");
        sb.append(", title='").append(title).append("'");
        sb.append(", url='").append(url).append("'");
        sb.append(", accessKey='").append(accessKey).append("'");
        sb.append('}');
        return sb.toString();
    }
}
