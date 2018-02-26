package com.thebrodyaga.vkobjects.photos.responses;



import java.util.Objects;

/**
 * GetOwnerCoverPhotoUploadServerResponse object
 */
public class GetOwnerCoverPhotoUploadServerResponse {
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
        GetOwnerCoverPhotoUploadServerResponse getOwnerPhotoUploadServerResponse = (GetOwnerCoverPhotoUploadServerResponse) o;
        return Objects.equals(uploadUrl, getOwnerPhotoUploadServerResponse.uploadUrl);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("GetOwnerCoverPhotoUploadServerResponse{");
        sb.append("uploadUrl='").append(uploadUrl).append("'");
        sb.append('}');
        return sb.toString();
    }
}
