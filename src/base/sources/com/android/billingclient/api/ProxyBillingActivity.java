package com.android.billingclient.api;

import android.app.Activity;
import android.app.ActivityOptions;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.IntentSender;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.ResultReceiver;
import com.bytedance.adsdk.ugeno.ojm.hnj.mzIi.obFGmWgqyy;
import com.bytedance.sdk.component.hn.hnj.yiH.PAFNPq;
import com.google.android.gms.internal.play_billing.zzc;
import com.google.android.gms.internal.play_billing.zzjs;
import com.google.android.gms.internal.play_billing.zzjz;
import com.google.android.gms.internal.play_billing.zzke;
import com.google.android.gms.internal.play_billing.zzkg;
import com.google.android.gms.internal.play_billing.zzla;
import com.google.android.gms.internal.play_billing.zzld;
import com.mbridge.msdk.mbnative.report.RN.lkCBSIFlvmyGX;
import qd.qPi.SVWsZyNSAChGIA;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public class ProxyBillingActivity extends Activity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ResultReceiver f10178a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f10179b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f10180c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f10181d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f10182e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f10183f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    h1 f10184g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    v0 f10185h;

    private zzjs a(int i10, Intent intent) {
        if (intent != null) {
            if (intent.getExtras() == null) {
                return zzjs.NULL_BUNDLE_IN_ACTIVITY_RESULT;
            }
            return i10 == 5 ? zzjs.PLAY_STORE_ON_CREATE_RUNTIME_EXCEPTION : zzjs.REASON_UNSPECIFIED;
        }
        if (i10 == -1) {
            return zzjs.NULL_DATA_WITH_OK_RESULT_CODE_IN_PROXY_BILLING_ACTIVITY_RESULT;
        }
        if (i10 == 0) {
            return zzjs.NULL_DATA_WITH_CANCELLED_RESULT_CODE_IN_PROXY_BILLING_ACTIVITY_RESULT;
        }
        if (i10 != 3) {
            return i10 != 4 ? zzjs.NULL_DATA_WITH_OTHER_RESULT_CODE_IN_PROXY_BILLING_ACTIVITY_RESULT : zzjs.NULL_DATA_WITH_PLAY_CANCELED_WITHOUT_COMPLETE_ACTION_RESULT_CODE;
        }
        return zzjs.NULL_DATA_WITH_PLAY_CANCELED_RESULT_CODE;
    }

    private boolean b(Bundle bundle) {
        if (bundle != null) {
            return bundle.containsKey("in_app_message_result_receiver");
        }
        if (getIntent() == null) {
            return false;
        }
        return getIntent().hasExtra("IN_APP_MESSAGE_INTENT");
    }

    private boolean c(int i10, Intent intent) {
        return !a(i10, intent).equals(zzjs.REASON_UNSPECIFIED);
    }

    private boolean d() {
        return this.f10184g != null;
    }

    private Intent e(String str) {
        Intent intent = new Intent("com.android.vending.billing.ALTERNATIVE_BILLING");
        intent.setPackage(getApplicationContext().getPackageName());
        intent.putExtra("ALTERNATIVE_BILLING_USER_CHOICE_DATA", str);
        return intent;
    }

    private Intent g() {
        Intent intent = new Intent("com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED");
        intent.setPackage(getApplicationContext().getPackageName());
        return intent;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0037 A[Catch: all -> 0x0022, TryCatch #1 {all -> 0x0022, blocks: (B:5:0x001d, B:28:0x0068, B:21:0x0031, B:23:0x0037, B:25:0x005e, B:24:0x004b), top: B:30:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:24:0x004b A[Catch: all -> 0x0022, TryCatch #1 {all -> 0x0022, blocks: (B:5:0x001d, B:28:0x0068, B:21:0x0031, B:23:0x0037, B:25:0x005e, B:24:0x004b), top: B:30:0x0001 }] */
    private synchronized void h() throws Throwable {
        ProxyBillingActivity proxyBillingActivity;
        try {
            try {
                this.f10184g = new h1(this.f10185h);
                IntentFilter intentFilter = new IntentFilter("com.android.vending.billing.IN_APP_BILLING_RESULT_UPDATE_ACTION");
                intentFilter.addAction("com.android.vending.billing.PLAY_BILLING_ACTIVITY_CREATED_ACTION");
                proxyBillingActivity = this;
                try {
                    androidx.core.content.a.registerReceiver(proxyBillingActivity, this.f10184g, intentFilter, "com.google.android.finsky.permission.PLAY_BILLING_LIBRARY_BROADCAST", null, 2);
                } catch (NoSuchMethodError e10) {
                    e = e10;
                    proxyBillingActivity.f10184g = null;
                    if (e instanceof NoSuchMethodError) {
                        v0 v0Var = proxyBillingActivity.f10185h;
                        zzla zzlaVarZza = zzld.zza();
                        zzlaVarZza.zza(2);
                        v0Var.k((zzld) zzlaVarZza.zzi());
                    } else {
                        v0 v0Var2 = proxyBillingActivity.f10185h;
                        zzla zzlaVarZza2 = zzld.zza();
                        zzlaVarZza2.zza(1);
                        v0Var2.k((zzld) zzlaVarZza2.zzi());
                    }
                    zzc.zzo("ProxyBillingActivity", lkCBSIFlvmyGX.BIpHw, e);
                } catch (RuntimeException e11) {
                    e = e11;
                    proxyBillingActivity.f10184g = null;
                    if (e instanceof NoSuchMethodError) {
                        v0 v0Var3 = proxyBillingActivity.f10185h;
                        zzla zzlaVarZza3 = zzld.zza();
                        zzlaVarZza3.zza(2);
                        v0Var3.k((zzld) zzlaVarZza3.zzi());
                    } else {
                        v0 v0Var4 = proxyBillingActivity.f10185h;
                        zzla zzlaVarZza4 = zzld.zza();
                        zzlaVarZza4.zza(1);
                        v0Var4.k((zzld) zzlaVarZza4.zzi());
                    }
                    zzc.zzo("ProxyBillingActivity", lkCBSIFlvmyGX.BIpHw, e);
                }
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        } catch (NoSuchMethodError e12) {
            e = e12;
            proxyBillingActivity = this;
            proxyBillingActivity.f10184g = null;
            if (e instanceof NoSuchMethodError) {
                v0 v0Var5 = proxyBillingActivity.f10185h;
                zzla zzlaVarZza5 = zzld.zza();
                zzlaVarZza5.zza(2);
                v0Var5.k((zzld) zzlaVarZza5.zzi());
            } else {
                v0 v0Var6 = proxyBillingActivity.f10185h;
                zzla zzlaVarZza6 = zzld.zza();
                zzlaVarZza6.zza(1);
                v0Var6.k((zzld) zzlaVarZza6.zzi());
            }
            zzc.zzo("ProxyBillingActivity", lkCBSIFlvmyGX.BIpHw, e);
        } catch (RuntimeException e13) {
            e = e13;
            proxyBillingActivity = this;
            proxyBillingActivity.f10184g = null;
            if (e instanceof NoSuchMethodError) {
                v0 v0Var7 = proxyBillingActivity.f10185h;
                zzla zzlaVarZza7 = zzld.zza();
                zzlaVarZza7.zza(2);
                v0Var7.k((zzld) zzlaVarZza7.zzi());
            } else {
                v0 v0Var8 = proxyBillingActivity.f10185h;
                zzla zzlaVarZza8 = zzld.zza();
                zzlaVarZza8.zza(1);
                v0Var8.k((zzld) zzlaVarZza8.zzi());
            }
            zzc.zzo("ProxyBillingActivity", lkCBSIFlvmyGX.BIpHw, e);
        } catch (Throwable th3) {
            th = th3;
            throw th;
        }
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        c cVarA;
        super.onDestroy();
        if (d()) {
            cVarA = this.f10184g.a();
            try {
                unregisterReceiver(this.f10184g);
            } catch (RuntimeException e10) {
                zzc.zzo("ProxyBillingActivity", "Failed to unregister receiver.", e10);
            }
        } else {
            cVarA = null;
        }
        if (isFinishing() && this.f10179b) {
            Intent intentG = g();
            if (cVarA != null) {
                intentG.putExtra("RESPONSE_CODE", cVarA.c());
                intentG.putExtra("DEBUG_MESSAGE", cVarA.a());
            } else {
                intentG.putExtra("RESPONSE_CODE", 1);
                intentG.putExtra("DEBUG_MESSAGE", "Billing dialog closed.");
            }
            if (this.f10180c) {
                intentG.putExtra("IS_FIRST_PARTY_PURCHASE", true);
            }
            int i10 = this.f10181d;
            if (i10 == 110 || i10 == 100) {
                intentG.putExtra("INTENT_SOURCE", "LAUNCH_BILLING_FLOW");
                intentG.putExtra("billingClientTransactionId", this.f10182e);
            }
            sendBroadcast(intentG);
        }
    }

    @Override // android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        ResultReceiver resultReceiver = this.f10178a;
        if (resultReceiver != null) {
            bundle.putParcelable("in_app_message_result_receiver", resultReceiver);
        }
        bundle.putBoolean("send_cancelled_broadcast_if_finished", this.f10179b);
        bundle.putBoolean("IS_FLOW_FROM_FIRST_PARTY_CLIENT", this.f10180c);
        bundle.putInt("activity_code", this.f10181d);
        bundle.putLong("billingClientTransactionId", this.f10182e);
        bundle.putBoolean("wasServiceAutoReconnected", this.f10183f);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0068  */
    private Intent f(zzjs zzjsVar, long j10, boolean z10) {
        Intent intentG = g();
        if (z10) {
            if (d() && this.f10184g.a() != null) {
                c cVarA = this.f10184g.a();
                intentG.putExtra("RESPONSE_CODE", cVarA.c());
                intentG.putExtra("DEBUG_MESSAGE", cVarA.a());
            } else if (d() && !this.f10184g.c()) {
                intentG.putExtra("RESPONSE_CODE", 3);
                intentG.putExtra("DEBUG_MESSAGE", "Play Store is blocked.");
                c.a aVarD = c.d();
                aVarD.d(3);
                aVarD.b("Play Store is blocked.");
                c cVarA2 = aVarD.a();
                zzjs zzjsVar2 = zzjs.PLAY_STORE_APP_BLOCKED;
                int i10 = u0.f10422a;
                intentG.putExtra("FAILURE_LOGGING_PAYLOAD", u0.b(zzjsVar2, 2, cVarA2, null, zzjz.BROADCAST_ACTION_UNSPECIFIED).zzQ());
            } else {
                intentG.putExtra("RESPONSE_CODE", 6);
                String str = SVWsZyNSAChGIA.MAHDvvgQFP;
                intentG.putExtra("DEBUG_MESSAGE", str);
                c.a aVarD2 = c.d();
                aVarD2.d(6);
                aVarD2.b(str);
                c cVarA3 = aVarD2.a();
                int i11 = u0.f10422a;
                intentG.putExtra("FAILURE_LOGGING_PAYLOAD", u0.b(zzjsVar, 2, cVarA3, null, zzjz.BROADCAST_ACTION_UNSPECIFIED).zzQ());
            }
        } else {
            intentG.putExtra("RESPONSE_CODE", 6);
            String str2 = SVWsZyNSAChGIA.MAHDvvgQFP;
            intentG.putExtra("DEBUG_MESSAGE", str2);
            c.a aVarD3 = c.d();
            aVarD3.d(6);
            aVarD3.b(str2);
            c cVarA4 = aVarD3.a();
            int i12 = u0.f10422a;
            intentG.putExtra("FAILURE_LOGGING_PAYLOAD", u0.b(zzjsVar, 2, cVarA4, null, zzjz.BROADCAST_ACTION_UNSPECIFIED).zzQ());
        }
        intentG.putExtra("INTENT_SOURCE", "LAUNCH_BILLING_FLOW");
        intentG.putExtra("billingClientTransactionId", j10);
        intentG.putExtra("wasServiceAutoReconnected", this.f10183f);
        return intentG;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0067 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:26:0x0069  */
    /* JADX WARN: Code duplicated, block: B:27:0x006a A[PHI: r10
      0x006a: PHI (r10v1 int) = (r10v0 int), (r10v15 int) binds: [B:24:0x0065, B:26:0x0069] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:29:0x0089  */
    /* JADX WARN: Code duplicated, block: B:30:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:32:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:35:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:37:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:38:0x00be  */
    /* JADX WARN: Code duplicated, block: B:40:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:42:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:43:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:46:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:6:0x0011  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Instruction removed from duplicated block: B:27:0x006a, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:29:0x0089, please report this as an issue */
    @Override // android.app.Activity
    protected void onActivityResult(int i10, int i11, Intent intent) {
        boolean z10;
        int iC;
        int i12;
        String string;
        Intent intentG;
        boolean z11;
        int iZza;
        super.onActivityResult(i10, i11, intent);
        if (i10 != 100) {
            if (i10 == 110) {
                if (intent == null) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                iC = zzc.zzi(intent, "ProxyBillingActivity").c();
                i12 = -1;
                if (i11 != -1) {
                    if (iC != 0) {
                        i11 = -1;
                        zzc.zzn("ProxyBillingActivity", "Activity finished with resultCode " + i11 + " and billing's responseCode: " + iC);
                        i12 = i11;
                    }
                } else {
                    zzc.zzn("ProxyBillingActivity", "Activity finished with resultCode " + i11 + " and billing's responseCode: " + iC);
                    i12 = i11;
                }
                if (true != z10) {
                    zzc.zzn("ProxyBillingActivity", "Got null data with resultCode " + i12 + "!");
                } else if (intent.getExtras() == null) {
                    zzc.zzn("ProxyBillingActivity", "Got null bundle!");
                }
                if (c(i12, intent)) {
                    zzjs zzjsVarA = a(i12, intent);
                    long j10 = this.f10182e;
                    if (intent == null) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    intentG = f(zzjsVarA, j10, z11);
                } else {
                    string = intent.getExtras().getString("ALTERNATIVE_BILLING_USER_CHOICE_DATA");
                    if (string != null) {
                        intentG = e(string);
                        intentG.putExtra("INTENT_SOURCE", "LAUNCH_BILLING_FLOW");
                    } else {
                        intentG = g();
                        intentG.putExtras(intent.getExtras());
                        intentG.putExtra("INTENT_SOURCE", "LAUNCH_BILLING_FLOW");
                    }
                    intentG.putExtra(obFGmWgqyy.NxYjQUH, this.f10182e);
                    intentG.putExtra("wasServiceAutoReconnected", this.f10183f);
                }
                if (i10 == 110) {
                    intentG.putExtra("IS_FIRST_PARTY_PURCHASE", true);
                }
                sendBroadcast(intentG);
            } else if (i10 == 101) {
                int i13 = zzc.zza;
                Bundle extras = null;
                if (intent == null) {
                    zzc.zzn("ProxyBillingActivity", "Got null intent!");
                    intent = null;
                    iZza = 0;
                } else {
                    iZza = zzc.zza(intent.getExtras(), "ProxyBillingActivity");
                }
                ResultReceiver resultReceiver = this.f10178a;
                if (resultReceiver != null) {
                    if (intent != null) {
                        extras = intent.getExtras();
                    }
                    resultReceiver.send(iZza, extras);
                }
            } else {
                zzc.zzn("ProxyBillingActivity", "Got onActivityResult with wrong requestCode: " + i10 + "; skipping...");
            }
        } else {
            if (intent == null) {
                z10 = false;
            } else {
                z10 = true;
            }
            iC = zzc.zzi(intent, "ProxyBillingActivity").c();
            i12 = -1;
            if (i11 != -1) {
                if (iC != 0) {
                    i11 = -1;
                    zzc.zzn("ProxyBillingActivity", "Activity finished with resultCode " + i11 + " and billing's responseCode: " + iC);
                    i12 = i11;
                }
            } else {
                zzc.zzn("ProxyBillingActivity", "Activity finished with resultCode " + i11 + " and billing's responseCode: " + iC);
                i12 = i11;
            }
            if (true != z10) {
                zzc.zzn("ProxyBillingActivity", "Got null data with resultCode " + i12 + "!");
            } else if (intent.getExtras() == null) {
                zzc.zzn("ProxyBillingActivity", "Got null bundle!");
            }
            if (c(i12, intent)) {
                zzjs zzjsVarA2 = a(i12, intent);
                long j11 = this.f10182e;
                if (intent == null) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                intentG = f(zzjsVarA2, j11, z11);
            } else {
                string = intent.getExtras().getString("ALTERNATIVE_BILLING_USER_CHOICE_DATA");
                if (string != null) {
                    intentG = e(string);
                    intentG.putExtra("INTENT_SOURCE", "LAUNCH_BILLING_FLOW");
                } else {
                    intentG = g();
                    intentG.putExtras(intent.getExtras());
                    intentG.putExtra("INTENT_SOURCE", "LAUNCH_BILLING_FLOW");
                }
                intentG.putExtra(obFGmWgqyy.NxYjQUH, this.f10182e);
                intentG.putExtra("wasServiceAutoReconnected", this.f10183f);
            }
            if (i10 == 110) {
                intentG.putExtra("IS_FIRST_PARTY_PURCHASE", true);
            }
            sendBroadcast(intentG);
        }
        this.f10179b = false;
        if (d()) {
            this.f10184g.b();
        }
        finish();
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) throws Throwable {
        int i10;
        PendingIntent pendingIntent;
        Bundle bundle2;
        Bundle bundle3;
        super.onCreate(bundle);
        if (!b(bundle)) {
            try {
                i10 = getPackageManager().getPackageInfo(getPackageName(), 0).versionCode;
            } catch (PackageManager.NameNotFoundException e10) {
                zzc.zzo("ProxyBillingActivity", "Failed to get package info for current package.", e10);
                i10 = -1;
            }
            if (this.f10185h == null) {
                Context applicationContext = getApplicationContext();
                zzke zzkeVarZza = zzkg.zza();
                zzkeVarZza.zzq(getPackageName());
                zzkeVarZza.zzx("9.1.0");
                zzkeVarZza.zzb(i10);
                zzkeVarZza.zza(Build.VERSION.SDK_INT);
                zzkeVarZza.zzp(926300087L);
                this.f10185h = new y0(applicationContext, (zzkg) zzkeVarZza.zzi());
            }
            h();
        }
        if (bundle == null) {
            zzc.zzm("ProxyBillingActivity", "Launching Play Store billing flow");
            this.f10181d = 100;
            if (getIntent().hasExtra("BUY_INTENT")) {
                pendingIntent = (PendingIntent) getIntent().getParcelableExtra("BUY_INTENT");
                if (getIntent().hasExtra("IS_FLOW_FROM_FIRST_PARTY_CLIENT") && getIntent().getBooleanExtra("IS_FLOW_FROM_FIRST_PARTY_CLIENT", false)) {
                    this.f10180c = true;
                    this.f10181d = 110;
                }
            } else if (getIntent().hasExtra("IN_APP_MESSAGE_INTENT")) {
                pendingIntent = (PendingIntent) getIntent().getParcelableExtra("IN_APP_MESSAGE_INTENT");
                this.f10178a = (ResultReceiver) getIntent().getParcelableExtra("in_app_message_result_receiver");
                this.f10181d = 101;
            } else {
                pendingIntent = null;
            }
            if (getIntent().hasExtra("billingClientTransactionId")) {
                this.f10182e = getIntent().getLongExtra("billingClientTransactionId", 0L);
            }
            if (getIntent().hasExtra("wasServiceAutoReconnected")) {
                this.f10183f = getIntent().getBooleanExtra("wasServiceAutoReconnected", false);
            }
            try {
                this.f10179b = true;
                int i11 = Build.VERSION.SDK_INT;
                if (i11 >= 36) {
                    bundle3 = ActivityOptions.makeBasic().setPendingIntentBackgroundActivityStartMode(3).toBundle();
                } else {
                    if (i11 >= 34) {
                        bundle3 = ActivityOptions.makeBasic().setPendingIntentBackgroundActivityStartMode(1).toBundle();
                    } else {
                        bundle2 = null;
                    }
                    startIntentSenderForResult(pendingIntent.getIntentSender(), this.f10181d, new Intent(), 0, 0, 0, bundle2);
                    return;
                }
                bundle2 = bundle3;
                startIntentSenderForResult(pendingIntent.getIntentSender(), this.f10181d, new Intent(), 0, 0, 0, bundle2);
                return;
            } catch (IntentSender.SendIntentException e11) {
                zzc.zzo("ProxyBillingActivity", PAFNPq.CgdBQdt, e11);
                ResultReceiver resultReceiver = this.f10178a;
                if (resultReceiver != null) {
                    resultReceiver.send(0, null);
                } else {
                    Intent intentF = f(zzjs.INTENT_SENDER_EXCEPTION, this.f10182e, false);
                    if (this.f10180c) {
                        intentF.putExtra("IS_FIRST_PARTY_PURCHASE", true);
                    }
                    sendBroadcast(intentF);
                }
                this.f10179b = false;
                finish();
                return;
            }
        }
        zzc.zzm("ProxyBillingActivity", "Launching Play Store billing flow from savedInstanceState");
        this.f10179b = bundle.getBoolean("send_cancelled_broadcast_if_finished", false);
        if (bundle.containsKey("in_app_message_result_receiver")) {
            this.f10178a = (ResultReceiver) bundle.getParcelable("in_app_message_result_receiver");
        }
        this.f10180c = bundle.getBoolean("IS_FLOW_FROM_FIRST_PARTY_CLIENT", false);
        this.f10181d = bundle.getInt("activity_code", 100);
        if (bundle.containsKey("billingClientTransactionId")) {
            this.f10182e = bundle.getLong("billingClientTransactionId");
        }
        if (bundle.containsKey("wasServiceAutoReconnected")) {
            this.f10183f = bundle.getBoolean("wasServiceAutoReconnected");
        }
    }
}
