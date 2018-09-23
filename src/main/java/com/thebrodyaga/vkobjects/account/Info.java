package com.thebrodyaga.vkobjects.account;




import java.util.Objects;

/**
 * Info object
 */
public class Info {
    /**
     * Country code
     */

    private String country;

    /**
     * Information whether HTTPS-only is enabled
     */

    private Boolean httpsRequired;

    /**
     * Information whether only owners posts should be shown
     */

    private Boolean ownPostsDefault;

    /**
     * Information whether com.thebrodyaga.vkobjects.wall comments should be hidden
     */

    private Boolean noWallReplies;

    /**
     * Information whether user has been processed intro
     */

    private Boolean intro;

    /**
     * Language ID
     */

    private Integer lang;

    /**
     * Two factor authentication is required
     */

    private Boolean twoFactorAuthRequired;

    public String getCountry() {
        return country;
    }

    public boolean isHttpsRequired() {
        return httpsRequired;
    }

    public boolean isOwnPostsDefault() {
        return ownPostsDefault;
    }

    public boolean isNoWallReplies() {
        return noWallReplies;
    }

    public boolean isIntro() {
        return intro;
    }

    public Integer getLang() {
        return lang;
    }

    public boolean isTwoFactorAuthRequired() {
        return twoFactorAuthRequired;
    }

    @Override
    public int hashCode() {
        return Objects.hash(country, intro, lang, ownPostsDefault, noWallReplies, httpsRequired);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Info info = (Info) o;
        return Objects.equals(country, info.country) &&
                Objects.equals(httpsRequired, info.httpsRequired) &&
                Objects.equals(ownPostsDefault, info.ownPostsDefault) &&
                Objects.equals(noWallReplies, info.noWallReplies) &&
                Objects.equals(intro, info.intro) &&
                Objects.equals(lang, info.lang) &&
                Objects.equals(twoFactorAuthRequired, info.twoFactorAuthRequired);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Info{");
        sb.append("country='").append(country).append("'");
        sb.append(", httpsRequired=").append(httpsRequired);
        sb.append(", ownPostsDefault=").append(ownPostsDefault);
        sb.append(", noWallReplies=").append(noWallReplies);
        sb.append(", intro=").append(intro);
        sb.append(", lang=").append(lang);
        sb.append(", twoFactorAuthRequired=").append(twoFactorAuthRequired);
        sb.append('}');
        return sb.toString();
    }
}
