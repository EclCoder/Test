package com.google.api.services.youtube.model;

import com.google.api.client.json.GenericJson;
import com.google.api.client.json.JsonString;
import com.google.api.client.util.Key;
import java.math.BigInteger;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class LiveChatUserBannedMessageDetails extends GenericJson {

    @JsonString
    @Key
    private BigInteger banDurationSeconds;

    @Key
    private String banType;

    @Key
    private ChannelProfileDetails bannedUserDetails;

    public BigInteger getBanDurationSeconds() {
        return this.banDurationSeconds;
    }

    public String getBanType() {
        return this.banType;
    }

    public ChannelProfileDetails getBannedUserDetails() {
        return this.bannedUserDetails;
    }

    public LiveChatUserBannedMessageDetails setBanDurationSeconds(BigInteger bigInteger) {
        this.banDurationSeconds = bigInteger;
        return this;
    }

    public LiveChatUserBannedMessageDetails setBanType(String str) {
        this.banType = str;
        return this;
    }

    public LiveChatUserBannedMessageDetails setBannedUserDetails(ChannelProfileDetails channelProfileDetails) {
        this.bannedUserDetails = channelProfileDetails;
        return this;
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData
    public LiveChatUserBannedMessageDetails set(String str, Object obj) {
        return (LiveChatUserBannedMessageDetails) super.set(str, obj);
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData, java.util.AbstractMap
    public LiveChatUserBannedMessageDetails clone() {
        return (LiveChatUserBannedMessageDetails) super.clone();
    }
}
