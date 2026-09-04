package com.google.api.services.youtube.model;

import com.google.api.client.json.GenericJson;
import com.google.api.client.util.Key;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class VideoProjectDetails extends GenericJson {

    @Key
    private List<String> tags;

    public List<String> getTags() {
        return this.tags;
    }

    public VideoProjectDetails setTags(List<String> list) {
        this.tags = list;
        return this;
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData
    public VideoProjectDetails set(String str, Object obj) {
        return (VideoProjectDetails) super.set(str, obj);
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData, java.util.AbstractMap
    public VideoProjectDetails clone() {
        return (VideoProjectDetails) super.clone();
    }
}
