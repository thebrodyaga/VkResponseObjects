package com.thebrodyaga.vkobjects.audio;




import java.util.Objects;

/**
 * AudioFull object
 */
public class AudioFull extends Audio {
    /**
     * Duration in seconds
     */

    private Integer duration;

    /**
     * Date when uploaded
     */

    private Integer date;

    /**
     * Album ID
     */

    private Integer albumId;

    /**
     * Lyrics ID
     */

    private Integer lyricsId;

    /**
     * Genre ID
     */

    private Integer genreId;

    /**
     * Information whether the com.thebrodyaga.vkobjects.audio is hidden from com.thebrodyaga.vkobjects.search
     */

    private Boolean noSearch;

    public Integer getDuration() {
        return duration;
    }

    public Integer getDate() {
        return date;
    }

    public Integer getAlbumId() {
        return albumId;
    }

    public Integer getLyricsId() {
        return lyricsId;
    }

    public Integer getGenreId() {
        return genreId;
    }

    public boolean isNoSearch() {
        return noSearch;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), duration, date, lyricsId, genreId, albumId, noSearch);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        AudioFull audioFull = (AudioFull) o;
        return Objects.equals(duration, audioFull.duration) &&
                Objects.equals(date, audioFull.date) &&
                Objects.equals(albumId, audioFull.albumId) &&
                Objects.equals(lyricsId, audioFull.lyricsId) &&
                Objects.equals(genreId, audioFull.genreId) &&
                Objects.equals(noSearch, audioFull.noSearch);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("AudioFull{");
        sb.append("accessKey='").append(getAccessKey()).append('\'');
        sb.append(", albumId=").append(albumId);
        sb.append(", artist='").append(getArtist()).append('\'');
        sb.append(", date=").append(date);
        sb.append(", duration=").append(duration);
        sb.append(", genreId=").append(genreId);
        sb.append(", id=").append(getId());
        sb.append(", lyricsId=").append(lyricsId);
        sb.append(", noSearch=").append(noSearch);
        sb.append(", ownerId=").append(getOwnerId());
        sb.append(", title='").append(getTitle()).append('\'');
        sb.append(", url='").append(getUrl()).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
