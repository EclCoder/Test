package com.google.api.services.youtube.model;

import com.google.api.client.json.GenericJson;
import com.google.api.client.util.Key;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class VideoContentDetails extends GenericJson {

    @Key
    private String caption;

    @Key
    private ContentRating contentRating;

    @Key
    private AccessPolicy countryRestriction;

    @Key
    private String definition;

    @Key
    private String dimension;

    @Key
    private String duration;

    @Key
    private Boolean hasCustomThumbnail;

    @Key
    private Boolean licensedContent;

    @Key
    private String projection;

    @Key
    private VideoContentDetailsRegionRestriction regionRestriction;

    public String getCaption() {
        return this.caption;
    }

    public ContentRating getContentRating() {
        return this.contentRating;
    }

    public AccessPolicy getCountryRestriction() {
        return this.countryRestriction;
    }

    public String getDefinition() {
        return this.definition;
    }

    public String getDimension() {
        return this.dimension;
    }

    public String getDuration() {
        return this.duration;
    }

    public Boolean getHasCustomThumbnail() {
        return this.hasCustomThumbnail;
    }

    public Boolean getLicensedContent() {
        return this.licensedContent;
    }

    public String getProjection() {
        return this.projection;
    }

    public VideoContentDetailsRegionRestriction getRegionRestriction() {
        return this.regionRestriction;
    }

    public VideoContentDetails setCaption(String str) {
        this.caption = str;
        return this;
    }

    public VideoContentDetails setContentRating(ContentRating contentRating) {
        this.contentRating = contentRating;
        return this;
    }

    public VideoContentDetails setCountryRestriction(AccessPolicy accessPolicy) {
        this.countryRestriction = accessPolicy;
        return this;
    }

    public VideoContentDetails setDefinition(String str) {
        this.definition = str;
        return this;
    }

    public VideoContentDetails setDimension(String str) {
        this.dimension = str;
        return this;
    }

    public VideoContentDetails setDuration(String str) {
        this.duration = str;
        return this;
    }

    public VideoContentDetails setHasCustomThumbnail(Boolean bool) {
        this.hasCustomThumbnail = bool;
        return this;
    }

    public VideoContentDetails setLicensedContent(Boolean bool) {
        this.licensedContent = bool;
        return this;
    }

    public VideoContentDetails setProjection(String str) {
        this.projection = str;
        return this;
    }

    public VideoContentDetails setRegionRestriction(VideoContentDetailsRegionRestriction videoContentDetailsRegionRestriction) {
        this.regionRestriction = videoContentDetailsRegionRestriction;
        return this;
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData
    public VideoContentDetails set(String str, Object obj) {
        return (VideoContentDetails) super.set(str, obj);
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData, java.util.AbstractMap
    public VideoContentDetails clone() {
        return (VideoContentDetails) super.clone();
    }
}
