package com.inmobi.media;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.inmobi.ads.InMobiBanner;

/* JADX INFO: renamed from: com.inmobi.media.d2, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class HandlerC2902d2 extends Handler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InMobiBanner f26385a;

    /* JADX WARN: Illegal instructions before constructor call */
    public HandlerC2902d2(InMobiBanner mInmobiBanner) {
        kotlin.jvm.internal.s.h(mInmobiBanner, "mInmobiBanner");
        Looper looper = Looper.getMainLooper();
        kotlin.jvm.internal.s.g(looper, "getMainLooper(...)");
        kotlin.jvm.internal.s.h(mInmobiBanner, "mInmobiBanner");
        kotlin.jvm.internal.s.h(looper, "looper");
        super(looper);
        this.f26385a = mInmobiBanner;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message msg) {
        kotlin.jvm.internal.s.h(msg, "msg");
        if (msg.what == 1) {
            this.f26385a.refreshBanner$media_release();
        } else {
            kotlin.jvm.internal.s.g("d2", "TAG");
        }
    }
}
