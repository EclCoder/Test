package com.google.android.gms.internal.ads;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzamc implements zzafy {
    public static final /* synthetic */ int zza = 0;
    private zzagb zzA;
    private zzamb[] zzB;
    private long[][] zzC;
    private int zzD;
    private final zzanj zzb;
    private final int zzc;
    private final zzet zzd;
    private final zzet zze;
    private final zzet zzf;
    private final zzet zzg;
    private final ArrayDeque zzh;
    private final zzamg zzi;
    private final List zzj;
    private zzgwm zzk;
    private int zzl;
    private int zzm;
    private long zzn;
    private int zzo;
    private zzet zzp;
    private int zzq;
    private int zzr;
    private int zzs;
    private int zzt;
    private boolean zzu;
    private boolean zzv;
    private boolean zzw;
    private long zzx;
    private boolean zzy;
    private long zzz;

    static {
        int i10 = zzaly.zza;
    }

    @Deprecated
    public zzamc() {
        this(zzanj.zza, 16);
    }

    static /* synthetic */ long zzh(zzaml zzamlVar, long j10, long j11) {
        int iZzl = zzl(zzamlVar, j10);
        return iZzl == -1 ? j11 : Math.min(zzamlVar.zzc[iZzl], j11);
    }

    private final void zzj() {
        this.zzl = 0;
        this.zzo = 0;
    }

    /* JADX WARN: Code duplicated, block: B:124:0x0297  */
    /* JADX WARN: Code duplicated, block: B:125:0x02a9  */
    /* JADX WARN: Code duplicated, block: B:128:0x02b9  */
    /* JADX WARN: Code duplicated, block: B:130:0x02bf  */
    /* JADX WARN: Code duplicated, block: B:133:0x02d9  */
    /* JADX WARN: Code duplicated, block: B:135:0x02e1  */
    /* JADX WARN: Code duplicated, block: B:179:0x03ba A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:185:0x0002 A[SYNTHETIC] */
    private final void zzk(long j10) {
        zzap zzapVarZze;
        ArrayDeque arrayDeque;
        zzap zzapVarZzc;
        int i10;
        long j11;
        int i11;
        ArrayList arrayList;
        int i12;
        zzahk zzahkVar;
        long j12;
        int i13;
        long j13;
        zzap zzapVar;
        List list;
        zzap zzapVar2;
        zzap zzapVar3;
        zzap zzapVar4;
        zzap zzapVar5;
        ArrayList arrayList2;
        zzfv zzfvVar;
        int i14;
        while (true) {
            ArrayDeque arrayDeque2 = this.zzh;
            if (arrayDeque2.isEmpty() || ((zzfx) arrayDeque2.peek()).zza != j10) {
                break;
            }
            zzfx zzfxVar = (zzfx) arrayDeque2.pop();
            if (zzfxVar.zzd == 1836019574) {
                zzfx zzfxVarZzd = zzfxVar.zzd(1835365473);
                ArrayList arrayList3 = new ArrayList();
                if (zzfxVarZzd != null) {
                    zzapVarZze = zzalj.zze(zzfxVarZzd);
                    if (this.zzy) {
                        zzapVarZze.getClass();
                        zzfv zzfvVar2 = (zzfv) zzapVarZze.zzc(zzfv.class, zzalw.zza);
                        if (zzfvVar2 != null && zzfvVar2.zzb[0] == 0) {
                            this.zzz = this.zzx + 16;
                        }
                        zzfv zzfvVar3 = (zzfv) zzapVarZze.zzc(zzfv.class, zzalx.zza);
                        zzfvVar3.getClass();
                        List listZzb = zzfvVar3.zzb();
                        ArrayList arrayList4 = new ArrayList(listZzb.size());
                        for (int i15 = 0; i15 < listZzb.size(); i15++) {
                            int iIntValue = ((Integer) listZzb.get(i15)).intValue();
                            if (iIntValue == 0) {
                                i14 = 1;
                            } else if (iIntValue != 1) {
                                i14 = 3;
                                if (iIntValue != 2) {
                                    i14 = iIntValue != 3 ? 0 : 4;
                                }
                            } else {
                                i14 = 2;
                            }
                            arrayList4.add(Integer.valueOf(i14));
                        }
                        arrayList3 = arrayList4;
                    } else {
                        if (zzapVarZze != null && (this.zzc & 64) != 0 && (zzfvVar = (zzfv) zzapVarZze.zzc(zzfv.class, zzalv.zza)) != null) {
                            long jZzJ = new zzet(zzfvVar.zzb).zzJ();
                            if (jZzJ > 0) {
                                this.zzx = jZzJ;
                                this.zzw = true;
                                arrayDeque = arrayDeque2;
                            }
                        }
                        arrayDeque.clear();
                        if (!this.zzw) {
                            this.zzl = 2;
                        }
                    }
                } else {
                    zzapVarZze = null;
                }
                ArrayList arrayList5 = new ArrayList();
                int i16 = this.zzD;
                ArrayList arrayList6 = arrayList3;
                zzagr zzagrVar = new zzagr();
                zzfy zzfyVarZzc = zzfxVar.zzc(1969517665);
                if (zzfyVarZzc != null) {
                    zzapVarZzc = zzalj.zzc(zzfyVarZzc);
                    zzagrVar.zza(zzapVarZzc);
                } else {
                    zzapVarZzc = null;
                }
                zzfy zzfyVarZzc2 = zzfxVar.zzc(1836476516);
                zzfyVarZzc2.getClass();
                boolean z10 = 1 == i16;
                zzap zzapVar6 = new zzap(C.TIME_UNSET, zzalj.zzd(zzfyVarZzc2.zza));
                int i17 = this.zzc;
                ArrayList arrayList7 = arrayList5;
                ArrayList arrayList8 = arrayList6;
                zzap zzapVar7 = zzapVar6;
                zzap zzapVar8 = zzapVarZzc;
                List listZzb2 = zzalj.zzb(zzfxVar, zzagrVar, C.TIME_UNSET, null, 1 == (i17 & 1), z10, zzalz.zza, false);
                if (this.zzy) {
                    zzgtj.zzj(arrayList8.size() == listZzb2.size(), String.format(Locale.US, "The number of auxiliary track types from metadata (%d) is not same as the number of auxiliary tracks (%d)", Integer.valueOf(arrayList8.size()), Integer.valueOf(listZzb2.size())));
                }
                String strZza = zzalu.zza(listZzb2);
                long j14 = -9223372036854775807L;
                long j15 = -9223372036854775807L;
                int i18 = 0;
                int i19 = 0;
                int size = -1;
                while (i18 < listZzb2.size()) {
                    zzaml zzamlVar = (zzaml) listZzb2.get(i18);
                    int length = zzamlVar.zzb;
                    if (length == 0) {
                        j11 = j14;
                        i12 = i18;
                        i10 = i19;
                        i11 = i17;
                        j13 = j15;
                        arrayList2 = arrayList7;
                        zzapVar4 = zzapVar7;
                        zzapVar5 = zzapVarZze;
                        zzapVar3 = zzapVar8;
                    } else {
                        zzami zzamiVar = zzamlVar.zza;
                        zzagb zzagbVar = this.zzA;
                        i10 = i19 + 1;
                        int i20 = zzamiVar.zzb;
                        zzamb zzambVar = new zzamb(zzamiVar, zzamlVar, zzagbVar.zzu(i19, i20));
                        zzap zzapVar9 = zzapVarZze;
                        long j16 = zzamiVar.zze;
                        if (j16 == j15) {
                            j16 = zzamlVar.zzi;
                        }
                        zzahk zzahkVar2 = zzambVar.zzc;
                        zzahkVar2.zzO(j16);
                        long jMax = Math.max(j14, j16);
                        zzv zzvVar = zzamiVar.zzg;
                        j11 = jMax;
                        String str = zzvVar.zzp;
                        int i21 = MimeTypes.AUDIO_TRUEHD.equals(str) ? zzamlVar.zze * 16 : zzamlVar.zze + 30;
                        i11 = i17;
                        zzt zztVarZza = zzvVar.zza();
                        zztVarZza.zzp(i21);
                        if (i20 == 2) {
                            int i22 = zzvVar.zzf;
                            if ((i11 & 8) != 0) {
                                i22 |= size == -1 ? 1 : 2;
                            }
                            if (this.zzy) {
                                arrayList = arrayList8;
                                zztVarZza.zzh(((Integer) arrayList.get(i18)).intValue());
                                i22 |= 32768;
                            } else {
                                arrayList = arrayList8;
                            }
                            zztVarZza.zzg(i22);
                            i20 = 2;
                        } else {
                            arrayList = arrayList8;
                        }
                        if (zzas.zzb(str)) {
                            arrayList8 = arrayList;
                            boolean z11 = zzamlVar.zzj;
                            if (!z11) {
                                length = zzamlVar.zzh.length;
                            }
                            int iMin = Math.min(length, 20);
                            zzgtj.zzi(j16 != j15);
                            i12 = i18;
                            zzahkVar = zzahkVar2;
                            long jMin = Math.min(j16, 10000000L);
                            int i23 = 0;
                            int i24 = -1;
                            for (int i25 = 0; i25 < iMin; i25++) {
                                int i26 = z11 ? i25 : zzamlVar.zzh[i25];
                                long j17 = zzamlVar.zzf[i26];
                                if (j17 > jMin) {
                                    break;
                                }
                                if (j17 >= 0 && (i13 = zzamlVar.zzd[i26]) > i23) {
                                    i23 = i13;
                                    i24 = i26;
                                }
                            }
                            if (i24 != -1) {
                                j12 = zzamlVar.zzf[i24];
                            }
                            if (j12 != j15) {
                                j13 = j15;
                                zzapVar = new zzap(j13, new zzaiz(j12));
                            } else {
                                j13 = j15;
                                zzapVar = null;
                            }
                            zzalt.zzb(i20, zzagrVar, zztVarZza);
                            zzap zzapVar10 = zzvVar.zzl;
                            list = this.zzj;
                            if (list.isEmpty()) {
                                zzapVar2 = null;
                            } else {
                                zzapVar2 = new zzap(list);
                            }
                            zzapVar3 = zzapVar8;
                            zzapVar4 = zzapVar7;
                            zzap[] zzapVarArr = {zzapVar2, zzapVar3, zzapVar4, zzapVar};
                            zzapVar5 = zzapVar9;
                            zzalt.zza(i20, zzapVar5, zztVarZza, zzapVar10, zzapVarArr);
                            zztVarZza.zzn(strZza);
                            if (Objects.equals(str, MimeTypes.AUDIO_MPEG)) {
                                zzambVar.zzf = zztVarZza.zzO();
                            } else {
                                zzahkVar.zzA(zztVarZza.zzO());
                            }
                            if (i20 == 2 && size == -1) {
                                size = arrayList7.size();
                            }
                            arrayList2 = arrayList7;
                            arrayList2.add(zzambVar);
                        } else {
                            arrayList8 = arrayList;
                            i12 = i18;
                            zzahkVar = zzahkVar2;
                        }
                        j12 = j15;
                        if (j12 != j15) {
                            j13 = j15;
                            zzapVar = new zzap(j13, new zzaiz(j12));
                        } else {
                            j13 = j15;
                            zzapVar = null;
                        }
                        zzalt.zzb(i20, zzagrVar, zztVarZza);
                        zzap zzapVar11 = zzvVar.zzl;
                        list = this.zzj;
                        if (list.isEmpty()) {
                            zzapVar2 = null;
                        } else {
                            zzapVar2 = new zzap(list);
                        }
                        zzapVar3 = zzapVar8;
                        zzapVar4 = zzapVar7;
                        zzap[] zzapVarArr2 = {zzapVar2, zzapVar3, zzapVar4, zzapVar};
                        zzapVar5 = zzapVar9;
                        zzalt.zza(i20, zzapVar5, zztVarZza, zzapVar11, zzapVarArr2);
                        zztVarZza.zzn(strZza);
                        if (Objects.equals(str, MimeTypes.AUDIO_MPEG)) {
                            zzambVar.zzf = zztVarZza.zzO();
                        } else {
                            zzahkVar.zzA(zztVarZza.zzO());
                        }
                        if (i20 == 2) {
                            size = arrayList7.size();
                        }
                        arrayList2 = arrayList7;
                        arrayList2.add(zzambVar);
                    }
                    zzapVar8 = zzapVar3;
                    arrayList7 = arrayList2;
                    zzapVarZze = zzapVar5;
                    j15 = j13;
                    zzapVar7 = zzapVar4;
                    arrayDeque2 = arrayDeque2;
                    i19 = i10;
                    j14 = j11;
                    i17 = i11;
                    i18 = i12 + 1;
                    listZzb2 = listZzb2;
                }
                arrayDeque = arrayDeque2;
                int i27 = -1;
                zzamb[] zzambVarArr = (zzamb[]) arrayList7.toArray(new zzamb[0]);
                this.zzB = zzambVarArr;
                int length2 = zzambVarArr.length;
                long[][] jArr = new long[length2][];
                int[] iArr = new int[length2];
                long[] jArr2 = new long[length2];
                boolean[] zArr = new boolean[length2];
                for (int i28 = 0; i28 < zzambVarArr.length; i28++) {
                    jArr[i28] = new long[zzambVarArr[i28].zzb.zzb];
                    jArr2[i28] = zzambVarArr[i28].zzb.zzf[0];
                }
                int i29 = 0;
                long j18 = 0;
                while (i29 < zzambVarArr.length) {
                    long j19 = Long.MAX_VALUE;
                    int i30 = i27;
                    for (int i31 = 0; i31 < zzambVarArr.length; i31++) {
                        if (!zArr[i31]) {
                            long j20 = jArr2[i31];
                            if (j20 <= j19) {
                                i30 = i31;
                                j19 = j20;
                            }
                        }
                    }
                    int i32 = iArr[i30];
                    long[] jArr3 = jArr[i30];
                    jArr3[i32] = j18;
                    zzaml zzamlVar2 = zzambVarArr[i30].zzb;
                    zzamb[] zzambVarArr2 = zzambVarArr;
                    boolean[] zArr2 = zArr;
                    j18 += (long) zzamlVar2.zzd[i32];
                    int i33 = i32 + 1;
                    iArr[i30] = i33;
                    if (i33 < jArr3.length) {
                        jArr2[i30] = zzamlVar2.zzf[i33];
                    } else {
                        zArr2[i30] = true;
                        i29++;
                    }
                    zzambVarArr = zzambVarArr2;
                    zArr = zArr2;
                    i27 = -1;
                }
                this.zzC = jArr;
                this.zzA.zzv();
                this.zzA.zzw(new zzama(j14, this.zzB, size));
                arrayDeque.clear();
                if (!this.zzw) {
                    this.zzl = 2;
                }
            } else if (!arrayDeque2.isEmpty()) {
                ((zzfx) arrayDeque2.peek()).zzb(zzfxVar);
            }
        }
        if (this.zzl != 2) {
            zzj();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int zzl(zzaml zzamlVar, long j10) {
        int iZza = zzamlVar.zza(j10);
        return iZza == -1 ? zzamlVar.zzb(j10) : iZza;
    }

    private static int zzm(int i10) {
        return i10 != 1903435808 ? 0 : 1;
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final boolean zza(zzafz zzafzVar) {
        zzahf zzahfVarZzb = zzamh.zzb(zzafzVar);
        this.zzk = zzahfVarZzb != null ? zzgwm.zzj(zzahfVarZzb) : zzgwm.zzi();
        return zzahfVarZzb == null;
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final /* synthetic */ List zzb() {
        return this.zzk;
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final void zzc(zzagb zzagbVar) {
        if ((this.zzc & 16) == 0) {
            zzagbVar = new zzanm(zzagbVar, this.zzb);
        }
        this.zzA = zzagbVar;
    }

    /* JADX WARN: Code duplicated, block: B:162:0x0337 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:269:0x0341 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:270:0x032d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:271:0x033b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:291:0x0006 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:292:0x0006 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:298:0x0097 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:0x0082  */
    /* JADX WARN: Code duplicated, block: B:37:0x0091  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.google.android.gms.internal.ads.zzafy
    public final int zzd(zzafz zzafzVar, zzagy zzagyVar) throws zzat {
        long j10;
        long j11;
        int i10;
        int iZzc;
        boolean z10;
        boolean z11;
        int i11;
        while (true) {
            int i12 = this.zzl;
            if (i12 == 0) {
                if (this.zzo == 0) {
                    zzet zzetVar = this.zzg;
                    if (!zzafzVar.zzb(zzetVar.zzi(), 0, 8, true)) {
                        return -1;
                    }
                    this.zzo = 8;
                    zzetVar.zzh(0);
                    this.zzn = zzetVar.zzz();
                    this.zzm = zzetVar.zzB();
                }
                long j12 = this.zzn;
                if (j12 == 1) {
                    zzet zzetVar2 = this.zzg;
                    zzafzVar.zzc(zzetVar2.zzi(), 8, 8);
                    this.zzo += 8;
                    this.zzn = zzetVar2.zzJ();
                } else if (j12 == 0) {
                    long jZzo = zzafzVar.zzo();
                    if (jZzo == -1) {
                        zzfx zzfxVar = (zzfx) this.zzh.peek();
                        jZzo = zzfxVar != null ? zzfxVar.zza : -1L;
                    }
                    if (jZzo != -1) {
                        this.zzn = (jZzo - zzafzVar.zzn()) + ((long) this.zzo);
                    }
                }
                long j13 = this.zzn;
                int i13 = this.zzo;
                long j14 = i13;
                if (j13 < j14) {
                    if (this.zzm != 1718773093 || i13 != 8) {
                        throw zzat.zzc("Atom size less than header length (unsupported).");
                    }
                    this.zzn = j14;
                    i13 = 8;
                }
                int i14 = this.zzm;
                if (i14 == 1836019574 || i14 == 1953653099 || i14 == 1835297121 || i14 == 1835626086 || i14 == 1937007212 || i14 == 1701082227 || i14 == 1835365473 || i14 == 1635284069) {
                    long jZzn = zzafzVar.zzn();
                    long j15 = this.zzn;
                    long j16 = jZzn + j15;
                    long j17 = this.zzo;
                    if (j15 != j17 && this.zzm == 1835365473) {
                        zzet zzetVar3 = this.zzf;
                        zzetVar3.zza(8);
                        zzafzVar.zzi(zzetVar3.zzi(), 0, 8);
                        zzalj.zzf(zzetVar3);
                        zzafzVar.zzf(zzetVar3.zzg());
                        zzafzVar.zzl();
                    }
                    long j18 = j16 - j17;
                    this.zzh.push(new zzfx(this.zzm, j18));
                    if (this.zzn == this.zzo) {
                        zzk(j18);
                    } else {
                        zzj();
                    }
                } else {
                    if (i14 == 1835296868 || i14 == 1836476516 || i14 == 1751411826 || i14 == 1937011556 || i14 == 1937011827 || i14 == 1937011571 || i14 == 1668576371 || i14 == 1701606260 || i14 == 1937011555 || i14 == 1937011578 || i14 == 1937013298 || i14 == 1937007471 || i14 == 1668232756 || i14 == 1953196132 || i14 == 1718909296 || i14 == 1969517665 || i14 == 1801812339 || i14 == 1768715124) {
                        zzgtj.zzi(i13 == 8);
                        zzgtj.zzi(this.zzn <= 2147483647L);
                        zzet zzetVar4 = new zzet((int) this.zzn);
                        System.arraycopy(this.zzg.zzi(), 0, zzetVar4.zzi(), 0, 8);
                        this.zzp = zzetVar4;
                    } else {
                        this.zzp = null;
                    }
                    this.zzl = 1;
                }
            } else {
                if (i12 != 1) {
                    if (i12 != 2) {
                        this.zzi.zzb(zzafzVar, zzagyVar, this.zzj);
                        if (zzagyVar.zza == 0) {
                            zzj();
                        }
                        return 1;
                    }
                    long jZzn2 = zzafzVar.zzn();
                    int i15 = this.zzq;
                    if (i15 == -1) {
                        j10 = 0;
                        int i16 = -1;
                        int i17 = -1;
                        boolean z12 = true;
                        boolean z13 = true;
                        long j19 = Long.MAX_VALUE;
                        long j20 = Long.MAX_VALUE;
                        long j21 = Long.MAX_VALUE;
                        int i18 = 0;
                        while (true) {
                            zzamb[] zzambVarArr = this.zzB;
                            if (i18 >= zzambVarArr.length) {
                                break;
                            }
                            zzamb zzambVar = zzambVarArr[i18];
                            int i19 = zzambVar.zze;
                            zzaml zzamlVar = zzambVar.zzb;
                            if (i19 != zzamlVar.zzb) {
                                long j22 = zzamlVar.zzc[i19];
                                long[][] jArr = this.zzC;
                                jArr.getClass();
                                long j23 = jArr[i18][i19];
                                long j24 = j22 - jZzn2;
                                boolean z14 = j24 < 0 || j24 >= 262144;
                                if (z14) {
                                    z10 = z13;
                                } else {
                                    if (z13) {
                                        z13 = z14;
                                        i17 = i18;
                                        j21 = j24;
                                        j20 = j23;
                                    } else {
                                        z10 = false;
                                    }
                                    if (j23 < j19) {
                                        z12 = z14;
                                        i16 = i18;
                                        j19 = j23;
                                    }
                                }
                                if (z14 != z10 || j24 >= j21) {
                                    z13 = z10;
                                } else {
                                    z13 = z14;
                                    i17 = i18;
                                    j21 = j24;
                                    j20 = j23;
                                }
                                if (j23 < j19) {
                                    z12 = z14;
                                    i16 = i18;
                                    j19 = j23;
                                }
                            }
                            i18++;
                        }
                        j11 = 262144;
                        i15 = (j19 == Long.MAX_VALUE || !z12 || j20 < j19 + 10485760) ? i17 : i16;
                        this.zzq = i15;
                        if (i15 == -1) {
                            return -1;
                        }
                    } else {
                        j10 = 0;
                        j11 = 262144;
                    }
                    zzamb zzambVar2 = this.zzB[i15];
                    zzahk zzahkVar = zzambVar2.zzc;
                    int i20 = zzambVar2.zze;
                    zzaml zzamlVar2 = zzambVar2.zzb;
                    long j25 = zzamlVar2.zzc[i20] + this.zzz;
                    int[] iArr = zzamlVar2.zzd;
                    int i21 = iArr[i20];
                    zzahl zzahlVar = zzambVar2.zzd;
                    int i22 = 0;
                    long j26 = (j25 - jZzn2) + ((long) this.zzr);
                    if (j26 < j10 || j26 >= j11) {
                        zzagyVar.zza = j25;
                        return 1;
                    }
                    zzami zzamiVar = zzambVar2.zza;
                    if (zzamiVar.zzh == 1) {
                        j26 += 8;
                        i21 -= 8;
                    }
                    int i23 = i21;
                    zzafzVar.zzf((int) j26);
                    zzv zzvVar = zzamiVar.zzg;
                    String str = zzvVar.zzp;
                    if (!Objects.equals(str, MimeTypes.VIDEO_H264) ? !(!Objects.equals(str, MimeTypes.VIDEO_H265) ? Objects.equals(str, "video/apv") : (this.zzc & 128) != 0) : (this.zzc & 32) == 0) {
                        this.zzu = true;
                    }
                    int i24 = zzamiVar.zzk;
                    if (i24 == 0) {
                        if ("audio/ac4".equals(str)) {
                            if (this.zzs == 0) {
                                zzet zzetVar5 = this.zzf;
                                zzafb.zzc(i23, zzetVar5);
                                zzahkVar.zzc(zzetVar5, 7);
                                this.zzs += 7;
                            }
                            i23 += 7;
                        } else if (zzambVar2.zzf != null && Objects.equals(str, MimeTypes.AUDIO_MPEG)) {
                            zzv zzvVarZzO = zzambVar2.zzf;
                            zzet zzetVar6 = this.zzf;
                            zzetVar6.zza(4);
                            zzafzVar.zzi(zzetVar6.zzi(), 0, 4);
                            zzafzVar.zzl();
                            zzagv zzagvVar = new zzagv();
                            if (zzagvVar.zza(zzetVar6.zzB()) && !Objects.equals(zzvVarZzO.zzp, zzagvVar.zzb)) {
                                zzt zztVarZza = zzvVarZzO.zza();
                                String str2 = zzagvVar.zzb;
                                str2.getClass();
                                zztVarZza.zzo(str2);
                                zzvVarZzO = zztVarZza.zzO();
                            }
                            zzahkVar.zzA(zzvVarZzO);
                            zzambVar2.zzf = null;
                        } else if (zzahlVar != null) {
                            zzahlVar.zzb(zzafzVar);
                        }
                        while (true) {
                            int i25 = this.zzs;
                            if (i25 >= i23) {
                                break;
                            }
                            int iZza = zzahkVar.zza(zzafzVar, i23 - i25, false);
                            this.zzr += iZza;
                            this.zzs += iZza;
                            this.zzt -= iZza;
                        }
                    } else {
                        zzet zzetVar7 = this.zze;
                        byte[] bArrZzi = zzetVar7.zzi();
                        bArrZzi[0] = 0;
                        bArrZzi[1] = 0;
                        bArrZzi[2] = 0;
                        int i26 = 4 - i24;
                        i23 += i26;
                        while (this.zzs < i23) {
                            int i27 = this.zzt;
                            if (i27 == 0) {
                                if (this.zzu || zzgp.zzc(zzvVar) + i24 > iArr[i20] - this.zzr) {
                                    i10 = i24;
                                    iZzc = i22;
                                } else {
                                    iZzc = zzgp.zzc(zzvVar);
                                    i10 = i24 + iZzc;
                                }
                                zzafzVar.zzc(bArrZzi, i26, i10);
                                this.zzr += i10;
                                int i28 = i22;
                                zzetVar7.zzh(i28);
                                int iZzB = zzetVar7.zzB();
                                if (iZzB < 0) {
                                    throw zzat.zzb("Invalid NAL length", null);
                                }
                                this.zzt = iZzB - iZzc;
                                zzet zzetVar8 = this.zzd;
                                zzetVar8.zzh(i28);
                                zzahkVar.zzc(zzetVar8, 4);
                                this.zzs += 4;
                                if (iZzc > 0) {
                                    zzahkVar.zzc(zzetVar7, iZzc);
                                    this.zzs += iZzc;
                                    if (zzgp.zzd(bArrZzi, 4, iZzc, zzvVar)) {
                                        this.zzu = true;
                                    }
                                }
                                i22 = 0;
                            } else {
                                int iZza2 = zzahkVar.zza(zzafzVar, i27, i22);
                                this.zzr += iZza2;
                                this.zzs += iZza2;
                                this.zzt -= iZza2;
                            }
                            i22 = 0;
                        }
                    }
                    int i29 = i23;
                    long j27 = zzamlVar2.zzf[i20];
                    int i30 = zzamlVar2.zzg[i20];
                    if (!this.zzu) {
                        i30 |= 67108864;
                    }
                    int i31 = i30;
                    if (zzahlVar != null) {
                        zzahlVar.zzc(zzahkVar, j27, i31, i29, 0, null);
                        if (i20 + 1 == zzamlVar2.zzb) {
                            zzahlVar.zzd(zzahkVar, null);
                        }
                    } else {
                        zzahkVar.zze(j27, i31, i29, 0, null);
                    }
                    zzambVar2.zze++;
                    this.zzq = -1;
                    this.zzr = 0;
                    this.zzs = 0;
                    this.zzt = 0;
                    this.zzu = false;
                    return 0;
                }
                long j28 = this.zzn - ((long) this.zzo);
                long jZzn3 = zzafzVar.zzn() + j28;
                zzet zzetVar9 = this.zzp;
                if (zzetVar9 != null) {
                    zzafzVar.zzc(zzetVar9.zzi(), this.zzo, (int) j28);
                    if (this.zzm == 1718909296) {
                        this.zzv = true;
                        zzetVar9.zzh(8);
                        if (zzm(zzetVar9.zzB()) == 0) {
                            zzetVar9.zzk(4);
                            while (true) {
                                if (zzetVar9.zzd() <= 0) {
                                    i11 = 0;
                                    break;
                                }
                                if (zzm(zzetVar9.zzB()) != 0) {
                                    i11 = 1;
                                    break;
                                }
                            }
                        } else {
                            i11 = 1;
                            break;
                        }
                        this.zzD = i11;
                    } else {
                        ArrayDeque arrayDeque = this.zzh;
                        if (!arrayDeque.isEmpty()) {
                            ((zzfx) arrayDeque.peek()).zza(new zzfy(this.zzm, zzetVar9));
                        }
                    }
                } else {
                    if (!this.zzv && this.zzm == 1835295092) {
                        this.zzD = 1;
                    }
                    if (j28 < 262144) {
                        zzafzVar.zzf((int) j28);
                    } else {
                        zzagyVar.zza = zzafzVar.zzn() + j28;
                        z11 = true;
                    }
                    zzk(jZzn3);
                    if (this.zzw) {
                        this.zzy = true;
                        zzagyVar.zza = this.zzx;
                        this.zzw = false;
                    } else if (!z11) {
                        continue;
                    }
                    if (this.zzl != 2) {
                        return 1;
                    }
                }
                z11 = false;
                zzk(jZzn3);
                if (this.zzw) {
                    this.zzy = true;
                    zzagyVar.zza = this.zzx;
                    this.zzw = false;
                } else if (!z11) {
                    continue;
                }
                if (this.zzl != 2) {
                    return 1;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final void zze(long j10, long j11) {
        this.zzh.clear();
        this.zzo = 0;
        this.zzq = -1;
        this.zzr = 0;
        this.zzs = 0;
        this.zzt = 0;
        this.zzu = false;
        if (j10 == 0) {
            if (this.zzl != 3) {
                zzj();
                return;
            } else {
                this.zzi.zza();
                this.zzj.clear();
                return;
            }
        }
        for (zzamb zzambVar : this.zzB) {
            zzaml zzamlVar = zzambVar.zzb;
            int iZza = zzamlVar.zza(j11);
            if (iZza == -1) {
                iZza = zzamlVar.zzb(j11);
            }
            zzambVar.zze = iZza;
            zzahl zzahlVar = zzambVar.zzd;
            if (zzahlVar != null) {
                zzahlVar.zza();
            }
        }
    }

    public zzamc(zzanj zzanjVar, int i10) {
        this.zzb = zzanjVar;
        this.zzc = i10;
        this.zzk = zzgwm.zzi();
        this.zzl = (i10 & 4) != 0 ? 3 : 0;
        this.zzi = new zzamg();
        this.zzj = new ArrayList();
        this.zzg = new zzet(16);
        this.zzh = new ArrayDeque();
        this.zzd = new zzet(zzgp.zza);
        this.zze = new zzet(6);
        this.zzf = new zzet();
        this.zzq = -1;
        this.zzA = zzagb.zza;
        this.zzB = new zzamb[0];
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final void zzf() {
    }
}
