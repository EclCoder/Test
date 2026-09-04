package com.google.api.services.youtube.model;

import com.google.api.client.json.GenericJson;
import com.google.api.client.util.Key;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class PlaylistItemStatus extends GenericJson {

    @Key
    private String privacyStatus;

    public String getPrivacyStatus() {
        return this.privacyStatus;
    }

    public PlaylistItemStatus setPrivacyStatus(String str) {
        this.privacyStatus = str;
        return this;
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData
    public PlaylistItemStatus set(String str, Object obj) {
        return (PlaylistItemStatus) super.set(str, obj);
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData, java.util.AbstractMap
    public PlaylistItemStatus clone() {
        return (PlaylistItemStatus) super.clone();
    }
}
