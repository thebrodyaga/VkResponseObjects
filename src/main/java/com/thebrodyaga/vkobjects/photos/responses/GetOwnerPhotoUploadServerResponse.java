package com.thebrodyaga.vkobjects.photos.responses;



import java.util.Objects;

/**
 * GetOwnerPhotoUploadServerResponse object
 */
public class GetOwnerPhotoUploadServerResponse {
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
        GetOwnerPhotoUploadServerResponse getOwnerPhotoUploadServerResponse = (GetOwnerPhotoUploadServerResponse) o;
        return Objects.equals(uploadUrl, getOwnerPhotoUploadServerResponse.uploadUrl);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("GetOwnerPhotoUploadServerResponse{");
        sb.append("uploadUrl='").append(uploadUrl).append("'");
        sb.append('}');
        return sb.toString();
    }
}
