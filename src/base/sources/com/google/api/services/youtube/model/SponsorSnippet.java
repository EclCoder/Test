package com.google.api.services.youtube.model;

import com.google.api.client.json.GenericJson;
import com.google.api.client.util.Key;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class SponsorSnippet extends GenericJson {

    @Key
    private String channelId;

    @Key
    private Integer cumulativeDurationMonths;

    @Key
    private ChannelProfileDetails sponsorDetails;

    @Key
    private String sponsorSince;

    public String getChannelId() {
        return this.channelId;
    }

    public Integer getCumulativeDurationMonths() {
        return this.cumulativeDurationMonths;
    }

    public ChannelProfileDetails getSponsorDetails() {
        return this.sponsorDetails;
    }

    public String getSponsorSince() {
        return this.sponsorSince;
    }

    public SponsorSnippet setChannelId(String str) {
        this.channelId = str;
        return this;
    }

    public SponsorSnippet setCumulativeDurationMonths(Integer num) {
        this.cumulativeDurationMonths = num;
        return this;
    }

    public SponsorSnippet setSponsorDetails(ChannelProfileDetails channelProfileDetails) {
        this.sponsorDetails = channelProfileDetails;
        return this;
    }

    public SponsorSnippet setSponsorSince(String str) {
        this.sponsorSince = str;
        return this;
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData
    public SponsorSnippet set(String str, Object obj) {
        return (SponsorSnippet) super.set(str, obj);
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData, java.util.AbstractMap
    public SponsorSnippet clone() {
        return (SponsorSnippet) super.clone();
    }
}
