package com.android.billingclient.api;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.RemoteException;
import android.text.TextUtils;
import c1.pGX.geAgcEazw;
import com.coremedia.iso.boxes.SubSampleInformationBox;
import com.google.android.gms.internal.play_billing.zzaq;
import com.google.android.gms.internal.play_billing.zzar;
import com.google.android.gms.internal.play_billing.zzbn;
import com.google.android.gms.internal.play_billing.zzc;
import com.google.android.gms.internal.play_billing.zzjj;
import com.google.android.gms.internal.play_billing.zzjl;
import com.google.android.gms.internal.play_billing.zzjn;
import com.google.android.gms.internal.play_billing.zzjp;
import com.google.android.gms.internal.play_billing.zzjq;
import com.google.android.gms.internal.play_billing.zzjs;
import com.google.android.gms.internal.play_billing.zzju;
import com.google.android.gms.internal.play_billing.zzjx;
import com.google.android.gms.internal.play_billing.zzle;
import com.google.android.gms.internal.play_billing.zzlg;
import com.google.android.gms.internal.play_billing.zzlk;
import com.google.android.gms.internal.play_billing.zzll;
import com.google.android.gms.internal.play_billing.zzln;
import com.inmobi.media.core.config.models.CrashConfig;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
final class f0 implements ServiceConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final l5.c f10272a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final zzbn f10273b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final zzbn f10274c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f10275d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ a f10276e;

    /* synthetic */ f0(a aVar, l5.c cVar, int i10, l5.q qVar) {
        Objects.requireNonNull(aVar);
        this.f10276e = aVar;
        this.f10273b = zzbn.zzc(aVar.N);
        this.f10274c = zzbn.zzc(aVar.N);
        this.f10272a = cVar;
        this.f10275d = i10;
    }

    /* JADX WARN: Code duplicated, block: B:152:0x017f A[EDGE_INSN: B:152:0x017f->B:77:0x017f BREAK  A[LOOP:0: B:29:0x00a9->B:74:0x015e], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:56:0x011a  */
    /* JADX WARN: Code duplicated, block: B:72:0x0140  */
    /* JADX WARN: Instruction removed from duplicated block: B:72:0x0140, please report this as an issue */
    public static /* synthetic */ Object a(f0 f0Var) {
        Bundle bundle;
        zzar zzarVar;
        int i10;
        long j10;
        long j11;
        a aVar = f0Var.f10276e;
        synchronized (aVar.f10198a) {
            try {
                if (aVar.f10199b != 3) {
                    int i11 = 0;
                    boolean z10 = true;
                    boolean z11 = aVar.f10199b == 1;
                    if (TextUtils.isEmpty(null)) {
                        bundle = null;
                    } else {
                        bundle = new Bundle();
                        bundle.putString("accountName", null);
                        zzc.zzc(bundle, aVar.f10200c, aVar.f10201d, aVar.M.longValue());
                    }
                    zzjs zzjsVar = zzjs.REASON_UNSPECIFIED;
                    synchronized (aVar.f10198a) {
                        zzarVar = aVar.f10206i;
                    }
                    if (zzarVar != null) {
                        String packageName = f0Var.f10276e.f10204g.getPackageName();
                        try {
                            if (zzarVar.zzb(25, packageName, "inapp") != 0) {
                                Bundle bundle2 = bundle;
                                boolean z12 = z11;
                                int iZzb = 3;
                                int i12 = 29;
                                while (true) {
                                    if (i12 < 3) {
                                        i12 = 0;
                                        break;
                                    }
                                    try {
                                        zzc.zzm("BillingClient", k.a(i12, "trying subs apiVersion: "));
                                        iZzb = bundle2 == null ? zzarVar.zzb(i12, packageName, SubSampleInformationBox.TYPE) : zzarVar.zzc(i12, packageName, SubSampleInformationBox.TYPE, bundle2);
                                        if (iZzb == 0) {
                                            zzc.zzm("BillingClient", k.a(i12, "highestLevelSupportedForSubs: "));
                                            break;
                                        }
                                        i12--;
                                    } catch (Exception e10) {
                                        f0Var.m(e10, z12);
                                        return null;
                                    }
                                }
                                a aVar2 = f0Var.f10276e;
                                aVar2.f10209l = i12 >= 5;
                                if (i12 < 3) {
                                    z10 = false;
                                }
                                aVar2.f10208k = z10;
                                if (i12 < 3) {
                                    zzjsVar = zzjs.SUBSCRIPTIONS_NOT_SUPPORTED;
                                    zzc.zzm("BillingClient", "In-app billing API does not support subscription on this device.");
                                }
                                for (int i13 = 29; i13 >= 3; i13--) {
                                    zzc.zzm("BillingClient", k.a(i13, "trying inapp apiVersion: "));
                                    iZzb = bundle2 == null ? zzarVar.zzb(i13, packageName, "inapp") : zzarVar.zzc(i13, packageName, "inapp", bundle2);
                                    if (iZzb == 0) {
                                        aVar2.f10210m = i13;
                                        zzc.zzm("BillingClient", "mHighestLevelSupportedForInApp: " + aVar2.f10210m);
                                        break;
                                    }
                                }
                                a.S(aVar2, aVar2.f10210m);
                                if (aVar2.f10210m < 3) {
                                    zzjsVar = zzjs.ONE_TIME_PRODUCT_NOT_SUPPORTED;
                                    zzc.zzn("BillingClient", "In-app billing API version 3 is not supported on this device.");
                                }
                                a.U(aVar2, iZzb);
                                if (iZzb == 0) {
                                    f0Var.j(z12, 0);
                                    f0Var.k(w0.f10438i);
                                    return null;
                                }
                                c cVar = w0.f10431b;
                                f0Var.i(cVar, zzjsVar, null, z12, 0);
                                f0Var.k(cVar);
                                return null;
                            }
                            a aVar3 = f0Var.f10276e;
                            long jB = n1.b(aVar3.f10204g);
                            long jC = n1.c(aVar3.f10204g);
                            double dA = n1.a(aVar3.f10204g);
                            boolean z13 = z11;
                            long jD = n1.d(aVar3.f10204g);
                            Exception e11 = null;
                            while (true) {
                                long j12 = i11;
                                if (j12 > jB) {
                                    i10 = i11;
                                    break;
                                }
                                j10 = jC;
                                try {
                                    try {
                                        Boolean boolValueOf = Boolean.valueOf(z13);
                                        Bundle bundle3 = new Bundle();
                                        bundle3.putString("callingPackage", aVar3.f10204g.getPackageName());
                                        j11 = jD;
                                        try {
                                            zzc.zzc(bundle3, aVar3.f10200c, aVar3.f10201d, aVar3.M.longValue());
                                            if (aVar3.G != null && aVar3.G.a()) {
                                                bundle3.putBoolean("enablePendingPurchases", true);
                                            }
                                            if (aVar3.G != null) {
                                                try {
                                                    if (aVar3.G.b()) {
                                                        try {
                                                            bundle3.putBoolean("enablePendingPurchaseForSubscriptions", true);
                                                        } catch (Exception e12) {
                                                            e11 = e12;
                                                            i10 = i11;
                                                            if (j12 == jB) {
                                                                f0Var.l(e11, z13, i10);
                                                                return null;
                                                            }
                                                            zzc.zzo("BillingClient", "Transient error during initialize(), retrying in " + j10 + "ms", e11);
                                                            try {
                                                                Thread.sleep(j10);
                                                                long j13 = j11;
                                                                i11 = i10 + 1;
                                                                jC = (long) Math.min(j10 * dA, j13);
                                                                jD = j13;
                                                                zzarVar = zzarVar;
                                                            } catch (InterruptedException e13) {
                                                                Thread.currentThread().interrupt();
                                                                f0Var.l(e13, z13, i10);
                                                                return null;
                                                            }
                                                        }
                                                    }
                                                } catch (Exception e14) {
                                                    e11 = e14;
                                                }
                                            }
                                            i10 = i11;
                                            try {
                                                try {
                                                    try {
                                                        zzarVar.zzq(25, aVar3.f10204g.getPackageName(), bundle3, new g0(aVar3, f0Var, boolValueOf, i10, null));
                                                        return null;
                                                    } catch (Exception e15) {
                                                        e11 = e15;
                                                        if (j12 == jB) {
                                                            f0Var.l(e11, z13, i10);
                                                            return null;
                                                        }
                                                        zzc.zzo("BillingClient", "Transient error during initialize(), retrying in " + j10 + "ms", e11);
                                                        Thread.sleep(j10);
                                                        long j14 = j11;
                                                        i11 = i10 + 1;
                                                        jC = (long) Math.min(j10 * dA, j14);
                                                        jD = j14;
                                                        zzarVar = zzarVar;
                                                    }
                                                } catch (Exception e16) {
                                                    e11 = e16;
                                                    if (j12 == jB) {
                                                        f0Var.l(e11, z13, i10);
                                                        return null;
                                                    }
                                                    zzc.zzo("BillingClient", "Transient error during initialize(), retrying in " + j10 + "ms", e11);
                                                    Thread.sleep(j10);
                                                    long j15 = j11;
                                                    i11 = i10 + 1;
                                                    jC = (long) Math.min(j10 * dA, j15);
                                                    jD = j15;
                                                    zzarVar = zzarVar;
                                                }
                                            } catch (SecurityException e17) {
                                                e = e17;
                                                f0Var.l(e, z13, i10);
                                                return null;
                                            }
                                        } catch (Exception e18) {
                                            e11 = e18;
                                            i10 = i11;
                                        }
                                    } catch (SecurityException e19) {
                                        e = e19;
                                        i10 = i11;
                                    }
                                } catch (Exception e20) {
                                    e11 = e20;
                                    i10 = i11;
                                    j11 = jD;
                                }
                                long j16 = j11;
                                i11 = i10 + 1;
                                jC = (long) Math.min(j10 * dA, j16);
                                jD = j16;
                                zzarVar = zzarVar;
                            }
                            f0Var.l(e11, z13, i10);
                            return null;
                        } catch (Exception e21) {
                            f0Var.m(e21, z11);
                            return null;
                        }
                    }
                    a aVar4 = f0Var.f10276e;
                    aVar4.p0(0);
                    int i14 = f0Var.f10275d;
                    zzjs zzjsVar2 = zzjs.SERVICE_RESET_TO_NULL;
                    c cVar2 = w0.f10439j;
                    aVar4.o0(zzjsVar2, cVar2, i14);
                    f0Var.k(cVar2);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return null;
    }

    public static /* synthetic */ void b(f0 f0Var) {
        a aVar = f0Var.f10276e;
        aVar.p0(0);
        zzjs zzjsVar = zzjs.EXECUTE_ASYNC_TIMEOUT;
        c cVar = w0.f10440k;
        aVar.o0(zzjsVar, cVar, f0Var.f10275d);
        f0Var.k(cVar);
    }

    private final Long h(boolean z10) {
        try {
            if (z10) {
                synchronized (this.f10276e.f10198a) {
                    try {
                        zzbn zzbnVar = this.f10273b;
                        if (!zzbnVar.zzg()) {
                            return null;
                        }
                        zzbnVar.zzf();
                        return Long.valueOf(zzbnVar.zza(TimeUnit.MILLISECONDS));
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
            synchronized (this.f10276e.f10198a) {
                try {
                    zzbn zzbnVar2 = this.f10274c;
                    if (!zzbnVar2.zzg()) {
                        return null;
                    }
                    zzbnVar2.zzf();
                    return Long.valueOf(zzbnVar2.zza(TimeUnit.MILLISECONDS));
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        } catch (Throwable th4) {
            zzc.zzo("BillingClient", "Exception getting connection establishment duration.", th4);
        }
        zzc.zzo("BillingClient", "Exception getting connection establishment duration.", th4);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void j(boolean z10, int i10) {
        try {
            Long lH = h(z10);
            if (!z10) {
                zzle zzleVarZza = zzlg.zza();
                zzjq zzjqVarZza = zzju.zza();
                zzjqVarZza.zzp(0);
                zzjqVarZza.zzc(i10);
                zzleVarZza.zza(zzjqVarZza);
                if (lH != null) {
                    zzleVarZza.zzb(lH.longValue());
                }
                this.f10276e.f10205h.a((zzlg) zzleVarZza.zzi());
                return;
            }
            zzjn zzjnVarZza = zzjp.zza();
            zzjnVarZza.zze(6);
            zzll zzllVarZza = zzln.zza();
            int i11 = this.f10275d;
            zzllVarZza.zza(i11 > 0);
            zzllVarZza.zzb(i11);
            zzllVarZza.zzd(i10);
            if (lH != null) {
                zzllVarZza.zzc(lH.longValue());
            }
            a aVar = this.f10276e;
            zzjnVarZza.zzd(zzllVarZza);
            aVar.n0((zzjp) zzjnVarZza.zzi());
        } catch (Throwable th2) {
            zzc.zzo("BillingClient", "Unable to log.", th2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void k(c cVar) {
        a aVar = this.f10276e;
        synchronized (aVar.f10198a) {
            try {
                if (aVar.f10199b == 3) {
                    return;
                }
                try {
                    this.f10272a.onBillingSetupFinished(cVar);
                } catch (Throwable th2) {
                    zzc.zzo("BillingClient", "Exception while calling onBillingSetupFinished.", th2);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    private final void l(Exception exc, boolean z10, int i10) {
        zzjs zzjsVar;
        zzc.zzo("BillingClient", "Exception while invoking initialize AIDL method", exc);
        if (exc instanceof DeadObjectException) {
            zzjsVar = zzjs.INITIALIZE_DEAD_OBJECT_EXCEPTION;
        } else if (exc instanceof RemoteException) {
            zzjsVar = zzjs.INITIALIZE_REMOTE_EXCEPTION;
        } else {
            zzjsVar = exc instanceof SecurityException ? zzjs.INITIALIZE_SECURITY_EXCEPTION : zzjs.INITIALIZE_SERVICE_CALL_EXCEPTION;
        }
        zzjs zzjsVar2 = zzjsVar;
        String strA = u0.a(exc);
        this.f10276e.p0(0);
        i(a.H0(exc), zzjsVar2, strA, z10, i10);
        k(a.H0(exc));
    }

    private final void m(Exception exc, boolean z10) {
        zzjs zzjsVar;
        zzc.zzo("BillingClient", "Exception while checking if billing is supported; try to reconnect", exc);
        if (exc instanceof DeadObjectException) {
            zzjsVar = zzjs.zzaM;
        } else if (exc instanceof RemoteException) {
            zzjsVar = zzjs.IS_BILLING_SUPPORTED_REMOTE_EXCEPTION;
        } else {
            zzjsVar = exc instanceof SecurityException ? zzjs.IS_BILLING_SUPPORTED_SECURITY_EXCEPTION : zzjs.IS_BILLING_SUPPORTED_SERVICE_CALL_EXCEPTION;
        }
        zzjs zzjsVar2 = zzjsVar;
        String strA = zzjsVar2.equals(zzjs.IS_BILLING_SUPPORTED_SERVICE_CALL_EXCEPTION) ? u0.a(exc) : null;
        this.f10276e.p0(0);
        i(a.H0(exc), zzjsVar2, strA, z10, 0);
        k(a.H0(exc));
    }

    public final void f() {
        synchronized (this.f10276e.f10198a) {
            zzbn zzbnVar = this.f10273b;
            zzbnVar.zzd();
            zzbnVar.zze();
        }
    }

    final boolean g() {
        return this.f10275d > 0;
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        zzc.zzn("BillingClient", "Billing service died.");
        try {
            a aVar = this.f10276e;
            if (a.Y(aVar)) {
                v0 v0Var = aVar.f10205h;
                zzjj zzjjVarZza = zzjl.zza();
                zzjjVarZza.zzp(6);
                zzjq zzjqVarZza = zzju.zza();
                zzjqVarZza.zze(zzjs.BINDING_DIED);
                zzjjVarZza.zzb(zzjqVarZza);
                zzll zzllVarZza = zzln.zza();
                int i10 = this.f10275d;
                zzllVarZza.zza(i10 > 0);
                zzllVarZza.zzb(i10);
                zzjjVarZza.zze(zzllVarZza);
                v0Var.m((zzjl) zzjjVarZza.zzi());
            } else {
                aVar.f10205h.b(zzjx.zzb());
            }
        } catch (Throwable th2) {
            zzc.zzo("BillingClient", "Unable to log.", th2);
        }
        a aVar2 = this.f10276e;
        synchronized (aVar2.f10198a) {
            if (aVar2.f10199b != 3 && aVar2.f10199b != 0) {
                aVar2.p0(0);
                aVar2.s0();
                try {
                    this.f10272a.onBillingServiceDisconnected();
                } catch (Throwable th3) {
                    zzc.zzo("BillingClient", "Exception while calling onBillingServiceDisconnected.", th3);
                }
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        zzc.zzm("BillingClient", "Billing service connected.");
        a aVar = this.f10276e;
        synchronized (aVar.f10198a) {
            try {
                if (aVar.f10199b == 3) {
                    return;
                }
                aVar.f10206i = zzaq.zzu(iBinder);
                if (a.o(new Callable() { // from class: com.android.billingclient.api.d0
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        f0.a(this.f10262a);
                        return null;
                    }
                }, CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL, new Runnable() { // from class: com.android.billingclient.api.e0
                    @Override // java.lang.Runnable
                    public final void run() {
                        f0.b(this.f10266a);
                    }
                }, aVar.x(), aVar.n()) == null) {
                    int i10 = this.f10275d;
                    c cVarA = aVar.A();
                    aVar.o0(zzjs.MISSING_RESULT_FROM_EXECUTE_ASYNC, cVarA, i10);
                    k(cVarA);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        zzc.zzn("BillingClient", "Billing service disconnected.");
        try {
            a aVar = this.f10276e;
            if (a.Y(aVar)) {
                v0 v0Var = aVar.f10205h;
                zzjj zzjjVarZza = zzjl.zza();
                zzjjVarZza.zzp(6);
                zzjq zzjqVarZza = zzju.zza();
                zzjqVarZza.zze(zzjs.SERVICE_DISCONNECTED);
                zzjjVarZza.zzb(zzjqVarZza);
                zzll zzllVarZza = zzln.zza();
                int i10 = this.f10275d;
                zzllVarZza.zza(i10 > 0);
                zzllVarZza.zzb(i10);
                zzjjVarZza.zze(zzllVarZza);
                v0Var.m((zzjl) zzjjVarZza.zzi());
            } else {
                aVar.f10205h.d(zzlk.zzb());
            }
        } catch (Throwable th2) {
            zzc.zzo("BillingClient", "Unable to log.", th2);
        }
        a aVar2 = this.f10276e;
        synchronized (aVar2.f10198a) {
            try {
                if (x0.i()) {
                    if (aVar2.f10199b != 3 && aVar2.f10199b != 0) {
                        zzbn zzbnVar = this.f10274c;
                        zzbnVar.zzd();
                        zzbnVar.zze();
                    }
                    return;
                }
                zzbn zzbnVar2 = this.f10274c;
                zzbnVar2.zzd();
                zzbnVar2.zze();
                if (aVar2.f10199b == 3) {
                    return;
                }
                aVar2.p0(0);
                try {
                    this.f10272a.onBillingServiceDisconnected();
                } catch (Throwable th3) {
                    zzc.zzo("BillingClient", "Exception while calling onBillingServiceDisconnected.", th3);
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void i(c cVar, zzjs zzjsVar, String str, boolean z10, int i10) {
        boolean z11;
        try {
            zzjq zzjqVarZza = zzju.zza();
            zzjqVarZza.zzp(cVar.c());
            zzjqVarZza.zzb(cVar.a());
            zzjqVarZza.zze(zzjsVar);
            zzjqVarZza.zzc(i10);
            if (str != null) {
                zzjqVarZza.zza(str);
            }
            Long lH = h(z10);
            if (z10) {
                zzll zzllVarZza = zzln.zza();
                int i11 = this.f10275d;
                if (i11 > 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                zzllVarZza.zza(z11);
                zzllVarZza.zzb(i11);
                zzllVarZza.zzd(i10);
                if (lH != null) {
                    zzllVarZza.zzc(lH.longValue());
                }
                a aVar = this.f10276e;
                zzjj zzjjVarZza = zzjl.zza();
                zzjjVarZza.zzb(zzjqVarZza);
                zzjjVarZza.zzp(6);
                zzjjVarZza.zze(zzllVarZza);
                aVar.l0((zzjl) zzjjVarZza.zzi());
                return;
            }
            zzle zzleVarZza = zzlg.zza();
            zzleVarZza.zza(zzjqVarZza);
            if (lH != null) {
                zzleVarZza.zzb(lH.longValue());
            }
            this.f10276e.f10205h.a((zzlg) zzleVarZza.zzi());
        } catch (Throwable th2) {
            zzc.zzo(geAgcEazw.RcJNvJHZg, "Unable to log.", th2);
        }
    }
}
