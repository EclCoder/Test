package com.android.billingclient.api;

import com.google.android.gms.internal.play_billing.zzc;
import com.google.android.gms.internal.play_billing.zzdd;
import com.google.android.gms.internal.play_billing.zzjs;
import java.util.Objects;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
final class q0 implements zzdd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ m0.a f10405a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ Runnable f10406b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ t0 f10407c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ int f10408d;

    q0(t0 t0Var, int i10, m0.a aVar, Runnable runnable) {
        this.f10408d = i10;
        this.f10405a = aVar;
        this.f10406b = runnable;
        Objects.requireNonNull(t0Var);
        this.f10407c = t0Var;
    }

    @Override // com.google.android.gms.internal.play_billing.zzdd
    public final void zza(Throwable th2) {
        if (th2 instanceof TimeoutException) {
            this.f10407c.n1(zzjs.BILLING_OVERRIDE_SERVICE_CALL_TIMEOUT, 28, w0.F);
            zzc.zzo("BillingClientTesting", "Asynchronous call to Billing Override Service timed out.", th2);
        } else {
            this.f10407c.n1(zzjs.zzaQ, 28, w0.F);
            zzc.zzo("BillingClientTesting", "An error occurred while retrieving billing override.", th2);
        }
        this.f10406b.run();
    }

    @Override // com.google.android.gms.internal.play_billing.zzdd
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        Integer num = (Integer) obj;
        int iIntValue = num.intValue();
        t0 t0Var = this.f10407c;
        if (!t0.k1(iIntValue)) {
            this.f10406b.run();
        } else {
            this.f10405a.accept(t0Var.l1(this.f10408d, num.intValue()));
        }
    }
}
