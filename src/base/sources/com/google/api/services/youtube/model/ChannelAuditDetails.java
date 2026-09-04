package com.google.api.services.youtube.model;

import com.google.api.client.json.GenericJson;
import com.google.api.client.util.Key;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class ChannelAuditDetails extends GenericJson {

    @Key
    private Boolean communityGuidelinesGoodStanding;

    @Key
    private Boolean contentIdClaimsGoodStanding;

    @Key
    private Boolean copyrightStrikesGoodStanding;

    public Boolean getCommunityGuidelinesGoodStanding() {
        return this.communityGuidelinesGoodStanding;
    }

    public Boolean getContentIdClaimsGoodStanding() {
        return this.contentIdClaimsGoodStanding;
    }

    public Boolean getCopyrightStrikesGoodStanding() {
        return this.copyrightStrikesGoodStanding;
    }

    public ChannelAuditDetails setCommunityGuidelinesGoodStanding(Boolean bool) {
        this.communityGuidelinesGoodStanding = bool;
        return this;
    }

    public ChannelAuditDetails setContentIdClaimsGoodStanding(Boolean bool) {
        this.contentIdClaimsGoodStanding = bool;
        return this;
    }

    public ChannelAuditDetails setCopyrightStrikesGoodStanding(Boolean bool) {
        this.copyrightStrikesGoodStanding = bool;
        return this;
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData
    public ChannelAuditDetails set(String str, Object obj) {
        return (ChannelAuditDetails) super.set(str, obj);
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData, java.util.AbstractMap
    public ChannelAuditDetails clone() {
        return (ChannelAuditDetails) super.clone();
    }
}
