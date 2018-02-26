package com.thebrodyaga.vkobjects.messages;



import java.util.Objects;

/**
 * Created by Anton Tsivarev on 11.08.17.
 */
public class MultiSend {


    private Integer peerId;


    private Integer messageId;


    private MultiSendError error;

    public Integer getPeerId() {
        return peerId;
    }

    public Integer getMessageId() {
        return messageId;
    }

    public MultiSendError getError() {
        return error;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MultiSend that = (MultiSend) o;
        return Objects.equals(peerId, that.peerId) &&
                Objects.equals(messageId, that.messageId) &&
                Objects.equals(error, that.error);
    }

    @Override
    public int hashCode() {
        return Objects.hash(peerId, messageId, error);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("MultiSend{");
        sb.append("error=").append(error);
        sb.append(", messageId=").append(messageId);
        sb.append(", peerId=").append(peerId);
        sb.append('}');
        return sb.toString();
    }
}
