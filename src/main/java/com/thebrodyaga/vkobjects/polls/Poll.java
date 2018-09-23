package com.thebrodyaga.vkobjects.polls;




import java.util.List;
import java.util.Objects;

/**
 * Poll object
 */
public class Poll {
    /**
     * Poll ID
     */

    private Integer id;

    /**
     * Poll owner's ID
     */

    private Integer ownerId;

    /**
     * Date when poll has been created in Unixtime
     */

    private Integer created;

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


    private Boolean anonymous;

    public Integer getId() {
        return id;
    }

    public Integer getOwnerId() {
        return ownerId;
    }

    public Integer getCreated() {
        return created;
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

    public Boolean getAnonymous() {
        return anonymous;
    }

    @Override
    public int hashCode() {
        return Objects.hash(answerId, question, created, answers, votes, id, ownerId);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Poll poll = (Poll) o;
        return Objects.equals(id, poll.id) &&
                Objects.equals(ownerId, poll.ownerId) &&
                Objects.equals(created, poll.created) &&
                Objects.equals(question, poll.question) &&
                Objects.equals(votes, poll.votes) &&
                Objects.equals(answerId, poll.answerId) &&
                Objects.equals(answers, poll.answers) &&
                Objects.equals(anonymous, poll.anonymous);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Poll{");
        sb.append("id=").append(id);
        sb.append(", ownerId=").append(ownerId);
        sb.append(", created=").append(created);
        sb.append(", question='").append(question).append("'");
        sb.append(", votes='").append(votes).append("'");
        sb.append(", answerId=").append(answerId);
        sb.append(", answers=").append(answers);
        sb.append(", anonymous=").append(anonymous);
        sb.append('}');
        return sb.toString();
    }
}
