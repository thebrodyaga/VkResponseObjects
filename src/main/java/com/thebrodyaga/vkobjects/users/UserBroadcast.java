package com.thebrodyaga.vkobjects.users;


import com.thebrodyaga.vkobjects.audio.AudioFull;

import java.util.Objects;

/**
 * UserBroadcast object
 */
public class UserBroadcast extends UserMin {

    private AudioFull statusAudio;

    public AudioFull getStatusAudio() {
        return statusAudio;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), statusAudio);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        UserBroadcast userBroadcast = (UserBroadcast) o;
        return Objects.equals(statusAudio, userBroadcast.statusAudio);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("UserBroadcast{");
        sb.append("statusAudio=").append(statusAudio);
        sb.append('}');
        return sb.toString();
    }
}
