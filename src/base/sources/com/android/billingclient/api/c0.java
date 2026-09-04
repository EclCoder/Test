package com.android.billingclient.api;

import com.google.android.gms.internal.play_billing.zzc;
import com.google.android.gms.internal.play_billing.zzp;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
final class c0 implements l5.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ zzp f10257a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ a f10258b;

    c0(a aVar, zzp zzpVar) {
        this.f10257a = zzpVar;
        Objects.requireNonNull(aVar);
        this.f10258b = aVar;
    }

    @Override // l5.c
    public final void onBillingServiceDisconnected() {
        zzc.zzm("BillingClient", "Reconnection attempt failed.");
        try {
            this.f10257a.zzb(w0.f10439j);
        } catch (Throwable th2) {
            zzc.zzo("BillingClient", "Exception setting completer.", th2);
        }
        a aVar = this.f10258b;
        if (aVar.K != null) {
            aVar.W(new Runnable() { // from class: com.android.billingclient.api.a0
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        this.f10224a.f10258b.K.onBillingServiceDisconnected();
                    } catch (Throwable th3) {
                        zzc.zzo("BillingClient", "Exception calling onBillingServiceDisconnected.", th3);
                    }
                }
            });
        }
    }

    @Override // l5.c
    public final void onBillingSetupFinished(final c cVar) {
        zzc.zzm("BillingClient", "Reconnection finished with result: " + cVar.c());
        try {
            this.f10257a.zzb(cVar);
        } catch (Throwable th2) {
            zzc.zzo("BillingClient", "Exception setting completer.", th2);
        }
        a aVar = this.f10258b;
        if (aVar.K != null) {
            aVar.W(new Runnable() { // from class: com.android.billingclient.api.b0
                @Override // java.lang.Runnable
                public final void run() {
                    c0 c0Var = this.f10248a;
                    try {
                        c0Var.f10258b.K.onBillingSetupFinished(cVar);
                    } catch (Throwable th3) {
                        zzc.zzo("BillingClient", "Exception calling onBillingSetupFinished.", th3);
                    }
                }
            });
        }
    }
}
