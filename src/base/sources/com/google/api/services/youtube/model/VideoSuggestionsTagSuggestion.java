package com.google.api.services.youtube.model;

import com.google.api.client.json.GenericJson;
import com.google.api.client.util.Key;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class VideoSuggestionsTagSuggestion extends GenericJson {

    @Key
    private List<String> categoryRestricts;

    @Key
    private String tag;

    public List<String> getCategoryRestricts() {
        return this.categoryRestricts;
    }

    public String getTag() {
        return this.tag;
    }

    public VideoSuggestionsTagSuggestion setCategoryRestricts(List<String> list) {
        this.categoryRestricts = list;
        return this;
    }

    public VideoSuggestionsTagSuggestion setTag(String str) {
        this.tag = str;
        return this;
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData
    public VideoSuggestionsTagSuggestion set(String str, Object obj) {
        return (VideoSuggestionsTagSuggestion) super.set(str, obj);
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData, java.util.AbstractMap
    public VideoSuggestionsTagSuggestion clone() {
        return (VideoSuggestionsTagSuggestion) super.clone();
    }
}
