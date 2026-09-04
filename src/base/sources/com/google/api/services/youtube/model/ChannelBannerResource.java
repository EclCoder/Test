package com.google.api.services.youtube.model;

import com.google.api.client.json.GenericJson;
import com.google.api.client.util.Key;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class ChannelBannerResource extends GenericJson {

    @Key
    private String etag;

    @Key
    private String kind;

    @Key
    private String url;

    public String getEtag() {
        return this.etag;
    }

    public String getKind() {
        return this.kind;
    }

    public String getUrl() {
        return this.url;
    }

    public ChannelBannerResource setEtag(String str) {
        this.etag = str;
        return this;
    }

    public ChannelBannerResource setKind(String str) {
        this.kind = str;
        return this;
    }

    public ChannelBannerResource setUrl(String str) {
        this.url = str;
        return this;
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData
    public ChannelBannerResource set(String str, Object obj) {
        return (ChannelBannerResource) super.set(str, obj);
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData, java.util.AbstractMap
    public ChannelBannerResource clone() {
        return (ChannelBannerResource) super.clone();
    }
}
