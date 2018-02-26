package com.thebrodyaga.vkobjects.docs;



import java.util.Objects;

/**
 * Doc object
 */
public class Doc {
    /**
     * Document ID
     */

    private Integer id;

    /**
     * Document owner ID
     */

    private Integer ownerId;

    /**
     * Document title
     */

    private String title;

    /**
     * File size in bites
     */

    private Integer size;

    /**
     * File extension
     */

    private String ext;

    /**
     * File URL
     */

    private String url;

    /**
     * Date when file has been uploaded in Unixtime
     */

    private Integer date;

    /**
     * Document type
     */

    private Integer type;


    private DocPreview preview;

    /**
     * Access key for the document
     */

    private String accessKey;

    public Integer getId() {
        return id;
    }

    public Integer getOwnerId() {
        return ownerId;
    }

    public String getTitle() {
        return title;
    }

    public Integer getSize() {
        return size;
    }

    public String getExt() {
        return ext;
    }

    public String getUrl() {
        return url;
    }

    public Integer getDate() {
        return date;
    }

    public Integer getType() {
        return type;
    }

    public DocPreview getPreview() {
        return preview;
    }

    public String getAccessKey() {
        return accessKey;
    }

    @Override
    public int hashCode() {
        return Objects.hash(ext, date, preview, size, accessKey, id, ownerId, title, type, url);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Doc doc = (Doc) o;
        return Objects.equals(id, doc.id) &&
                Objects.equals(ownerId, doc.ownerId) &&
                Objects.equals(title, doc.title) &&
                Objects.equals(size, doc.size) &&
                Objects.equals(ext, doc.ext) &&
                Objects.equals(url, doc.url) &&
                Objects.equals(date, doc.date) &&
                Objects.equals(type, doc.type) &&
                Objects.equals(preview, doc.preview) &&
                Objects.equals(accessKey, doc.accessKey);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Doc{");
        sb.append("id=").append(id);
        sb.append(", ownerId=").append(ownerId);
        sb.append(", title='").append(title).append("'");
        sb.append(", size=").append(size);
        sb.append(", ext='").append(ext).append("'");
        sb.append(", url='").append(url).append("'");
        sb.append(", date=").append(date);
        sb.append(", type=").append(type);
        sb.append(", preview=").append(preview);
        sb.append(", accessKey='").append(accessKey).append("'");
        sb.append('}');
        return sb.toString();
    }
}
