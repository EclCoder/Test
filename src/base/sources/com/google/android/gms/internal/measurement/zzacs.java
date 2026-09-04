package com.google.android.gms.internal.measurement;

import com.inmobi.media.core.config.models.AdConfig;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import o4.Wz.OGoz;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
abstract class zzacs extends zzacv {
    private final byte[] zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private int zzj;

    /* synthetic */ zzacs(byte[] bArr, int i10, int i11, boolean z10, byte[] bArr2) {
        super(null);
        this.zzj = Integer.MAX_VALUE;
        this.zze = bArr;
        this.zzf = 0;
        this.zzh = 0;
    }

    private final void zzU() {
        int i10 = this.zzf + this.zzg;
        this.zzf = i10;
        int i11 = this.zzj;
        if (i10 <= i11) {
            this.zzg = 0;
            return;
        }
        int i12 = i10 - i11;
        this.zzg = i12;
        this.zzf = i10 - i12;
    }

    final long zzA() throws zzaeh {
        long j10 = 0;
        for (int i10 = 0; i10 < 64; i10 += 7) {
            byte bZzI = zzI();
            j10 |= ((long) (bZzI & 127)) << i10;
            if ((bZzI & 128) == 0) {
                return j10;
            }
        }
        throw new zzaeh("CodedInputStream encountered a malformed varint.");
    }

