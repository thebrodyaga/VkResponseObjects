package com.thebrodyaga.vkobjects.app.widgets.responses;



import java.util.Objects;

public class GetAppImageUploadServerResponse {


    private String uploadUrl;

    public String getUploadUrl() {
        return uploadUrl;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GetAppImageUploadServerResponse that = (GetAppImageUploadServerResponse) o;
        return Objects.equals(uploadUrl, that.uploadUrl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(uploadUrl);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("GetAppImageUploadServerResponse{");
        sb.append("uploadUrl='").append(uploadUrl).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
