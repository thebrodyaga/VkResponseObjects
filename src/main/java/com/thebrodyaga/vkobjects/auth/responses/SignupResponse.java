package com.thebrodyaga.vkobjects.auth.responses;



import java.util.Objects;

/**
 * SignupResponse object
 */
public class SignupResponse {
    /**
     * Parameter to retry
     */

    private String sid;

    public String getSid() {
        return sid;
    }

    @Override
    public int hashCode() {
        return Objects.hash(sid);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SignupResponse signupResponse = (SignupResponse) o;
        return Objects.equals(sid, signupResponse.sid);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("SignupResponse{");
        sb.append("sid='").append(sid).append("'");
        sb.append('}');
        return sb.toString();
    }
}
