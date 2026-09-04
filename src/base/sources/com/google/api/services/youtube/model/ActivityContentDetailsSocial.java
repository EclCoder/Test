package com.google.api.services.youtube.model;

import com.google.api.client.json.GenericJson;
import com.google.api.client.util.Key;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class ActivityContentDetailsSocial extends GenericJson {

    @Key
    private String author;

    @Key
    private String imageUrl;

    @Key
    private String referenceUrl;

    @Key
    private ResourceId resourceId;

    @Key
    private String type;

    public String getAuthor() {
        return this.author;
    }

    public String getImageUrl() {
        return this.imageUrl;
    }

    public String getReferenceUrl() {
        return this.referenceUrl;
    }

    public ResourceId getResourceId() {
        return this.resourceId;
    }

    public String getType() {
        return this.type;
    }

    public ActivityContentDetailsSocial setAuthor(String str) {
        this.author = str;
        return this;
    }

    public ActivityContentDetailsSocial setImageUrl(String str) {
        this.imageUrl = str;
        return this;
    }

    public ActivityContentDetailsSocial setReferenceUrl(String str) {
        this.referenceUrl = str;
        return this;
    }

    public ActivityContentDetailsSocial setResourceId(ResourceId resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    public ActivityContentDetailsSocial setType(String str) {
        this.type = str;
        return this;
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData
    public ActivityContentDetailsSocial set(String str, Object obj) {
        return (ActivityContentDetailsSocial) super.set(str, obj);
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData, java.util.AbstractMap
    public ActivityContentDetailsSocial clone() {
        return (ActivityContentDetailsSocial) super.clone();
    }
}
