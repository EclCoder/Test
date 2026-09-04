package com.google.api.services.youtube.model;

import com.google.api.client.json.GenericJson;
import com.google.api.client.util.Data;
import com.google.api.client.util.Key;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class ChannelConversionPings extends GenericJson {

    @Key
    private List<ChannelConversionPing> pings;

    static {
        Data.nullOf(ChannelConversionPing.class);
    }

    public List<ChannelConversionPing> getPings() {
        return this.pings;
    }

    public ChannelConversionPings setPings(List<ChannelConversionPing> list) {
        this.pings = list;
        return this;
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData
    public ChannelConversionPings set(String str, Object obj) {
        return (ChannelConversionPings) super.set(str, obj);
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData, java.util.AbstractMap
    public ChannelConversionPings clone() {
        return (ChannelConversionPings) super.clone();
    }
}
