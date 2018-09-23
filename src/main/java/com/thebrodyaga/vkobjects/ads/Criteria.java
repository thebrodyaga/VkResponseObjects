package com.thebrodyaga.vkobjects.ads;




import java.util.Objects;

/**
 * Criteria object
 */
public class Criteria {
    /**
     * Sex
     */

    private CriteriaSex sex;

    /**
     * Age from
     */

    private Integer ageFrom;

    /**
     * Age to
     */

    private Integer ageTo;

    /**
     * Days to birthday
     */

    private Integer birthday;

    /**
     * Country ID
     */

    private Integer country;

    /**
     * Cities IDs
     */

    private String cities;

    /**
     * Cities IDs to except
     */

    private String citiesNot;

    /**
     * Relationship statuses
     */

    private String statuses;

    /**
     * Communities IDs
     */

    private String groups;

    /**
     * Apps IDs
     */

    private String apps;

    /**
     * Apps IDs to except
     */

    private String appsNot;

    /**
     * Districts IDs
     */

    private String districts;

    /**
     * Stations IDs
     */

    private String stations;

    /**
     * Streets IDs
     */

    private String streets;

    /**
     * Schools IDs
     */

    private String schools;

    /**
     * Positions IDs
     */

    private String positions;

    /**
     * Religions IDs
     */

    private String religions;

    /**
     * Interests
     */

    private String interests;

    /**
     * Interests categories IDs
     */

    private String interestCategories;

    /**
     * Devices
     */

    private String userDevices;

    /**
     * Operating systems
     */

    private String userOs;

    /**
     * Browsers
     */

    private String userBrowsers;

    /**
     * Retargeting com.thebrodyaga.vkobjects.groups IDs
     */

    private String retargetingGroups;

    /**
     * Retargeting com.thebrodyaga.vkobjects.groups IDs to except
     */

    private String retargetingGroupsNot;

    /**
     * Information whether the user has proceeded VK payments before
     */

    private Boolean paying;

    /**
     * Travellers only
     */

    private Boolean travellers;

    /**
     * School graduation year from
     */

    private Integer schoolFrom;

    /**
     * School graduation year to
     */

    private Integer schoolTo;

    /**
     * University graduation year from
     */

    private Integer uniFrom;

    /**
     * University graduation year to
     */

    private Integer uniTo;

    public CriteriaSex getSex() {
        return sex;
    }

    public Integer getAgeFrom() {
        return ageFrom;
    }

    public Integer getAgeTo() {
        return ageTo;
    }

    public Integer getBirthday() {
        return birthday;
    }

    public Integer getCountry() {
        return country;
    }

    public String getCities() {
        return cities;
    }

    public String getCitiesNot() {
        return citiesNot;
    }

    public String getStatuses() {
        return statuses;
    }

    public String getGroups() {
        return groups;
    }

    public String getApps() {
        return apps;
    }

    public String getAppsNot() {
        return appsNot;
    }

    public String getDistricts() {
        return districts;
    }

    public String getStations() {
        return stations;
    }

    public String getStreets() {
        return streets;
    }

    public String getSchools() {
        return schools;
    }

    public String getPositions() {
        return positions;
    }

    public String getReligions() {
        return religions;
    }

    public String getInterests() {
        return interests;
    }

    public String getInterestCategories() {
        return interestCategories;
    }

    public String getUserDevices() {
        return userDevices;
    }

    public String getUserOs() {
        return userOs;
    }

    public String getUserBrowsers() {
        return userBrowsers;
    }

    public String getRetargetingGroups() {
        return retargetingGroups;
    }

    public String getRetargetingGroupsNot() {
        return retargetingGroupsNot;
    }

    public boolean isPaying() {
        return paying;
    }

    public boolean isTravellers() {
        return travellers ;
    }

    public Integer getSchoolFrom() {
        return schoolFrom;
    }

    public Integer getSchoolTo() {
        return schoolTo;
    }

    public Integer getUniFrom() {
        return uniFrom;
    }

