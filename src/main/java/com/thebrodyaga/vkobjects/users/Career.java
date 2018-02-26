package com.thebrodyaga.vkobjects.users;



import java.util.Objects;

/**
 * Career object
 */
public class Career {
    /**
     * Community ID
     */

    private Integer groupId;

    /**
     * Company name
     */

    private String company;

    /**
     * Country ID
     */

    private Integer countryId;

    /**
     * City ID
     */

    private Integer cityId;

    /**
     * From year
     */

    private Integer from;

    /**
     * Till year
     */

    private Integer until;

    /**
     * Position
     */

    private String position;

    public Integer getGroupId() {
        return groupId;
    }

    public String getCompany() {
        return company;
    }

    public Integer getCountryId() {
        return countryId;
    }

    public Integer getCityId() {
        return cityId;
    }

    public Integer getFrom() {
        return from;
    }

    public Integer getUntil() {
        return until;
    }

    public String getPosition() {
        return position;
    }

    @Override
    public int hashCode() {
        return Objects.hash(groupId, company, from, until, cityId, position, countryId);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Career career = (Career) o;
        return Objects.equals(groupId, career.groupId) &&
                Objects.equals(company, career.company) &&
                Objects.equals(countryId, career.countryId) &&
                Objects.equals(cityId, career.cityId) &&
                Objects.equals(from, career.from) &&
                Objects.equals(until, career.until) &&
                Objects.equals(position, career.position);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Career{");
        sb.append("groupId=").append(groupId);
        sb.append(", company=").append(company);
        sb.append(", countryId=").append(countryId);
        sb.append(", cityId=").append(cityId);
        sb.append(", from=").append(from);
        sb.append(", until=").append(until);
        sb.append(", position='").append(position).append("'");
        sb.append('}');
        return sb.toString();
    }
}
