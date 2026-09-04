package com.google.android.gms.internal.ads;

import com.inmobi.media.core.config.models.AdConfig;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zziaz {
    private final byte[] zza;

    private zziaz(byte[] bArr, int i10, int i11) {
        byte[] bArr2 = new byte[i11];
        this.zza = bArr2;
        System.arraycopy(bArr, 0, bArr2, 0, i11);
    }

    public static zziaz zza(byte[] bArr) {
        if (bArr != null) {
            return zzb(bArr, 0, bArr.length);
        }
        throw new NullPointerException("data must be non-null");
    }

    public static zziaz zzb(byte[] bArr, int i10, int i11) {
        if (bArr == null) {
            throw new NullPointerException("data must be non-null");
        }
        int length = bArr.length;
        if (i11 > length) {
            i11 = length;
        }
        return new zziaz(bArr, 0, i11);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zziaz) {
            return Arrays.equals(((zziaz) obj).zza, this.zza);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.zza);
    }

    public final String toString() {
        byte[] bArr = this.zza;
        int length = bArr.length;
        StringBuilder sb2 = new StringBuilder(length + length);
        for (byte b10 : bArr) {
            sb2.append("0123456789abcdef".charAt((b10 & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) >> 4));
            sb2.append("0123456789abcdef".charAt(b10 & 15));
        }
        String string = sb2.toString();
        StringBuilder sb3 = new StringBuilder(string.length() + 7);
        sb3.append("Bytes(");
        sb3.append(string);
        sb3.append(")");
        return sb3.toString();
    }

    public final byte[] zzc() {
        byte[] bArr = this.zza;
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        return bArr2;
    }

    public final int zzd() {
        return this.zza.length;
    }
}
