package com.google.api.services.youtube.model;

import com.google.api.client.json.GenericJson;
import com.google.api.client.util.Data;
import com.google.api.client.util.Key;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class LiveChatMessageListResponse extends GenericJson {

    @Key
    private String etag;

    @Key
    private String eventId;

    @Key
    private List<LiveChatMessage> items;

    @Key
    private String kind;

    @Key
    private String nextPageToken;

    @Key
    private String offlineAt;

    @Key
    private PageInfo pageInfo;

    @Key
    private Long pollingIntervalMillis;

    @Key
    private TokenPagination tokenPagination;

    @Key
    private String visitorId;

    static {
        Data.nullOf(LiveChatMessage.class);
    }

    public String getEtag() {
        return this.etag;
    }

    public String getEventId() {
        return this.eventId;
    }

    public List<LiveChatMessage> getItems() {
        return this.items;
    }

    public String getKind() {
        return this.kind;
    }

    public String getNextPageToken() {
        return this.nextPageToken;
    }

    public String getOfflineAt() {
        return this.offlineAt;
    }

    public PageInfo getPageInfo() {
        return this.pageInfo;
    }

    public Long getPollingIntervalMillis() {
        return this.pollingIntervalMillis;
    }

    public TokenPagination getTokenPagination() {
        return this.tokenPagination;
    }

    public String getVisitorId() {
        return this.visitorId;
    }

    public LiveChatMessageListResponse setEtag(String str) {
        this.etag = str;
        return this;
    }

    public LiveChatMessageListResponse setEventId(String str) {
        this.eventId = str;
        return this;
    }

    public LiveChatMessageListResponse setItems(List<LiveChatMessage> list) {
        this.items = list;
        return this;
    }

    public LiveChatMessageListResponse setKind(String str) {
        this.kind = str;
        return this;
    }

    public LiveChatMessageListResponse setNextPageToken(String str) {
        this.nextPageToken = str;
        return this;
    }

    public LiveChatMessageListResponse setOfflineAt(String str) {
        this.offlineAt = str;
        return this;
    }

    public LiveChatMessageListResponse setPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }

    public LiveChatMessageListResponse setPollingIntervalMillis(Long l10) {
        this.pollingIntervalMillis = l10;
        return this;
    }

    public LiveChatMessageListResponse setTokenPagination(TokenPagination tokenPagination) {
        this.tokenPagination = tokenPagination;
        return this;
    }

    public LiveChatMessageListResponse setVisitorId(String str) {
        this.visitorId = str;
        return this;
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData
    public LiveChatMessageListResponse set(String str, Object obj) {
        return (LiveChatMessageListResponse) super.set(str, obj);
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData, java.util.AbstractMap
    public LiveChatMessageListResponse clone() {
        return (LiveChatMessageListResponse) super.clone();
    }
}
