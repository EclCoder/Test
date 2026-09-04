package com.google.api.services.youtube.model;

import com.google.api.client.json.GenericJson;
import com.google.api.client.util.Key;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class VideoCategorySnippet extends GenericJson {

    @Key
    private Boolean assignable;

    @Key
    private String channelId;

    @Key
    private String title;

    public Boolean getAssignable() {
        return this.assignable;
    }

    public String getChannelId() {
        return this.channelId;
    }

    public String getTitle() {
        return this.title;
    }

    public VideoCategorySnippet setAssignable(Boolean bool) {
        this.assignable = bool;
        return this;
    }

    public VideoCategorySnippet setChannelId(String str) {
        this.channelId = str;
        return this;
    }

    public VideoCategorySnippet setTitle(String str) {
        this.title = str;
        return this;
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData
    public VideoCategorySnippet set(String str, Object obj) {
        return (VideoCategorySnippet) super.set(str, obj);
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData, java.util.AbstractMap
    public VideoCategorySnippet clone() {
        return (VideoCategorySnippet) super.clone();
    }
}
