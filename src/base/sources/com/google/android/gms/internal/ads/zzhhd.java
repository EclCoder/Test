package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzhhd {
    private zzhhf zza;
    private String zzb;
    private zzhhe zzc;
    private zzheu zzd;

    private zzhhd() {
        throw null;
    }

    public final zzhhd zza(zzhhf zzhhfVar) {
        this.zza = zzhhfVar;
        return this;
    }

    public final zzhhd zzb(String str) {
        this.zzb = str;
        return this;
    }

    public final zzhhd zzc(zzhhe zzhheVar) {
        this.zzc = zzhheVar;
        return this;
    }

    public final zzhhd zzd(zzheu zzheuVar) {
        this.zzd = zzheuVar;
        return this;
    }

    public final zzhhg zze() throws GeneralSecurityException {
        if (this.zza == null) {
            this.zza = zzhhf.zzb;
        }
        if (this.zzb == null) {
            throw new GeneralSecurityException("kekUri must be set");
        }
        zzhhe zzhheVar = this.zzc;
        if (zzhheVar == null) {
            throw new GeneralSecurityException("dekParsingStrategy must be set");
        }
        zzheu zzheuVar = this.zzd;
        if (zzheuVar == null) {
            throw new GeneralSecurityException("dekParametersForNewKeys must be set");
        }
        if (zzheuVar.zza()) {
            throw new GeneralSecurityException("dekParametersForNewKeys must not have ID Requirements");
        }
        if ((zzhheVar.equals(zzhhe.zza) && (zzheuVar instanceof zzhfx)) || ((zzhheVar.equals(zzhhe.zzc) && (zzheuVar instanceof zzhgm)) || ((zzhheVar.equals(zzhhe.zzb) && (zzheuVar instanceof zzhii)) || ((zzhheVar.equals(zzhhe.zzd) && (zzheuVar instanceof zzhfg)) || ((zzhheVar.equals(zzhhe.zze) && (zzheuVar instanceof zzhfo)) || (zzhheVar.equals(zzhhe.zzf) && (zzheuVar instanceof zzhgg))))))) {
            return new zzhhg(this.zza, this.zzb, this.zzc, this.zzd, null);
        }
        String string = this.zzc.toString();
        String strValueOf = String.valueOf(this.zzd);
        StringBuilder sb2 = new StringBuilder(string.length() + 67 + strValueOf.length() + 1);
        sb2.append("Cannot use parsing strategy ");
        sb2.append(string);
        sb2.append(" when new keys are picked according to ");
        sb2.append(strValueOf);
        sb2.append(".");
        throw new GeneralSecurityException(sb2.toString());
    }

    /* synthetic */ zzhhd(byte[] bArr) {
    }
}
