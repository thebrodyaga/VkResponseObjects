package com.thebrodyaga.vkobjects.messages;




import java.util.List;
import java.util.Objects;

/**
 * ChatFull object
 */
public class ChatFull {

    /**
     * Chat ID
     */

    private Integer id;

    /**
     * Chat type
     */

    private String type;

    /**
     * Chat title
     */

    private String title;

    /**
     * Chat creator ID
     */

    private Integer adminId;


    private List<UserXtrInvitedBy> users;


    private ChatPushSettings pushSettings;

    /**
     * URL of the preview image with 50 px in width
     */

    private String photo50;

    /**
     * URL of the preview image with 100 px in width
     */

    private String photo100;

    /**
     * URL of the preview image with 200 px in width
     */

    private String photo200;

    /**
     * Shows that user has been left the chat
     */

    private Boolean left;

    /**
     * Shows that user has been kicked from the chat
     */

    private Boolean kicked;

    public Integer getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public String getTitle() {
        return title;
    }

    public Integer getAdminId() {
        return adminId;
    }

    public List<UserXtrInvitedBy> getUsers() {
        return users;
    }

    public ChatPushSettings getPushSettings() {
        return pushSettings;
    }

    public String getPhoto50() {
        return photo50;
    }

    public String getPhoto100() {
        return photo100;
    }

    public String getPhoto200() {
        return photo200;
    }

    public boolean left() {
        return left;
    }

    public boolean kicked() {
        return kicked;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ChatFull chatFull = (ChatFull) o;
        return Objects.equals(id, chatFull.id) &&
                Objects.equals(type, chatFull.type) &&
                Objects.equals(title, chatFull.title) &&
                Objects.equals(adminId, chatFull.adminId) &&
                Objects.equals(users, chatFull.users) &&
                Objects.equals(pushSettings, chatFull.pushSettings) &&
                Objects.equals(photo50, chatFull.photo50) &&
                Objects.equals(photo100, chatFull.photo100) &&
                Objects.equals(photo200, chatFull.photo200) &&
                left == chatFull.left &&
                kicked == chatFull.kicked;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, type, title, adminId, users, pushSettings, photo50, photo100, photo200, left, kicked);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ChatFull{");
        sb.append("id=").append(id);
        sb.append(", type='").append(type).append('\'');
        sb.append(", title='").append(title).append('\'');
        sb.append(", adminId=").append(adminId);
        sb.append(", com.thebrodyaga.vkobjects.users=").append(users);
        sb.append(", pushSettings=").append(pushSettings);
        sb.append(", photo50='").append(photo50).append('\'');
        sb.append(", photo100='").append(photo100).append('\'');
        sb.append(", photo200='").append(photo200).append('\'');
        sb.append(", left=").append(left);
        sb.append(", kicked=").append(kicked);
        sb.append('}');
        return sb.toString();
    }
}
