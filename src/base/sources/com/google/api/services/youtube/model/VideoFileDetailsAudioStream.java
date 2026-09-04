package com.google.api.services.youtube.model;

import com.google.api.client.json.GenericJson;
import com.google.api.client.json.JsonString;
import com.google.api.client.util.Key;
import java.math.BigInteger;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class VideoFileDetailsAudioStream extends GenericJson {

    @JsonString
    @Key
    private BigInteger bitrateBps;

    @Key
    private Long channelCount;

    @Key
    private String codec;

    @Key
    private String vendor;

    public BigInteger getBitrateBps() {
        return this.bitrateBps;
    }

    public Long getChannelCount() {
        return this.channelCount;
    }

    public String getCodec() {
        return this.codec;
    }

    public String getVendor() {
        return this.vendor;
    }

    public VideoFileDetailsAudioStream setBitrateBps(BigInteger bigInteger) {
        this.bitrateBps = bigInteger;
        return this;
    }

    public VideoFileDetailsAudioStream setChannelCount(Long l10) {
        this.channelCount = l10;
        return this;
    }

    public VideoFileDetailsAudioStream setCodec(String str) {
        this.codec = str;
        return this;
    }

    public VideoFileDetailsAudioStream setVendor(String str) {
        this.vendor = str;
        return this;
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData
    public VideoFileDetailsAudioStream set(String str, Object obj) {
        return (VideoFileDetailsAudioStream) super.set(str, obj);
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData, java.util.AbstractMap
    public VideoFileDetailsAudioStream clone() {
        return (VideoFileDetailsAudioStream) super.clone();
    }
}
