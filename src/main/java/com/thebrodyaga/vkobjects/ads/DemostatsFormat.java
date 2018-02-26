package com.thebrodyaga.vkobjects.ads;



import java.util.List;
import java.util.Objects;

/**
 * DemostatsFormat object
 */
public class DemostatsFormat {
    /**
     * Day as YYYY-MM-DD
     */

    private String day;

    /**
     * Month as YYYY-MM
     */

    private String month;

    /**
     * 1 if period=overall
     */

    private Integer overall;


    private List<StatsSex> sex;


    private List<StatsAge> age;


    private List<StatsSexAge> sexAge;


    private List<StatsCities> cities;

    public String getDay() {
        return day;
    }

    public String getMonth() {
        return month;
    }

    public Integer getOverall() {
        return overall;
    }

    public List<StatsSex> getSex() {
        return sex;
    }

    public List<StatsAge> getAge() {
        return age;
    }

    public List<StatsSexAge> getSexAge() {
        return sexAge;
    }

    public List<StatsCities> getCities() {
        return cities;
    }

    @Override
    public int hashCode() {
        return Objects.hash(month, cities, sex, overall, day, sexAge, age);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DemostatsFormat demostatsFormat = (DemostatsFormat) o;
        return Objects.equals(day, demostatsFormat.day) &&
                Objects.equals(month, demostatsFormat.month) &&
                Objects.equals(overall, demostatsFormat.overall) &&
                Objects.equals(sex, demostatsFormat.sex) &&
                Objects.equals(age, demostatsFormat.age) &&
                Objects.equals(sexAge, demostatsFormat.sexAge) &&
                Objects.equals(cities, demostatsFormat.cities);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("DemostatsFormat{");
        sb.append("day='").append(day).append("'");
        sb.append(", month='").append(month).append("'");
        sb.append(", overall=").append(overall);
        sb.append(", sex=").append(sex);
        sb.append(", age=").append(age);
        sb.append(", sexAge=").append(sexAge);
        sb.append(", cities=").append(cities);
        sb.append('}');
        return sb.toString();
    }
}
