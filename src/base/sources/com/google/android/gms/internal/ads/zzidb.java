package com.google.android.gms.internal.ads;

import com.inmobi.media.core.config.models.AdConfig;
import com.mbridge.msdk.dycreator.subjectfactory.rcjU.KPtaxpyICj;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
abstract class zzidb extends zzide {
    private final byte[] zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private final int zzj;
    private int zzk;
    private int zzl;

    /* synthetic */ zzidb(byte[] bArr, int i10, int i11, boolean z10, byte[] bArr2) {
        super(null);
        this.zzl = Integer.MAX_VALUE;
        this.zzf = bArr;
        this.zzg = i11 + i10;
        this.zzi = i10;
        this.zzj = i10;
    }

    private final void zzP() {
        int i10 = this.zzg + this.zzh;
        this.zzg = i10;
        int i11 = i10 - this.zzj;
        int i12 = this.zzl;
        if (i11 <= i12) {
            this.zzh = 0;
            return;
        }
        int i13 = i11 - i12;
        this.zzh = i13;
        this.zzg = i10 - i13;
    }

    public final long zzA() throws zziet {
        int i10 = this.zzi;
        if (this.zzg - i10 < 8) {
            throw new zziet("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        byte[] bArr = this.zzf;
        this.zzi = i10 + 8;
        long j10 = bArr[i10];
        long j11 = (((long) bArr[i10 + 1]) & 255) << 8;
        long j12 = bArr[i10 + 2];
        long j13 = bArr[i10 + 3];
        return ((((long) bArr[i10 + 6]) & 255) << 48) | (j10 & 255) | j11 | ((j12 & 255) << 16) | ((j13 & 255) << 24) | ((bArr[i10 + 4] & 255) << 32) | ((bArr[i10 + 5] & 255) << 40) | ((((long) bArr[i10 + 7]) & 255) << 56);
    }

    @Override // com.google.android.gms.internal.ads.zzide
    public final int zzB(int i10) {
        if (i10 < 0) {
            throw new zziet("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i11 = i10 + (this.zzi - this.zzj);
        if (i11 < 0) {
            throw new zziet("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
        }
        int i12 = this.zzl;
        if (i11 > i12) {
            throw new zziet("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.zzl = i11;
        zzP();
        return i12;
    }

    @Override // com.google.android.gms.internal.ads.zzide
    public final void zzC(int i10) {
        this.zzl = i10;
        zzP();
    }

    @Override // com.google.android.gms.internal.ads.zzide
    public final boolean zzD() {
        return this.zzi == this.zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzide
    public final int zzE() {
        return this.zzi - this.zzj;
    }

    public final byte zzF() throws zziet {
        int i10 = this.zzi;
        if (i10 == this.zzg) {
            throw new zziet("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        byte[] bArr = this.zzf;
        this.zzi = i10 + 1;
        return bArr[i10];
    }

    @Override // com.google.android.gms.internal.ads.zzide
    public final int zza() throws zziet {
        if (zzD()) {
            this.zzk = 0;
            return 0;
        }
        int iZzu = zzu();
        this.zzk = iZzu;
        if ((iZzu >>> 3) != 0) {
            return iZzu;
        }
        throw new zziet("Protocol message contained an invalid tag (zero).");
    }

    @Override // com.google.android.gms.internal.ads.zzide
    public final void zzb(int i10) throws zziet {
        if (this.zzk != i10) {
            throw new zziet("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzide
    public final boolean zzc(int i10) throws zziet {
        int i11 = i10 & 7;
        int i12 = 0;
        if (i11 == 0) {
            if (this.zzg - this.zzi < 10) {
                while (i12 < 10) {
                    if (zzF() < 0) {
                        i12++;
                    }
                }
                throw new zziet("CodedInputStream encountered a malformed varint.");
            }
            while (i12 < 10) {
                byte[] bArr = this.zzf;
                int i13 = this.zzi;
                this.zzi = i13 + 1;
                if (bArr[i13] < 0) {
                    i12++;
                }
            }
            throw new zziet("CodedInputStream encountered a malformed varint.");
            return true;
        }
        if (i11 == 1) {
            zzG(8);
            return true;
        }
        if (i11 == 2) {
            zzG(zzu());
            return true;
        }
        if (i11 == 3) {
            zzL();
            zzb(((i10 >>> 3) << 3) | 4);
            return true;
        }
        if (i11 == 4) {
            zzK();
            return false;
        }
        if (i11 != 5) {
            throw new zzies("Protocol message tag had invalid wire type.");
        }
        zzG(4);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzide
    public final double zzd() {
        return Double.longBitsToDouble(zzA());
    }

    @Override // com.google.android.gms.internal.ads.zzide
    public final float zze() {
        return Float.intBitsToFloat(zzz());
    }

    @Override // com.google.android.gms.internal.ads.zzide
    public final long zzf() {
        return zzx();
    }

    @Override // com.google.android.gms.internal.ads.zzide
    public final long zzg() {
        return zzx();
    }

    @Override // com.google.android.gms.internal.ads.zzide
    public final int zzh() {
        return zzv();
    }

    @Override // com.google.android.gms.internal.ads.zzide
    public final long zzi() {
        return zzA();
    }

    @Override // com.google.android.gms.internal.ads.zzide
    public final int zzj() {
        return zzz();
    }

    @Override // com.google.android.gms.internal.ads.zzide
    public final boolean zzk() {
        return zzx() != 0;
    }

    @Override // com.google.android.gms.internal.ads.zzide
    public final String zzl() throws zziet {
        int iZzu = zzu();
        if (iZzu > 0) {
            int i10 = this.zzg;
            int i11 = this.zzi;
            if (iZzu <= i10 - i11) {
                String str = new String(this.zzf, i11, iZzu, StandardCharsets.UTF_8);
                this.zzi += iZzu;
                return str;
            }
        }
        if (iZzu == 0) {
            return "";
        }
        if (iZzu < 0) {
            throw new zziet("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        throw new zziet("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    @Override // com.google.android.gms.internal.ads.zzide
    public final String zzm() throws zziet {
        int iZzu = zzu();
        if (iZzu > 0) {
            int i10 = this.zzg;
            int i11 = this.zzi;
            if (iZzu <= i10 - i11) {
                String strZze = zzihf.zze(this.zzf, i11, iZzu);
                this.zzi += iZzu;
                return strZze;
            }
        }
        if (iZzu == 0) {
            return "";
        }
        if (iZzu <= 0) {
            throw new zziet("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        throw new zziet("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    @Override // com.google.android.gms.internal.ads.zzide
    public final zzida zzn() throws zziet {
        int iZzu = zzu();
        if (iZzu > 0) {
            int i10 = this.zzg;
            int i11 = this.zzi;
            if (iZzu <= i10 - i11) {
                zzida zzidaVarZzu = zzida.zzu(this.zzf, i11, iZzu, false);
                this.zzi += iZzu;
                return zzidaVarZzu;
            }
        }
        if (iZzu == 0) {
            return zzida.zza;
        }
        if (iZzu > 0) {
            int i12 = this.zzg;
            int i13 = this.zzi;
            if (iZzu <= i12 - i13) {
                int i14 = iZzu + i13;
                this.zzi = i14;
                return zzida.zzw(Arrays.copyOfRange(this.zzf, i13, i14), false);
            }
        }
        if (iZzu <= 0) {
            throw new zziet("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        throw new zziet("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    @Override // com.google.android.gms.internal.ads.zzide
    public final int zzo() {
        return zzu();
    }

    @Override // com.google.android.gms.internal.ads.zzide
    public final int zzp() {
        return zzv();
    }

    @Override // com.google.android.gms.internal.ads.zzide
    public final int zzq() {
        return zzz();
    }

    @Override // com.google.android.gms.internal.ads.zzide
    public final long zzr() {
        return zzA();
    }

    @Override // com.google.android.gms.internal.ads.zzide
    public final int zzs() {
        return zzide.zzM(zzu());
    }

    @Override // com.google.android.gms.internal.ads.zzide
    public final long zzt() {
        return zzide.zzN(zzx());
    }

    protected abstract int zzu();

    protected abstract int zzv();

    protected final int zzw() {
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
        return (int) zzy();
    }

    public final long zzx() {
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
        return zzy();
    }

    final long zzy() throws zziet {
        long j10 = 0;
        for (int i10 = 0; i10 < 64; i10 += 7) {
            byte bZzF = zzF();
            j10 |= ((long) (bZzF & 127)) << i10;
            if ((bZzF & 128) == 0) {
                return j10;
            }
        }
        throw new zziet("CodedInputStream encountered a malformed varint.");
    }

    public final int zzz() throws zziet {
        int i10 = this.zzi;
        if (this.zzg - i10 < 4) {
            throw new zziet("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        byte[] bArr = this.zzf;
        this.zzi = i10 + 4;
        int i11 = bArr[i10] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        int i12 = bArr[i10 + 1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        int i13 = bArr[i10 + 2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        return ((bArr[i10 + 3] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24) | (i12 << 8) | i11 | (i13 << 16);
    }

    public final void zzG(int i10) throws zziet {
        if (i10 >= 0) {
            int i11 = this.zzg;
            int i12 = this.zzi;
            if (i10 <= i11 - i12) {
                this.zzi = i12 + i10;
                return;
            }
        }
        if (i10 >= 0) {
            throw new zziet(KPtaxpyICj.znyLyq);
        }
        throw new zziet("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }
}
