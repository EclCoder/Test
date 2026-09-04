package com.inmobi.media;

import android.content.Context;
import com.inmobi.media.ads.nativeAd.MediaView;
import qd.qPi.SVWsZyNSAChGIA;

/* JADX INFO: renamed from: com.inmobi.media.tc, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public final class C3325tc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C3348u9 f27541a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public AbstractC3082k2 f27542b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final MediaView f27543c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final B6 f27544d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final hm.v f27545e;

    public final Object a(C6 c10, kotlin.coroutines.jvm.internal.d dVar) {
        C3348u9 c3348u9 = this.f27541a;
        if (c3348u9 != null) {
            c3348u9.a("MediaViewManager", "load called - experienceModel: " + c10);
        }
        return this.f27542b != null ? this.f27543c : em.i.j(em.c1.b(), new C3299sc(this, c10, null), dVar);
    }

    public C3325tc(Context context, em.o0 coroutineScope, C3348u9 c3348u9) {
        kotlin.jvm.internal.s.h(context, SVWsZyNSAChGIA.fFrhZo);
        kotlin.jvm.internal.s.h(coroutineScope, "coroutineScope");
        this.f27541a = c3348u9;
        hm.v vVarB = hm.b0.b(0, 0, null, 7, null);
        this.f27543c = new MediaView(context);
        this.f27544d = new B6(context, coroutineScope, vVarB, c3348u9);
        this.f27545e = vVarB;
    }
}
