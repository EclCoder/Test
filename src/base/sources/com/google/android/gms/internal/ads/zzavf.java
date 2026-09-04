package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzavf implements zzave {
    @Override // com.google.android.gms.internal.ads.zzave
    public final byte zza(zzavq zzavqVar, int i10) {
        return zzavqVar.zzb(i10);
    }

    @Override // com.google.android.gms.internal.ads.zzave
    public final zzavq zzb(zzavq zzavqVar, int i10, int i11) {
        byte[] bArr;
        int length;
        if (i10 < 0 || i10 > i11 || i11 > (length = (bArr = zzavqVar.zza).length) || i10 > i11 || i11 > length) {
            throw new IndexOutOfBoundsException();
        }
        return new zzavq(zzavq.zzh(bArr, i10, i11 - i10));
    }

    @Override // com.google.android.gms.internal.ads.zzave
    public final zzave zzc() {
        return new zzavf();
    }
}
