package com.google.android.gms.internal.consent_sdk;

import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public abstract class zzpv extends zzpe {
    private static final Logger zza = Logger.getLogger(zzpv.class.getName());
    private static final boolean zzb = zzsw.zzx();
    public static final /* synthetic */ int zzf = 0;
    Object zze;

    private zzpv() {
        throw null;
    }

    public static int zzA(zzrq zzrqVar) {
        int iZzn = zzrqVar.zzn();
        return zzC(iZzn) + iZzn;
    }

    public static int zzB(String str) {
        int length;
        try {
            length = zzsy.zzb(str);
        } catch (zzsx unused) {
            length = str.getBytes(zzqs.zza).length;
        }
        return zzC(length) + length;
    }

    public static int zzC(int i10) {
        return (352 - (Integer.numberOfLeadingZeros(i10) * 9)) >>> 6;
    }

    public static int zzD(long j10) {
        return (640 - (Long.numberOfLeadingZeros(j10) * 9)) >>> 6;
    }

    final void zzE(String str, zzsx zzsxVar) throws zzps {
        zza.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) zzsxVar);
        byte[] bytes = str.getBytes(zzqs.zza);
        try {
            int length = bytes.length;
            zzw(length);
            zza(bytes, 0, length);
        } catch (IndexOutOfBoundsException e10) {
            throw new zzps(e10);
        }
    }

    public abstract void zzI();

    public abstract void zzJ(byte b10);

    public abstract void zzK(int i10, boolean z10);

    abstract void zzL(byte[] bArr, int i10, int i11);

    @Override // com.google.android.gms.internal.consent_sdk.zzpe
    public abstract void zza(byte[] bArr, int i10, int i11);

    public abstract int zzb();

    public abstract void zzh(int i10, zzpm zzpmVar);

    public abstract void zzi(zzpm zzpmVar);

    public abstract void zzj(int i10, int i11);

    public abstract void zzk(int i10);

    public abstract void zzl(int i10, long j10);

    public abstract void zzm(long j10);

    public abstract void zzn(int i10, int i11);

    public abstract void zzo(int i10);

    public abstract void zzp(zzrq zzrqVar);

    public abstract void zzq(int i10, zzrq zzrqVar);

    public abstract void zzr(int i10, zzpm zzpmVar);

    public abstract void zzs(int i10, String str);

    public abstract void zzt(String str);

    public abstract void zzu(int i10, int i11);

    public abstract void zzv(int i10, int i11);

    public abstract void zzw(int i10);

    public abstract void zzx(int i10, long j10);

    public abstract void zzy(long j10);

    /* synthetic */ zzpv(zzpu zzpuVar) {
    }
}
