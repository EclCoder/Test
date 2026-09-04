package com.google.api.services.youtube.model;

import com.google.api.client.json.GenericJson;
import com.google.api.client.util.Key;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class ChannelProfileDetails extends GenericJson {

    @Key
    private String channelId;

    @Key
    private String channelUrl;

    @Key
    private String displayName;

    @Key
    private String profileImageUrl;

    public String getChannelId() {
        return this.channelId;
    }

    public String getChannelUrl() {
        return this.channelUrl;
    }

    public String getDisplayName() {
        return this.displayName;
    }

    public String getProfileImageUrl() {
        return this.profileImageUrl;
    }

    public ChannelProfileDetails setChannelId(String str) {
        this.channelId = str;
        return this;
    }

    public ChannelProfileDetails setChannelUrl(String str) {
        this.channelUrl = str;
        return this;
    }

    public ChannelProfileDetails setDisplayName(String str) {
        this.displayName = str;
        return this;
    }

    public ChannelProfileDetails setProfileImageUrl(String str) {
        this.profileImageUrl = str;
        return this;
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData
    public ChannelProfileDetails set(String str, Object obj) {
        return (ChannelProfileDetails) super.set(str, obj);
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData, java.util.AbstractMap
    public ChannelProfileDetails clone() {
        return (ChannelProfileDetails) super.clone();
    }
}
