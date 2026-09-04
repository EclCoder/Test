package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzgtr extends zzgtw {
    zzgtr(zzgty zzgtyVar, CharSequence charSequence, int i10) {
        super(zzgtyVar, charSequence);
    }

    @Override // com.google.android.gms.internal.ads.zzgtw
    public final int zzc(int i10) {
        int i11 = i10 + 4000;
        if (i11 < ((zzgtw) this).zzb.length()) {
            return i11;
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzgtw
    public final int zzd(int i10) {
        return i10;
    }
}
