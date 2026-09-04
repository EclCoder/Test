package com.google.api.services.youtube.model;

import com.google.api.client.json.GenericJson;
import com.google.api.client.util.Key;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class VideoAbuseReport extends GenericJson {

    @Key
    private String comments;

    @Key
    private String language;

    @Key
    private String reasonId;

    @Key
    private String secondaryReasonId;

    @Key
    private String videoId;

    public String getComments() {
        return this.comments;
    }

    public String getLanguage() {
        return this.language;
    }

    public String getReasonId() {
        return this.reasonId;
    }

    public String getSecondaryReasonId() {
        return this.secondaryReasonId;
    }

    public String getVideoId() {
        return this.videoId;
    }

    public VideoAbuseReport setComments(String str) {
        this.comments = str;
        return this;
    }

    public VideoAbuseReport setLanguage(String str) {
        this.language = str;
        return this;
    }

    public VideoAbuseReport setReasonId(String str) {
        this.reasonId = str;
        return this;
    }

    public VideoAbuseReport setSecondaryReasonId(String str) {
        this.secondaryReasonId = str;
        return this;
    }

    public VideoAbuseReport setVideoId(String str) {
        this.videoId = str;
        return this;
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData
    public VideoAbuseReport set(String str, Object obj) {
        return (VideoAbuseReport) super.set(str, obj);
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData, java.util.AbstractMap
    public VideoAbuseReport clone() {
        return (VideoAbuseReport) super.clone();
    }
}
