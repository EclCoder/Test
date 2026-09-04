package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzhzp implements zzhek {
    private final byte[] zza;
    private final byte[] zzb;
    private final byte[] zzc;

    /* synthetic */ zzhzp(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        if (!zzhkr.zza(1)) {
            throw new IllegalStateException(new GeneralSecurityException("Can not use Ed25519 in FIPS-mode."));
        }
        if (bArr.length != 32) {
            throw new IllegalArgumentException(String.format("Given public key's length is not %s.", 32));
        }
        this.zza = (byte[]) bArr.clone();
        this.zzb = bArr2;
        this.zzc = bArr3;
        zzhlc.zzd();
    }

    private final void zzb(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr.length != 64) {
            throw new GeneralSecurityException(String.format("The length of the signature is not %s.", 64));
        }
        if (!zzhlc.zzc(bArr2, bArr, this.zza)) {
            throw new GeneralSecurityException("Signature check failed.");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhek
    public final void zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.zzb;
        int length = bArr3.length;
        if (length == 0 && this.zzc.length == 0) {
            zzb(bArr, bArr2);
        } else {
            if (!zzhnz.zze(bArr3, bArr)) {
                throw new GeneralSecurityException("Invalid signature (output prefix mismatch)");
            }
            byte[] bArr4 = this.zzc;
            if (bArr4.length != 0) {
                bArr2 = zzhzl.zza(bArr2, bArr4);
            }
            zzb(Arrays.copyOfRange(bArr, length, bArr.length), bArr2);
        }
    }
}
