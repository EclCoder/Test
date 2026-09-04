package com.google.android.gms.internal.ads;

import com.inmobi.media.core.config.models.AdConfig;
import java.io.EOFException;
import java.io.InterruptedIOException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzaki {
    private final zzet zza = new zzet(8);
    private int zzb;

    private final long zzb(zzafz zzafzVar) {
        int i10;
        zzet zzetVar = this.zza;
        zzafp zzafpVar = (zzafp) zzafzVar;
        int i11 = 0;
        zzafpVar.zzh(zzetVar.zzi(), 0, 1, false);
        int i12 = zzetVar.zzi()[0] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        if (i12 == 0) {
            return Long.MIN_VALUE;
        }
        int i13 = 128;
        int i14 = 0;
        while (true) {
            i10 = i14 + 1;
            if ((i12 & i13) != 0) {
                break;
            }
            i13 >>= 1;
            i14 = i10;
        }
        int i15 = i12 & (~i13);
        zzafpVar.zzh(zzetVar.zzi(), 1, i14, false);
        while (i11 < i14) {
            i11++;
            i15 = (zzetVar.zzi()[i11] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) + (i15 << 8);
        }
        this.zzb += i10;
        return i15;
    }

    public final boolean zza(zzafz zzafzVar) throws EOFException, InterruptedIOException {
        long jZzo = zzafzVar.zzo();
        long j10 = 1024;
        if (jZzo != -1 && jZzo <= 1024) {
            j10 = jZzo;
        }
        zzet zzetVar = this.zza;
        zzafp zzafpVar = (zzafp) zzafzVar;
        zzafpVar.zzh(zzetVar.zzi(), 0, 4, false);
        this.zzb = 4;
        for (long jZzz = zzetVar.zzz(); jZzz != 440786851; jZzz = ((jZzz << 8) & (-256)) | ((long) (zzetVar.zzi()[0] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED))) {
            int i10 = (int) j10;
            int i11 = this.zzb + 1;
            this.zzb = i11;
            if (i11 == i10) {
                return false;
            }
            zzafpVar.zzh(zzetVar.zzi(), 0, 1, false);
        }
        long jZzb = zzb(zzafzVar);
        long j11 = this.zzb;
        if (jZzb != Long.MIN_VALUE) {
            long j12 = j11 + jZzb;
            if (jZzo == -1 || j12 < jZzo) {
                while (true) {
                    long j13 = this.zzb;
                    if (j13 < j12) {
                        if (zzb(zzafzVar) == Long.MIN_VALUE) {
                            return false;
                        }
                        long jZzb2 = zzb(zzafzVar);
                        if (jZzb2 < 0) {
                            return false;
                        }
                        if (jZzb2 != 0) {
                            int i12 = (int) jZzb2;
                            zzafpVar.zzj(i12, false);
                            this.zzb += i12;
                        }
                    } else if (j13 == j12) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
