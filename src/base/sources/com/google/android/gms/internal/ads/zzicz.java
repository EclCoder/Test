package com.google.android.gms.internal.ads;

import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzicz extends OutputStream {
    private static final byte[] zza = new byte[0];
    private int zzd;
    private int zzf;
    private final int zzb = 128;
    private final ArrayList zzc = new ArrayList();
    private byte[] zze = new byte[128];

    zzicz(int i10) {
    }

    private final void zzc(int i10) {
        this.zzc.add(new zzicy(this.zze));
        int length = this.zzd + this.zze.length;
        this.zzd = length;
        this.zze = new byte[Math.max(this.zzb, Math.max(i10, length >>> 1))];
        this.zzf = 0;
    }

    public final String toString() {
        return String.format(Locale.ROOT, "<ByteString.Output@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(zzb()));
    }

    @Override // java.io.OutputStream
    public final synchronized void write(int i10) {
        try {
            if (this.zzf == this.zze.length) {
                zzc(1);
            }
            byte[] bArr = this.zze;
            int i11 = this.zzf;
            this.zzf = i11 + 1;
            bArr[i11] = (byte) i10;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized zzida zza() {
        try {
            int i10 = this.zzf;
            byte[] bArr = this.zze;
            if (i10 >= bArr.length) {
                this.zzc.add(new zzicy(this.zze));
                this.zze = zza;
            } else if (i10 > 0) {
                this.zzc.add(new zzicy(Arrays.copyOf(bArr, i10)));
            }
            this.zzd += this.zzf;
            this.zzf = 0;
        } catch (Throwable th2) {
            throw th2;
        }
        return zzida.zzy(this.zzc);
    }

    public final synchronized int zzb() {
        return this.zzd + this.zzf;
    }

    @Override // java.io.OutputStream
    public final synchronized void write(byte[] bArr, int i10, int i11) {
        byte[] bArr2 = this.zze;
        int length = bArr2.length;
        int i12 = this.zzf;
        int i13 = length - i12;
        if (i11 <= i13) {
            System.arraycopy(bArr, i10, bArr2, i12, i11);
            this.zzf += i11;
            return;
        }
        System.arraycopy(bArr, i10, bArr2, i12, i13);
        int i14 = i11 - i13;
        zzc(i14);
        System.arraycopy(bArr, i10 + i13, this.zze, 0, i14);
        this.zzf = i14;
    }
}
