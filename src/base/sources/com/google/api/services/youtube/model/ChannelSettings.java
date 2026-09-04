package com.google.api.services.youtube.model;

import com.google.api.client.json.GenericJson;
import com.google.api.client.util.Key;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class ChannelSettings extends GenericJson {

    @Key
    private String country;

    @Key
    private String defaultLanguage;

    @Key
    private String defaultTab;

    @Key
    private String description;

    @Key
    private String featuredChannelsTitle;

    @Key
    private List<String> featuredChannelsUrls;

    @Key
    private String keywords;

    @Key
    private Boolean moderateComments;

    @Key
    private String profileColor;

    @Key
    private Boolean showBrowseView;

    @Key
    private Boolean showRelatedChannels;

    @Key
    private String title;

    @Key
    private String trackingAnalyticsAccountId;

    @Key
    private String unsubscribedTrailer;

    public String getCountry() {
        return this.country;
    }

    public String getDefaultLanguage() {
        return this.defaultLanguage;
    }

    public String getDefaultTab() {
        return this.defaultTab;
    }

    public String getDescription() {
        return this.description;
    }

    public String getFeaturedChannelsTitle() {
        return this.featuredChannelsTitle;
    }

    public List<String> getFeaturedChannelsUrls() {
        return this.featuredChannelsUrls;
    }

    public String getKeywords() {
        return this.keywords;
    }

    public Boolean getModerateComments() {
        return this.moderateComments;
    }

    public String getProfileColor() {
        return this.profileColor;
    }

    public Boolean getShowBrowseView() {
        return this.showBrowseView;
    }

    public Boolean getShowRelatedChannels() {
        return this.showRelatedChannels;
    }

    public String getTitle() {
        return this.title;
    }

    public String getTrackingAnalyticsAccountId() {
        return this.trackingAnalyticsAccountId;
    }

    public String getUnsubscribedTrailer() {
        return this.unsubscribedTrailer;
    }

    public ChannelSettings setCountry(String str) {
        this.country = str;
        return this;
    }

    public ChannelSettings setDefaultLanguage(String str) {
        this.defaultLanguage = str;
        return this;
    }

    public ChannelSettings setDefaultTab(String str) {
        this.defaultTab = str;
        return this;
    }

    public ChannelSettings setDescription(String str) {
        this.description = str;
        return this;
    }

    public ChannelSettings setFeaturedChannelsTitle(String str) {
        this.featuredChannelsTitle = str;
        return this;
    }

    public ChannelSettings setFeaturedChannelsUrls(List<String> list) {
        this.featuredChannelsUrls = list;
        return this;
    }

    public ChannelSettings setKeywords(String str) {
        this.keywords = str;
        return this;
    }

    public ChannelSettings setModerateComments(Boolean bool) {
        this.moderateComments = bool;
        return this;
    }

    public ChannelSettings setProfileColor(String str) {
        this.profileColor = str;
        return this;
    }

    public ChannelSettings setShowBrowseView(Boolean bool) {
        this.showBrowseView = bool;
        return this;
    }

    public ChannelSettings setShowRelatedChannels(Boolean bool) {
        this.showRelatedChannels = bool;
        return this;
    }

    public ChannelSettings setTitle(String str) {
        this.title = str;
        return this;
    }

    public ChannelSettings setTrackingAnalyticsAccountId(String str) {
        this.trackingAnalyticsAccountId = str;
        return this;
    }

    public ChannelSettings setUnsubscribedTrailer(String str) {
        this.unsubscribedTrailer = str;
        return this;
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData
    public ChannelSettings set(String str, Object obj) {
        return (ChannelSettings) super.set(str, obj);
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData, java.util.AbstractMap
    public ChannelSettings clone() {
        return (ChannelSettings) super.clone();
    }
}
