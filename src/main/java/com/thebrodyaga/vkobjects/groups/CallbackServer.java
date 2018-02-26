package com.thebrodyaga.vkobjects.groups;



import java.util.Objects;

/**
 * CallbackServer object
 */
public class CallbackServer {

    /**
     * ID
     */

    private Integer id;

    /**
     * Title
     */

    private String title;

    /**
     * Server creator ID
     */

    private Integer creatorId;

    /**
     * URL
     */

    private String url;

    /**
     * Callback API secret key
     */

    private String secretKey;

    /**
     * Status
     */

    private CallbackServerStatus status;

    public Integer getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public Integer getCreatorId() {
        return creatorId;
    }

    public String getUrl() {
        return url;
    }

    public String getSecretKey() {
        return secretKey;
    }

    public CallbackServerStatus getStatus() {
        return status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CallbackServer that = (CallbackServer) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(title, that.title) &&
                Objects.equals(creatorId, that.creatorId) &&
                Objects.equals(url, that.url) &&
                Objects.equals(secretKey, that.secretKey) &&
                status == that.status;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, creatorId, url, secretKey, status);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("CallbackServer{");
        sb.append("creatorId=").append(creatorId);
        sb.append(", id=").append(id);
        sb.append(", secretKey='").append(secretKey).append('\'');
        sb.append(", com.thebrodyaga.vkobjects.status=").append(status);
        sb.append(", title='").append(title).append('\'');
        sb.append(", url='").append(url).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
