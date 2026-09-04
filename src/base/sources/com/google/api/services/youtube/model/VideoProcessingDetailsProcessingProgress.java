package com.google.api.services.youtube.model;

import com.google.api.client.json.GenericJson;
import com.google.api.client.json.JsonString;
import com.google.api.client.util.Key;
import java.math.BigInteger;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class VideoProcessingDetailsProcessingProgress extends GenericJson {

    @JsonString
    @Key
    private BigInteger partsProcessed;

    @JsonString
    @Key
    private BigInteger partsTotal;

    @JsonString
    @Key
    private BigInteger timeLeftMs;

    public BigInteger getPartsProcessed() {
        return this.partsProcessed;
    }

    public BigInteger getPartsTotal() {
        return this.partsTotal;
    }

    public BigInteger getTimeLeftMs() {
        return this.timeLeftMs;
    }

    public VideoProcessingDetailsProcessingProgress setPartsProcessed(BigInteger bigInteger) {
        this.partsProcessed = bigInteger;
        return this;
    }

    public VideoProcessingDetailsProcessingProgress setPartsTotal(BigInteger bigInteger) {
        this.partsTotal = bigInteger;
        return this;
    }

    public VideoProcessingDetailsProcessingProgress setTimeLeftMs(BigInteger bigInteger) {
        this.timeLeftMs = bigInteger;
        return this;
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData
    public VideoProcessingDetailsProcessingProgress set(String str, Object obj) {
        return (VideoProcessingDetailsProcessingProgress) super.set(str, obj);
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData, java.util.AbstractMap
    public VideoProcessingDetailsProcessingProgress clone() {
        return (VideoProcessingDetailsProcessingProgress) super.clone();
    }
}
