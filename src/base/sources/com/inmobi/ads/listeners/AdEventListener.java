package com.inmobi.ads.listeners;

import com.inmobi.ads.AdMetaInfo;
import com.inmobi.ads.InMobiAdRequestStatus;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AdEventListener<T> {
    public void onAdImpression(T t10) {
    }

    public void onRequestPayloadCreated(byte[] bArr) {
    }

    public void onRequestPayloadCreationFailed(InMobiAdRequestStatus inMobiAdRequestStatus) {
    }

    public void onAdClicked(T t10, Map<Object, Object> map) {
    }

    public void onAdFetchSuccessful(T t10, AdMetaInfo adMetaInfo) {
    }

    public void onAdLoadFailed(T t10, InMobiAdRequestStatus inMobiAdRequestStatus) {
    }

    public void onAdLoadSucceeded(T t10, AdMetaInfo adMetaInfo) {
    }
}
