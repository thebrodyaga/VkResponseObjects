package com.thebrodyaga.vkobjects.orders;



import java.util.Objects;

/**
 * Order object
 */
public class Order {
    /**
     * Order ID
     */

    private Integer id;

    /**
     * App order ID
     */

    private Integer appOrderId;

    /**
     * Order com.thebrodyaga.vkobjects.status
     */

    private String status;

    /**
     * User ID
     */

    private Integer userId;

    /**
     * Receiver ID
     */

    private Integer receiverId;

    /**
     * Order item
     */

    private String item;

    /**
     * Amount
     */

    private Integer amount;

    /**
     * Date of creation in Unixtime
     */

    private Integer date;

    /**
     * Transaction ID
     */

    private Integer transactionId;

    /**
     * Cancel transaction ID
     */

    private Integer cancelTransactionId;

    public Integer getId() {
        return id;
    }

    public Integer getAppOrderId() {
        return appOrderId;
    }

    public String getStatus() {
        return status;
    }

    public Integer getUserId() {
        return userId;
    }

    public Integer getReceiverId() {
        return receiverId;
    }

    public String getItem() {
        return item;
    }

    public Integer getAmount() {
        return amount;
    }

    public Integer getDate() {
        return date;
    }

    public Integer getTransactionId() {
        return transactionId;
    }

    public Integer getCancelTransactionId() {
        return cancelTransactionId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(date, item, amount, receiverId, appOrderId, cancelTransactionId, id, userId, transactionId, status);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return Objects.equals(id, order.id) &&
                Objects.equals(appOrderId, order.appOrderId) &&
                Objects.equals(status, order.status) &&
                Objects.equals(userId, order.userId) &&
                Objects.equals(receiverId, order.receiverId) &&
                Objects.equals(item, order.item) &&
                Objects.equals(amount, order.amount) &&
                Objects.equals(date, order.date) &&
                Objects.equals(transactionId, order.transactionId) &&
                Objects.equals(cancelTransactionId, order.cancelTransactionId);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Order{");
        sb.append("id=").append(id);
        sb.append(", appOrderId=").append(appOrderId);
        sb.append(", com.thebrodyaga.vkobjects.status='").append(status).append("'");
        sb.append(", userId=").append(userId);
        sb.append(", receiverId=").append(receiverId);
        sb.append(", item='").append(item).append("'");
        sb.append(", amount=").append(amount);
        sb.append(", date=").append(date);
        sb.append(", transactionId=").append(transactionId);
        sb.append(", cancelTransactionId=").append(cancelTransactionId);
        sb.append('}');
        return sb.toString();
    }
}
