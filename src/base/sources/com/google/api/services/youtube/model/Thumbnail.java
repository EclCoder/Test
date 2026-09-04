package com.google.api.services.youtube.model;

import com.google.api.client.json.GenericJson;
import com.google.api.client.util.Key;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class Thumbnail extends GenericJson {

    @Key
    private Long height;

    @Key
    private String url;

    @Key
    private Long width;

    public Long getHeight() {
        return this.height;
    }

    public String getUrl() {
        return this.url;
    }

    public Long getWidth() {
        return this.width;
    }

    public Thumbnail setHeight(Long l10) {
        this.height = l10;
        return this;
    }

    public Thumbnail setUrl(String str) {
        this.url = str;
        return this;
    }

    public Thumbnail setWidth(Long l10) {
        this.width = l10;
        return this;
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData
    public Thumbnail set(String str, Object obj) {
        return (Thumbnail) super.set(str, obj);
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData, java.util.AbstractMap
    public Thumbnail clone() {
        return (Thumbnail) super.clone();
    }
}
