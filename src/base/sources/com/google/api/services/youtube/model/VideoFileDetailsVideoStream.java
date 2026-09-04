package com.google.api.services.youtube.model;

import com.google.api.client.json.GenericJson;
import com.google.api.client.json.JsonString;
import com.google.api.client.util.Key;
import java.math.BigInteger;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class VideoFileDetailsVideoStream extends GenericJson {

    @Key
    private Double aspectRatio;

    @JsonString
    @Key
    private BigInteger bitrateBps;

    @Key
    private String codec;

    @Key
    private Double frameRateFps;

    @Key
    private Long heightPixels;

    @Key
    private String rotation;

    @Key
    private String vendor;

    @Key
    private Long widthPixels;

    public Double getAspectRatio() {
        return this.aspectRatio;
    }

    public BigInteger getBitrateBps() {
        return this.bitrateBps;
    }

    public String getCodec() {
        return this.codec;
    }

    public Double getFrameRateFps() {
        return this.frameRateFps;
    }

    public Long getHeightPixels() {
        return this.heightPixels;
    }

    public String getRotation() {
        return this.rotation;
    }

    public String getVendor() {
        return this.vendor;
    }

    public Long getWidthPixels() {
        return this.widthPixels;
    }

    public VideoFileDetailsVideoStream setAspectRatio(Double d10) {
        this.aspectRatio = d10;
        return this;
    }

    public VideoFileDetailsVideoStream setBitrateBps(BigInteger bigInteger) {
        this.bitrateBps = bigInteger;
        return this;
    }

    public VideoFileDetailsVideoStream setCodec(String str) {
        this.codec = str;
        return this;
    }

    public VideoFileDetailsVideoStream setFrameRateFps(Double d10) {
        this.frameRateFps = d10;
        return this;
    }

    public VideoFileDetailsVideoStream setHeightPixels(Long l10) {
        this.heightPixels = l10;
        return this;
    }

    public VideoFileDetailsVideoStream setRotation(String str) {
        this.rotation = str;
        return this;
    }

    public VideoFileDetailsVideoStream setVendor(String str) {
        this.vendor = str;
        return this;
    }

    public VideoFileDetailsVideoStream setWidthPixels(Long l10) {
        this.widthPixels = l10;
        return this;
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData
    public VideoFileDetailsVideoStream set(String str, Object obj) {
        return (VideoFileDetailsVideoStream) super.set(str, obj);
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData, java.util.AbstractMap
    public VideoFileDetailsVideoStream clone() {
        return (VideoFileDetailsVideoStream) super.clone();
    }
}
