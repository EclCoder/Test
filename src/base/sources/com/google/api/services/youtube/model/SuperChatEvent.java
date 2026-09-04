package com.google.api.services.youtube.model;

import com.google.api.client.json.GenericJson;
import com.google.api.client.util.Key;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class SuperChatEvent extends GenericJson {

    @Key
    private String etag;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @Key
    private String f21640id;

    @Key
    private String kind;

    @Key
    private SuperChatEventSnippet snippet;

    public String getEtag() {
        return this.etag;
    }

    public String getId() {
        return this.f21640id;
    }

    public String getKind() {
        return this.kind;
    }

    public SuperChatEventSnippet getSnippet() {
        return this.snippet;
    }

    public SuperChatEvent setEtag(String str) {
        this.etag = str;
        return this;
    }

    public SuperChatEvent setId(String str) {
        this.f21640id = str;
        return this;
    }

    public SuperChatEvent setKind(String str) {
        this.kind = str;
        return this;
    }

    public SuperChatEvent setSnippet(SuperChatEventSnippet superChatEventSnippet) {
        this.snippet = superChatEventSnippet;
        return this;
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData
    public SuperChatEvent set(String str, Object obj) {
        return (SuperChatEvent) super.set(str, obj);
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData, java.util.AbstractMap
    public SuperChatEvent clone() {
        return (SuperChatEvent) super.clone();
    }
}
