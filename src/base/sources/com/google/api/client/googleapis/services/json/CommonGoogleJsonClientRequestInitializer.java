package com.google.api.client.googleapis.services.json;

import com.google.api.client.googleapis.services.AbstractGoogleClientRequest;
import com.google.api.client.googleapis.services.CommonGoogleClientRequestInitializer;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class CommonGoogleJsonClientRequestInitializer extends CommonGoogleClientRequestInitializer {

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class Builder extends CommonGoogleClientRequestInitializer.Builder {
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.api.client.googleapis.services.CommonGoogleClientRequestInitializer.Builder
        public Builder self() {
            return this;
        }
    }

    @Deprecated
    public CommonGoogleJsonClientRequestInitializer() {
    }

    @Override // com.google.api.client.googleapis.services.CommonGoogleClientRequestInitializer, com.google.api.client.googleapis.services.GoogleClientRequestInitializer
    public final void initialize(AbstractGoogleClientRequest<?> abstractGoogleClientRequest) {
        super.initialize(abstractGoogleClientRequest);
        initializeJsonRequest((AbstractGoogleJsonClientRequest) abstractGoogleClientRequest);
    }

    @Deprecated
    public CommonGoogleJsonClientRequestInitializer(String str) {
        super(str);
    }

    @Deprecated
    public CommonGoogleJsonClientRequestInitializer(String str, String str2) {
        super(str, str2);
    }

    protected void initializeJsonRequest(AbstractGoogleJsonClientRequest<?> abstractGoogleJsonClientRequest) {
    }
}
