package com.android.billingclient.api;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.google.android.gms.internal.play_billing.zzaz;
import com.google.android.gms.internal.play_billing.zzc;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
final class s0 implements ServiceConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ t0 f10415a;

    /* synthetic */ s0(t0 t0Var, l5.t tVar) {
        Objects.requireNonNull(t0Var);
        this.f10415a = t0Var;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        zzc.zzm("BillingClientTesting", "Billing Override Service connected.");
        t0 t0Var = this.f10415a;
        t0Var.Q = zzaz.zzb(iBinder);
        t0Var.P = 2;
        t0Var.o1(26);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        zzc.zzn("BillingClientTesting", "Billing Override Service disconnected.");
        t0 t0Var = this.f10415a;
        t0Var.Q = null;
        t0Var.P = 0;
    }
}
