package com.android.billingclient.api;

import android.text.TextUtils;
import com.google.android.gms.internal.play_billing.zzc;
import com.google.android.gms.internal.play_billing.zzca;
import com.google.android.gms.internal.play_billing.zzjs;
import java.util.Objects;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
final class y implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ l5.k f10463a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f10464b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ boolean f10465c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ a f10466d;

    y(a aVar, l5.k kVar, String str, boolean z10) {
        this.f10463a = kVar;
        this.f10464b = str;
        this.f10465c = z10;
        Objects.requireNonNull(aVar);
        this.f10466d = aVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        a aVar = this.f10466d;
        if (!aVar.u0(x0.b())) {
            zzjs zzjsVar = zzjs.SERVICE_CONNECTION_NOT_READY;
            c cVar = w0.f10439j;
            aVar.d0(zzjsVar, 9, cVar);
            this.f10463a.a(cVar, zzca.zzk());
            return null;
        }
        String str = this.f10464b;
        if (TextUtils.isEmpty(str)) {
            zzc.zzn("BillingClient", "Please provide a valid product type.");
            zzjs zzjsVar2 = zzjs.EMPTY_PRODUCT_TYPE;
            c cVar2 = w0.f10434e;
            aVar.d0(zzjsVar2, 9, cVar2);
            this.f10463a.a(cVar2, zzca.zzk());
            return null;
        }
        l5.b0 b0VarC0 = aVar.c0(str, this.f10465c, 9);
        if (b0VarC0.b() != null) {
            this.f10463a.a(b0VarC0.a(), b0VarC0.b());
            return null;
        }
        this.f10463a.a(b0VarC0.a(), zzca.zzk());
        return null;
    }
}
