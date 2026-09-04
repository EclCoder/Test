package com.android.billingclient.api;

import android.content.Context;
import android.content.IntentFilter;
import com.google.android.gms.internal.play_billing.zzcf;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
final class p1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f10396a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final l5.l f10397b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final v0 f10398c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f10401f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private zzcf f10402g = zzcf.zzk();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final o1 f10399d = new o1(this, true);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final o1 f10400e = new o1(this, false);

    p1(Context context, l5.l lVar, l5.y yVar, l5.n nVar, l5.g gVar, v0 v0Var) {
        this.f10396a = context;
        this.f10397b = lVar;
        this.f10398c = v0Var;
    }

    static /* bridge */ /* synthetic */ l5.g b(p1 p1Var) {
        p1Var.getClass();
        return null;
    }

    static /* bridge */ /* synthetic */ l5.n e(p1 p1Var) {
        p1Var.getClass();
        return null;
    }

    final l5.l d() {
        return this.f10397b;
    }

    final void g() {
        o1 o1Var = this.f10399d;
        Context context = this.f10396a;
        o1Var.c(context);
        this.f10400e.c(context);
    }

    final void h(boolean z10) {
        IntentFilter intentFilter = new IntentFilter("com.android.vending.billing.PURCHASES_UPDATED");
        IntentFilter intentFilter2 = new IntentFilter("com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED");
        intentFilter2.addAction("com.android.vending.billing.ALTERNATIVE_BILLING");
        this.f10401f = z10;
        o1 o1Var = this.f10400e;
        Context context = this.f10396a;
        o1Var.a(context, intentFilter2);
        if (this.f10401f) {
            this.f10399d.b(context, intentFilter, "com.google.android.finsky.permission.PLAY_BILLING_LIBRARY_BROADCAST");
        } else {
            this.f10399d.a(context, intentFilter);
        }
    }

    final void i(zzcf zzcfVar) {
        this.f10402g = zzcfVar;
    }
}
