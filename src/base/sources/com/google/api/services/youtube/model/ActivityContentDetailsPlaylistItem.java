package com.google.api.services.youtube.model;

import com.google.api.client.json.GenericJson;
import com.google.api.client.util.Key;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class ActivityContentDetailsPlaylistItem extends GenericJson {

    @Key
    private String playlistId;

    @Key
    private String playlistItemId;

    @Key
    private ResourceId resourceId;

    public String getPlaylistId() {
        return this.playlistId;
    }

    public String getPlaylistItemId() {
        return this.playlistItemId;
    }

    public ResourceId getResourceId() {
        return this.resourceId;
    }

    public ActivityContentDetailsPlaylistItem setPlaylistId(String str) {
        this.playlistId = str;
        return this;
    }

    public ActivityContentDetailsPlaylistItem setPlaylistItemId(String str) {
        this.playlistItemId = str;
        return this;
    }

    public ActivityContentDetailsPlaylistItem setResourceId(ResourceId resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData
    public ActivityContentDetailsPlaylistItem set(String str, Object obj) {
        return (ActivityContentDetailsPlaylistItem) super.set(str, obj);
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData, java.util.AbstractMap
    public ActivityContentDetailsPlaylistItem clone() {
        return (ActivityContentDetailsPlaylistItem) super.clone();
    }
}
