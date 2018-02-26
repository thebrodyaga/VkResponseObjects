package com.thebrodyaga.vkobjects;

import java.util.Objects;

public class UserAuthResponse {


    private String accessToken;


    private Integer userId;


    private Integer expiresIn;
    

    private String email;


    private String error;

    public String getAccessToken() {
        return accessToken;
    }

    public Integer getUserId() {
        return userId;
    }

    public Integer getExpiresIn() {
        return expiresIn;
    }
    
    public String getEmail() {
        return email;
    }

    public String getError() {
        return error;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserAuthResponse that = (UserAuthResponse) o;
        return Objects.equals(accessToken, that.accessToken) &&
                Objects.equals(userId, that.userId) &&
                Objects.equals(expiresIn, that.expiresIn) &&
                Objects.equals(email, that.email) &&
                Objects.equals(error, that.error);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accessToken, userId, expiresIn, email, error);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("com.thebrodyaga.vkobjects.UserAuthResponse{");
        sb.append("accessToken='").append(accessToken).append('\'');
        sb.append(", userId=").append(userId);
        sb.append(", expiresIn=").append(expiresIn);
        sb.append(", email=").append(email);
        sb.append(", error='").append(error).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
