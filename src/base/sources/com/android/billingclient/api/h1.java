package com.android.billingclient.api;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.internal.play_billing.zzbo;
import com.google.android.gms.internal.play_billing.zzc;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
final class h1 extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private c f10347a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f10348b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final v0 f10349c;

    h1(v0 v0Var) {
        this.f10349c = v0Var;
    }

    final c a() {
        return this.f10347a;
    }

    final void b() {
        this.f10347a = null;
    }

    final boolean c() {
        return this.f10348b;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent == null) {
            zzc.zzn("ProxyBillingReceiver", "Null intent!");
            return;
        }
        zzc.zzm("ProxyBillingReceiver", "Received intent action: ".concat(String.valueOf(intent.getAction())));
        if (!Objects.equals(intent.getAction(), "com.android.vending.billing.IN_APP_BILLING_RESULT_UPDATE_ACTION")) {
            if (!Objects.equals(intent.getAction(), "com.android.vending.billing.PLAY_BILLING_ACTIVITY_CREATED_ACTION")) {
                zzc.zzn("ProxyBillingReceiver", "Unexpected broadcast action: ".concat(String.valueOf(intent.getAction())));
                return;
            }
            this.f10348b = true;
            v0 v0Var = this.f10349c;
            if (v0Var != null) {
                v0Var.j(intent.getLongExtra("billingClientTransactionId", 0L));
                return;
            }
            return;
        }
        if (!intent.hasExtra("RESPONSE_CODE")) {
            zzc.zzn("ProxyBillingReceiver", "Missing RESPONSE_CODE in intent.");
            v0 v0Var2 = this.f10349c;
            if (v0Var2 != null) {
                v0Var2.e(null, intent.getLongExtra("billingClientTransactionId", 0L));
                return;
            }
            return;
        }
        c.a aVarD = c.d();
        aVarD.d(intent.getIntExtra("RESPONSE_CODE", 0));
        aVarD.b(zzbo.zzc(intent.getStringExtra("DEBUG_MESSAGE")));
        c cVarA = aVarD.a();
        this.f10347a = cVarA;
        v0 v0Var3 = this.f10349c;
        if (v0Var3 != null) {
            v0Var3.e(cVarA, intent.getLongExtra("billingClientTransactionId", 0L));
        }
    }
}
