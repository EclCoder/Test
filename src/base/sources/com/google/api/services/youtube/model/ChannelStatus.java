package com.google.api.services.youtube.model;

import com.google.api.client.json.GenericJson;
import com.google.api.client.util.Key;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class ChannelStatus extends GenericJson {

    @Key
    private Boolean isLinked;

    @Key
    private String longUploadsStatus;

    @Key
    private Boolean madeForKids;

    @Key
    private String privacyStatus;

    @Key
    private Boolean selfDeclaredMadeForKids;

    public Boolean getIsLinked() {
        return this.isLinked;
    }

    public String getLongUploadsStatus() {
        return this.longUploadsStatus;
    }

    public Boolean getMadeForKids() {
        return this.madeForKids;
    }

    public String getPrivacyStatus() {
        return this.privacyStatus;
    }

    public Boolean getSelfDeclaredMadeForKids() {
        return this.selfDeclaredMadeForKids;
    }

    public ChannelStatus setIsLinked(Boolean bool) {
        this.isLinked = bool;
        return this;
    }

    public ChannelStatus setLongUploadsStatus(String str) {
        this.longUploadsStatus = str;
        return this;
    }

    public ChannelStatus setMadeForKids(Boolean bool) {
        this.madeForKids = bool;
        return this;
    }

    public ChannelStatus setPrivacyStatus(String str) {
        this.privacyStatus = str;
        return this;
    }

    public ChannelStatus setSelfDeclaredMadeForKids(Boolean bool) {
        this.selfDeclaredMadeForKids = bool;
        return this;
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData
    public ChannelStatus set(String str, Object obj) {
        return (ChannelStatus) super.set(str, obj);
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData, java.util.AbstractMap
    public ChannelStatus clone() {
        return (ChannelStatus) super.clone();
    }
}
