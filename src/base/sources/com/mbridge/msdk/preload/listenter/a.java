package com.mbridge.msdk.preload.listenter;

import com.mbridge.msdk.out.PreloadListener;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class a implements PreloadListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    WeakReference<PreloadListener> f31964a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f31965b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f31966c = false;

    public a(PreloadListener preloadListener) {
        if (preloadListener != null) {
            this.f31964a = new WeakReference<>(preloadListener);
        }
    }

    public boolean a() {
        return this.f31966c;
    }

    @Override // com.mbridge.msdk.out.PreloadListener
    public void onPreloadFaild(String str) {
        WeakReference<PreloadListener> weakReference = this.f31964a;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.f31964a.get().onPreloadFaild(str);
    }

    @Override // com.mbridge.msdk.out.PreloadListener
    public void onPreloadSucceed() {
        WeakReference<PreloadListener> weakReference = this.f31964a;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.f31964a.get().onPreloadSucceed();
    }

    public void a(boolean z10) {
        this.f31966c = z10;
    }
}
