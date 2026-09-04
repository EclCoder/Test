package com.google.api.services.youtube.model;

import com.google.api.client.json.GenericJson;
import com.google.api.client.util.Key;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class ActivityContentDetailsPromotedItem extends GenericJson {

    @Key
    private String adTag;

    @Key
    private String clickTrackingUrl;

    @Key
    private String creativeViewUrl;

    @Key
    private String ctaType;

    @Key
    private String customCtaButtonText;

    @Key
    private String descriptionText;

    @Key
    private String destinationUrl;

    @Key
    private List<String> forecastingUrl;

    @Key
    private List<String> impressionUrl;

    @Key
    private String videoId;

    public String getAdTag() {
        return this.adTag;
    }

    public String getClickTrackingUrl() {
        return this.clickTrackingUrl;
    }

    public String getCreativeViewUrl() {
        return this.creativeViewUrl;
    }

    public String getCtaType() {
        return this.ctaType;
    }

    public String getCustomCtaButtonText() {
        return this.customCtaButtonText;
    }

    public String getDescriptionText() {
        return this.descriptionText;
    }

    public String getDestinationUrl() {
        return this.destinationUrl;
    }

    public List<String> getForecastingUrl() {
        return this.forecastingUrl;
    }

    public List<String> getImpressionUrl() {
        return this.impressionUrl;
    }

    public String getVideoId() {
        return this.videoId;
    }

    public ActivityContentDetailsPromotedItem setAdTag(String str) {
        this.adTag = str;
        return this;
    }

    public ActivityContentDetailsPromotedItem setClickTrackingUrl(String str) {
        this.clickTrackingUrl = str;
        return this;
    }

    public ActivityContentDetailsPromotedItem setCreativeViewUrl(String str) {
        this.creativeViewUrl = str;
        return this;
    }

    public ActivityContentDetailsPromotedItem setCtaType(String str) {
        this.ctaType = str;
        return this;
    }

    public ActivityContentDetailsPromotedItem setCustomCtaButtonText(String str) {
        this.customCtaButtonText = str;
        return this;
    }

    public ActivityContentDetailsPromotedItem setDescriptionText(String str) {
        this.descriptionText = str;
        return this;
    }

    public ActivityContentDetailsPromotedItem setDestinationUrl(String str) {
        this.destinationUrl = str;
        return this;
    }

    public ActivityContentDetailsPromotedItem setForecastingUrl(List<String> list) {
        this.forecastingUrl = list;
        return this;
    }

    public ActivityContentDetailsPromotedItem setImpressionUrl(List<String> list) {
        this.impressionUrl = list;
        return this;
    }

    public ActivityContentDetailsPromotedItem setVideoId(String str) {
        this.videoId = str;
        return this;
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData
    public ActivityContentDetailsPromotedItem set(String str, Object obj) {
        return (ActivityContentDetailsPromotedItem) super.set(str, obj);
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData, java.util.AbstractMap
    public ActivityContentDetailsPromotedItem clone() {
        return (ActivityContentDetailsPromotedItem) super.clone();
    }
}
