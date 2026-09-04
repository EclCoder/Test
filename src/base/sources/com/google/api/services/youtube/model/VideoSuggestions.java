package com.google.api.services.youtube.model;

import com.google.api.client.json.GenericJson;
import com.google.api.client.util.Key;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class VideoSuggestions extends GenericJson {

    @Key
    private List<String> editorSuggestions;

    @Key
    private List<String> processingErrors;

    @Key
    private List<String> processingHints;

    @Key
    private List<String> processingWarnings;

    @Key
    private List<VideoSuggestionsTagSuggestion> tagSuggestions;

    public List<String> getEditorSuggestions() {
        return this.editorSuggestions;
    }

    public List<String> getProcessingErrors() {
        return this.processingErrors;
    }

    public List<String> getProcessingHints() {
        return this.processingHints;
    }

    public List<String> getProcessingWarnings() {
        return this.processingWarnings;
    }

    public List<VideoSuggestionsTagSuggestion> getTagSuggestions() {
        return this.tagSuggestions;
    }

    public VideoSuggestions setEditorSuggestions(List<String> list) {
        this.editorSuggestions = list;
        return this;
    }

    public VideoSuggestions setProcessingErrors(List<String> list) {
        this.processingErrors = list;
        return this;
    }

    public VideoSuggestions setProcessingHints(List<String> list) {
        this.processingHints = list;
        return this;
    }

    public VideoSuggestions setProcessingWarnings(List<String> list) {
        this.processingWarnings = list;
        return this;
    }

    public VideoSuggestions setTagSuggestions(List<VideoSuggestionsTagSuggestion> list) {
        this.tagSuggestions = list;
        return this;
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData
    public VideoSuggestions set(String str, Object obj) {
        return (VideoSuggestions) super.set(str, obj);
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData, java.util.AbstractMap
    public VideoSuggestions clone() {
        return (VideoSuggestions) super.clone();
    }
}
