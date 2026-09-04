package com.google.api.services.youtube;

import com.google.api.client.googleapis.services.json.AbstractGoogleJsonClientRequest;
import com.google.api.client.googleapis.services.json.CommonGoogleJsonClientRequestInitializer;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class YouTubeRequestInitializer extends CommonGoogleJsonClientRequestInitializer {
    public YouTubeRequestInitializer() {
    }

    @Override // com.google.api.client.googleapis.services.json.CommonGoogleJsonClientRequestInitializer
    public final void initializeJsonRequest(AbstractGoogleJsonClientRequest<?> abstractGoogleJsonClientRequest) {
        super.initializeJsonRequest(abstractGoogleJsonClientRequest);
        initializeYouTubeRequest((YouTubeRequest) abstractGoogleJsonClientRequest);
    }

    public YouTubeRequestInitializer(String str) {
        super(str);
    }

    public YouTubeRequestInitializer(String str, String str2) {
        super(str, str2);
    }

    protected void initializeYouTubeRequest(YouTubeRequest<?> youTubeRequest) {
    }
}
