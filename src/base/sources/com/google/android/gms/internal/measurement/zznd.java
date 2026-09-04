package com.google.android.gms.internal.measurement;

import com.google.common.collect.e0;
import com.mbridge.msdk.playercommon.PHx.jyeoXJ;
import java.util.Collection;
import java.util.Map;
import sc.p;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zznd {
    private static final zznd zza = new zznd(zzmw.zzb(), zzmq.zzi());
    private final zzmw zzb;
    private final zzmq zzc;

    private zznd(zzmw zzmwVar, zzmq zzmqVar) {
        this.zzb = (zzmw) p.o(zzmwVar);
        this.zzc = zzmqVar;
    }

    public static zznd zza() {
        return zza;
    }

    public final zzmw zzc() {
        e0 e0VarC;
        zzmq zzmqVar = this.zzc;
        if (zzmqVar.zze() <= 0) {
            return this.zzb;
        }
        zzmw zzmwVar = this.zzb;
        Collection<zzmi> collectionValues = zzmqVar.zzf().values();
        if (collectionValues == null) {
            e0VarC = e0.q();
        } else {
            e0.a aVarG = e0.g();
            for (zzmi zzmiVar : collectionValues) {
                int iZzq = zzmiVar.zzq();
                int i10 = iZzq - 1;
                if (iZzq == 0) {
                    throw null;
                }
                if (i10 == 0) {
                    aVarG.g(zzmiVar.zza(), Long.valueOf(zzmiVar.zzb()));
                } else if (i10 == 1) {
                    aVarG.g(zzmiVar.zza(), Boolean.valueOf(zzmiVar.zzc()));
                } else if (i10 == 2) {
                    aVarG.g(zzmiVar.zza(), Double.valueOf(zzmiVar.zzd()));
                } else if (i10 == 3) {
                    aVarG.g(zzmiVar.zza(), zzmiVar.zze());
                } else {
                    if (i10 != 4) {
                        throw new IllegalStateException("Could not serialize Flag for override: ".concat(String.valueOf(zzmiVar.zza())));
                    }
                    aVarG.g(zzmiVar.zza(), zzmiVar.zzf().zzm());
                }
            }
            e0VarC = aVarG.c();
        }
        return zzmw.zza(zzmwVar, e0VarC);
    }

    public final String zzd() {
        return this.zzc.zza();
    }

    public final String zze() {
        return this.zzc.zzc();
    }

    public final long zzf() {
        return this.zzc.zzd();
    }

    public final zzacr zzg() {
        return this.zzc.zzb();
    }

    public final Map zzh() {
        zzmq zzmqVar = this.zzc;
        if (zzmqVar.zze() == 0) {
            return null;
        }
        return zzmqVar.zzf();
    }

    public final boolean zzi() {
        if (this.zzb.zze().isEmpty()) {
            return zzmq.zzi().equals(this.zzc);
        }
        return false;
    }

    public static zznd zzb(zzacv zzacvVar, boolean z10) throws zzaeh {
        zzmw zzmwVar;
        int iZzr = zzacvVar.zzr();
        if (iZzr <= 1) {
            zzacvVar.zzr();
            int iZzD = zzacvVar.zzD(zzacvVar.zzp());
            zzmq zzmqVarZzh = zzmq.zzh(zzacvVar, zzadf.zza());
            zzacvVar.zzE(iZzD);
            zzmu zzmuVarZza = zzmu.zza();
            try {
                if (z10) {
                    int iZzD2 = zzacvVar.zzD(zzacvVar.zzp());
                    zzmwVar = (zzmw) zzmuVarZza.zzc(zzacvVar, zznb.zza);
                    if (zzacvVar.zzF() == 0) {
                        zzacvVar.zzE(iZzD2);
                    } else {
                        throw new zzaeh(jyeoXJ.vGw);
                    }
                } else {
                    zzmwVar = (zzmw) zzmuVarZza.zzb(zzacvVar.zzo(), zznc.zza);
                }
                zzmuVarZza.close();
                return new zznd(zzmwVar, zzmqVarZzh);
            } catch (Throwable th2) {
                try {
                    zzmuVarZza.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(iZzr).length() + 44);
        sb2.append("Unsupported version: ");
        sb2.append(iZzr);
        sb2.append(". Current version is: 1");
        throw new zzaeh(sb2.toString());
    }
}
