package com.google.api.services.youtube.model;

import com.google.api.client.json.GenericJson;
import com.google.api.client.util.Key;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class SearchResult extends GenericJson {

    @Key
    private String etag;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @Key
    private ResourceId f21638id;

    @Key
    private String kind;

    @Key
    private SearchResultSnippet snippet;

    public String getEtag() {
        return this.etag;
    }

    public ResourceId getId() {
        return this.f21638id;
    }

    public String getKind() {
        return this.kind;
    }

    public SearchResultSnippet getSnippet() {
        return this.snippet;
    }

    public SearchResult setEtag(String str) {
        this.etag = str;
        return this;
    }

    public SearchResult setId(ResourceId resourceId) {
        this.f21638id = resourceId;
        return this;
    }

    public SearchResult setKind(String str) {
        this.kind = str;
        return this;
    }

    public SearchResult setSnippet(SearchResultSnippet searchResultSnippet) {
        this.snippet = searchResultSnippet;
        return this;
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData
    public SearchResult set(String str, Object obj) {
        return (SearchResult) super.set(str, obj);
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData, java.util.AbstractMap
    public SearchResult clone() {
        return (SearchResult) super.clone();
    }
}
