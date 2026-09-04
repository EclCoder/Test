package com.android.billingclient.api;

import android.app.PendingIntent;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.ResultReceiver;
import com.google.android.gms.internal.play_billing.zzc;
import com.google.android.gms.internal.play_billing.zzjs;
import com.mbridge.msdk.mbnative.report.RN.lkCBSIFlvmyGX;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public class ProxyBillingActivityV2 extends androidx.activity.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private f.c f10186a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private f.c f10187b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private f.c f10188c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private f.c f10189d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private f.c f10190e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private f.c f10191f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private ResultReceiver f10192g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private ResultReceiver f10193h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private ResultReceiver f10194i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private ResultReceiver f10195j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private ResultReceiver f10196k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private ResultReceiver f10197l;

    private static final androidx.core.app.c k0() {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 36) {
            return androidx.core.app.c.a().b(3);
        }
        if (i10 >= 34) {
            return androidx.core.app.c.a().b(1);
        }
        return null;
    }

    final void e0(f.a aVar) {
        Intent intentA = aVar.a();
        int iC = zzc.zzi(intentA, "ProxyBillingActivityV2").c();
        ResultReceiver resultReceiver = this.f10192g;
        if (resultReceiver != null) {
            resultReceiver.send(iC, intentA == null ? null : intentA.getExtras());
        }
        if (aVar.b() != -1 || iC != 0) {
            zzc.zzn("ProxyBillingActivityV2", "Alternative billing only dialog finished with resultCode " + aVar.b() + " and billing's responseCode: " + iC);
        }
        finish();
    }

    final void f0(f.a aVar) {
        Intent intentA = aVar.a();
        int iC = zzc.zzi(intentA, "ProxyBillingActivityV2").c();
        ResultReceiver resultReceiver = this.f10196k;
        if (resultReceiver != null) {
            resultReceiver.send(iC, intentA == null ? null : intentA.getExtras());
        }
        if (aVar.b() != -1 || iC != 0) {
            zzc.zzn("ProxyBillingActivityV2", "Billing program info dialog finished with resultCode " + aVar.b() + " and billing's responseCode: " + iC);
        }
        finish();
    }

    final void g0(f.a aVar) {
        Intent intentA = aVar.a();
        int iC = zzc.zzi(intentA, "ProxyBillingActivityV2").c();
        ResultReceiver resultReceiver = this.f10193h;
        if (resultReceiver != null) {
            resultReceiver.send(iC, intentA == null ? null : intentA.getExtras());
        }
        if (aVar.b() != -1 || iC != 0) {
            zzc.zzn("ProxyBillingActivityV2", String.format("External offer dialog finished with resultCode: %s and billing's responseCode: %s", Integer.valueOf(aVar.b()), Integer.valueOf(iC)));
        }
        finish();
    }

    final void h0(f.a aVar) {
        Intent intentA = aVar.a();
        Bundle extras = intentA == null ? null : intentA.getExtras();
        if (aVar.b() != -1) {
            if (extras == null) {
                extras = new Bundle();
            }
            zzc.zzn("ProxyBillingActivityV2", String.format("External offer flow finished with resultCode: %s", Integer.valueOf(aVar.b())));
            extras.putInt("INTERNAL_LOG_ERROR_REASON", zzjs.ERROR_IN_ACTIVITY_RESULT.zza());
            extras.putString("INTERNAL_LOG_ERROR_ADDITIONAL_DETAILS", String.format("External offer flow finished with error resultCode: %s", Integer.valueOf(aVar.b())));
        }
        int iC = zzc.zzi(intentA, "ProxyBillingActivityV2").c();
        ResultReceiver resultReceiver = this.f10194i;
        if (resultReceiver != null) {
            resultReceiver.send(iC, extras);
        } else {
            zzc.zzn("ProxyBillingActivityV2", "External offer flow result receiver is null");
        }
        if (iC != 0) {
            zzc.zzn("ProxyBillingActivityV2", String.format("External offer flow finished with billing responseCode: %s", Integer.valueOf(iC)));
        }
        finish();
    }

    final void i0(f.a aVar) {
        Intent intentA = aVar.a();
        Bundle extras = intentA == null ? null : intentA.getExtras();
        if (aVar.b() != -1) {
            if (extras == null) {
                extras = new Bundle();
            }
            zzc.zzn("ProxyBillingActivityV2", String.format("Launch external link flow finished with resultCode: %s", Integer.valueOf(aVar.b())));
            extras.putInt("INTERNAL_LOG_ERROR_REASON", zzjs.ERROR_IN_ACTIVITY_RESULT.zza());
            extras.putString("INTERNAL_LOG_ERROR_ADDITIONAL_DETAILS", String.format("Launch external link flow finished with error resultCode: %s", Integer.valueOf(aVar.b())));
        }
        int iC = zzc.zzi(intentA, "ProxyBillingActivityV2").c();
        ResultReceiver resultReceiver = this.f10195j;
        if (resultReceiver != null) {
            resultReceiver.send(iC, extras);
        } else {
            zzc.zzn("ProxyBillingActivityV2", "Launch external link flow result receiver is null");
        }
        if (iC != 0) {
            zzc.zzn("ProxyBillingActivityV2", String.format("Launch external link flow finished with billing responseCode: %s", Integer.valueOf(iC)));
        }
        finish();
    }

    final void j0(f.a aVar) {
        Intent intentA = aVar.a();
        int iC = zzc.zzi(intentA, "ProxyBillingActivityV2").c();
        ResultReceiver resultReceiver = this.f10197l;
        if (resultReceiver != null) {
            resultReceiver.send(iC, intentA == null ? null : intentA.getExtras());
        }
        if (aVar.b() != -1 || iC != 0) {
            zzc.zzn("ProxyBillingActivityV2", String.format("Subscription management action finished with resultCode: %s and billing's responseCode: %s", Integer.valueOf(aVar.b()), Integer.valueOf(iC)));
        }
        finish();
    }

    @Override // androidx.activity.p, androidx.core.app.h, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f10186a = registerForActivityResult(new g.g(), new f.b() { // from class: com.android.billingclient.api.b1
            @Override // f.b
            public final void a(Object obj) {
                this.f10250a.e0((f.a) obj);
            }
        });
        this.f10187b = registerForActivityResult(new g.g(), new f.b() { // from class: com.android.billingclient.api.c1
            @Override // f.b
            public final void a(Object obj) {
                this.f10259a.g0((f.a) obj);
            }
        });
        this.f10188c = registerForActivityResult(new g.g(), new f.b() { // from class: com.android.billingclient.api.d1
            @Override // f.b
            public final void a(Object obj) {
                this.f10263a.h0((f.a) obj);
            }
        });
        this.f10189d = registerForActivityResult(new g.g(), new f.b() { // from class: com.android.billingclient.api.e1
            @Override // f.b
            public final void a(Object obj) {
                this.f10267a.i0((f.a) obj);
            }
        });
        this.f10190e = registerForActivityResult(new g.g(), new f.b() { // from class: com.android.billingclient.api.f1
            @Override // f.b
            public final void a(Object obj) {
                this.f10277a.f0((f.a) obj);
            }
        });
        this.f10191f = registerForActivityResult(new g.g(), new f.b() { // from class: com.android.billingclient.api.g1
            @Override // f.b
            public final void a(Object obj) {
                this.f10336a.j0((f.a) obj);
            }
        });
        if (bundle != null) {
            if (bundle.containsKey("alternative_billing_only_dialog_result_receiver")) {
                this.f10192g = (ResultReceiver) bundle.getParcelable("alternative_billing_only_dialog_result_receiver");
            }
            if (bundle.containsKey("external_payment_dialog_result_receiver")) {
                this.f10193h = (ResultReceiver) bundle.getParcelable("external_payment_dialog_result_receiver");
            }
            if (bundle.containsKey("external_offer_flow_result_receiver")) {
                this.f10194i = (ResultReceiver) bundle.getParcelable("external_offer_flow_result_receiver");
            }
            if (bundle.containsKey("launch_external_link_result_receiver")) {
                this.f10195j = (ResultReceiver) bundle.getParcelable("launch_external_link_result_receiver");
            }
            if (bundle.containsKey("billing_program_information_dialog_result_receiver")) {
                this.f10196k = (ResultReceiver) bundle.getParcelable("billing_program_information_dialog_result_receiver");
            }
            if (bundle.containsKey("subscription_management_action_result_receiver")) {
                this.f10197l = (ResultReceiver) bundle.getParcelable("subscription_management_action_result_receiver");
                return;
            }
            return;
        }
        zzc.zzm("ProxyBillingActivityV2", "Launching Play Store billing dialog");
        if (getIntent().hasExtra("ALTERNATIVE_BILLING_ONLY_DIALOG_INTENT")) {
            PendingIntent pendingIntent = (PendingIntent) getIntent().getParcelableExtra("ALTERNATIVE_BILLING_ONLY_DIALOG_INTENT");
            this.f10192g = (ResultReceiver) getIntent().getParcelableExtra("alternative_billing_only_dialog_result_receiver");
            this.f10186a.c(new f.h.a(pendingIntent).a(), k0());
            return;
        }
        if (getIntent().hasExtra("external_payment_dialog_pending_intent")) {
            PendingIntent pendingIntent2 = (PendingIntent) getIntent().getParcelableExtra("external_payment_dialog_pending_intent");
            this.f10193h = (ResultReceiver) getIntent().getParcelableExtra("external_payment_dialog_result_receiver");
            this.f10187b.c(new f.h.a(pendingIntent2).a(), k0());
            return;
        }
        if (getIntent().hasExtra("external_offer_flow_pending_intent")) {
            PendingIntent pendingIntent3 = (PendingIntent) getIntent().getParcelableExtra("external_offer_flow_pending_intent");
            this.f10194i = (ResultReceiver) getIntent().getParcelableExtra("external_offer_flow_result_receiver");
            this.f10188c.c(new f.h.a(pendingIntent3).a(), k0());
            return;
        }
        if (getIntent().hasExtra("launch_external_link_flow_pending_intent")) {
            PendingIntent pendingIntent4 = (PendingIntent) getIntent().getParcelableExtra("launch_external_link_flow_pending_intent");
            this.f10195j = (ResultReceiver) getIntent().getParcelableExtra("launch_external_link_result_receiver");
            this.f10189d.c(new f.h.a(pendingIntent4).a(), k0());
        } else if (getIntent().hasExtra("billing_program_information_dialog_pending_intent")) {
            PendingIntent pendingIntent5 = (PendingIntent) getIntent().getParcelableExtra("billing_program_information_dialog_pending_intent");
            this.f10196k = (ResultReceiver) getIntent().getParcelableExtra("billing_program_information_dialog_result_receiver");
            this.f10190e.c(new f.h.a(pendingIntent5).a(), k0());
        } else if (getIntent().hasExtra("SUBSCRIPTION_MANAGEMENT_INTENT")) {
            PendingIntent pendingIntent6 = (PendingIntent) getIntent().getParcelableExtra("SUBSCRIPTION_MANAGEMENT_INTENT");
            this.f10197l = (ResultReceiver) getIntent().getParcelableExtra("subscription_management_action_result_receiver");
            this.f10191f.c(new f.h.a(pendingIntent6).a(), k0());
        }
    }

    @Override // androidx.activity.p, androidx.core.app.h, android.app.Activity
    protected final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        ResultReceiver resultReceiver = this.f10192g;
        if (resultReceiver != null) {
            bundle.putParcelable("alternative_billing_only_dialog_result_receiver", resultReceiver);
        }
        ResultReceiver resultReceiver2 = this.f10193h;
        if (resultReceiver2 != null) {
            bundle.putParcelable(lkCBSIFlvmyGX.YZMjcLJfVH, resultReceiver2);
        }
        ResultReceiver resultReceiver3 = this.f10194i;
        if (resultReceiver3 != null) {
            bundle.putParcelable("external_offer_flow_result_receiver", resultReceiver3);
        }
        ResultReceiver resultReceiver4 = this.f10195j;
        if (resultReceiver4 != null) {
            bundle.putParcelable("launch_external_link_result_receiver", resultReceiver4);
        }
        ResultReceiver resultReceiver5 = this.f10196k;
        if (resultReceiver5 != null) {
            bundle.putParcelable("billing_program_information_dialog_result_receiver", resultReceiver5);
        }
        ResultReceiver resultReceiver6 = this.f10197l;
        if (resultReceiver6 != null) {
            bundle.putParcelable("subscription_management_action_result_receiver", resultReceiver6);
        }
    }
}
