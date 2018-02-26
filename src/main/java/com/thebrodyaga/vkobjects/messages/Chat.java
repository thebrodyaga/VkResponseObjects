package com.thebrodyaga.vkobjects.messages;


import com.thebrodyaga.vkobjects.base.BoolInt;

import java.util.List;
import java.util.Objects;

/**
 * Chat object
 */
public class Chat {

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


    private List<Integer> users;


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

    private BoolInt left;

    /**
     * Shows that user has been kicked from the chat
     */

    private BoolInt kicked;

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

    public List<Integer> getUsers() {
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
        return left == BoolInt.YES;
    }

    public boolean kicked() {
        return kicked == BoolInt.YES;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Chat chat = (Chat) o;
        return Objects.equals(id, chat.id) &&
                Objects.equals(type, chat.type) &&
                Objects.equals(title, chat.title) &&
                Objects.equals(adminId, chat.adminId) &&
                Objects.equals(users, chat.users) &&
                Objects.equals(pushSettings, chat.pushSettings) &&
                Objects.equals(photo50, chat.photo50) &&
                Objects.equals(photo100, chat.photo100) &&
                Objects.equals(photo200, chat.photo200) &&
                left == chat.left &&
                kicked == chat.kicked;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, type, title, adminId, users, pushSettings, photo50, photo100, photo200, left, kicked);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Chat{");
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
