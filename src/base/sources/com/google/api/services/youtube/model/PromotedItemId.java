package com.google.api.services.youtube.model;

import com.google.api.client.json.GenericJson;
import com.google.api.client.util.Key;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class PromotedItemId extends GenericJson {

    @Key
    private String recentlyUploadedBy;

    @Key
    private String type;

    @Key
    private String videoId;

    @Key
    private String websiteUrl;

    public String getRecentlyUploadedBy() {
        return this.recentlyUploadedBy;
    }

    public String getType() {
        return this.type;
    }

    public String getVideoId() {
        return this.videoId;
    }

    public String getWebsiteUrl() {
        return this.websiteUrl;
    }

    public PromotedItemId setRecentlyUploadedBy(String str) {
        this.recentlyUploadedBy = str;
        return this;
    }

    public PromotedItemId setType(String str) {
        this.type = str;
        return this;
    }

    public PromotedItemId setVideoId(String str) {
        this.videoId = str;
        return this;
    }

    public PromotedItemId setWebsiteUrl(String str) {
        this.websiteUrl = str;
        return this;
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData
    public PromotedItemId set(String str, Object obj) {
        return (PromotedItemId) super.set(str, obj);
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData, java.util.AbstractMap
    public PromotedItemId clone() {
        return (PromotedItemId) super.clone();
    }
}
