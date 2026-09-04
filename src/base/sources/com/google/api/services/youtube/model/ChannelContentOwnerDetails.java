package com.google.api.services.youtube.model;

import com.google.api.client.json.GenericJson;
import com.google.api.client.util.Key;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class ChannelContentOwnerDetails extends GenericJson {

    @Key
    private String contentOwner;

    @Key
    private String timeLinked;

    public String getContentOwner() {
        return this.contentOwner;
    }

    public String getTimeLinked() {
        return this.timeLinked;
    }

    public ChannelContentOwnerDetails setContentOwner(String str) {
        this.contentOwner = str;
        return this;
    }

    public ChannelContentOwnerDetails setTimeLinked(String str) {
        this.timeLinked = str;
        return this;
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData
    public ChannelContentOwnerDetails set(String str, Object obj) {
        return (ChannelContentOwnerDetails) super.set(str, obj);
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData, java.util.AbstractMap
    public ChannelContentOwnerDetails clone() {
        return (ChannelContentOwnerDetails) super.clone();
    }
}
