package com.google.api.services.youtube.model;

import com.google.api.client.json.GenericJson;
import com.google.api.client.json.JsonString;
import com.google.api.client.util.Key;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class VideoPlayer extends GenericJson {

    @JsonString
    @Key
    private Long embedHeight;

    @Key
    private String embedHtml;

    @JsonString
    @Key
    private Long embedWidth;

    public Long getEmbedHeight() {
        return this.embedHeight;
    }

    public String getEmbedHtml() {
        return this.embedHtml;
    }

    public Long getEmbedWidth() {
        return this.embedWidth;
    }

    public VideoPlayer setEmbedHeight(Long l10) {
        this.embedHeight = l10;
        return this;
    }

    public VideoPlayer setEmbedHtml(String str) {
        this.embedHtml = str;
        return this;
    }

    public VideoPlayer setEmbedWidth(Long l10) {
        this.embedWidth = l10;
        return this;
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData
    public VideoPlayer set(String str, Object obj) {
        return (VideoPlayer) super.set(str, obj);
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData, java.util.AbstractMap
    public VideoPlayer clone() {
        return (VideoPlayer) super.clone();
    }
}
