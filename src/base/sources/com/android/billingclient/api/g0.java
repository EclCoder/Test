package com.android.billingclient.api;

import android.os.Bundle;
import com.bytedance.adsdk.ugeno.ojm.hnj.mzIi.obFGmWgqyy;
import com.google.android.gms.internal.play_billing.zzaj;
import com.google.android.gms.internal.play_billing.zzc;
import com.google.android.gms.internal.play_billing.zzce;
import com.google.android.gms.internal.play_billing.zzjs;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
final class g0 extends zzaj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final f0 f10332a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Boolean f10333b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final int f10334c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ a f10335d;

    /* synthetic */ g0(a aVar, f0 f0Var, Boolean bool, int i10, l5.q qVar) {
        Objects.requireNonNull(aVar);
        this.f10335d = aVar;
        this.f10332a = f0Var;
        this.f10333b = bool;
        this.f10334c = i10;
    }

    private final void B(f0 f0Var, c cVar, zzjs zzjsVar, boolean z10, String str, int i10) {
        this.f10335d.p0(0);
        f0Var.i(cVar, zzjsVar, str, z10, i10);
        f0Var.k(cVar);
    }

    @Override // com.google.android.gms.internal.play_billing.zzak
    public final void zza(Bundle bundle) {
        if (bundle == null) {
            zzc.zzn("BillingClient", "Response bundle is null.");
            B(this.f10332a, w0.f10437h, zzjs.NULL_BUNDLE_RETURNED_BY_PHONESKY, this.f10333b.booleanValue(), null, this.f10334c);
            return;
        }
        if (!bundle.containsKey("RESPONSE_CODE")) {
            zzc.zzn("BillingClient", "Response bundle doesn't contain a response code");
            B(this.f10332a, w0.f10437h, zzjs.RESPONSE_CODE_NOT_SET_IN_BUNDLE, this.f10333b.booleanValue(), null, this.f10334c);
            return;
        }
        if (bundle.getInt("RESPONSE_CODE") != 0) {
            B(this.f10332a, w0.a(bundle.getInt("RESPONSE_CODE"), bundle.getString("DEBUG_MESSAGE", "")), zzjs.NON_OK_CODE_RETURNED_BY_PHONESKY, this.f10333b.booleanValue(), "Response code from Phonesky: " + bundle.getInt("RESPONSE_CODE"), this.f10334c);
            return;
        }
        if (!bundle.containsKey("BILLING_API_VERSION_KEY")) {
            zzc.zzn("BillingClient", "Billing API version not found in response bundle.");
            B(this.f10332a, w0.f10437h, zzjs.BILLING_API_VERSION_NOT_SET_IN_BUNDLE, this.f10333b.booleanValue(), null, this.f10334c);
            return;
        }
        int i10 = bundle.getInt("BILLING_API_VERSION_KEY");
        a aVar = this.f10335d;
        a.S(aVar, i10);
        aVar.f10209l = i10 >= 5;
        aVar.f10208k = i10 >= 3;
        Bundle bundle2 = bundle.getBundle("EXPERIMENT_VALUES_KEY");
        if (bundle2 != null) {
            try {
                x0.g(bundle2.getBoolean("DELEGATION_API_ENABLED_KEY"));
            } catch (Throwable th2) {
                zzc.zzo("BillingClient", "Error reading EnableDelegationApi experiment flag: ".concat(bundle2.toString()), th2);
            }
            try {
                x0.f(bundle2.getLong("AUTO_SERVICE_RECONNECTION_SYNCHRONOUS_TIMEOUT_MS_KEY"));
            } catch (Throwable th3) {
                zzc.zzo("BillingClient", obFGmWgqyy.YwOetyQ.concat(bundle2.toString()), th3);
            }
            try {
                x0.d(bundle2.getLong("AUTO_SERVICE_RECONNECTION_ASYNCHRONOUS_TIMEOUT_MS_KEY"));
            } catch (Throwable th4) {
                zzc.zzo("BillingClient", "Error reading AutoServiceReconnectionAsynchronousTimeoutMs experiment flag: ".concat(bundle2.toString()), th4);
            }
            try {
                x0.e(bundle2.getInt("AUTO_SERVICE_RECONNECTION_MAX_NUM_RETRIES_KEY"));
            } catch (Throwable th5) {
                zzc.zzo("BillingClient", "Error reading AutoServiceReconnectionMaxNumRetries experiment flag: ".concat(bundle2.toString()), th5);
            }
            try {
                x0.h(bundle2.getBoolean("ENABLE_DEDUPLICATE_SERVICE_DISCONNECTED_CALLBACK"));
            } catch (Throwable th6) {
                zzc.zzo("BillingClient", "Error reading EnableDeduplicateServiceDisconnectedCallback experiment flag: ".concat(bundle2.toString()), th6);
            }
        }
        Bundle bundle3 = bundle.getBundle("ENABLED_SUBSCRIPTION_CLIENT_ACTIONS_KEY");
        if (bundle3 != null) {
            zzce zzceVar = new zzce();
            for (l5.e0 e0Var : l5.e0.values()) {
                if (bundle3.getBoolean(e0Var.name(), false)) {
                    zzceVar.zzb(e0Var);
                }
            }
            a aVar2 = this.f10335d;
            aVar2.J = zzceVar.zzc();
            if (aVar2.f10203f != null) {
                aVar2.f10203f.i(aVar2.J);
            }
        }
        a aVar3 = this.f10335d;
        if (aVar3.f10210m < 3) {
            zzc.zzn("BillingClient", "In-app billing API version 3 is not supported on this device.");
            B(this.f10332a, w0.f10431b, zzjs.ONE_TIME_PRODUCT_NOT_SUPPORTED, this.f10333b.booleanValue(), null, this.f10334c);
            return;
        }
        f0 f0Var = this.f10332a;
        Boolean bool = this.f10333b;
        int i11 = this.f10334c;
        boolean zBooleanValue = bool.booleanValue();
        a.U(aVar3, 0);
        synchronized (aVar3.f10198a) {
            try {
                if (aVar3.f10199b == 3) {
                    return;
                }
                f0Var.j(zBooleanValue, i11);
                f0Var.k(w0.f10438i);
            } catch (Throwable th7) {
                throw th7;
            }
        }
    }
}
