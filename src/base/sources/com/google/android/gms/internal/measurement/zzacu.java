package com.google.android.gms.internal.measurement;

import com.inmobi.media.core.config.models.AdConfig;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import qd.qPi.SVWsZyNSAChGIA;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzacu extends zzacv {
    private final InputStream zze;
    private final byte[] zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private int zzk;
    private int zzl;

    /* synthetic */ zzacu(InputStream inputStream, int i10, byte[] bArr) {
        super(null);
        this.zzl = Integer.MAX_VALUE;
        this.zze = inputStream;
        this.zzf = new byte[i10 < 8 ? 8 : i10];
        this.zzg = 0;
        this.zzi = 0;
        this.zzk = 0;
    }

    private final void zzB() {
        int i10 = this.zzg + this.zzh;
        this.zzg = i10;
        int i11 = this.zzk + i10;
        int i12 = this.zzl;
        if (i11 <= i12) {
            this.zzh = 0;
            return;
        }
        int i13 = i11 - i12;
        this.zzh = i13;
        this.zzg = i10 - i13;
    }

    private final void zzC(int i10) throws zzaeh {
        if (zzI(i10)) {
            return;
        }
        if (i10 <= (Integer.MAX_VALUE - this.zzk) - this.zzi) {
            throw new zzaeh("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        throw new zzaeh("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
    }

    private final boolean zzI(int i10) throws IOException {
        int i11 = this.zzi;
        int i12 = i11 + i10;
        int i13 = this.zzg;
        if (i12 <= i13) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 66);
            sb2.append("refillBuffer() called when ");
            sb2.append(i10);
            sb2.append(" bytes were already available in buffer");
            throw new IllegalStateException(sb2.toString());
        }
        int i14 = this.zzk;
        if (i10 > (Integer.MAX_VALUE - i14) - i11 || i14 + i11 + i10 > this.zzl) {
            return false;
        }
        if (i11 > 0) {
            if (i13 > i11) {
                byte[] bArr = this.zzf;
                System.arraycopy(bArr, i11, bArr, 0, i13 - i11);
            }
            i14 = this.zzk + i11;
            this.zzk = i14;
            i13 = this.zzg - i11;
            this.zzg = i13;
            this.zzi = 0;
        }
        InputStream inputStream = this.zze;
        byte[] bArr2 = this.zzf;
        try {
            int i15 = inputStream.read(bArr2, i13, Math.min(bArr2.length - i13, (Integer.MAX_VALUE - i14) - i13));
            if (i15 != 0 && i15 >= -1 && i15 <= this.zzf.length) {
                if (i15 <= 0) {
                    return false;
                }
                this.zzg += i15;
                zzB();
                return this.zzg >= i10 || zzI(i10);
            }
            String strValueOf = String.valueOf(this.zze.getClass());
            StringBuilder sb3 = new StringBuilder(strValueOf.length() + 39 + String.valueOf(i15).length() + 41);
            sb3.append(strValueOf);
            sb3.append("#read(byte[]) returned invalid result: ");
            sb3.append(i15);
            sb3.append("\nThe InputStream implementation is buggy.");
            throw new IllegalStateException(sb3.toString());
        } catch (zzaeh e10) {
            e10.zza();
            throw e10;
        }
    }

    private final byte[] zzJ(int i10, boolean z10) throws IOException {
        byte[] bArrZzU = zzU(i10);
        if (bArrZzU != null) {
            return bArrZzU;
        }
        int i11 = this.zzi;
        int i12 = this.zzg;
        int i13 = i12 - i11;
        this.zzk += i12;
        this.zzi = 0;
        this.zzg = 0;
        List<byte[]> listZzV = zzV(i10 - i13);
        byte[] bArr = new byte[i10];
        System.arraycopy(this.zzf, i11, bArr, 0, i13);
        for (byte[] bArr2 : listZzV) {
            int length = bArr2.length;
            System.arraycopy(bArr2, 0, bArr, i13, length);
            i13 += length;
        }
        return bArr;
    }

    private final byte[] zzU(int i10) throws IOException {
        if (i10 == 0) {
            return zzaed.zza;
        }
        int i11 = this.zzk;
        int i12 = this.zzi;
        int i13 = i11 + i12 + i10;
        if ((-2147483647) + i13 > 0) {
            throw new zzaeh("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
        }
        int i14 = this.zzl;
        if (i13 > i14) {
            zzL((i14 - i11) - i12);
            throw new zzaeh("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        int i15 = this.zzg - i12;
        int i16 = i10 - i15;
        if (i16 >= 4096) {
            try {
                if (i16 > this.zze.available()) {
                    return null;
                }
            } catch (zzaeh e10) {
                e10.zza();
                throw e10;
            }
        }
        byte[] bArr = new byte[i10];
        System.arraycopy(this.zzf, this.zzi, bArr, 0, i15);
        this.zzk += this.zzg;
        this.zzi = 0;
        this.zzg = 0;
        while (i15 < i10) {
            try {
                int i17 = this.zze.read(bArr, i15, i10 - i15);
                if (i17 == -1) {
                    throw new zzaeh("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                }
                this.zzk += i17;
                i15 += i17;
            } catch (zzaeh e11) {
                e11.zza();
                throw e11;
            }
        }
        return bArr;
    }

    public final byte zzA() throws zzaeh {
        if (this.zzi == this.zzg) {
            zzC(1);
        }
        byte[] bArr = this.zzf;
        int i10 = this.zzi;
        this.zzi = i10 + 1;
        return bArr[i10];
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final int zzD(int i10) throws zzaeh {
        if (i10 < 0) {
            throw new zzaeh("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i11 = i10 + this.zzk + this.zzi;
        if (i11 < 0) {
            throw new zzaeh("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
        }
        int i12 = this.zzl;
        if (i11 > i12) {
            throw new zzaeh("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.zzl = i11;
        zzB();
        return i12;
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final void zzE(int i10) {
        this.zzl = i10;
        zzB();
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final int zzF() {
        int i10 = this.zzl;
        if (i10 == Integer.MAX_VALUE) {
            return -1;
        }
        return i10 - (this.zzk + this.zzi);
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final boolean zzG() {
        return this.zzi == this.zzg && !zzI(1);
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final int zzH() {
        return this.zzk + this.zzi;
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final int zzK(byte[] bArr, int i10, int i11) throws IOException {
        zzacv.zzT(bArr, i10, i11);
        if (i11 == 0) {
            return 0;
        }
        int i12 = this.zzg;
        int i13 = this.zzi;
        int i14 = i12 - i13;
        if (i14 > 0) {
            int iMin = Math.min(i11, i14);
            System.arraycopy(this.zzf, this.zzi, bArr, i10, iMin);
            this.zzi += iMin;
            return iMin;
        }
        int iMin2 = Math.min(i11, (this.zzl - this.zzk) - i13);
        if (iMin2 <= 0) {
            return -1;
        }
        try {
            int i15 = this.zze.read(bArr, i10, iMin2);
            if (i15 != -1) {
                this.zzk += i15;
            }
            return i15;
        } catch (zzaeh e10) {
            e10.zza();
            throw e10;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final void zzL(int i10) throws zzaeh {
        int i11 = this.zzg;
        int i12 = this.zzi;
        int i13 = i11 - i12;
        if (i10 <= i13 && i10 >= 0) {
            this.zzi = i12 + i10;
            return;
        }
        if (i10 < 0) {
            throw new zzaeh("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i14 = this.zzk;
        int i15 = i14 + i12;
        int i16 = this.zzl;
        if (i15 + i10 > i16) {
            zzL((i16 - i14) - i12);
            throw new zzaeh("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.zzk = i15;
        this.zzg = 0;
        this.zzi = 0;
        while (i13 < i10) {
            try {
                long j10 = i10 - i13;
                try {
                    long jSkip = this.zze.skip(j10);
                    if (jSkip < 0 || jSkip > j10) {
                        String strValueOf = String.valueOf(this.zze.getClass());
                        StringBuilder sb2 = new StringBuilder(strValueOf.length() + 31 + String.valueOf(jSkip).length() + 41);
                        sb2.append(strValueOf);
                        sb2.append("#skip returned invalid result: ");
                        sb2.append(jSkip);
                        sb2.append("\nThe InputStream implementation is buggy.");
                        throw new IllegalStateException(sb2.toString());
                    }
                    if (jSkip == 0) {
                        break;
                    } else {
                        i13 += (int) jSkip;
                    }
                } catch (zzaeh e10) {
                    e10.zza();
                    throw e10;
                }
            } catch (Throwable th2) {
                this.zzk += i13;
                zzB();
                throw th2;
            }
        }
        this.zzk += i13;
        zzB();
        if (i13 >= i10) {
            return;
        }
        int i17 = this.zzg;
        int i18 = i17 - this.zzi;
        this.zzi = i17;
        zzC(1);
        while (true) {
            int i19 = i10 - i18;
            int i20 = this.zzg;
            if (i19 <= i20) {
                this.zzi = i19;
                return;
            } else {
                i18 += i20;
                this.zzi = i20;
                zzC(1);
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final int zza() throws zzaeh {
        if (zzG()) {
            this.zzj = 0;
            return 0;
        }
        int iZzx = zzx();
        this.zzj = iZzx;
        if ((iZzx >>> 3) != 0) {
            return iZzx;
        }
        throw new zzaeh("Protocol message contained an invalid tag (zero).");
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final void zzb(int i10) throws zzaeh {
        if (this.zzj != i10) {
            throw new zzaeh("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final boolean zzc(int i10) throws zzaeh {
        int i11 = i10 & 7;
        int i12 = 0;
        if (i11 == 0) {
            if (this.zzg - this.zzi < 10) {
                while (i12 < 10) {
                    if (zzA() < 0) {
                        i12++;
                    }
                }
                throw new zzaeh("CodedInputStream encountered a malformed varint.");
            }
            while (i12 < 10) {
                byte[] bArr = this.zzf;
                int i13 = this.zzi;
                this.zzi = i13 + 1;
                if (bArr[i13] < 0) {
                    i12++;
                }
            }
            throw new zzaeh("CodedInputStream encountered a malformed varint.");
            return true;
        }
        if (i11 == 1) {
            zzL(8);
            return true;
        }
        if (i11 == 2) {
            zzL(zzx());
            return true;
        }
        if (i11 == 3) {
            zzQ();
            zzb(((i10 >>> 3) << 3) | 4);
            return true;
        }
        if (i11 == 4) {
            zzP();
            return false;
        }
        if (i11 != 5) {
            throw new zzaeg("Protocol message tag had invalid wire type.");
        }
        zzL(4);
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final double zzd() {
        return Double.longBitsToDouble(zzy());
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final float zze() {
        return Float.intBitsToFloat(zzw());
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final long zzf() {
        return zzz();
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final long zzg() {
        return zzz();
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final int zzh() {
        return zzx();
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final long zzi() {
        return zzy();
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final int zzj() {
        return zzw();
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final boolean zzk() {
        return zzz() != 0;
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final String zzl() throws zzaeh {
        int iZzx = zzx();
        if (iZzx > 0) {
            int i10 = this.zzg;
            int i11 = this.zzi;
            if (iZzx <= i10 - i11) {
                String str = new String(this.zzf, i11, iZzx, StandardCharsets.UTF_8);
                this.zzi += iZzx;
                return str;
            }
        }
        if (iZzx == 0) {
            return "";
        }
        if (iZzx < 0) {
            throw new zzaeh("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (iZzx > this.zzg) {
            return new String(zzJ(iZzx, false), StandardCharsets.UTF_8);
        }
        zzC(iZzx);
        String str2 = new String(this.zzf, this.zzi, iZzx, StandardCharsets.UTF_8);
        this.zzi += iZzx;
        return str2;
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final String zzm() throws IOException {
        byte[] bArrZzJ;
        int iZzx = zzx();
        int i10 = this.zzi;
        int i11 = this.zzg;
        if (iZzx <= i11 - i10 && iZzx > 0) {
            bArrZzJ = this.zzf;
            this.zzi = i10 + iZzx;
        } else {
            if (iZzx == 0) {
                return "";
            }
            if (iZzx < 0) {
                throw new zzaeh("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            i10 = 0;
            if (iZzx <= i11) {
                zzC(iZzx);
                bArrZzJ = this.zzf;
                this.zzi = iZzx;
            } else {
                bArrZzJ = zzJ(iZzx, false);
            }
        }
        return zzagl.zzd(bArrZzJ, i10, iZzx);
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final zzacr zzn() throws IOException {
        int iZzx = zzx();
        int i10 = this.zzg;
        int i11 = this.zzi;
        if (iZzx <= i10 - i11 && iZzx > 0) {
            zzacr zzacrVarZzk = zzacr.zzk(this.zzf, i11, iZzx, false);
            this.zzi += iZzx;
            return zzacrVarZzk;
        }
        if (iZzx == 0) {
            return zzacr.zza;
        }
        if (iZzx < 0) {
            throw new zzaeh("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        byte[] bArrZzU = zzU(iZzx);
        if (bArrZzU != null) {
            return zzacr.zzk(bArrZzU, 0, bArrZzU.length, false);
        }
        int i12 = this.zzi;
        int i13 = this.zzg;
        int i14 = i13 - i12;
        this.zzk += i13;
        this.zzi = 0;
        this.zzg = 0;
        List<byte[]> listZzV = zzV(iZzx - i14);
        byte[] bArr = new byte[iZzx];
        System.arraycopy(this.zzf, i12, bArr, 0, i14);
        for (byte[] bArr2 : listZzV) {
            int length = bArr2.length;
            System.arraycopy(bArr2, 0, bArr, i14, length);
            i14 += length;
        }
        try {
            return zzacr.zzl(bArr, false);
        } catch (zzaeh e10) {
            throw new AssertionError("Expected no InvalidProtocolBufferException as data UTF8 validity is not checked.", e10);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final byte[] zzo() throws zzaeh {
        int iZzx = zzx();
        int i10 = this.zzg;
        int i11 = this.zzi;
        if (iZzx > i10 - i11 || iZzx <= 0) {
            if (iZzx >= 0) {
                return zzJ(iZzx, false);
            }
            throw new zzaeh("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        byte[] bArrCopyOfRange = Arrays.copyOfRange(this.zzf, i11, i11 + iZzx);
        this.zzi += iZzx;
        return bArrCopyOfRange;
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final int zzp() {
        return zzx();
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final int zzq() {
        return zzx();
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final int zzr() {
        return zzw();
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final long zzs() {
        return zzy();
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final int zzt() {
        return zzacv.zzR(zzx());
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final long zzu() {
        return zzacv.zzS(zzz());
    }

    final long zzv() throws zzaeh {
        long j10 = 0;
        for (int i10 = 0; i10 < 64; i10 += 7) {
            byte bZzA = zzA();
            j10 |= ((long) (bZzA & 127)) << i10;
            if ((bZzA & 128) == 0) {
                return j10;
            }
        }
        throw new zzaeh("CodedInputStream encountered a malformed varint.");
    }

    public final int zzw() throws zzaeh {
        int i10 = this.zzi;
        if (this.zzg - i10 < 4) {
            zzC(4);
            i10 = this.zzi;
        }
        byte[] bArr = this.zzf;
        this.zzi = i10 + 4;
        int i11 = bArr[i10] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        int i12 = bArr[i10 + 1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        int i13 = bArr[i10 + 2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        return ((bArr[i10 + 3] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24) | (i12 << 8) | i11 | (i13 << 16);
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final int zzx() {
        int i10;
        int i11 = this.zzi;
        int i12 = this.zzg;
        if (i12 != i11) {
            byte[] bArr = this.zzf;
            int i13 = i11 + 1;
            byte b10 = bArr[i11];
            if (b10 >= 0) {
                this.zzi = i13;
                return b10;
            }
            if (i12 - i13 >= 9) {
                int i14 = i11 + 2;
                int i15 = (bArr[i13] << 7) ^ b10;
                if (i15 < 0) {
                    i10 = i15 ^ (-128);
                } else {
                    int i16 = i11 + 3;
                    int i17 = (bArr[i14] << 14) ^ i15;
                    if (i17 >= 0) {
                        i10 = i17 ^ 16256;
                    } else {
                        int i18 = i11 + 4;
                        int i19 = i17 ^ (bArr[i16] << 21);
                        if (i19 < 0) {
                            i10 = (-2080896) ^ i19;
                        } else {
                            i16 = i11 + 5;
                            byte b11 = bArr[i18];
                            int i20 = (i19 ^ (b11 << 28)) ^ 266354560;
                            if (b11 < 0) {
                                i18 = i11 + 6;
                                if (bArr[i16] < 0) {
                                    i16 = i11 + 7;
                                    if (bArr[i18] < 0) {
                                        i18 = i11 + 8;
                                        if (bArr[i16] < 0) {
                                            i16 = i11 + 9;
                                            if (bArr[i18] < 0) {
                                                int i21 = i11 + 10;
                                                if (bArr[i16] >= 0) {
                                                    i14 = i21;
                                                    i10 = i20;
                                                }
                                            }
                                        }
                                    }
                                }
                                i10 = i20;
                            }
                            i10 = i20;
                        }
                        i14 = i18;
                    }
                    i14 = i16;
                }
                this.zzi = i14;
                return i10;
            }
        }
        return (int) zzv();
    }

    public final long zzy() throws zzaeh {
        int i10 = this.zzi;
        if (this.zzg - i10 < 8) {
            zzC(8);
            i10 = this.zzi;
        }
        byte[] bArr = this.zzf;
        this.zzi = i10 + 8;
        long j10 = bArr[i10];
        long j11 = (((long) bArr[i10 + 1]) & 255) << 8;
        long j12 = bArr[i10 + 2];
        long j13 = bArr[i10 + 3];
        return ((((long) bArr[i10 + 6]) & 255) << 48) | (j10 & 255) | j11 | ((j12 & 255) << 16) | ((j13 & 255) << 24) | ((bArr[i10 + 4] & 255) << 32) | ((bArr[i10 + 5] & 255) << 40) | ((((long) bArr[i10 + 7]) & 255) << 56);
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final long zzz() {
        long j10;
        long j11;
        long j12;
        int i10 = this.zzi;
        int i11 = this.zzg;
        if (i11 != i10) {
            byte[] bArr = this.zzf;
            int i12 = i10 + 1;
            byte b10 = bArr[i10];
            if (b10 >= 0) {
                this.zzi = i12;
                return b10;
            }
            if (i11 - i12 >= 9) {
                int i13 = i10 + 2;
                int i14 = (bArr[i12] << 7) ^ b10;
                if (i14 < 0) {
                    j10 = i14 ^ (-128);
                } else {
                    int i15 = i10 + 3;
                    int i16 = (bArr[i13] << 14) ^ i14;
                    if (i16 >= 0) {
                        j10 = i16 ^ 16256;
                    } else {
                        int i17 = i10 + 4;
                        int i18 = i16 ^ (bArr[i15] << 21);
                        if (i18 < 0) {
                            long j13 = (-2080896) ^ i18;
                            i13 = i17;
                            j10 = j13;
                        } else {
                            i15 = i10 + 5;
                            long j14 = (((long) bArr[i17]) << 28) ^ ((long) i18);
                            if (j14 >= 0) {
                                j10 = j14 ^ 266354560;
                            } else {
                                i13 = i10 + 6;
                                long j15 = (((long) bArr[i15]) << 35) ^ j14;
                                if (j15 < 0) {
                                    j12 = -34093383808L;
                                } else {
                                    int i19 = i10 + 7;
                                    long j16 = j15 ^ (((long) bArr[i13]) << 42);
                                    if (j16 >= 0) {
                                        j11 = 4363953127296L;
                                    } else {
                                        i13 = i10 + 8;
                                        j15 = j16 ^ (((long) bArr[i19]) << 49);
                                        if (j15 < 0) {
                                            j12 = -558586000294016L;
                                        } else {
                                            i19 = i10 + 9;
                                            j16 = j15 ^ (((long) bArr[i13]) << 56);
                                            if (j16 >= 0) {
                                                j11 = 71499008037633920L;
                                            } else {
                                                i13 = i10 + 10;
                                                long j17 = j16 ^ (((long) bArr[i19]) << 63);
                                                if (j17 >= 0) {
                                                    j10 = j17 ^ (-9151873028817141888L);
                                                }
                                            }
                                        }
                                    }
                                    j10 = j16 ^ j11;
                                    i13 = i19;
                                }
                                j10 = j15 ^ j12;
                            }
                        }
                    }
                    i13 = i15;
                }
                this.zzi = i13;
                return j10;
            }
        }
        return zzv();
    }

    private final List zzV(int i10) throws IOException {
        ArrayList arrayList = new ArrayList();
        while (i10 > 0) {
            int iMin = Math.min(i10, 4096);
            byte[] bArr = new byte[iMin];
            int i11 = 0;
            while (i11 < iMin) {
                try {
                    int i12 = this.zze.read(bArr, i11, iMin - i11);
                    if (i12 == -1) {
                        throw new zzaeh(SVWsZyNSAChGIA.FwKJwGlFYMK);
                    }
                    this.zzk += i12;
                    i11 += i12;
                } catch (zzaeh e10) {
                    e10.zza();
                    throw e10;
                }
            }
            i10 -= iMin;
            arrayList.add(bArr);
        }
        return arrayList;
    }
}
