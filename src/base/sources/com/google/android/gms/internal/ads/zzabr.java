package com.google.android.gms.internal.ads;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzabr implements zzabl {
    private int zza;
    private int zzb;
    private int zzc = 0;
    private zzabj[] zzd = new zzabj[100];

    public zzabr(boolean z10, int i10) {
    }

    @Override // com.google.android.gms.internal.ads.zzabl
    public final synchronized zzabj zza() {
        zzabj zzabjVar;
        try {
            this.zzb++;
            int i10 = this.zzc;
            if (i10 > 0) {
                zzabj[] zzabjVarArr = this.zzd;
                int i11 = i10 - 1;
                this.zzc = i11;
                zzabjVar = zzabjVarArr[i11];
                if (zzabjVar == null) {
                    throw null;
                }
                zzabjVarArr[i11] = null;
            } else {
                zzabjVar = new zzabj(new byte[C.DEFAULT_BUFFER_SEGMENT_SIZE], 0);
                int i12 = this.zzb;
                zzabj[] zzabjVarArr2 = this.zzd;
                int length = zzabjVarArr2.length;
                if (i12 > length) {
                    this.zzd = (zzabj[]) Arrays.copyOf(zzabjVarArr2, length + length);
                    return zzabjVar;
                }
            }
            return zzabjVar;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzabl
    public final synchronized void zzb(zzabj zzabjVar) {
        zzabj[] zzabjVarArr = this.zzd;
        int i10 = this.zzc;
        this.zzc = i10 + 1;
        zzabjVarArr[i10] = zzabjVar;
        this.zzb--;
    }

    @Override // com.google.android.gms.internal.ads.zzabl
    public final synchronized void zzc(zzabk zzabkVar) {
        while (zzabkVar != null) {
            zzabj[] zzabjVarArr = this.zzd;
            int i10 = this.zzc;
            this.zzc = i10 + 1;
            zzabjVarArr[i10] = zzabkVar.zzd();
            this.zzb--;
            zzabkVar = zzabkVar.zze();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzabl
    public final synchronized void zzd() {
        int i10 = this.zza;
        String str = zzfl.zza;
        int iMax = Math.max(0, ((i10 + 65535) / C.DEFAULT_BUFFER_SEGMENT_SIZE) - this.zzb);
        int i11 = this.zzc;
        if (iMax >= i11) {
            return;
        }
        Arrays.fill(this.zzd, iMax, i11, (Object) null);
        this.zzc = iMax;
    }

    public final synchronized void zze() {
        zzf(0);
    }

    public final synchronized void zzf(int i10) {
        int i11 = this.zza;
        this.zza = i10;
        if (i10 < i11) {
            zzd();
        }
    }

    public final synchronized int zzg() {
        return this.zzb * C.DEFAULT_BUFFER_SEGMENT_SIZE;
    }

    public final synchronized int zzh() {
        return this.zzc * C.DEFAULT_BUFFER_SEGMENT_SIZE;
    }
}
