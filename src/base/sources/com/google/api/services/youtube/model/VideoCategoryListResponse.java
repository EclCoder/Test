package com.google.api.services.youtube.model;

import com.google.api.client.json.GenericJson;
import com.google.api.client.util.Data;
import com.google.api.client.util.Key;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class VideoCategoryListResponse extends GenericJson {

    @Key
    private String etag;

    @Key
    private String eventId;

    @Key
    private List<VideoCategory> items;

    @Key
    private String kind;

    @Key
    private String nextPageToken;

    @Key
    private PageInfo pageInfo;

    @Key
    private String prevPageToken;

    @Key
    private TokenPagination tokenPagination;

    @Key
    private String visitorId;

    static {
        Data.nullOf(VideoCategory.class);
    }

    public String getEtag() {
        return this.etag;
    }

    public String getEventId() {
        return this.eventId;
    }

    public List<VideoCategory> getItems() {
        return this.items;
    }

    public String getKind() {
        return this.kind;
    }

    public String getNextPageToken() {
        return this.nextPageToken;
    }

    public PageInfo getPageInfo() {
        return this.pageInfo;
    }

    public String getPrevPageToken() {
        return this.prevPageToken;
    }

    public TokenPagination getTokenPagination() {
        return this.tokenPagination;
    }

    public String getVisitorId() {
        return this.visitorId;
    }

    public VideoCategoryListResponse setEtag(String str) {
        this.etag = str;
        return this;
    }

    public VideoCategoryListResponse setEventId(String str) {
        this.eventId = str;
        return this;
    }

    public VideoCategoryListResponse setItems(List<VideoCategory> list) {
        this.items = list;
        return this;
    }

    public VideoCategoryListResponse setKind(String str) {
        this.kind = str;
        return this;
    }

    public VideoCategoryListResponse setNextPageToken(String str) {
        this.nextPageToken = str;
        return this;
    }

    public VideoCategoryListResponse setPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }

    public VideoCategoryListResponse setPrevPageToken(String str) {
        this.prevPageToken = str;
        return this;
    }

    public VideoCategoryListResponse setTokenPagination(TokenPagination tokenPagination) {
        this.tokenPagination = tokenPagination;
        return this;
    }

    public VideoCategoryListResponse setVisitorId(String str) {
        this.visitorId = str;
        return this;
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData
    public VideoCategoryListResponse set(String str, Object obj) {
        return (VideoCategoryListResponse) super.set(str, obj);
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData, java.util.AbstractMap
    public VideoCategoryListResponse clone() {
        return (VideoCategoryListResponse) super.clone();
    }
}
