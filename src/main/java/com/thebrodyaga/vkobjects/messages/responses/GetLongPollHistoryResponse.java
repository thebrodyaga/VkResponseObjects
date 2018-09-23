package com.thebrodyaga.vkobjects.messages.responses;



import com.thebrodyaga.vkobjects.groups.Group;
import com.thebrodyaga.vkobjects.messages.Chat;
import com.thebrodyaga.vkobjects.messages.LongpollMessages;
import com.thebrodyaga.vkobjects.users.User;

import java.util.List;
import java.util.Objects;

/**
 * GetLongPollHistoryResponse object
 */
public class GetLongPollHistoryResponse {


    private List<List<Integer>> history;


    private LongpollMessages messages;


    private List<User> profiles;


    private List<Group> groups;


    private List<Chat> chats;


    private Integer newPts;


    private Boolean more;

    public List<List<Integer>> getHistory() {
        return history;
    }

    public LongpollMessages getMessages() {
        return messages;
    }

    public List<User> getProfiles() {
        return profiles;
    }

    public List<Group> getGroups() {
        return groups;
    }

    public List<Chat> getChats() {
        return chats;
    }

    public Integer getNewPts() {
        return newPts;
    }

    public Boolean getMore() {
        return more;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GetLongPollHistoryResponse that = (GetLongPollHistoryResponse) o;
        return Objects.equals(history, that.history) &&
                Objects.equals(messages, that.messages) &&
                Objects.equals(profiles, that.profiles) &&
                Objects.equals(groups, that.groups) &&
                Objects.equals(chats, that.chats) &&
                Objects.equals(newPts, that.newPts) &&
                more == that.more;
    }

    @Override
    public int hashCode() {
        return Objects.hash(history, messages, profiles, groups, chats, newPts, more);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("GetLongPollHistoryResponse{");
        sb.append("history=").append(history);
        sb.append(", com.thebrodyaga.vkobjects.messages=").append(messages);
        sb.append(", profiles=").append(profiles);
        sb.append(", com.thebrodyaga.vkobjects.groups=").append(groups);
        sb.append(", chats=").append(chats);
        sb.append(", newPts=").append(newPts);
        sb.append(", more=").append(more);
        sb.append('}');
        return sb.toString();
    }
}
