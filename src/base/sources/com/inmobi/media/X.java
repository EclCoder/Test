package com.inmobi.media;

import android.os.SystemClock;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class X {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C2874c0 f25986a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C3132m0 f25987b;

    public X(C2874c0 adLifecycleData, C3132m0 adManagerTelemetryHelper) {
        kotlin.jvm.internal.s.h(adLifecycleData, "adLifecycleData");
        kotlin.jvm.internal.s.h(adManagerTelemetryHelper, "adManagerTelemetryHelper");
        this.f25986a = adLifecycleData;
        this.f25987b = adManagerTelemetryHelper;
    }

    public final void a(W adFetchEvent) {
        kotlin.jvm.internal.s.h(adFetchEvent, "adFetchEvent");
        if (adFetchEvent instanceof C3195ob) {
            C2874c0 c2874c0 = this.f25986a;
            c2874c0.getClass();
            c2874c0.f26288b = SystemClock.elapsedRealtime();
        } else if (adFetchEvent instanceof Qf) {
            C2874c0 c2874c1 = this.f25986a;
            c2874c1.getClass();
            c2874c1.f26292f = SystemClock.elapsedRealtime();
        } else {
            if (!(adFetchEvent instanceof C2893cj)) {
                throw new NoWhenBranchMatchedException();
            }
            C3132m0 c3132m0 = this.f25987b;
            Map payload = ((C2893cj) adFetchEvent).f26352a;
            c3132m0.getClass();
            kotlin.jvm.internal.s.h(payload, "payload");
            em.k.d(c3132m0.f26967a, null, null, new C3080k0(c3132m0, payload, null), 3, null);
        }
    }
}
