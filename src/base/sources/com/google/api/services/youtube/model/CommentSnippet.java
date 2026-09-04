package com.google.api.services.youtube.model;

import com.google.api.client.json.GenericJson;
import com.google.api.client.util.Key;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class CommentSnippet extends GenericJson {

    @Key
    private CommentSnippetAuthorChannelId authorChannelId;

    @Key
    private String authorChannelUrl;

    @Key
    private String authorDisplayName;

    @Key
    private String authorProfileImageUrl;

    @Key
    private Boolean canRate;

    @Key
    private String channelId;

    @Key
    private Long likeCount;

    @Key
    private String moderationStatus;

    @Key
    private String parentId;

    @Key
    private String publishedAt;

    @Key
    private String textDisplay;

    @Key
    private String textOriginal;

    @Key
    private String updatedAt;

    @Key
    private String videoId;

    @Key
    private String viewerRating;

    public CommentSnippetAuthorChannelId getAuthorChannelId() {
        return this.authorChannelId;
    }

    public String getAuthorChannelUrl() {
        return this.authorChannelUrl;
    }

    public String getAuthorDisplayName() {
        return this.authorDisplayName;
    }

    public String getAuthorProfileImageUrl() {
        return this.authorProfileImageUrl;
    }

    public Boolean getCanRate() {
        return this.canRate;
    }

    public String getChannelId() {
        return this.channelId;
    }

    public Long getLikeCount() {
        return this.likeCount;
    }

    public String getModerationStatus() {
        return this.moderationStatus;
    }

    public String getParentId() {
        return this.parentId;
    }

    public String getPublishedAt() {
        return this.publishedAt;
    }

    public String getTextDisplay() {
        return this.textDisplay;
    }

    public String getTextOriginal() {
        return this.textOriginal;
    }

    public String getUpdatedAt() {
        return this.updatedAt;
    }

    public String getVideoId() {
        return this.videoId;
    }

    public String getViewerRating() {
        return this.viewerRating;
    }

    public CommentSnippet setAuthorChannelId(CommentSnippetAuthorChannelId commentSnippetAuthorChannelId) {
        this.authorChannelId = commentSnippetAuthorChannelId;
        return this;
    }

    public CommentSnippet setAuthorChannelUrl(String str) {
        this.authorChannelUrl = str;
        return this;
    }

    public CommentSnippet setAuthorDisplayName(String str) {
        this.authorDisplayName = str;
        return this;
    }

    public CommentSnippet setAuthorProfileImageUrl(String str) {
        this.authorProfileImageUrl = str;
        return this;
    }

    public CommentSnippet setCanRate(Boolean bool) {
        this.canRate = bool;
        return this;
    }

    public CommentSnippet setChannelId(String str) {
        this.channelId = str;
        return this;
    }

    public CommentSnippet setLikeCount(Long l10) {
        this.likeCount = l10;
        return this;
    }

    public CommentSnippet setModerationStatus(String str) {
        this.moderationStatus = str;
        return this;
    }

    public CommentSnippet setParentId(String str) {
        this.parentId = str;
        return this;
    }

    public CommentSnippet setPublishedAt(String str) {
        this.publishedAt = str;
        return this;
    }

    public CommentSnippet setTextDisplay(String str) {
        this.textDisplay = str;
        return this;
    }

    public CommentSnippet setTextOriginal(String str) {
        this.textOriginal = str;
        return this;
    }

    public CommentSnippet setUpdatedAt(String str) {
        this.updatedAt = str;
        return this;
    }

    public CommentSnippet setVideoId(String str) {
        this.videoId = str;
        return this;
    }

    public CommentSnippet setViewerRating(String str) {
        this.viewerRating = str;
        return this;
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData
    public CommentSnippet set(String str, Object obj) {
        return (CommentSnippet) super.set(str, obj);
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData, java.util.AbstractMap
    public CommentSnippet clone() {
        return (CommentSnippet) super.clone();
    }
}
