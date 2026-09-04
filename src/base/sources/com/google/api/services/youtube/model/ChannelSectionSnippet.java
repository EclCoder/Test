package com.google.api.services.youtube.model;

import com.google.api.client.json.GenericJson;
import com.google.api.client.util.Key;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class ChannelSectionSnippet extends GenericJson {

    @Key
    private String channelId;

    @Key
    private String defaultLanguage;

    @Key
    private ChannelSectionLocalization localized;

    @Key
    private Long position;

    @Key
    private String style;

    @Key
    private String title;

    @Key
    private String type;

    public String getChannelId() {
        return this.channelId;
    }

    public String getDefaultLanguage() {
        return this.defaultLanguage;
    }

    public ChannelSectionLocalization getLocalized() {
        return this.localized;
    }

    public Long getPosition() {
        return this.position;
    }

    public String getStyle() {
        return this.style;
    }

    public String getTitle() {
        return this.title;
    }

    public String getType() {
        return this.type;
    }

    public ChannelSectionSnippet setChannelId(String str) {
        this.channelId = str;
        return this;
    }

    public ChannelSectionSnippet setDefaultLanguage(String str) {
        this.defaultLanguage = str;
        return this;
    }

    public ChannelSectionSnippet setLocalized(ChannelSectionLocalization channelSectionLocalization) {
        this.localized = channelSectionLocalization;
        return this;
    }

    public ChannelSectionSnippet setPosition(Long l10) {
        this.position = l10;
        return this;
    }

    public ChannelSectionSnippet setStyle(String str) {
        this.style = str;
        return this;
    }

    public ChannelSectionSnippet setTitle(String str) {
        this.title = str;
        return this;
    }

    public ChannelSectionSnippet setType(String str) {
        this.type = str;
        return this;
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData
    public ChannelSectionSnippet set(String str, Object obj) {
        return (ChannelSectionSnippet) super.set(str, obj);
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData, java.util.AbstractMap
    public ChannelSectionSnippet clone() {
        return (ChannelSectionSnippet) super.clone();
    }
}
