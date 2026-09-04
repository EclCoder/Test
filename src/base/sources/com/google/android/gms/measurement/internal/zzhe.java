package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzhe {
    final /* synthetic */ zzhh zza;
    private final String zzb;
    private final long zzc;
    private boolean zzd;
    private long zze;

    public zzhe(zzhh zzhhVar, String str, long j10) {
        Objects.requireNonNull(zzhhVar);
        this.zza = zzhhVar;
        Preconditions.checkNotEmpty(str);
        this.zzb = str;
        this.zzc = j10;
    }

    public final long zza() {
        if (!this.zzd) {
            this.zzd = true;
            zzhh zzhhVar = this.zza;
            this.zze = zzhhVar.zzd().getLong(this.zzb, this.zzc);
        }
        return this.zze;
    }

    public final void zzb(long j10) {
        SharedPreferences.Editor editorEdit = this.zza.zzd().edit();
        editorEdit.putLong(this.zzb, j10);
        editorEdit.apply();
        this.zze = j10;
    }
}
