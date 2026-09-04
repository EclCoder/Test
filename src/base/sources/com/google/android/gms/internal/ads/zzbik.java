package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzbik implements zzblg {
    final /* synthetic */ SharedPreferences zza;

    zzbik(zzbio zzbioVar, SharedPreferences sharedPreferences) {
        this.zza = sharedPreferences;
        Objects.requireNonNull(zzbioVar);
    }

    @Override // com.google.android.gms.internal.ads.zzblg
    public final Boolean zza(String str, boolean z10) {
        try {
            return Boolean.valueOf(this.zza.getBoolean(str, z10));
        } catch (ClassCastException unused) {
            return Boolean.valueOf(this.zza.getString(str, String.valueOf(z10)));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzblg
    public final Long zzb(String str, long j10) {
        try {
            return Long.valueOf(this.zza.getLong(str, j10));
        } catch (ClassCastException unused) {
            return Long.valueOf(this.zza.getInt(str, (int) j10));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzblg
    public final Double zzc(String str, double d10) {
        try {
            return Double.valueOf(this.zza.getFloat(str, (float) d10));
        } catch (ClassCastException unused) {
            return Double.valueOf(this.zza.getString(str, String.valueOf(d10)));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzblg
    public final String zzd(String str, String str2) {
        return this.zza.getString(str, str2);
    }
}
