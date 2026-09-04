package com.google.api.services.youtube.model;

import com.google.api.client.json.GenericJson;
import com.google.api.client.json.JsonString;
import com.google.api.client.util.Key;
import java.math.BigInteger;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class VideoLiveStreamingDetails extends GenericJson {

    @Key
    private String activeLiveChatId;

    @Key
    private String actualEndTime;

    @Key
    private String actualStartTime;

    @JsonString
    @Key
    private BigInteger concurrentViewers;

    @Key
    private String scheduledEndTime;

    @Key
    private String scheduledStartTime;

    public String getActiveLiveChatId() {
        return this.activeLiveChatId;
    }

    public String getActualEndTime() {
        return this.actualEndTime;
    }

    public String getActualStartTime() {
        return this.actualStartTime;
    }

    public BigInteger getConcurrentViewers() {
        return this.concurrentViewers;
    }

    public String getScheduledEndTime() {
        return this.scheduledEndTime;
    }

    public String getScheduledStartTime() {
        return this.scheduledStartTime;
    }

    public VideoLiveStreamingDetails setActiveLiveChatId(String str) {
        this.activeLiveChatId = str;
        return this;
    }

    public VideoLiveStreamingDetails setActualEndTime(String str) {
        this.actualEndTime = str;
        return this;
    }

    public VideoLiveStreamingDetails setActualStartTime(String str) {
        this.actualStartTime = str;
        return this;
    }

    public VideoLiveStreamingDetails setConcurrentViewers(BigInteger bigInteger) {
        this.concurrentViewers = bigInteger;
        return this;
    }

    public VideoLiveStreamingDetails setScheduledEndTime(String str) {
        this.scheduledEndTime = str;
        return this;
    }

    public VideoLiveStreamingDetails setScheduledStartTime(String str) {
        this.scheduledStartTime = str;
        return this;
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData
    public VideoLiveStreamingDetails set(String str, Object obj) {
        return (VideoLiveStreamingDetails) super.set(str, obj);
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData, java.util.AbstractMap
    public VideoLiveStreamingDetails clone() {
        return (VideoLiveStreamingDetails) super.clone();
    }
}
