package com.inmobi.media;

import android.content.Context;
import com.inmobi.adquality.models.AdQualityResult;
import com.inmobi.media.A0;
import com.inmobi.media.core.config.models.AdConfig;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class A0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f24425a = new AtomicBoolean(false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f24426b = new AtomicBoolean(false);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f24427c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C3467z0 f24428d = new C3467z0(this);

    public A0() {
        Runnable runnable = new Runnable() { // from class: yh.b
            @Override // java.lang.Runnable
            public final void run() {
                A0.a(this.f57607a);
            }
        };
        Context context = Xi.f26021a;
        kotlin.jvm.internal.s.h(runnable, "runnable");
        Xi.f26027g.submit(runnable);
    }

    public static final void a(A0 a10) {
        H0 h10 = (H0) E0.f24683a.getValue();
        C3467z0 listener = a10.f24428d;
        h10.getClass();
        kotlin.jvm.internal.s.h(listener, "listener");
        h10.f24906b = new WeakReference(listener);
    }

    public static final fl.g0 b(A0 a10) {
        a10.f24425a.set(true);
        C3136m4 c3136m4 = AbstractC2878c4.f26300a;
        kotlin.jvm.internal.s.h(AdConfig.class, "clazz");
        em.k.d(H9.f24930c, null, null, new C3442y0(a10, (AdConfig) AbstractC2878c4.f26300a.a(AdConfig.class), null), 3, null);
        return fl.g0.f38750a;
    }

    public final void a() {
        AbstractC2899d.a(new tl.a() { // from class: yh.a
            @Override // tl.a
            public final Object invoke() {
                return A0.b(this.f57587a);
            }
        });
    }

    public static void a(AdQualityResult result) {
        kotlin.jvm.internal.s.h(result, "result");
        try {
            em.j.b(null, new C3417x0(result, null), 1, null);
            if (result.getImageLocation().length() == 0) {
                return;
            }
            new File(result.getImageLocation()).delete();
        } catch (Exception unused) {
        }
    }
}
