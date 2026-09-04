package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzgch {
    private static zzgch zzb;
    final zzgci zza;

    private zzgch(Context context) {
        this.zza = zzgci.zza(context);
    }

    public static final zzgch zza(Context context) {
        zzgch zzgchVar;
        synchronized (zzgch.class) {
            try {
                if (zzb == null) {
                    zzb = new zzgch(context);
                }
                zzgchVar = zzb;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zzgchVar;
    }

    public final void zzb(boolean z10) {
        synchronized (zzgch.class) {
            try {
                zzgci zzgciVar = this.zza;
                zzgciVar.zzb("paidv2_publisher_option", Boolean.valueOf(z10));
                if (!z10) {
                    zzgciVar.zzf("paidv2_creation_time");
                    zzgciVar.zzf("paidv2_id");
                    zzgciVar.zzf("vendor_scoped_gpid_v2_id");
                    zzgciVar.zzf("vendor_scoped_gpid_v2_creation_time");
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean zzc() {
        boolean zZze;
        synchronized (zzgch.class) {
            zZze = this.zza.zze("paidv2_publisher_option", true);
        }
        return zZze;
    }

    public final void zzd(boolean z10) {
        synchronized (zzgch.class) {
            this.zza.zzb("paidv2_user_option", Boolean.valueOf(z10));
        }
    }

    public final boolean zze() {
        boolean zZze;
        synchronized (zzgch.class) {
            zZze = this.zza.zze("paidv2_user_option", true);
        }
        return zZze;
    }
}
