package com.google.api.services.youtube.model;

import com.google.api.client.json.GenericJson;
import com.google.api.client.util.Key;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class VideoTopicDetails extends GenericJson {

    @Key
    private List<String> relevantTopicIds;

    @Key
    private List<String> topicCategories;

    @Key
    private List<String> topicIds;

    public List<String> getRelevantTopicIds() {
        return this.relevantTopicIds;
    }

    public List<String> getTopicCategories() {
        return this.topicCategories;
    }

    public List<String> getTopicIds() {
        return this.topicIds;
    }

    public VideoTopicDetails setRelevantTopicIds(List<String> list) {
        this.relevantTopicIds = list;
        return this;
    }

    public VideoTopicDetails setTopicCategories(List<String> list) {
        this.topicCategories = list;
        return this;
    }

    public VideoTopicDetails setTopicIds(List<String> list) {
        this.topicIds = list;
        return this;
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData
    public VideoTopicDetails set(String str, Object obj) {
        return (VideoTopicDetails) super.set(str, obj);
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData, java.util.AbstractMap
    public VideoTopicDetails clone() {
        return (VideoTopicDetails) super.clone();
    }
}
