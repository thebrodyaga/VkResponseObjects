package com.thebrodyaga.vkobjects.oauth;



import java.util.Objects;

/**
 * Error object
 */
public class Error {
    /**
     * Error type
     */

    private String error;

    /**
     * Error description
     */

    private String errorDescription;

    /**
     * URI for validation
     */

    private String redirectUri;

    public String getError() {
        return error;
    }

    public String getErrorDescription() {
        return errorDescription;
    }

    public String getRedirectUri() {
        return redirectUri;
    }

    @Override
    public int hashCode() {
        return Objects.hash(redirectUri, errorDescription, error);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Error error = (Error) o;
        return Objects.equals(error, error.error) &&
                Objects.equals(errorDescription, error.errorDescription) &&
                Objects.equals(redirectUri, error.redirectUri);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Error{");
        sb.append("error='").append(error).append("'");
        sb.append(", errorDescription='").append(errorDescription).append("'");
        sb.append(", redirectUri='").append(redirectUri).append("'");
        sb.append('}');
        return sb.toString();
    }
}
