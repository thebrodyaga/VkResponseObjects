package com.thebrodyaga.vkobjects.docs.responses;



import java.util.Objects;

/**
 * AddResponse object
 */
public class AddResponse {
    /**
     * Doc ID
     */

    private Integer id;

    public Integer getId() {
        return id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AddResponse addResponse = (AddResponse) o;
        return Objects.equals(id, addResponse.id);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("AddResponse{");
        sb.append("id=").append(id);
        sb.append('}');
        return sb.toString();
    }
}
