package com.thebrodyaga.vkobjects.photos.responses;



import java.util.Objects;

/**
 * OwnerUploadResponse object
 */
public class OwnerUploadResponse {
    /**
     * Upload server number
     */

    private Integer server;

    /**
     * Uploaded photo data
     */

    private String photo;

    /**
     * Uploading hash
     */

    private String hash;

    public Integer getServer() {
        return server;
    }

    public String getPhoto() {
        return photo;
    }

    public String getHash() {
        return hash;
    }

    @Override
    public int hashCode() {
        return Objects.hash(server, photo, hash);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OwnerUploadResponse ownerUploadResponse = (OwnerUploadResponse) o;
        return Objects.equals(server, ownerUploadResponse.server) &&
                Objects.equals(photo, ownerUploadResponse.photo) &&
                Objects.equals(hash, ownerUploadResponse.hash);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("OwnerUploadResponse{");
        sb.append("server=").append(server);
        sb.append(", photo='").append(photo).append("'");
        sb.append(", hash='").append(hash).append("'");
        sb.append('}');
        return sb.toString();
    }
}
