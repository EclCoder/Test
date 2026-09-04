package com.google.api.services.youtube.model;

import com.google.api.client.json.GenericJson;
import com.google.api.client.util.Key;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class VideoContentDetailsRegionRestriction extends GenericJson {

    @Key
    private List<String> allowed;

    @Key
    private List<String> blocked;

    public List<String> getAllowed() {
        return this.allowed;
    }

    public List<String> getBlocked() {
        return this.blocked;
    }

    public VideoContentDetailsRegionRestriction setAllowed(List<String> list) {
        this.allowed = list;
        return this;
    }

    public VideoContentDetailsRegionRestriction setBlocked(List<String> list) {
        this.blocked = list;
        return this;
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData
    public VideoContentDetailsRegionRestriction set(String str, Object obj) {
        return (VideoContentDetailsRegionRestriction) super.set(str, obj);
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData, java.util.AbstractMap
    public VideoContentDetailsRegionRestriction clone() {
        return (VideoContentDetailsRegionRestriction) super.clone();
    }
}
