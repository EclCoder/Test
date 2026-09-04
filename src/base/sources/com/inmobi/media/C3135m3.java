package com.inmobi.media;

import android.os.Handler;
import android.os.Looper;
import com.inmobi.media.C3135m3;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: com.inmobi.media.m3, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class C3135m3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC3213p3 f26971a;

    public C3135m3(InterfaceC3213p3 mEventHandler) {
        kotlin.jvm.internal.s.h(mEventHandler, "mEventHandler");
        this.f26971a = mEventHandler;
    }

    public static final fl.g0 b(V2 v10) {
        A3 a10 = A3.f24440a;
        kotlin.jvm.internal.s.g("A3", "access$getTAG$p(...)");
        String str = v10.f25870b;
        return fl.g0.f38750a;
    }

    public final void a(final V2 click) {
        kotlin.jvm.internal.s.h(click, "click");
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: yh.r9
            @Override // java.lang.Runnable
            public final void run() {
                C3135m3.a(click, this);
            }
        });
    }

    public static final void a(final V2 v10, C3135m3 c3135m3) {
        Re re2 = new Re(v10.f25870b, A3.a(v10), null, null, null, false, 60);
        int pingTimeout = A3.c().getPingTimeout();
        kotlin.jvm.internal.k0 k0Var = new kotlin.jvm.internal.k0();
        Do r10 = new Do(re2, new C3109l3(new AtomicBoolean(false), k0Var, c3135m3, v10), pingTimeout * 1000, new tl.a() { // from class: yh.q9
            @Override // tl.a
            public final Object invoke() {
                return C3135m3.b(v10);
            }
        });
        k0Var.f43597a = r10;
        r10.b();
    }

    public static final void a(AtomicBoolean atomicBoolean, kotlin.jvm.internal.k0 k0Var, C3135m3 c3135m3, V2 v10, boolean z10) {
        if (atomicBoolean.compareAndSet(false, true)) {
            Do r10 = (Do) k0Var.f43597a;
            if (r10 != null) {
                r10.a();
            }
            if (z10) {
                c3135m3.f26971a.a(v10);
            } else {
                c3135m3.f26971a.a(v10, EnumC2931e6.f26453d);
            }
        }
    }
}
