package com.google.api.services.youtube.model;

import com.google.api.client.json.GenericJson;
import com.google.api.client.util.Key;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class SubscriptionContentDetails extends GenericJson {

    @Key
    private String activityType;

    @Key
    private Long newItemCount;

    @Key
    private Long totalItemCount;

    public String getActivityType() {
        return this.activityType;
    }

    public Long getNewItemCount() {
        return this.newItemCount;
    }

    public Long getTotalItemCount() {
        return this.totalItemCount;
    }

    public SubscriptionContentDetails setActivityType(String str) {
        this.activityType = str;
        return this;
    }

    public SubscriptionContentDetails setNewItemCount(Long l10) {
        this.newItemCount = l10;
        return this;
    }

    public SubscriptionContentDetails setTotalItemCount(Long l10) {
        this.totalItemCount = l10;
        return this;
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData
    public SubscriptionContentDetails set(String str, Object obj) {
        return (SubscriptionContentDetails) super.set(str, obj);
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData, java.util.AbstractMap
    public SubscriptionContentDetails clone() {
        return (SubscriptionContentDetails) super.clone();
    }
}
