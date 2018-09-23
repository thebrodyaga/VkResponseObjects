package com.thebrodyaga.vkobjects.groups.responses;




import java.util.Objects;

/**
 * GetCallbackSettingsResponse object
 */
public class GetCallbackSettingsResponse {
    /**
     * Whether com.thebrodyaga.vkobjects.notifications about new message enabled
     */

    private Boolean messageNew;

    /**
     * Whether com.thebrodyaga.vkobjects.notifications about allowed com.thebrodyaga.vkobjects.messages
     */

    private Boolean messageAllow;

    /**
     * Whether com.thebrodyaga.vkobjects.notifications about denied com.thebrodyaga.vkobjects.messages
     */

    private Boolean messageDeny;

    /**
     * Whether com.thebrodyaga.vkobjects.notifications about new com.thebrodyaga.vkobjects.photos enabled
     */

    private Boolean photoNew;

    /**
     * Whether com.thebrodyaga.vkobjects.notifications about new audios enabled
     */

    private Boolean audioNew;

    /**
     * Whether com.thebrodyaga.vkobjects.notifications about new videos enabled
     */

    private Boolean videoNew;

    /**
     * Whether com.thebrodyaga.vkobjects.notifications about new reposts enabled
     */

    private Boolean wallRepost;

    /**
     * Whether com.thebrodyaga.vkobjects.notifications about new com.thebrodyaga.vkobjects.wall replies enabled
     */

    private Boolean wallReplyNew;

    /**
     * Whether com.thebrodyaga.vkobjects.notifications about com.thebrodyaga.vkobjects.wall replies edits enabled
     */

    private Boolean wallReplyEdit;

    /**
     * Whether com.thebrodyaga.vkobjects.notifications about new com.thebrodyaga.vkobjects.wall posts enabled
     */

    private Boolean wallPostNew;

    /**
     * Whether com.thebrodyaga.vkobjects.notifications about new com.thebrodyaga.vkobjects.board posts enabled
     */

    private Boolean boardPostNew;

    /**
     * Whether com.thebrodyaga.vkobjects.notifications about com.thebrodyaga.vkobjects.board posts edits enabled
     */

    private Boolean boardPostEdit;

    /**
     * Whether com.thebrodyaga.vkobjects.notifications about com.thebrodyaga.vkobjects.board posts restores enabled
     */

    private Boolean boardPostRestore;

    /**
     * Whether com.thebrodyaga.vkobjects.notifications about com.thebrodyaga.vkobjects.board posts deleted enabled
     */

    private Boolean boardPostDelete;

    /**
     * Whether com.thebrodyaga.vkobjects.notifications about new photo comments enabled
     */

    private Boolean photoCommentNew;

    /**
     * Whether com.thebrodyaga.vkobjects.notifications about new com.thebrodyaga.vkobjects.video comments enabled
     */

    private Boolean videoCommentNew;

    /**
     * Whether com.thebrodyaga.vkobjects.notifications about new com.thebrodyaga.vkobjects.market comments enabled
     */

    private Boolean marketCommentNew;

    /**
     * Whether com.thebrodyaga.vkobjects.notifications about new vote in a public poll
     */

    private Boolean pollVoteNew;

    /**
     * Whether com.thebrodyaga.vkobjects.notifications about anyone joined the community enabled
     */

    private Boolean groupJoin;

    /**
     * Whether com.thebrodyaga.vkobjects.notifications about anyone left the community enabled
     */

    private Boolean groupLeave;

    /**
     * Whether com.thebrodyaga.vkobjects.notifications about changed group settings
     */

    private Boolean groupChangeSettings;

    /**
     * Whether com.thebrodyaga.vkobjects.notifications about changed group photo
     */

    private Boolean groupChangePhoto;

    /**
     * Whether com.thebrodyaga.vkobjects.notifications about changed group officers
     */

    private Boolean groupOfficersEdit;

    public boolean isMessageNew() {
        return messageNew;
    }

    public boolean isMessageAllow() {
        return messageAllow;
    }

    public boolean isMessageDeny() {
        return messageDeny;
    }

    public boolean isPhotoNew() {
        return photoNew;
    }

    public boolean isAudioNew() {
        return audioNew;
    }

    public boolean isVideoNew() {
        return videoNew;
    }

    public boolean isWallRepost() {
        return wallRepost;
    }

    public boolean isWallReplyNew() {
        return wallReplyNew;
    }

