package com.google.api.services.youtube.model;

import com.google.api.client.json.GenericJson;
import com.google.api.client.util.Key;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class PlaylistSnippet extends GenericJson {

    @Key
    private String channelId;

    @Key
    private String channelTitle;

    @Key
    private String defaultLanguage;

    @Key
    private String description;

    @Key
    private PlaylistLocalization localized;

    @Key
    private String publishedAt;

    @Key
    private List<String> tags;

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

    public String getDefaultLanguage() {
        return this.defaultLanguage;
    }

    public String getDescription() {
        return this.description;
    }

    public PlaylistLocalization getLocalized() {
        return this.localized;
    }

    public String getPublishedAt() {
        return this.publishedAt;
    }

    public List<String> getTags() {
        return this.tags;
    }

    public ThumbnailDetails getThumbnails() {
        return this.thumbnails;
    }

    public String getTitle() {
        return this.title;
    }

    public PlaylistSnippet setChannelId(String str) {
        this.channelId = str;
        return this;
    }

    public PlaylistSnippet setChannelTitle(String str) {
        this.channelTitle = str;
        return this;
    }

    public PlaylistSnippet setDefaultLanguage(String str) {
        this.defaultLanguage = str;
        return this;
    }

    public PlaylistSnippet setDescription(String str) {
        this.description = str;
        return this;
    }

    public PlaylistSnippet setLocalized(PlaylistLocalization playlistLocalization) {
        this.localized = playlistLocalization;
        return this;
    }

    public PlaylistSnippet setPublishedAt(String str) {
        this.publishedAt = str;
        return this;
    }

    public PlaylistSnippet setTags(List<String> list) {
        this.tags = list;
        return this;
    }

    public PlaylistSnippet setThumbnails(ThumbnailDetails thumbnailDetails) {
        this.thumbnails = thumbnailDetails;
        return this;
    }

    public PlaylistSnippet setTitle(String str) {
        this.title = str;
        return this;
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData
    public PlaylistSnippet set(String str, Object obj) {
        return (PlaylistSnippet) super.set(str, obj);
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData, java.util.AbstractMap
    public PlaylistSnippet clone() {
        return (PlaylistSnippet) super.clone();
    }
}
