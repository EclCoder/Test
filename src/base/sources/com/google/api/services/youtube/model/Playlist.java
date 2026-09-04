package com.google.api.services.youtube.model;

import com.google.api.client.json.GenericJson;
import com.google.api.client.util.Key;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class Playlist extends GenericJson {

    @Key
    private PlaylistContentDetails contentDetails;

    @Key
    private String etag;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @Key
    private String f21635id;

    @Key
    private String kind;

    @Key
    private Map<String, PlaylistLocalization> localizations;

    @Key
    private PlaylistPlayer player;

    @Key
    private PlaylistSnippet snippet;

    @Key
    private PlaylistStatus status;

    public PlaylistContentDetails getContentDetails() {
        return this.contentDetails;
    }

    public String getEtag() {
        return this.etag;
    }

    public String getId() {
        return this.f21635id;
    }

    public String getKind() {
        return this.kind;
    }

    public Map<String, PlaylistLocalization> getLocalizations() {
        return this.localizations;
    }

    public PlaylistPlayer getPlayer() {
        return this.player;
    }

    public PlaylistSnippet getSnippet() {
        return this.snippet;
    }

    public PlaylistStatus getStatus() {
        return this.status;
    }

    public Playlist setContentDetails(PlaylistContentDetails playlistContentDetails) {
        this.contentDetails = playlistContentDetails;
        return this;
    }

    public Playlist setEtag(String str) {
        this.etag = str;
        return this;
    }

    public Playlist setId(String str) {
        this.f21635id = str;
        return this;
    }

    public Playlist setKind(String str) {
        this.kind = str;
        return this;
    }

    public Playlist setLocalizations(Map<String, PlaylistLocalization> map) {
        this.localizations = map;
        return this;
    }

    public Playlist setPlayer(PlaylistPlayer playlistPlayer) {
        this.player = playlistPlayer;
        return this;
    }

    public Playlist setSnippet(PlaylistSnippet playlistSnippet) {
        this.snippet = playlistSnippet;
        return this;
    }

    public Playlist setStatus(PlaylistStatus playlistStatus) {
        this.status = playlistStatus;
        return this;
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData
    public Playlist set(String str, Object obj) {
        return (Playlist) super.set(str, obj);
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData, java.util.AbstractMap
    public Playlist clone() {
        return (Playlist) super.clone();
    }
}
