package com.google.api.services.youtube.model;

import com.google.api.client.json.GenericJson;
import com.google.api.client.util.Key;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class LiveStreamSnippet extends GenericJson {

    @Key
    private String channelId;

    @Key
    private String description;

    @Key
    private Boolean isDefaultStream;

    @Key
    private String publishedAt;

    @Key
    private String title;

    public String getChannelId() {
        return this.channelId;
    }

    public String getDescription() {
        return this.description;
    }

    public Boolean getIsDefaultStream() {
        return this.isDefaultStream;
    }

    public String getPublishedAt() {
        return this.publishedAt;
    }

    public String getTitle() {
        return this.title;
    }

    public LiveStreamSnippet setChannelId(String str) {
        this.channelId = str;
        return this;
    }

    public LiveStreamSnippet setDescription(String str) {
        this.description = str;
        return this;
    }

    public LiveStreamSnippet setIsDefaultStream(Boolean bool) {
        this.isDefaultStream = bool;
        return this;
    }

    public LiveStreamSnippet setPublishedAt(String str) {
        this.publishedAt = str;
        return this;
    }

    public LiveStreamSnippet setTitle(String str) {
        this.title = str;
        return this;
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData
    public LiveStreamSnippet set(String str, Object obj) {
        return (LiveStreamSnippet) super.set(str, obj);
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData, java.util.AbstractMap
    public LiveStreamSnippet clone() {
        return (LiveStreamSnippet) super.clone();
    }
}
