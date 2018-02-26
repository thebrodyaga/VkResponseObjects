package com.thebrodyaga.vkobjects.ads;



import java.util.Objects;

/**
 * TargSuggestionsSchools object
 */
public class TargSuggestionsSchools {
    /**
     * School ID
     */

    private Integer id;

    /**
     * School title
     */

    private String name;

    /**
     * Full school title
     */

    private String desc;

    /**
     * School type
     */

    private TargSuggestionsSchoolsType type;

    /**
     * City name
     */

    private String parent;

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }

    public TargSuggestionsSchoolsType getType() {
        return type;
    }

    public String getParent() {
        return parent;
    }

    @Override
    public int hashCode() {
        return Objects.hash(parent, name, id, type, desc);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TargSuggestionsSchools targSuggestionsSchools = (TargSuggestionsSchools) o;
        return Objects.equals(id, targSuggestionsSchools.id) &&
                Objects.equals(name, targSuggestionsSchools.name) &&
                Objects.equals(desc, targSuggestionsSchools.desc) &&
                Objects.equals(type, targSuggestionsSchools.type) &&
                Objects.equals(parent, targSuggestionsSchools.parent);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("TargSuggestionsSchools{");
        sb.append("id=").append(id);
        sb.append(", name='").append(name).append("'");
        sb.append(", desc='").append(desc).append("'");
        sb.append(", type='").append(type).append("'");
        sb.append(", parent='").append(parent).append("'");
        sb.append('}');
        return sb.toString();
    }
}