    public boolean isWallReplyEdit() {
        return wallReplyEdit;
    }

    public boolean isWallPostNew() {
        return wallPostNew;
    }

    public boolean isBoardPostNew() {
        return boardPostNew;
    }

    public boolean isBoardPostEdit() {
        return boardPostEdit;
    }

    public boolean isBoardPostRestore() {
        return boardPostRestore;
    }

    public boolean isBoardPostDelete() {
        return boardPostDelete;
    }

    public boolean isPhotoCommentNew() {
        return photoCommentNew;
    }

    public boolean isVideoCommentNew() {
        return videoCommentNew;
    }

    public boolean isMarketCommentNew() {
        return marketCommentNew;
    }

    public boolean isGroupLeave() {
        return groupLeave;
    }

    public boolean isGroupJoin() {
        return pollVoteNew;
    }

    public boolean isGroupChangeSettings() {
        return groupChangeSettings;
    }

    public boolean isGroupChangePhoto() {
        return groupChangePhoto;
    }

    public boolean isGroupOfficersEdit() {
        return groupOfficersEdit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GetCallbackSettingsResponse that = (GetCallbackSettingsResponse) o;
        return messageNew == that.messageNew &&
                messageAllow == that.messageAllow &&
                messageDeny == that.messageDeny &&
                photoNew == that.photoNew &&
                audioNew == that.audioNew &&
                videoNew == that.videoNew &&
                wallRepost == that.wallRepost &&
                wallReplyNew == that.wallReplyNew &&
                wallReplyEdit == that.wallReplyEdit &&
                wallPostNew == that.wallPostNew &&
                boardPostNew == that.boardPostNew &&
                boardPostEdit == that.boardPostEdit &&
                boardPostRestore == that.boardPostRestore &&
                boardPostDelete == that.boardPostDelete &&
                photoCommentNew == that.photoCommentNew &&
                videoCommentNew == that.videoCommentNew &&
                marketCommentNew == that.marketCommentNew &&
                pollVoteNew == that.pollVoteNew &&
                groupJoin == that.groupJoin &&
                groupLeave == that.groupLeave &&
                groupChangeSettings == that.groupChangeSettings &&
                groupChangePhoto == that.groupChangePhoto &&
                groupOfficersEdit == that.groupOfficersEdit;
    }

    @Override
    public int hashCode() {
        return Objects.hash(messageNew, messageAllow, messageDeny, photoNew, audioNew, videoNew, wallRepost, wallReplyNew, wallReplyEdit, wallPostNew, boardPostNew, boardPostEdit, boardPostRestore, boardPostDelete, photoCommentNew, videoCommentNew, marketCommentNew, pollVoteNew, groupJoin, groupLeave, groupChangeSettings, groupChangePhoto, groupOfficersEdit);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("GetCallbackSettingsResponse{");
        sb.append("audioNew=").append(audioNew);
        sb.append(", boardPostDelete=").append(boardPostDelete);
        sb.append(", boardPostEdit=").append(boardPostEdit);
        sb.append(", boardPostNew=").append(boardPostNew);
        sb.append(", boardPostRestore=").append(boardPostRestore);
        sb.append(", groupChangePhoto=").append(groupChangePhoto);
        sb.append(", groupChangeSettings=").append(groupChangeSettings);
        sb.append(", groupJoin=").append(groupJoin);
        sb.append(", groupLeave=").append(groupLeave);
        sb.append(", groupOfficersEdit=").append(groupOfficersEdit);
        sb.append(", marketCommentNew=").append(marketCommentNew);
        sb.append(", messageAllow=").append(messageAllow);
        sb.append(", messageDeny=").append(messageDeny);
        sb.append(", messageNew=").append(messageNew);
        sb.append(", photoCommentNew=").append(photoCommentNew);
        sb.append(", photoNew=").append(photoNew);
        sb.append(", pollVoteNew=").append(pollVoteNew);
        sb.append(", videoCommentNew=").append(videoCommentNew);
        sb.append(", videoNew=").append(videoNew);
        sb.append(", wallPostNew=").append(wallPostNew);
        sb.append(", wallReplyEdit=").append(wallReplyEdit);
        sb.append(", wallReplyNew=").append(wallReplyNew);
        sb.append(", wallRepost=").append(wallRepost);
        sb.append('}');
        return sb.toString();
    }
}
