package com.thebrodyaga.vkobjects.newsfeed;


import com.thebrodyaga.vkobjects.audio.AudioFull;

import java.util.List;
import java.util.Objects;

/**
 * ItemAudioAudio object
 */
public class ItemAudioAudio {


    private Integer count;


    private List<AudioFull> items;

    public Integer getCount() {
        return count;
    }

    public List<AudioFull> getItems() {
        return items;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ItemAudioAudio that = (ItemAudioAudio) o;
        return Objects.equals(count, that.count) &&
                Objects.equals(items, that.items);
    }

    @Override
    public int hashCode() {
        return Objects.hash(count, items);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ItemAudioAudio{");
        sb.append("count=").append(count);
        sb.append(", items=").append(items);
        sb.append('}');
        return sb.toString();
    }
}
