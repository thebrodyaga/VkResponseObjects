package com.thebrodyaga.vkobjects.photos.responses;



import java.util.Objects;

/**
 * SaveOwnerPhotoResponse object
 */
public class SaveOwnerPhotoResponse {
    /**
     * Parameter for saveProfilePhoto method
     */

    private String photoHash;

    /**
     * Uploaded image url
     */

    private String photoSrc;

    public String getPhotoHash() {
        return photoHash;
    }

    public String getPhotoSrc() {
        return photoSrc;
    }

    @Override
    public int hashCode() {
        return Objects.hash(photoSrc, photoHash);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SaveOwnerPhotoResponse saveOwnerPhotoResponse = (SaveOwnerPhotoResponse) o;
        return Objects.equals(photoHash, saveOwnerPhotoResponse.photoHash) &&
                Objects.equals(photoSrc, saveOwnerPhotoResponse.photoSrc);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("SaveOwnerPhotoResponse{");
        sb.append("photoHash='").append(photoHash).append("'");
        sb.append(", photoSrc='").append(photoSrc).append("'");
        sb.append('}');
        return sb.toString();
    }
}
