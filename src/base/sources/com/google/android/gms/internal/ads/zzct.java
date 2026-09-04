package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzct {
    private final int zza;
    private final int zzb;
    private final float zzc;
    private final float zzd;
    private final float zze;
    private final int zzf;
    private final int zzg;
    private final int zzh;
    private final zzcr zzi;
    private int zzj;
    private int zzk;
    private int zzl;
    private int zzm;
    private int zzn;
    private int zzo;
    private int zzp;
    private double zzq;

    public zzct(int i10, int i11, float f10, float f11, int i12, boolean z10) {
        this.zza = i10;
        this.zzb = i11;
        this.zzc = f10;
        this.zzd = f11;
        this.zze = i10 / i12;
        this.zzf = i10 / 400;
        int i13 = i10 / 65;
        this.zzg = i13;
        this.zzh = i13 + i13;
        this.zzi = z10 ? new zzcq(this) : new zzcs(this);
    }

    private final void zzo(int i10, int i11) {
        zzcr zzcrVar = this.zzi;
        zzcrVar.zzk(i11);
        Object objZzr = zzcrVar.zzr();
        Object objZzq = zzcrVar.zzq();
        int i12 = this.zzk;
        int i13 = this.zzb;
        System.arraycopy(objZzr, i10 * i13, objZzq, i12 * i13, i11 * i13);
        this.zzk += i11;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x017e A[EDGE_INSN: B:101:0x017e->B:59:0x017e BREAK  A[LOOP:3: B:13:0x0035->B:92:0x024c], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:28:0x0085  */
    /* JADX WARN: Code duplicated, block: B:31:0x008d  */
    /* JADX WARN: Code duplicated, block: B:35:0x0092  */
    /* JADX WARN: Code duplicated, block: B:37:0x0095  */
    /* JADX WARN: Code duplicated, block: B:39:0x009b  */
    /* JADX WARN: Code duplicated, block: B:40:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:92:0x024c A[LOOP:3: B:13:0x0035->B:92:0x024c, LOOP_END] */
    /* JADX WARN: Multi-variable type inference failed */
    private final void zzp() {
        zzcr zzcrVar;
        int i10;
        int i11;
        int iZze;
        int iZze2;
        int i12;
        int i13;
        int i14;
        double d10;
        int i15;
        int i16;
        float f10;
        int i17;
        int i18;
        long j10;
        long j11;
        float f11 = this.zzc;
        float f12 = this.zzd;
        double d11 = f11 / f12;
        int i19 = this.zzk;
        int i20 = 0;
        int i21 = 1;
        if (d11 > 1.0000100135803223d || d11 < 0.9999899864196777d) {
            int i22 = this.zzj;
            int i23 = this.zzh;
            if (i22 >= i23) {
                int i24 = 0;
                while (true) {
                    int i25 = this.zzo;
                    if (i25 > 0) {
                        int iMin = Math.min(i23, i25);
                        zzo(i24, iMin);
                        this.zzo -= iMin;
                        i24 += iMin;
                        f12 = f12;
                        d10 = d11;
                        i21 = i21;
                        i23 = i23;
                    } else {
                        int i26 = this.zza;
                        int i27 = i26 > 4000 ? i26 / 4000 : i21;
                        int i28 = this.zzb;
                        if (i28 != i21) {
                            zzcrVar = this.zzi;
                            zzcrVar.zzd(i24, i27);
                            i10 = this.zzf;
                            i11 = this.zzg;
                            iZze = zzcrVar.zze(i20, i10 / i27, i11 / i27);
                            if (i27 != i21) {
                                int i29 = iZze * i27;
                                int i30 = i27 * 4;
                                i13 = i29 - i30;
                                if (i13 >= i10) {
                                    i10 = i13;
                                }
                                i14 = i29 + i30;
                                if (i14 <= i11) {
                                    i11 = i14;
                                }
                                if (i28 == i21) {
                                    iZze2 = zzcrVar.zzf(i24, i10, i11);
                                } else {
                                    zzcrVar.zzd(i24, i21);
                                    iZze2 = zzcrVar.zze(i20, i10, i11);
                                }
                            } else {
                                iZze2 = iZze;
                            }
                            i12 = i28;
                        } else if (i27 == i21) {
                            iZze2 = this.zzi.zzf(i24, this.zzf, this.zzg);
                            i12 = i21;
                        } else {
                            i28 = i21;
                            zzcrVar = this.zzi;
                            zzcrVar.zzd(i24, i27);
                            i10 = this.zzf;
                            i11 = this.zzg;
                            iZze = zzcrVar.zze(i20, i10 / i27, i11 / i27);
                            if (i27 != i21) {
                                int i210 = iZze * i27;
                                int i31 = i27 * 4;
                                i13 = i210 - i31;
                                if (i13 >= i10) {
                                    i10 = i13;
                                }
                                i14 = i210 + i31;
                                if (i14 <= i11) {
                                    i11 = i14;
                                }
                                if (i28 == i21) {
                                    iZze2 = zzcrVar.zzf(i24, i10, i11);
                                } else {
                                    zzcrVar.zzd(i24, i21);
                                    iZze2 = zzcrVar.zze(i20, i10, i11);
                                }
                            } else {
                                iZze2 = iZze;
                            }
                            i12 = i28;
                        }
                        zzcr zzcrVar2 = this.zzi;
                        int i32 = zzcrVar2.zzc() ? this.zzp : iZze2;
                        int i33 = i24 + i32;
                        zzcrVar2.zzi();
                        this.zzp = iZze2;
                        double d12 = i32;
                        if (d11 > 1.0d) {
                            double d13 = d11 - 1.0d;
                            if (d11 >= 2.0d) {
                                double d14 = (d12 / d13) + this.zzq;
                                int iRound = (int) Math.round(d14);
                                d10 = d11;
                                this.zzq = d14 - ((double) iRound);
                                i16 = iRound;
                            } else {
                                d10 = d11;
                                double d15 = ((d12 * (2.0d - d10)) / d13) + this.zzq;
                                int iRound2 = (int) Math.round(d15);
                                this.zzo = iRound2;
                                this.zzq = d15 - ((double) iRound2);
                                i16 = i32;
                            }
                            zzcrVar2.zzk(i16);
                            zzcrVar2.zzh(i16, i12, this.zzk, i24, i33);
                            this.zzk += i16;
                            i24 += i32 + i16;
                        } else {
                            d10 = d11;
                            i21 = i21;
                            i23 = i23;
                            double d16 = 1.0d - d10;
                            if (d10 < 0.5d) {
                                double d17 = ((d12 * d10) / d16) + this.zzq;
                                int iRound3 = (int) Math.round(d17);
                                this.zzq = d17 - ((double) iRound3);
                                i15 = iRound3;
                            } else {
                                double d18 = ((d12 * ((d10 + d10) - 1.0d)) / d16) + this.zzq;
                                int iRound4 = (int) Math.round(d18);
                                this.zzo = iRound4;
                                this.zzq = d18 - ((double) iRound4);
                                i15 = i32;
                            }
                            int i34 = i32 + i15;
                            zzcrVar2.zzk(i34);
                            System.arraycopy(zzcrVar2.zzr(), i24 * i12, zzcrVar2.zzq(), this.zzk * i12, i32 * i12);
                            int i35 = i24;
                            zzcrVar2.zzh(i15, i12, this.zzk + i32, i33, i35);
                            this.zzk += i34;
                            i24 = i35 + i15;
                        }
                        if (i24 + i23 > i22) {
                            break;
                        }
                        i19 = i19;
                        f12 = f12;
                        i21 = i21;
                        i23 = i23;
                        d11 = d10;
                        i20 = 0;
                    }
                    i19 = i19;
                    if (i24 + i23 > i22) {
                        break;
                        break;
                    }
                    i19 = i19;
                    f12 = f12;
                    i21 = i21;
                    i23 = i23;
                    d11 = d10;
                    i20 = 0;
                }
                int i36 = this.zzj - i24;
                zzcr zzcrVar3 = this.zzi;
                int i37 = this.zzb;
                System.arraycopy(zzcrVar3.zzr(), i24 * i37, zzcrVar3.zzr(), 0, i37 * i36);
                this.zzj = i36;
            }
            f10 = this.zze * f12;
            if (f10 != 1.0f || this.zzk == i19) {
            }
            int i38 = this.zza;
            long j12 = i38;
            long j13 = (long) (i38 / f10);
            while (j13 != 0 && j12 != 0 && j13 % 2 == 0 && j12 % 2 == 0) {
                j13 /= 2;
                j12 /= 2;
            }
            int i39 = this.zzk - i19;
            zzcr zzcrVar4 = this.zzi;
            zzcrVar4.zzl(i39);
            int i40 = this.zzb;
            System.arraycopy(zzcrVar4.zzq(), i19 * i40, zzcrVar4.zzp(), this.zzl * i40, i39 * i40);
            this.zzk = i19;
            this.zzl += i39;
            int i41 = 0;
            while (true) {
                i17 = this.zzl - 1;
                if (i41 >= i17) {
                    break;
                }
                while (true) {
                    i18 = this.zzm + 1;
                    j10 = i18;
                    long j14 = j10 * j13;
                    j11 = this.zzn;
                    if (j14 <= j11 * j12) {
                        break;
                    }
                    int i42 = i21;
                    zzcrVar4.zzk(i42);
                    zzcrVar4.zzb(i41, j12, j13);
                    this.zzn += i42;
                    this.zzk += i42;
                }
                int i43 = i21;
                this.zzm = i18;
                if (j10 == j12) {
                    this.zzm = 0;
                    zzgtj.zzi(j11 == j13 ? i43 : 0);
                    this.zzn = 0;
                }
                i41++;
                i21 = i43;
            }
            if (i17 != 0) {
                System.arraycopy(zzcrVar4.zzp(), i17 * i40, zzcrVar4.zzp(), 0, (this.zzl - i17) * i40);
                this.zzl -= i17;
                return;
            }
            return;
        }
        zzo(0, this.zzj);
        this.zzj = 0;
        f12 = f12;
        i19 = i19;
        i21 = 1;
        f10 = this.zze * f12;
        if (f10 != 1.0f) {
        }
    }

    public final int zza() {
        return this.zzj * this.zzb * this.zzi.zza();
    }

    public final void zzb(ByteBuffer byteBuffer) {
        zzcr zzcrVar = this.zzi;
        int iRemaining = byteBuffer.remaining();
        int iZza = iRemaining / (this.zzb * zzcrVar.zza());
        zzcrVar.zzj(iZza);
        zzcrVar.zzn(byteBuffer, iRemaining);
        this.zzj += iZza;
        zzp();
    }

    public final void zzc(ByteBuffer byteBuffer) {
        zzgtj.zzi(this.zzk >= 0);
        int i10 = this.zzb;
        int iRemaining = byteBuffer.remaining();
        zzcr zzcrVar = this.zzi;
        int iMin = Math.min(iRemaining / (zzcrVar.zza() * i10), this.zzk);
        zzcrVar.zzo(byteBuffer, iMin);
        this.zzk -= iMin;
        System.arraycopy(zzcrVar.zzq(), iMin * i10, zzcrVar.zzq(), 0, this.zzk * i10);
    }

    public final void zzd() {
        int i10 = this.zzj;
        int i11 = this.zzo;
        int i12 = this.zzk;
        float f10 = this.zzc;
        float f11 = this.zzd;
        int i13 = i12 + ((int) ((((((((double) (i10 - i11)) / ((double) (f10 / f11))) + ((double) i11)) + this.zzq) + ((double) this.zzl)) / ((double) (this.zze * f11))) + 0.5d));
        this.zzq = 0.0d;
        int i14 = this.zzh;
        int i15 = i14 + i14;
        zzcr zzcrVar = this.zzi;
        zzcrVar.zzj(i10 + i15);
        zzcrVar.zzm(i10 * this.zzb, i15);
        this.zzj += i15;
        zzp();
        if (this.zzk > i13) {
            this.zzk = Math.max(i13, 0);
        }
        this.zzj = 0;
        this.zzo = 0;
        this.zzl = 0;
    }

    public final void zze() {
        this.zzj = 0;
        this.zzk = 0;
        this.zzl = 0;
        this.zzm = 0;
        this.zzn = 0;
        this.zzo = 0;
        this.zzp = 0;
        this.zzq = 0.0d;
        this.zzi.zzg();
    }

    public final int zzf() {
        zzgtj.zzi(this.zzk >= 0);
        return this.zzk * this.zzb * this.zzi.zza();
    }

    final /* synthetic */ int zzg() {
        return this.zzb;
    }

    final /* synthetic */ int zzh() {
        return this.zzh;
    }

    final /* synthetic */ int zzi() {
        return this.zzj;
    }

    final /* synthetic */ int zzj() {
        return this.zzk;
    }

    final /* synthetic */ int zzk() {
        return this.zzl;
    }

    final /* synthetic */ int zzl() {
        return this.zzm;
    }

    final /* synthetic */ int zzm() {
        return this.zzn;
    }

    final /* synthetic */ int zzn() {
        return this.zzp;
    }
}
