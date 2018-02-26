package com.thebrodyaga.vkobjects.messages;



import java.util.Objects;

public class ChatPhoto {


    private String photo50;


    private String photo100;


    private String photo200;

    public String getPhoto50() {
        return photo50;
    }

    public String getPhoto100() {
        return photo100;
    }

    public String getPhoto200() {
        return photo200;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ChatPhoto that = (ChatPhoto) o;
        return Objects.equals(photo50, that.photo50) &&
                Objects.equals(photo100, that.photo100) &&
                Objects.equals(photo200, that.photo200);
    }

    @Override
    public int hashCode() {
        return Objects.hash(photo50, photo100, photo200);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ChatPhoto{");
        sb.append("photo50='").append(photo50).append('\'');
        sb.append(", photo100='").append(photo100).append('\'');
        sb.append(", photo200='").append(photo200).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
