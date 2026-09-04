package com.google.android.gms.internal.common;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
abstract class zzv extends zzk {
    final CharSequence zzb;
    final zzp zzc;
    final boolean zzd;
    int zze = 0;
    int zzf = Integer.MAX_VALUE;

    zzv(zzw zzwVar, CharSequence charSequence) {
        this.zzc = zzwVar.zzf();
        this.zzd = zzwVar.zzg();
        this.zzb = charSequence;
    }

    @Override // com.google.android.gms.internal.common.zzk
    protected final /* bridge */ /* synthetic */ Object zza() {
        int iZzd;
        int i10 = this.zze;
        while (true) {
            int i11 = this.zze;
            if (i11 == -1) {
                zzb();
                return null;
            }
            int iZzc = zzc(i11);
            if (iZzc == -1) {
                iZzc = this.zzb.length();
                this.zze = -1;
                iZzd = -1;
            } else {
                iZzd = zzd(iZzc);
                this.zze = iZzd;
            }
            if (iZzd == i10) {
                int i12 = iZzd + 1;
                this.zze = i12;
                if (i12 > this.zzb.length()) {
                    this.zze = -1;
                }
            } else {
                if (i10 < iZzc) {
                    this.zzb.charAt(i10);
                }
                if (i10 < iZzc) {
                    this.zzb.charAt(iZzc - 1);
                }
                if (!this.zzd || i10 != iZzc) {
                    int i13 = this.zzf;
                    if (i13 == 1) {
                        CharSequence charSequence = this.zzb;
                        int length = charSequence.length();
                        this.zze = -1;
                        if (length > i10) {
                            charSequence.charAt(length - 1);
                        }
                        iZzc = length;
                    } else {
                        this.zzf = i13 - 1;
                    }
                    return this.zzb.subSequence(i10, iZzc).toString();
                }
                i10 = this.zze;
            }
        }
    }

    abstract int zzc(int i10);

    abstract int zzd(int i10);
}
