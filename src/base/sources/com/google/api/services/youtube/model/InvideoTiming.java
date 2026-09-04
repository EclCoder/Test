package com.google.api.services.youtube.model;

import com.google.api.client.json.GenericJson;
import com.google.api.client.json.JsonString;
import com.google.api.client.util.Key;
import java.math.BigInteger;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class InvideoTiming extends GenericJson {

    @JsonString
    @Key
    private BigInteger durationMs;

    @JsonString
    @Key
    private BigInteger offsetMs;

    @Key
    private String type;

    public BigInteger getDurationMs() {
        return this.durationMs;
    }

    public BigInteger getOffsetMs() {
        return this.offsetMs;
    }

    public String getType() {
        return this.type;
    }

    public InvideoTiming setDurationMs(BigInteger bigInteger) {
        this.durationMs = bigInteger;
        return this;
    }

    public InvideoTiming setOffsetMs(BigInteger bigInteger) {
        this.offsetMs = bigInteger;
        return this;
    }

    public InvideoTiming setType(String str) {
        this.type = str;
        return this;
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData
    public InvideoTiming set(String str, Object obj) {
        return (InvideoTiming) super.set(str, obj);
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData, java.util.AbstractMap
    public InvideoTiming clone() {
        return (InvideoTiming) super.clone();
    }
}
