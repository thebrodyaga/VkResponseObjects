package com.thebrodyaga.vkobjects.groups.responses;


import com.thebrodyaga.vkobjects.base.BoolInt;

import java.util.Objects;

/**
 * GetCallbackSettingsResponse object
 */
public class GetCallbackSettingsResponse {
    /**
     * Whether com.thebrodyaga.vkobjects.notifications about new message enabled
     */

    private BoolInt messageNew;

    /**
     * Whether com.thebrodyaga.vkobjects.notifications about allowed com.thebrodyaga.vkobjects.messages
     */

    private BoolInt messageAllow;

    /**
     * Whether com.thebrodyaga.vkobjects.notifications about denied com.thebrodyaga.vkobjects.messages
     */

    private BoolInt messageDeny;

    /**
     * Whether com.thebrodyaga.vkobjects.notifications about new com.thebrodyaga.vkobjects.photos enabled
     */

    private BoolInt photoNew;

    /**
     * Whether com.thebrodyaga.vkobjects.notifications about new audios enabled
     */

    private BoolInt audioNew;

    /**
     * Whether com.thebrodyaga.vkobjects.notifications about new videos enabled
     */

    private BoolInt videoNew;

    /**
     * Whether com.thebrodyaga.vkobjects.notifications about new reposts enabled
     */

    private BoolInt wallRepost;

    /**
     * Whether com.thebrodyaga.vkobjects.notifications about new com.thebrodyaga.vkobjects.wall replies enabled
     */

    private BoolInt wallReplyNew;

    /**
     * Whether com.thebrodyaga.vkobjects.notifications about com.thebrodyaga.vkobjects.wall replies edits enabled
     */

    private BoolInt wallReplyEdit;

    /**
     * Whether com.thebrodyaga.vkobjects.notifications about new com.thebrodyaga.vkobjects.wall posts enabled
     */

    private BoolInt wallPostNew;

    /**
     * Whether com.thebrodyaga.vkobjects.notifications about new com.thebrodyaga.vkobjects.board posts enabled
     */

    private BoolInt boardPostNew;

    /**
     * Whether com.thebrodyaga.vkobjects.notifications about com.thebrodyaga.vkobjects.board posts edits enabled
     */

    private BoolInt boardPostEdit;

    /**
     * Whether com.thebrodyaga.vkobjects.notifications about com.thebrodyaga.vkobjects.board posts restores enabled
     */

    private BoolInt boardPostRestore;

    /**
     * Whether com.thebrodyaga.vkobjects.notifications about com.thebrodyaga.vkobjects.board posts deleted enabled
     */

    private BoolInt boardPostDelete;

    /**
     * Whether com.thebrodyaga.vkobjects.notifications about new photo comments enabled
     */

    private BoolInt photoCommentNew;

    /**
     * Whether com.thebrodyaga.vkobjects.notifications about new com.thebrodyaga.vkobjects.video comments enabled
     */

    private BoolInt videoCommentNew;

    /**
     * Whether com.thebrodyaga.vkobjects.notifications about new com.thebrodyaga.vkobjects.market comments enabled
     */

    private BoolInt marketCommentNew;

    /**
     * Whether com.thebrodyaga.vkobjects.notifications about new vote in a public poll
     */

    private BoolInt pollVoteNew;

    /**
     * Whether com.thebrodyaga.vkobjects.notifications about anyone joined the community enabled
     */

    private BoolInt groupJoin;

    /**
     * Whether com.thebrodyaga.vkobjects.notifications about anyone left the community enabled
     */

    private BoolInt groupLeave;

    /**
     * Whether com.thebrodyaga.vkobjects.notifications about changed group settings
     */

    private BoolInt groupChangeSettings;

    /**
     * Whether com.thebrodyaga.vkobjects.notifications about changed group photo
     */

    private BoolInt groupChangePhoto;

    /**
     * Whether com.thebrodyaga.vkobjects.notifications about changed group officers
     */

    private BoolInt groupOfficersEdit;

    public boolean isMessageNew() {
        return messageNew == BoolInt.YES;
    }

    public boolean isMessageAllow() {
        return messageAllow == BoolInt.YES;
    }

    public boolean isMessageDeny() {
        return messageDeny == BoolInt.YES;
    }

    public boolean isPhotoNew() {
        return photoNew == BoolInt.YES;
    }

    public boolean isAudioNew() {
        return audioNew == BoolInt.YES;
    }

    public boolean isVideoNew() {
        return videoNew == BoolInt.YES;
    }

    public boolean isWallRepost() {
        return wallRepost == BoolInt.YES;
    }

    public boolean isWallReplyNew() {
        return wallReplyNew == BoolInt.YES;
    }

    public boolean isWallReplyEdit() {
        return wallReplyEdit == BoolInt.YES;
    }

    public boolean isWallPostNew() {
        return wallPostNew == BoolInt.YES;
    }

    public boolean isBoardPostNew() {
        return boardPostNew == BoolInt.YES;
    }

    public boolean isBoardPostEdit() {
        return boardPostEdit == BoolInt.YES;
    }

    public boolean isBoardPostRestore() {
        return boardPostRestore == BoolInt.YES;
    }

    public boolean isBoardPostDelete() {
        return boardPostDelete == BoolInt.YES;
    }

    public boolean isPhotoCommentNew() {
        return photoCommentNew == BoolInt.YES;
    }

    public boolean isVideoCommentNew() {
        return videoCommentNew == BoolInt.YES;
    }

    public boolean isMarketCommentNew() {
        return marketCommentNew == BoolInt.YES;
    }

    public boolean isGroupLeave() {
        return groupLeave == BoolInt.YES;
    }

    public boolean isGroupJoin() {
        return pollVoteNew == BoolInt.YES;
    }

    public boolean isGroupChangeSettings() {
        return groupChangeSettings == BoolInt.YES;
    }

    public boolean isGroupChangePhoto() {
        return groupChangePhoto == BoolInt.YES;
    }

    public boolean isGroupOfficersEdit() {
        return groupOfficersEdit == BoolInt.YES;
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
