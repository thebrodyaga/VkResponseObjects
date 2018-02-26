package com.thebrodyaga.vkobjects.account;



import java.util.Objects;

/**
 * Other contact object
 */
public class OtherContact {

    /**
     * Contact
     */

    private String contact;

    /**
     * Mutual com.thebrodyaga.vkobjects.friends count
     */

    private Integer commonCount;

    public String getContact() {
        return contact;
    }

    public Integer getCommonCount() {
        return commonCount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OtherContact that = (OtherContact) o;
        return Objects.equals(contact, that.contact) &&
                Objects.equals(commonCount, that.commonCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(contact, commonCount);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("OtherContact{");
        sb.append("contact='").append(contact).append('\'');
        sb.append(", commonCount=").append(commonCount);
        sb.append('}');
        return sb.toString();
    }
}
