package com.google.api.services.youtube.model;

import com.google.api.client.json.GenericJson;
import com.google.api.client.util.Key;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class Channel extends GenericJson {

    @Key
    private ChannelAuditDetails auditDetails;

    @Key
    private ChannelBrandingSettings brandingSettings;

    @Key
    private ChannelContentDetails contentDetails;

    @Key
    private ChannelContentOwnerDetails contentOwnerDetails;

    @Key
    private ChannelConversionPings conversionPings;

    @Key
    private String etag;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @Key
    private String f21618id;

    @Key
    private InvideoPromotion invideoPromotion;

    @Key
    private String kind;

    @Key
    private Map<String, ChannelLocalization> localizations;

    @Key
    private ChannelSnippet snippet;

    @Key
    private ChannelStatistics statistics;

    @Key
    private ChannelStatus status;

    @Key
    private ChannelTopicDetails topicDetails;

    public ChannelAuditDetails getAuditDetails() {
        return this.auditDetails;
    }

    public ChannelBrandingSettings getBrandingSettings() {
        return this.brandingSettings;
    }

    public ChannelContentDetails getContentDetails() {
        return this.contentDetails;
    }

    public ChannelContentOwnerDetails getContentOwnerDetails() {
        return this.contentOwnerDetails;
    }

    public ChannelConversionPings getConversionPings() {
        return this.conversionPings;
    }

    public String getEtag() {
        return this.etag;
    }

    public String getId() {
        return this.f21618id;
    }

    public InvideoPromotion getInvideoPromotion() {
        return this.invideoPromotion;
    }

    public String getKind() {
        return this.kind;
    }

    public Map<String, ChannelLocalization> getLocalizations() {
        return this.localizations;
    }

    public ChannelSnippet getSnippet() {
        return this.snippet;
    }

    public ChannelStatistics getStatistics() {
        return this.statistics;
    }

    public ChannelStatus getStatus() {
        return this.status;
    }

    public ChannelTopicDetails getTopicDetails() {
        return this.topicDetails;
    }

    public Channel setAuditDetails(ChannelAuditDetails channelAuditDetails) {
        this.auditDetails = channelAuditDetails;
        return this;
    }

    public Channel setBrandingSettings(ChannelBrandingSettings channelBrandingSettings) {
        this.brandingSettings = channelBrandingSettings;
        return this;
    }

    public Channel setContentDetails(ChannelContentDetails channelContentDetails) {
        this.contentDetails = channelContentDetails;
        return this;
    }

    public Channel setContentOwnerDetails(ChannelContentOwnerDetails channelContentOwnerDetails) {
        this.contentOwnerDetails = channelContentOwnerDetails;
        return this;
    }

    public Channel setConversionPings(ChannelConversionPings channelConversionPings) {
        this.conversionPings = channelConversionPings;
        return this;
    }

    public Channel setEtag(String str) {
        this.etag = str;
        return this;
    }

    public Channel setId(String str) {
        this.f21618id = str;
        return this;
    }

    public Channel setInvideoPromotion(InvideoPromotion invideoPromotion) {
        this.invideoPromotion = invideoPromotion;
        return this;
    }

    public Channel setKind(String str) {
        this.kind = str;
        return this;
    }

    public Channel setLocalizations(Map<String, ChannelLocalization> map) {
        this.localizations = map;
        return this;
    }

    public Channel setSnippet(ChannelSnippet channelSnippet) {
        this.snippet = channelSnippet;
        return this;
    }

    public Channel setStatistics(ChannelStatistics channelStatistics) {
        this.statistics = channelStatistics;
        return this;
    }

    public Channel setStatus(ChannelStatus channelStatus) {
        this.status = channelStatus;
        return this;
    }

    public Channel setTopicDetails(ChannelTopicDetails channelTopicDetails) {
        this.topicDetails = channelTopicDetails;
        return this;
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData
    public Channel set(String str, Object obj) {
        return (Channel) super.set(str, obj);
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData, java.util.AbstractMap
    public Channel clone() {
        return (Channel) super.clone();
    }
}
