package com.thebrodyaga.vkobjects.messages.responses;


import com.thebrodyaga.vkobjects.groups.Group;
import com.thebrodyaga.vkobjects.messages.ChatPreview;
import com.thebrodyaga.vkobjects.messages.Email;
import com.thebrodyaga.vkobjects.users.User;

import java.util.List;
import java.util.Objects;

public class GetChatPreviewResponse {


    private ChatPreview preview;


    private List<User> profiles;


    private List<Group> groups;


    private List<Email> emails;

    public ChatPreview getPreview() {
        return preview;
    }

    public List<User> getProfiles() {
        return profiles;
    }

    public List<Group> getGroups() {
        return groups;
    }

    public List<Email> getEmails() {
        return emails;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GetChatPreviewResponse that = (GetChatPreviewResponse) o;
        return Objects.equals(preview, that.preview) &&
                Objects.equals(profiles, that.profiles) &&
                Objects.equals(groups, that.groups) &&
                Objects.equals(emails, that.emails);
    }

    @Override
    public int hashCode() {
        return Objects.hash(preview, profiles, groups, emails);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("GetChatPreviewResponse{");
        sb.append("preview=").append(preview);
        sb.append(", profiles=").append(profiles);
        sb.append(", com.thebrodyaga.vkobjects.groups=").append(groups);
        sb.append(", emails=").append(emails);
        sb.append('}');
        return sb.toString();
    }
}
