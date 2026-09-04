package com.google.api.services.youtube.model;

import com.google.api.client.json.GenericJson;
import com.google.api.client.util.Key;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class InvideoPosition extends GenericJson {

    @Key
    private String cornerPosition;

    @Key
    private String type;

    public String getCornerPosition() {
        return this.cornerPosition;
    }

    public String getType() {
        return this.type;
    }

    public InvideoPosition setCornerPosition(String str) {
        this.cornerPosition = str;
        return this;
    }

    public InvideoPosition setType(String str) {
        this.type = str;
        return this;
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData
    public InvideoPosition set(String str, Object obj) {
        return (InvideoPosition) super.set(str, obj);
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData, java.util.AbstractMap
    public InvideoPosition clone() {
        return (InvideoPosition) super.clone();
    }
}
