package com.google.api.services.youtube.model;

import com.google.api.client.json.GenericJson;
import com.google.api.client.util.Key;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class ActivityContentDetails extends GenericJson {

    @Key
    private ActivityContentDetailsBulletin bulletin;

    @Key
    private ActivityContentDetailsChannelItem channelItem;

    @Key
    private ActivityContentDetailsComment comment;

    @Key
    private ActivityContentDetailsFavorite favorite;

    @Key
    private ActivityContentDetailsLike like;

    @Key
    private ActivityContentDetailsPlaylistItem playlistItem;

    @Key
    private ActivityContentDetailsPromotedItem promotedItem;

    @Key
    private ActivityContentDetailsRecommendation recommendation;

    @Key
    private ActivityContentDetailsSocial social;

    @Key
    private ActivityContentDetailsSubscription subscription;

    @Key
    private ActivityContentDetailsUpload upload;

    public ActivityContentDetailsBulletin getBulletin() {
        return this.bulletin;
    }

    public ActivityContentDetailsChannelItem getChannelItem() {
        return this.channelItem;
    }

    public ActivityContentDetailsComment getComment() {
        return this.comment;
    }

    public ActivityContentDetailsFavorite getFavorite() {
        return this.favorite;
    }

    public ActivityContentDetailsLike getLike() {
        return this.like;
    }

    public ActivityContentDetailsPlaylistItem getPlaylistItem() {
        return this.playlistItem;
    }

    public ActivityContentDetailsPromotedItem getPromotedItem() {
        return this.promotedItem;
    }

    public ActivityContentDetailsRecommendation getRecommendation() {
        return this.recommendation;
    }

    public ActivityContentDetailsSocial getSocial() {
        return this.social;
    }

    public ActivityContentDetailsSubscription getSubscription() {
        return this.subscription;
    }

    public ActivityContentDetailsUpload getUpload() {
        return this.upload;
    }

    public ActivityContentDetails setBulletin(ActivityContentDetailsBulletin activityContentDetailsBulletin) {
        this.bulletin = activityContentDetailsBulletin;
        return this;
    }

    public ActivityContentDetails setChannelItem(ActivityContentDetailsChannelItem activityContentDetailsChannelItem) {
        this.channelItem = activityContentDetailsChannelItem;
        return this;
    }

    public ActivityContentDetails setComment(ActivityContentDetailsComment activityContentDetailsComment) {
        this.comment = activityContentDetailsComment;
        return this;
    }

    public ActivityContentDetails setFavorite(ActivityContentDetailsFavorite activityContentDetailsFavorite) {
        this.favorite = activityContentDetailsFavorite;
        return this;
    }

    public ActivityContentDetails setLike(ActivityContentDetailsLike activityContentDetailsLike) {
        this.like = activityContentDetailsLike;
        return this;
    }

    public ActivityContentDetails setPlaylistItem(ActivityContentDetailsPlaylistItem activityContentDetailsPlaylistItem) {
        this.playlistItem = activityContentDetailsPlaylistItem;
        return this;
    }

    public ActivityContentDetails setPromotedItem(ActivityContentDetailsPromotedItem activityContentDetailsPromotedItem) {
        this.promotedItem = activityContentDetailsPromotedItem;
        return this;
    }

    public ActivityContentDetails setRecommendation(ActivityContentDetailsRecommendation activityContentDetailsRecommendation) {
        this.recommendation = activityContentDetailsRecommendation;
        return this;
    }

    public ActivityContentDetails setSocial(ActivityContentDetailsSocial activityContentDetailsSocial) {
        this.social = activityContentDetailsSocial;
        return this;
    }

    public ActivityContentDetails setSubscription(ActivityContentDetailsSubscription activityContentDetailsSubscription) {
        this.subscription = activityContentDetailsSubscription;
        return this;
    }

    public ActivityContentDetails setUpload(ActivityContentDetailsUpload activityContentDetailsUpload) {
        this.upload = activityContentDetailsUpload;
        return this;
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData
    public ActivityContentDetails set(String str, Object obj) {
        return (ActivityContentDetails) super.set(str, obj);
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData, java.util.AbstractMap
    public ActivityContentDetails clone() {
        return (ActivityContentDetails) super.clone();
    }
}
