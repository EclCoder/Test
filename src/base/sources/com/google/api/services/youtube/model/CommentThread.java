package com.google.api.services.youtube.model;

import com.google.api.client.json.GenericJson;
import com.google.api.client.util.Key;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class CommentThread extends GenericJson {

    @Key
    private String etag;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @Key
    private String f21621id;

    @Key
    private String kind;

    @Key
    private CommentThreadReplies replies;

    @Key
    private CommentThreadSnippet snippet;

    public String getEtag() {
        return this.etag;
    }

    public String getId() {
        return this.f21621id;
    }

    public String getKind() {
        return this.kind;
    }

    public CommentThreadReplies getReplies() {
        return this.replies;
    }

    public CommentThreadSnippet getSnippet() {
        return this.snippet;
    }

    public CommentThread setEtag(String str) {
        this.etag = str;
        return this;
    }

    public CommentThread setId(String str) {
        this.f21621id = str;
        return this;
    }

    public CommentThread setKind(String str) {
        this.kind = str;
        return this;
    }

    public CommentThread setReplies(CommentThreadReplies commentThreadReplies) {
        this.replies = commentThreadReplies;
        return this;
    }

    public CommentThread setSnippet(CommentThreadSnippet commentThreadSnippet) {
        this.snippet = commentThreadSnippet;
        return this;
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData
    public CommentThread set(String str, Object obj) {
        return (CommentThread) super.set(str, obj);
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData, java.util.AbstractMap
    public CommentThread clone() {
        return (CommentThread) super.clone();
    }
}
