package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzes extends zzgp implements zzhs {
    private static final zzes zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private String zzg = "";
    private String zzh = "";
    private String zzi = "";
    private String zzj = "";

    static {
        zzes zzesVar = new zzes();
        zzb = zzesVar;
        zzgp.zzB(zzes.class, zzesVar);
    }

    private zzes() {
    }

    public static zzer zza() {
        return (zzer) zzb.zzp();
    }

    static /* synthetic */ void zzc(zzes zzesVar, String str) {
        zzesVar.zzd |= 4;
        zzesVar.zzg = str;
    }

    static /* synthetic */ void zze(zzes zzesVar, String str) {
        str.getClass();
        zzesVar.zzd |= 16;
        zzesVar.zzi = str;
    }

    static /* synthetic */ void zzf(zzes zzesVar, String str) {
        str.getClass();
        zzesVar.zzd |= 32;
        zzesVar.zzj = str;
    }

    static /* synthetic */ void zzg(zzes zzesVar, String str) {
        zzesVar.zzd |= 8;
        zzesVar.zzh = "9.1.0";
    }

    static /* synthetic */ void zzh(zzes zzesVar, int i10) {
        zzesVar.zzd |= 1;
        zzesVar.zze = 24;
    }

    @Override // com.google.android.gms.internal.play_billing.zzgp
    protected final Object zzd(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzgp.zzy(zzb, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        }
        if (i11 == 3) {
            return new zzes();
        }
        zzet zzetVar = null;
        if (i11 == 4) {
            return new zzer(zzetVar);
        }
        if (i11 == 5) {
            return zzb;
        }
        throw null;
    }
}
