package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.spec.ECPoint;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzhux {
    private zzhuu zza = null;
    private ECPoint zzb = null;
    private Integer zzc = null;

    private zzhux() {
    }

    public final zzhux zza(zzhuu zzhuuVar) {
        this.zza = zzhuuVar;
        return this;
    }

    public final zzhux zzb(ECPoint eCPoint) {
        this.zzb = eCPoint;
        return this;
    }

    public final zzhux zzc(Integer num) {
        this.zzc = num;
        return this;
    }

    public final zzhuy zzd() throws GeneralSecurityException {
        zziaz zziazVarZza;
        zzhuu zzhuuVar = this.zza;
        if (zzhuuVar == null) {
            throw new GeneralSecurityException("Cannot build without parameters");
        }
        ECPoint eCPoint = this.zzb;
        if (eCPoint == null) {
            throw new GeneralSecurityException("Cannot build without public point");
        }
        zzhlg.zza(eCPoint, zzhuuVar.zzd().zza().getCurve());
        if (this.zza.zza() && this.zzc == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!this.zza.zza() && this.zzc != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        if (this.zza.zzf() == zzhut.zzd) {
            zziazVarZza = zzhms.zza;
        } else if (this.zza.zzf() == zzhut.zzc || this.zza.zzf() == zzhut.zzb) {
            zziazVarZza = zzhms.zza(this.zzc.intValue());
        } else {
            if (this.zza.zzf() != zzhut.zza) {
                throw new IllegalStateException("Unknown EcdsaParameters.Variant: ".concat(this.zza.zzf().toString()));
            }
            zziazVarZza = zzhms.zzb(this.zzc.intValue());
        }
        return new zzhuy(this.zza, this.zzb, zziazVarZza, this.zzc, null);
    }

    /* synthetic */ zzhux(byte[] bArr) {
    }
}
