package com.google.api.services.youtube.model;

import com.google.api.client.json.GenericJson;
import com.google.api.client.util.Key;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class LiveChatMessage extends GenericJson {

    @Key
    private LiveChatMessageAuthorDetails authorDetails;

    @Key
    private String etag;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @Key
    private String f21629id;

    @Key
    private String kind;

    @Key
    private LiveChatMessageSnippet snippet;

    public LiveChatMessageAuthorDetails getAuthorDetails() {
        return this.authorDetails;
    }

    public String getEtag() {
        return this.etag;
    }

    public String getId() {
        return this.f21629id;
    }

    public String getKind() {
        return this.kind;
    }

    public LiveChatMessageSnippet getSnippet() {
        return this.snippet;
    }

    public LiveChatMessage setAuthorDetails(LiveChatMessageAuthorDetails liveChatMessageAuthorDetails) {
        this.authorDetails = liveChatMessageAuthorDetails;
        return this;
    }

    public LiveChatMessage setEtag(String str) {
        this.etag = str;
        return this;
    }

    public LiveChatMessage setId(String str) {
        this.f21629id = str;
        return this;
    }

    public LiveChatMessage setKind(String str) {
        this.kind = str;
        return this;
    }

    public LiveChatMessage setSnippet(LiveChatMessageSnippet liveChatMessageSnippet) {
        this.snippet = liveChatMessageSnippet;
        return this;
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData
    public LiveChatMessage set(String str, Object obj) {
        return (LiveChatMessage) super.set(str, obj);
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData, java.util.AbstractMap
    public LiveChatMessage clone() {
        return (LiveChatMessage) super.clone();
    }
}
