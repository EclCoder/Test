package com.inmobi.media;

import android.content.Context;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class W7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final em.o0 f25927a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final androidx.media3.exoplayer.o f25928b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final hm.v f25929c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Q1 f25930d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f25931e;

    public W7(Context context, em.o0 coroutineScope, androidx.media3.exoplayer.o exoPlayer, boolean z10, hm.v playerEventsFlow) {
        kotlin.jvm.internal.s.h(context, "context");
        kotlin.jvm.internal.s.h(coroutineScope, "coroutineScope");
        kotlin.jvm.internal.s.h(exoPlayer, "exoPlayer");
        kotlin.jvm.internal.s.h(playerEventsFlow, "playerEventsFlow");
        this.f25927a = coroutineScope;
        this.f25928b = exoPlayer;
        this.f25929c = playerEventsFlow;
        Q1 q10 = new Q1(context);
        this.f25930d = q10;
        this.f25931e = z10;
        U7 listener = new U7(this);
        kotlin.jvm.internal.s.h(listener, "listener");
        q10.f25529c = new WeakReference(listener);
    }

    public final void a() {
        this.f25928b.setVolume(0.0f);
        T4.a(this.f25929c, this.f25927a, new S1(0.0f, true));
        this.f25931e = true;
    }
}
