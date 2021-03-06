package com.thebrodyaga.vkobjects.notes;



import java.util.Objects;

/**
 * NoteComment object
 */
public class NoteComment {
    /**
     * Comment ID
     */

    private Integer id;

    /**
     * Comment author's ID
     */

    private Integer uid;

    /**
     * Note ID
     */

    private Integer nid;

    /**
     * Note ID
     */

    private Integer oid;

    /**
     * Date when the comment has beed added in Unixtime
     */

    private Integer date;

    /**
     * Comment text
     */

    private String message;

    /**
     * ID of replied comment
     */

    private Integer replyTo;

    public Integer getId() {
        return id;
    }

    public Integer getUid() {
        return uid;
    }

    public Integer getNid() {
        return nid;
    }

    public Integer getOid() {
        return oid;
    }

    public Integer getDate() {
        return date;
    }

    public String getMessage() {
        return message;
    }

    public Integer getReplyTo() {
        return replyTo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(date, uid, nid, replyTo, id, oid, message);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NoteComment noteComment = (NoteComment) o;
        return Objects.equals(id, noteComment.id) &&
                Objects.equals(uid, noteComment.uid) &&
                Objects.equals(nid, noteComment.nid) &&
                Objects.equals(oid, noteComment.oid) &&
                Objects.equals(date, noteComment.date) &&
                Objects.equals(message, noteComment.message) &&
                Objects.equals(replyTo, noteComment.replyTo);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("NoteComment{");
        sb.append("id=").append(id);
        sb.append(", uid=").append(uid);
        sb.append(", nid=").append(nid);
        sb.append(", oid=").append(oid);
        sb.append(", date=").append(date);
        sb.append(", message='").append(message).append("'");
        sb.append(", replyTo=").append(replyTo);
        sb.append('}');
        return sb.toString();
    }
}
