package com.google.api.services.youtube.model;

import com.google.api.client.json.GenericJson;
import com.google.api.client.util.Key;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class CaptionSnippet extends GenericJson {

    @Key
    private String audioTrackType;

    @Key
    private String failureReason;

    @Key
    private Boolean isAutoSynced;

    @Key
    private Boolean isCC;

    @Key
    private Boolean isDraft;

    @Key
    private Boolean isEasyReader;

    @Key
    private Boolean isLarge;

    @Key
    private String language;

    @Key
    private String lastUpdated;

    @Key
    private String name;

    @Key
    private String status;

    @Key
    private String trackKind;

    @Key
    private String videoId;

    public String getAudioTrackType() {
        return this.audioTrackType;
    }

    public String getFailureReason() {
        return this.failureReason;
    }

    public Boolean getIsAutoSynced() {
        return this.isAutoSynced;
    }

    public Boolean getIsCC() {
        return this.isCC;
    }

    public Boolean getIsDraft() {
        return this.isDraft;
    }

    public Boolean getIsEasyReader() {
        return this.isEasyReader;
    }

    public Boolean getIsLarge() {
        return this.isLarge;
    }

    public String getLanguage() {
        return this.language;
    }

    public String getLastUpdated() {
        return this.lastUpdated;
    }

    public String getName() {
        return this.name;
    }

    public String getStatus() {
        return this.status;
    }

    public String getTrackKind() {
        return this.trackKind;
    }

    public String getVideoId() {
        return this.videoId;
    }

    public CaptionSnippet setAudioTrackType(String str) {
        this.audioTrackType = str;
        return this;
    }

    public CaptionSnippet setFailureReason(String str) {
        this.failureReason = str;
        return this;
    }

    public CaptionSnippet setIsAutoSynced(Boolean bool) {
        this.isAutoSynced = bool;
        return this;
    }

    public CaptionSnippet setIsCC(Boolean bool) {
        this.isCC = bool;
        return this;
    }

    public CaptionSnippet setIsDraft(Boolean bool) {
        this.isDraft = bool;
        return this;
    }

    public CaptionSnippet setIsEasyReader(Boolean bool) {
        this.isEasyReader = bool;
        return this;
    }

    public CaptionSnippet setIsLarge(Boolean bool) {
        this.isLarge = bool;
        return this;
    }

    public CaptionSnippet setLanguage(String str) {
        this.language = str;
        return this;
    }

    public CaptionSnippet setLastUpdated(String str) {
        this.lastUpdated = str;
        return this;
    }

    public CaptionSnippet setName(String str) {
        this.name = str;
        return this;
    }

    public CaptionSnippet setStatus(String str) {
        this.status = str;
        return this;
    }

    public CaptionSnippet setTrackKind(String str) {
        this.trackKind = str;
        return this;
    }

    public CaptionSnippet setVideoId(String str) {
        this.videoId = str;
        return this;
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData
    public CaptionSnippet set(String str, Object obj) {
        return (CaptionSnippet) super.set(str, obj);
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData, java.util.AbstractMap
    public CaptionSnippet clone() {
        return (CaptionSnippet) super.clone();
    }
}
