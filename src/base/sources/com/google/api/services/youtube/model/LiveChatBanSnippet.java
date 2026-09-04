package com.google.api.services.youtube.model;

import com.google.api.client.json.GenericJson;
import com.google.api.client.json.JsonString;
import com.google.api.client.util.Key;
import java.math.BigInteger;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class LiveChatBanSnippet extends GenericJson {

    @JsonString
    @Key
    private BigInteger banDurationSeconds;

    @Key
    private ChannelProfileDetails bannedUserDetails;

    @Key
    private String liveChatId;

    @Key
    private String type;

    public BigInteger getBanDurationSeconds() {
        return this.banDurationSeconds;
    }

    public ChannelProfileDetails getBannedUserDetails() {
        return this.bannedUserDetails;
    }

    public String getLiveChatId() {
        return this.liveChatId;
    }

    public String getType() {
        return this.type;
    }

    public LiveChatBanSnippet setBanDurationSeconds(BigInteger bigInteger) {
        this.banDurationSeconds = bigInteger;
        return this;
    }

    public LiveChatBanSnippet setBannedUserDetails(ChannelProfileDetails channelProfileDetails) {
        this.bannedUserDetails = channelProfileDetails;
        return this;
    }

    public LiveChatBanSnippet setLiveChatId(String str) {
        this.liveChatId = str;
        return this;
    }

    public LiveChatBanSnippet setType(String str) {
        this.type = str;
        return this;
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData
    public LiveChatBanSnippet set(String str, Object obj) {
        return (LiveChatBanSnippet) super.set(str, obj);
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData, java.util.AbstractMap
    public LiveChatBanSnippet clone() {
        return (LiveChatBanSnippet) super.clone();
    }
}
