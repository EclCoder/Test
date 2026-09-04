package com.google.api.services.youtube.model;

import com.google.api.client.json.GenericJson;
import com.google.api.client.json.JsonString;
import com.google.api.client.util.Key;
import java.math.BigInteger;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class VideoStatistics extends GenericJson {

    @JsonString
    @Key
    private BigInteger commentCount;

    @JsonString
    @Key
    private BigInteger dislikeCount;

    @JsonString
    @Key
    private BigInteger favoriteCount;

    @JsonString
    @Key
    private BigInteger likeCount;

    @JsonString
    @Key
    private BigInteger viewCount;

    public BigInteger getCommentCount() {
        return this.commentCount;
    }

    public BigInteger getDislikeCount() {
        return this.dislikeCount;
    }

    public BigInteger getFavoriteCount() {
        return this.favoriteCount;
    }

    public BigInteger getLikeCount() {
        return this.likeCount;
    }

    public BigInteger getViewCount() {
        return this.viewCount;
    }

    public VideoStatistics setCommentCount(BigInteger bigInteger) {
        this.commentCount = bigInteger;
        return this;
    }

    public VideoStatistics setDislikeCount(BigInteger bigInteger) {
        this.dislikeCount = bigInteger;
        return this;
    }

    public VideoStatistics setFavoriteCount(BigInteger bigInteger) {
        this.favoriteCount = bigInteger;
        return this;
    }

    public VideoStatistics setLikeCount(BigInteger bigInteger) {
        this.likeCount = bigInteger;
        return this;
    }

    public VideoStatistics setViewCount(BigInteger bigInteger) {
        this.viewCount = bigInteger;
        return this;
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData
    public VideoStatistics set(String str, Object obj) {
        return (VideoStatistics) super.set(str, obj);
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData, java.util.AbstractMap
    public VideoStatistics clone() {
        return (VideoStatistics) super.clone();
    }
}
