package com.google.api.services.youtube.model;

import com.google.api.client.json.GenericJson;
import com.google.api.client.util.Data;
import com.google.api.client.util.Key;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class MembershipsLevelListResponse extends GenericJson {

    @Key
    private String etag;

    @Key
    private String eventId;

    @Key
    private List<MembershipsLevel> items;

    @Key
    private String kind;

    @Key
    private String visitorId;

    static {
        Data.nullOf(MembershipsLevel.class);
    }

    public String getEtag() {
        return this.etag;
    }

    public String getEventId() {
        return this.eventId;
    }

    public List<MembershipsLevel> getItems() {
        return this.items;
    }

    public String getKind() {
        return this.kind;
    }

    public String getVisitorId() {
        return this.visitorId;
    }

    public MembershipsLevelListResponse setEtag(String str) {
        this.etag = str;
        return this;
    }

    public MembershipsLevelListResponse setEventId(String str) {
        this.eventId = str;
        return this;
    }

    public MembershipsLevelListResponse setItems(List<MembershipsLevel> list) {
        this.items = list;
        return this;
    }

    public MembershipsLevelListResponse setKind(String str) {
        this.kind = str;
        return this;
    }

    public MembershipsLevelListResponse setVisitorId(String str) {
        this.visitorId = str;
        return this;
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData
    public MembershipsLevelListResponse set(String str, Object obj) {
        return (MembershipsLevelListResponse) super.set(str, obj);
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData, java.util.AbstractMap
    public MembershipsLevelListResponse clone() {
        return (MembershipsLevelListResponse) super.clone();
    }
}
