package com.google.api.services.youtube.model;

import com.google.api.client.json.GenericJson;
import com.google.api.client.util.Key;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class Sponsor extends GenericJson {

    @Key
    private String etag;

    @Key
    private String kind;

    @Key
    private SponsorSnippet snippet;

    public String getEtag() {
        return this.etag;
    }

    public String getKind() {
        return this.kind;
    }

    public SponsorSnippet getSnippet() {
        return this.snippet;
    }

    public Sponsor setEtag(String str) {
        this.etag = str;
        return this;
    }

    public Sponsor setKind(String str) {
        this.kind = str;
        return this;
    }

    public Sponsor setSnippet(SponsorSnippet sponsorSnippet) {
        this.snippet = sponsorSnippet;
        return this;
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData
    public Sponsor set(String str, Object obj) {
        return (Sponsor) super.set(str, obj);
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData, java.util.AbstractMap
    public Sponsor clone() {
        return (Sponsor) super.clone();
    }
}
