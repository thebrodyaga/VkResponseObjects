package com.thebrodyaga.vkobjects.messages;



import com.thebrodyaga.vkobjects.base.Geo;

import java.util.List;
import java.util.Objects;

/**
 * Message object
 */
public class Message {
    /**
     * Message ID
     */

    private Integer id;

    /**
     * Date when the message has been sent in Unixtime
     */

    private Integer date;

    /**
     * Information whether the message is outcoming
     */

    private Boolean out;

    /**
     * Message author's ID
     */

    private Integer userId;

    /**
     * Message author's ID
     */

    private Integer fromId;

    /**
     * ID used for sending com.thebrodyaga.vkobjects.messages. It returned only for outgoing com.thebrodyaga.vkobjects.messages
     */

    private Integer randomId;

    /**
     * Is it an important message
     */

    private Boolean important;

    /**
     * Is it an deleted message
     */

    private Boolean deleted;

    /**
     * Whether the message contains smiles
     */

    private Boolean emoji;

    /**
     * Forwarded com.thebrodyaga.vkobjects.messages
     */

    private List<Message> fwdMessages;

    /**
     * Information whether the com.thebrodyaga.vkobjects.messages is read
     */

    private Boolean readState;

    /**
     * Message title or chat title
     */

    private String title;

    /**
     * Message text
     */

    private String body;


    private List<MessageAttachment> attachments;

    /**
     * Chat ID
     */

    private Integer chatId;


    private List<Integer> chatActive;

    /**
     * Push settings for the chat
     */

    private ChatPushSettings pushSettings;

    /**
     * Action type
     */

    private Action action;

    /**
     * User or email ID has been invited to the chat or kicked from the chat
     */

    private Integer actionMid;

    /**
     * Email has been invited or kicked
     */

    private String actionEmail;

    /**
     * Action text
     */

    private String actionText;

    /**
     * Chat com.thebrodyaga.vkobjects.users number
     */

    private Integer usersCount;

    /**
     * Chat administrator ID
     */

    private Integer adminId;

    /**
     * URL of the preview image with 50px in width
     */

    private String photo50;

    /**
     * URL of the preview image with 100px in width
     */

    private String photo100;

    /**
     * URL of the preview image with 200px in width
     */

    private String photo200;


    private Geo geo;

    public Integer getId() {
        return id;
    }

    public Integer getDate() {
        return date;
    }

    public boolean isOut() {
        return out;
    }

    public Integer getUserId() {
        return userId;
    }

    public Integer getFromId() {
        return fromId;
    }

    public Integer getRandomId() {
        return randomId;
    }

    public boolean getImportant() {
        return important;
    }

    public boolean getDeleted() {
        return deleted;
    }

    public boolean getEmoji() {
        return emoji;
    }

    public List<Message> getFwdMessages() {
        return fwdMessages;
    }

    public boolean isReadState() {
        return readState;
    }

    public String getTitle() {
        return title;
    }

    public String getBody() {
        return body;
    }

    public List<MessageAttachment> getAttachments() {
        return attachments;
    }

    public Integer getChatId() {
        return chatId;
    }

    public List<Integer> getChatActive() {
        return chatActive;
    }

    public ChatPushSettings getPushSettings() {
        return pushSettings;
    }

    public Action getAction() {
        return action;
    }

    public Integer getActionMid() {
        return actionMid;
    }

    public String getActionEmail() {
        return actionEmail;
    }

    public String getActionText() {
        return actionText;
    }

    public Integer getUsersCount() {
        return usersCount;
    }

    public Integer getAdminId() {
        return adminId;
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

    public Geo getGeo() {
        return geo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, date, out, userId, fromId, randomId, important, deleted, emoji, fwdMessages, readState, title, body, attachments, chatId, chatActive, pushSettings, action, actionMid, actionEmail, actionText, usersCount, adminId, photo50, photo100, photo200, geo);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Message message = (Message) o;
        return Objects.equals(id, message.id) &&
                Objects.equals(date, message.date) &&
                out == message.out &&
                Objects.equals(userId, message.userId) &&
                Objects.equals(fromId, message.fromId) &&
                Objects.equals(randomId, message.randomId) &&
                important == message.important &&
                deleted == message.deleted &&
                emoji == message.emoji &&
                Objects.equals(fwdMessages, message.fwdMessages) &&
                readState == message.readState &&
                Objects.equals(title, message.title) &&
                Objects.equals(body, message.body) &&
                Objects.equals(attachments, message.attachments) &&
                Objects.equals(chatId, message.chatId) &&
                Objects.equals(chatActive, message.chatActive) &&
                Objects.equals(pushSettings, message.pushSettings) &&
                action == message.action &&
                Objects.equals(actionMid, message.actionMid) &&
                Objects.equals(actionEmail, message.actionEmail) &&
                Objects.equals(actionText, message.actionText) &&
                Objects.equals(usersCount, message.usersCount) &&
                Objects.equals(adminId, message.adminId) &&
                Objects.equals(photo50, message.photo50) &&
                Objects.equals(photo100, message.photo100) &&
                Objects.equals(photo200, message.photo200) &&
                Objects.equals(geo, message.geo);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Message{");
        sb.append("id=").append(id);
        sb.append(", date=").append(date);
        sb.append(", out=").append(out);
        sb.append(", userId=").append(userId);
        sb.append(", fromId=").append(fromId);
        sb.append(", randomId=").append(randomId);
        sb.append(", important=").append(important);
        sb.append(", deleted=").append(deleted);
        sb.append(", emoji=").append(emoji);
        sb.append(", fwdMessages=").append(fwdMessages);
        sb.append(", readState=").append(readState);
        sb.append(", title='").append(title).append('\'');
        sb.append(", body='").append(body).append('\'');
        sb.append(", attachments=").append(attachments);
        sb.append(", chatId=").append(chatId);
        sb.append(", chatActive=").append(chatActive);
        sb.append(", pushSettings=").append(pushSettings);
        sb.append(", action=").append(action);
        sb.append(", actionMid=").append(actionMid);
        sb.append(", actionEmail='").append(actionEmail).append('\'');
        sb.append(", actionText='").append(actionText).append('\'');
        sb.append(", usersCount=").append(usersCount);
        sb.append(", adminId=").append(adminId);
        sb.append(", photo50='").append(photo50).append('\'');
        sb.append(", photo100='").append(photo100).append('\'');
        sb.append(", photo200='").append(photo200).append('\'');
        sb.append(", geo=").append(geo);
        sb.append('}');
        return sb.toString();
    }
}