    public final int zzB() throws zzaeh {
        int i10 = this.zzh;
        if (this.zzf - i10 < 4) {
            throw new zzaeh("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        byte[] bArr = this.zze;
        this.zzh = i10 + 4;
        int i11 = bArr[i10] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        int i12 = bArr[i10 + 1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        int i13 = bArr[i10 + 2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        return ((bArr[i10 + 3] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24) | (i12 << 8) | i11 | (i13 << 16);
    }

    public final long zzC() throws zzaeh {
        int i10 = this.zzh;
        if (this.zzf - i10 < 8) {
            throw new zzaeh("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        byte[] bArr = this.zze;
        this.zzh = i10 + 8;
        long j10 = bArr[i10];
        long j11 = (((long) bArr[i10 + 1]) & 255) << 8;
        long j12 = bArr[i10 + 2];
        long j13 = bArr[i10 + 3];
        return ((((long) bArr[i10 + 6]) & 255) << 48) | (j10 & 255) | j11 | ((j12 & 255) << 16) | ((j13 & 255) << 24) | ((bArr[i10 + 4] & 255) << 32) | ((bArr[i10 + 5] & 255) << 40) | ((((long) bArr[i10 + 7]) & 255) << 56);
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final int zzD(int i10) throws zzaeh {
        if (i10 < 0) {
            throw new zzaeh("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i11 = i10 + this.zzh;
        if (i11 < 0) {
            throw new zzaeh("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
        }
        int i12 = this.zzj;
        if (i11 > i12) {
            throw new zzaeh("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.zzj = i11;
        zzU();
        return i12;
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final void zzE(int i10) {
        this.zzj = i10;
        zzU();
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final int zzF() {
        int i10 = this.zzj;
        if (i10 == Integer.MAX_VALUE) {
            return -1;
        }
        return i10 - this.zzh;
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final boolean zzG() {
        return this.zzh == this.zzf;
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final int zzH() {
        return this.zzh;
    }

    public final byte zzI() throws zzaeh {
        int i10 = this.zzh;
        if (i10 == this.zzf) {
            throw new zzaeh("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        byte[] bArr = this.zze;
        this.zzh = i10 + 1;
        return bArr[i10];
    }

    public final byte[] zzJ(int i10) throws zzaeh {
        if (i10 > 0) {
            int i11 = this.zzf;
            int i12 = this.zzh;
            if (i10 <= i11 - i12) {
                int i13 = i10 + i12;
                this.zzh = i13;
                return Arrays.copyOfRange(this.zze, i12, i13);
            }
        }
        if (i10 > 0) {
            throw new zzaeh("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        if (i10 == 0) {
            return zzaed.zza;
        }
        throw new zzaeh("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final int zzK(byte[] bArr, int i10, int i11) {
        zzacv.zzT(bArr, i10, i11);
        if (i11 == 0) {
            return 0;
        }
        int iMin = Math.min(i11, this.zzf - this.zzh);
        if (iMin == 0) {
            return -1;
        }
        System.arraycopy(this.zze, this.zzh, bArr, i10, iMin);
        this.zzh += iMin;
        return iMin;
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final void zzL(int i10) throws zzaeh {
        if (i10 >= 0) {
            int i11 = this.zzf;
            int i12 = this.zzh;
            if (i10 <= i11 - i12) {
                this.zzh = i12 + i10;
                return;
            }
        }
        if (i10 >= 0) {
            throw new zzaeh("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        throw new zzaeh("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final int zza() throws zzaeh {
        if (zzG()) {
            this.zzi = 0;
            return 0;
        }
        int iZzv = zzv();
        this.zzi = iZzv;
        if ((iZzv >>> 3) != 0) {
            return iZzv;
        }
        throw new zzaeh("Protocol message contained an invalid tag (zero).");
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final void zzb(int i10) throws zzaeh {
        if (this.zzi != i10) {
            throw new zzaeh("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final boolean zzc(int i10) throws zzaeh {
        int i11 = i10 & 7;
        int i12 = 0;
        if (i11 == 0) {
            if (this.zzf - this.zzh < 10) {
                while (i12 < 10) {
                    if (zzI() < 0) {
                        i12++;
                    }
                }
                throw new zzaeh("CodedInputStream encountered a malformed varint.");
            }
            while (i12 < 10) {
                byte[] bArr = this.zze;
                int i13 = this.zzh;
                this.zzh = i13 + 1;
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
            zzL(zzv());
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
        return Double.longBitsToDouble(zzC());
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final float zze() {
        return Float.intBitsToFloat(zzB());
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
        return zzw();
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final long zzi() {
        return zzC();
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final int zzj() {
        return zzB();
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final boolean zzk() {
        return zzz() != 0;
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final String zzm() throws zzaeh {
        int iZzv = zzv();
        if (iZzv > 0) {
            int i10 = this.zzf;
            int i11 = this.zzh;
            if (iZzv <= i10 - i11) {
                String strZzd = zzagl.zzd(this.zze, i11, iZzv);
                this.zzh += iZzv;
                return strZzd;
            }
        }
        if (iZzv == 0) {
            return "";
        }
        if (iZzv <= 0) {
            throw new zzaeh("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        throw new zzaeh("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final zzacr zzn() {
        int iZzv = zzv();
        if (iZzv > 0) {
            int i10 = this.zzf;
            int i11 = this.zzh;
            if (iZzv <= i10 - i11) {
                zzacr zzacrVarZzk = zzacr.zzk(this.zze, i11, iZzv, false);
                this.zzh += iZzv;
                return zzacrVarZzk;
            }
        }
        return iZzv == 0 ? zzacr.zza : zzacr.zzl(zzJ(iZzv), false);
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final byte[] zzo() {
        return zzJ(zzv());
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final int zzp() {
        return zzv();
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final int zzq() {
        return zzw();
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final int zzr() {
        return zzB();
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final long zzs() {
        return zzC();
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final int zzt() {
        return zzacv.zzR(zzv());
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final long zzu() {
        return zzacv.zzS(zzz());
    }

    protected abstract int zzv();

    protected abstract int zzw();

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final int zzx() {
        return zzw();
    }

    protected final int zzy() {
        int i10;
        int i11 = this.zzh;
        int i12 = this.zzf;
        if (i12 != i11) {
            byte[] bArr = this.zze;
            int i13 = i11 + 1;
            byte b10 = bArr[i11];
            if (b10 >= 0) {
                this.zzh = i13;
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
                this.zzh = i14;
                return i10;
            }
        }
        return (int) zzA();
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final long zzz() {
        long j10;
        long j11;
        long j12;
        int i10 = this.zzh;
        int i11 = this.zzf;
        if (i11 != i10) {
            byte[] bArr = this.zze;
            int i12 = i10 + 1;
            byte b10 = bArr[i10];
            if (b10 >= 0) {
                this.zzh = i12;
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
                this.zzh = i13;
                return j10;
            }
        }
        return zzA();
    }

    @Override // com.google.android.gms.internal.measurement.zzacv
    public final String zzl() throws zzaeh {
        int iZzv = zzv();
        if (iZzv > 0) {
            int i10 = this.zzf;
            int i11 = this.zzh;
            if (iZzv <= i10 - i11) {
                String str = new String(this.zze, i11, iZzv, StandardCharsets.UTF_8);
                this.zzh += iZzv;
                return str;
            }
        }
        if (iZzv == 0) {
            return "";
        }
        if (iZzv < 0) {
            throw new zzaeh("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        throw new zzaeh(OGoz.Wym);
    }
}
