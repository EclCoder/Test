package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import com.inmobi.media.core.config.models.AdConfig;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzakh implements zzafy {
    public static final /* synthetic */ int zza = 0;
    private static final byte[] zzb;
    private static final byte[] zzc;
    private static final byte[] zzd;
    private static final byte[] zze;
    private static final UUID zzf;
    private static final Map zzg;
    private long zzA;
    private long zzB;
    private boolean zzC;
    private boolean zzD;
    private zzakg zzE;
    private boolean zzF;
    private int zzG;
    private long zzH;
    private final SparseArray zzI;
    private boolean zzJ;
    private long zzK;
    private int zzL;
    private long zzM;
    private long zzN;
    private int zzO;
    private boolean zzP;
    private long zzQ;
    private long zzR;
    private long zzS;
    private boolean zzT;
    private int zzU;
    private long zzV;
    private long zzW;
    private int zzX;
    private int zzY;
    private int[] zzZ;
    private int zzaa;
    private int zzab;
    private int zzac;
    private int zzad;
    private boolean zzae;
    private long zzaf;
    private int zzag;
    private int zzah;
    private int zzai;
    private boolean zzaj;
    private boolean zzak;
    private boolean zzal;
    private int zzam;
    private byte zzan;
    private boolean zzao;
    private zzagb zzap;
    private final zzaka zzaq;
    private final zzakj zzh;
    private final SparseArray zzi;
    private final boolean zzj;
    private final boolean zzk;
    private final zzanj zzl;
    private final zzet zzm;
    private final zzet zzn;
    private final zzet zzo;
    private final zzet zzp;
    private final zzet zzq;
    private final zzet zzr;
    private final zzet zzs;
    private final zzet zzt;
    private final zzet zzu;
    private final zzet zzv;
    private ByteBuffer zzw;
    private long zzx;
    private long zzy;
    private long zzz;

    static {
        int i10 = zzakd.zza;
        zzb = new byte[]{49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};
        String str = zzfl.zza;
        zzc = "Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text".getBytes(StandardCharsets.UTF_8);
        zzd = new byte[]{68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};
        zze = new byte[]{87, 69, 66, 86, 84, 84, 10, 10, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 10};
        zzf = new UUID(72057594037932032L, -9223371306706625679L);
        HashMap map = new HashMap();
        map.put("htc_video_rotA-000", 0);
        map.put("htc_video_rotA-090", 90);
        map.put("htc_video_rotA-180", 180);
        map.put("htc_video_rotA-270", 270);
        zzg = Collections.unmodifiableMap(map);
    }

    @Deprecated
    public zzakh() {
        this(new zzaka(), 2, zzanj.zza);
    }

    private static int[] zzA(int[] iArr, int i10) {
        if (iArr == null) {
            return new int[i10];
        }
        int length = iArr.length;
        return length >= i10 ? iArr : new int[Math.max(length + length, i10)];
    }

    private final void zzB() {
        if (!this.zzD) {
            return;
        }
        int i10 = 0;
        while (true) {
            SparseArray sparseArray = this.zzi;
            if (i10 >= sparseArray.size()) {
                zzagb zzagbVar = this.zzap;
                zzagbVar.getClass();
                zzagbVar.zzv();
                this.zzD = false;
                return;
            }
            if (((zzakg) sparseArray.valueAt(i10)).zzU) {
                return;
            } else {
                i10++;
            }
        }
    }

    private final void zzq(int i10) throws zzat {
        if (this.zzE != null) {
            return;
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 32);
        sb2.append("Element ");
        sb2.append(i10);
        sb2.append(" must be in a TrackEntry");
        throw zzat.zzb(sb2.toString(), null);
    }

    private final void zzr(int i10) throws zzat {
        if (this.zzJ) {
            return;
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 26);
        sb2.append("Element ");
        sb2.append(i10);
        sb2.append(" must be in a Cues");
        throw zzat.zzb(sb2.toString(), null);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:38:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:41:0x00bf A[LOOP:0: B:36:0x00ad->B:41:0x00bf, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:55:0x00bb A[SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0092, code lost:
    
        if (r2.equals("S_TEXT/SSA") != false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0099, code lost:
    
        if (r2.equals("S_TEXT/ASS") != false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x009b, code lost:
    
        r2 = zzx(r11, "%01d:%02d:%02d:%02d", 10000);
        r3 = 21;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void zzs(com.google.android.gms.internal.ads.zzakg r18, long r19, int r21, int r22, int r23) {
        /*
            Method dump skipped, instruction units count: 282
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzakh.zzs(com.google.android.gms.internal.ads.zzakg, long, int, int, int):void");
    }

    private final void zzt(zzafz zzafzVar, int i10) {
        zzet zzetVar = this.zzo;
        if (zzetVar.zze() >= i10) {
            return;
        }
        if (zzetVar.zzj() < i10) {
            int iZzj = zzetVar.zzj();
            zzetVar.zzc(Math.max(iZzj + iZzj, i10));
        }
        zzafzVar.zzc(zzetVar.zzi(), zzetVar.zze(), i10 - zzetVar.zze());
        zzetVar.zzf(i10);
    }

    private final int zzu(zzafz zzafzVar, zzakg zzakgVar, int i10, boolean z10) throws zzat {
        int i11;
        String str = zzakgVar.zzc;
        if ("S_TEXT/UTF8".equals(str)) {
            zzw(zzafzVar, zzb, i10);
            int i12 = this.zzah;
            zzv();
            return i12;
        }
        if ("S_TEXT/ASS".equals(str) || "S_TEXT/SSA".equals(str)) {
            zzw(zzafzVar, zzd, i10);
            int i13 = this.zzah;
            zzv();
            return i13;
        }
        if ("S_TEXT/WEBVTT".equals(str)) {
            zzw(zzafzVar, zze, i10);
            int i14 = this.zzah;
            zzv();
            return i14;
        }
        if (zzakgVar.zzU) {
            zzakgVar.zzY.getClass();
            int i15 = zzafx.zza;
            zzet zzetVar = new zzet(i10);
            if (zzafzVar.zzh(zzetVar.zzi(), 0, i10, true)) {
                zzafzVar.zzl();
                if (zzafx.zza(zzetVar.zzr()) == 1 && zzetVar.zzd() >= 10) {
                    byte[] bArr = new byte[10];
                    zzetVar.zzm(bArr, 0, 10);
                    zzetVar.zzh(0);
                    int iZzc = zzafx.zzc(bArr);
                    if (zzetVar.zzd() >= iZzc + 4) {
                        zzetVar.zzk(iZzc);
                        if (zzafx.zza(zzetVar.zzB()) == 2) {
                            zzt zztVarZza = zzakgVar.zzY.zza();
                            zztVarZza.zzo(MimeTypes.AUDIO_DTS_HD);
                            zzakgVar.zzY = zztVarZza.zzO();
                        }
                    }
                }
            }
            zzakgVar.zzX.zzA(zzakgVar.zzY);
            zzakgVar.zzU = false;
            zzB();
        }
        zzahk zzahkVar = zzakgVar.zzX;
        if (!this.zzaj) {
            if (zzakgVar.zzh) {
                this.zzac &= -1073741825;
                if (!this.zzak) {
                    zzet zzetVar2 = this.zzo;
                    zzafzVar.zzc(zzetVar2.zzi(), 0, 1);
                    this.zzag++;
                    if ((zzetVar2.zzi()[0] & 128) == 128) {
                        throw zzat.zzb("Extension bit is set in signal byte", null);
                    }
                    this.zzan = zzetVar2.zzi()[0];
                    this.zzak = true;
                }
                byte b10 = this.zzan;
                if ((b10 & 1) == 1) {
                    int i16 = b10 & 2;
                    this.zzac |= 1073741824;
                    if (!this.zzao) {
                        zzet zzetVar3 = this.zzt;
                        zzafzVar.zzc(zzetVar3.zzi(), 0, 8);
                        this.zzag += 8;
                        this.zzao = true;
                        zzet zzetVar4 = this.zzo;
                        zzetVar4.zzi()[0] = (byte) ((i16 != 2 ? 0 : 128) | 8);
                        zzetVar4.zzh(0);
                        zzahkVar.zzd(zzetVar4, 1, 1);
                        this.zzah++;
                        zzetVar3.zzh(0);
                        zzahkVar.zzd(zzetVar3, 8, 1);
                        this.zzah += 8;
                    }
                    if (i16 == 2) {
                        if (!this.zzal) {
                            zzet zzetVar5 = this.zzo;
                            zzafzVar.zzc(zzetVar5.zzi(), 0, 1);
                            this.zzag++;
                            zzetVar5.zzh(0);
                            this.zzam = zzetVar5.zzs();
                            this.zzal = true;
                        }
                        int i17 = this.zzam * 4;
                        zzet zzetVar6 = this.zzo;
                        zzetVar6.zza(i17);
                        zzafzVar.zzc(zzetVar6.zzi(), 0, i17);
                        this.zzag += i17;
                        int i18 = (this.zzam >> 1) + 1;
                        int i19 = (i18 * 6) + 2;
                        ByteBuffer byteBuffer = this.zzw;
                        if (byteBuffer == null || byteBuffer.capacity() < i19) {
                            this.zzw = ByteBuffer.allocate(i19);
                        }
                        this.zzw.position(0);
                        this.zzw.putShort((short) i18);
                        int i20 = 0;
                        int i21 = 0;
                        while (true) {
                            i11 = this.zzam;
                            if (i20 >= i11) {
                                break;
                            }
                            int iZzH = zzetVar6.zzH();
                            int i22 = iZzH - i21;
                            if (i20 % 2 == 0) {
                                this.zzw.putShort((short) i22);
                            } else {
                                this.zzw.putInt(i22);
                            }
                            i20++;
                            i21 = iZzH;
                        }
                        int i23 = (i10 - this.zzag) - i21;
                        if ((i11 & 1) == 1) {
                            this.zzw.putInt(i23);
                        } else {
                            this.zzw.putShort((short) i23);
                            this.zzw.putInt(0);
                        }
                        zzet zzetVar7 = this.zzu;
                        zzetVar7.zzb(this.zzw.array(), i19);
                        zzahkVar.zzd(zzetVar7, i19, 1);
                        this.zzah += i19;
                    }
                }
            } else {
                byte[] bArr2 = zzakgVar.zzi;
                if (bArr2 != null) {
                    this.zzr.zzb(bArr2, bArr2.length);
                }
            }
            if (!"A_OPUS".equals(zzakgVar.zzc) ? zzakgVar.zzg > 0 : z10) {
                this.zzac |= 268435456;
                this.zzv.zza(0);
                int iZze = (this.zzr.zze() + i10) - this.zzag;
                zzet zzetVar8 = this.zzo;
                zzetVar8.zza(4);
                zzetVar8.zzi()[0] = (byte) ((iZze >> 24) & 255);
                zzetVar8.zzi()[1] = (byte) ((iZze >> 16) & 255);
                zzetVar8.zzi()[2] = (byte) ((iZze >> 8) & 255);
                zzetVar8.zzi()[3] = (byte) (iZze & 255);
                zzahkVar.zzd(zzetVar8, 4, 2);
                this.zzah += 4;
            }
            this.zzaj = true;
        }
        zzet zzetVar9 = this.zzr;
        int iZze2 = i10 + zzetVar9.zze();
        String str2 = zzakgVar.zzc;
        if (!"V_MPEG4/ISO/AVC".equals(str2) && !"V_MPEGH/ISO/HEVC".equals(str2)) {
            if (zzakgVar.zzT != null) {
                zzgtj.zzi(zzetVar9.zze() == 0);
                zzakgVar.zzT.zzb(zzafzVar);
            }
            while (true) {
                int i24 = this.zzag;
                if (i24 >= iZze2) {
                    break;
                }
                int iZzy = zzy(zzafzVar, zzahkVar, iZze2 - i24);
                this.zzag += iZzy;
                this.zzah += iZzy;
            }
        } else {
            zzet zzetVar10 = this.zzn;
            byte[] bArrZzi = zzetVar10.zzi();
            bArrZzi[0] = 0;
            bArrZzi[1] = 0;
            bArrZzi[2] = 0;
            int i25 = zzakgVar.zzZ;
            int i26 = 4 - i25;
            while (this.zzag < iZze2) {
                int i27 = this.zzai;
                if (i27 == 0) {
                    int iMin = Math.min(i25, zzetVar9.zzd());
                    zzafzVar.zzc(bArrZzi, i26 + iMin, i25 - iMin);
                    if (iMin > 0) {
                        zzetVar9.zzm(bArrZzi, i26, iMin);
                    }
                    this.zzag += i25;
                    zzetVar10.zzh(0);
                    this.zzai = zzetVar10.zzH();
                    zzet zzetVar11 = this.zzm;
                    zzetVar11.zzh(0);
                    zzahkVar.zzc(zzetVar11, 4);
                    this.zzah += 4;
                } else {
                    int iZzy2 = zzy(zzafzVar, zzahkVar, i27);
                    this.zzag += iZzy2;
                    this.zzah += iZzy2;
                    this.zzai -= iZzy2;
                }
            }
        }
        if ("A_VORBIS".equals(zzakgVar.zzc)) {
            zzet zzetVar12 = this.zzp;
            zzetVar12.zzh(0);
            zzahkVar.zzc(zzetVar12, 4);
            this.zzah += 4;
        }
        int i28 = this.zzah;
        zzv();
        return i28;
    }

    private final void zzv() {
        this.zzag = 0;
        this.zzah = 0;
        this.zzai = 0;
        this.zzaj = false;
        this.zzak = false;
        this.zzal = false;
        this.zzam = 0;
        this.zzan = (byte) 0;
        this.zzao = false;
        this.zzr.zza(0);
    }

    private final void zzw(zzafz zzafzVar, byte[] bArr, int i10) {
        int length = bArr.length;
        int i11 = length + i10;
        zzet zzetVar = this.zzs;
        if (zzetVar.zzj() < i11) {
            byte[] bArrCopyOf = Arrays.copyOf(bArr, i11 + i10);
            zzetVar.zzb(bArrCopyOf, bArrCopyOf.length);
        } else {
            System.arraycopy(bArr, 0, zzetVar.zzi(), 0, length);
        }
        zzafzVar.zzc(zzetVar.zzi(), length, i10);
        zzetVar.zzh(0);
        zzetVar.zzf(i11);
    }

    private static byte[] zzx(long j10, String str, long j11) {
        zzgtj.zza(j10 != C.TIME_UNSET);
        Locale locale = Locale.US;
        int i10 = (int) (j10 / 3600000000L);
        Integer numValueOf = Integer.valueOf(i10);
        long j12 = j10 - (((long) i10) * 3600000000L);
        int i11 = (int) (j12 / 60000000);
        Integer numValueOf2 = Integer.valueOf(i11);
        long j13 = j12 - (((long) i11) * 60000000);
        int i12 = (int) (j13 / 1000000);
        String str2 = String.format(locale, str, numValueOf, numValueOf2, Integer.valueOf(i12), Integer.valueOf((int) ((j13 - (((long) i12) * 1000000)) / j11)));
        String str3 = zzfl.zza;
        return str2.getBytes(StandardCharsets.UTF_8);
    }

    private final int zzy(zzafz zzafzVar, zzahk zzahkVar, int i10) {
        zzet zzetVar = this.zzr;
        int iZzd = zzetVar.zzd();
        if (iZzd <= 0) {
            return zzahkVar.zza(zzafzVar, i10, false);
        }
        int iMin = Math.min(i10, iZzd);
        zzahkVar.zzc(zzetVar, iMin);
        return iMin;
    }

    private final long zzz(long j10) throws zzat {
        long j11 = this.zzz;
        if (j11 != C.TIME_UNSET) {
            return zzfl.zzv(j10, j11, 1000L, RoundingMode.DOWN);
        }
        throw zzat.zzb("Can't scale timecode prior to timecodeScale being set.", null);
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final boolean zza(zzafz zzafzVar) {
        return new zzaki().zza(zzafzVar);
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final void zzc(zzagb zzagbVar) {
        if (this.zzk) {
            zzagbVar = new zzanm(zzagbVar, this.zzl);
        }
        this.zzap = zzagbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final int zzd(zzafz zzafzVar, zzagy zzagyVar) {
        int i10 = 0;
        this.zzT = false;
        while (!this.zzT) {
            boolean zZzc = this.zzaq.zzc(zzafzVar);
            if (zZzc) {
                long jZzn = zzafzVar.zzn();
                if (this.zzP) {
                    this.zzR = jZzn;
                    zzagyVar.zza = this.zzQ;
                    this.zzP = false;
                    return 1;
                }
                if (this.zzF) {
                    long j10 = this.zzR;
                    if (j10 != -1) {
                        zzagyVar.zza = j10;
                        this.zzR = -1L;
                        return 1;
                    }
                }
            }
            if (!zZzc) {
                while (true) {
                    SparseArray sparseArray = this.zzi;
                    if (i10 >= sparseArray.size()) {
                        return -1;
                    }
                    zzakg zzakgVar = (zzakg) sparseArray.valueAt(i10);
                    zzakgVar.zzb();
                    zzahl zzahlVar = zzakgVar.zzT;
                    if (zzahlVar != null) {
                        zzahlVar.zzd(zzakgVar.zzX, zzakgVar.zzj);
                    }
                    i10++;
                }
            }
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final void zze(long j10, long j11) {
        this.zzS = C.TIME_UNSET;
        int i10 = 0;
        this.zzU = 0;
        this.zzaq.zzb();
        this.zzh.zza();
        zzv();
        this.zzJ = false;
        this.zzK = C.TIME_UNSET;
        this.zzL = -1;
        this.zzM = -1L;
        this.zzN = -1L;
        if (!this.zzF) {
            this.zzI.clear();
        }
        while (true) {
            SparseArray sparseArray = this.zzi;
            if (i10 >= sparseArray.size()) {
                return;
            }
            zzahl zzahlVar = ((zzakg) sparseArray.valueAt(i10)).zzT;
            if (zzahlVar != null) {
                zzahlVar.zza();
            }
            i10++;
        }
    }

    protected final void zzh(int i10, long j10, long j11) throws zzat {
        zzagb zzagbVar = this.zzap;
        zzagbVar.getClass();
        if (i10 == 160) {
            this.zzae = false;
            this.zzaf = 0L;
            return;
        }
        if (i10 == 174) {
            zzakg zzakgVar = new zzakg();
            this.zzE = zzakgVar;
            zzakgVar.zza = this.zzC;
            return;
        }
        if (i10 == 183) {
            if (this.zzF) {
                return;
            }
            zzr(i10);
            this.zzL = -1;
            this.zzM = -1L;
            this.zzN = -1L;
            return;
        }
        if (i10 == 187) {
            if (this.zzF) {
                return;
            }
            zzr(i10);
            this.zzK = C.TIME_UNSET;
            return;
        }
        if (i10 == 19899) {
            this.zzG = -1;
            this.zzH = -1L;
            return;
        }
        if (i10 == 20533) {
            zzq(i10);
            this.zzE.zzh = true;
            return;
        }
        if (i10 == 408125543) {
            long j12 = this.zzy;
            if (j12 != -1 && j12 != j10) {
                throw zzat.zzb("Multiple Segment elements not supported", null);
            }
            this.zzy = j10;
            this.zzx = j11;
            return;
        }
        if (i10 == 475249515) {
            if (this.zzF) {
                return;
            }
            this.zzJ = true;
        } else if (i10 == 524531317 && !this.zzF) {
            if (this.zzj && this.zzQ != -1) {
                this.zzP = true;
            } else {
                zzagbVar.zzw(new zzaha(this.zzB, 0L));
                this.zzF = true;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:283:0x0482  */
    /* JADX WARN: Code duplicated, block: B:314:0x01d4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:316:0x01c5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:318:0x0107 A[EDGE_INSN: B:318:0x0107->B:55:0x0107 BREAK  A[LOOP:2: B:52:0x00f4->B:66:0x0168], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:320:0x0168 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:321:0x0168 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:40:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:42:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:49:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:51:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:53:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:56:0x010a  */
    /* JADX WARN: Code duplicated, block: B:58:0x0116  */
    /* JADX WARN: Code duplicated, block: B:60:0x0147  */
    /* JADX WARN: Code duplicated, block: B:63:0x015e  */
    /* JADX WARN: Code duplicated, block: B:65:0x0165  */
    /* JADX WARN: Code duplicated, block: B:69:0x0173  */
    /* JADX WARN: Code duplicated, block: B:72:0x0181  */
    /* JADX WARN: Code duplicated, block: B:74:0x018f  */
    /* JADX WARN: Code duplicated, block: B:75:0x019c  */
    /* JADX WARN: Code duplicated, block: B:79:0x01b8  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    protected final void zzi(int i10) throws zzat {
        int i11;
        int i12;
        int i13;
        SparseArray sparseArray;
        zzakg zzakgVar;
        long j10;
        long j11;
        long j12;
        long j13;
        List list;
        int i14;
        int iMin;
        double d10;
        int i15;
        int i16;
        long jZza;
        zzake zzakeVar;
        int i17;
        long jZzb;
        long jZzb2;
        long jZza2;
        long j14;
        int i18;
        long j15;
        double d11;
        zzap zzapVar;
        zzaiz zzaizVar;
        zzap zzapVarZzg;
        this.zzap.getClass();
        int i19 = 2;
        long j16 = 0;
        int i20 = 0;
        if (i10 == 160) {
            if (this.zzU == 2) {
                zzakg zzakgVar2 = (zzakg) this.zzi.get(this.zzaa);
                zzakgVar2.zzb();
                if (this.zzaf > 0 && "A_OPUS".equals(zzakgVar2.zzc)) {
                    zzet zzetVar = this.zzv;
                    byte[] bArrArray = ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(this.zzaf).array();
                    zzetVar.zzb(bArrArray, bArrArray.length);
                }
                int i21 = 0;
                for (int i22 = 0; i22 < this.zzY; i22++) {
                    i21 += this.zzZ[i22];
                }
                int i23 = 0;
                while (i23 < this.zzY) {
                    long j17 = this.zzV + ((long) ((zzakgVar2.zzf * i23) / 1000));
                    int i24 = this.zzac;
                    if (i23 == 0) {
                        if (!this.zzae) {
                            i24 |= 1;
                        }
                        i11 = 0;
                    } else {
                        i11 = i23;
                    }
                    int i25 = this.zzZ[i11];
                    int i26 = i21 - i25;
                    zzs(zzakgVar2, j17, i24, i25, i26);
                    i23 = i11 + 1;
                    i21 = i26;
                }
                this.zzU = 0;
                return;
            }
            return;
        }
        if (i10 == 174) {
            zzakg zzakgVar3 = this.zzE;
            zzakgVar3.getClass();
            String str = zzakgVar3.zzc;
            if (str == null) {
                throw zzat.zzb("CodecId is missing in TrackEntry element", null);
            }
            switch (str.hashCode()) {
                case -2095576542:
                    if (str.equals("V_MPEG4/ISO/AP")) {
                        zzakgVar3.zza(zzakgVar3.zzd);
                        zzakgVar3.zzX = this.zzap.zzu(zzakgVar3.zzd, zzakgVar3.zze);
                        this.zzi.put(zzakgVar3.zzd, zzakgVar3);
                    }
                    break;
                case -2095575984:
                    if (str.equals("V_MPEG4/ISO/SP")) {
                        zzakgVar3.zza(zzakgVar3.zzd);
                        zzakgVar3.zzX = this.zzap.zzu(zzakgVar3.zzd, zzakgVar3.zze);
                        this.zzi.put(zzakgVar3.zzd, zzakgVar3);
                    }
                    break;
                case -1985379776:
                    if (str.equals("A_MS/ACM")) {
                        zzakgVar3.zza(zzakgVar3.zzd);
                        zzakgVar3.zzX = this.zzap.zzu(zzakgVar3.zzd, zzakgVar3.zze);
                        this.zzi.put(zzakgVar3.zzd, zzakgVar3);
                    }
                    break;
                case -1784763192:
                    if (str.equals("A_TRUEHD")) {
                        zzakgVar3.zza(zzakgVar3.zzd);
                        zzakgVar3.zzX = this.zzap.zzu(zzakgVar3.zzd, zzakgVar3.zze);
                        this.zzi.put(zzakgVar3.zzd, zzakgVar3);
                    }
                    break;
                case -1730367663:
                    if (str.equals("A_VORBIS")) {
                        zzakgVar3.zza(zzakgVar3.zzd);
                        zzakgVar3.zzX = this.zzap.zzu(zzakgVar3.zzd, zzakgVar3.zze);
                        this.zzi.put(zzakgVar3.zzd, zzakgVar3);
                    }
                    break;
                case -1482641358:
                    if (str.equals("A_MPEG/L2")) {
                        zzakgVar3.zza(zzakgVar3.zzd);
                        zzakgVar3.zzX = this.zzap.zzu(zzakgVar3.zzd, zzakgVar3.zze);
                        this.zzi.put(zzakgVar3.zzd, zzakgVar3);
                    }
                    break;
                case -1482641357:
                    if (str.equals("A_MPEG/L3")) {
                        zzakgVar3.zza(zzakgVar3.zzd);
                        zzakgVar3.zzX = this.zzap.zzu(zzakgVar3.zzd, zzakgVar3.zze);
                        this.zzi.put(zzakgVar3.zzd, zzakgVar3);
                    }
                    break;
                case -1373388978:
                    if (str.equals("V_MS/VFW/FOURCC")) {
                        zzakgVar3.zza(zzakgVar3.zzd);
                        zzakgVar3.zzX = this.zzap.zzu(zzakgVar3.zzd, zzakgVar3.zze);
                        this.zzi.put(zzakgVar3.zzd, zzakgVar3);
                    }
                    break;
                case -933872740:
                    if (str.equals("S_DVBSUB")) {
                        zzakgVar3.zza(zzakgVar3.zzd);
                        zzakgVar3.zzX = this.zzap.zzu(zzakgVar3.zzd, zzakgVar3.zze);
                        this.zzi.put(zzakgVar3.zzd, zzakgVar3);
                    }
                    break;
                case -538363189:
                    if (str.equals("V_MPEG4/ISO/ASP")) {
                        zzakgVar3.zza(zzakgVar3.zzd);
                        zzakgVar3.zzX = this.zzap.zzu(zzakgVar3.zzd, zzakgVar3.zze);
                        this.zzi.put(zzakgVar3.zzd, zzakgVar3);
                    }
                    break;
                case -538363109:
                    if (str.equals("V_MPEG4/ISO/AVC")) {
                        zzakgVar3.zza(zzakgVar3.zzd);
                        zzakgVar3.zzX = this.zzap.zzu(zzakgVar3.zzd, zzakgVar3.zze);
                        this.zzi.put(zzakgVar3.zzd, zzakgVar3);
                    }
                    break;
                case -425012669:
                    if (str.equals("S_VOBSUB")) {
                        zzakgVar3.zza(zzakgVar3.zzd);
                        zzakgVar3.zzX = this.zzap.zzu(zzakgVar3.zzd, zzakgVar3.zze);
                        this.zzi.put(zzakgVar3.zzd, zzakgVar3);
                    }
                    break;
                case -356037306:
                    if (str.equals("A_DTS/LOSSLESS")) {
                        zzakgVar3.zza(zzakgVar3.zzd);
                        zzakgVar3.zzX = this.zzap.zzu(zzakgVar3.zzd, zzakgVar3.zze);
                        this.zzi.put(zzakgVar3.zzd, zzakgVar3);
                    }
                    break;
                case 62923557:
                    if (str.equals("A_AAC")) {
                        zzakgVar3.zza(zzakgVar3.zzd);
                        zzakgVar3.zzX = this.zzap.zzu(zzakgVar3.zzd, zzakgVar3.zze);
                        this.zzi.put(zzakgVar3.zzd, zzakgVar3);
                    }
                    break;
                case 62923603:
                    if (str.equals("A_AC3")) {
                        zzakgVar3.zza(zzakgVar3.zzd);
                        zzakgVar3.zzX = this.zzap.zzu(zzakgVar3.zzd, zzakgVar3.zze);
                        this.zzi.put(zzakgVar3.zzd, zzakgVar3);
                    }
                    break;
                case 62927045:
                    if (str.equals("A_DTS")) {
                        zzakgVar3.zza(zzakgVar3.zzd);
                        zzakgVar3.zzX = this.zzap.zzu(zzakgVar3.zzd, zzakgVar3.zze);
                        this.zzi.put(zzakgVar3.zzd, zzakgVar3);
                    }
                    break;
                case 82318131:
                    if (str.equals("V_AV1")) {
                        zzakgVar3.zza(zzakgVar3.zzd);
                        zzakgVar3.zzX = this.zzap.zzu(zzakgVar3.zzd, zzakgVar3.zze);
                        this.zzi.put(zzakgVar3.zzd, zzakgVar3);
                    }
                    break;
                case 82338133:
                    if (str.equals("V_VP8")) {
                        zzakgVar3.zza(zzakgVar3.zzd);
                        zzakgVar3.zzX = this.zzap.zzu(zzakgVar3.zzd, zzakgVar3.zze);
                        this.zzi.put(zzakgVar3.zzd, zzakgVar3);
                    }
                    break;
                case 82338134:
                    if (str.equals("V_VP9")) {
                        zzakgVar3.zza(zzakgVar3.zzd);
                        zzakgVar3.zzX = this.zzap.zzu(zzakgVar3.zzd, zzakgVar3.zze);
                        this.zzi.put(zzakgVar3.zzd, zzakgVar3);
                    }
                    break;
                case 99146302:
                    if (str.equals("S_HDMV/PGS")) {
                        zzakgVar3.zza(zzakgVar3.zzd);
                        zzakgVar3.zzX = this.zzap.zzu(zzakgVar3.zzd, zzakgVar3.zze);
                        this.zzi.put(zzakgVar3.zzd, zzakgVar3);
                    }
                    break;
                case 444813526:
                    if (str.equals("V_THEORA")) {
                        zzakgVar3.zza(zzakgVar3.zzd);
                        zzakgVar3.zzX = this.zzap.zzu(zzakgVar3.zzd, zzakgVar3.zze);
                        this.zzi.put(zzakgVar3.zzd, zzakgVar3);
                    }
                    break;
                case 542569478:
                    if (str.equals("A_DTS/EXPRESS")) {
                        zzakgVar3.zza(zzakgVar3.zzd);
                        zzakgVar3.zzX = this.zzap.zzu(zzakgVar3.zzd, zzakgVar3.zze);
                        this.zzi.put(zzakgVar3.zzd, zzakgVar3);
                    }
                    break;
                case 635596514:
                    if (str.equals("A_PCM/FLOAT/IEEE")) {
                        zzakgVar3.zza(zzakgVar3.zzd);
                        zzakgVar3.zzX = this.zzap.zzu(zzakgVar3.zzd, zzakgVar3.zze);
                        this.zzi.put(zzakgVar3.zzd, zzakgVar3);
                    }
                    break;
                case 725948237:
                    if (str.equals("A_PCM/INT/BIG")) {
                        zzakgVar3.zza(zzakgVar3.zzd);
                        zzakgVar3.zzX = this.zzap.zzu(zzakgVar3.zzd, zzakgVar3.zze);
                        this.zzi.put(zzakgVar3.zzd, zzakgVar3);
                    }
                    break;
                case 725957860:
                    if (str.equals("A_PCM/INT/LIT")) {
                        zzakgVar3.zza(zzakgVar3.zzd);
                        zzakgVar3.zzX = this.zzap.zzu(zzakgVar3.zzd, zzakgVar3.zze);
                        this.zzi.put(zzakgVar3.zzd, zzakgVar3);
                    }
                    break;
                case 738597099:
                    if (str.equals("S_TEXT/ASS")) {
                        zzakgVar3.zza(zzakgVar3.zzd);
                        zzakgVar3.zzX = this.zzap.zzu(zzakgVar3.zzd, zzakgVar3.zze);
                        this.zzi.put(zzakgVar3.zzd, zzakgVar3);
                    }
                    break;
                case 738614379:
                    if (str.equals("S_TEXT/SSA")) {
                        zzakgVar3.zza(zzakgVar3.zzd);
                        zzakgVar3.zzX = this.zzap.zzu(zzakgVar3.zzd, zzakgVar3.zze);
                        this.zzi.put(zzakgVar3.zzd, zzakgVar3);
                    }
                    break;
                case 855502857:
                    if (str.equals("V_MPEGH/ISO/HEVC")) {
                        zzakgVar3.zza(zzakgVar3.zzd);
                        zzakgVar3.zzX = this.zzap.zzu(zzakgVar3.zzd, zzakgVar3.zze);
                        this.zzi.put(zzakgVar3.zzd, zzakgVar3);
                    }
                    break;
                case 1045209816:
                    if (str.equals("S_TEXT/WEBVTT")) {
                        zzakgVar3.zza(zzakgVar3.zzd);
                        zzakgVar3.zzX = this.zzap.zzu(zzakgVar3.zzd, zzakgVar3.zze);
                        this.zzi.put(zzakgVar3.zzd, zzakgVar3);
                    }
                    break;
                case 1422270023:
                    if (str.equals("S_TEXT/UTF8")) {
                        zzakgVar3.zza(zzakgVar3.zzd);
                        zzakgVar3.zzX = this.zzap.zzu(zzakgVar3.zzd, zzakgVar3.zze);
                        this.zzi.put(zzakgVar3.zzd, zzakgVar3);
                    }
                    break;
                case 1809237540:
                    if (str.equals("V_MPEG2")) {
                        zzakgVar3.zza(zzakgVar3.zzd);
                        zzakgVar3.zzX = this.zzap.zzu(zzakgVar3.zzd, zzakgVar3.zze);
                        this.zzi.put(zzakgVar3.zzd, zzakgVar3);
                    }
                    break;
                case 1950749482:
                    if (str.equals("A_EAC3")) {
                        zzakgVar3.zza(zzakgVar3.zzd);
                        zzakgVar3.zzX = this.zzap.zzu(zzakgVar3.zzd, zzakgVar3.zze);
                        this.zzi.put(zzakgVar3.zzd, zzakgVar3);
                    }
                    break;
                case 1950789798:
                    if (str.equals("A_FLAC")) {
                        zzakgVar3.zza(zzakgVar3.zzd);
                        zzakgVar3.zzX = this.zzap.zzu(zzakgVar3.zzd, zzakgVar3.zze);
                        this.zzi.put(zzakgVar3.zzd, zzakgVar3);
                    }
                    break;
                case 1951062397:
                    if (str.equals("A_OPUS")) {
                        zzakgVar3.zza(zzakgVar3.zzd);
                        zzakgVar3.zzX = this.zzap.zzu(zzakgVar3.zzd, zzakgVar3.zze);
                        this.zzi.put(zzakgVar3.zzd, zzakgVar3);
                    }
                    break;
            }
            this.zzE = null;
            return;
        }
        long j18 = C.TIME_UNSET;
        if (i10 == 183) {
            if (this.zzF) {
                return;
            }
            zzr(i10);
            if (this.zzK == C.TIME_UNSET || (i12 = this.zzL) == -1 || this.zzM == -1) {
                return;
            }
            SparseArray sparseArray2 = this.zzI;
            List arrayList = (List) sparseArray2.get(i12);
            if (arrayList == null) {
                arrayList = new ArrayList();
                sparseArray2.put(this.zzL, arrayList);
            }
            arrayList.add(new zzake(this.zzK, this.zzy + this.zzM, this.zzN, null));
            return;
        }
        if (i10 == 19899) {
            int i27 = this.zzG;
            if (i27 != -1) {
                long j19 = this.zzH;
                if (j19 != -1) {
                    if (i27 == 475249515) {
                        this.zzQ = j19;
                        return;
                    }
                    return;
                }
            }
            throw zzat.zzb("Mandatory element SeekID or SeekPosition not found", null);
        }
        if (i10 == 25152) {
            zzq(i10);
            zzakg zzakgVar4 = this.zzE;
            if (zzakgVar4.zzh) {
                if (zzakgVar4.zzj == null) {
                    throw zzat.zzb("Encrypted Track found but ContentEncKeyID was not found", null);
                }
                zzakgVar4.zzl = new zzq(null, new zzp(zzg.zza, null, MimeTypes.VIDEO_WEBM, this.zzE.zzj.zzb));
                return;
            }
            return;
        }
        if (i10 == 28032) {
            zzq(i10);
            zzakg zzakgVar5 = this.zzE;
            if (zzakgVar5.zzh && zzakgVar5.zzi != null) {
                throw zzat.zzb("Combining encryption and compression is not supported", null);
            }
            return;
        }
        if (i10 == 357149030) {
            if (this.zzz == C.TIME_UNSET) {
                this.zzz = 1000000L;
            }
            long j20 = this.zzA;
            if (j20 != C.TIME_UNSET) {
                this.zzB = zzz(j20);
                return;
            }
            return;
        }
        if (i10 == 374648427) {
            SparseArray sparseArray3 = this.zzi;
            if (sparseArray3.size() == 0) {
                throw zzat.zzb("No valid tracks were found", null);
            }
            boolean z10 = !this.zzj || this.zzQ == -1;
            int i28 = -1;
            int i29 = -1;
            int i30 = -1;
            int i31 = -1;
            for (int i32 = 0; i32 < sparseArray3.size(); i32++) {
                zzakg zzakgVar6 = (zzakg) sparseArray3.valueAt(i32);
                int i33 = zzakgVar6.zze;
                if (i33 == 2) {
                    if (zzakgVar6.zzW) {
                        i28 = zzakgVar6.zzd;
                    }
                    if (i29 == -1) {
                        i29 = zzakgVar6.zzd;
                    }
                } else if (i33 == 1) {
                    if (zzakgVar6.zzW) {
                        i30 = zzakgVar6.zzd;
                    }
                    if (i31 == -1) {
                        i31 = zzakgVar6.zzd;
                    }
                }
                if (z10) {
                    zzakgVar6.zzb();
                    if (!zzakgVar6.zzU) {
                        zzahk zzahkVar = zzakgVar6.zzX;
                        zzv zzvVar = zzakgVar6.zzY;
                        zzvVar.getClass();
                        zzahkVar.zzA(zzvVar);
                    }
                }
            }
            if (i28 != -1) {
                this.zzO = i28;
            } else if (i29 != -1) {
                this.zzO = i29;
            } else if (i30 != -1) {
                this.zzO = i30;
            } else if (i31 != -1) {
                this.zzO = i31;
            } else {
                this.zzO = sparseArray3.size() > 0 ? ((zzakg) sparseArray3.valueAt(0)).zzd : -1;
            }
            if (z10) {
                zzB();
                return;
            }
            return;
        }
        if (i10 != 475249515 || this.zzF) {
            return;
        }
        int i34 = 0;
        while (true) {
            SparseArray sparseArray4 = this.zzI;
            if (i34 < sparseArray4.size()) {
                if (((List) sparseArray4.valueAt(i34)).isEmpty()) {
                    i34++;
                } else {
                    if (this.zzB != C.TIME_UNSET) {
                        for (int i35 = 0; i35 < sparseArray4.size(); i35++) {
                            Collections.sort((List) sparseArray4.valueAt(i35));
                        }
                        this.zzap.zzw(new zzakf(sparseArray4, this.zzB, this.zzO, this.zzy, this.zzx));
                    }
                    this.zzF = true;
                    this.zzJ = false;
                    i13 = 0;
                    while (true) {
                        sparseArray = this.zzi;
                        if (i13 < sparseArray.size()) {
                            zzB();
                            return;
                        }
                        zzakgVar = (zzakg) sparseArray.valueAt(i13);
                        j10 = this.zzB;
                        j11 = this.zzy;
                        j12 = this.zzx;
                        j13 = j16;
                        if (zzakgVar.zze == i19 || (list = (List) sparseArray4.get(zzakgVar.zzd)) == null || list.isEmpty()) {
                            i14 = i20;
                        } else {
                            if (list.isEmpty()) {
                                i14 = i20;
                            } else {
                                i14 = i20;
                                iMin = Math.min(list.size(), 20);
                                d10 = 0.0d;
                                i15 = i14;
                                i16 = -1;
                                while (i15 < iMin) {
                                    zzakeVar = (zzake) list.get(i15);
                                    if (zzakeVar.zza() > 10000000) {
                                        break;
                                    }
                                    i17 = i15 + 1;
                                    if (i15 < list.size() - 1) {
                                        zzake zzakeVar2 = (zzake) list.get(i17);
                                        jZzb = zzakeVar2.zzb() + zzakeVar2.zzc();
                                        jZzb2 = zzakeVar.zzb() + zzakeVar.zzc();
                                        jZza2 = zzakeVar2.zza() - zzakeVar.zza();
                                    } else {
                                        jZzb = j11 + j12;
                                        jZzb2 = zzakeVar.zzb() + zzakeVar.zzc();
                                        jZza2 = j10 - zzakeVar.zza();
                                    }
                                    j14 = jZzb - jZzb2;
                                    int i36 = iMin;
                                    long j21 = j10;
                                    i18 = i15;
                                    j15 = jZza2;
                                    if (j15 > j13) {
                                        d11 = j14 / j15;
                                        if (d11 > d10) {
                                            d10 = d11;
                                            i16 = i18;
                                        }
                                    }
                                    iMin = i36;
                                    i15 = i17;
                                    j10 = j21;
                                }
                                if (i16 == -1) {
                                    jZza = ((zzake) list.get(i16)).zza();
                                }
                                if (jZza != j18) {
                                    zzv zzvVar2 = zzakgVar.zzY;
                                    zzvVar2.getClass();
                                    zzapVar = zzvVar2.zzl;
                                    zzaizVar = new zzaiz(jZza);
                                    if (zzapVar == null) {
                                        zzao[] zzaoVarArr = new zzao[1];
                                        zzaoVarArr[i14] = zzaizVar;
                                        zzapVarZzg = new zzap(j18, zzaoVarArr);
                                    } else {
                                        zzao[] zzaoVarArr2 = new zzao[1];
                                        zzaoVarArr2[i14] = zzaizVar;
                                        zzapVarZzg = zzapVar.zzg(zzaoVarArr2);
                                    }
                                    zzt zztVarZza = zzakgVar.zzY.zza();
                                    zztVarZza.zzl(zzapVarZzg);
                                    zzakgVar.zzY = zztVarZza.zzO();
                                }
                            }
                            jZza = j18;
                            if (jZza != j18) {
                                zzv zzvVar3 = zzakgVar.zzY;
                                zzvVar3.getClass();
                                zzapVar = zzvVar3.zzl;
                                zzaizVar = new zzaiz(jZza);
                                if (zzapVar == null) {
                                    zzao[] zzaoVarArr3 = new zzao[1];
                                    zzaoVarArr3[i14] = zzaizVar;
                                    zzapVarZzg = new zzap(j18, zzaoVarArr3);
                                } else {
                                    zzao[] zzaoVarArr4 = new zzao[1];
                                    zzaoVarArr4[i14] = zzaizVar;
                                    zzapVarZzg = zzapVar.zzg(zzaoVarArr4);
                                }
                                zzt zztVarZza2 = zzakgVar.zzY.zza();
                                zztVarZza2.zzl(zzapVarZzg);
                                zzakgVar.zzY = zztVarZza2.zzO();
                            }
                        }
                        if (!zzakgVar.zzU) {
                            zzakgVar.zzb();
                            zzahk zzahkVar2 = zzakgVar.zzX;
                            zzv zzvVar4 = zzakgVar.zzY;
                            zzvVar4.getClass();
                            zzahkVar2.zzA(zzvVar4);
                        }
                        i13++;
                        j16 = j13;
                        i20 = i14;
                        i19 = 2;
                        j18 = C.TIME_UNSET;
                    }
                }
            }
            this.zzap.zzw(new zzaha(this.zzB, 0L));
            this.zzF = true;
            this.zzJ = false;
            i13 = 0;
            while (true) {
                sparseArray = this.zzi;
                if (i13 < sparseArray.size()) {
                    zzB();
                    return;
                }
                zzakgVar = (zzakg) sparseArray.valueAt(i13);
                j10 = this.zzB;
                j11 = this.zzy;
                j12 = this.zzx;
                j13 = j16;
                if (zzakgVar.zze == i19) {
                    i14 = i20;
                } else {
                    if (list.isEmpty()) {
                        i14 = i20;
                    } else {
                        i14 = i20;
                        iMin = Math.min(list.size(), 20);
                        d10 = 0.0d;
                        i15 = i14;
                        i16 = -1;
                        while (i15 < iMin) {
                            zzakeVar = (zzake) list.get(i15);
                            if (zzakeVar.zza() > 10000000) {
                                break;
                                break;
                            }
                            i17 = i15 + 1;
                            if (i15 < list.size() - 1) {
                                zzake zzakeVar3 = (zzake) list.get(i17);
                                jZzb = zzakeVar3.zzb() + zzakeVar3.zzc();
                                jZzb2 = zzakeVar.zzb() + zzakeVar.zzc();
                                jZza2 = zzakeVar3.zza() - zzakeVar.zza();
                            } else {
                                jZzb = j11 + j12;
                                jZzb2 = zzakeVar.zzb() + zzakeVar.zzc();
                                jZza2 = j10 - zzakeVar.zza();
                            }
                            j14 = jZzb - jZzb2;
                            int i37 = iMin;
                            long j22 = j10;
                            i18 = i15;
                            j15 = jZza2;
                            if (j15 > j13) {
                                d11 = j14 / j15;
                                if (d11 > d10) {
                                    d10 = d11;
                                    i16 = i18;
                                }
                            }
                            iMin = i37;
                            i15 = i17;
                            j10 = j22;
                        }
                        if (i16 == -1) {
                            jZza = ((zzake) list.get(i16)).zza();
                        }
                        if (jZza != j18) {
                            zzv zzvVar5 = zzakgVar.zzY;
                            zzvVar5.getClass();
                            zzapVar = zzvVar5.zzl;
                            zzaizVar = new zzaiz(jZza);
                            if (zzapVar == null) {
                                zzao[] zzaoVarArr5 = new zzao[1];
                                zzaoVarArr5[i14] = zzaizVar;
                                zzapVarZzg = new zzap(j18, zzaoVarArr5);
                            } else {
                                zzao[] zzaoVarArr6 = new zzao[1];
                                zzaoVarArr6[i14] = zzaizVar;
                                zzapVarZzg = zzapVar.zzg(zzaoVarArr6);
                            }
                            zzt zztVarZza3 = zzakgVar.zzY.zza();
                            zztVarZza3.zzl(zzapVarZzg);
                            zzakgVar.zzY = zztVarZza3.zzO();
                        }
                    }
                    jZza = j18;
                    if (jZza != j18) {
                        zzv zzvVar6 = zzakgVar.zzY;
                        zzvVar6.getClass();
                        zzapVar = zzvVar6.zzl;
                        zzaizVar = new zzaiz(jZza);
                        if (zzapVar == null) {
                            zzao[] zzaoVarArr7 = new zzao[1];
                            zzaoVarArr7[i14] = zzaizVar;
                            zzapVarZzg = new zzap(j18, zzaoVarArr7);
                        } else {
                            zzao[] zzaoVarArr8 = new zzao[1];
                            zzaoVarArr8[i14] = zzaizVar;
                            zzapVarZzg = zzapVar.zzg(zzaoVarArr8);
                        }
                        zzt zztVarZza4 = zzakgVar.zzY.zza();
                        zztVarZza4.zzl(zzapVarZzg);
                        zzakgVar.zzY = zztVarZza4.zzO();
                    }
                }
                if (!zzakgVar.zzU) {
                    zzakgVar.zzb();
                    zzahk zzahkVar3 = zzakgVar.zzX;
                    zzv zzvVar7 = zzakgVar.zzY;
                    zzvVar7.getClass();
                    zzahkVar3.zzA(zzvVar7);
                }
                i13++;
                j16 = j13;
                i20 = i14;
                i19 = 2;
                j18 = C.TIME_UNSET;
            }
        }
    }

    protected final void zzj(int i10, long j10) throws zzat {
        boolean z10;
        if (i10 == 240) {
            if (this.zzF) {
                return;
            }
            zzr(i10);
            if (this.zzN == -1) {
                this.zzN = j10;
                return;
            }
            return;
        }
        if (i10 == 241) {
            if (this.zzF) {
                return;
            }
            zzr(i10);
            if (this.zzM == -1) {
                this.zzM = j10;
                return;
            }
            return;
        }
        if (i10 == 20529) {
            if (j10 == 0) {
                return;
            }
            StringBuilder sb2 = new StringBuilder(String.valueOf(j10).length() + 35);
            sb2.append("ContentEncodingOrder ");
            sb2.append(j10);
            sb2.append(" not supported");
            throw zzat.zzb(sb2.toString(), null);
        }
        if (i10 == 20530) {
            if (j10 == 1) {
                return;
            }
            StringBuilder sb3 = new StringBuilder(String.valueOf(j10).length() + 35);
            sb3.append("ContentEncodingScope ");
            sb3.append(j10);
            sb3.append(" not supported");
            throw zzat.zzb(sb3.toString(), null);
        }
        switch (i10) {
            case MRAID_JS_WRITE_FAILED_VALUE:
                int i11 = (int) j10;
                if (i11 == 1) {
                    zzq(i10);
                    this.zzE.zze = 2;
                    return;
                }
                if (i11 == 2) {
                    zzq(i10);
                    this.zzE.zze = 1;
                    return;
                } else if (i11 == 17) {
                    zzq(i10);
                    this.zzE.zze = 3;
                    return;
                } else if (i11 != 33) {
                    zzq(i10);
                    this.zzE.zze = -1;
                    return;
                } else {
                    zzq(i10);
                    this.zzE.zze = 5;
                    return;
                }
            case PRIVACY_URL_ERROR_VALUE:
                z10 = j10 == 1;
                zzq(i10);
                this.zzE.zzW = z10;
                return;
            case 155:
                this.zzW = zzz(j10);
                return;
            case 159:
                zzq(i10);
                this.zzE.zzO = (int) j10;
                return;
            case 176:
                zzq(i10);
                this.zzE.zzm = (int) j10;
                return;
            case 179:
                if (this.zzF) {
                    return;
                }
                zzr(i10);
                this.zzK = zzz(j10);
                return;
            case 186:
                zzq(i10);
                this.zzE.zzn = (int) j10;
                return;
            case AD_RESPONSE_EMPTY_VALUE:
                zzq(i10);
                this.zzE.zzd = (int) j10;
                return;
            case 231:
                this.zzS = zzz(j10);
                return;
            case 238:
                this.zzad = (int) j10;
                return;
            case 247:
                if (this.zzF) {
                    return;
                }
                zzr(i10);
                this.zzL = (int) j10;
                return;
            case 251:
                this.zzae = true;
                return;
            case 16871:
                zzq(i10);
                this.zzE.zzd((int) j10);
                return;
            case 16980:
                if (j10 == 3) {
                    return;
                }
                StringBuilder sb4 = new StringBuilder(String.valueOf(j10).length() + 30);
                sb4.append("ContentCompAlgo ");
                sb4.append(j10);
                sb4.append(" not supported");
                throw zzat.zzb(sb4.toString(), null);
            case 17029:
                if (j10 < 1 || j10 > 2) {
                    StringBuilder sb5 = new StringBuilder(String.valueOf(j10).length() + 33);
                    sb5.append("DocTypeReadVersion ");
                    sb5.append(j10);
                    sb5.append(" not supported");
                    throw zzat.zzb(sb5.toString(), null);
                }
                return;
            case 17143:
                if (j10 == 1) {
                    return;
                }
                StringBuilder sb6 = new StringBuilder(String.valueOf(j10).length() + 30);
                sb6.append("EBMLReadVersion ");
                sb6.append(j10);
                sb6.append(" not supported");
                throw zzat.zzb(sb6.toString(), null);
            case 18401:
                if (j10 == 5) {
                    return;
                }
                StringBuilder sb7 = new StringBuilder(String.valueOf(j10).length() + 29);
                sb7.append("ContentEncAlgo ");
                sb7.append(j10);
                sb7.append(" not supported");
                throw zzat.zzb(sb7.toString(), null);
            case 18408:
                if (j10 == 1) {
                    return;
                }
                StringBuilder sb8 = new StringBuilder(String.valueOf(j10).length() + 36);
                sb8.append("AESSettingsCipherMode ");
                sb8.append(j10);
                sb8.append(" not supported");
                throw zzat.zzb(sb8.toString(), null);
            case 21420:
                this.zzH = j10 + this.zzy;
                return;
            case 21432:
                int i12 = (int) j10;
                zzq(i10);
                if (i12 == 0) {
                    this.zzE.zzx = 0;
                    return;
                }
                if (i12 == 1) {
                    this.zzE.zzx = 2;
                    return;
                } else if (i12 == 3) {
                    this.zzE.zzx = 1;
                    return;
                } else {
                    if (i12 != 15) {
                        return;
                    }
                    this.zzE.zzx = 3;
                    return;
                }
            case 21680:
                zzq(i10);
                this.zzE.zzp = (int) j10;
                return;
            case 21682:
                zzq(i10);
                this.zzE.zzr = (int) j10;
                return;
            case 21690:
                zzq(i10);
                this.zzE.zzq = (int) j10;
                return;
            case 21930:
                z10 = j10 == 1;
                zzq(i10);
                this.zzE.zzV = z10;
                return;
            case 21938:
                zzq(i10);
                this.zzE.zzo = (int) j10;
                return;
            case 21998:
                zzq(i10);
                this.zzE.zzg = (int) j10;
                return;
            case 22186:
                zzq(i10);
                this.zzE.zzR = j10;
                return;
            case 22203:
                zzq(i10);
                this.zzE.zzS = j10;
                return;
            case 25188:
                zzq(i10);
                this.zzE.zzP = (int) j10;
                return;
            case 30114:
                this.zzaf = j10;
                return;
            case 30321:
                int i13 = (int) j10;
                zzq(i10);
                if (i13 == 0) {
                    this.zzE.zzs = 0;
                    return;
                }
                if (i13 == 1) {
                    this.zzE.zzs = 1;
                    return;
                } else if (i13 == 2) {
                    this.zzE.zzs = 2;
                    return;
                } else {
                    if (i13 != 3) {
                        return;
                    }
                    this.zzE.zzs = 3;
                    return;
                }
            case 2352003:
                zzq(i10);
                this.zzE.zzf = (int) j10;
                return;
            case 2807729:
                this.zzz = j10;
                return;
            default:
                switch (i10) {
                    case 21945:
                        int i14 = (int) j10;
                        zzq(i10);
                        if (i14 == 1) {
                            this.zzE.zzA = 2;
                            return;
                        } else {
                            if (i14 != 2) {
                                return;
                            }
                            this.zzE.zzA = 1;
                            return;
                        }
                    case 21946:
                        zzq(i10);
                        int iZzc = zzi.zzc((int) j10);
                        if (iZzc != -1) {
                            this.zzE.zzz = iZzc;
                            return;
                        }
                        return;
                    case 21947:
                        zzq(i10);
                        int iZzb = zzi.zzb((int) j10);
                        if (iZzb != -1) {
                            this.zzE.zzy = iZzb;
                            return;
                        }
                        return;
                    case 21948:
                        zzq(i10);
                        this.zzE.zzB = (int) j10;
                        return;
                    case 21949:
                        zzq(i10);
                        this.zzE.zzC = (int) j10;
                        return;
                    default:
                        return;
                }
        }
    }

    protected final void zzk(int i10, double d10) throws zzat {
        if (i10 == 181) {
            zzq(i10);
            this.zzE.zzQ = (int) d10;
            return;
        }
        if (i10 == 17545) {
            this.zzA = (long) d10;
            return;
        }
        switch (i10) {
            case 21969:
                zzq(i10);
                this.zzE.zzD = (float) d10;
                break;
            case 21970:
                zzq(i10);
                this.zzE.zzE = (float) d10;
                break;
            case 21971:
                zzq(i10);
                this.zzE.zzF = (float) d10;
                break;
            case 21972:
                zzq(i10);
                this.zzE.zzG = (float) d10;
                break;
            case 21973:
                zzq(i10);
                this.zzE.zzH = (float) d10;
                break;
            case 21974:
                zzq(i10);
                this.zzE.zzI = (float) d10;
                break;
            case 21975:
                zzq(i10);
                this.zzE.zzJ = (float) d10;
                break;
            case 21976:
                zzq(i10);
                this.zzE.zzK = (float) d10;
                break;
            case 21977:
                zzq(i10);
                this.zzE.zzL = (float) d10;
                break;
            case 21978:
                zzq(i10);
                this.zzE.zzM = (float) d10;
                break;
            default:
                switch (i10) {
                    case 30323:
                        zzq(i10);
                        this.zzE.zzt = (float) d10;
                        break;
                    case 30324:
                        zzq(i10);
                        this.zzE.zzu = (float) d10;
                        break;
                    case 30325:
                        zzq(i10);
                        this.zzE.zzv = (float) d10;
                        break;
                }
                break;
        }
    }

    protected final void zzl(int i10, String str) throws zzat {
        if (i10 == 134) {
            zzq(i10);
            this.zzE.zzc = str;
            return;
        }
        if (i10 != 17026) {
            if (i10 == 21358) {
                zzq(i10);
                this.zzE.zzb = str;
                return;
            } else {
                if (i10 != 2274716) {
                    return;
                }
                zzq(i10);
                this.zzE.zze(str);
                return;
            }
        }
        if ("webm".equals(str) || "matroska".equals(str)) {
            this.zzC = Objects.equals(str, "webm");
            return;
        }
        StringBuilder sb2 = new StringBuilder(str.length() + 22);
        sb2.append("DocType ");
        sb2.append(str);
        sb2.append(" not supported");
        throw zzat.zzb(sb2.toString(), null);
    }

    /* JADX WARN: Code duplicated, block: B:110:0x02af  */
    /* JADX WARN: Code duplicated, block: B:112:0x02b3  */
    /* JADX WARN: Code duplicated, block: B:114:0x02be  */
    /* JADX WARN: Code duplicated, block: B:115:0x02c0 A[PHI: r1
      0x02c0: PHI (r1v14 int) = (r1v0 int), (r1v20 int) binds: [B:109:0x02ad, B:114:0x02be] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:116:0x02c2  */
    /* JADX WARN: Code duplicated, block: B:117:0x02c7  */
    protected final void zzm(int i10, int i11, zzafz zzafzVar) throws zzat {
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        long j10;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23 = i10;
        int i24 = 2;
        int i25 = 1;
        int i26 = 0;
        if (i23 != 161 && i23 != 163) {
            if (i23 == 165) {
                if (this.zzU != 2) {
                    return;
                }
                zzakg zzakgVar = (zzakg) this.zzi.get(this.zzaa);
                if (this.zzad != 4 || !"V_VP9".equals(zzakgVar.zzc)) {
                    zzafzVar.zzf(i11);
                    return;
                }
                zzet zzetVar = this.zzv;
                zzetVar.zza(i11);
                zzafzVar.zzc(zzetVar.zzi(), 0, i11);
                return;
            }
            if (i23 == 16877) {
                zzq(i10);
                zzakg zzakgVar2 = this.zzE;
                if (zzakgVar2.zzc() != 1685485123 && zzakgVar2.zzc() != 1685480259) {
                    zzafzVar.zzf(i11);
                    return;
                }
                byte[] bArr = new byte[i11];
                zzakgVar2.zzN = bArr;
                zzafzVar.zzc(bArr, 0, i11);
                return;
            }
            if (i23 == 16981) {
                zzq(i10);
                byte[] bArr2 = new byte[i11];
                this.zzE.zzi = bArr2;
                zzafzVar.zzc(bArr2, 0, i11);
                return;
            }
            if (i23 == 18402) {
                byte[] bArr3 = new byte[i11];
                zzafzVar.zzc(bArr3, 0, i11);
                zzq(i10);
                this.zzE.zzj = new zzahj(1, bArr3, 0, 0);
                return;
            }
            if (i23 == 21419) {
                zzet zzetVar2 = this.zzq;
                Arrays.fill(zzetVar2.zzi(), (byte) 0);
                zzafzVar.zzc(zzetVar2.zzi(), 4 - i11, i11);
                zzetVar2.zzh(0);
                this.zzG = (int) zzetVar2.zzz();
                return;
            }
            if (i23 == 25506) {
                zzq(i10);
                byte[] bArr4 = new byte[i11];
                this.zzE.zzk = bArr4;
                zzafzVar.zzc(bArr4, 0, i11);
                return;
            }
            if (i23 != 30322) {
                StringBuilder sb2 = new StringBuilder(String.valueOf(i23).length() + 15);
                sb2.append("Unexpected id: ");
                sb2.append(i23);
                throw zzat.zzb(sb2.toString(), null);
            }
            zzq(i10);
            byte[] bArr5 = new byte[i11];
            this.zzE.zzw = bArr5;
            zzafzVar.zzc(bArr5, 0, i11);
            return;
        }
        int i27 = 8;
        if (this.zzU == 0) {
            zzakj zzakjVar = this.zzh;
            this.zzaa = (int) zzakjVar.zzb(zzafzVar, false, true, 8);
            this.zzab = zzakjVar.zzc();
            this.zzW = C.TIME_UNSET;
            this.zzU = 1;
            this.zzo.zza(0);
        }
        zzakg zzakgVar3 = (zzakg) this.zzi.get(this.zzaa);
        if (zzakgVar3 == null) {
            zzafzVar.zzf(i11 - this.zzab);
            this.zzU = 0;
            return;
        }
        zzakgVar3.zzb();
        if (this.zzU == 1) {
            zzt(zzafzVar, 3);
            zzet zzetVar3 = this.zzo;
            int i28 = (zzetVar3.zzi()[2] & 6) >> 1;
            if (i28 == 0) {
                this.zzY = 1;
                int[] iArrZzA = zzA(this.zzZ, 1);
                this.zzZ = iArrZzA;
                iArrZzA[0] = (i11 - this.zzab) - 3;
            } else {
                zzt(zzafzVar, 4);
                int i29 = (zzetVar3.zzi()[3] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) + 1;
                this.zzY = i29;
                int[] iArrZzA2 = zzA(this.zzZ, i29);
                this.zzZ = iArrZzA2;
                if (i28 == 2) {
                    int i30 = (i11 - this.zzab) - 4;
                    int i31 = this.zzY;
                    Arrays.fill(iArrZzA2, 0, i31, i30 / i31);
                } else {
                    if (i28 == 1) {
                        int i32 = 0;
                        int i33 = 0;
                        int i34 = 4;
                        while (true) {
                            i19 = this.zzY - 1;
                            if (i32 >= i19) {
                                break;
                            }
                            this.zzZ[i32] = 0;
                            while (true) {
                                i20 = i34 + 1;
                                zzt(zzafzVar, i20);
                                int i35 = zzetVar3.zzi()[i34] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
                                int[] iArr = this.zzZ;
                                i21 = iArr[i32] + i35;
                                iArr[i32] = i21;
                                if (i35 != 255) {
                                    break;
                                } else {
                                    i34 = i20;
                                }
                            }
                            i33 += i21;
                            i32++;
                            i34 = i20;
                        }
                        this.zzZ[i19] = ((i11 - this.zzab) - i34) - i33;
                    } else {
                        if (i28 != 3) {
                            throw zzat.zzb("Unexpected lacing value: 2", null);
                        }
                        int i36 = 0;
                        int i37 = 0;
                        int i38 = 4;
                        while (true) {
                            int i39 = this.zzY - 1;
                            if (i36 >= i39) {
                                i13 = i24;
                                i14 = i25;
                                i15 = i26;
                                this.zzZ[i39] = ((i11 - this.zzab) - i38) - i37;
                                break;
                            }
                            this.zzZ[i36] = i26;
                            int i40 = i38 + 1;
                            zzt(zzafzVar, i40);
                            if (zzetVar3.zzi()[i38] == 0) {
                                throw zzat.zzb("No valid varint length mask found", null);
                            }
                            int i41 = i26;
                            while (true) {
                                if (i26 >= i27) {
                                    i16 = i24;
                                    i17 = i25;
                                    i18 = i27;
                                    j10 = 0;
                                    break;
                                }
                                i18 = i27;
                                int i42 = i25 << (7 - i26);
                                if ((zzetVar3.zzi()[i38] & i42) != 0) {
                                    i40 += i26;
                                    zzt(zzafzVar, i40);
                                    int i43 = i38 + 1;
                                    int i44 = zzetVar3.zzi()[i38] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED & (~i42);
                                    int i45 = i24;
                                    j10 = i44;
                                    i16 = i45;
                                    int i46 = i43;
                                    while (i46 < i40) {
                                        j10 = (j10 << i18) | ((long) (zzetVar3.zzi()[i46] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED));
                                        i25 = i25;
                                        i46++;
                                        i26 = i26;
                                    }
                                    i17 = i25;
                                    int i47 = i26;
                                    if (i36 <= 0) {
                                        break;
                                    }
                                    j10 -= (1 << ((i47 * 7) + 6)) - 1;
                                    break;
                                }
                                i26++;
                                i27 = i18;
                            }
                            if (j10 < -2147483648L || j10 > 2147483647L) {
                                throw zzat.zzb("EBML lacing sample size out of range.", null);
                            }
                            int[] iArr2 = this.zzZ;
                            int i48 = (int) j10;
                            if (i36 != 0) {
                                i48 += iArr2[i36 - 1];
                            }
                            iArr2[i36] = i48;
                            i37 += i48;
                            i36++;
                            i38 = i40;
                            i26 = i41;
                            i24 = i16;
                            i27 = i18;
                            i25 = i17;
                        }
                    }
                    this.zzV = this.zzS + zzz((zzetVar3.zzi()[i15] << 8) | (zzetVar3.zzi()[i14] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED));
                    if (zzakgVar3.zze == i14) {
                        i22 = 1;
                    } else if (i23 == 163) {
                        i22 = i15;
                    } else if ((zzetVar3.zzi()[i13] & 128) == 128) {
                        i23 = 163;
                        i22 = 1;
                    } else {
                        i22 = i15;
                        i23 = 163;
                    }
                    this.zzac = i22;
                    this.zzU = i13;
                    this.zzX = i15;
                    i12 = 163;
                }
            }
            i13 = 2;
            i14 = 1;
            i15 = 0;
            this.zzV = this.zzS + zzz((zzetVar3.zzi()[i15] << 8) | (zzetVar3.zzi()[i14] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED));
            if (zzakgVar3.zze == i14) {
                i22 = 1;
            } else if (i23 == 163) {
                i22 = i15;
            } else if ((zzetVar3.zzi()[i13] & 128) == 128) {
                i23 = 163;
                i22 = 1;
            } else {
                i22 = i15;
                i23 = 163;
            }
            this.zzac = i22;
            this.zzU = i13;
            this.zzX = i15;
            i12 = 163;
        } else {
            i12 = 163;
        }
        if (i23 == i12) {
            while (true) {
                int i49 = this.zzX;
                if (i49 >= this.zzY) {
                    this.zzU = 0;
                    return;
                }
                int iZzu = zzu(zzafzVar, zzakgVar3, this.zzZ[i49], false);
                zzakg zzakgVar4 = zzakgVar3;
                zzs(zzakgVar4, this.zzV + ((long) ((this.zzX * zzakgVar3.zzf) / 1000)), this.zzac, iZzu, 0);
                this.zzX++;
                zzakgVar3 = zzakgVar4;
            }
        } else {
            while (true) {
                int i50 = this.zzX;
                if (i50 >= this.zzY) {
                    return;
                }
                int[] iArr3 = this.zzZ;
                iArr3[i50] = zzu(zzafzVar, zzakgVar3, iArr3[i50], true);
                this.zzX++;
            }
        }
    }

    zzakh(zzaka zzakaVar, int i10, zzanj zzanjVar) {
        this.zzy = -1L;
        this.zzz = C.TIME_UNSET;
        this.zzA = C.TIME_UNSET;
        this.zzB = C.TIME_UNSET;
        this.zzK = C.TIME_UNSET;
        this.zzL = -1;
        this.zzM = -1L;
        this.zzN = -1L;
        this.zzO = -1;
        this.zzQ = -1L;
        this.zzR = -1L;
        this.zzS = C.TIME_UNSET;
        this.zzaq = zzakaVar;
        zzakaVar.zza(new zzakc(this, null));
        this.zzl = zzanjVar;
        this.zzI = new SparseArray();
        this.zzj = 1 == ((i10 & 1) ^ 1);
        this.zzk = (i10 & 2) == 0;
        this.zzh = new zzakj();
        this.zzi = new SparseArray();
        this.zzo = new zzet(4);
        this.zzp = new zzet(ByteBuffer.allocate(4).putInt(-1).array());
        this.zzq = new zzet(4);
        this.zzm = new zzet(zzgp.zza);
        this.zzn = new zzet(4);
        this.zzr = new zzet();
        this.zzs = new zzet();
        this.zzt = new zzet(8);
        this.zzu = new zzet();
        this.zzv = new zzet();
        this.zzZ = new int[1];
        this.zzD = true;
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final void zzf() {
    }

    public zzakh(zzanj zzanjVar, int i10) {
        this(new zzaka(), 0, zzanjVar);
    }
}
