package com.google.api.services.youtube.model;

import com.google.api.client.json.GenericJson;
import com.google.api.client.util.Key;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class ActivityContentDetailsRecommendation extends GenericJson {

    @Key
    private String reason;

    @Key
    private ResourceId resourceId;

    @Key
    private ResourceId seedResourceId;

    public String getReason() {
        return this.reason;
    }

    public ResourceId getResourceId() {
        return this.resourceId;
    }

    public ResourceId getSeedResourceId() {
        return this.seedResourceId;
    }

    public ActivityContentDetailsRecommendation setReason(String str) {
        this.reason = str;
        return this;
    }

    public ActivityContentDetailsRecommendation setResourceId(ResourceId resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    public ActivityContentDetailsRecommendation setSeedResourceId(ResourceId resourceId) {
        this.seedResourceId = resourceId;
        return this;
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData
    public ActivityContentDetailsRecommendation set(String str, Object obj) {
        return (ActivityContentDetailsRecommendation) super.set(str, obj);
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData, java.util.AbstractMap
    public ActivityContentDetailsRecommendation clone() {
        return (ActivityContentDetailsRecommendation) super.clone();
    }
}
