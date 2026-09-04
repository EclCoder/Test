package com.google.android.gms.internal.measurement;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.util.Log;
import com.google.android.gms.common.util.PlatformVersion;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzql extends BroadcastReceiver {
    static volatile zzqj zza;
    private static volatile zzqk zzb;

    public static void zza(Context context, zzqk zzqkVar, zzqj zzqjVar) {
        if (zzb == null) {
            synchronized (zzql.class) {
                try {
                    if (zzb == null) {
                        if (!Objects.equals(context.getPackageName(), "com.google.android.gms")) {
                            if (PlatformVersion.isAtLeastT()) {
                                context.registerReceiver(new zzql(), new IntentFilter("com.google.android.gms.phenotype.UPDATE"), 2);
                            } else {
                                context.registerReceiver(new zzql(), new IntentFilter("com.google.android.gms.phenotype.UPDATE"));
                            }
                        }
                        zzb = zzqkVar;
                        zza = zzqjVar;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String stringExtra = intent.getStringExtra("com.google.android.gms.phenotype.PACKAGE_NAME");
        if (stringExtra == null) {
            return;
        }
        if (stringExtra.contains("../") || stringExtra.contains("/..")) {
            StringBuilder sb2 = new StringBuilder(stringExtra.length() + 68);
            sb2.append("Got an invalid config package for P/H that includes '..': ");
            sb2.append(stringExtra);
            sb2.append(". Exiting.");
            Log.w("PhUpdateBroadcastRecv", sb2.toString());
            return;
        }
        zzqk zzqkVar = zzb;
        if (zzqkVar == null) {
            Log.w("PhUpdateBroadcastRecv", "No callback registered for P/H UPDATE broadcast. Exiting.");
        } else {
            zzqkVar.zza(stringExtra);
        }
    }
}
