package com.google.android.gms.internal.play_billing;

import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;
import o4.Wz.OGoz;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public abstract class zzfp implements Iterable, Serializable {
    public static final zzfp zza = new zzfn(zzgv.zza);
    private int zzb = 0;

    static {
        int i10 = zzfc.zza;
    }

    zzfp() {
    }

    public static zzfp zzk(byte[] bArr, int i10, int i11) {
        try {
            zzj(i10, i10 + i11, bArr.length);
            byte[] bArr2 = new byte[i11];
            System.arraycopy(bArr, i10, bArr2, 0, i11);
            return new zzfn(bArr2);
        } catch (zzhb e10) {
            throw new AssertionError("Expected no InvalidProtocolBufferException as data UTF8 validity is not checked.", e10);
        }
    }

    static /* bridge */ /* synthetic */ boolean zzl(byte[] bArr, int i10, byte[] bArr2, int i11, int i12) {
        int i13 = i10 + i12;
        zzj(i10, i13, bArr.length);
        zzj(i11, i12 + i11, bArr2.length);
        while (i10 < i13) {
            if (bArr[i10] != bArr2[i11]) {
                return false;
            }
            i10++;
            i11++;
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzfp)) {
            return false;
        }
        zzfp zzfpVar = (zzfp) obj;
        int iZzd = zzd();
        if (iZzd != zzfpVar.zzd()) {
            return false;
        }
        if (iZzd == 0) {
            return true;
        }
        int i10 = this.zzb;
        int i11 = zzfpVar.zzb;
        if (i10 == 0 || i11 == 0 || i10 == i11) {
            return zzh(zzfpVar);
        }
        return false;
    }

    public final int hashCode() {
        int iZzc = this.zzb;
        if (iZzc == 0) {
            int iZzd = zzd();
            iZzc = zzc(iZzd, 0, iZzd);
            if (iZzc == 0) {
                iZzc = 1;
            }
            this.zzb = iZzc;
        }
        return iZzc;
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new zzfh(this);
    }

    public final String toString() {
        return String.format(Locale.ROOT, "<ByteString@%s size=%d contents=\"%s\">", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(zzd()), zzd() <= 50 ? zzio.zza(zzm()) : zzio.zza(zze(0, 47).zzm()).concat("..."));
    }

    abstract byte zza(int i10);

    protected abstract int zzc(int i10, int i11, int i12);

    public abstract int zzd();

    public abstract zzfp zze(int i10, int i11);

    protected abstract void zzf(byte[] bArr, int i10, int i11, int i12);

    abstract void zzg(zzfg zzfgVar);

    protected abstract boolean zzh(zzfp zzfpVar);

    public final byte[] zzm() {
        int iZzd = zzd();
        if (iZzd == 0) {
            return zzgv.zza;
        }
        byte[] bArr = new byte[iZzd];
        zzf(bArr, 0, 0, iZzd);
        return bArr;
    }

    static int zzj(int i10, int i11, int i12) {
        int i13 = i11 - i10;
        if ((i10 | i11 | i13 | (i12 - i11)) >= 0) {
            return i13;
        }
        if (i10 < 0) {
            throw new IndexOutOfBoundsException("Beginning index: " + i10 + OGoz.UEEMH);
        }
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("Beginning index larger than ending index: " + i10 + ", " + i11);
        }
        throw new IndexOutOfBoundsException("End index: " + i11 + " >= " + i12);
    }
}
