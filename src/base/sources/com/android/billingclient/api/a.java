package com.android.billingclient.api;

import android.R;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.ResultReceiver;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.adsdk.ugeno.dkl.Rmg.PvZsvNiPV;
import com.bytedance.sdk.component.dkl.hnj.gjv.hn.imh.UHbHibBvYxKnPE;
import com.coremedia.iso.boxes.SubSampleInformationBox;
import com.google.android.gms.internal.play_billing.zza;
import com.google.android.gms.internal.play_billing.zzar;
import com.google.android.gms.internal.play_billing.zzbf;
import com.google.android.gms.internal.play_billing.zzbn;
import com.google.android.gms.internal.play_billing.zzbq;
import com.google.android.gms.internal.play_billing.zzc;
import com.google.android.gms.internal.play_billing.zzca;
import com.google.android.gms.internal.play_billing.zzcf;
import com.google.android.gms.internal.play_billing.zzcg;
import com.google.android.gms.internal.play_billing.zzdf;
import com.google.android.gms.internal.play_billing.zzdk;
import com.google.android.gms.internal.play_billing.zzjj;
import com.google.android.gms.internal.play_billing.zzjl;
import com.google.android.gms.internal.play_billing.zzjn;
import com.google.android.gms.internal.play_billing.zzjp;
import com.google.android.gms.internal.play_billing.zzjq;
import com.google.android.gms.internal.play_billing.zzjs;
import com.google.android.gms.internal.play_billing.zzju;
import com.google.android.gms.internal.play_billing.zzjz;
import com.google.android.gms.internal.play_billing.zzke;
import com.google.android.gms.internal.play_billing.zzkg;
import com.google.android.gms.internal.play_billing.zzll;
import com.google.android.gms.internal.play_billing.zzln;
import com.google.android.gms.internal.play_billing.zzp;
import com.google.android.gms.internal.play_billing.zzr;
import com.google.android.gms.internal.play_billing.zzu;
import com.inmobi.media.core.config.models.CrashConfig;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
class a extends BillingClient {
    private boolean A;
    private boolean B;
    private boolean C;
    private boolean D;
    private boolean E;
    private boolean F;
    private f G;
    private boolean H;
    private boolean I;
    private zzcf J;
    private volatile l5.c K;
    private ExecutorService L;
    private final Long M;
    private final zzbq N;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f10198a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile int f10199b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f10200c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f10201d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Handler f10202e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private volatile p1 f10203f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Context f10204g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private v0 f10205h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private volatile zzar f10206i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private volatile f0 f10207j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f10208k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f10209l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f10210m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f10211n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f10212o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f10213p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f10214q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f10215r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f10216s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f10217t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f10218u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f10219v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f10220w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private boolean f10221x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private boolean f10222y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private boolean f10223z;

