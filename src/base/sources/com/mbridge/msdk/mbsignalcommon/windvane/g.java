package com.mbridge.msdk.mbsignalcommon.windvane;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected Context f31723a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected Object f31724b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected WindVaneWebView f31725c;

    public void initialize(Context context, WindVaneWebView windVaneWebView) {
        this.f31723a = context;
        this.f31725c = windVaneWebView;
    }

    public void initialize(Object obj, WindVaneWebView windVaneWebView) {
        this.f31724b = obj;
        this.f31725c = windVaneWebView;
    }
}
