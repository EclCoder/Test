package com.google.api.services.youtube.model;

import com.google.api.client.json.GenericJson;
import com.google.api.client.util.Key;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class MembershipsDuration extends GenericJson {

    @Key
    private String memberSince;

    @Key
    private Integer memberTotalDurationMonths;

    public String getMemberSince() {
        return this.memberSince;
    }

    public Integer getMemberTotalDurationMonths() {
        return this.memberTotalDurationMonths;
    }

    public MembershipsDuration setMemberSince(String str) {
        this.memberSince = str;
        return this;
    }

    public MembershipsDuration setMemberTotalDurationMonths(Integer num) {
        this.memberTotalDurationMonths = num;
        return this;
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData
    public MembershipsDuration set(String str, Object obj) {
        return (MembershipsDuration) super.set(str, obj);
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData, java.util.AbstractMap
    public MembershipsDuration clone() {
        return (MembershipsDuration) super.clone();
    }
}
