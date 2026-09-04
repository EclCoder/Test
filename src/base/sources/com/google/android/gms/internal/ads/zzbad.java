package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Base64;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzbad {
    public static final String zza(Context context, String str, long j10, boolean z10) {
        try {
            zzayx zzayxVarZza = zzayy.zza();
            zzayxVarZza.zzb(str);
            zzayxVarZza.zza("0.828153725");
            zzayxVarZza.zzd(context.getPackageName());
            zzayxVarZza.zzf((System.currentTimeMillis() - j10) / 1000);
            zzayxVarZza.zzc(System.currentTimeMillis() / 1000);
            try {
                zzayxVarZza.zze(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode);
            } catch (PackageManager.NameNotFoundException unused) {
                zzayxVarZza.zze(-1L);
            }
            zzaze zzazeVarZzc = zzazo.zzc(((zzayy) zzayxVarZza.zzbu()).zzaN(), null);
            zzazeVarZzc.zzc(5);
            zzazeVarZzc.zzd(2);
            return Base64.encodeToString(((zzazf) zzazeVarZzc.zzbu()).zzaN(), 11);
        } catch (UnsupportedEncodingException | GeneralSecurityException unused2) {
            return Integer.toString(7);
        }
    }
}
