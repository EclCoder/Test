package com.google.android.gms.internal.ads;

import java.io.InputStream;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzgax extends zziee implements zzifq {
    private static final zzgax zzb;
    private static volatile zzifx zzc;
    private zzifj zza = zzifj.zza();

    static {
        zzgax zzgaxVar = new zzgax();
        zzb = zzgaxVar;
        zziee.zzbu(zzgax.class, zzgaxVar);
    }

    private zzgax() {
    }

    public static zzgax zzc(InputStream inputStream) {
        return (zzgax) zziee.zzbW(zzb, inputStream);
    }

    public static zzgax zzd() {
        return zzb;
    }

    public final int zza() {
        return this.zza.size();
    }

    public final Map zzb() {
        return Collections.unmodifiableMap(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zziee
    protected final Object zzdc(zzied zziedVar, Object obj, Object obj2) {
        zzifx zzidzVar;
        int iOrdinal = zziedVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zziee.zzbv(zzb, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"zza", zzgaw.zza});
        }
        if (iOrdinal == 3) {
            return new zzgax();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzgav(bArr);
        }
        if (iOrdinal == 5) {
            return zzb;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzifx zzifxVar = zzc;
        if (zzifxVar != null) {
            return zzifxVar;
        }
        synchronized (zzgax.class) {
            try {
                zzidzVar = zzc;
                if (zzidzVar == null) {
                    zzidzVar = new zzidz(zzb);
                    zzc = zzidzVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zzidzVar;
    }

    final /* synthetic */ Map zze() {
        if (!this.zza.zze()) {
            this.zza = this.zza.zzc();
        }
        return this.zza;
    }
}
