package com.google.android.gms.internal.ads;

import com.vungle.ads.internal.protos.Sdk$SDKError;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public abstract class zzide {
    public static final /* synthetic */ int zze = 0;
    private static volatile int zzf = 100;
    int zza;
    int zzb;
    final int zzc = zzf;
    Object zzd;

    private zzide() {
    }

    public static zzide zzH(InputStream inputStream, int i10) {
        return inputStream == null ? zzI(zzier.zza, 0, 0, false) : new zzidd(inputStream, 4096, null);
    }

    static zzide zzI(byte[] bArr, int i10, int i11, boolean z10) {
        zzidc zzidcVar = new zzidc(bArr, i10, i11, z10, null);
        try {
            zzidcVar.zzB(i11);
            return zzidcVar;
        } catch (zziet e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public static int zzM(int i10) {
        return (i10 >>> 1) ^ (-(i10 & 1));
    }

    public static long zzN(long j10) {
        return (j10 >>> 1) ^ (-(1 & j10));
    }

    public static int zzO(int i10, InputStream inputStream) throws IOException {
        if ((i10 & 128) == 0) {
            return i10;
        }
        int i11 = i10 & Sdk$SDKError.b.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE;
        int i12 = 7;
        while (i12 < 32) {
            int i13 = inputStream.read();
            if (i13 == -1) {
                throw new zziet("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            i11 |= (i13 & Sdk$SDKError.b.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE) << i12;
            if ((i13 & 128) == 0) {
                return i11;
            }
            i12 += 7;
        }
        while (i12 < 64) {
            int i14 = inputStream.read();
            if (i14 == -1) {
                throw new zziet("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            if ((i14 & 128) == 0) {
                return i11;
            }
            i12 += 7;
        }
        throw new zziet("CodedInputStream encountered a malformed varint.");
    }

    public abstract int zzB(int i10);

    public abstract void zzC(int i10);

    public abstract boolean zzD();

    public abstract int zzE();

    public final void zzJ() throws zziet {
        if (this.zza + this.zzb >= this.zzc) {
            throw new zziet("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
    }

    public final void zzK() {
        if (this.zzb == 0) {
            zzb(0);
        }
    }

    public final void zzL() throws zziet {
        boolean zZzc;
        do {
            int iZza = zza();
            if (iZza == 0) {
                return;
            }
            zzJ();
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

    public abstract zzida zzn();

    public abstract int zzo();

    public abstract int zzp();

    public abstract int zzq();

    public abstract long zzr();

    public abstract int zzs();

    public abstract long zzt();

    /* synthetic */ zzide(byte[] bArr) {
    }
}
