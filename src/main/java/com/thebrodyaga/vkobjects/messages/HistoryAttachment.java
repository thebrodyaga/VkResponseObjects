package com.thebrodyaga.vkobjects.messages;



import java.util.Objects;

/**
 * HistoryAttachment object
 */
public class HistoryAttachment {

    private Integer messageId;


    private HistoryMessageAttachment attachment;

    public Integer getMessageId() {
        return messageId;
    }

    public HistoryMessageAttachment getAttachment() {
        return attachment;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HistoryAttachment that = (HistoryAttachment) o;
        return Objects.equals(messageId, that.messageId) &&
                Objects.equals(attachment, that.attachment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(messageId, attachment);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("HistoryAttachment{");
        sb.append("messageId=").append(messageId);
        sb.append(", attachment=").append(attachment);
        sb.append('}');
        return sb.toString();
    }
}
