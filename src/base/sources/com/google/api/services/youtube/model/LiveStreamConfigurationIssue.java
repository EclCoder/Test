package com.google.api.services.youtube.model;

import com.google.api.client.json.GenericJson;
import com.google.api.client.util.Key;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class LiveStreamConfigurationIssue extends GenericJson {

    @Key
    private String description;

    @Key
    private String reason;

    @Key
    private String severity;

    @Key
    private String type;

    public String getDescription() {
        return this.description;
    }

    public String getReason() {
        return this.reason;
    }

    public String getSeverity() {
        return this.severity;
    }

    public String getType() {
        return this.type;
    }

    public LiveStreamConfigurationIssue setDescription(String str) {
        this.description = str;
        return this;
    }

    public LiveStreamConfigurationIssue setReason(String str) {
        this.reason = str;
        return this;
    }

    public LiveStreamConfigurationIssue setSeverity(String str) {
        this.severity = str;
        return this;
    }

    public LiveStreamConfigurationIssue setType(String str) {
        this.type = str;
        return this;
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData
    public LiveStreamConfigurationIssue set(String str, Object obj) {
        return (LiveStreamConfigurationIssue) super.set(str, obj);
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData, java.util.AbstractMap
    public LiveStreamConfigurationIssue clone() {
        return (LiveStreamConfigurationIssue) super.clone();
    }
}
