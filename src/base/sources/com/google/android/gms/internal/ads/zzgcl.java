package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzgcl extends zzgcj {
    private static zzgcl zzd;

    private zzgcl(Context context) {
        super(context, "paidv2_id", "paidv2_creation_time", "PaidV2LifecycleImpl");
    }

    public static final zzgcl zzh(Context context) {
        zzgcl zzgclVar;
        synchronized (zzgcl.class) {
            try {
                if (zzd == null) {
                    zzd = new zzgcl(context);
                }
                zzgclVar = zzd;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zzgclVar;
    }

    public final zzgcg zzi(long j10, boolean z10) {
        synchronized (zzgcl.class) {
            try {
                if (this.zzc.zzc()) {
                    return zza(null, null, j10, z10);
                }
                return new zzgcg();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void zzj() {
        synchronized (zzgcl.class) {
            try {
                if (zzg(false)) {
                    zzc(false);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
