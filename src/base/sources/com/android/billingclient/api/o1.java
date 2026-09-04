package com.android.billingclient.api;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import com.google.android.gms.internal.play_billing.zzc;
import com.google.android.gms.internal.play_billing.zzca;
import com.google.android.gms.internal.play_billing.zzjl;
import com.google.android.gms.internal.play_billing.zzjs;
import com.google.android.gms.internal.play_billing.zzjz;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
final class o1 extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f10387a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f10388b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ p1 f10389c;

    o1(p1 p1Var, boolean z10) {
        Objects.requireNonNull(p1Var);
        this.f10389c = p1Var;
        this.f10388b = z10;
    }

    private final void d(Bundle bundle, c cVar, int i10, zzjz zzjzVar, long j10, boolean z10) {
        try {
            if (bundle.getByteArray("FAILURE_LOGGING_PAYLOAD") != null) {
                this.f10389c.f10398c.n(zzjl.zzc(bundle.getByteArray("FAILURE_LOGGING_PAYLOAD")), j10, z10);
            } else {
                this.f10389c.f10398c.n(u0.b(zzjs.BILLING_RESULT_RECEIVED_FROM_PHONESKY, i10, cVar, null, zzjzVar), j10, z10);
            }
        } catch (Throwable unused) {
            zzc.zzn("BillingBroadcastManager", "Failed parsing Api failure.");
        }
    }

    public final synchronized void a(Context context, IntentFilter intentFilter) {
        try {
            if (this.f10387a) {
                return;
            }
            if (Build.VERSION.SDK_INT >= 33) {
                context.registerReceiver(this, intentFilter, true != this.f10388b ? 4 : 2);
            } else {
                context.registerReceiver(this, intentFilter);
            }
            this.f10387a = true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void b(Context context, IntentFilter intentFilter, String str) {
        o1 o1Var;
        try {
            try {
                if (this.f10387a) {
                    return;
                }
                if (Build.VERSION.SDK_INT >= 33) {
                    o1Var = this;
                    context.registerReceiver(o1Var, intentFilter, "com.google.android.finsky.permission.PLAY_BILLING_LIBRARY_BROADCAST", null, true != this.f10388b ? 4 : 2);
                } else {
                    o1Var = this;
                    context.registerReceiver(this, intentFilter, "com.google.android.finsky.permission.PLAY_BILLING_LIBRARY_BROADCAST", null);
                }
                o1Var.f10387a = true;
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            throw th;
        }
    }

    public final synchronized void c(Context context) {
        if (!this.f10387a) {
            zzc.zzn("BillingBroadcastManager", "Receiver is not registered.");
        } else {
            context.unregisterReceiver(this);
            this.f10387a = false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x003a  */
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        zzjz zzjzVar;
        int i10;
        int i11;
        c cVarZzi;
        int iIntValue;
        String action = intent.getAction();
        int iHashCode = action.hashCode();
        if (iHashCode != -1484087650) {
            if (iHashCode != -337612916) {
                if (iHashCode == 345207161 && action.equals("com.android.vending.billing.ALTERNATIVE_BILLING")) {
                    zzjzVar = zzjz.ALTERNATIVE_BILLING_ACTION;
                } else {
                    zzjzVar = zzjz.BROADCAST_ACTION_UNSPECIFIED;
                }
            } else if (action.equals("com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED")) {
                zzjzVar = zzjz.LOCAL_PURCHASES_UPDATED_ACTION;
            } else {
                zzjzVar = zzjz.BROADCAST_ACTION_UNSPECIFIED;
            }
        } else if (action.equals("com.android.vending.billing.PURCHASES_UPDATED")) {
            zzjzVar = zzjz.PURCHASES_UPDATED_ACTION;
        } else {
            zzjzVar = zzjz.BROADCAST_ACTION_UNSPECIFIED;
        }
        zzjz zzjzVar2 = zzjzVar;
        zzjz zzjzVar3 = zzjz.LOCAL_PURCHASES_UPDATED_ACTION;
        if (zzjzVar2.equals(zzjzVar3) || zzjzVar2.equals(zzjz.ALTERNATIVE_BILLING_ACTION)) {
            i10 = 2;
            i11 = 2;
        } else {
            i11 = zzjzVar2.equals(zzjz.PURCHASES_UPDATED_ACTION) ? 32 : 1;
            i10 = 2;
        }
        Bundle extras = intent.getExtras();
        if (extras == null) {
            zzc.zzn("BillingBroadcastManager", "Bundle is null.");
            p1 p1Var = this.f10389c;
            v0 v0Var = p1Var.f10398c;
            zzjs zzjsVar = zzjs.NULL_BUNDLE_IN_BROADCAST_RECEIVER;
            c cVar = w0.f10437h;
            v0Var.m(u0.b(zzjsVar, i11, cVar, null, zzjzVar2));
            if (p1Var.f10397b != null) {
                p1Var.f10397b.b(cVar, null);
            }
        } else {
            if (i11 == i10) {
                int i12 = zzc.zza;
                c.a aVarD = c.d();
                aVarD.d(zzc.zzb(intent.getExtras(), "BillingBroadcastManager"));
                Bundle extras2 = intent.getExtras();
                if (extras2 == null) {
                    zzc.zzn("BillingBroadcastManager", "Unexpected null bundle received!");
                } else {
                    Object obj = extras2.get("SUB_RESPONSE_CODE");
                    if (obj == null) {
                        zzc.zzm("BillingBroadcastManager", "getOnPurchasesUpdatedSubResponseCodeFromBundle() got null response code, assuming OK");
                    } else {
                        if (obj instanceof Integer) {
                            iIntValue = ((Integer) obj).intValue();
                        } else {
                            zzc.zzn("BillingBroadcastManager", "Unexpected type for bundle sub response code: ".concat(obj.getClass().getName()));
                        }
                        aVarD.c(iIntValue);
                        aVarD.b(zzc.zzj(intent.getExtras(), "BillingBroadcastManager"));
                        cVarZzi = aVarD.a();
                    }
                }
                iIntValue = 0;
                aVarD.c(iIntValue);
                aVarD.b(zzc.zzj(intent.getExtras(), "BillingBroadcastManager"));
                cVarZzi = aVarD.a();
            } else {
                cVarZzi = zzc.zzi(intent, "BillingBroadcastManager");
            }
            long j10 = extras.getLong("billingClientTransactionId", 0L);
            boolean z10 = extras.getBoolean("wasServiceAutoReconnected", false);
            if (zzjzVar2.equals(zzjz.PURCHASES_UPDATED_ACTION) || zzjzVar2.equals(zzjzVar3)) {
                c cVar2 = cVarZzi;
                p1 p1Var2 = this.f10389c;
                List listZzl = zzc.zzl(extras, p1Var2.f10402g);
                if (cVar2.c() == 0) {
                    p1Var2.f10398c.c(u0.c(i11, zzjzVar2), j10, z10);
                } else {
                    d(extras, cVar2, i11, zzjzVar2, j10, z10);
                }
                p1Var2.f10397b.b(cVar2, listZzl);
                return;
            }
            if (zzjzVar2.equals(zzjz.ALTERNATIVE_BILLING_ACTION)) {
                if (cVarZzi.c() != 0) {
                    c cVar3 = cVarZzi;
                    d(extras, cVar3, i11, zzjzVar2, j10, z10);
                    this.f10389c.f10397b.b(cVar3, zzca.zzk());
                    return;
                }
                p1 p1Var3 = this.f10389c;
                p1.e(p1Var3);
                p1.b(p1Var3);
                zzc.zzn("BillingBroadcastManager", "No valid alternative billing listener is registered.");
                v0 v0Var2 = p1Var3.f10398c;
                zzjs zzjsVar2 = zzjs.NULL_DEVELOPER_MANAGED_BILLING_LISTENER;
                c cVar4 = w0.f10437h;
                v0Var2.n(u0.b(zzjsVar2, i11, cVar4, null, zzjzVar2), j10, z10);
                p1Var3.f10397b.b(cVar4, zzca.zzk());
            }
        }
    }
}
