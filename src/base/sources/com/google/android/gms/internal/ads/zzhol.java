package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzhol {
    private zzhov zza = null;
    private zzibb zzb = null;
    private Integer zzc = null;

    private zzhol() {
    }

    public final zzhol zza(zzhov zzhovVar) {
        this.zza = zzhovVar;
        return this;
    }

    public final zzhol zzb(zzibb zzibbVar) {
        this.zzb = zzibbVar;
        return this;
    }

    public final zzhol zzc(Integer num) {
        this.zzc = num;
        return this;
    }

    public final zzhom zzd() throws GeneralSecurityException {
        zzibb zzibbVar;
        zziaz zziazVarZza;
        zzhov zzhovVar = this.zza;
        if (zzhovVar == null || (zzibbVar = this.zzb) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (zzhovVar.zzc() != zzibbVar.zzd()) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        if (zzhovVar.zza() && this.zzc == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!this.zza.zza() && this.zzc != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        if (this.zza.zzf() == zzhou.zzd) {
            zziazVarZza = zzhms.zza;
        } else if (this.zza.zzf() == zzhou.zzc || this.zza.zzf() == zzhou.zzb) {
            zziazVarZza = zzhms.zza(this.zzc.intValue());
        } else {
            if (this.zza.zzf() != zzhou.zza) {
                throw new IllegalStateException("Unknown HmacParameters.Variant: ".concat(String.valueOf(this.zza.zzf())));
            }
            zziazVarZza = zzhms.zzb(this.zzc.intValue());
        }
        return new zzhom(this.zza, this.zzb, zziazVarZza, this.zzc, null);
    }

    /* synthetic */ zzhol(byte[] bArr) {
    }
}
