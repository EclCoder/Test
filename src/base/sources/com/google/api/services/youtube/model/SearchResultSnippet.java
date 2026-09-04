package com.google.api.services.youtube.model;

import com.google.api.client.json.GenericJson;
import com.google.api.client.util.Key;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class SearchResultSnippet extends GenericJson {

    @Key
    private String channelId;

    @Key
    private String channelTitle;

    @Key
    private String description;

    @Key
    private String liveBroadcastContent;

    @Key
    private String publishedAt;

    @Key
    private ThumbnailDetails thumbnails;

    @Key
    private String title;

    public String getChannelId() {
        return this.channelId;
    }

    public String getChannelTitle() {
        return this.channelTitle;
    }

    public String getDescription() {
        return this.description;
    }

    public String getLiveBroadcastContent() {
        return this.liveBroadcastContent;
    }

    public String getPublishedAt() {
        return this.publishedAt;
    }

    public ThumbnailDetails getThumbnails() {
        return this.thumbnails;
    }

    public String getTitle() {
        return this.title;
    }

    public SearchResultSnippet setChannelId(String str) {
        this.channelId = str;
        return this;
    }

    public SearchResultSnippet setChannelTitle(String str) {
        this.channelTitle = str;
        return this;
    }

    public SearchResultSnippet setDescription(String str) {
        this.description = str;
        return this;
    }

    public SearchResultSnippet setLiveBroadcastContent(String str) {
        this.liveBroadcastContent = str;
        return this;
    }

    public SearchResultSnippet setPublishedAt(String str) {
        this.publishedAt = str;
        return this;
    }

    public SearchResultSnippet setThumbnails(ThumbnailDetails thumbnailDetails) {
        this.thumbnails = thumbnailDetails;
        return this;
    }

    public SearchResultSnippet setTitle(String str) {
        this.title = str;
        return this;
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData
    public SearchResultSnippet set(String str, Object obj) {
        return (SearchResultSnippet) super.set(str, obj);
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData, java.util.AbstractMap
    public SearchResultSnippet clone() {
        return (SearchResultSnippet) super.clone();
    }
}
