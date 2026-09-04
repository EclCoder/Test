package com.google.api.services.youtube.model;

import com.google.api.client.json.GenericJson;
import com.google.api.client.util.Key;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class ChannelSectionContentDetails extends GenericJson {

    @Key
    private List<String> channels;

    @Key
    private List<String> playlists;

    public List<String> getChannels() {
        return this.channels;
    }

    public List<String> getPlaylists() {
        return this.playlists;
    }

    public ChannelSectionContentDetails setChannels(List<String> list) {
        this.channels = list;
        return this;
    }

    public ChannelSectionContentDetails setPlaylists(List<String> list) {
        this.playlists = list;
        return this;
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData
    public ChannelSectionContentDetails set(String str, Object obj) {
        return (ChannelSectionContentDetails) super.set(str, obj);
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData, java.util.AbstractMap
    public ChannelSectionContentDetails clone() {
        return (ChannelSectionContentDetails) super.clone();
    }
}
