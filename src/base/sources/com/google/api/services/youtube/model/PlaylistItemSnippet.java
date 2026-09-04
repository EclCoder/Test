package com.google.api.services.youtube.model;

import com.google.api.client.json.GenericJson;
import com.google.api.client.util.Key;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class PlaylistItemSnippet extends GenericJson {

    @Key
    private String channelId;

    @Key
    private String channelTitle;

    @Key
    private String description;

    @Key
    private String playlistId;

    @Key
    private Long position;

    @Key
    private String publishedAt;

    @Key
    private ResourceId resourceId;

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

    public String getPlaylistId() {
        return this.playlistId;
    }

    public Long getPosition() {
        return this.position;
    }

    public String getPublishedAt() {
        return this.publishedAt;
    }

    public ResourceId getResourceId() {
        return this.resourceId;
    }

    public ThumbnailDetails getThumbnails() {
        return this.thumbnails;
    }

    public String getTitle() {
        return this.title;
    }

    public PlaylistItemSnippet setChannelId(String str) {
        this.channelId = str;
        return this;
    }

    public PlaylistItemSnippet setChannelTitle(String str) {
        this.channelTitle = str;
        return this;
    }

    public PlaylistItemSnippet setDescription(String str) {
        this.description = str;
        return this;
    }

    public PlaylistItemSnippet setPlaylistId(String str) {
        this.playlistId = str;
        return this;
    }

    public PlaylistItemSnippet setPosition(Long l10) {
        this.position = l10;
        return this;
    }

    public PlaylistItemSnippet setPublishedAt(String str) {
        this.publishedAt = str;
        return this;
    }

    public PlaylistItemSnippet setResourceId(ResourceId resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    public PlaylistItemSnippet setThumbnails(ThumbnailDetails thumbnailDetails) {
        this.thumbnails = thumbnailDetails;
        return this;
    }

    public PlaylistItemSnippet setTitle(String str) {
        this.title = str;
        return this;
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData
    public PlaylistItemSnippet set(String str, Object obj) {
        return (PlaylistItemSnippet) super.set(str, obj);
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData, java.util.AbstractMap
    public PlaylistItemSnippet clone() {
        return (PlaylistItemSnippet) super.clone();
    }
}
