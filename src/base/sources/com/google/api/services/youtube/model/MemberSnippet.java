package com.google.api.services.youtube.model;

import com.google.api.client.json.GenericJson;
import com.google.api.client.util.Key;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class MemberSnippet extends GenericJson {

    @Key
    private String creatorChannelId;

    @Key
    private ChannelProfileDetails memberDetails;

    @Key
    private MembershipsDetails membershipsDetails;

    public String getCreatorChannelId() {
        return this.creatorChannelId;
    }

    public ChannelProfileDetails getMemberDetails() {
        return this.memberDetails;
    }

    public MembershipsDetails getMembershipsDetails() {
        return this.membershipsDetails;
    }

    public MemberSnippet setCreatorChannelId(String str) {
        this.creatorChannelId = str;
        return this;
    }

    public MemberSnippet setMemberDetails(ChannelProfileDetails channelProfileDetails) {
        this.memberDetails = channelProfileDetails;
        return this;
    }

    public MemberSnippet setMembershipsDetails(MembershipsDetails membershipsDetails) {
        this.membershipsDetails = membershipsDetails;
        return this;
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData
    public MemberSnippet set(String str, Object obj) {
        return (MemberSnippet) super.set(str, obj);
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData, java.util.AbstractMap
    public MemberSnippet clone() {
        return (MemberSnippet) super.clone();
    }
}
