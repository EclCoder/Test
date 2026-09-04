package com.google.api.services.youtube.model;

import com.google.api.client.json.GenericJson;
import com.google.api.client.util.Key;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class InvideoPromotion extends GenericJson {

    @Key
    private InvideoTiming defaultTiming;

    @Key
    private List<PromotedItem> items;

    @Key
    private InvideoPosition position;

    @Key
    private Boolean useSmartTiming;

    public InvideoTiming getDefaultTiming() {
        return this.defaultTiming;
    }

    public List<PromotedItem> getItems() {
        return this.items;
    }

    public InvideoPosition getPosition() {
        return this.position;
    }

    public Boolean getUseSmartTiming() {
        return this.useSmartTiming;
    }

    public InvideoPromotion setDefaultTiming(InvideoTiming invideoTiming) {
        this.defaultTiming = invideoTiming;
        return this;
    }

    public InvideoPromotion setItems(List<PromotedItem> list) {
        this.items = list;
        return this;
    }

    public InvideoPromotion setPosition(InvideoPosition invideoPosition) {
        this.position = invideoPosition;
        return this;
    }

    public InvideoPromotion setUseSmartTiming(Boolean bool) {
        this.useSmartTiming = bool;
        return this;
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData
    public InvideoPromotion set(String str, Object obj) {
        return (InvideoPromotion) super.set(str, obj);
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData, java.util.AbstractMap
    public InvideoPromotion clone() {
        return (InvideoPromotion) super.clone();
    }
}
