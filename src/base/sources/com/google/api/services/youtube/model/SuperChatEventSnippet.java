package com.google.api.services.youtube.model;

import com.google.api.client.json.GenericJson;
import com.google.api.client.json.JsonString;
import com.google.api.client.util.Key;
import java.math.BigInteger;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class SuperChatEventSnippet extends GenericJson {

    @JsonString
    @Key
    private BigInteger amountMicros;

    @Key
    private String channelId;

    @Key
    private String commentText;

    @Key
    private String createdAt;

    @Key
    private String currency;

    @Key
    private String displayString;

    @Key
    private Boolean isSuperStickerEvent;

    @Key
    private Long messageType;

    @Key
    private SuperStickerMetadata superStickerMetadata;

    @Key
    private ChannelProfileDetails supporterDetails;

    public BigInteger getAmountMicros() {
        return this.amountMicros;
    }

    public String getChannelId() {
        return this.channelId;
    }

    public String getCommentText() {
        return this.commentText;
    }

    public String getCreatedAt() {
        return this.createdAt;
    }

    public String getCurrency() {
        return this.currency;
    }

    public String getDisplayString() {
        return this.displayString;
    }

    public Boolean getIsSuperStickerEvent() {
        return this.isSuperStickerEvent;
    }

    public Long getMessageType() {
        return this.messageType;
    }

    public SuperStickerMetadata getSuperStickerMetadata() {
        return this.superStickerMetadata;
    }

    public ChannelProfileDetails getSupporterDetails() {
        return this.supporterDetails;
    }

    public SuperChatEventSnippet setAmountMicros(BigInteger bigInteger) {
        this.amountMicros = bigInteger;
        return this;
    }

    public SuperChatEventSnippet setChannelId(String str) {
        this.channelId = str;
        return this;
    }

    public SuperChatEventSnippet setCommentText(String str) {
        this.commentText = str;
        return this;
    }

    public SuperChatEventSnippet setCreatedAt(String str) {
        this.createdAt = str;
        return this;
    }

    public SuperChatEventSnippet setCurrency(String str) {
        this.currency = str;
        return this;
    }

    public SuperChatEventSnippet setDisplayString(String str) {
        this.displayString = str;
        return this;
    }

    public SuperChatEventSnippet setIsSuperStickerEvent(Boolean bool) {
        this.isSuperStickerEvent = bool;
        return this;
    }

    public SuperChatEventSnippet setMessageType(Long l10) {
        this.messageType = l10;
        return this;
    }

    public SuperChatEventSnippet setSuperStickerMetadata(SuperStickerMetadata superStickerMetadata) {
        this.superStickerMetadata = superStickerMetadata;
        return this;
    }

    public SuperChatEventSnippet setSupporterDetails(ChannelProfileDetails channelProfileDetails) {
        this.supporterDetails = channelProfileDetails;
        return this;
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData
    public SuperChatEventSnippet set(String str, Object obj) {
        return (SuperChatEventSnippet) super.set(str, obj);
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData, java.util.AbstractMap
    public SuperChatEventSnippet clone() {
        return (SuperChatEventSnippet) super.clone();
    }
}
