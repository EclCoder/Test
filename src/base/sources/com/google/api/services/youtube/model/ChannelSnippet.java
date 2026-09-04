package com.google.api.services.youtube.model;

import com.google.api.client.json.GenericJson;
import com.google.api.client.util.Key;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class ChannelSnippet extends GenericJson {

    @Key
    private String country;

    @Key
    private String customUrl;

    @Key
    private String defaultLanguage;

    @Key
    private String description;

    @Key
    private ChannelLocalization localized;

    @Key
    private String publishedAt;

    @Key
    private ThumbnailDetails thumbnails;

    @Key
    private String title;

    public String getCountry() {
        return this.country;
    }

    public String getCustomUrl() {
        return this.customUrl;
    }

    public String getDefaultLanguage() {
        return this.defaultLanguage;
    }

    public String getDescription() {
        return this.description;
    }

    public ChannelLocalization getLocalized() {
        return this.localized;
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

    public ChannelSnippet setCountry(String str) {
        this.country = str;
        return this;
    }

    public ChannelSnippet setCustomUrl(String str) {
        this.customUrl = str;
        return this;
    }

    public ChannelSnippet setDefaultLanguage(String str) {
        this.defaultLanguage = str;
        return this;
    }

    public ChannelSnippet setDescription(String str) {
        this.description = str;
        return this;
    }

    public ChannelSnippet setLocalized(ChannelLocalization channelLocalization) {
        this.localized = channelLocalization;
        return this;
    }

    public ChannelSnippet setPublishedAt(String str) {
        this.publishedAt = str;
        return this;
    }

    public ChannelSnippet setThumbnails(ThumbnailDetails thumbnailDetails) {
        this.thumbnails = thumbnailDetails;
        return this;
    }

    public ChannelSnippet setTitle(String str) {
        this.title = str;
        return this;
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData
    public ChannelSnippet set(String str, Object obj) {
        return (ChannelSnippet) super.set(str, obj);
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData, java.util.AbstractMap
    public ChannelSnippet clone() {
        return (ChannelSnippet) super.clone();
    }
}
