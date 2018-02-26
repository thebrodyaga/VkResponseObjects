package com.thebrodyaga.vkobjects.search;


import com.thebrodyaga.vkobjects.base.BoolInt;
import com.thebrodyaga.vkobjects.groups.Group;
import com.thebrodyaga.vkobjects.users.UserMin;

import java.util.Objects;

/**
 * Hint object
 */
public class Hint {
    /**
     * Object type
     */

    private HintType type;

    /**
     * Section title
     */

    private HintSection section;

    /**
     * Object description
     */

    private String description;

    /**
     * Information whether the object has been found globally
     */

    private BoolInt global;


    private Group group;


    private UserMin profile;

    public HintType getType() {
        return type;
    }

    public HintSection getSection() {
        return section;
    }

    public String getDescription() {
        return description;
    }

    public boolean isGlobal() {
        return global == BoolInt.YES;
    }

    public Group getGroup() {
        return group;
    }

    public UserMin getProfile() {
        return profile;
    }

    @Override
    public int hashCode() {
        return Objects.hash(profile, description, section, global, type, group);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hint hint = (Hint) o;
        return Objects.equals(type, hint.type) &&
                Objects.equals(section, hint.section) &&
                Objects.equals(description, hint.description) &&
                Objects.equals(global, hint.global) &&
                Objects.equals(group, hint.group) &&
                Objects.equals(profile, hint.profile);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Hint{");
        sb.append("type='").append(type).append("'");
        sb.append(", section='").append(section).append("'");
        sb.append(", description='").append(description).append("'");
        sb.append(", global=").append(global);
        sb.append(", group=").append(group);
        sb.append(", profile=").append(profile);
        sb.append('}');
        return sb.toString();
    }
}