    a(String str, Context context, v0 v0Var, ExecutorService executorService, BillingClient.Builder builder) {
        this.f10198a = new Object();
        this.f10199b = 0;
        this.f10202e = new Handler(Looper.getMainLooper());
        this.f10210m = 0;
        this.J = zzcf.zzk();
        Long lValueOf = Long.valueOf(new Random().nextLong());
        this.M = lValueOf;
        this.N = zzbf.zza();
        this.f10200c = "9.1.0";
        String strF = F();
        this.f10201d = strF;
        this.f10204g = context.getApplicationContext();
        zzke zzkeVarZza = zzkg.zza();
        zzkeVarZza.zzx("9.1.0");
        if (strF != null) {
            zzkeVarZza.zzy(strF);
        }
        zzkeVarZza.zzq(this.f10204g.getPackageName());
        zzkeVarZza.zzd(lValueOf.longValue());
        zzkeVarZza.zzw(builder.f10177j);
        zzkeVarZza.zza(Build.VERSION.SDK_INT);
        zzkeVarZza.zzp(926300087L);
        a0(zzkeVarZza, context);
        try {
            zzkeVarZza.zzb(this.f10204g.getPackageManager().getPackageInfo(this.f10204g.getPackageName(), 0).versionCode);
        } catch (Throwable th2) {
            zzc.zzo("BillingClient", "Error getting app version code.", th2);
        }
        this.f10205h = new y0(this.f10204g, (zzkg) zzkeVarZza.zzi());
        this.f10204g.getPackageName();
        this.H = builder.f10177j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final c A() {
        int[] iArr = {0, 3};
        synchronized (this.f10198a) {
            for (int i10 = 0; i10 < 2; i10++) {
                if (this.f10199b == iArr[i10]) {
                    return w0.f10439j;
                }
            }
            return w0.f10437h;
        }
    }

    private final /* synthetic */ Object C(l5.b bVar, l5.a aVar) {
        zzar zzarVar;
        try {
            if (!u0(x0.b())) {
                zzjs zzjsVar = zzjs.SERVICE_CONNECTION_NOT_READY;
                c cVar = w0.f10439j;
                d0(zzjsVar, 3, cVar);
                bVar.a(cVar);
            } else if (TextUtils.isEmpty(aVar.a())) {
                zzc.zzn("BillingClient", "Please provide a valid purchase token.");
                zzjs zzjsVar2 = zzjs.EMPTY_PURCHASE_TOKEN;
                c cVar2 = w0.f10436g;
                d0(zzjsVar2, 3, cVar2);
                bVar.a(cVar2);
            } else if (this.f10213p) {
                synchronized (this.f10198a) {
                    zzarVar = this.f10206i;
                }
                if (zzarVar != null) {
                    String packageName = this.f10204g.getPackageName();
                    String strA = aVar.a();
                    String str = this.f10201d;
                    long jLongValue = this.M.longValue();
                    int i10 = zzc.zza;
                    Bundle bundle = new Bundle();
                    zzc.zzc(bundle, "9.1.0", str, jLongValue);
                    Bundle bundleZzd = zzarVar.zzd(9, packageName, strA, bundle);
                    bVar.a(w0.a(zzc.zzb(bundleZzd, "BillingClient"), zzc.zzj(bundleZzd, "BillingClient")));
                    return null;
                }
                H(bVar, w0.f10439j, zzjs.SERVICE_RESET_TO_NULL, null);
            } else {
                zzjs zzjsVar3 = zzjs.API_VERSION_NOT_V9;
                c cVar3 = w0.f10430a;
                d0(zzjsVar3, 3, cVar3);
                bVar.a(cVar3);
            }
            return null;
        } catch (DeadObjectException e10) {
            H(bVar, w0.f10439j, zzjs.ACKNOWLEDGE_PURCHASE_SERVICE_CALL_EXCEPTION, e10);
            return null;
        } catch (Exception e11) {
            H(bVar, w0.f10437h, zzjs.ACKNOWLEDGE_PURCHASE_SERVICE_CALL_EXCEPTION, e11);
            return null;
        }
    }

    private final /* synthetic */ Object D(Bundle bundle, Activity activity, ResultReceiver resultReceiver) {
        zzar zzarVar;
        try {
            synchronized (this.f10198a) {
                zzarVar = this.f10206i;
            }
            if (zzarVar == null) {
                k0(-1, zzjs.SERVICE_RESET_TO_NULL, null);
            } else {
                zzarVar.zzt(12, this.f10204g.getPackageName(), bundle, new h0(new WeakReference(activity), resultReceiver, null));
            }
        } catch (DeadObjectException e10) {
            k0(-1, zzjs.SERVICE_CALL_EXCEPTION, e10);
        } catch (Exception e11) {
            k0(6, zzjs.SERVICE_CALL_EXCEPTION, e11);
        }
        return null;
    }

    private final String E(h hVar) {
        if (TextUtils.isEmpty(null)) {
            return this.f10204g.getPackageName();
        }
        return null;
    }

    private static String F() {
        try {
            return (String) Class.forName("com.android.billingclient.ktx.BuildConfig").getField("VERSION_NAME").get(null);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x00a6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void G(l5.d r10, l5.e r11) throws java.lang.Throwable {
        /*
            r9 = this;
            java.lang.String r3 = r10.a()
            java.lang.String r10 = "BillingClient"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> La8 android.os.DeadObjectException -> Laa
            r0.<init>()     // Catch: java.lang.Exception -> La8 android.os.DeadObjectException -> Laa
            java.lang.String r1 = "Consuming purchase with token: "
            r0.append(r1)     // Catch: java.lang.Exception -> La8 android.os.DeadObjectException -> Laa
            r0.append(r3)     // Catch: java.lang.Exception -> La8 android.os.DeadObjectException -> Laa
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Exception -> La8 android.os.DeadObjectException -> Laa
            com.google.android.gms.internal.play_billing.zzc.zzm(r10, r0)     // Catch: java.lang.Exception -> La8 android.os.DeadObjectException -> Laa
            java.lang.Object r10 = r9.f10198a     // Catch: java.lang.Exception -> La8 android.os.DeadObjectException -> Laa
            monitor-enter(r10)     // Catch: java.lang.Exception -> La8 android.os.DeadObjectException -> Laa
            com.google.android.gms.internal.play_billing.zzar r0 = r9.f10206i     // Catch: java.lang.Throwable -> La1
            monitor-exit(r10)     // Catch: java.lang.Throwable -> La1
            if (r0 != 0) goto L41
            com.android.billingclient.api.c r4 = com.android.billingclient.api.w0.f10439j     // Catch: java.lang.Exception -> L39 android.os.DeadObjectException -> L3d
            com.google.android.gms.internal.play_billing.zzjs r5 = com.google.android.gms.internal.play_billing.zzjs.SERVICE_RESET_TO_NULL     // Catch: java.lang.Exception -> L39 android.os.DeadObjectException -> L3d
            java.lang.String r6 = "Service has been reset to null."
            r7 = 0
            r1 = r9
            r2 = r11
            r1.j0(r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Exception -> L2f android.os.DeadObjectException -> L34
            return
        L2f:
            r0 = move-exception
        L30:
            r10 = r0
            r7 = r10
            goto Lac
        L34:
            r0 = move-exception
        L35:
            r10 = r0
            r7 = r10
            goto Lb7
        L39:
            r0 = move-exception
            r1 = r9
        L3b:
            r2 = r11
            goto L30
        L3d:
            r0 = move-exception
            r1 = r9
        L3f:
            r2 = r11
            goto L35
        L41:
            r1 = r9
            r2 = r11
            boolean r10 = r1.f10213p     // Catch: java.lang.Exception -> L2f android.os.DeadObjectException -> L34
            if (r10 == 0) goto L76
            android.content.Context r10 = r1.f10204g     // Catch: java.lang.Exception -> L2f android.os.DeadObjectException -> L34
            java.lang.String r10 = r10.getPackageName()     // Catch: java.lang.Exception -> L2f android.os.DeadObjectException -> L34
            boolean r11 = r1.f10213p     // Catch: java.lang.Exception -> L2f android.os.DeadObjectException -> L34
            java.lang.String r4 = r1.f10201d     // Catch: java.lang.Exception -> L2f android.os.DeadObjectException -> L34
            java.lang.Long r5 = r1.M     // Catch: java.lang.Exception -> L2f android.os.DeadObjectException -> L34
            long r5 = r5.longValue()     // Catch: java.lang.Exception -> L2f android.os.DeadObjectException -> L34
            java.lang.String r7 = "9.1.0"
            android.os.Bundle r8 = new android.os.Bundle     // Catch: java.lang.Exception -> L2f android.os.DeadObjectException -> L34
            r8.<init>()     // Catch: java.lang.Exception -> L2f android.os.DeadObjectException -> L34
            if (r11 == 0) goto L63
            com.google.android.gms.internal.play_billing.zzc.zzc(r8, r7, r4, r5)     // Catch: java.lang.Exception -> L2f android.os.DeadObjectException -> L34
        L63:
            r11 = 9
            android.os.Bundle r10 = r0.zze(r11, r10, r3, r8)     // Catch: java.lang.Exception -> L2f android.os.DeadObjectException -> L34
            java.lang.String r11 = "RESPONSE_CODE"
            int r11 = r10.getInt(r11)     // Catch: java.lang.Exception -> L2f android.os.DeadObjectException -> L34
            java.lang.String r0 = "BillingClient"
            java.lang.String r10 = com.google.android.gms.internal.play_billing.zzc.zzj(r10, r0)     // Catch: java.lang.Exception -> L2f android.os.DeadObjectException -> L34
            goto L83
        L76:
            android.content.Context r10 = r1.f10204g     // Catch: java.lang.Exception -> L2f android.os.DeadObjectException -> L34
            java.lang.String r10 = r10.getPackageName()     // Catch: java.lang.Exception -> L2f android.os.DeadObjectException -> L34
            r11 = 3
            int r11 = r0.zza(r11, r10, r3)     // Catch: java.lang.Exception -> L2f android.os.DeadObjectException -> L34
            java.lang.String r10 = ""
        L83:
            com.android.billingclient.api.c r4 = com.android.billingclient.api.w0.a(r11, r10)     // Catch: java.lang.Exception -> L2f android.os.DeadObjectException -> L34
            if (r11 != 0) goto L94
            java.lang.String r10 = "BillingClient"
            java.lang.String r11 = "Successfully consumed purchase."
            com.google.android.gms.internal.play_billing.zzc.zzm(r10, r11)     // Catch: java.lang.Exception -> L2f android.os.DeadObjectException -> L34
            r2.a(r4, r3)     // Catch: java.lang.Exception -> L2f android.os.DeadObjectException -> L34
            return
        L94:
            com.google.android.gms.internal.play_billing.zzjs r5 = com.google.android.gms.internal.play_billing.zzjs.BILLING_RESULT_RECEIVED_FROM_PHONESKY     // Catch: java.lang.Exception -> L2f android.os.DeadObjectException -> L34
            java.lang.String r10 = "Error consuming purchase with token. Response code: "
            java.lang.String r6 = com.android.billingclient.api.k.a(r11, r10)     // Catch: java.lang.Exception -> L2f android.os.DeadObjectException -> L34
            r7 = 0
            r1.j0(r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Exception -> L2f android.os.DeadObjectException -> L34
            return
        La1:
            r0 = move-exception
            r2 = r11
        La3:
            r11 = r0
            monitor-exit(r10)     // Catch: java.lang.Throwable -> La6
            throw r11     // Catch: java.lang.Exception -> L2f android.os.DeadObjectException -> L34
        La6:
            r0 = move-exception
            goto La3
        La8:
            r0 = move-exception
            goto L3b
        Laa:
            r0 = move-exception
            goto L3f
        Lac:
            com.android.billingclient.api.c r4 = com.android.billingclient.api.w0.f10437h
            com.google.android.gms.internal.play_billing.zzjs r5 = com.google.android.gms.internal.play_billing.zzjs.CONSUME_PURCHASE_SERVICE_CALL_EXCEPTION
            java.lang.String r6 = "Error consuming purchase!"
            r1 = r9
            r1.j0(r2, r3, r4, r5, r6, r7)
            return
        Lb7:
            com.android.billingclient.api.c r4 = com.android.billingclient.api.w0.f10439j
            com.google.android.gms.internal.play_billing.zzjs r5 = com.google.android.gms.internal.play_billing.zzjs.CONSUME_PURCHASE_SERVICE_CALL_EXCEPTION
            java.lang.String r6 = "Error consuming purchase!"
            r1 = r9
            r1.j0(r2, r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.billingclient.api.a.G(l5.d, l5.e):void");
    }

    private final void H(l5.b bVar, c cVar, zzjs zzjsVar, Exception exc) {
        zzc.zzo("BillingClient", "Error in acknowledge purchase!", exc);
        f0(zzjsVar, 3, cVar, u0.a(exc));
        bVar.a(cVar);
    }

    static /* bridge */ /* synthetic */ c H0(Exception exc) {
        return exc instanceof DeadObjectException ? w0.f10439j : w0.f10437h;
    }

    public static /* synthetic */ void I(a aVar, l5.i iVar) {
        zzjs zzjsVar = zzjs.EXECUTE_ASYNC_TIMEOUT;
        c cVar = w0.f10440k;
        aVar.d0(zzjsVar, 7, cVar);
        iVar.d(cVar, new i(zzca.zzk(), zzca.zzk()));
    }

    public static /* synthetic */ void J(a aVar, c cVar) {
        if (aVar.f10203f.d() != null) {
            aVar.f10203f.d().b(cVar, null);
        } else {
            zzc.zzn("BillingClient", "No valid listener is set in BroadcastManager");
        }
    }

    public static /* synthetic */ Object O0(a aVar, int i10, zzp zzpVar) {
        aVar.r0(new c0(aVar, zzpVar), i10);
        return "reconnectIfNeeded";
    }

    public static /* synthetic */ Object P0(a aVar, l5.e eVar, l5.d dVar) throws Throwable {
        if (aVar.u0(x0.b())) {
            aVar.G(dVar, eVar);
            return null;
        }
        zzjs zzjsVar = zzjs.SERVICE_CONNECTION_NOT_READY;
        c cVar = w0.f10439j;
        aVar.d0(zzjsVar, 4, cVar);
        eVar.a(cVar, dVar.a());
        return null;
    }

    public static /* synthetic */ Object Q0(a aVar, l5.i iVar, h hVar) {
        if (!aVar.u0(x0.b())) {
            zzjs zzjsVar = zzjs.SERVICE_CONNECTION_NOT_READY;
            c cVar = w0.f10439j;
            aVar.d0(zzjsVar, 7, cVar);
            iVar.d(cVar, new i(zzca.zzk(), zzca.zzk()));
            return null;
        }
        if (aVar.f10218u) {
            i0 i0VarC0 = aVar.C0(hVar);
            iVar.d(w0.a(i0VarC0.a(), i0VarC0.b()), new i(i0VarC0.c(), i0VarC0.d()));
            return null;
        }
        zzc.zzn("BillingClient", "Querying product details is not supported.");
        zzjs zzjsVar2 = zzjs.PRODUCT_DETAILS_NOT_SUPPORTED;
        c cVar2 = w0.f10448s;
        aVar.d0(zzjsVar2, 7, cVar2);
        iVar.d(cVar2, new i(zzca.zzk(), zzca.zzk()));
        return null;
    }

    public static /* synthetic */ Object R0(a aVar, l5.b bVar, l5.a aVar2) {
        aVar.C(bVar, aVar2);
        return null;
    }

    static /* bridge */ /* synthetic */ void S(a aVar, int i10) {
        aVar.f10210m = i10;
        aVar.F = i10 >= 29;
        aVar.E = i10 >= 28;
        aVar.D = i10 >= 27;
        aVar.C = i10 >= 26;
        aVar.B = i10 >= 24;
        aVar.A = i10 >= 23;
        aVar.f10223z = i10 >= 22;
        aVar.f10222y = i10 >= 21;
        aVar.f10221x = i10 >= 20;
        aVar.f10220w = i10 >= 19;
        aVar.f10219v = i10 >= 18;
        aVar.f10218u = i10 >= 17;
        aVar.f10217t = i10 >= 16;
        aVar.f10216s = i10 >= 15;
        aVar.f10215r = i10 >= 14;
        aVar.f10214q = i10 >= 12;
        aVar.f10213p = i10 >= 9;
        aVar.f10212o = i10 >= 8;
        aVar.f10211n = i10 >= 6;
    }

    public static /* synthetic */ Object S0(a aVar, Bundle bundle, Activity activity, ResultReceiver resultReceiver) {
        aVar.D(bundle, activity, resultReceiver);
        return null;
    }

    static /* bridge */ /* synthetic */ void U(a aVar, int i10) {
        if (i10 != 0) {
            aVar.p0(0);
            return;
        }
        synchronized (aVar.f10198a) {
            try {
                if (aVar.f10199b == 3) {
                    return;
                }
                aVar.p0(2);
                p1 p1Var = aVar.f10203f != null ? aVar.f10203f : null;
                if (p1Var != null) {
                    p1Var.h(aVar.f10222y);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    static /* bridge */ /* synthetic */ boolean Y(a aVar) {
        boolean z10;
        synchronized (aVar.f10198a) {
            z10 = true;
            if (aVar.f10199b != 1) {
                z10 = false;
            }
        }
        return z10;
    }

    private static final void a0(zzke zzkeVar, Context context) {
        try {
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            if (activityManager != null) {
                ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                activityManager.getMemoryInfo(memoryInfo);
                zzkeVar.zzv((int) (memoryInfo.totalMem / 1048576));
                zzkeVar.zzr(Build.BRAND);
                zzkeVar.zzu(Build.MODEL);
                zzkeVar.zzt(Build.MANUFACTURER);
                zzkeVar.zzs(Build.FINGERPRINT);
            }
        } catch (RuntimeException e10) {
            zzc.zzo("BillingClient", "Runtime error while populating device info.", e10);
        }
    }

    private final l5.b0 b0(int i10, c cVar, zzjs zzjsVar, String str, Exception exc) {
        f0(zzjsVar, 9, cVar, u0.a(exc));
        zzc.zzo("BillingClient", str, exc);
        return new l5.b0(cVar, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:104:0x0180 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:108:0x01e4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x018c  */
    /* JADX WARN: Code duplicated, block: B:74:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:78:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:84:0x01fc  */
    public final l5.b0 c0(String str, boolean z10, int i10) {
        zzar zzarVar;
        int i11;
        int i12;
        Bundle bundleZzi;
        c cVarA;
        zzjs zzjsVar;
        ArrayList<String> stringArrayList;
        ArrayList<String> stringArrayList2;
        ArrayList<String> stringArrayList3;
        int i13;
        boolean z11;
        l5.j jVar;
        zzc.zzm("BillingClient", "Querying owned items, item type: ".concat(String.valueOf(str)));
        ArrayList arrayList = new ArrayList();
        boolean z12 = this.f10213p;
        boolean z13 = this.f10220w;
        boolean zA = this.G.a();
        boolean zB = this.G.b();
        long jLongValue = this.M.longValue();
        Bundle bundle = new Bundle();
        zzc.zzc(bundle, "9.1.0", this.f10201d, jLongValue);
        if (z12 && zA) {
            bundle.putBoolean("enablePendingPurchases", true);
        }
        if (z13 && zB) {
            bundle.putBoolean("enablePendingPurchaseForSubscriptions", true);
        }
        if (z10) {
            bundle.putBoolean("includeSuspendedSubscriptions", true);
        }
        String string = null;
        do {
            try {
                synchronized (this.f10198a) {
                    zzarVar = this.f10206i;
                }
                if (zzarVar == null) {
                    return b0(9, w0.f10439j, zzjs.SERVICE_RESET_TO_NULL, "Service has been reset to null", null);
                }
                if (z10 && !this.C) {
                    return b0(9, w0.f10453x, zzjs.INCLUDE_SUSPENDED_SUBSCRIPTIONS_NOT_SUPPORTED, "Include suspended subscriptions is not supported", null);
                }
                if (this.f10213p) {
                    if (this.C) {
                        i12 = 26;
                    } else if (this.B) {
                        i12 = 24;
                    } else {
                        if (this.f10220w) {
                            i12 = 19;
                        } else {
                            i11 = 9;
                        }
                        bundleZzi = zzarVar.zzi(i11, this.f10204g.getPackageName(), str, string, bundle);
                    }
                    i11 = i12;
                    bundleZzi = zzarVar.zzi(i11, this.f10204g.getPackageName(), str, string, bundle);
                } else {
                    bundleZzi = zzarVar.zzh(3, this.f10204g.getPackageName(), str, string);
                }
                c cVar = w0.f10437h;
                if (bundleZzi == null) {
                    zzc.zzn("BillingClient", String.format("%s got null owned items list", "getPurchase()"));
                    zzjsVar = zzjs.NULL_OWNED_ITEMS_LIST;
                } else {
                    int iZzb = zzc.zzb(bundleZzi, "BillingClient");
                    String strZzj = zzc.zzj(bundleZzi, "BillingClient");
                    c.a aVarD = c.d();
                    aVarD.d(iZzb);
                    aVarD.b(strZzj);
                    cVarA = aVarD.a();
                    if (iZzb != 0) {
                        zzc.zzn("BillingClient", String.format("%s failed. Response code: %s", "getPurchase()", Integer.valueOf(iZzb)));
                        zzjsVar = zzjs.BILLING_RESULT_RECEIVED_FROM_PHONESKY;
                    } else if (bundleZzi.containsKey("INAPP_PURCHASE_ITEM_LIST") && bundleZzi.containsKey("INAPP_PURCHASE_DATA_LIST") && bundleZzi.containsKey("INAPP_DATA_SIGNATURE_LIST")) {
                        ArrayList<String> stringArrayList4 = bundleZzi.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
                        ArrayList<String> stringArrayList5 = bundleZzi.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                        ArrayList<String> stringArrayList6 = bundleZzi.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
                        if (stringArrayList4 == null) {
                            zzc.zzn("BillingClient", String.format("Bundle returned from %s contains null SKUs list.", "getPurchase()"));
                            zzjsVar = zzjs.NULL_SKUS_LIST;
                        } else if (stringArrayList5 == null) {
                            zzc.zzn("BillingClient", String.format("Bundle returned from %s contains null purchases list.", "getPurchase()"));
                            zzjsVar = zzjs.NULL_PURCHASES_LIST;
                        } else if (stringArrayList6 == null) {
                            zzc.zzn("BillingClient", String.format("Bundle returned from %s contains null signatures list.", "getPurchase()"));
                            zzjsVar = zzjs.NULL_SIGNATURES_LIST;
                        } else {
                            cVarA = w0.f10438i;
                            zzjsVar = zzjs.REASON_UNSPECIFIED;
                        }
                    } else {
                        zzc.zzn("BillingClient", String.format("Bundle returned from %s doesn't contain required fields.", "getPurchase()"));
                        zzjsVar = zzjs.MISSING_REQUIRED_PURCHASE_KEY;
                    }
                    if (cVarA != w0.f10438i) {
                        return b0(9, cVarA, zzjsVar, "Purchase bundle invalid", null);
                    }
                    stringArrayList = bundleZzi.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
                    stringArrayList2 = bundleZzi.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                    stringArrayList3 = bundleZzi.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
                    z11 = false;
                    for (i13 = 0; i13 < stringArrayList2.size(); i13++) {
                        String str2 = stringArrayList2.get(i13);
                        String str3 = stringArrayList3.get(i13);
                        zzc.zzm("BillingClient", "Sku is owned: ".concat(String.valueOf(stringArrayList.get(i13))));
                        try {
                            jVar = new l5.j(str2, str3);
                            this.J.isEmpty();
                            if (TextUtils.isEmpty(jVar.d())) {
                                zzc.zzn("BillingClient", "BUG: empty/null token!");
                                z11 = true;
                            }
                            arrayList.add(jVar);
                        } catch (JSONException e10) {
                            return b0(9, w0.f10437h, zzjs.ERROR_DECODING_PURCHASE_DATA, "Got an exception trying to decode the purchase!", e10);
                        }
                    }
                    if (z11) {
                        d0(zzjs.EMPTY_PURCHASE_TOKEN, 9, cVar);
                    }
                    string = bundleZzi.getString("INAPP_CONTINUATION_TOKEN");
                    zzc.zzm("BillingClient", "Continuation token: ".concat(String.valueOf(string)));
                }
                cVarA = cVar;
                if (cVarA != w0.f10438i) {
                    return b0(9, cVarA, zzjsVar, "Purchase bundle invalid", null);
                }
                stringArrayList = bundleZzi.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
                stringArrayList2 = bundleZzi.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                stringArrayList3 = bundleZzi.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
                z11 = false;
                while (i13 < stringArrayList2.size()) {
                    String str4 = stringArrayList2.get(i13);
                    String str5 = stringArrayList3.get(i13);
                    zzc.zzm("BillingClient", "Sku is owned: ".concat(String.valueOf(stringArrayList.get(i13))));
                    jVar = new l5.j(str4, str5);
                    this.J.isEmpty();
                    if (TextUtils.isEmpty(jVar.d())) {
                        zzc.zzn("BillingClient", "BUG: empty/null token!");
                        z11 = true;
                    }
                    arrayList.add(jVar);
                }
                if (z11) {
                    d0(zzjs.EMPTY_PURCHASE_TOKEN, 9, cVar);
                }
                string = bundleZzi.getString("INAPP_CONTINUATION_TOKEN");
                zzc.zzm("BillingClient", "Continuation token: ".concat(String.valueOf(string)));
            } catch (DeadObjectException e11) {
                return b0(9, w0.f10439j, zzjs.GET_PURCHASE_SERVICE_CALL_EXCEPTION, "Got exception trying to get purchases try to reconnect", e11);
            } catch (Exception e12) {
                return b0(9, w0.f10437h, zzjs.GET_PURCHASE_SERVICE_CALL_EXCEPTION, "Got exception trying to get purchases try to reconnect", e12);
            }
        } while (!TextUtils.isEmpty(string));
        return new l5.b0(w0.f10438i, arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d0(zzjs zzjsVar, int i10, c cVar) {
        try {
            int i11 = u0.f10422a;
            l0(u0.b(zzjsVar, i10, cVar, null, zzjz.BROADCAST_ACTION_UNSPECIFIED));
        } catch (Throwable th2) {
            zzc.zzo("BillingClient", "Unable to log.", th2);
        }
    }

    private final void e0(zzjs zzjsVar, int i10, c cVar, long j10) {
        try {
            int i11 = u0.f10422a;
            try {
                this.f10205h.i(u0.b(zzjsVar, 2, cVar, null, zzjz.BROADCAST_ACTION_UNSPECIFIED), this.f10210m, j10);
            } catch (Throwable th2) {
                zzc.zzo("BillingClient", "Unable to log.", th2);
            }
        } catch (Throwable th3) {
            zzc.zzo("BillingClient", "Unable to log.", th3);
        }
    }

    private final void f0(zzjs zzjsVar, int i10, c cVar, String str) {
        try {
            int i11 = u0.f10422a;
            l0(u0.b(zzjsVar, i10, cVar, str, zzjz.BROADCAST_ACTION_UNSPECIFIED));
        } catch (Throwable th2) {
            zzc.zzo("BillingClient", "Unable to log.", th2);
        }
    }

    private final void g0(zzjs zzjsVar, int i10, c cVar, long j10, boolean z10) {
        try {
            int i11 = u0.f10422a;
            m0(u0.b(zzjsVar, 2, cVar, null, zzjz.BROADCAST_ACTION_UNSPECIFIED), j10, z10);
        } catch (Throwable th2) {
            zzc.zzo("BillingClient", "Unable to log.", th2);
        }
    }

    private final void h0(zzjs zzjsVar, int i10, c cVar, String str, long j10, boolean z10) {
        try {
            int i11 = u0.f10422a;
            m0(u0.b(zzjsVar, 2, cVar, str, zzjz.BROADCAST_ACTION_UNSPECIFIED), j10, z10);
        } catch (Throwable th2) {
            zzc.zzo("BillingClient", "Unable to log.", th2);
        }
    }

    private void i0(int i10) {
        try {
            int i11 = u0.f10422a;
            n0(u0.c(i10, zzjz.BROADCAST_ACTION_UNSPECIFIED));
        } catch (Throwable th2) {
            zzc.zzo("BillingClient", "Unable to log.", th2);
        }
    }

    private void j(Context context, l5.l lVar, f fVar, String str, v0 v0Var, BillingClient.Builder builder) {
        this.f10204g = context.getApplicationContext();
        zzke zzkeVarZza = zzkg.zza();
        zzkeVarZza.zzx(str);
        String str2 = this.f10201d;
        if (str2 != null) {
            zzkeVarZza.zzy(str2);
        }
        zzkeVarZza.zzq(this.f10204g.getPackageName());
        zzkeVarZza.zzd(this.M.longValue());
        zzkeVarZza.zzw(builder.f10177j);
        zzkeVarZza.zza(Build.VERSION.SDK_INT);
        zzkeVarZza.zzp(926300087L);
        a0(zzkeVarZza, context);
        try {
            zzkeVarZza.zzb(this.f10204g.getPackageManager().getPackageInfo(this.f10204g.getPackageName(), 0).versionCode);
        } catch (Throwable th2) {
            zzc.zzo("BillingClient", "Error getting app version code.", th2);
        }
        if (v0Var != null) {
            this.f10205h = v0Var;
        } else {
            this.f10205h = new y0(this.f10204g, (zzkg) zzkeVarZza.zzi());
        }
        if (lVar == null) {
            zzc.zzn("BillingClient", "Billing client should have a valid listener but the provided is null.");
        }
        this.f10203f = new p1(this.f10204g, lVar, null, null, null, this.f10205h);
        this.G = fVar;
        this.f10204g.getPackageName();
        this.H = builder.f10177j;
    }

    private final void j0(l5.e eVar, String str, c cVar, zzjs zzjsVar, String str2, Exception exc) {
        zzc.zzo("BillingClient", str2, exc);
        f0(zzjsVar, 4, cVar, u0.a(exc));
        eVar.a(cVar, str);
    }

    private final void k0(int i10, zzjs zzjsVar, Exception exc) {
        zzjl zzjlVar;
        zzc.zzo("BillingClient", "showInAppMessages error.", exc);
        v0 v0Var = this.f10205h;
        String strA = u0.a(exc);
        try {
            zzjq zzjqVarZza = zzju.zza();
            zzjqVarZza.zzp(i10);
            if (zzjsVar != null) {
                zzjqVarZza.zze(zzjsVar);
            }
            if (strA != null) {
                zzjqVarZza.zza(strA);
            }
            zzjj zzjjVarZza = zzjl.zza();
            zzjjVarZza.zzb(zzjqVarZza);
            zzjjVarZza.zzp(30);
            zzjlVar = (zzjl) zzjjVarZza.zzi();
        } catch (Throwable th2) {
            zzc.zzo("BillingLogger", "Unable to create logging payload", th2);
            zzjlVar = null;
        }
        v0Var.m(zzjlVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void l0(zzjl zzjlVar) {
        try {
            this.f10205h.l(zzjlVar, this.f10210m);
        } catch (Throwable th2) {
            zzc.zzo("BillingClient", "Unable to log.", th2);
        }
    }

    private final void m0(zzjl zzjlVar, long j10, boolean z10) {
        try {
            this.f10205h.f(zzjlVar, this.f10210m, j10, z10);
        } catch (Throwable th2) {
            zzc.zzo("BillingClient", "Unable to log.", th2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void n0(zzjp zzjpVar) {
        try {
            this.f10205h.g(zzjpVar, this.f10210m);
        } catch (Throwable th2) {
            zzc.zzo("BillingClient", "Unable to log.", th2);
        }
    }

    static Future o(Callable callable, long j10, final Runnable runnable, Handler handler, ExecutorService executorService) {
        try {
            final Future futureSubmit = executorService.submit(callable);
            handler.postDelayed(new Runnable() { // from class: l5.p
                @Override // java.lang.Runnable
                public final void run() {
                    Future future = futureSubmit;
                    if (future.isDone() || future.isCancelled()) {
                        return;
                    }
                    Runnable runnable2 = runnable;
                    future.cancel(true);
                    zzc.zzn("BillingClient", "Async task is taking too long, cancel it!");
                    if (runnable2 != null) {
                        runnable2.run();
                    }
                }
            }, (long) (j10 * 0.95d));
            return futureSubmit;
        } catch (Exception e10) {
            zzc.zzo("BillingClient", "Async task throws exception!", e10);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void o0(zzjs zzjsVar, c cVar, int i10) {
        try {
            int i11 = u0.f10422a;
            zzjj zzjjVar = (zzjj) u0.b(zzjsVar, 6, cVar, null, zzjz.BROADCAST_ACTION_UNSPECIFIED).zzq();
            zzll zzllVarZza = zzln.zza();
            zzllVarZza.zza(i10 > 0);
            zzllVarZza.zzb(i10);
            zzjjVar.zze(zzllVarZza);
            l0((zzjl) zzjjVar.zzi());
        } catch (Throwable th2) {
            zzc.zzo("BillingClient", "Unable to log.", th2);
        }
    }

    public static /* synthetic */ void p(a aVar, l5.e eVar, l5.d dVar) {
        zzjs zzjsVar = zzjs.EXECUTE_ASYNC_TIMEOUT;
        c cVar = w0.f10440k;
        aVar.d0(zzjsVar, 4, cVar);
        eVar.a(cVar, dVar.a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void p0(int i10) {
        synchronized (this.f10198a) {
            try {
                if (this.f10199b == 3) {
                    return;
                }
                zzc.zzm("BillingClient", "Setting clientState from " + w0(this.f10199b) + " to " + w0(i10));
                this.f10199b = i10;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static /* synthetic */ void q(a aVar, l5.k kVar) {
        zzjs zzjsVar = zzjs.EXECUTE_ASYNC_TIMEOUT;
        c cVar = w0.f10440k;
        aVar.d0(zzjsVar, 9, cVar);
        kVar.a(cVar, zzca.zzk());
    }

    private final synchronized void q0() {
        ExecutorService executorService = this.L;
        if (executorService != null) {
            executorService.shutdownNow();
            this.L = null;
        }
    }

    public static /* synthetic */ void r(a aVar, l5.b bVar) {
        zzjs zzjsVar = zzjs.EXECUTE_ASYNC_TIMEOUT;
        c cVar = w0.f10440k;
        aVar.d0(zzjsVar, 3, cVar);
        bVar.a(cVar);
    }

    private final void r0(l5.c cVar, int i10) {
        zzjs zzjsVar;
        c cVarZ;
        c cVar2;
        synchronized (this.f10198a) {
            try {
                if (v0()) {
                    cVarZ = z(i10);
                } else {
                    if (this.f10199b == 1) {
                        zzc.zzn("BillingClient", "Client is already in the process of connecting to billing service.");
                        zzjs zzjsVar2 = zzjs.BILLING_CLIENT_CONNECTING;
                        cVar2 = w0.f10433d;
                        o0(zzjsVar2, cVar2, i10);
                    } else if (this.f10199b == 3) {
                        zzc.zzn("BillingClient", "Client was already closed and can't be reused. Please create another instance.");
                        zzjs zzjsVar3 = zzjs.BILLING_CLIENT_CLOSED;
                        cVar2 = w0.f10439j;
                        o0(zzjsVar3, cVar2, i10);
                    } else {
                        p0(1);
                        if (i10 == 0) {
                            this.K = cVar;
                            i10 = 0;
                        }
                        s0();
                        zzc.zzm("BillingClient", "Starting in-app billing setup.");
                        this.f10207j = new f0(this, cVar, i10, null);
                        this.f10207j.f();
                        Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
                        intent.setPackage("com.android.vending");
                        List<ResolveInfo> listQueryIntentServices = this.f10204g.getPackageManager().queryIntentServices(intent, 0);
                        if (listQueryIntentServices == null || listQueryIntentServices.isEmpty()) {
                            zzjsVar = zzjs.INTENT_SERVICE_NOT_FOUND;
                        } else {
                            ServiceInfo serviceInfo = listQueryIntentServices.get(0).serviceInfo;
                            if (serviceInfo != null) {
                                String str = serviceInfo.packageName;
                                String str2 = serviceInfo.name;
                                if (!Objects.equals(str, "com.android.vending") || str2 == null) {
                                    zzjsVar = zzjs.INVALID_PHONESKY_PACKAGE;
                                    zzc.zzn("BillingClient", "The device doesn't have valid Play Store.");
                                } else {
                                    ComponentName componentName = new ComponentName(str, str2);
                                    Intent intent2 = new Intent(intent);
                                    intent2.setComponent(componentName);
                                    intent2.putExtra("playBillingLibraryVersion", this.f10200c);
                                    synchronized (this.f10198a) {
                                        try {
                                            if (this.f10199b == 2) {
                                                cVarZ = z(i10);
                                            } else if (this.f10199b != 1) {
                                                zzc.zzn("BillingClient", "Client state no longer CONNECTING, returning service disconnected.");
                                                zzjs zzjsVar4 = zzjs.BILLING_CLIENT_TRANSITIONED_OUT_OF_CONNECTING;
                                                cVar2 = w0.f10439j;
                                                o0(zzjsVar4, cVar2, i10);
                                            } else {
                                                f0 f0Var = this.f10207j;
                                                if ((i10 <= 0 || Build.VERSION.SDK_INT < 29) ? this.f10204g.bindService(intent2, f0Var, 1) : this.f10204g.bindService(intent2, 1, n(), f0Var)) {
                                                    zzc.zzm("BillingClient", "Service was bonded successfully.");
                                                    cVarZ = null;
                                                } else {
                                                    zzjsVar = zzjs.BILLING_SERVICE_BLOCKED;
                                                    zzc.zzn("BillingClient", "Connection to Billing service is blocked.");
                                                }
                                            }
                                        } catch (Throwable th2) {
                                            throw th2;
                                        }
                                    }
                                }
                            } else {
                                zzjsVar = zzjs.INVALID_PHONESKY_PACKAGE;
                                zzc.zzn("BillingClient", "The device doesn't have valid Play Store.");
                            }
                        }
                        p0(0);
                        zzc.zzm("BillingClient", "Billing service unavailable on device.");
                        c cVar3 = w0.f10431b;
                        o0(zzjsVar, cVar3, i10);
                        cVarZ = cVar3;
                    }
                    cVarZ = cVar2;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        if (cVarZ != null) {
            cVar.onBillingSetupFinished(cVarZ);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void s0() {
        synchronized (this.f10198a) {
            if (this.f10207j != null) {
                try {
                    this.f10204g.unbindService(this.f10207j);
                    this.f10206i = null;
                    this.f10207j = null;
                } catch (Throwable th2) {
                    try {
                        zzc.zzo("BillingClient", "There was an exception while unbinding service!", th2);
                        this.f10206i = null;
                        this.f10207j = null;
                    } catch (Throwable th3) {
                        this.f10206i = null;
                        this.f10207j = null;
                        throw th3;
                    }
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean t0(long j10) {
        try {
            if (Build.VERSION.SDK_INT < 29) {
                j10 = 0;
            }
            c cVar = (c) B(1).get(j10, TimeUnit.MILLISECONDS);
            if (cVar.c() == 0) {
                zzc.zzm("BillingClient", "Reconnection succeeded with result: " + cVar.c());
            } else {
                zzc.zzn("BillingClient", "Reconnection failed with result: " + cVar.c());
            }
        } catch (Exception e10) {
            if (e10 instanceof InterruptedException) {
                Thread.currentThread().interrupt();
            }
            zzc.zzo("BillingClient", "Error during reconnection attempt: ", e10);
        }
        return v0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final /* synthetic */ Bundle v(int i10, String str, String str2, b bVar, Bundle bundle) {
        zzar zzarVar;
        try {
            synchronized (this.f10198a) {
                zzarVar = this.f10206i;
            }
            return zzarVar == null ? zzc.zzd(w0.f10439j, zzjs.SERVICE_RESET_TO_NULL) : zzarVar.zzg(i10, this.f10204g.getPackageName(), str, str2, null, bundle);
        } catch (DeadObjectException e10) {
            return zzc.zze(w0.f10439j, zzjs.LAUNCH_BILLING_FLOW_EXCEPTION, u0.a(e10));
        } catch (Exception e11) {
            return zzc.zze(w0.f10437h, zzjs.LAUNCH_BILLING_FLOW_EXCEPTION, u0.a(e11));
        }
    }

    private final boolean v0() {
        boolean z10;
        synchronized (this.f10198a) {
            try {
                z10 = false;
                if (this.f10199b == 2 && this.f10206i != null && this.f10207j != null) {
                    z10 = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final /* synthetic */ Bundle w(String str, String str2) {
        zzar zzarVar;
        try {
            synchronized (this.f10198a) {
                zzarVar = this.f10206i;
            }
            return zzarVar == null ? zzc.zzd(w0.f10439j, zzjs.SERVICE_RESET_TO_NULL) : zzarVar.zzf(3, this.f10204g.getPackageName(), str, str2, null);
        } catch (DeadObjectException e10) {
            return zzc.zze(w0.f10439j, zzjs.LAUNCH_BILLING_FLOW_EXCEPTION, u0.a(e10));
        } catch (Exception e11) {
            return zzc.zze(w0.f10437h, zzjs.LAUNCH_BILLING_FLOW_EXCEPTION, u0.a(e11));
        }
    }

    private static final String w0(int i10) {
        if (i10 == 0) {
            return "DISCONNECTED";
        }
        if (i10 != 1) {
            return i10 != 2 ? "CLOSED" : "CONNECTED";
        }
        return "CONNECTING";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Handler x() {
        return Looper.myLooper() == null ? this.f10202e : new Handler(Looper.myLooper());
    }

    private final i0 y(c cVar, zzjs zzjsVar, String str, Exception exc) {
        zzc.zzo("BillingClient", str, exc);
        f0(zzjsVar, 7, cVar, u0.a(exc));
        return new i0(cVar.c(), cVar.a(), new ArrayList(), new ArrayList());
    }

    private final c z(int i10) {
        zzc.zzm("BillingClient", "Service connection is valid. No need to re-initialize.");
        zzjn zzjnVarZza = zzjp.zza();
        zzjnVarZza.zze(6);
        zzll zzllVarZza = zzln.zza();
        zzllVarZza.zze(true);
        zzllVarZza.zza(i10 > 0);
        zzllVarZza.zzb(i10);
        zzjnVarZza.zzd(zzllVarZza);
        n0((zzjp) zzjnVarZza.zzi());
        return w0.f10438i;
    }

    final i0 C0(h hVar) {
        zzar zzarVar;
        int i10;
        int i11;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        String strC = hVar.c();
        zzca zzcaVarB = hVar.b();
        int size = zzcaVarB.size();
        int i12 = 0;
        while (i12 < size) {
            int i13 = i12 + 20;
            ArrayList arrayList3 = new ArrayList(zzcaVarB.subList(i12, i13 > size ? size : i13));
            ArrayList<String> arrayList4 = new ArrayList<>();
            int size2 = arrayList3.size();
            for (int i14 = 0; i14 < size2; i14++) {
                arrayList4.add(((h.b) arrayList3.get(i14)).c());
            }
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("ITEM_ID_LIST", arrayList4);
            String str = this.f10200c;
            bundle.putString("playBillingLibraryVersion", str);
            try {
                synchronized (this.f10198a) {
                    zzarVar = this.f10206i;
                }
                if (zzarVar == null) {
                    return y(w0.f10439j, zzjs.SERVICE_RESET_TO_NULL, "Service has been reset to null.", null);
                }
                boolean z10 = this.f10220w && this.G.b();
                E(hVar);
                E(hVar);
                E(hVar);
                E(hVar);
                zza zzaVarZza = zza.zza(z10, true, true, true, false, true);
                Bundle bundleZzj = zzarVar.zzj(true != this.f10221x ? 17 : 20, this.f10204g.getPackageName(), strC, bundle, zzc.zzg(str, this.f10201d, arrayList3, null, null, zzaVarZza, this.M.longValue()));
                if (bundleZzj == null) {
                    return y(w0.B, zzjs.NULL_BUNDLE_FROM_GET_SKU_DETAILS_SERVICE_CALL, "queryProductDetailsAsync got empty product details response.", null);
                }
                if (!bundleZzj.containsKey("DETAILS_LIST")) {
                    int iZzb = zzc.zzb(bundleZzj, "BillingClient");
                    String strZzj = zzc.zzj(bundleZzj, "BillingClient");
                    return iZzb != 0 ? y(w0.a(iZzb, strZzj), zzjs.BILLING_RESULT_RECEIVED_FROM_PHONESKY, k.a(iZzb, "getSkuDetails() failed for queryProductDetailsAsync. Response code: "), null) : y(w0.a(6, strZzj), zzjs.MISSING_DETAILS_LIST_IN_GET_SKU_DETAILS_RESPONSE, "getSkuDetails() returned a bundle with neither an error nor a product detail list for queryProductDetailsAsync.", null);
                }
                ArrayList<String> stringArrayList = bundleZzj.getStringArrayList("DETAILS_LIST");
                if (stringArrayList == null) {
                    return y(w0.B, zzjs.NULL_DETAILS_LIST_IN_GET_SKU_DETAILS_RESPONSE, "queryProductDetailsAsync got null response list", null);
                }
                ArrayList arrayList5 = new ArrayList();
                int size3 = stringArrayList.size();
                for (int i15 = 0; i15 < size3; i15++) {
                    try {
                        g gVar = new g(stringArrayList.get(i15));
                        zzc.zzm("BillingClient", "Got product details: ".concat(gVar.toString()));
                        arrayList5.add(gVar);
                    } catch (JSONException e10) {
                        return y(w0.a(6, "Error trying to decode SkuDetails."), zzjs.ERROR_DECODING_SKU_DETAILS, "Got a JSON exception trying to decode ProductDetails. \n Exception: ", e10);
                    }
                }
                ArrayList<String> stringArrayList2 = bundleZzj.getStringArrayList("UNFETCHED_PRODUCT_LIST");
                new ArrayList();
                try {
                    ArrayList arrayList6 = new ArrayList();
                    if (stringArrayList2 != null) {
                        int size4 = stringArrayList2.size();
                        int i16 = 0;
                        while (i16 < size4) {
                            String str2 = stringArrayList2.get(i16);
                            i16++;
                            j jVar = new j(str2);
                            zzc.zzm("BillingClient", "Got unfetchedProduct: ".concat(jVar.toString()));
                            arrayList6.add(jVar);
                        }
                    } else {
                        int size5 = arrayList3.size();
                        int i17 = 0;
                        while (i17 < size5) {
                            Object obj = arrayList3.get(i17);
                            int i18 = i17 + 1;
                            h.b bVar = (h.b) obj;
                            int size6 = arrayList5.size();
                            int i19 = 0;
                            while (true) {
                                if (i19 >= size6) {
                                    i10 = size5;
                                    i11 = i18;
                                    arrayList6.add(new j(new JSONObject().put("productId", bVar.c()).put("type", bVar.d()).put("statusCode", 0).toString()));
                                    break;
                                }
                                Object obj2 = arrayList5.get(i19);
                                i19++;
                                g gVar2 = (g) obj2;
                                i10 = size5;
                                i11 = i18;
                                if (bVar.c().equals(gVar2.d()) && bVar.d().equals(gVar2.e())) {
                                    break;
                                }
                                size5 = i10;
                                i18 = i11;
                            }
                            size5 = i10;
                            i17 = i11;
                        }
                    }
                    arrayList.addAll(arrayList5);
                    arrayList2.addAll(arrayList6);
                    i12 = i13;
                } catch (JSONException e11) {
                    return y(w0.a(6, "Error trying to decode SkuDetails."), zzjs.ERROR_DECODING_SKU_DETAILS, "Got a JSON exception trying to decode UnfetchedProduct. \n Exception: ", e11);
                }
            } catch (DeadObjectException e12) {
                return y(w0.f10439j, zzjs.GET_SKU_DETAILS_SERVICE_CALL_EXCEPTION, "queryProductDetailsAsync got a remote exception (try to reconnect).", e12);
            } catch (Exception e13) {
                return y(w0.f10437h, zzjs.GET_SKU_DETAILS_SERVICE_CALL_EXCEPTION, "queryProductDetailsAsync got a remote exception (try to reconnect).", e13);
            }
        }
        return new i0(0, "", arrayList, arrayList2);
    }

    final v0 F0() {
        return this.f10205h;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final c I0(final c cVar) {
        if (Thread.interrupted()) {
            return cVar;
        }
        this.f10202e.post(new Runnable() { // from class: com.android.billingclient.api.q
            @Override // java.lang.Runnable
            public final void run() {
                a.J(this.f10403a, cVar);
            }
        });
        return cVar;
    }

    public final void W(Runnable runnable) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            runnable.run();
        } else {
            this.f10202e.post(runnable);
        }
    }

    @Override // com.android.billingclient.api.BillingClient
    public void a(final l5.a aVar, final l5.b bVar) {
        if (o(new Callable() { // from class: com.android.billingclient.api.p
            @Override // java.util.concurrent.Callable
            public final Object call() {
                a.R0(this.f10390a, bVar, aVar);
                return null;
            }
        }, CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL, new Runnable() { // from class: com.android.billingclient.api.r
            @Override // java.lang.Runnable
            public final void run() {
                a.r(this.f10409a, bVar);
            }
        }, x(), n()) == null) {
            c cVarA = A();
            d0(zzjs.MISSING_RESULT_FROM_EXECUTE_ASYNC, 3, cVarA);
            bVar.a(cVarA);
        }
    }

    @Override // com.android.billingclient.api.BillingClient
    public void b(final l5.d dVar, final l5.e eVar) {
        if (o(new Callable() { // from class: com.android.billingclient.api.s
            @Override // java.util.concurrent.Callable
            public final Object call() throws Throwable {
                a.P0(this.f10412a, eVar, dVar);
                return null;
            }
        }, CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL, new Runnable() { // from class: com.android.billingclient.api.t
            @Override // java.lang.Runnable
            public final void run() {
                a.p(this.f10416a, eVar, dVar);
            }
        }, x(), n()) == null) {
            c cVarA = A();
            d0(zzjs.MISSING_RESULT_FROM_EXECUTE_ASYNC, 4, cVarA);
            eVar.a(cVarA, dVar.a());
        }
    }

    @Override // com.android.billingclient.api.BillingClient
    public void c() {
        i0(12);
        synchronized (this.f10198a) {
            try {
                if (this.f10203f != null) {
                    this.f10203f.g();
                    try {
                        zzc.zzm("BillingClient", "Unbinding from service.");
                        s0();
                    } catch (Throwable th2) {
                        zzc.zzo("BillingClient", "There was an exception while unbinding from the service while ending connection!", th2);
                    }
                    try {
                        q0();
                    } catch (Throwable th3) {
                        try {
                            zzc.zzo("BillingClient", "There was an exception while shutting down the executor service while ending connection!", th3);
                        } catch (Throwable th4) {
                            p0(3);
                            this.K = null;
                            throw th4;
                        }
                    }
                    p0(3);
                    this.K = null;
                } else {
                    zzc.zzm("BillingClient", "Unbinding from service.");
                    s0();
                    q0();
                    p0(3);
                    this.K = null;
                }
            } catch (Throwable th5) {
                zzc.zzo("BillingClient", "There was an exception while shutting down broadcast manager while ending connection!", th5);
            }
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r23v0, types: [com.android.billingclient.api.a] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v19 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v20 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r6v0, types: [long] */
    /* JADX WARN: Type inference failed for: r6v1, types: [long] */
    @Override // com.android.billingclient.api.BillingClient
    public c d(Activity activity, b bVar) {
        boolean zG;
        long j10;
        Future futureO;
        ?? r10;
        ?? r11;
        ?? r12;
        zzjs zzjsVarZzb;
        Object obj;
        boolean z10;
        int i10;
        long jNextLong = new Random().nextLong();
        if (this.f10203f == null || this.f10203f.d() == null) {
            zzjs zzjsVar = zzjs.MISSING_LISTENER;
            c cVar = w0.E;
            e0(zzjsVar, 2, cVar, jNextLong);
            return cVar;
        }
        bVar.a();
        if (!t0(x0.c())) {
            zzjs zzjsVar2 = zzjs.SERVICE_CONNECTION_NOT_READY;
            c cVar2 = w0.f10439j;
            e0(zzjsVar2, 2, cVar2, jNextLong);
            I0(cVar2);
            return cVar2;
        }
        synchronized (this.f10198a) {
            try {
                zG = this.f10207j != null ? this.f10207j.g() : false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        ArrayList arrayListL = bVar.l();
        List listM = bVar.m();
        String string = null;
        android.support.v4.media.session.b.a(zzcg.zza(arrayListL, null));
        b.C0141b c0141b = (b.C0141b) zzcg.zza(listM, null);
        final String strD = c0141b.c().d();
        final String strE = c0141b.c().e();
        if (strE.equals(SubSampleInformationBox.TYPE) && !this.f10208k) {
            zzc.zzn("BillingClient", "Current client doesn't support subscriptions.");
            zzjs zzjsVar3 = zzjs.SUBSCRIPTIONS_NOT_SUPPORTED;
            c cVar3 = w0.f10441l;
            g0(zzjsVar3, 2, cVar3, jNextLong, zG);
            I0(cVar3);
            return cVar3;
        }
        if (bVar.w() && !this.f10211n) {
            zzc.zzn("BillingClient", "Current client doesn't support extra params for buy intent.");
            zzjs zzjsVar4 = zzjs.EXTRA_PARAMS_NOT_SUPPORTED;
            c cVar4 = w0.f10435f;
            g0(zzjsVar4, 2, cVar4, jNextLong, zG);
            I0(cVar4);
            return cVar4;
        }
        if (arrayListL.size() > 1 && !this.f10217t) {
            zzc.zzn("BillingClient", "Current client doesn't support multi-item purchases.");
            zzjs zzjsVar5 = zzjs.MULTI_ITEM_NOT_SUPPORTED;
            c cVar5 = w0.f10445p;
            g0(zzjsVar5, 2, cVar5, jNextLong, zG);
            I0(cVar5);
            return cVar5;
        }
        if (!listM.isEmpty() && !this.f10218u) {
            zzc.zzn("BillingClient", "Current client doesn't support purchases with ProductDetails.");
            zzjs zzjsVar6 = zzjs.PRODUCT_DETAILS_NOT_SUPPORTED;
            c cVar6 = w0.f10448s;
            g0(zzjsVar6, 2, cVar6, jNextLong, zG);
            I0(cVar6);
            return cVar6;
        }
        Iterator it = listM.iterator();
        while (it.hasNext()) {
            String strD2 = ((b.C0141b) it.next()).d();
            if (strD2 != null && strD2.contains(":") && !this.E) {
                zzc.zzn("BillingClient", "Current Play Store version doesn't support gift code purchase.");
                zzjs zzjsVar7 = zzjs.GIFT_CODE_PURCHASE_NOT_SUPPORTED;
                c cVar7 = w0.f10447r;
                g0(zzjsVar7, 2, cVar7, jNextLong, zG);
                I0(cVar7);
                return cVar7;
            }
        }
        c cVarF = bVar.f();
        if (cVarF != w0.f10438i) {
            g0(zzjs.INVALID_BILLING_FLOW_PARAMS, 2, cVarF, jNextLong, zG);
            I0(cVarF);
            return cVarF;
        }
        boolean z11 = zG;
        if (this.f10211n) {
            long j11 = jNextLong;
            final Bundle bundleZzf = zzc.zzf(bVar, this.f10213p, this.f10220w, this.G.a(), this.G.b(), this.I, this.f10200c, this.f10201d, this.M.longValue(), this.f10204g.getPackageName(), j11);
            if (arrayListL.isEmpty()) {
                ArrayList<String> arrayList = new ArrayList<>(listM.size() - 1);
                ArrayList<String> arrayList2 = new ArrayList<>(listM.size() - 1);
                ArrayList<String> arrayList3 = new ArrayList<>();
                ArrayList<String> arrayList4 = new ArrayList<>();
                ArrayList<String> arrayList5 = new ArrayList<>();
                ArrayList<Integer> arrayList6 = new ArrayList<>();
                for (int i11 = 0; i11 < listM.size(); i11++) {
                    b.C0141b c0141b2 = (b.C0141b) listM.get(i11);
                    g gVarC = c0141b2.c();
                    if (!gVarC.i().isEmpty()) {
                        arrayList3.add(gVarC.i());
                    }
                    String strD3 = c0141b2.d();
                    arrayList4.add(strD3);
                    String strJ = gVarC.j(strD3);
                    if (!TextUtils.isEmpty(strJ)) {
                        arrayList5.add(strJ);
                    }
                    if (i11 > 0) {
                        arrayList.add(((b.C0141b) listM.get(i11)).c().d());
                        arrayList2.add(((b.C0141b) listM.get(i11)).c().e());
                    }
                }
                bundleZzf.putStringArrayList("SKU_OFFER_ID_TOKEN_LIST", arrayList4);
                if (!arrayList6.isEmpty()) {
                    bundleZzf.putIntegerArrayList("autoPayBalanceThresholdList", arrayList6);
                }
                if (!arrayList3.isEmpty()) {
                    bundleZzf.putStringArrayList("skuDetailsTokens", arrayList3);
                }
                if (!arrayList5.isEmpty()) {
                    bundleZzf.putStringArrayList("SKU_SERIALIZED_DOCID_LIST", arrayList5);
                }
                if (!arrayList.isEmpty()) {
                    bundleZzf.putStringArrayList("additionalSkus", arrayList);
                    bundleZzf.putStringArrayList("additionalSkuTypes", arrayList2);
                }
            } else {
                ArrayList<String> arrayList7 = new ArrayList<>();
                new ArrayList();
                new ArrayList();
                new ArrayList();
                new ArrayList();
                Iterator it2 = arrayListL.iterator();
                if (it2.hasNext()) {
                    android.support.v4.media.session.b.a(it2.next());
                    throw null;
                }
                if (!arrayList7.isEmpty()) {
                    bundleZzf.putStringArrayList("skuDetailsTokens", arrayList7);
                }
                if (arrayListL.size() > 1) {
                    ArrayList<String> arrayList8 = new ArrayList<>(arrayListL.size() - 1);
                    ArrayList<String> arrayList9 = new ArrayList<>(arrayListL.size() - 1);
                    if (arrayListL.size() > 1) {
                        android.support.v4.media.session.b.a(arrayListL.get(1));
                        throw null;
                    }
                    bundleZzf.putStringArrayList("additionalSkus", arrayList8);
                    bundleZzf.putStringArrayList("additionalSkuTypes", arrayList9);
                }
            }
            if (bundleZzf.containsKey("SKU_OFFER_ID_TOKEN_LIST") && !this.f10215r) {
                zzjs zzjsVar8 = zzjs.OFFER_ID_TOKEN_NOT_SUPPORTED;
                c cVar8 = w0.f10446q;
                g0(zzjsVar8, 2, cVar8, j11, z11);
                I0(cVar8);
                return cVar8;
            }
            if (TextUtils.isEmpty(c0141b.c().h())) {
                z10 = false;
            } else {
                bundleZzf.putString("skuPackageName", c0141b.c().h());
                z10 = true;
            }
            if (!TextUtils.isEmpty(null)) {
                bundleZzf.putString("accountName", null);
            }
            Intent intent = activity.getIntent();
            if (intent == null) {
                zzc.zzn("BillingClient", "Activity's intent is null.");
            } else if (!TextUtils.isEmpty(intent.getStringExtra("PROXY_PACKAGE"))) {
                String stringExtra = intent.getStringExtra("PROXY_PACKAGE");
                bundleZzf.putString("proxyPackage", stringExtra);
                try {
                    bundleZzf.putString("proxyPackageVersion", this.f10204g.getPackageManager().getPackageInfo(stringExtra, 0).versionName);
                } catch (PackageManager.NameNotFoundException unused) {
                    bundleZzf.putString("proxyPackageVersion", "package not found");
                }
            }
            if (this.E) {
                i10 = 28;
            } else if (this.f10218u && !listM.isEmpty()) {
                i10 = 17;
            } else if (this.f10216s && z10) {
                i10 = 15;
            } else {
                i10 = this.f10213p ? 9 : 6;
            }
            final int i12 = i10;
            final b bVar2 = bVar;
            futureO = o(new Callable() { // from class: com.android.billingclient.api.n
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.f10374a.v(i12, strD, strE, bVar2, bundleZzf);
                }
            }, 5000L, null, this.f10202e, n());
            r10 = bVar2;
            j10 = j11;
        } else {
            j10 = jNextLong;
            futureO = o(new Callable() { // from class: com.android.billingclient.api.o
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.f10383a.w(strD, strE);
                }
            }, 5000L, null, this.f10202e, n());
            r10 = jNextLong;
        }
        try {
            if (futureO == null) {
                try {
                    zzjs zzjsVar9 = zzjs.MISSING_RESULT_FROM_EXECUTE_ASYNC;
                    c cVar9 = w0.f10432c;
                    g0(zzjsVar9, 2, cVar9, j10, z11);
                    I0(cVar9);
                    return cVar9;
                } catch (CancellationException e10) {
                    e = e10;
                    r12 = j10;
                    zzc.zzo("BillingClient", "Time out while launching billing flow. Try to reconnect", e);
                    zzjs zzjsVar10 = zzjs.LAUNCH_BILLING_FLOW_TIMEOUT;
                    c cVar10 = w0.f10440k;
                    h0(zzjsVar10, 2, cVar10, u0.a(e), r12, z11);
                    I0(cVar10);
                    return cVar10;
                } catch (TimeoutException e11) {
                    e = e11;
                    r12 = j10;
                    zzc.zzo("BillingClient", "Time out while launching billing flow. Try to reconnect", e);
                    zzjs zzjsVar11 = zzjs.LAUNCH_BILLING_FLOW_TIMEOUT;
                    c cVar11 = w0.f10440k;
                    h0(zzjsVar11, 2, cVar11, u0.a(e), r12, z11);
                    I0(cVar11);
                    return cVar11;
                } catch (Exception e12) {
                    e = e12;
                    r11 = j10;
                    zzc.zzo("BillingClient", "Exception while launching billing flow. Try to reconnect", e);
                    zzjs zzjsVar12 = zzjs.LAUNCH_BILLING_FLOW_EXCEPTION;
                    c cVar12 = w0.f10439j;
                    h0(zzjsVar12, 2, cVar12, u0.a(e), r11, z11);
                    I0(cVar12);
                    return cVar12;
                }
            }
            long j12 = j10;
            Bundle bundle = (Bundle) futureO.get(5000L, TimeUnit.MILLISECONDS);
            int iZzb = zzc.zzb(bundle, "BillingClient");
            String strZzj = zzc.zzj(bundle, "BillingClient");
            if (iZzb == 0) {
                Intent intent2 = new Intent(activity, (Class<?>) ProxyBillingActivity.class);
                intent2.putExtra("BUY_INTENT", (PendingIntent) bundle.getParcelable("BUY_INTENT"));
                intent2.putExtra("billingClientTransactionId", j12);
                intent2.putExtra("wasServiceAutoReconnected", z11);
                activity.startActivity(intent2);
                return w0.f10438i;
            }
            zzc.zzn("BillingClient", k.a(iZzb, "Unable to buy item, Error response code: "));
            c cVarA = w0.a(iZzb, strZzj);
            try {
                if (bundle == null || (obj = bundle.get("LOG_REASON")) == null) {
                    zzjsVarZzb = zzjs.REASON_UNSPECIFIED;
                } else if (obj instanceof Integer) {
                    zzjsVarZzb = zzjs.zzb(((Integer) obj).intValue());
                } else {
                    zzc.zzn("BillingClient", "Unexpected type for bundle log reason: " + obj.getClass().getName());
                    zzjsVarZzb = zzjs.REASON_UNSPECIFIED;
                }
            } catch (Throwable th3) {
                zzc.zzn("BillingClient", "Failed to get log reason from bundle: ".concat(String.valueOf(th3.getMessage())));
                zzjsVarZzb = zzjs.REASON_UNSPECIFIED;
            }
            if (zzjsVarZzb == zzjs.REASON_UNSPECIFIED) {
                zzjsVarZzb = zzjs.BILLING_RESULT_RECEIVED_FROM_PHONESKY;
            }
            zzjs zzjsVar13 = zzjsVarZzb;
            if (bundle != null) {
                try {
                    string = bundle.getString("ADDITIONAL_LOG_DETAILS");
                } catch (Throwable th4) {
                    zzc.zzn("BillingClient", "Failed to get additional log details from bundle: ".concat(String.valueOf(th4.getMessage())));
                }
            }
            try {
                h0(zzjsVar13, 2, cVarA, string, j12, z11);
                I0(cVarA);
                return cVarA;
            } catch (CancellationException e13) {
                e = e13;
                r12 = j12;
                z11 = z11;
                zzc.zzo("BillingClient", "Time out while launching billing flow. Try to reconnect", e);
                zzjs zzjsVar14 = zzjs.LAUNCH_BILLING_FLOW_TIMEOUT;
                c cVar13 = w0.f10440k;
                h0(zzjsVar14, 2, cVar13, u0.a(e), r12, z11);
                I0(cVar13);
                return cVar13;
            } catch (TimeoutException e14) {
                e = e14;
                r12 = j12;
                z11 = z11;
                zzc.zzo("BillingClient", "Time out while launching billing flow. Try to reconnect", e);
                zzjs zzjsVar15 = zzjs.LAUNCH_BILLING_FLOW_TIMEOUT;
                c cVar14 = w0.f10440k;
                h0(zzjsVar15, 2, cVar14, u0.a(e), r12, z11);
                I0(cVar14);
                return cVar14;
            } catch (Exception e15) {
                e = e15;
                r11 = j12;
                z11 = z11;
                zzc.zzo("BillingClient", "Exception while launching billing flow. Try to reconnect", e);
                zzjs zzjsVar16 = zzjs.LAUNCH_BILLING_FLOW_EXCEPTION;
                c cVar15 = w0.f10439j;
                h0(zzjsVar16, 2, cVar15, u0.a(e), r11, z11);
                I0(cVar15);
                return cVar15;
            }
        } catch (CancellationException e16) {
            e = e16;
            r12 = r10;
        } catch (TimeoutException e17) {
            e = e17;
            r12 = r10;
        } catch (Exception e18) {
            e = e18;
            r11 = r10;
        }
    }

    @Override // com.android.billingclient.api.BillingClient
    public void f(final h hVar, final l5.i iVar) {
        if (o(new Callable() { // from class: com.android.billingclient.api.u
            @Override // java.util.concurrent.Callable
            public final Object call() {
                a.Q0(this.f10419a, iVar, hVar);
                return null;
            }
        }, CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL, new Runnable() { // from class: com.android.billingclient.api.v
            @Override // java.lang.Runnable
            public final void run() {
                a.I(this.f10423a, iVar);
            }
        }, x(), n()) == null) {
            c cVarA = A();
            d0(zzjs.MISSING_RESULT_FROM_EXECUTE_ASYNC, 7, cVarA);
            iVar.d(cVarA, new i(zzca.zzk(), zzca.zzk()));
        }
    }

    @Override // com.android.billingclient.api.BillingClient
    public final void g(l5.m mVar, final l5.k kVar) {
        if (o(new y(this, kVar, mVar.c(), mVar.a()), CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL, new Runnable() { // from class: com.android.billingclient.api.m
            @Override // java.lang.Runnable
            public final void run() {
                a.q(this.f10370a, kVar);
            }
        }, x(), n()) == null) {
            c cVarA = A();
            d0(zzjs.MISSING_RESULT_FROM_EXECUTE_ASYNC, 9, cVarA);
            kVar.a(cVarA, zzca.zzk());
        }
    }

    @Override // com.android.billingclient.api.BillingClient
    public final c h(final Activity activity, d dVar, l5.h hVar) {
        if (!t0(x0.c())) {
            zzc.zzn("BillingClient", "Service disconnected.");
            return w0.f10439j;
        }
        if (!this.f10214q) {
            zzc.zzn("BillingClient", "Current client doesn't support showing in-app messages.");
            return w0.f10449t;
        }
        View viewFindViewById = activity.findViewById(R.id.content);
        IBinder windowToken = viewFindViewById.getWindowToken();
        if (windowToken == null) {
            zzc.zzn("BillingClient", "Could not retrieve the window token from the activity instance.");
        }
        Rect rect = new Rect();
        viewFindViewById.getGlobalVisibleRect(rect);
        final Bundle bundle = new Bundle();
        androidx.core.app.g.a(bundle, "KEY_WINDOW_TOKEN", windowToken);
        bundle.putInt("KEY_DIMEN_LEFT", rect.left);
        bundle.putInt("KEY_DIMEN_TOP", rect.top);
        bundle.putInt("KEY_DIMEN_RIGHT", rect.right);
        bundle.putInt("KEY_DIMEN_BOTTOM", rect.bottom);
        bundle.putString("playBillingLibraryVersion", this.f10200c);
        String str = this.f10201d;
        if (str != null) {
            bundle.putString("playBillingLibraryWrapperVersion", str);
        }
        bundle.putIntegerArrayList("KEY_CATEGORY_IDS", dVar.b());
        if (!TextUtils.isEmpty(null)) {
            bundle.putString("accountName", null);
        }
        Handler handler = this.f10202e;
        final z zVar = new z(this, handler, hVar);
        o(new Callable() { // from class: com.android.billingclient.api.w
            @Override // java.util.concurrent.Callable
            public final Object call() {
                a.S0(this.f10426a, bundle, activity, zVar);
                return null;
            }
        }, 5000L, null, handler, n());
        return w0.f10438i;
    }

    @Override // com.android.billingclient.api.BillingClient
    public void i(l5.c cVar) {
        r0(cVar, 0);
    }

    final synchronized ExecutorService n() {
        try {
            if (this.L == null) {
                this.L = Executors.newFixedThreadPool(zzc.zza, new x(this));
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.L;
    }

    private final zzdk B(final int i10) {
        if (this.H && !v0()) {
            return zzu.zza(new zzr() { // from class: com.android.billingclient.api.l
                @Override // com.google.android.gms.internal.play_billing.zzr
                public final Object zza(zzp zzpVar) {
                    return a.O0(this.f10365a, i10, zzpVar);
                }
            });
        }
        zzc.zzm(PvZsvNiPV.CFpDMXCVDltdBNa, "Already connected or not opted into auto reconnection.");
        return zzdf.zza(w0.f10438i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final boolean u0(long j10) {
        zzbn zzbnVarZzb = zzbn.zzb(this.N);
        int iA = x0.a();
        long jZza = j10;
        for (int i10 = 1; i10 <= iA; i10++) {
            try {
                long jMax = Math.max(0L, jZza);
                if (jMax <= 0) {
                    zzc.zzn("BillingClient", "No time remaining for reconnection attempt.");
                    return v0();
                }
                c cVar = (c) B(i10).get(jMax, TimeUnit.MILLISECONDS);
                if (cVar.c() == 0) {
                    zzc.zzm("BillingClient", UHbHibBvYxKnPE.VBXZHeiMo + cVar.c());
                    return v0();
                }
                zzc.zzn("BillingClient", "Reconnection failed with result: " + cVar.c());
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                jZza = j10 - zzbnVarZzb.zza(timeUnit);
                long jPow = ((long) Math.pow(2.0d, i10 - 1)) * 1000;
                if (jZza < jPow) {
                    zzc.zzn("BillingClient", "Reconnection failed due to timeout limit reached.");
                    return v0();
                }
                if (i10 < iA && jPow > 0) {
                    try {
                        Thread.sleep(jPow);
                        jZza = j10 - zzbnVarZzb.zza(timeUnit);
                    } catch (InterruptedException e10) {
                        Thread.currentThread().interrupt();
                        zzc.zzo("BillingClient", "Error sleeping during reconnection attempt: ", e10);
                    }
                }
            } catch (Exception e11) {
                if (e11 instanceof InterruptedException) {
                    Thread.currentThread().interrupt();
                }
                zzc.zzo("BillingClient", "Error during reconnection attempt: ", e11);
            }
        }
        zzc.zzn("BillingClient", "Max retries reached.");
        return v0();
    }

    a(String str, f fVar, Context context, l5.y yVar, v0 v0Var, ExecutorService executorService, BillingClient.Builder builder) {
        this.f10198a = new Object();
        this.f10199b = 0;
        this.f10202e = new Handler(Looper.getMainLooper());
        this.f10210m = 0;
        this.J = zzcf.zzk();
        Long lValueOf = Long.valueOf(new Random().nextLong());
        this.M = lValueOf;
        this.N = zzbf.zza();
        this.f10200c = "9.1.0";
        String strF = F();
        this.f10201d = strF;
        this.f10204g = context.getApplicationContext();
        zzke zzkeVarZza = zzkg.zza();
        zzkeVarZza.zzx("9.1.0");
        if (strF != null) {
            zzkeVarZza.zzy(strF);
        }
        zzkeVarZza.zzq(this.f10204g.getPackageName());
        zzkeVarZza.zzd(lValueOf.longValue());
        zzkeVarZza.zzw(builder.f10177j);
        zzkeVarZza.zza(Build.VERSION.SDK_INT);
        zzkeVarZza.zzp(926300087L);
        a0(zzkeVarZza, context);
        try {
            zzkeVarZza.zzb(this.f10204g.getPackageManager().getPackageInfo(this.f10204g.getPackageName(), 0).versionCode);
        } catch (Throwable th2) {
            zzc.zzo("BillingClient", "Error getting app version code.", th2);
        }
        this.f10205h = new y0(this.f10204g, (zzkg) zzkeVarZza.zzi());
        zzc.zzn("BillingClient", "Billing client should have a valid listener but the provided is null.");
        this.f10203f = new p1(this.f10204g, null, null, null, null, this.f10205h);
        this.G = fVar;
        this.f10204g.getPackageName();
        this.H = builder.f10177j;
    }

    a(String str, f fVar, Context context, l5.l lVar, v0 v0Var, ExecutorService executorService, BillingClient.Builder builder) {
        this.f10198a = new Object();
        this.f10199b = 0;
        this.f10202e = new Handler(Looper.getMainLooper());
        this.f10210m = 0;
        this.J = zzcf.zzk();
        this.M = Long.valueOf(new Random().nextLong());
        this.N = zzbf.zza();
        this.f10200c = "9.1.0";
        this.f10201d = F();
        j(context, lVar, fVar, "9.1.0", null, builder);
    }
}
