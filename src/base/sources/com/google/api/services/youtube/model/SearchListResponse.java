package com.google.api.services.youtube.model;

import com.google.api.client.json.GenericJson;
import com.google.api.client.util.Key;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class SearchListResponse extends GenericJson {

    @Key
    private String etag;

    @Key
    private String eventId;

    @Key
    private List<SearchResult> items;

    @Key
    private String kind;

    @Key
    private String nextPageToken;

    @Key
    private PageInfo pageInfo;

    @Key
    private String prevPageToken;

    @Key
    private String regionCode;

    @Key
    private TokenPagination tokenPagination;

    @Key
    private String visitorId;

    public String getEtag() {
        return this.etag;
    }

    public String getEventId() {
        return this.eventId;
    }

    public List<SearchResult> getItems() {
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

    public String getRegionCode() {
        return this.regionCode;
    }

    public TokenPagination getTokenPagination() {
        return this.tokenPagination;
    }

    public String getVisitorId() {
        return this.visitorId;
    }

    public SearchListResponse setEtag(String str) {
        this.etag = str;
        return this;
    }

    public SearchListResponse setEventId(String str) {
        this.eventId = str;
        return this;
    }

    public SearchListResponse setItems(List<SearchResult> list) {
        this.items = list;
        return this;
    }

    public SearchListResponse setKind(String str) {
        this.kind = str;
        return this;
    }

    public SearchListResponse setNextPageToken(String str) {
        this.nextPageToken = str;
        return this;
    }

    public SearchListResponse setPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }

    public SearchListResponse setPrevPageToken(String str) {
        this.prevPageToken = str;
        return this;
    }

    public SearchListResponse setRegionCode(String str) {
        this.regionCode = str;
        return this;
    }

    public SearchListResponse setTokenPagination(TokenPagination tokenPagination) {
        this.tokenPagination = tokenPagination;
        return this;
    }

    public SearchListResponse setVisitorId(String str) {
        this.visitorId = str;
        return this;
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData
    public SearchListResponse set(String str, Object obj) {
        return (SearchListResponse) super.set(str, obj);
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData, java.util.AbstractMap
    public SearchListResponse clone() {
        return (SearchListResponse) super.clone();
    }
}
