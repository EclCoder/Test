package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzeby implements zzdjz {
    private final Bundle zza = new Bundle();

    @Override // com.google.android.gms.internal.ads.zzdjz
    public final synchronized void zza(String str) {
        this.zza.putInt(str, 1);
    }

    @Override // com.google.android.gms.internal.ads.zzdjz
    public final synchronized void zzb(String str) {
        this.zza.putInt(str, 2);
    }

    @Override // com.google.android.gms.internal.ads.zzdjz
    public final synchronized void zzc(String str, String str2) {
        this.zza.putInt(str, 3);
    }

    public final synchronized Bundle zzg() {
        return new Bundle(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzdjz
    public final void zze() {
    }

    @Override // com.google.android.gms.internal.ads.zzdjz
    public final void zzf() {
    }

    @Override // com.google.android.gms.internal.ads.zzdjz
    public final void zzd(String str) {
    }
}
