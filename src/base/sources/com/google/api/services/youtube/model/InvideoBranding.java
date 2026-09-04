package com.google.api.services.youtube.model;

import com.google.api.client.json.GenericJson;
import com.google.api.client.util.Base64;
import com.google.api.client.util.Key;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class InvideoBranding extends GenericJson {

    @Key
    private String imageBytes;

    @Key
    private String imageUrl;

    @Key
    private InvideoPosition position;

    @Key
    private String targetChannelId;

    @Key
    private InvideoTiming timing;

    public byte[] decodeImageBytes() {
        return Base64.decodeBase64(this.imageBytes);
    }

    public InvideoBranding encodeImageBytes(byte[] bArr) {
        this.imageBytes = Base64.encodeBase64URLSafeString(bArr);
        return this;
    }

    public String getImageBytes() {
        return this.imageBytes;
    }

    public String getImageUrl() {
        return this.imageUrl;
    }

    public InvideoPosition getPosition() {
        return this.position;
    }

    public String getTargetChannelId() {
        return this.targetChannelId;
    }

    public InvideoTiming getTiming() {
        return this.timing;
    }

    public InvideoBranding setImageBytes(String str) {
        this.imageBytes = str;
        return this;
    }

    public InvideoBranding setImageUrl(String str) {
        this.imageUrl = str;
        return this;
    }

    public InvideoBranding setPosition(InvideoPosition invideoPosition) {
        this.position = invideoPosition;
        return this;
    }

    public InvideoBranding setTargetChannelId(String str) {
        this.targetChannelId = str;
        return this;
    }

    public InvideoBranding setTiming(InvideoTiming invideoTiming) {
        this.timing = invideoTiming;
        return this;
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData
    public InvideoBranding set(String str, Object obj) {
        return (InvideoBranding) super.set(str, obj);
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData, java.util.AbstractMap
    public InvideoBranding clone() {
        return (InvideoBranding) super.clone();
    }
}
