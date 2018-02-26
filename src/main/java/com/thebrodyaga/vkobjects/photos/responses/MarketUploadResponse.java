package com.thebrodyaga.vkobjects.photos.responses;



import java.util.Objects;

/**
 * MarketUploadResponse object
 */
public class MarketUploadResponse {
    /**
     * Community ID
     */

    private Integer groupId;

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

    /**
     * Crop data
     */

    private String cropData;

    /**
     * Crop hash
     */

    private String cropHash;

    public Integer getGroupId() {
        return groupId;
    }

    public Integer getServer() {
        return server;
    }

    public String getPhoto() {
        return photo;
    }

    public String getHash() {
        return hash;
    }

    public String getCropData() {
        return cropData;
    }

    public String getCropHash() {
        return cropHash;
    }

    @Override
    public int hashCode() {
        return Objects.hash(server, cropData, groupId, photo, hash, cropHash);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MarketUploadResponse marketUploadResponse = (MarketUploadResponse) o;
        return Objects.equals(groupId, marketUploadResponse.groupId) &&
                Objects.equals(server, marketUploadResponse.server) &&
                Objects.equals(photo, marketUploadResponse.photo) &&
                Objects.equals(hash, marketUploadResponse.hash) &&
                Objects.equals(cropData, marketUploadResponse.cropData) &&
                Objects.equals(cropHash, marketUploadResponse.cropHash);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("MarketUploadResponse{");
        sb.append("groupId=").append(groupId);
        sb.append(", server=").append(server);
        sb.append(", photo='").append(photo).append("'");
        sb.append(", hash='").append(hash).append("'");
        sb.append(", cropData='").append(cropData).append("'");
        sb.append(", cropHash='").append(cropHash).append("'");
        sb.append('}');
        return sb.toString();
    }
}
