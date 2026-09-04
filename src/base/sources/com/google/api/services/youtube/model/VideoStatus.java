package com.google.api.services.youtube.model;

import com.google.api.client.json.GenericJson;
import com.google.api.client.util.Key;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class VideoStatus extends GenericJson {

    @Key
    private Boolean embeddable;

    @Key
    private String failureReason;

    @Key
    private String license;

    @Key
    private Boolean madeForKids;

    @Key
    private String privacyStatus;

    @Key
    private Boolean publicStatsViewable;

    @Key
    private String publishAt;

    @Key
    private String rejectionReason;

    @Key
    private Boolean selfDeclaredMadeForKids;

    @Key
    private String uploadStatus;

    public Boolean getEmbeddable() {
        return this.embeddable;
    }

    public String getFailureReason() {
        return this.failureReason;
    }

    public String getLicense() {
        return this.license;
    }

    public Boolean getMadeForKids() {
        return this.madeForKids;
    }

    public String getPrivacyStatus() {
        return this.privacyStatus;
    }

    public Boolean getPublicStatsViewable() {
        return this.publicStatsViewable;
    }

    public String getPublishAt() {
        return this.publishAt;
    }

    public String getRejectionReason() {
        return this.rejectionReason;
    }

    public Boolean getSelfDeclaredMadeForKids() {
        return this.selfDeclaredMadeForKids;
    }

    public String getUploadStatus() {
        return this.uploadStatus;
    }

    public VideoStatus setEmbeddable(Boolean bool) {
        this.embeddable = bool;
        return this;
    }

    public VideoStatus setFailureReason(String str) {
        this.failureReason = str;
        return this;
    }

    public VideoStatus setLicense(String str) {
        this.license = str;
        return this;
    }

    public VideoStatus setMadeForKids(Boolean bool) {
        this.madeForKids = bool;
        return this;
    }

    public VideoStatus setPrivacyStatus(String str) {
        this.privacyStatus = str;
        return this;
    }

    public VideoStatus setPublicStatsViewable(Boolean bool) {
        this.publicStatsViewable = bool;
        return this;
    }

    public VideoStatus setPublishAt(String str) {
        this.publishAt = str;
        return this;
    }

    public VideoStatus setRejectionReason(String str) {
        this.rejectionReason = str;
        return this;
    }

    public VideoStatus setSelfDeclaredMadeForKids(Boolean bool) {
        this.selfDeclaredMadeForKids = bool;
        return this;
    }

    public VideoStatus setUploadStatus(String str) {
        this.uploadStatus = str;
        return this;
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData
    public VideoStatus set(String str, Object obj) {
        return (VideoStatus) super.set(str, obj);
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData, java.util.AbstractMap
    public VideoStatus clone() {
        return (VideoStatus) super.clone();
    }
}
