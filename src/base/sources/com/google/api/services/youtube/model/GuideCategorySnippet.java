package com.google.api.services.youtube.model;

import com.google.api.client.json.GenericJson;
import com.google.api.client.util.Key;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class GuideCategorySnippet extends GenericJson {

    @Key
    private String channelId;

    @Key
    private String title;

    public String getChannelId() {
        return this.channelId;
    }

    public String getTitle() {
        return this.title;
    }

    public GuideCategorySnippet setChannelId(String str) {
        this.channelId = str;
        return this;
    }

    public GuideCategorySnippet setTitle(String str) {
        this.title = str;
        return this;
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData
    public GuideCategorySnippet set(String str, Object obj) {
        return (GuideCategorySnippet) super.set(str, obj);
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData, java.util.AbstractMap
    public GuideCategorySnippet clone() {
        return (GuideCategorySnippet) super.clone();
    }
}
