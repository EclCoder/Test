package com.android.billingclient.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.os.ResultReceiver;
import com.google.android.gms.internal.play_billing.zzas;
import com.google.android.gms.internal.play_billing.zzc;
import java.lang.ref.WeakReference;
import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
final class h0 extends zzas {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final WeakReference f10345a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final ResultReceiver f10346b;

    /* synthetic */ h0(WeakReference weakReference, ResultReceiver resultReceiver, l5.q qVar) {
        this.f10345a = weakReference;
        this.f10346b = resultReceiver;
    }

    @Override // com.google.android.gms.internal.play_billing.zzat
    public final void zza(Bundle bundle) {
        ResultReceiver resultReceiver = this.f10346b;
        if (resultReceiver == null) {
            zzc.zzn("BillingClient", "Unable to send result for in-app messaging");
            return;
        }
        if (bundle == null) {
            resultReceiver.send(0, null);
            return;
        }
        Activity activity = (Activity) this.f10345a.get();
        PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable("KEY_LAUNCH_INTENT");
        if (activity == null || pendingIntent == null) {
            resultReceiver.send(0, null);
            zzc.zzn("BillingClient", "Unable to launch intent for in-app messaging");
            return;
        }
        try {
            Intent intent = new Intent(activity, (Class<?>) ProxyBillingActivity.class);
            intent.putExtra("in_app_message_result_receiver", resultReceiver);
            intent.putExtra("IN_APP_MESSAGE_INTENT", pendingIntent);
            activity.startActivity(intent);
        } catch (CancellationException e10) {
            this.f10346b.send(0, null);
            zzc.zzo("BillingClient", "Exception caught while launching intent for in-app messaging.", e10);
        }
    }
}
