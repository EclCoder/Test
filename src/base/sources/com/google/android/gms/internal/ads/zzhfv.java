package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzhfv {
    private Integer zza = null;
    private Integer zzb = null;
    private Integer zzc = null;
    private zzhfw zzd = zzhfw.zzc;

    private zzhfv() {
    }

    public final zzhfv zza(int i10) throws InvalidAlgorithmParameterException {
        if (i10 != 16 && i10 != 24 && i10 != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(i10)));
        }
        this.zza = Integer.valueOf(i10);
        return this;
    }

    public final zzhfv zzb(int i10) {
        this.zzb = 12;
        return this;
    }

    public final zzhfv zzc(int i10) {
        this.zzc = 16;
        return this;
    }

    public final zzhfv zzd(zzhfw zzhfwVar) {
        this.zzd = zzhfwVar;
        return this;
    }

    public final zzhfx zze() throws GeneralSecurityException {
        Integer num = this.zza;
        if (num == null) {
            throw new GeneralSecurityException("Key size is not set");
        }
        if (this.zzd == null) {
            throw new GeneralSecurityException("Variant is not set");
        }
        if (this.zzb == null) {
            throw new GeneralSecurityException("IV size is not set");
        }
        if (this.zzc == null) {
            throw new GeneralSecurityException("Tag size is not set");
        }
        int iIntValue = num.intValue();
        this.zzb.getClass();
        this.zzc.getClass();
        return new zzhfx(iIntValue, 12, 16, this.zzd, null);
    }

    /* synthetic */ zzhfv(byte[] bArr) {
    }
}
