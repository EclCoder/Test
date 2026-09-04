package com.google.api.services.youtube.model;

import com.google.api.client.json.GenericJson;
import com.google.api.client.util.Key;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class VideoProcessingDetails extends GenericJson {

    @Key
    private String editorSuggestionsAvailability;

    @Key
    private String fileDetailsAvailability;

    @Key
    private String processingFailureReason;

    @Key
    private String processingIssuesAvailability;

    @Key
    private VideoProcessingDetailsProcessingProgress processingProgress;

    @Key
    private String processingStatus;

    @Key
    private String tagSuggestionsAvailability;

    @Key
    private String thumbnailsAvailability;

    public String getEditorSuggestionsAvailability() {
        return this.editorSuggestionsAvailability;
    }

    public String getFileDetailsAvailability() {
        return this.fileDetailsAvailability;
    }

    public String getProcessingFailureReason() {
        return this.processingFailureReason;
    }

    public String getProcessingIssuesAvailability() {
        return this.processingIssuesAvailability;
    }

    public VideoProcessingDetailsProcessingProgress getProcessingProgress() {
        return this.processingProgress;
    }

    public String getProcessingStatus() {
        return this.processingStatus;
    }

    public String getTagSuggestionsAvailability() {
        return this.tagSuggestionsAvailability;
    }

    public String getThumbnailsAvailability() {
        return this.thumbnailsAvailability;
    }

    public VideoProcessingDetails setEditorSuggestionsAvailability(String str) {
        this.editorSuggestionsAvailability = str;
        return this;
    }

    public VideoProcessingDetails setFileDetailsAvailability(String str) {
        this.fileDetailsAvailability = str;
        return this;
    }

    public VideoProcessingDetails setProcessingFailureReason(String str) {
        this.processingFailureReason = str;
        return this;
    }

    public VideoProcessingDetails setProcessingIssuesAvailability(String str) {
        this.processingIssuesAvailability = str;
        return this;
    }

    public VideoProcessingDetails setProcessingProgress(VideoProcessingDetailsProcessingProgress videoProcessingDetailsProcessingProgress) {
        this.processingProgress = videoProcessingDetailsProcessingProgress;
        return this;
    }

    public VideoProcessingDetails setProcessingStatus(String str) {
        this.processingStatus = str;
        return this;
    }

    public VideoProcessingDetails setTagSuggestionsAvailability(String str) {
        this.tagSuggestionsAvailability = str;
        return this;
    }

    public VideoProcessingDetails setThumbnailsAvailability(String str) {
        this.thumbnailsAvailability = str;
        return this;
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData
    public VideoProcessingDetails set(String str, Object obj) {
        return (VideoProcessingDetails) super.set(str, obj);
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData, java.util.AbstractMap
    public VideoProcessingDetails clone() {
        return (VideoProcessingDetails) super.clone();
    }
}
