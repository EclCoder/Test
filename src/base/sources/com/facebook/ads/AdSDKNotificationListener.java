package com.facebook.ads;

import android.os.Bundle;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public interface AdSDKNotificationListener {
    public static final String ENCRYPTED_CPM_KEY = "encrypted_cpm";
    public static final String IMPRESSION_EVENT = "impression";

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    @Retention(RetentionPolicy.SOURCE)
    public @interface SDKEventKey {
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    @Retention(RetentionPolicy.SOURCE)
    public @interface SDKEventType {
    }

    void onAdEvent(String str, Bundle bundle);
}
