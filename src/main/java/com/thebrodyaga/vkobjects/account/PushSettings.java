package com.thebrodyaga.vkobjects.account;




import java.util.Objects;

/**
 * PushSettings object
 */
public class PushSettings {
    /**
     * Information whether com.thebrodyaga.vkobjects.notifications are disabled
     */

    private Boolean disabled;

    /**
     * Time until that com.thebrodyaga.vkobjects.notifications are disabled in Unixtime
     */

    private Integer disabledUntil;


    private PushConversations conversations;


    private PushParams settings;

    public boolean isDisabled() {
        return disabled;
    }

    public Integer getDisabledUntil() {
        return disabledUntil;
    }

    public PushConversations getConversations() {
        return conversations;
    }

    public PushParams getSettings() {
        return settings;
    }

    @Override
    public int hashCode() {
        return Objects.hash(settings, disabled, disabledUntil, conversations);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PushSettings pushSettings = (PushSettings) o;
        return Objects.equals(disabled, pushSettings.disabled) &&
                Objects.equals(disabledUntil, pushSettings.disabledUntil) &&
                Objects.equals(conversations, pushSettings.conversations) &&
                Objects.equals(settings, pushSettings.settings);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PushSettings{");
        sb.append("disabled=").append(disabled);
        sb.append(", disabledUntil=").append(disabledUntil);
        sb.append(", conversations=").append(conversations);
        sb.append(", settings=").append(settings);
        sb.append('}');
        return sb.toString();
    }
}
