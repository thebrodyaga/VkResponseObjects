package com.thebrodyaga.vkobjects.photos.responses;



import java.util.Objects;

/**
 * GetMarketUploadServerResponse object
 */
public class GetMarketUploadServerResponse {
    /**
     * URL to upload the photo
     */

    private String uploadUrl;

    public String getUploadUrl() {
        return uploadUrl;
    }

    @Override
    public int hashCode() {
        return Objects.hash(uploadUrl);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GetMarketUploadServerResponse getMarketUploadServerResponse = (GetMarketUploadServerResponse) o;
        return Objects.equals(uploadUrl, getMarketUploadServerResponse.uploadUrl);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("GetMarketUploadServerResponse{");
        sb.append("uploadUrl='").append(uploadUrl).append("'");
        sb.append('}');
        return sb.toString();
    }
}
