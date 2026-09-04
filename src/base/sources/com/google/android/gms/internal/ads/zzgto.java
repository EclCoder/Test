package com.google.android.gms.internal.ads;

import ta.QXA.YSHErhbVu;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzgto extends zzgth {
    private final Object zza;

    zzgto(Object obj) {
        this.zza = obj;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzgto) {
            return this.zza.equals(((zzgto) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode() + 1502476572;
    }

    public final String toString() {
        String string = this.zza.toString();
        StringBuilder sb2 = new StringBuilder(string.length() + 13);
        sb2.append("Optional.of(");
        sb2.append(string);
        sb2.append(")");
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzgth
    public final Object zza(Object obj) {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzgth
    public final zzgth zzb(zzgta zzgtaVar) {
        Object objApply = zzgtaVar.apply(this.zza);
        zzgtj.zzk(objApply, YSHErhbVu.iyMCfTGDpIuvpsn);
        return new zzgto(objApply);
    }
}
