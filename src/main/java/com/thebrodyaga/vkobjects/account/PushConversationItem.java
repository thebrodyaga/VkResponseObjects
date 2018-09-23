package com.thebrodyaga.vkobjects.account;




import java.util.Objects;

/**
 * PushConversationItem object
 */
public class PushConversationItem {

    /**
     * Peer ID
     */

    private Integer peerId;

    /**
     * Information whether the sound are enabled
     */

    private Boolean sound;

    /**
     * Time until that com.thebrodyaga.vkobjects.notifications are disabled in seconds
     */

    private Integer disabledUntil;

    public Integer getPeerId() {
        return peerId;
    }

    public boolean isSound() {
        return sound;
    }

    public Integer getDisabledUntil() {
        return disabledUntil;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PushConversationItem that = (PushConversationItem) o;
        return Objects.equals(peerId, that.peerId) &&
                sound == that.sound &&
                Objects.equals(disabledUntil, that.disabledUntil);
    }

    @Override
    public int hashCode() {
        return Objects.hash(peerId, sound, disabledUntil);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PushConversationItem{");
        sb.append("peerId=").append(peerId);
        sb.append(", sound=").append(sound);
        sb.append(", disabledUntil=").append(disabledUntil);
        sb.append('}');
        return sb.toString();
    }
}
