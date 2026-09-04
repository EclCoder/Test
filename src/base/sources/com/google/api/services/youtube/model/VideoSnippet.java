package com.google.api.services.youtube.model;

import com.google.api.client.json.GenericJson;
import com.google.api.client.util.Key;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class VideoSnippet extends GenericJson {

    @Key
    private String categoryId;

    @Key
    private String channelId;

    @Key
    private String channelTitle;

    @Key
    private String defaultAudioLanguage;

    @Key
    private String defaultLanguage;

    @Key
    private String description;

    @Key
    private String liveBroadcastContent;

    @Key
    private VideoLocalization localized;

    @Key
    private String publishedAt;

    @Key
    private List<String> tags;

    @Key
    private ThumbnailDetails thumbnails;

    @Key
    private String title;

    public String getCategoryId() {
        return this.categoryId;
    }

    public String getChannelId() {
        return this.channelId;
    }

    public String getChannelTitle() {
        return this.channelTitle;
    }

    public String getDefaultAudioLanguage() {
        return this.defaultAudioLanguage;
    }

    public String getDefaultLanguage() {
        return this.defaultLanguage;
    }

    public String getDescription() {
        return this.description;
    }

    public String getLiveBroadcastContent() {
        return this.liveBroadcastContent;
    }

    public VideoLocalization getLocalized() {
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

    public VideoSnippet setCategoryId(String str) {
        this.categoryId = str;
        return this;
    }

    public VideoSnippet setChannelId(String str) {
        this.channelId = str;
        return this;
    }

    public VideoSnippet setChannelTitle(String str) {
        this.channelTitle = str;
        return this;
    }

    public VideoSnippet setDefaultAudioLanguage(String str) {
        this.defaultAudioLanguage = str;
        return this;
    }

    public VideoSnippet setDefaultLanguage(String str) {
        this.defaultLanguage = str;
        return this;
    }

    public VideoSnippet setDescription(String str) {
        this.description = str;
        return this;
    }

    public VideoSnippet setLiveBroadcastContent(String str) {
        this.liveBroadcastContent = str;
        return this;
    }

    public VideoSnippet setLocalized(VideoLocalization videoLocalization) {
        this.localized = videoLocalization;
        return this;
    }

    public VideoSnippet setPublishedAt(String str) {
        this.publishedAt = str;
        return this;
    }

    public VideoSnippet setTags(List<String> list) {
        this.tags = list;
        return this;
    }

    public VideoSnippet setThumbnails(ThumbnailDetails thumbnailDetails) {
        this.thumbnails = thumbnailDetails;
        return this;
    }

    public VideoSnippet setTitle(String str) {
        this.title = str;
        return this;
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData
    public VideoSnippet set(String str, Object obj) {
        return (VideoSnippet) super.set(str, obj);
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData, java.util.AbstractMap
    public VideoSnippet clone() {
        return (VideoSnippet) super.clone();
    }
}
