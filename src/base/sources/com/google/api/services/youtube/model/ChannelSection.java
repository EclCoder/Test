package com.google.api.services.youtube.model;

import com.google.api.client.json.GenericJson;
import com.google.api.client.util.Key;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class ChannelSection extends GenericJson {

    @Key
    private ChannelSectionContentDetails contentDetails;

    @Key
    private String etag;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @Key
    private String f21619id;

    @Key
    private String kind;

    @Key
    private Map<String, ChannelSectionLocalization> localizations;

    @Key
    private ChannelSectionSnippet snippet;

    @Key
    private ChannelSectionTargeting targeting;

    public ChannelSectionContentDetails getContentDetails() {
        return this.contentDetails;
    }

    public String getEtag() {
        return this.etag;
    }

    public String getId() {
        return this.f21619id;
    }

    public String getKind() {
        return this.kind;
    }

    public Map<String, ChannelSectionLocalization> getLocalizations() {
        return this.localizations;
    }

    public ChannelSectionSnippet getSnippet() {
        return this.snippet;
    }

    public ChannelSectionTargeting getTargeting() {
        return this.targeting;
    }

    public ChannelSection setContentDetails(ChannelSectionContentDetails channelSectionContentDetails) {
        this.contentDetails = channelSectionContentDetails;
        return this;
    }

    public ChannelSection setEtag(String str) {
        this.etag = str;
        return this;
    }

    public ChannelSection setId(String str) {
        this.f21619id = str;
        return this;
    }

    public ChannelSection setKind(String str) {
        this.kind = str;
        return this;
    }

    public ChannelSection setLocalizations(Map<String, ChannelSectionLocalization> map) {
        this.localizations = map;
        return this;
    }

    public ChannelSection setSnippet(ChannelSectionSnippet channelSectionSnippet) {
        this.snippet = channelSectionSnippet;
        return this;
    }

    public ChannelSection setTargeting(ChannelSectionTargeting channelSectionTargeting) {
        this.targeting = channelSectionTargeting;
        return this;
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData
    public ChannelSection set(String str, Object obj) {
        return (ChannelSection) super.set(str, obj);
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData, java.util.AbstractMap
    public ChannelSection clone() {
        return (ChannelSection) super.clone();
    }
}
