package com.google.api.services.youtube.model;

import com.google.api.client.json.GenericJson;
import com.google.api.client.util.Key;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class SubscriptionSubscriberSnippet extends GenericJson {

    @Key
    private String channelId;

    @Key
    private String description;

    @Key
    private ThumbnailDetails thumbnails;

    @Key
    private String title;

    public String getChannelId() {
        return this.channelId;
    }

    public String getDescription() {
        return this.description;
    }

    public ThumbnailDetails getThumbnails() {
        return this.thumbnails;
    }

    public String getTitle() {
        return this.title;
    }

    public SubscriptionSubscriberSnippet setChannelId(String str) {
        this.channelId = str;
        return this;
    }

    public SubscriptionSubscriberSnippet setDescription(String str) {
        this.description = str;
        return this;
    }

    public SubscriptionSubscriberSnippet setThumbnails(ThumbnailDetails thumbnailDetails) {
        this.thumbnails = thumbnailDetails;
        return this;
    }

    public SubscriptionSubscriberSnippet setTitle(String str) {
        this.title = str;
        return this;
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData
    public SubscriptionSubscriberSnippet set(String str, Object obj) {
        return (SubscriptionSubscriberSnippet) super.set(str, obj);
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData, java.util.AbstractMap
    public SubscriptionSubscriberSnippet clone() {
        return (SubscriptionSubscriberSnippet) super.clone();
    }
}
