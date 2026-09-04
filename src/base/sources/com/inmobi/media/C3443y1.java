package com.inmobi.media;

import android.app.ActivityManager;
import android.content.Context;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: com.inmobi.media.y1, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class C3443y1 extends AbstractC3422x5 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f27898b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f27899c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f27900d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f27901e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ActivityManager f27902f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final La f27903g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3443y1(Context context, C3447y5 listener, long j10, int i10) {
        super(listener);
        kotlin.jvm.internal.s.h(context, "context");
        kotlin.jvm.internal.s.h(listener, "listener");
        this.f27898b = context;
        this.f27899c = j10;
        this.f27900d = i10;
        this.f27901e = C3443y1.class.getSimpleName();
        Object systemService = context.getSystemService("activity");
        kotlin.jvm.internal.s.f(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
        this.f27902f = (ActivityManager) systemService;
        ConcurrentHashMap concurrentHashMap = La.f25197b;
        this.f27903g = Ka.a(context, "appClose");
    }

    @Override // com.inmobi.media.AbstractC3422x5
    public final void a() {
        AbstractC3488zl.a(new C3418x1(this, null));
    }

    @Override // com.inmobi.media.AbstractC3422x5
    public final void b() {
    }
}
