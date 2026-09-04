package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zznr extends zzadu implements zzafd {
    private static final zznr zzg;
    private static volatile zzafj zzh;
    private int zzb;
    private zzaef zze = zzadu.zzcy();
    private String zzf = "";

    static {
        zznr zznrVar = new zznr();
        zzg = zznrVar;
        zzadu.zzcs(zznr.class, zznrVar);
    }

    private zznr() {
    }

    public static zznr zzb() {
        return zzg;
    }

    public final List zza() {
        return this.zze;
    }

    final /* synthetic */ void zzc(String str) {
        zzaef zzaefVar = this.zze;
        if (!zzaefVar.zza()) {
            this.zze = zzadu.zzcz(zzaefVar);
        }
        this.zze.add("");
    }

    final /* synthetic */ void zzd(String str) {
        this.zzb |= 1;
        this.zzf = "";
    }

    @Override // com.google.android.gms.internal.measurement.zzadu
    protected final Object zzg(int i10, Object obj, Object obj2) {
        zzafj zzadqVar;
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzadu.zzct(zzg, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001a\u0002ဈ\u0000", new Object[]{"zzb", "zze", "zzf"});
        }
        if (i11 == 3) {
            return new zznr();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new zznq(bArr);
        }
        if (i11 == 5) {
            return zzg;
        }
        if (i11 != 6) {
            throw null;
        }
        zzafj zzafjVar = zzh;
        if (zzafjVar != null) {
            return zzafjVar;
        }
        synchronized (zznr.class) {
            try {
                zzadqVar = zzh;
                if (zzadqVar == null) {
                    zzadqVar = new zzadq(zzg);
                    zzh = zzadqVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zzadqVar;
    }
}
