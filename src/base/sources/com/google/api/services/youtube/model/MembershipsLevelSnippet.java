package com.google.api.services.youtube.model;

import com.google.api.client.json.GenericJson;
import com.google.api.client.util.Key;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class MembershipsLevelSnippet extends GenericJson {

    @Key
    private String creatorChannelId;

    @Key
    private LevelDetails levelDetails;

    public String getCreatorChannelId() {
        return this.creatorChannelId;
    }

    public LevelDetails getLevelDetails() {
        return this.levelDetails;
    }

    public MembershipsLevelSnippet setCreatorChannelId(String str) {
        this.creatorChannelId = str;
        return this;
    }

    public MembershipsLevelSnippet setLevelDetails(LevelDetails levelDetails) {
        this.levelDetails = levelDetails;
        return this;
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData
    public MembershipsLevelSnippet set(String str, Object obj) {
        return (MembershipsLevelSnippet) super.set(str, obj);
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData, java.util.AbstractMap
    public MembershipsLevelSnippet clone() {
        return (MembershipsLevelSnippet) super.clone();
    }
}
