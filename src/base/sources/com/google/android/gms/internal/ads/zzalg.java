package com.google.android.gms.internal.ads;

import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzalg implements zzald {
    private final int zza;
    private final int zzb;
    private final zzet zzc;

    public zzalg(zzfy zzfyVar, zzv zzvVar) {
        zzet zzetVar = zzfyVar.zza;
        this.zzc = zzetVar;
        zzetVar.zzh(12);
        int iZzH = zzetVar.zzH();
        if (MimeTypes.AUDIO_RAW.equals(zzvVar.zzp)) {
            int iZzG = zzfl.zzG(zzvVar.zzJ) * zzvVar.zzH;
            if (iZzH % iZzG != 0) {
                StringBuilder sb2 = new StringBuilder(String.valueOf(iZzG).length() + 66 + String.valueOf(iZzH).length());
                sb2.append("Audio sample size mismatch. stsd sample size: ");
                sb2.append(iZzG);
                sb2.append(", stsz sample size: ");
                sb2.append(iZzH);
                zzeg.zzc("BoxParsers", sb2.toString());
                iZzH = iZzG;
            }
        }
        this.zza = iZzH == 0 ? -1 : iZzH;
        this.zzb = zzetVar.zzH();
    }

    @Override // com.google.android.gms.internal.ads.zzald
    public final int zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzald
    public final int zzb() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzald
    public final int zzc() {
        int i10 = this.zza;
        return i10 == -1 ? this.zzc.zzH() : i10;
    }
}
