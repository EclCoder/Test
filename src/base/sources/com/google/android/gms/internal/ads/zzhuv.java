package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.spec.ECPoint;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzhuv {
    private zzhuy zza = null;
    private zziba zzb = null;

    private zzhuv() {
    }

    public final zzhuv zza(zzhuy zzhuyVar) {
        this.zza = zzhuyVar;
        return this;
    }

    public final zzhuv zzb(zziba zzibaVar) {
        this.zzb = zzibaVar;
        return this;
    }

    public final zzhuw zzc() throws GeneralSecurityException {
        zzhuy zzhuyVar = this.zza;
        if (zzhuyVar == null) {
            throw new GeneralSecurityException("Cannot build without a ecdsa public key");
        }
        zziba zzibaVar = this.zzb;
        if (zzibaVar == null) {
            throw new GeneralSecurityException("Cannot build without a private value");
        }
        BigInteger bigIntegerZzb = zzibaVar.zzb(zzhdo.zza());
        ECPoint eCPointZzd = zzhuyVar.zzd();
        zzhuq zzhuqVarZzd = zzhuyVar.zzf().zzd();
        BigInteger order = zzhuqVarZzd.zza().getOrder();
        if (bigIntegerZzb.signum() <= 0 || bigIntegerZzb.compareTo(order) >= 0) {
            throw new GeneralSecurityException("Invalid private value");
        }
        if (zzhlg.zzd(bigIntegerZzb, zzhuqVarZzd.zza()).equals(eCPointZzd)) {
            return new zzhuw(this.zza, this.zzb, null);
        }
        throw new GeneralSecurityException("Invalid private value");
    }

    /* synthetic */ zzhuv(byte[] bArr) {
    }
}
