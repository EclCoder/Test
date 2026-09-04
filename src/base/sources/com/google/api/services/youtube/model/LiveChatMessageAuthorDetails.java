package com.google.api.services.youtube.model;

import com.google.api.client.json.GenericJson;
import com.google.api.client.util.Key;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class LiveChatMessageAuthorDetails extends GenericJson {

    @Key
    private String channelId;

    @Key
    private String channelUrl;

    @Key
    private String displayName;

    @Key
    private Boolean isChatModerator;

    @Key
    private Boolean isChatOwner;

    @Key
    private Boolean isChatSponsor;

    @Key
    private Boolean isVerified;

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

    public Boolean getIsChatModerator() {
        return this.isChatModerator;
    }

    public Boolean getIsChatOwner() {
        return this.isChatOwner;
    }

    public Boolean getIsChatSponsor() {
        return this.isChatSponsor;
    }

    public Boolean getIsVerified() {
        return this.isVerified;
    }

    public String getProfileImageUrl() {
        return this.profileImageUrl;
    }

    public LiveChatMessageAuthorDetails setChannelId(String str) {
        this.channelId = str;
        return this;
    }

    public LiveChatMessageAuthorDetails setChannelUrl(String str) {
        this.channelUrl = str;
        return this;
    }

    public LiveChatMessageAuthorDetails setDisplayName(String str) {
        this.displayName = str;
        return this;
    }

    public LiveChatMessageAuthorDetails setIsChatModerator(Boolean bool) {
        this.isChatModerator = bool;
        return this;
    }

    public LiveChatMessageAuthorDetails setIsChatOwner(Boolean bool) {
        this.isChatOwner = bool;
        return this;
    }

    public LiveChatMessageAuthorDetails setIsChatSponsor(Boolean bool) {
        this.isChatSponsor = bool;
        return this;
    }

    public LiveChatMessageAuthorDetails setIsVerified(Boolean bool) {
        this.isVerified = bool;
        return this;
    }

    public LiveChatMessageAuthorDetails setProfileImageUrl(String str) {
        this.profileImageUrl = str;
        return this;
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData
    public LiveChatMessageAuthorDetails set(String str, Object obj) {
        return (LiveChatMessageAuthorDetails) super.set(str, obj);
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData, java.util.AbstractMap
    public LiveChatMessageAuthorDetails clone() {
        return (LiveChatMessageAuthorDetails) super.clone();
    }
}
