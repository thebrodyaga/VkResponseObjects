package com.thebrodyaga.vkobjects.newsfeed;



import java.util.Objects;

/**
 * ItemVideo object
 */
public class ItemVideo {


    private ItemVideoVideo video;

    public ItemVideoVideo getVideo() {
        return video;
    }

    @Override
    public int hashCode() {
        return Objects.hash(video);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ItemVideo itemVideo = (ItemVideo) o;
        return Objects.equals(video, itemVideo.video);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ItemVideo{");
        sb.append("com.thebrodyaga.vkobjects.video=").append(video);
        sb.append('}');
        return sb.toString();
    }
}
