package com.thebrodyaga.vkobjects.account;



import java.util.List;
import java.util.Objects;

/**
 * LookupResult object
 */
public class LookupResult {


    private List<UserXtrContact> found;


    private List<OtherContact> other;

    public List<UserXtrContact> getFound() {
        return found;
    }

    public List<OtherContact> getOther() {
        return other;
    }

    @Override
    public int hashCode() {
        return Objects.hash(other, found);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LookupResult lookupResult = (LookupResult) o;
        return Objects.equals(found, lookupResult.found) &&
                Objects.equals(other, lookupResult.other);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("LookupResult{");
        sb.append("found=").append(found);
        sb.append(", other=").append(other);
        sb.append('}');
        return sb.toString();
    }
}
