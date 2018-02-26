package com.thebrodyaga.vkobjects.base;



import java.util.Objects;

/**
 * LinkApplication object
 */
public class LinkApplication {

    /**
     * Store
     */

    private LinkApplicationStore store;

    /**
     * Application id
     */

    private Integer appId;

    public LinkApplicationStore getStore() {
        return store;
    }

    public Integer getAppId() {
        return appId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LinkApplication that = (LinkApplication) o;
        return Objects.equals(store, that.store) &&
                Objects.equals(appId, that.appId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(store, appId);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("LinkApplication{");
        sb.append("store=").append(store);
        sb.append(", appId=").append(appId);
        sb.append('}');
        return sb.toString();
    }
}
