package com.thebrodyaga.vkobjects.groups.responses;



import java.util.Objects;

/**
 * AddCallbackServerResponse object
 */
public class AddCallbackServerResponse {

    /**
     * Server ID
     */

    private Integer serverId;

    public Integer getServerId() {
        return serverId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AddCallbackServerResponse that = (AddCallbackServerResponse) o;
        return Objects.equals(serverId, that.serverId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(serverId);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("AddCallbackServerResponse{");
        sb.append("serverId=").append(serverId);
        sb.append('}');
        return sb.toString();
    }
}
