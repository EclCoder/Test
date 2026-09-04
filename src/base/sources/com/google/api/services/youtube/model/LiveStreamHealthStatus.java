package com.google.api.services.youtube.model;

import com.google.api.client.json.GenericJson;
import com.google.api.client.json.JsonString;
import com.google.api.client.util.Data;
import com.google.api.client.util.Key;
import java.math.BigInteger;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class LiveStreamHealthStatus extends GenericJson {

    @Key
    private List<LiveStreamConfigurationIssue> configurationIssues;

    @JsonString
    @Key
    private BigInteger lastUpdateTimeSeconds;

    @Key
    private String status;

    static {
        Data.nullOf(LiveStreamConfigurationIssue.class);
    }

    public List<LiveStreamConfigurationIssue> getConfigurationIssues() {
        return this.configurationIssues;
    }

    public BigInteger getLastUpdateTimeSeconds() {
        return this.lastUpdateTimeSeconds;
    }

    public String getStatus() {
        return this.status;
    }

    public LiveStreamHealthStatus setConfigurationIssues(List<LiveStreamConfigurationIssue> list) {
        this.configurationIssues = list;
        return this;
    }

    public LiveStreamHealthStatus setLastUpdateTimeSeconds(BigInteger bigInteger) {
        this.lastUpdateTimeSeconds = bigInteger;
        return this;
    }

    public LiveStreamHealthStatus setStatus(String str) {
        this.status = str;
        return this;
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData
    public LiveStreamHealthStatus set(String str, Object obj) {
        return (LiveStreamHealthStatus) super.set(str, obj);
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData, java.util.AbstractMap
    public LiveStreamHealthStatus clone() {
        return (LiveStreamHealthStatus) super.clone();
    }
}
