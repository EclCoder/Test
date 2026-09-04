package com.google.api.services.youtube.model;

import com.google.api.client.json.GenericJson;
import com.google.api.client.util.Key;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class PlaylistItem extends GenericJson {

    @Key
    private PlaylistItemContentDetails contentDetails;

    @Key
    private String etag;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @Key
    private String f21636id;

    @Key
    private String kind;

    @Key
    private PlaylistItemSnippet snippet;

    @Key
    private PlaylistItemStatus status;

    public PlaylistItemContentDetails getContentDetails() {
        return this.contentDetails;
    }

    public String getEtag() {
        return this.etag;
    }

    public String getId() {
        return this.f21636id;
    }

    public String getKind() {
        return this.kind;
    }

    public PlaylistItemSnippet getSnippet() {
        return this.snippet;
    }

    public PlaylistItemStatus getStatus() {
        return this.status;
    }

    public PlaylistItem setContentDetails(PlaylistItemContentDetails playlistItemContentDetails) {
        this.contentDetails = playlistItemContentDetails;
        return this;
    }

    public PlaylistItem setEtag(String str) {
        this.etag = str;
        return this;
    }

    public PlaylistItem setId(String str) {
        this.f21636id = str;
        return this;
    }

    public PlaylistItem setKind(String str) {
        this.kind = str;
        return this;
    }

    public PlaylistItem setSnippet(PlaylistItemSnippet playlistItemSnippet) {
        this.snippet = playlistItemSnippet;
        return this;
    }

    public PlaylistItem setStatus(PlaylistItemStatus playlistItemStatus) {
        this.status = playlistItemStatus;
        return this;
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData
    public PlaylistItem set(String str, Object obj) {
        return (PlaylistItem) super.set(str, obj);
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData, java.util.AbstractMap
    public PlaylistItem clone() {
        return (PlaylistItem) super.clone();
    }
}
