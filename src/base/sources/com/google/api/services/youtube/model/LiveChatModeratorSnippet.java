package com.google.api.services.youtube.model;

import com.google.api.client.json.GenericJson;
import com.google.api.client.util.Key;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class LiveChatModeratorSnippet extends GenericJson {

    @Key
    private String liveChatId;

    @Key
    private ChannelProfileDetails moderatorDetails;

    public String getLiveChatId() {
        return this.liveChatId;
    }

    public ChannelProfileDetails getModeratorDetails() {
        return this.moderatorDetails;
    }

    public LiveChatModeratorSnippet setLiveChatId(String str) {
        this.liveChatId = str;
        return this;
    }

    public LiveChatModeratorSnippet setModeratorDetails(ChannelProfileDetails channelProfileDetails) {
        this.moderatorDetails = channelProfileDetails;
        return this;
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData
    public LiveChatModeratorSnippet set(String str, Object obj) {
        return (LiveChatModeratorSnippet) super.set(str, obj);
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData, java.util.AbstractMap
    public LiveChatModeratorSnippet clone() {
        return (LiveChatModeratorSnippet) super.clone();
    }
}
