package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public abstract class zzfx extends zzfg {
    Object zza;

    private zzfx() {
        throw null;
    }

    public static int zzx(zzhr zzhrVar) {
        int iZzn = zzhrVar.zzn();
        return zzy(iZzn) + iZzn;
    }

    public static int zzy(int i10) {
        return (352 - (Integer.numberOfLeadingZeros(i10) * 9)) >>> 6;
    }

    public static int zzz(long j10) {
        return (640 - (Long.numberOfLeadingZeros(j10) * 9)) >>> 6;
    }

    public final void zzA() {
        if (zza() > 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
        if (zza() < 0) {
            throw new IllegalStateException("Wrote more data than expected.");
        }
    }

    public abstract int zza();

    public abstract void zzb(byte b10);

    public abstract void zzd(int i10, boolean z10);

    abstract void zze(byte[] bArr, int i10, int i11);

    public abstract void zzf(int i10, zzfp zzfpVar);

    public abstract void zzg(zzfp zzfpVar);

    public abstract void zzh(int i10, int i11);

    public abstract void zzi(int i10);

    public abstract void zzj(int i10, long j10);

    public abstract void zzk(long j10);

    public abstract void zzl(int i10, int i11);

    public abstract void zzm(int i10);

    public abstract void zzn(zzhr zzhrVar);

    public abstract void zzo(int i10, zzhr zzhrVar);

    public abstract void zzp(int i10, zzfp zzfpVar);

    public abstract void zzq(int i10, String str);

    public abstract void zzr(String str);

    public abstract void zzs(int i10, int i11);

    public abstract void zzt(int i10, int i11);

    public abstract void zzu(int i10);

    public abstract void zzv(int i10, long j10);

    public abstract void zzw(long j10);

    /* synthetic */ zzfx(zzfw zzfwVar) {
    }
}
