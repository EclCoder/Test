package com.google.api.services.youtube.model;

import com.google.api.client.json.GenericJson;
import com.google.api.client.util.Key;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class PlaylistContentDetails extends GenericJson {

    @Key
    private Long itemCount;

    public Long getItemCount() {
        return this.itemCount;
    }

    public PlaylistContentDetails setItemCount(Long l10) {
        this.itemCount = l10;
        return this;
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData
    public PlaylistContentDetails set(String str, Object obj) {
        return (PlaylistContentDetails) super.set(str, obj);
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData, java.util.AbstractMap
    public PlaylistContentDetails clone() {
        return (PlaylistContentDetails) super.clone();
    }
}
