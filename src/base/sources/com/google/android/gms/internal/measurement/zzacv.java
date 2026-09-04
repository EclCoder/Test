package com.google.android.gms.internal.measurement;

import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public abstract class zzacv {
    private static volatile int zze = 100;
    int zza;
    int zzb;
    final int zzc = zze;
    Object zzd;

    private zzacv() {
    }

    public static zzacv zzM(InputStream inputStream, int i10) {
        if (i10 > 0) {
            return inputStream == null ? zzN(zzaed.zza, 0, 0, false) : new zzacu(inputStream, i10, null);
        }
        throw new IllegalArgumentException("bufferSize must be > 0");
    }

    static zzacv zzN(byte[] bArr, int i10, int i11, boolean z10) {
        zzact zzactVar = new zzact(bArr, 0, 0, false, null);
        try {
            zzactVar.zzD(0);
            return zzactVar;
        } catch (zzaeh e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public static int zzR(int i10) {
        return (i10 >>> 1) ^ (-(i10 & 1));
    }

    public static long zzS(long j10) {
        return (j10 >>> 1) ^ (-(1 & j10));
    }

    static /* synthetic */ void zzT(byte[] bArr, int i10, int i11) {
        if ((bArr.length - i10) - i11 < 0 || (i10 | i11) < 0) {
            throw new IndexOutOfBoundsException();
        }
    }

    public abstract int zzD(int i10);

    public abstract void zzE(int i10);

    public abstract int zzF();

    public abstract boolean zzG();

    public abstract int zzH();

    public abstract int zzK(byte[] bArr, int i10, int i11);

    public abstract void zzL(int i10);

    public final void zzO() throws zzaeh {
        if (this.zza + this.zzb >= this.zzc) {
            throw new zzaeh("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
    }

    public final void zzP() {
        if (this.zzb == 0) {
            zzb(0);
        }
    }

    public final void zzQ() throws zzaeh {
        boolean zZzc;
        do {
            int iZza = zza();
            if (iZza == 0) {
                return;
            }
            zzO();
            this.zzb++;
            zZzc = zzc(iZza);
            this.zzb--;
        } while (zZzc);
    }

    public abstract int zza();

    public abstract void zzb(int i10);

    public abstract boolean zzc(int i10);

    public abstract double zzd();

    public abstract float zze();

    public abstract long zzf();

    public abstract long zzg();

    public abstract int zzh();

    public abstract long zzi();

    public abstract int zzj();

    public abstract boolean zzk();

    public abstract String zzl();

    public abstract String zzm();

    public abstract zzacr zzn();

    public abstract byte[] zzo();

    public abstract int zzp();

    public abstract int zzq();

    public abstract int zzr();

    public abstract long zzs();

    public abstract int zzt();

    public abstract long zzu();

    public abstract int zzx();

    public abstract long zzz();

    /* synthetic */ zzacv(byte[] bArr) {
    }
}
