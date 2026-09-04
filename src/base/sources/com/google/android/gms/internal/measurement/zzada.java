package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public abstract class zzada extends zzacj {
    public static final /* synthetic */ int zzb = 0;
    private static final boolean zzc = zzagg.zza();
    Object zza;

    private zzada() {
        throw null;
    }

    public static int zzE(int i10) {
        return (352 - (Integer.numberOfLeadingZeros(i10) * 9)) >>> 6;
    }

    public static int zzF(long j10) {
        return (640 - (Long.numberOfLeadingZeros(j10) * 9)) >>> 6;
    }

    public static int zzG(zzafc zzafcVar) {
        int iZzcq = zzafcVar.zzcq();
        return zzE(iZzcq) + iZzcq;
    }

    public final void zzH() {
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

    public abstract void zzj(int i10, zzacr zzacrVar);

    public abstract void zzk(zzacr zzacrVar);

    abstract void zzl(byte[] bArr, int i10, int i11);

    public abstract void zzm(int i10, zzafc zzafcVar);

    public abstract void zzn(int i10, zzacr zzacrVar);

    public abstract void zzo(zzafc zzafcVar);

    public abstract void zzp(byte b10);

    public abstract void zzq(int i10);

    public abstract void zzr(int i10);

    public abstract void zzs(int i10);

    public abstract void zzt(long j10);

    public abstract void zzu(long j10);

    public abstract void zzw(String str);

    public abstract void zzx();

    public abstract int zzy();

    /* synthetic */ zzada(byte[] bArr) {
    }
}
