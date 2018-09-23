package com.thebrodyaga.vkobjects.board;



import com.thebrodyaga.vkobjects.polls.Answer;

import java.util.List;
import java.util.Objects;

/**
 * TopicPoll object
 */
public class TopicPoll {

    /**
     * Poll ID
     */

    private Integer pollId;

    /**
     * Poll owner's ID
     */

    private Integer ownerId;

    /**
     * Date when poll has been created in Unixtime
     */

    private Integer created;

    /**
     * Information whether the poll is closed
     */

    private Boolean isClosed;

    /**
     * Poll question
     */

    private String question;

    /**
     * Votes number
     */

    private String votes;

    /**
     * Current user's answer ID
     */

    private Integer answerId;


    private List<Answer> answers;

    public Integer getPollId() {
        return pollId;
    }

    public Integer getOwnerId() {
        return ownerId;
    }

    public Integer getCreated() {
        return created;
    }

    public boolean isClosed() {
        return isClosed;
    }

    public String getQuestion() {
        return question;
    }

    public String getVotes() {
        return votes;
    }

    public Integer getAnswerId() {
        return answerId;
    }

    public List<Answer> getAnswers() {
        return answers;
    }

    @Override
    public int hashCode() {
        return Objects.hash(answerId, isClosed, question, created, pollId, answers, votes, ownerId);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TopicPoll topicPoll = (TopicPoll) o;
        return Objects.equals(pollId, topicPoll.pollId) &&
                Objects.equals(ownerId, topicPoll.ownerId) &&
                Objects.equals(created, topicPoll.created) &&
                Objects.equals(isClosed, topicPoll.isClosed) &&
                Objects.equals(question, topicPoll.question) &&
                Objects.equals(votes, topicPoll.votes) &&
                Objects.equals(answerId, topicPoll.answerId) &&
                Objects.equals(answers, topicPoll.answers);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("TopicPoll{");
        sb.append("pollId=").append(pollId);
        sb.append(", ownerId=").append(ownerId);
        sb.append(", created=").append(created);
        sb.append(", isClosed=").append(isClosed);
        sb.append(", question='").append(question).append("'");
        sb.append(", votes='").append(votes).append("'");
        sb.append(", answerId=").append(answerId);
        sb.append(", answers=").append(answers);
        sb.append('}');
        return sb.toString();
    }
}
