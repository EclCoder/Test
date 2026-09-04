package com.google.api.services.youtube.model;

import com.google.api.client.json.GenericJson;
import com.google.api.client.util.Data;
import com.google.api.client.util.Key;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class VideoRatingListResponse extends GenericJson {

    @Key
    private String etag;

    @Key
    private String eventId;

    @Key
    private List<VideoRating> items;

    @Key
    private String kind;

    @Key
    private String visitorId;

    static {
        Data.nullOf(VideoRating.class);
    }

    public String getEtag() {
        return this.etag;
    }

    public String getEventId() {
        return this.eventId;
    }

    public List<VideoRating> getItems() {
        return this.items;
    }

    public String getKind() {
        return this.kind;
    }

    public String getVisitorId() {
        return this.visitorId;
    }

    public VideoRatingListResponse setEtag(String str) {
        this.etag = str;
        return this;
    }

    public VideoRatingListResponse setEventId(String str) {
        this.eventId = str;
        return this;
    }

    public VideoRatingListResponse setItems(List<VideoRating> list) {
        this.items = list;
        return this;
    }

    public VideoRatingListResponse setKind(String str) {
        this.kind = str;
        return this;
    }

    public VideoRatingListResponse setVisitorId(String str) {
        this.visitorId = str;
        return this;
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData
    public VideoRatingListResponse set(String str, Object obj) {
        return (VideoRatingListResponse) super.set(str, obj);
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData, java.util.AbstractMap
    public VideoRatingListResponse clone() {
        return (VideoRatingListResponse) super.clone();
    }
}
