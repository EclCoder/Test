package com.google.api.services.youtube.model;

import com.google.api.client.json.GenericJson;
import com.google.api.client.util.Key;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class ActivityContentDetailsChannelItem extends GenericJson {

    @Key
    private ResourceId resourceId;

    public ResourceId getResourceId() {
        return this.resourceId;
    }

    public ActivityContentDetailsChannelItem setResourceId(ResourceId resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData
    public ActivityContentDetailsChannelItem set(String str, Object obj) {
        return (ActivityContentDetailsChannelItem) super.set(str, obj);
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData, java.util.AbstractMap
    public ActivityContentDetailsChannelItem clone() {
        return (ActivityContentDetailsChannelItem) super.clone();
    }
}
