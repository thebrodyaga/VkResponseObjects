package com.thebrodyaga.vkobjects.users;



import java.util.Objects;

/**
 * School object
 */
public class School {
    /**
     * School ID
     */

    private String id;

    /**
     * Country ID
     */

    private Integer country;

    /**
     * City ID
     */

    private Integer city;

    /**
     * School name
     */

    private String name;

    /**
     * Year the user started to study
     */

    private Integer yearFrom;

    /**
     * Year the user finished to study
     */

    private Integer yearTo;

    /**
     * Graduation year
     */

    private Integer yearGraduated;

    /**
     * School class letter
     */

    private String className;

    /**
     * School type ID
     */

    private Integer type;

    /**
     * School type name
     */

    private String typeStr;

    public String getId() {
        return id;
    }

    public Integer getCountry() {
        return country;
    }

    public Integer getCity() {
        return city;
    }

    public String getName() {
        return name;
    }

    public Integer getYearFrom() {
        return yearFrom;
    }

    public Integer getYearTo() {
        return yearTo;
    }

    public Integer getYearGraduated() {
        return yearGraduated;
    }

    public String getClassName() {
        return className;
    }

    public Integer getType() {
        return type;
    }

    public String getTypeStr() {
        return typeStr;
    }

    @Override
    public int hashCode() {
        return Objects.hash(country, typeStr, city, yearFrom, name, className, id, yearGraduated, type, yearTo);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        School school = (School) o;
        return Objects.equals(id, school.id) &&
                Objects.equals(country, school.country) &&
                Objects.equals(city, school.city) &&
                Objects.equals(name, school.name) &&
                Objects.equals(yearFrom, school.yearFrom) &&
                Objects.equals(yearTo, school.yearTo) &&
                Objects.equals(yearGraduated, school.yearGraduated) &&
                Objects.equals(className, school.className) &&
                Objects.equals(type, school.type) &&
                Objects.equals(typeStr, school.typeStr);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("School{");
        sb.append("id='").append(id).append("'");
        sb.append(", country=").append(country);
        sb.append(", city=").append(city);
        sb.append(", name='").append(name).append("'");
        sb.append(", yearFrom=").append(yearFrom);
        sb.append(", yearTo=").append(yearTo);
        sb.append(", yearGraduated=").append(yearGraduated);
        sb.append(", className='").append(className).append("'");
        sb.append(", type=").append(type);
        sb.append(", typeStr='").append(typeStr).append("'");
        sb.append('}');
        return sb.toString();
    }
}
