package com.google.api.services.youtube.model;

import com.google.api.client.json.GenericJson;
import com.google.api.client.json.JsonString;
import com.google.api.client.util.Key;
import java.math.BigInteger;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class LiveChatSuperChatDetails extends GenericJson {

    @Key
    private String amountDisplayString;

    @JsonString
    @Key
    private BigInteger amountMicros;

    @Key
    private String currency;

    @Key
    private Long tier;

    @Key
    private String userComment;

    public String getAmountDisplayString() {
        return this.amountDisplayString;
    }

    public BigInteger getAmountMicros() {
        return this.amountMicros;
    }

    public String getCurrency() {
        return this.currency;
    }

    public Long getTier() {
        return this.tier;
    }

    public String getUserComment() {
        return this.userComment;
    }

    public LiveChatSuperChatDetails setAmountDisplayString(String str) {
        this.amountDisplayString = str;
        return this;
    }

    public LiveChatSuperChatDetails setAmountMicros(BigInteger bigInteger) {
        this.amountMicros = bigInteger;
        return this;
    }

    public LiveChatSuperChatDetails setCurrency(String str) {
        this.currency = str;
        return this;
    }

    public LiveChatSuperChatDetails setTier(Long l10) {
        this.tier = l10;
        return this;
    }

    public LiveChatSuperChatDetails setUserComment(String str) {
        this.userComment = str;
        return this;
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData
    public LiveChatSuperChatDetails set(String str, Object obj) {
        return (LiveChatSuperChatDetails) super.set(str, obj);
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData, java.util.AbstractMap
    public LiveChatSuperChatDetails clone() {
        return (LiveChatSuperChatDetails) super.clone();
    }
}
