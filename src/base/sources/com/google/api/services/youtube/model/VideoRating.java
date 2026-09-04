package com.google.api.services.youtube.model;

import com.google.api.client.json.GenericJson;
import com.google.api.client.util.Key;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class VideoRating extends GenericJson {

    @Key
    private String rating;

    @Key
    private String videoId;

    public String getRating() {
        return this.rating;
    }

    public String getVideoId() {
        return this.videoId;
    }

    public VideoRating setRating(String str) {
        this.rating = str;
        return this;
    }

    public VideoRating setVideoId(String str) {
        this.videoId = str;
        return this;
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData
    public VideoRating set(String str, Object obj) {
        return (VideoRating) super.set(str, obj);
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData, java.util.AbstractMap
    public VideoRating clone() {
        return (VideoRating) super.clone();
    }
}
