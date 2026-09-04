package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzake implements Comparable {
    private final long zza;
    private final long zzb;
    private final long zzc;

    /* synthetic */ zzake(long j10, long j11, long j12, byte[] bArr) {
        this.zza = j10;
        this.zzb = j11;
        this.zzc = j12;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return Long.compare(this.zza, ((zzake) obj).zza);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzake)) {
            return false;
        }
        zzake zzakeVar = (zzake) obj;
        return this.zza == zzakeVar.zza && this.zzb == zzakeVar.zzb && this.zzc == zzakeVar.zzc;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.zza), Long.valueOf(this.zzb), Long.valueOf(this.zzc));
    }

    final /* synthetic */ long zza() {
        return this.zza;
    }

    final /* synthetic */ long zzb() {
        return this.zzb;
    }

    final /* synthetic */ long zzc() {
        return this.zzc;
    }
}
