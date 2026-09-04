package com.google.api.services.youtube.model;

import com.google.api.client.json.GenericJson;
import com.google.api.client.util.Key;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class LiveChatModerator extends GenericJson {

    @Key
    private String etag;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @Key
    private String f21630id;

    @Key
    private String kind;

    @Key
    private LiveChatModeratorSnippet snippet;

    public String getEtag() {
        return this.etag;
    }

    public String getId() {
        return this.f21630id;
    }

    public String getKind() {
        return this.kind;
    }

    public LiveChatModeratorSnippet getSnippet() {
        return this.snippet;
    }

    public LiveChatModerator setEtag(String str) {
        this.etag = str;
        return this;
    }

    public LiveChatModerator setId(String str) {
        this.f21630id = str;
        return this;
    }

    public LiveChatModerator setKind(String str) {
        this.kind = str;
        return this;
    }

    public LiveChatModerator setSnippet(LiveChatModeratorSnippet liveChatModeratorSnippet) {
        this.snippet = liveChatModeratorSnippet;
        return this;
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData
    public LiveChatModerator set(String str, Object obj) {
        return (LiveChatModerator) super.set(str, obj);
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData, java.util.AbstractMap
    public LiveChatModerator clone() {
        return (LiveChatModerator) super.clone();
    }
}
