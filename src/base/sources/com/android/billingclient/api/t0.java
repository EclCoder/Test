package com.android.billingclient.api;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import com.google.android.gms.internal.play_billing.zzba;
import com.google.android.gms.internal.play_billing.zzc;
import com.google.android.gms.internal.play_billing.zzdf;
import com.google.android.gms.internal.play_billing.zzdk;
import com.google.android.gms.internal.play_billing.zzjl;
import com.google.android.gms.internal.play_billing.zzjp;
import com.google.android.gms.internal.play_billing.zzjs;
import com.google.android.gms.internal.play_billing.zzjz;
import com.google.android.gms.internal.play_billing.zzp;
import com.google.android.gms.internal.play_billing.zzr;
import com.google.android.gms.internal.play_billing.zzu;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
final class t0 extends a {
    private final Context O;
    private volatile int P;
    private volatile zzba Q;
    private volatile s0 R;
    private volatile ScheduledExecutorService S;

    t0(String str, Context context, v0 v0Var, ExecutorService executorService, BillingClient.Builder builder) {
        super(null, context, null, null, builder);
        this.P = 0;
        this.O = context;
    }

    public static /* synthetic */ Object d1(t0 t0Var, int i10, zzp zzpVar) {
        String str;
        try {
            if (t0Var.Q == null) {
                throw null;
            }
            zzba zzbaVar = t0Var.Q;
            String packageName = t0Var.O.getPackageName();
            if (i10 == 2) {
                str = "LAUNCH_BILLING_FLOW";
            } else if (i10 == 3) {
                str = "ACKNOWLEDGE_PURCHASE";
            } else if (i10 == 4) {
                str = "CONSUME_ASYNC";
            } else if (i10 != 5) {
                str = i10 != 6 ? "QUERY_PRODUCT_DETAILS_ASYNC" : "START_CONNECTION";
            } else {
                str = "IS_FEATURE_SUPPORTED";
            }
            zzbaVar.zza(packageName, str, new r0(zzpVar));
            return "billingOverrideService.getBillingOverride";
        } catch (Exception e10) {
            t0Var.n1(zzjs.zzaQ, 28, w0.F);
            zzc.zzo("BillingClientTesting", "An error occurred while retrieving billing override.", e10);
            zzpVar.zzb(0);
            return "billingOverrideService.getBillingOverride";
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final int g1(zzdk zzdkVar) {
        try {
            return ((Integer) zzdkVar.get(28500L, TimeUnit.MILLISECONDS)).intValue();
        } catch (TimeoutException e10) {
            n1(zzjs.BILLING_OVERRIDE_SERVICE_CALL_TIMEOUT, 28, w0.F);
            zzc.zzo("BillingClientTesting", "Asynchronous call to Billing Override Service timed out.", e10);
            return 0;
        } catch (Exception e11) {
            if (e11 instanceof InterruptedException) {
                Thread.currentThread().interrupt();
            }
            n1(zzjs.zzaQ, 28, w0.F);
            zzc.zzo("BillingClientTesting", "An error occurred while retrieving billing override.", e11);
            return 0;
        }
    }

    private final synchronized ScheduledExecutorService h1() {
        try {
            if (this.S == null) {
                this.S = Executors.newSingleThreadScheduledExecutor();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.S;
    }

    private final synchronized void i1() {
        o1(27);
        try {
            try {
                l5.t tVar = null;
                if (this.R != null && this.Q != null) {
                    zzc.zzm("BillingClientTesting", "Unbinding from Billing Override Service.");
                    this.O.unbindService(this.R);
                    this.R = new s0(this, tVar);
                }
                this.Q = null;
                if (this.S != null) {
                    this.S.shutdownNow();
                    this.S = null;
                }
            } catch (RuntimeException e10) {
                zzc.zzo("BillingClientTesting", "There was an exception while ending Billing Override Service connection!", e10);
            }
            this.P = 3;
        } catch (Throwable th2) {
            this.P = 3;
            throw th2;
        }
    }

    private final synchronized void j1() {
        if (b1()) {
            zzc.zzm("BillingClientTesting", "Billing Override Service connection is valid. No need to re-initialize.");
            o1(26);
            return;
        }
        if (this.P == 1) {
            zzc.zzn("BillingClientTesting", "Client is already in the process of connecting to Billing Override Service.");
            return;
        }
        if (this.P == 3) {
            zzc.zzn("BillingClientTesting", "Billing Override Service Client was already closed and can't be reused. Please create another instance.");
            n1(zzjs.BILLING_CLIENT_CLOSED, 26, w0.a(-1, "Billing Override Service connection is disconnected."));
            return;
        }
        this.P = 1;
        zzc.zzm("BillingClientTesting", "Starting Billing Override Service setup.");
        this.R = new s0(this, null);
        Intent intent = new Intent("com.google.android.apps.play.billingtestcompanion.BillingOverrideService.BIND");
        intent.setPackage("com.google.android.apps.play.billingtestcompanion");
        Context context = this.O;
        List<ResolveInfo> listQueryIntentServices = context.getPackageManager().queryIntentServices(intent, 0);
        zzjs zzjsVar = zzjs.REASON_UNSPECIFIED;
        if (listQueryIntentServices == null || listQueryIntentServices.isEmpty()) {
            zzjsVar = zzjs.INTENT_SERVICE_NOT_FOUND;
        } else {
            ServiceInfo serviceInfo = listQueryIntentServices.get(0).serviceInfo;
            if (serviceInfo != null) {
                String str = serviceInfo.packageName;
                String str2 = serviceInfo.name;
                if (!Objects.equals(str, "com.google.android.apps.play.billingtestcompanion") || str2 == null) {
                    zzjsVar = zzjs.BILLING_SERVICE_BLOCKED;
                    zzc.zzn("BillingClientTesting", "The device doesn't have valid Play Billing Lab.");
                } else {
                    ComponentName componentName = new ComponentName(str, str2);
                    Intent intent2 = new Intent(intent);
                    intent2.setComponent(componentName);
                    if (context.bindService(intent2, this.R, 1)) {
                        zzc.zzm("BillingClientTesting", "Billing Override Service was bonded successfully.");
                        return;
                    } else {
                        zzjsVar = zzjs.BILLING_SERVICE_BLOCKED;
                        zzc.zzn("BillingClientTesting", "Connection to Billing Override Service is blocked.");
                    }
                }
            }
        }
        this.P = 0;
        zzc.zzm("BillingClientTesting", "Billing Override Service unavailable on device.");
        n1(zzjsVar, 26, w0.a(2, "Billing Override Service unavailable on device."));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean k1(int i10) {
        return i10 > 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final c l1(int i10, int i11) {
        c cVarA = w0.a(i11, "Billing override value was set by a license tester.");
        n1(zzjs.LICENSE_TESTER_BILLING_OVERRIDE, i10, cVarA);
        return cVarA;
    }

    private final zzdk m1(final int i10) {
        if (b1()) {
            return zzu.zza(new zzr() { // from class: com.android.billingclient.api.m0
                @Override // com.google.android.gms.internal.play_billing.zzr
                public final Object zza(zzp zzpVar) {
                    return t0.d1(this.f10372a, i10, zzpVar);
                }
            });
        }
        zzc.zzn("BillingClientTesting", "Billing Override Service is not ready.");
        n1(zzjs.BILLING_OVERRIDE_SERVICE_CONNECTION_NOT_READY, 28, w0.a(-1, "Billing Override Service connection is disconnected."));
        return zzdf.zza(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void n1(zzjs zzjsVar, int i10, c cVar) {
        int i11 = u0.f10422a;
        zzjl zzjlVarB = u0.b(zzjsVar, i10, cVar, null, zzjz.BROADCAST_ACTION_UNSPECIFIED);
        Objects.requireNonNull(zzjlVarB, "ApiFailure should not be null");
        F0().m(zzjlVarB);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void o1(int i10) {
        int i11 = u0.f10422a;
        zzjp zzjpVarC = u0.c(i10, zzjz.BROADCAST_ACTION_UNSPECIFIED);
        Objects.requireNonNull(zzjpVarC, "ApiSuccess should not be null");
        F0().h(zzjpVarC);
    }

    private final void p1(int i10, m0.a aVar, Runnable runnable) {
        zzdf.zzc(zzdf.zzb(m1(i10), 28500L, TimeUnit.MILLISECONDS, h1()), new q0(this, i10, aVar, runnable), n());
    }

    @Override // com.android.billingclient.api.a, com.android.billingclient.api.BillingClient
    public final void a(final l5.a aVar, final l5.b bVar) {
        Objects.requireNonNull(bVar);
        p1(3, new m0.a() { // from class: l5.s
            @Override // m0.a
            public final void accept(Object obj) {
                bVar.a((com.android.billingclient.api.c) obj);
            }
        }, new Runnable() { // from class: com.android.billingclient.api.n0
            @Override // java.lang.Runnable
            public final void run() {
                super/*com.android.billingclient.api.a*/.a(aVar, bVar);
            }
        });
    }

    @Override // com.android.billingclient.api.a, com.android.billingclient.api.BillingClient
    public final void b(final l5.d dVar, final l5.e eVar) {
        p1(4, new m0.a() { // from class: l5.r
            @Override // m0.a
            public final void accept(Object obj) {
                eVar.a((com.android.billingclient.api.c) obj, dVar.a());
            }
        }, new Runnable() { // from class: com.android.billingclient.api.l0
            @Override // java.lang.Runnable
            public final void run() {
                super/*com.android.billingclient.api.a*/.b(dVar, eVar);
            }
        });
    }

    public final synchronized boolean b1() {
        return (this.P != 2 || this.Q == null || this.R == null) ? false : true;
    }

    @Override // com.android.billingclient.api.a, com.android.billingclient.api.BillingClient
    public final void c() {
        i1();
        super.c();
    }

    @Override // com.android.billingclient.api.a, com.android.billingclient.api.BillingClient
    public final c d(final Activity activity, final b bVar) {
        m0.a aVar = new m0.a() { // from class: com.android.billingclient.api.o0
            @Override // m0.a
            public final void accept(Object obj) {
                super/*com.android.billingclient.api.a*/.I0((c) obj);
            }
        };
        Callable callable = new Callable() { // from class: com.android.billingclient.api.p0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return super/*com.android.billingclient.api.a*/.d(activity, bVar);
            }
        };
        int iG1 = g1(m1(2));
        if (k1(iG1)) {
            c cVarL1 = l1(2, iG1);
            aVar.accept(cVarL1);
            return cVarL1;
        }
        try {
            return (c) callable.call();
        } catch (Exception e10) {
            zzjs zzjsVar = zzjs.BILLING_OVERRIDE_SERVICE_FALLBACK_ERROR;
            c cVar = w0.f10437h;
            n1(zzjsVar, 2, cVar);
            zzc.zzo("BillingClientTesting", "An internal error occurred.", e10);
            return cVar;
        }
    }

    @Override // com.android.billingclient.api.a, com.android.billingclient.api.BillingClient
    public final void f(final h hVar, final l5.i iVar) {
        p1(7, new m0.a() { // from class: com.android.billingclient.api.j0
            @Override // m0.a
            public final void accept(Object obj) {
                i iVar2 = new i(new ArrayList(), new ArrayList());
                iVar.d((c) obj, iVar2);
            }
        }, new Runnable() { // from class: com.android.billingclient.api.k0
            @Override // java.lang.Runnable
            public final void run() {
                super/*com.android.billingclient.api.a*/.f(hVar, iVar);
            }
        });
    }

    @Override // com.android.billingclient.api.a, com.android.billingclient.api.BillingClient
    public final void i(l5.c cVar) {
        j1();
        super.i(cVar);
    }

    t0(String str, f fVar, Context context, l5.y yVar, v0 v0Var, ExecutorService executorService, BillingClient.Builder builder) {
        super((String) null, fVar, context, (l5.y) null, (v0) null, (ExecutorService) null, builder);
        this.P = 0;
        this.O = context;
    }

    t0(String str, f fVar, Context context, l5.l lVar, v0 v0Var, ExecutorService executorService, BillingClient.Builder builder) {
        super((String) null, fVar, context, lVar, (v0) null, (ExecutorService) null, builder);
        this.P = 0;
        this.O = context;
    }
}
