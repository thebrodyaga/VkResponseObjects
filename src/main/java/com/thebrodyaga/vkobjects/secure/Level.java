package com.thebrodyaga.vkobjects.secure;



import java.util.Objects;

/**
 * Level object
 */
public class Level {
    /**
     * User ID
     */

    private Integer uid;

    /**
     * Level
     */

    private Integer level;

    public Integer getUid() {
        return uid;
    }

    public Integer getLevel() {
        return level;
    }

    @Override
    public int hashCode() {
        return Objects.hash(uid, level);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Level level = (Level) o;
        return Objects.equals(uid, level.uid) &&
                Objects.equals(level, level.level);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Level{");
        sb.append("uid=").append(uid);
        sb.append(", level=").append(level);
        sb.append('}');
        return sb.toString();
    }
}
