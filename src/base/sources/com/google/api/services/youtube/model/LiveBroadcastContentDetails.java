package com.google.api.services.youtube.model;

import com.google.api.client.json.GenericJson;
import com.google.api.client.util.Base64;
import com.google.api.client.util.Key;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class LiveBroadcastContentDetails extends GenericJson {

    @Key
    private String boundStreamId;

    @Key
    private String boundStreamLastUpdateTimeMs;

    @Key
    private String closedCaptionsType;

    @Key
    private Boolean enableAutoStart;

    @Key
    private Boolean enableAutoStop;

    @Key
    private Boolean enableClosedCaptions;

    @Key
    private Boolean enableContentEncryption;

    @Key
    private Boolean enableDvr;

    @Key
    private Boolean enableEmbed;

    @Key
    private Boolean enableLowLatency;

    @Key
    private String latencyPreference;

    @Key
    private String mesh;

    @Key
    private MonitorStreamInfo monitorStream;

    @Key
    private String projection;

    @Key
    private Boolean recordFromStart;

    @Key
    private Boolean startWithSlate;

    public byte[] decodeMesh() {
        return Base64.decodeBase64(this.mesh);
    }

    public LiveBroadcastContentDetails encodeMesh(byte[] bArr) {
        this.mesh = Base64.encodeBase64URLSafeString(bArr);
        return this;
    }

    public String getBoundStreamId() {
        return this.boundStreamId;
    }

    public String getBoundStreamLastUpdateTimeMs() {
        return this.boundStreamLastUpdateTimeMs;
    }

    public String getClosedCaptionsType() {
        return this.closedCaptionsType;
    }

    public Boolean getEnableAutoStart() {
        return this.enableAutoStart;
    }

    public Boolean getEnableAutoStop() {
        return this.enableAutoStop;
    }

    public Boolean getEnableClosedCaptions() {
        return this.enableClosedCaptions;
    }

    public Boolean getEnableContentEncryption() {
        return this.enableContentEncryption;
    }

    public Boolean getEnableDvr() {
        return this.enableDvr;
    }

    public Boolean getEnableEmbed() {
        return this.enableEmbed;
    }

    public Boolean getEnableLowLatency() {
        return this.enableLowLatency;
    }

    public String getLatencyPreference() {
        return this.latencyPreference;
    }

    public String getMesh() {
        return this.mesh;
    }

    public MonitorStreamInfo getMonitorStream() {
        return this.monitorStream;
    }

    public String getProjection() {
        return this.projection;
    }

    public Boolean getRecordFromStart() {
        return this.recordFromStart;
    }

    public Boolean getStartWithSlate() {
        return this.startWithSlate;
    }

    public LiveBroadcastContentDetails setBoundStreamId(String str) {
        this.boundStreamId = str;
        return this;
    }

    public LiveBroadcastContentDetails setBoundStreamLastUpdateTimeMs(String str) {
        this.boundStreamLastUpdateTimeMs = str;
        return this;
    }

    public LiveBroadcastContentDetails setClosedCaptionsType(String str) {
        this.closedCaptionsType = str;
        return this;
    }

    public LiveBroadcastContentDetails setEnableAutoStart(Boolean bool) {
        this.enableAutoStart = bool;
        return this;
    }

    public LiveBroadcastContentDetails setEnableAutoStop(Boolean bool) {
        this.enableAutoStop = bool;
        return this;
    }

    public LiveBroadcastContentDetails setEnableClosedCaptions(Boolean bool) {
        this.enableClosedCaptions = bool;
        return this;
    }

    public LiveBroadcastContentDetails setEnableContentEncryption(Boolean bool) {
        this.enableContentEncryption = bool;
        return this;
    }

    public LiveBroadcastContentDetails setEnableDvr(Boolean bool) {
        this.enableDvr = bool;
        return this;
    }

    public LiveBroadcastContentDetails setEnableEmbed(Boolean bool) {
        this.enableEmbed = bool;
        return this;
    }

    public LiveBroadcastContentDetails setEnableLowLatency(Boolean bool) {
        this.enableLowLatency = bool;
        return this;
    }

    public LiveBroadcastContentDetails setLatencyPreference(String str) {
        this.latencyPreference = str;
        return this;
    }

    public LiveBroadcastContentDetails setMesh(String str) {
        this.mesh = str;
        return this;
    }

    public LiveBroadcastContentDetails setMonitorStream(MonitorStreamInfo monitorStreamInfo) {
        this.monitorStream = monitorStreamInfo;
        return this;
    }

    public LiveBroadcastContentDetails setProjection(String str) {
        this.projection = str;
        return this;
    }

    public LiveBroadcastContentDetails setRecordFromStart(Boolean bool) {
        this.recordFromStart = bool;
        return this;
    }

    public LiveBroadcastContentDetails setStartWithSlate(Boolean bool) {
        this.startWithSlate = bool;
        return this;
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData
    public LiveBroadcastContentDetails set(String str, Object obj) {
        return (LiveBroadcastContentDetails) super.set(str, obj);
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData, java.util.AbstractMap
    public LiveBroadcastContentDetails clone() {
        return (LiveBroadcastContentDetails) super.clone();
    }
}
