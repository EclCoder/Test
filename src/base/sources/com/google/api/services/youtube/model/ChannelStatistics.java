package com.google.api.services.youtube.model;

import com.google.api.client.json.GenericJson;
import com.google.api.client.json.JsonString;
import com.google.api.client.util.Key;
import java.math.BigInteger;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class ChannelStatistics extends GenericJson {

    @JsonString
    @Key
    private BigInteger commentCount;

    @Key
    private Boolean hiddenSubscriberCount;

    @JsonString
    @Key
    private BigInteger subscriberCount;

    @JsonString
    @Key
    private BigInteger videoCount;

    @JsonString
    @Key
    private BigInteger viewCount;

    public BigInteger getCommentCount() {
        return this.commentCount;
    }

    public Boolean getHiddenSubscriberCount() {
        return this.hiddenSubscriberCount;
    }

    public BigInteger getSubscriberCount() {
        return this.subscriberCount;
    }

    public BigInteger getVideoCount() {
        return this.videoCount;
    }

    public BigInteger getViewCount() {
        return this.viewCount;
    }

    public ChannelStatistics setCommentCount(BigInteger bigInteger) {
        this.commentCount = bigInteger;
        return this;
    }

    public ChannelStatistics setHiddenSubscriberCount(Boolean bool) {
        this.hiddenSubscriberCount = bool;
        return this;
    }

    public ChannelStatistics setSubscriberCount(BigInteger bigInteger) {
        this.subscriberCount = bigInteger;
        return this;
    }

    public ChannelStatistics setVideoCount(BigInteger bigInteger) {
        this.videoCount = bigInteger;
        return this;
    }

    public ChannelStatistics setViewCount(BigInteger bigInteger) {
        this.viewCount = bigInteger;
        return this;
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData
    public ChannelStatistics set(String str, Object obj) {
        return (ChannelStatistics) super.set(str, obj);
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData, java.util.AbstractMap
    public ChannelStatistics clone() {
        return (ChannelStatistics) super.clone();
    }
}
