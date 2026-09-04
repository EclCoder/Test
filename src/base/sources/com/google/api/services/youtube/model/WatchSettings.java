package com.google.api.services.youtube.model;

import com.google.api.client.json.GenericJson;
import com.google.api.client.util.Key;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class WatchSettings extends GenericJson {

    @Key
    private String backgroundColor;

    @Key
    private String featuredPlaylistId;

    @Key
    private String textColor;

    public String getBackgroundColor() {
        return this.backgroundColor;
    }

    public String getFeaturedPlaylistId() {
        return this.featuredPlaylistId;
    }

    public String getTextColor() {
        return this.textColor;
    }

    public WatchSettings setBackgroundColor(String str) {
        this.backgroundColor = str;
        return this;
    }

    public WatchSettings setFeaturedPlaylistId(String str) {
        this.featuredPlaylistId = str;
        return this;
    }

    public WatchSettings setTextColor(String str) {
        this.textColor = str;
        return this;
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData
    public WatchSettings set(String str, Object obj) {
        return (WatchSettings) super.set(str, obj);
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData, java.util.AbstractMap
    public WatchSettings clone() {
        return (WatchSettings) super.clone();
    }
}
