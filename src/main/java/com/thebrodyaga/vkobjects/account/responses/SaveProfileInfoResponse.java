package com.thebrodyaga.vkobjects.account.responses;


import com.thebrodyaga.vkobjects.account.NameRequest;


import java.util.Objects;

/**
 * SaveProfileInfoResponse object
 */
public class SaveProfileInfoResponse {
    /**
     * 1 if changes has been processed
     */

    private Boolean changed;


    private NameRequest nameRequest;

    public boolean isChanged() {
        return changed;
    }

    public NameRequest getNameRequest() {
        return nameRequest;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameRequest, changed);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SaveProfileInfoResponse saveProfileInfoResponse = (SaveProfileInfoResponse) o;
        return Objects.equals(changed, saveProfileInfoResponse.changed) &&
                Objects.equals(nameRequest, saveProfileInfoResponse.nameRequest);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("SaveProfileInfoResponse{");
        sb.append("changed=").append(changed);
        sb.append(", nameRequest=").append(nameRequest);
        sb.append('}');
        return sb.toString();
    }
}
