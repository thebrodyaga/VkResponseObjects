package com.thebrodyaga.vkobjects.photos.responses;



import java.util.Objects;

/**
 * MessageUploadResponse object
 */
public class MessageUploadResponse {
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
        MessageUploadResponse messageUploadResponse = (MessageUploadResponse) o;
        return Objects.equals(server, messageUploadResponse.server) &&
                Objects.equals(photo, messageUploadResponse.photo) &&
                Objects.equals(hash, messageUploadResponse.hash);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("MessageUploadResponse{");
        sb.append("server=").append(server);
        sb.append(", photo='").append(photo).append("'");
        sb.append(", hash='").append(hash).append("'");
        sb.append('}');
        return sb.toString();
    }
}
