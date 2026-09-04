package com.google.api.services.youtube.model;

import com.google.api.client.json.GenericJson;
import com.google.api.client.util.Key;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class ActivitySnippet extends GenericJson {

    @Key
    private String channelId;

    @Key
    private String channelTitle;

    @Key
    private String description;

    @Key
    private String groupId;

    @Key
    private String publishedAt;

    @Key
    private ThumbnailDetails thumbnails;

    @Key
    private String title;

    @Key
    private String type;

    public String getChannelId() {
        return this.channelId;
    }

    public String getChannelTitle() {
        return this.channelTitle;
    }

    public String getDescription() {
        return this.description;
    }

    public String getGroupId() {
        return this.groupId;
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

    public String getType() {
        return this.type;
    }

    public ActivitySnippet setChannelId(String str) {
        this.channelId = str;
        return this;
    }

    public ActivitySnippet setChannelTitle(String str) {
        this.channelTitle = str;
        return this;
    }

    public ActivitySnippet setDescription(String str) {
        this.description = str;
        return this;
    }

    public ActivitySnippet setGroupId(String str) {
        this.groupId = str;
        return this;
    }

    public ActivitySnippet setPublishedAt(String str) {
        this.publishedAt = str;
        return this;
    }

    public ActivitySnippet setThumbnails(ThumbnailDetails thumbnailDetails) {
        this.thumbnails = thumbnailDetails;
        return this;
    }

    public ActivitySnippet setTitle(String str) {
        this.title = str;
        return this;
    }

    public ActivitySnippet setType(String str) {
        this.type = str;
        return this;
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData
    public ActivitySnippet set(String str, Object obj) {
        return (ActivitySnippet) super.set(str, obj);
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData, java.util.AbstractMap
    public ActivitySnippet clone() {
        return (ActivitySnippet) super.clone();
    }
}
