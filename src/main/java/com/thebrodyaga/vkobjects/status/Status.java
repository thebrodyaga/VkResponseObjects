package com.thebrodyaga.vkobjects.status;


import com.thebrodyaga.vkobjects.audio.AudioFull;

import java.util.Objects;

/**
 * Status object
 */
public class Status {
    /**
     * Status text
     */

    private String text;


    private AudioFull audio;

    public String getText() {
        return text;
    }

    public AudioFull getAudio() {
        return audio;
    }

    @Override
    public int hashCode() {
        return Objects.hash(text, audio);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Status status = (Status) o;
        return Objects.equals(text, status.text) &&
                Objects.equals(audio, status.audio);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Status{");
        sb.append("text='").append(text).append("'");
        sb.append(", com.thebrodyaga.vkobjects.audio=").append(audio);
        sb.append('}');
        return sb.toString();
    }
}