    public Integer getUniTo() {
        return uniTo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(birthday, retargetingGroups, country, streets, retargetingGroupsNot, districts, paying, userBrowsers, religions, citiesNot, ageTo, apps, interestCategories, cities, userOs, travellers, sex, userDevices, groups, positions, stations, uniFrom, uniTo, schools, schoolTo, ageFrom, statuses, appsNot, interests, schoolFrom);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Criteria criteria = (Criteria) o;
        return Objects.equals(sex, criteria.sex) &&
                Objects.equals(ageFrom, criteria.ageFrom) &&
                Objects.equals(ageTo, criteria.ageTo) &&
                Objects.equals(birthday, criteria.birthday) &&
                Objects.equals(country, criteria.country) &&
                Objects.equals(cities, criteria.cities) &&
                Objects.equals(citiesNot, criteria.citiesNot) &&
                Objects.equals(statuses, criteria.statuses) &&
                Objects.equals(groups, criteria.groups) &&
                Objects.equals(apps, criteria.apps) &&
                Objects.equals(appsNot, criteria.appsNot) &&
                Objects.equals(districts, criteria.districts) &&
                Objects.equals(stations, criteria.stations) &&
                Objects.equals(streets, criteria.streets) &&
                Objects.equals(schools, criteria.schools) &&
                Objects.equals(positions, criteria.positions) &&
                Objects.equals(religions, criteria.religions) &&
                Objects.equals(interests, criteria.interests) &&
                Objects.equals(interestCategories, criteria.interestCategories) &&
                Objects.equals(userDevices, criteria.userDevices) &&
                Objects.equals(userOs, criteria.userOs) &&
                Objects.equals(userBrowsers, criteria.userBrowsers) &&
                Objects.equals(retargetingGroups, criteria.retargetingGroups) &&
                Objects.equals(retargetingGroupsNot, criteria.retargetingGroupsNot) &&
                Objects.equals(paying, criteria.paying) &&
                Objects.equals(travellers, criteria.travellers) &&
                Objects.equals(schoolFrom, criteria.schoolFrom) &&
                Objects.equals(schoolTo, criteria.schoolTo) &&
                Objects.equals(uniFrom, criteria.uniFrom) &&
                Objects.equals(uniTo, criteria.uniTo);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Criteria{");
        sb.append("sex=").append(sex);
        sb.append(", ageFrom=").append(ageFrom);
        sb.append(", ageTo=").append(ageTo);
        sb.append(", birthday=").append(birthday);
        sb.append(", country=").append(country);
        sb.append(", cities='").append(cities).append("'");
        sb.append(", citiesNot='").append(citiesNot).append("'");
        sb.append(", statuses='").append(statuses).append("'");
        sb.append(", com.thebrodyaga.vkobjects.groups='").append(groups).append("'");
        sb.append(", com.thebrodyaga.vkobjects.apps='").append(apps).append("'");
        sb.append(", appsNot='").append(appsNot).append("'");
        sb.append(", districts='").append(districts).append("'");
        sb.append(", stations='").append(stations).append("'");
        sb.append(", streets='").append(streets).append("'");
        sb.append(", schools='").append(schools).append("'");
        sb.append(", positions='").append(positions).append("'");
        sb.append(", religions='").append(religions).append("'");
        sb.append(", interests='").append(interests).append("'");
        sb.append(", interestCategories='").append(interestCategories).append("'");
        sb.append(", userDevices='").append(userDevices).append("'");
        sb.append(", userOs='").append(userOs).append("'");
        sb.append(", userBrowsers='").append(userBrowsers).append("'");
        sb.append(", retargetingGroups='").append(retargetingGroups).append("'");
        sb.append(", retargetingGroupsNot='").append(retargetingGroupsNot).append("'");
        sb.append(", paying=").append(paying);
        sb.append(", travellers=").append(travellers);
        sb.append(", schoolFrom=").append(schoolFrom);
        sb.append(", schoolTo=").append(schoolTo);
        sb.append(", uniFrom=").append(uniFrom);
        sb.append(", uniTo=").append(uniTo);
        sb.append('}');
        return sb.toString();
    }
}
