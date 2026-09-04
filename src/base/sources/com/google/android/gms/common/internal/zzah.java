package com.google.android.gms.common.internal;

import android.app.PendingIntent;
import android.content.ContentProviderClient;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class zzah {
    private static final Uri zza = new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").build();

    static Intent zza(Context context, zzn zznVar) throws zzaf {
        Bundle bundleCall;
        String strZza = zznVar.zza();
        if (strZza == null) {
            return new Intent().setComponent(zznVar.zzc());
        }
        Intent intent = null;
        if (zznVar.zzd()) {
            Bundle bundle = new Bundle();
            bundle.putString("serviceActionBundleKey", strZza);
            try {
                ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient = context.getContentResolver().acquireUnstableContentProviderClient(zza);
                if (contentProviderClientAcquireUnstableContentProviderClient == null) {
                    throw new RemoteException("Failed to acquire ContentProviderClient");
                }
                try {
                    bundleCall = contentProviderClientAcquireUnstableContentProviderClient.call("serviceIntentCall", null, bundle);
                    contentProviderClientAcquireUnstableContentProviderClient.release();
                    if (bundleCall != null) {
                        Intent intent2 = (Intent) bundleCall.getParcelable("serviceResponseIntentKey");
                        if (intent2 != null) {
                            intent = intent2;
                        } else {
                            PendingIntent pendingIntent = (PendingIntent) bundleCall.getParcelable("serviceMissingResolutionIntentKey");
                            if (pendingIntent != null) {
                                StringBuilder sb2 = new StringBuilder(strZza.length() + 72);
                                sb2.append("Dynamic lookup for intent failed for action ");
                                sb2.append(strZza);
                                sb2.append(" but has possible resolution");
                                Log.w("ServiceBindIntentUtils", sb2.toString());
                                throw new zzaf(new ConnectionResult(25, pendingIntent));
                            }
                        }
                    }
                    if (intent == null) {
                        Log.w("ServiceBindIntentUtils", "Dynamic lookup for intent failed for action: ".concat(strZza));
                    }
                } catch (Throwable th2) {
                    contentProviderClientAcquireUnstableContentProviderClient.release();
                    throw th2;
                }
            } catch (RemoteException e10) {
                e = e10;
                Log.w("ServiceBindIntentUtils", "Dynamic intent resolution failed: ".concat(e.toString()));
                bundleCall = null;
            } catch (IllegalArgumentException e11) {
                e = e11;
                Log.w("ServiceBindIntentUtils", "Dynamic intent resolution failed: ".concat(e.toString()));
                bundleCall = null;
            }
        }
        return intent == null ? new Intent(strZza).setPackage(zznVar.zzb()) : intent;
    }
}
