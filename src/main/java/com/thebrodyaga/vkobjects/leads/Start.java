package com.thebrodyaga.vkobjects.leads;




import java.util.Objects;

/**
 * Start object
 */
public class Start {
    /**
     * Information whether test mode is enabled
     */

    private Boolean testMode;

    /**
     * Session data
     */

    private String vkSid;

    public boolean isTestMode() {
        return testMode;
    }

    public String getVkSid() {
        return vkSid;
    }

    @Override
    public int hashCode() {
        return Objects.hash(testMode, vkSid);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Start start = (Start) o;
        return Objects.equals(testMode, start.testMode) &&
                Objects.equals(vkSid, start.vkSid);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Start{");
        sb.append("testMode=").append(testMode);
        sb.append(", vkSid='").append(vkSid).append("'");
        sb.append('}');
        return sb.toString();
    }
}
