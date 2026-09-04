package com.google.api.services.youtube.model;

import com.google.api.client.json.GenericJson;
import com.google.api.client.util.Key;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class PromotedItem extends GenericJson {

    @Key
    private String customMessage;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @Key
    private PromotedItemId f21637id;

    @Key
    private Boolean promotedByContentOwner;

    @Key
    private InvideoTiming timing;

    public String getCustomMessage() {
        return this.customMessage;
    }

    public PromotedItemId getId() {
        return this.f21637id;
    }

    public Boolean getPromotedByContentOwner() {
        return this.promotedByContentOwner;
    }

    public InvideoTiming getTiming() {
        return this.timing;
    }

    public PromotedItem setCustomMessage(String str) {
        this.customMessage = str;
        return this;
    }

    public PromotedItem setId(PromotedItemId promotedItemId) {
        this.f21637id = promotedItemId;
        return this;
    }

    public PromotedItem setPromotedByContentOwner(Boolean bool) {
        this.promotedByContentOwner = bool;
        return this;
    }

    public PromotedItem setTiming(InvideoTiming invideoTiming) {
        this.timing = invideoTiming;
        return this;
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData
    public PromotedItem set(String str, Object obj) {
        return (PromotedItem) super.set(str, obj);
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData, java.util.AbstractMap
    public PromotedItem clone() {
        return (PromotedItem) super.clone();
    }
}
