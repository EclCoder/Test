package com.google.api.services.youtube.model;

import com.google.api.client.json.GenericJson;
import com.google.api.client.util.Key;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class Subscription extends GenericJson {

    @Key
    private SubscriptionContentDetails contentDetails;

    @Key
    private String etag;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @Key
    private String f21639id;

    @Key
    private String kind;

    @Key
    private SubscriptionSnippet snippet;

    @Key
    private SubscriptionSubscriberSnippet subscriberSnippet;

    public SubscriptionContentDetails getContentDetails() {
        return this.contentDetails;
    }

    public String getEtag() {
        return this.etag;
    }

    public String getId() {
        return this.f21639id;
    }

    public String getKind() {
        return this.kind;
    }

    public SubscriptionSnippet getSnippet() {
        return this.snippet;
    }

    public SubscriptionSubscriberSnippet getSubscriberSnippet() {
        return this.subscriberSnippet;
    }

    public Subscription setContentDetails(SubscriptionContentDetails subscriptionContentDetails) {
        this.contentDetails = subscriptionContentDetails;
        return this;
    }

    public Subscription setEtag(String str) {
        this.etag = str;
        return this;
    }

    public Subscription setId(String str) {
        this.f21639id = str;
        return this;
    }

    public Subscription setKind(String str) {
        this.kind = str;
        return this;
    }

    public Subscription setSnippet(SubscriptionSnippet subscriptionSnippet) {
        this.snippet = subscriptionSnippet;
        return this;
    }

    public Subscription setSubscriberSnippet(SubscriptionSubscriberSnippet subscriptionSubscriberSnippet) {
        this.subscriberSnippet = subscriptionSubscriberSnippet;
        return this;
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData
    public Subscription set(String str, Object obj) {
        return (Subscription) super.set(str, obj);
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData, java.util.AbstractMap
    public Subscription clone() {
        return (Subscription) super.clone();
    }
}
