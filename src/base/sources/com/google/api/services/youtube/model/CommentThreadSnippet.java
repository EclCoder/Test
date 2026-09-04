package com.google.api.services.youtube.model;

import com.google.api.client.json.GenericJson;
import com.google.api.client.util.Key;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class CommentThreadSnippet extends GenericJson {

    @Key
    private Boolean canReply;

    @Key
    private String channelId;

    @Key
    private Boolean isPublic;

    @Key
    private Comment topLevelComment;

    @Key
    private Long totalReplyCount;

    @Key
    private String videoId;

    public Boolean getCanReply() {
        return this.canReply;
    }

    public String getChannelId() {
        return this.channelId;
    }

    public Boolean getIsPublic() {
        return this.isPublic;
    }

    public Comment getTopLevelComment() {
        return this.topLevelComment;
    }

    public Long getTotalReplyCount() {
        return this.totalReplyCount;
    }

    public String getVideoId() {
        return this.videoId;
    }

    public CommentThreadSnippet setCanReply(Boolean bool) {
        this.canReply = bool;
        return this;
    }

    public CommentThreadSnippet setChannelId(String str) {
        this.channelId = str;
        return this;
    }

    public CommentThreadSnippet setIsPublic(Boolean bool) {
        this.isPublic = bool;
        return this;
    }

    public CommentThreadSnippet setTopLevelComment(Comment comment) {
        this.topLevelComment = comment;
        return this;
    }

    public CommentThreadSnippet setTotalReplyCount(Long l10) {
        this.totalReplyCount = l10;
        return this;
    }

    public CommentThreadSnippet setVideoId(String str) {
        this.videoId = str;
        return this;
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData
    public CommentThreadSnippet set(String str, Object obj) {
        return (CommentThreadSnippet) super.set(str, obj);
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData, java.util.AbstractMap
    public CommentThreadSnippet clone() {
        return (CommentThreadSnippet) super.clone();
    }
}
