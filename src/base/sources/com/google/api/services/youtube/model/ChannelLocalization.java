package com.google.api.services.youtube.model;

import com.google.api.client.json.GenericJson;
import com.google.api.client.util.Key;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class ChannelLocalization extends GenericJson {

    @Key
    private String description;

    @Key
    private String title;

    public String getDescription() {
        return this.description;
    }

    public String getTitle() {
        return this.title;
    }

    public ChannelLocalization setDescription(String str) {
        this.description = str;
        return this;
    }

    public ChannelLocalization setTitle(String str) {
        this.title = str;
        return this;
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData
    public ChannelLocalization set(String str, Object obj) {
        return (ChannelLocalization) super.set(str, obj);
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData, java.util.AbstractMap
    public ChannelLocalization clone() {
        return (ChannelLocalization) super.clone();
    }
}
