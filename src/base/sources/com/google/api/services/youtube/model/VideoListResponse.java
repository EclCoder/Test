package com.google.api.services.youtube.model;

import com.google.api.client.json.GenericJson;
import com.google.api.client.util.Data;
import com.google.api.client.util.Key;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class VideoListResponse extends GenericJson {

    @Key
    private String etag;

    @Key
    private String eventId;

    @Key
    private List<Video> items;

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
        Data.nullOf(Video.class);
    }

    public String getEtag() {
        return this.etag;
    }

    public String getEventId() {
        return this.eventId;
    }

    public List<Video> getItems() {
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

    public VideoListResponse setEtag(String str) {
        this.etag = str;
        return this;
    }

    public VideoListResponse setEventId(String str) {
        this.eventId = str;
        return this;
    }

    public VideoListResponse setItems(List<Video> list) {
        this.items = list;
        return this;
    }

    public VideoListResponse setKind(String str) {
        this.kind = str;
        return this;
    }

    public VideoListResponse setNextPageToken(String str) {
        this.nextPageToken = str;
        return this;
    }

    public VideoListResponse setPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }

    public VideoListResponse setPrevPageToken(String str) {
        this.prevPageToken = str;
        return this;
    }

    public VideoListResponse setTokenPagination(TokenPagination tokenPagination) {
        this.tokenPagination = tokenPagination;
        return this;
    }

    public VideoListResponse setVisitorId(String str) {
        this.visitorId = str;
        return this;
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData
    public VideoListResponse set(String str, Object obj) {
        return (VideoListResponse) super.set(str, obj);
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData, java.util.AbstractMap
    public VideoListResponse clone() {
        return (VideoListResponse) super.clone();
    }
}
