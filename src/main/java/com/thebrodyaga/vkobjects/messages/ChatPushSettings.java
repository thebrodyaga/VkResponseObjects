package com.thebrodyaga.vkobjects.messages;


import com.thebrodyaga.vkobjects.base.BoolInt;

import java.util.Objects;

/**
 * ChatPushSettings object
 */
public class ChatPushSettings {
    /**
     * Information whether the sound is on
     */

    private BoolInt sound;

    /**
     * Time until that com.thebrodyaga.vkobjects.notifications are disabled
     */

    private Integer disabledUntil;

    public boolean isSound() {
        return sound == BoolInt.YES;
    }

    public Integer getDisabledUntil() {
        return disabledUntil;
    }

    @Override
    public int hashCode() {
        return Objects.hash(sound, disabledUntil);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ChatPushSettings chatPushSettings = (ChatPushSettings) o;
        return Objects.equals(sound, chatPushSettings.sound) &&
                Objects.equals(disabledUntil, chatPushSettings.disabledUntil);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ChatPushSettings{");
        sb.append("sound=").append(sound);
        sb.append(", disabledUntil=").append(disabledUntil);
        sb.append('}');
        return sb.toString();
    }
}
