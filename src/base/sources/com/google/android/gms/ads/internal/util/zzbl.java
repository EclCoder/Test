package com.google.android.gms.ads.internal.util;

import android.content.Context;
import com.google.android.gms.common.util.ClientLibraryUtils;
import com.google.android.gms.internal.ads.zzasm;
import com.google.android.gms.internal.ads.zzath;
import com.google.android.gms.internal.ads.zzauj;
import com.google.android.gms.internal.ads.zzbiq;
import com.google.android.gms.internal.ads.zzcfw;
import com.google.api.client.http.HttpMethods;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class zzbl {
    private static zzath zza;
    private static final Object zzb = new Object();

    /* JADX WARN: Code duplicated, block: B:16:0x0036 A[Catch: all -> 0x0034, TryCatch #0 {all -> 0x0034, blocks: (B:7:0x0010, B:9:0x0014, B:11:0x001d, B:13:0x002f, B:17:0x003b, B:16:0x0036, B:18:0x003d), top: B:22:0x0010 }] */
    public zzbl(Context context) {
        zzath zzathVarZza;
        context = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        synchronized (zzb) {
            try {
                if (zza == null) {
                    zzbiq.zza(context);
                    if (ClientLibraryUtils.isPackageSide()) {
                        zzathVarZza = zzauj.zza(context, null);
                    } else {
                        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzfq)).booleanValue()) {
                            zzathVarZza = zzay.zzb(context);
                        } else {
                            zzathVarZza = zzauj.zza(context, null);
                        }
                    }
                    zza = zzathVarZza;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final ListenableFuture zza(String str) {
        zzcfw zzcfwVar = new zzcfw();
        zza.zzb(new zzbk(str, null, zzcfwVar));
        return zzcfwVar;
    }

    public final ListenableFuture zzb(int i10, String str, Map map, byte[] bArr) {
        zzbi zzbiVar = new zzbi(null);
        zzbg zzbgVar = new zzbg(this, str, zzbiVar);
        com.google.android.gms.ads.internal.util.client.zzl zzlVar = new com.google.android.gms.ads.internal.util.client.zzl(null);
        zzbh zzbhVar = new zzbh(this, i10, str, zzbiVar, zzbgVar, bArr, map, zzlVar);
        if (com.google.android.gms.ads.internal.util.client.zzl.zzj()) {
            try {
                zzlVar.zzb(str, HttpMethods.GET, zzbhVar.zzm(), zzbhVar.zzn());
            } catch (zzasm e10) {
                String message = e10.getMessage();
                int i11 = zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi(message);
            }
        }
        zza.zzb(zzbhVar);
        return zzbiVar;
    }
}
