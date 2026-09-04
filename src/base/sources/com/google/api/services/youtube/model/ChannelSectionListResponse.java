package com.google.api.services.youtube.model;

import com.google.api.client.json.GenericJson;
import com.google.api.client.util.Data;
import com.google.api.client.util.Key;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class ChannelSectionListResponse extends GenericJson {

    @Key
    private String etag;

    @Key
    private String eventId;

    @Key
    private List<ChannelSection> items;

    @Key
    private String kind;

    @Key
    private String visitorId;

    static {
        Data.nullOf(ChannelSection.class);
    }

    public String getEtag() {
        return this.etag;
    }

    public String getEventId() {
        return this.eventId;
    }

    public List<ChannelSection> getItems() {
        return this.items;
    }

    public String getKind() {
        return this.kind;
    }

    public String getVisitorId() {
        return this.visitorId;
    }

    public ChannelSectionListResponse setEtag(String str) {
        this.etag = str;
        return this;
    }

    public ChannelSectionListResponse setEventId(String str) {
        this.eventId = str;
        return this;
    }

    public ChannelSectionListResponse setItems(List<ChannelSection> list) {
        this.items = list;
        return this;
    }

    public ChannelSectionListResponse setKind(String str) {
        this.kind = str;
        return this;
    }

    public ChannelSectionListResponse setVisitorId(String str) {
        this.visitorId = str;
        return this;
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData
    public ChannelSectionListResponse set(String str, Object obj) {
        return (ChannelSectionListResponse) super.set(str, obj);
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData, java.util.AbstractMap
    public ChannelSectionListResponse clone() {
        return (ChannelSectionListResponse) super.clone();
    }
}
