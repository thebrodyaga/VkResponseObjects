package com.thebrodyaga.vkobjects.base;



import java.util.List;
import java.util.Objects;

/**
 * Error object
 */
public class Error {
    /**
     * Error code
     */

    private Integer errorCode;

    /**
     * Error message
     */

    private String errorMsg;

    /**
     * Captcha id
     */

    private String captchaSid;

    /**
     * Captcha image url
     */

    private String captchaImg;

    /**
     * Confirmation text for user
     */

    private String confirmationText;

    /**
     * Redirect uri for validation request
     */

    private String redirectUri;


    private List<RequestParam> requestParams;

    public Integer getErrorCode() {
        return errorCode;
    }

    public String getErrorMsg() {
        return errorMsg;
    }


    public String getCaptchaImg() {
        return captchaImg;
    }

    public String getCaptchaSid() {
        return captchaSid;
    }

    public String getConfirmationText() {
        return confirmationText;
    }

    public String getRedirectUri() {
        return redirectUri;
    }

    public List<RequestParam> getRequestParams() {
        return requestParams;
    }

    @Override
    public int hashCode() {
        return Objects.hash(errorCode, requestParams, errorMsg);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Error error = (Error) o;
        return Objects.equals(errorCode, error.errorCode) &&
                Objects.equals(errorMsg, error.errorMsg) &&
                Objects.equals(requestParams, error.requestParams);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Error{");
        sb.append("errorCode=").append(errorCode);
        sb.append(", errorMsg='").append(errorMsg).append("'");
        sb.append(", captchaSid='").append(captchaSid).append("'");
        sb.append(", captchaImg='").append(captchaImg).append("'");
        sb.append(", confirmationText='").append(confirmationText).append("'");
        sb.append(", redirectUri='").append(redirectUri).append("'");
        sb.append(", requestParams=").append(requestParams);
        sb.append('}');
        return sb.toString();
    }
}
