package com.google.api.services.youtube.model;

import com.google.api.client.json.GenericJson;
import com.google.api.client.util.Key;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class VideoMonetizationDetails extends GenericJson {

    @Key
    private AccessPolicy access;

    public AccessPolicy getAccess() {
        return this.access;
    }

    public VideoMonetizationDetails setAccess(AccessPolicy accessPolicy) {
        this.access = accessPolicy;
        return this;
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData
    public VideoMonetizationDetails set(String str, Object obj) {
        return (VideoMonetizationDetails) super.set(str, obj);
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData, java.util.AbstractMap
    public VideoMonetizationDetails clone() {
        return (VideoMonetizationDetails) super.clone();
    }
}
