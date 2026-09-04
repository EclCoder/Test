package com.google.api.services.youtube.model;

import com.google.api.client.json.GenericJson;
import com.google.api.client.util.Key;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class IngestionInfo extends GenericJson {

    @Key
    private String backupIngestionAddress;

    @Key
    private String ingestionAddress;

    @Key
    private String rtmpsBackupIngestionAddress;

    @Key
    private String rtmpsIngestionAddress;

    @Key
    private String streamName;

    public String getBackupIngestionAddress() {
        return this.backupIngestionAddress;
    }

    public String getIngestionAddress() {
        return this.ingestionAddress;
    }

    public String getRtmpsBackupIngestionAddress() {
        return this.rtmpsBackupIngestionAddress;
    }

    public String getRtmpsIngestionAddress() {
        return this.rtmpsIngestionAddress;
    }

    public String getStreamName() {
        return this.streamName;
    }

    public IngestionInfo setBackupIngestionAddress(String str) {
        this.backupIngestionAddress = str;
        return this;
    }

    public IngestionInfo setIngestionAddress(String str) {
        this.ingestionAddress = str;
        return this;
    }

    public IngestionInfo setRtmpsBackupIngestionAddress(String str) {
        this.rtmpsBackupIngestionAddress = str;
        return this;
    }

    public IngestionInfo setRtmpsIngestionAddress(String str) {
        this.rtmpsIngestionAddress = str;
        return this;
    }

    public IngestionInfo setStreamName(String str) {
        this.streamName = str;
        return this;
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData
    public IngestionInfo set(String str, Object obj) {
        return (IngestionInfo) super.set(str, obj);
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData, java.util.AbstractMap
    public IngestionInfo clone() {
        return (IngestionInfo) super.clone();
    }
}
