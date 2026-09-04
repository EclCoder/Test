package com.google.api.services.youtube.model;

import com.google.api.client.json.GenericJson;
import com.google.api.client.util.Key;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class Member extends GenericJson {

    @Key
    private String etag;

    @Key
    private String kind;

    @Key
    private MemberSnippet snippet;

    public String getEtag() {
        return this.etag;
    }

    public String getKind() {
        return this.kind;
    }

    public MemberSnippet getSnippet() {
        return this.snippet;
    }

    public Member setEtag(String str) {
        this.etag = str;
        return this;
    }

    public Member setKind(String str) {
        this.kind = str;
        return this;
    }

    public Member setSnippet(MemberSnippet memberSnippet) {
        this.snippet = memberSnippet;
        return this;
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData
    public Member set(String str, Object obj) {
        return (Member) super.set(str, obj);
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData, java.util.AbstractMap
    public Member clone() {
        return (Member) super.clone();
    }
}
