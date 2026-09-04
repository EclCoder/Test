package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzgck extends zzgcj {
    private static zzgck zzd;

    private zzgck(Context context) {
        super(context, "paidv1_id", "paidv1_creation_time", "PaidV1LifecycleImpl");
    }

    public static final zzgck zzh(Context context) {
        zzgck zzgckVar;
        synchronized (zzgck.class) {
            try {
                if (zzd == null) {
                    zzd = new zzgck(context);
                }
                zzgckVar = zzd;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zzgckVar;
    }

    public final zzgcg zzi(long j10, boolean z10) {
        zzgcg zzgcgVarZza;
        synchronized (zzgck.class) {
            zzgcgVarZza = zza(null, null, j10, z10);
        }
        return zzgcgVarZza;
    }

    public final zzgcg zzj(String str, String str2, long j10, boolean z10) {
        zzgcg zzgcgVarZza;
        synchronized (zzgck.class) {
            zzgcgVarZza = zza(str, str2, j10, z10);
        }
        return zzgcgVarZza;
    }

    public final void zzk() {
        synchronized (zzgck.class) {
            zzc(false);
        }
    }

    public final void zzl() {
        synchronized (zzgck.class) {
            zzc(true);
        }
    }
}
