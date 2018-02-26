package com.thebrodyaga.vkobjects.base;



import java.util.Objects;

/**
 * RepostsInfo object
 */
public class RepostsInfo {
    /**
     * Reposts number
     */

    private Integer count;

    /**
     * Information whether current user has reposted the post
     */

    private Integer userReposted;

    public Integer getCount() {
        return count;
    }

    public Integer getUserReposted() {
        return userReposted;
    }

    @Override
    public int hashCode() {
        return Objects.hash(count, userReposted);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RepostsInfo repostsInfo = (RepostsInfo) o;
        return Objects.equals(count, repostsInfo.count) &&
                Objects.equals(userReposted, repostsInfo.userReposted);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("RepostsInfo{");
        sb.append("count=").append(count);
        sb.append(", userReposted=").append(userReposted);
        sb.append('}');
        return sb.toString();
    }
}
