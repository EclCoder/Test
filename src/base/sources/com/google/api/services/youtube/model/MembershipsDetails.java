package com.google.api.services.youtube.model;

import com.google.api.client.json.GenericJson;
import com.google.api.client.util.Key;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class MembershipsDetails extends GenericJson {

    @Key
    private List<String> accessibleLevels;

    @Key
    private String highestAccessibleLevel;

    @Key
    private String highestAccessibleLevelDisplayName;

    @Key
    private MembershipsDuration membershipsDuration;

    @Key
    private List<MembershipsDurationAtLevel> membershipsDurationAtLevels;

    public List<String> getAccessibleLevels() {
        return this.accessibleLevels;
    }

    public String getHighestAccessibleLevel() {
        return this.highestAccessibleLevel;
    }

    public String getHighestAccessibleLevelDisplayName() {
        return this.highestAccessibleLevelDisplayName;
    }

    public MembershipsDuration getMembershipsDuration() {
        return this.membershipsDuration;
    }

    public List<MembershipsDurationAtLevel> getMembershipsDurationAtLevels() {
        return this.membershipsDurationAtLevels;
    }

    public MembershipsDetails setAccessibleLevels(List<String> list) {
        this.accessibleLevels = list;
        return this;
    }

    public MembershipsDetails setHighestAccessibleLevel(String str) {
        this.highestAccessibleLevel = str;
        return this;
    }

    public MembershipsDetails setHighestAccessibleLevelDisplayName(String str) {
        this.highestAccessibleLevelDisplayName = str;
        return this;
    }

    public MembershipsDetails setMembershipsDuration(MembershipsDuration membershipsDuration) {
        this.membershipsDuration = membershipsDuration;
        return this;
    }

    public MembershipsDetails setMembershipsDurationAtLevels(List<MembershipsDurationAtLevel> list) {
        this.membershipsDurationAtLevels = list;
        return this;
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData
    public MembershipsDetails set(String str, Object obj) {
        return (MembershipsDetails) super.set(str, obj);
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData, java.util.AbstractMap
    public MembershipsDetails clone() {
        return (MembershipsDetails) super.clone();
    }
}
