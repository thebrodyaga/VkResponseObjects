package com.thebrodyaga.vkobjects.base;



import java.util.Objects;

/**
 * Sticker object
 */
public class Sticker {
    /**
     * Sticker ID
     */

    private Integer id;

    /**
     * Collection ID
     */

    private Integer productId;

    /**
     * URL of the preview image with 64 px in height
     */

    private String photo64;

    /**
     * URL of the preview image with 128 px in height
     */

    private String photo128;

    /**
     * URL of the preview image with 256 px in height
     */

    private String photo256;

    /**
     * URL of the preview image with 352 px in height
     */

    private String photo352;

    /**
     * Width in px
     */

    private Integer width;

    /**
     * Hieght in px
     */

    private Integer height;

    public Integer getId() {
        return id;
    }

    public Integer getProductId() {
        return productId;
    }

    public String getPhoto64() {
        return photo64;
    }

    public String getPhoto128() {
        return photo128;
    }

    public String getPhoto256() {
        return photo256;
    }

    public String getPhoto352() {
        return photo352;
    }

    public Integer getWidth() {
        return width;
    }

    public Integer getHeight() {
        return height;
    }

    @Override
    public int hashCode() {
        return Objects.hash(productId, photo64, photo352, width, photo256, id, photo128, height);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sticker sticker = (Sticker) o;
        return Objects.equals(id, sticker.id) &&
                Objects.equals(productId, sticker.productId) &&
                Objects.equals(photo64, sticker.photo64) &&
                Objects.equals(photo128, sticker.photo128) &&
                Objects.equals(photo256, sticker.photo256) &&
                Objects.equals(photo352, sticker.photo352) &&
                Objects.equals(width, sticker.width) &&
                Objects.equals(height, sticker.height);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Sticker{");
        sb.append("id=").append(id);
        sb.append(", productId=").append(productId);
        sb.append(", photo64='").append(photo64).append("'");
        sb.append(", photo128='").append(photo128).append("'");
        sb.append(", photo256='").append(photo256).append("'");
        sb.append(", photo352='").append(photo352).append("'");
        sb.append(", width=").append(width);
        sb.append(", height=").append(height);
        sb.append('}');
        return sb.toString();
    }
}
