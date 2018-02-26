package com.thebrodyaga.vkobjects.account;



import java.util.Objects;

/**
 * NameRequest object
 */
public class NameRequest {
    /**
     * Request ID needed to cancel the request
     */

    private Integer id;

    /**
     * Request com.thebrodyaga.vkobjects.status
     */

    private NameRequestStatus status;

    /**
     * First name in request
     */

    private String firstName;

    /**
     * Last name in request
     */

    private String lastName;

    public Integer getId() {
        return id;
    }

    public NameRequestStatus getStatus() {
        return status;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, id, status);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NameRequest nameRequest = (NameRequest) o;
        return Objects.equals(id, nameRequest.id) &&
                Objects.equals(status, nameRequest.status) &&
                Objects.equals(firstName, nameRequest.firstName) &&
                Objects.equals(lastName, nameRequest.lastName);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("NameRequest{");
        sb.append("id=").append(id);
        sb.append(", com.thebrodyaga.vkobjects.status='").append(status).append("'");
        sb.append(", firstName='").append(firstName).append("'");
        sb.append(", lastName='").append(lastName).append("'");
        sb.append('}');
        return sb.toString();
    }
}
