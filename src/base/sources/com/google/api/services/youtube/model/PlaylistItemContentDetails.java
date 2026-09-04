package com.google.api.services.youtube.model;

import com.google.api.client.json.GenericJson;
import com.google.api.client.util.Key;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class PlaylistItemContentDetails extends GenericJson {

    @Key
    private String endAt;

    @Key
    private String note;

    @Key
    private String startAt;

    @Key
    private String videoId;

    @Key
    private String videoPublishedAt;

    public String getEndAt() {
        return this.endAt;
    }

    public String getNote() {
        return this.note;
    }

    public String getStartAt() {
        return this.startAt;
    }

    public String getVideoId() {
        return this.videoId;
    }

    public String getVideoPublishedAt() {
        return this.videoPublishedAt;
    }

    public PlaylistItemContentDetails setEndAt(String str) {
        this.endAt = str;
        return this;
    }

    public PlaylistItemContentDetails setNote(String str) {
        this.note = str;
        return this;
    }

    public PlaylistItemContentDetails setStartAt(String str) {
        this.startAt = str;
        return this;
    }

    public PlaylistItemContentDetails setVideoId(String str) {
        this.videoId = str;
        return this;
    }

    public PlaylistItemContentDetails setVideoPublishedAt(String str) {
        this.videoPublishedAt = str;
        return this;
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData
    public PlaylistItemContentDetails set(String str, Object obj) {
        return (PlaylistItemContentDetails) super.set(str, obj);
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData, java.util.AbstractMap
    public PlaylistItemContentDetails clone() {
        return (PlaylistItemContentDetails) super.clone();
    }
}
