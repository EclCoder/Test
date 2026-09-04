package com.google.api.services.youtube.model;

import com.google.api.client.json.GenericJson;
import com.google.api.client.util.Key;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class LiveBroadcastSnippet extends GenericJson {

    @Key
    private String actualEndTime;

    @Key
    private String actualStartTime;

    @Key
    private String channelId;

    @Key
    private String description;

    @Key
    private Boolean isDefaultBroadcast;

    @Key
    private String liveChatId;

    @Key
    private String publishedAt;

    @Key
    private String scheduledEndTime;

    @Key
    private String scheduledStartTime;

    @Key
    private ThumbnailDetails thumbnails;

    @Key
    private String title;

    public String getActualEndTime() {
        return this.actualEndTime;
    }

    public String getActualStartTime() {
        return this.actualStartTime;
    }

    public String getChannelId() {
        return this.channelId;
    }

    public String getDescription() {
        return this.description;
    }

    public Boolean getIsDefaultBroadcast() {
        return this.isDefaultBroadcast;
    }

    public String getLiveChatId() {
        return this.liveChatId;
    }

    public String getPublishedAt() {
        return this.publishedAt;
    }

    public String getScheduledEndTime() {
        return this.scheduledEndTime;
    }

    public String getScheduledStartTime() {
        return this.scheduledStartTime;
    }

    public ThumbnailDetails getThumbnails() {
        return this.thumbnails;
    }

    public String getTitle() {
        return this.title;
    }

    public LiveBroadcastSnippet setActualEndTime(String str) {
        this.actualEndTime = str;
        return this;
    }

    public LiveBroadcastSnippet setActualStartTime(String str) {
        this.actualStartTime = str;
        return this;
    }

    public LiveBroadcastSnippet setChannelId(String str) {
        this.channelId = str;
        return this;
    }

    public LiveBroadcastSnippet setDescription(String str) {
        this.description = str;
        return this;
    }

    public LiveBroadcastSnippet setIsDefaultBroadcast(Boolean bool) {
        this.isDefaultBroadcast = bool;
        return this;
    }

    public LiveBroadcastSnippet setLiveChatId(String str) {
        this.liveChatId = str;
        return this;
    }

    public LiveBroadcastSnippet setPublishedAt(String str) {
        this.publishedAt = str;
        return this;
    }

    public LiveBroadcastSnippet setScheduledEndTime(String str) {
        this.scheduledEndTime = str;
        return this;
    }

    public LiveBroadcastSnippet setScheduledStartTime(String str) {
        this.scheduledStartTime = str;
        return this;
    }

    public LiveBroadcastSnippet setThumbnails(ThumbnailDetails thumbnailDetails) {
        this.thumbnails = thumbnailDetails;
        return this;
    }

    public LiveBroadcastSnippet setTitle(String str) {
        this.title = str;
        return this;
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData
    public LiveBroadcastSnippet set(String str, Object obj) {
        return (LiveBroadcastSnippet) super.set(str, obj);
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData, java.util.AbstractMap
    public LiveBroadcastSnippet clone() {
        return (LiveBroadcastSnippet) super.clone();
    }
}
