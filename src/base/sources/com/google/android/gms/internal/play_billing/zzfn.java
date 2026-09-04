package com.google.android.gms.internal.play_billing;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzfn extends zzfm {
    private final byte[] zzb;

    zzfn(byte[] bArr) {
        super(null);
        this.zzb = bArr;
    }

    @Override // com.google.android.gms.internal.play_billing.zzfp
    final byte zza(int i10) {
        return this.zzb[i10];
    }

    @Override // com.google.android.gms.internal.play_billing.zzfp
    protected final int zzc(int i10, int i11, int i12) {
        return zzgv.zzb(i10, this.zzb, 0, i12);
    }

    @Override // com.google.android.gms.internal.play_billing.zzfp
    public final int zzd() {
        return this.zzb.length;
    }

    @Override // com.google.android.gms.internal.play_billing.zzfp
    public final zzfp zze(int i10, int i11) {
        byte[] bArr = this.zzb;
        int iZzj = zzfp.zzj(0, i11, bArr.length);
        return iZzj == 0 ? zzfp.zza : new zzfj(bArr, 0, iZzj);
    }

    @Override // com.google.android.gms.internal.play_billing.zzfp
    protected final void zzf(byte[] bArr, int i10, int i11, int i12) {
        System.arraycopy(this.zzb, 0, bArr, 0, i12);
    }

    @Override // com.google.android.gms.internal.play_billing.zzfp
    final void zzg(zzfg zzfgVar) throws zzfv {
        byte[] bArr = this.zzb;
        ((zzfu) zzfgVar).zzc(bArr, 0, bArr.length);
    }

    @Override // com.google.android.gms.internal.play_billing.zzfp
    protected final boolean zzh(zzfp zzfpVar) {
        boolean z10 = zzfpVar instanceof zzfn;
        if (z10) {
            return Arrays.equals(this.zzb, ((zzfn) zzfpVar).zzb);
        }
        boolean z11 = zzfpVar instanceof zzfj;
        if (!z11) {
            return zzfpVar.zzh(this);
        }
        byte[] bArr = this.zzb;
        int iZzd = zzfpVar.zzd();
        int length = bArr.length;
        if (length > iZzd) {
            throw new IllegalArgumentException("Length too large: " + length + length);
        }
        if (length <= zzfpVar.zzd()) {
            if (z10) {
                return zzfp.zzl(bArr, 0, ((zzfn) zzfpVar).zzb, 0, length);
            }
            if (!z11) {
                return zzfpVar.zze(0, length).equals(zze(0, length));
            }
            zzfj zzfjVar = (zzfj) zzfpVar;
            return zzfp.zzl(bArr, 0, zzfjVar.zzb, zzfjVar.zzc, length);
        }
        throw new IllegalArgumentException("Ran off end of other: 0, " + length + ", " + zzfpVar.zzd());
    }
}
