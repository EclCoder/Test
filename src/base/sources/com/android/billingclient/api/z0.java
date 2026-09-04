package com.android.billingclient.api;

import android.content.Context;
import com.google.android.gms.internal.play_billing.zzc;
import com.google.android.gms.internal.play_billing.zzkw;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
final class z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f10470a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private a9.h f10471b;

    z0(Context context) {
        try {
            c9.u.f(context);
            this.f10471b = c9.u.c().g(com.google.android.datatransport.cct.a.f16385g).a("PLAY_BILLING_LIBRARY", zzkw.class, a9.b.b("proto"), new a9.g() { // from class: l5.x
                @Override // a9.g
                public final Object apply(Object obj) {
                    return ((zzkw) obj).zzQ();
                }
            });
        } catch (Throwable unused) {
            this.f10470a = true;
        }
    }

    public final void a(zzkw zzkwVar) {
        if (this.f10470a) {
            zzc.zzn("BillingLogger", "Skipping logging since initialization failed.");
            return;
        }
        try {
            this.f10471b.b(a9.c.f(zzkwVar));
        } catch (Throwable unused) {
            zzc.zzn("BillingLogger", "logging failed.");
        }
    }
}
