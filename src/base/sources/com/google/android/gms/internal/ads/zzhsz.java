package com.google.android.gms.internal.ads;

import java.io.InputStream;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzhsz extends zziee implements zzifq {
    private static final zzhsz zzc;
    private static volatile zzifx zzd;
    private int zza;
    private zzieq zzb = zziee.zzbM();

    static {
        zzhsz zzhszVar = new zzhsz();
        zzc = zzhszVar;
        zziee.zzbu(zzhsz.class, zzhszVar);
    }

    private zzhsz() {
    }

    public static zzhsz zze(byte[] bArr, zzido zzidoVar) {
        return (zzhsz) zziee.zzbV(zzc, bArr, zzidoVar);
    }

    public static zzhsz zzg(InputStream inputStream, zzido zzidoVar) {
        return (zzhsz) zziee.zzbX(zzc, inputStream, zzidoVar);
    }

    public static zzhsw zzh() {
        return (zzhsw) zzc.zzbn();
    }

    public final int zza() {
        return this.zza;
    }

    public final List zzb() {
        return this.zzb;
    }

    public final int zzc() {
        return this.zzb.size();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final zzhsy zzd(int i10) {
        return (zzhsy) this.zzb.get(i10);
    }

    @Override // com.google.android.gms.internal.ads.zziee
    protected final Object zzdc(zzied zziedVar, Object obj, Object obj2) {
        zzifx zzidzVar;
        int iOrdinal = zziedVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zziee.zzbv(zzc, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"zza", "zzb", zzhsy.class});
        }
        if (iOrdinal == 3) {
            return new zzhsz();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzhsw(bArr);
        }
        if (iOrdinal == 5) {
            return zzc;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzifx zzifxVar = zzd;
        if (zzifxVar != null) {
            return zzifxVar;
        }
        synchronized (zzhsz.class) {
            try {
                zzidzVar = zzd;
                if (zzidzVar == null) {
                    zzidzVar = new zzidz(zzc);
                    zzd = zzidzVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zzidzVar;
    }

    final /* synthetic */ void zzi(int i10) {
        this.zza = i10;
    }

    final /* synthetic */ void zzj(zzhsy zzhsyVar) {
        zzhsyVar.getClass();
        zzieq zzieqVar = this.zzb;
        if (!zzieqVar.zza()) {
            this.zzb = zziee.zzbN(zzieqVar);
        }
        this.zzb.add(zzhsyVar);
    }
}
