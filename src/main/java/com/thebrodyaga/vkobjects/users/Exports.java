package com.thebrodyaga.vkobjects.users;



import java.util.Objects;

/**
 * Exports object
 */
public class Exports {


    private Integer twitter;


    private Integer facebook;


    private Integer livejournal;

    public Integer getTwitter() {
        return twitter;
    }

    public Integer getFacebook() {
        return facebook;
    }

    public Integer getLivejournal() {
        return livejournal;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Exports exports = (Exports) o;
        return Objects.equals(twitter, exports.twitter) &&
                Objects.equals(facebook, exports.facebook) &&
                Objects.equals(livejournal, exports.livejournal);
    }

    @Override
    public int hashCode() {
        return Objects.hash(twitter, facebook, livejournal);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Exports{");
        sb.append("twitter=").append(twitter);
        sb.append(", facebook=").append(facebook);
        sb.append(", livejournal=").append(livejournal);
        sb.append('}');
        return sb.toString();
    }
}
