package com.google.api.services.youtube.model;

import com.google.api.client.json.GenericJson;
import com.google.api.client.util.Key;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class LiveChatMessageSnippet extends GenericJson {

    @Key
    private String authorChannelId;

    @Key
    private String displayMessage;

    @Key
    private LiveChatFanFundingEventDetails fanFundingEventDetails;

    @Key
    private Boolean hasDisplayContent;

    @Key
    private String liveChatId;

    @Key
    private LiveChatMessageDeletedDetails messageDeletedDetails;

    @Key
    private LiveChatMessageRetractedDetails messageRetractedDetails;

    @Key
    private String publishedAt;

    @Key
    private LiveChatSuperChatDetails superChatDetails;

    @Key
    private LiveChatSuperStickerDetails superStickerDetails;

    @Key
    private LiveChatTextMessageDetails textMessageDetails;

    @Key
    private String type;

    @Key
    private LiveChatUserBannedMessageDetails userBannedDetails;

    public String getAuthorChannelId() {
        return this.authorChannelId;
    }

    public String getDisplayMessage() {
        return this.displayMessage;
    }

    public LiveChatFanFundingEventDetails getFanFundingEventDetails() {
        return this.fanFundingEventDetails;
    }

    public Boolean getHasDisplayContent() {
        return this.hasDisplayContent;
    }

    public String getLiveChatId() {
        return this.liveChatId;
    }

    public LiveChatMessageDeletedDetails getMessageDeletedDetails() {
        return this.messageDeletedDetails;
    }

    public LiveChatMessageRetractedDetails getMessageRetractedDetails() {
        return this.messageRetractedDetails;
    }

    public String getPublishedAt() {
        return this.publishedAt;
    }

    public LiveChatSuperChatDetails getSuperChatDetails() {
        return this.superChatDetails;
    }

    public LiveChatSuperStickerDetails getSuperStickerDetails() {
        return this.superStickerDetails;
    }

    public LiveChatTextMessageDetails getTextMessageDetails() {
        return this.textMessageDetails;
    }

    public String getType() {
        return this.type;
    }

    public LiveChatUserBannedMessageDetails getUserBannedDetails() {
        return this.userBannedDetails;
    }

    public LiveChatMessageSnippet setAuthorChannelId(String str) {
        this.authorChannelId = str;
        return this;
    }

    public LiveChatMessageSnippet setDisplayMessage(String str) {
        this.displayMessage = str;
        return this;
    }

    public LiveChatMessageSnippet setFanFundingEventDetails(LiveChatFanFundingEventDetails liveChatFanFundingEventDetails) {
        this.fanFundingEventDetails = liveChatFanFundingEventDetails;
        return this;
    }

    public LiveChatMessageSnippet setHasDisplayContent(Boolean bool) {
        this.hasDisplayContent = bool;
        return this;
    }

    public LiveChatMessageSnippet setLiveChatId(String str) {
        this.liveChatId = str;
        return this;
    }

    public LiveChatMessageSnippet setMessageDeletedDetails(LiveChatMessageDeletedDetails liveChatMessageDeletedDetails) {
        this.messageDeletedDetails = liveChatMessageDeletedDetails;
        return this;
    }

    public LiveChatMessageSnippet setMessageRetractedDetails(LiveChatMessageRetractedDetails liveChatMessageRetractedDetails) {
        this.messageRetractedDetails = liveChatMessageRetractedDetails;
        return this;
    }

    public LiveChatMessageSnippet setPublishedAt(String str) {
        this.publishedAt = str;
        return this;
    }

    public LiveChatMessageSnippet setSuperChatDetails(LiveChatSuperChatDetails liveChatSuperChatDetails) {
        this.superChatDetails = liveChatSuperChatDetails;
        return this;
    }

    public LiveChatMessageSnippet setSuperStickerDetails(LiveChatSuperStickerDetails liveChatSuperStickerDetails) {
        this.superStickerDetails = liveChatSuperStickerDetails;
        return this;
    }

    public LiveChatMessageSnippet setTextMessageDetails(LiveChatTextMessageDetails liveChatTextMessageDetails) {
        this.textMessageDetails = liveChatTextMessageDetails;
        return this;
    }

    public LiveChatMessageSnippet setType(String str) {
        this.type = str;
        return this;
    }

    public LiveChatMessageSnippet setUserBannedDetails(LiveChatUserBannedMessageDetails liveChatUserBannedMessageDetails) {
        this.userBannedDetails = liveChatUserBannedMessageDetails;
        return this;
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData
    public LiveChatMessageSnippet set(String str, Object obj) {
        return (LiveChatMessageSnippet) super.set(str, obj);
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData, java.util.AbstractMap
    public LiveChatMessageSnippet clone() {
        return (LiveChatMessageSnippet) super.clone();
    }
}
