package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public abstract class zzidj extends zzicr {
    public static final /* synthetic */ int zzb = 0;
    private static final boolean zzc = zziha.zza();
    Object zza;

    private zzidj() {
        throw null;
    }

    static int zzE(int i10) {
        if (i10 > 4096) {
            return 4096;
        }
        return i10;
    }

    public static int zzF(int i10) {
        return (352 - (Integer.numberOfLeadingZeros(i10) * 9)) >>> 6;
    }

    public static int zzG(long j10) {
        return (640 - (Long.numberOfLeadingZeros(j10) * 9)) >>> 6;
    }

    public static int zzH(zzifp zzifpVar) {
        int iZzbr = zzifpVar.zzbr();
        return zzF(iZzbr) + iZzbr;
    }

    public final void zzI() {
        if (zzy() > 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
        if (zzy() < 0) {
            throw new IllegalStateException("Wrote more data than expected.");
        }
    }

    public abstract void zzb(int i10, int i11);

    public abstract void zzc(int i10, int i11);

    public abstract void zzd(int i10, int i11);

    public abstract void zze(int i10, int i11);

    public abstract void zzf(int i10, long j10);

    public abstract void zzg(int i10, long j10);

    public abstract void zzh(int i10, boolean z10);

    public abstract void zzi(int i10, String str);

    public abstract void zzj(int i10, zzida zzidaVar);

    public abstract void zzk(zzida zzidaVar);

    abstract void zzl(byte[] bArr, int i10, int i11);

    public abstract void zzm(int i10, zzifp zzifpVar);

    public abstract void zzn(int i10, zzida zzidaVar);

    public abstract void zzo(zzifp zzifpVar);

    public abstract void zzp(byte b10);

    public abstract void zzq(int i10);

    public abstract void zzr(int i10);

    public abstract void zzs(int i10);

    public abstract void zzt(long j10);

    public abstract void zzu(long j10);

    public abstract void zzw(String str);

    public abstract void zzx();

    public abstract int zzy();

    /* synthetic */ zzidj(byte[] bArr) {
    }
}
