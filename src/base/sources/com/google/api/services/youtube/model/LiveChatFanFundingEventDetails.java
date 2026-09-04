package com.google.api.services.youtube.model;

import com.google.api.client.json.GenericJson;
import com.google.api.client.json.JsonString;
import com.google.api.client.util.Key;
import java.math.BigInteger;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class LiveChatFanFundingEventDetails extends GenericJson {

    @Key
    private String amountDisplayString;

    @JsonString
    @Key
    private BigInteger amountMicros;

    @Key
    private String currency;

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

    public String getUserComment() {
        return this.userComment;
    }

    public LiveChatFanFundingEventDetails setAmountDisplayString(String str) {
        this.amountDisplayString = str;
        return this;
    }

    public LiveChatFanFundingEventDetails setAmountMicros(BigInteger bigInteger) {
        this.amountMicros = bigInteger;
        return this;
    }

    public LiveChatFanFundingEventDetails setCurrency(String str) {
        this.currency = str;
        return this;
    }

    public LiveChatFanFundingEventDetails setUserComment(String str) {
        this.userComment = str;
        return this;
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData
    public LiveChatFanFundingEventDetails set(String str, Object obj) {
        return (LiveChatFanFundingEventDetails) super.set(str, obj);
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData, java.util.AbstractMap
    public LiveChatFanFundingEventDetails clone() {
        return (LiveChatFanFundingEventDetails) super.clone();
    }
}
