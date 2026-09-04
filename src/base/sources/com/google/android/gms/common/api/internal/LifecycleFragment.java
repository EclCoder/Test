package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.Intent;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public interface LifecycleFragment {
    void addCallback(String str, LifecycleCallback lifecycleCallback);

    <T extends LifecycleCallback> T getCallbackOrNull(String str, Class<T> cls);

    Activity getLifecycleActivity();

    boolean isCreated();

    boolean isStarted();

    void startActivityForResult(Intent intent, int i10);
}
