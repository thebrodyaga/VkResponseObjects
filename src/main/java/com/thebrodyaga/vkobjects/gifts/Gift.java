package com.thebrodyaga.vkobjects.gifts;



import java.util.Objects;

/**
 * Gift object
 */
public class Gift {
    /**
     * Gift ID
     */

    private Integer id;

    /**
     * Gift sender ID
     */

    private Integer fromId;

    /**
     * Comment text
     */

    private String message;

    /**
     * Date when gist has been sent in Unixtime
     */

    private Integer date;


    private Layout gift;

    /**
     * Gift privacy
     */

    private GiftPrivacy privacy;

    /**
     * Hash
     */

    private String giftHash;

    public Integer getId() {
        return id;
    }

    public Integer getFromId() {
        return fromId;
    }

    public String getMessage() {
        return message;
    }

    public Integer getDate() {
        return date;
    }

    public Layout getGift() {
        return gift;
    }

    public GiftPrivacy getPrivacy() {
        return privacy;
    }

    public String getGiftHash() {
        return giftHash;
    }

    @Override
    public int hashCode() {
        return Objects.hash(date, gift, giftHash, privacy, id, message, fromId);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Gift gift = (Gift) o;
        return Objects.equals(id, gift.id) &&
                Objects.equals(fromId, gift.fromId) &&
                Objects.equals(message, gift.message) &&
                Objects.equals(date, gift.date) &&
                Objects.equals(gift, gift.gift) &&
                Objects.equals(privacy, gift.privacy) &&
                Objects.equals(giftHash, gift.giftHash);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Gift{");
        sb.append("id=").append(id);
        sb.append(", fromId=").append(fromId);
        sb.append(", message='").append(message).append("'");
        sb.append(", date=").append(date);
        sb.append(", gift=").append(gift);
        sb.append(", privacy=").append(privacy);
        sb.append(", giftHash='").append(giftHash).append("'");
        sb.append('}');
        return sb.toString();
    }
}
