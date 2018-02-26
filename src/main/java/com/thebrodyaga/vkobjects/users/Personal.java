package com.thebrodyaga.vkobjects.users;



import java.util.List;
import java.util.Objects;

/**
 * Personal object
 */
public class Personal {
    /**
     * User's political views
     */

    private Integer political;


    private List<String> langs;

    /**
     * User's religion
     */

    private String religion;

    /**
     * User's inspired by
     */

    private String inspiredBy;

    /**
     * User's personal priority in people
     */

    private Integer peopleMain;

    /**
     * User's personal priority in life
     */

    private Integer lifeMain;

    /**
     * User's views on smoking
     */

    private Integer smoking;

    /**
     * User's views on alcohol
     */

    private Integer alcohol;

    public Integer getPolitical() {
        return political;
    }

    public List<String> getLangs() {
        return langs;
    }

    public String getReligion() {
        return religion;
    }

    public String getInspiredBy() {
        return inspiredBy;
    }

    public Integer getPeopleMain() {
        return peopleMain;
    }

    public Integer getLifeMain() {
        return lifeMain;
    }

    public Integer getSmoking() {
        return smoking;
    }

    public Integer getAlcohol() {
        return alcohol;
    }

    @Override
    public int hashCode() {
        return Objects.hash(alcohol, peopleMain, smoking, political, langs, lifeMain, inspiredBy, religion);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Personal personal = (Personal) o;
        return Objects.equals(political, personal.political) &&
                Objects.equals(langs, personal.langs) &&
                Objects.equals(religion, personal.religion) &&
                Objects.equals(inspiredBy, personal.inspiredBy) &&
                Objects.equals(peopleMain, personal.peopleMain) &&
                Objects.equals(lifeMain, personal.lifeMain) &&
                Objects.equals(smoking, personal.smoking) &&
                Objects.equals(alcohol, personal.alcohol);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Personal{");
        sb.append("political=").append(political);
        sb.append(", langs='").append(langs).append("'");
        sb.append(", religion='").append(religion).append("'");
        sb.append(", inspiredBy='").append(inspiredBy).append("'");
        sb.append(", peopleMain=").append(peopleMain);
        sb.append(", lifeMain=").append(lifeMain);
        sb.append(", smoking=").append(smoking);
        sb.append(", alcohol=").append(alcohol);
        sb.append('}');
        return sb.toString();
    }
}
