package com.google.api.services.youtube.model;

import com.google.api.client.json.GenericJson;
import com.google.api.client.util.Key;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class ResourceId extends GenericJson {

    @Key
    private String channelId;

    @Key
    private String kind;

    @Key
    private String playlistId;

    @Key
    private String videoId;

    public String getChannelId() {
        return this.channelId;
    }

    public String getKind() {
        return this.kind;
    }

    public String getPlaylistId() {
        return this.playlistId;
    }

    public String getVideoId() {
        return this.videoId;
    }

    public ResourceId setChannelId(String str) {
        this.channelId = str;
        return this;
    }

    public ResourceId setKind(String str) {
        this.kind = str;
        return this;
    }

    public ResourceId setPlaylistId(String str) {
        this.playlistId = str;
        return this;
    }

    public ResourceId setVideoId(String str) {
        this.videoId = str;
        return this;
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData
    public ResourceId set(String str, Object obj) {
        return (ResourceId) super.set(str, obj);
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData, java.util.AbstractMap
    public ResourceId clone() {
        return (ResourceId) super.clone();
    }
}
