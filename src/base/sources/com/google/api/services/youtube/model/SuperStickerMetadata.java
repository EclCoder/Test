package com.google.api.services.youtube.model;

import com.google.api.client.json.GenericJson;
import com.google.api.client.util.Key;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class SuperStickerMetadata extends GenericJson {

    @Key
    private String altText;

    @Key
    private String altTextLanguage;

    @Key
    private String stickerId;

    public String getAltText() {
        return this.altText;
    }

    public String getAltTextLanguage() {
        return this.altTextLanguage;
    }

    public String getStickerId() {
        return this.stickerId;
    }

    public SuperStickerMetadata setAltText(String str) {
        this.altText = str;
        return this;
    }

    public SuperStickerMetadata setAltTextLanguage(String str) {
        this.altTextLanguage = str;
        return this;
    }

    public SuperStickerMetadata setStickerId(String str) {
        this.stickerId = str;
        return this;
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData
    public SuperStickerMetadata set(String str, Object obj) {
        return (SuperStickerMetadata) super.set(str, obj);
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData, java.util.AbstractMap
    public SuperStickerMetadata clone() {
        return (SuperStickerMetadata) super.clone();
    }
}
