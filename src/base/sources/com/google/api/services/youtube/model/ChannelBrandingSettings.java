package com.google.api.services.youtube.model;

import com.google.api.client.json.GenericJson;
import com.google.api.client.util.Key;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class ChannelBrandingSettings extends GenericJson {

    @Key
    private ChannelSettings channel;

    @Key
    private List<PropertyValue> hints;

    @Key
    private ImageSettings image;

    @Key
    private WatchSettings watch;

    public ChannelSettings getChannel() {
        return this.channel;
    }

    public List<PropertyValue> getHints() {
        return this.hints;
    }

    public ImageSettings getImage() {
        return this.image;
    }

    public WatchSettings getWatch() {
        return this.watch;
    }

    public ChannelBrandingSettings setChannel(ChannelSettings channelSettings) {
        this.channel = channelSettings;
        return this;
    }

    public ChannelBrandingSettings setHints(List<PropertyValue> list) {
        this.hints = list;
        return this;
    }

    public ChannelBrandingSettings setImage(ImageSettings imageSettings) {
        this.image = imageSettings;
        return this;
    }

    public ChannelBrandingSettings setWatch(WatchSettings watchSettings) {
        this.watch = watchSettings;
        return this;
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData
    public ChannelBrandingSettings set(String str, Object obj) {
        return (ChannelBrandingSettings) super.set(str, obj);
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData, java.util.AbstractMap
    public ChannelBrandingSettings clone() {
        return (ChannelBrandingSettings) super.clone();
    }
}
