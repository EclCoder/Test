package com.google.android.gms.internal.ads;

import android.util.Pair;
import com.inmobi.media.core.config.models.AdConfig;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import java.util.Arrays;
import java.util.Collections;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzapv implements zzapt {
    private static final double[] zzc = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};
    private String zza;
    private zzahk zzb;
    private final zzarl zzd;
    private final String zze;
    private final zzet zzf;
    private final zzaqk zzg;
    private final boolean[] zzh = new boolean[4];
    private final zzapu zzi = new zzapu(128);
    private long zzj;
    private boolean zzk;
    private boolean zzl;
    private long zzm;
    private long zzn;
    private long zzo;
    private long zzp;
    private boolean zzq;
    private boolean zzr;

    zzapv(zzarl zzarlVar, String str) {
        zzet zzetVar;
        this.zzd = zzarlVar;
        this.zze = str;
        if (zzarlVar != null) {
            this.zzg = new zzaqk(178, 128);
            zzetVar = new zzet();
        } else {
            zzetVar = null;
            this.zzg = null;
        }
        this.zzf = zzetVar;
        this.zzn = C.TIME_UNSET;
        this.zzp = C.TIME_UNSET;
    }

    @Override // com.google.android.gms.internal.ads.zzapt
    public final void zza() {
        zzgp.zzj(this.zzh);
        this.zzi.zza();
        zzaqk zzaqkVar = this.zzg;
        if (zzaqkVar != null) {
            zzaqkVar.zza();
        }
        this.zzj = 0L;
        this.zzk = false;
        this.zzn = C.TIME_UNSET;
        this.zzp = C.TIME_UNSET;
    }

    @Override // com.google.android.gms.internal.ads.zzapt
    public final void zzb(zzagb zzagbVar, zzarh zzarhVar) {
        zzarhVar.zza();
        this.zza = zzarhVar.zzc();
        this.zzb = zzagbVar.zzu(zzarhVar.zzb(), 2);
        zzarl zzarlVar = this.zzd;
        if (zzarlVar != null) {
            zzarlVar.zza(zzagbVar, zzarhVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzapt
    public final void zzc(long j10, int i10) {
        this.zzn = j10;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0102  */
    /* JADX WARN: Code duplicated, block: B:41:0x0131  */
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
    @Override // com.google.android.gms.internal.ads.zzapt
    public final void zzd(zzet zzetVar) {
        long j10;
        boolean z10;
        boolean z11;
        int i10;
        int i11;
        int i12;
        float f10;
        int i13;
        long j11;
        double d10;
        int i14;
        int i15;
        this.zzb.getClass();
        int iZzg = zzetVar.zzg();
        int iZze = zzetVar.zze();
        byte[] bArrZzi = zzetVar.zzi();
        this.zzj += (long) zzetVar.zzd();
        this.zzb.zzc(zzetVar, zzetVar.zzd());
        while (true) {
            int iZzi = zzgp.zzi(bArrZzi, iZzg, iZze, this.zzh);
            if (iZzi == iZze) {
                break;
            }
            int i16 = iZzi + 3;
            int i17 = zzetVar.zzi()[i16] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
            int i18 = iZzi - iZzg;
            if (!this.zzl) {
                if (i18 > 0) {
                    this.zzi.zzc(bArrZzi, iZzg, iZzi);
                }
                int i19 = i18 < 0 ? -i18 : 0;
                zzapu zzapuVar = this.zzi;
                if (zzapuVar.zzb(i17, i19)) {
                    String str = this.zza;
                    str.getClass();
                    String str2 = this.zze;
                    byte[] bArrCopyOf = Arrays.copyOf(zzapuVar.zzc, zzapuVar.zza);
                    int i20 = bArrCopyOf[4] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
                    byte b10 = bArrCopyOf[5];
                    int i21 = b10 & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
                    int i22 = bArrCopyOf[6] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
                    int i23 = (i20 << 4) | (i21 >> 4);
                    int i24 = (bArrCopyOf[7] & 240) >> 4;
                    int i25 = ((b10 & 15) << 8) | i22;
                    if (i24 == 2) {
                        i11 = i25 * 4;
                        i12 = i23 * 3;
                    } else if (i24 != 3) {
                        if (i24 != 4) {
                            f10 = 1.0f;
                        } else {
                            i11 = i25 * Sdk$SDKError.b.TPAT_ERROR_VALUE;
                            i12 = i23 * 100;
                        }
                        zzt zztVar = new zzt();
                        zztVar.zza(str);
                        zztVar.zzn(str2);
                        zztVar.zzo(MimeTypes.VIDEO_MPEG2);
                        zztVar.zzv(i23);
                        zztVar.zzw(i25);
                        zztVar.zzB(f10);
                        zztVar.zzr(Collections.singletonList(bArrCopyOf));
                        zzv zzvVarZzO = zztVar.zzO();
                        i13 = (bArrCopyOf[7] & 15) - 1;
                        j11 = 0;
                        if (i13 >= 0 && i13 < 8) {
                            d10 = zzc[i13];
                            byte b11 = bArrCopyOf[zzapuVar.zzb + 9];
                            i14 = (b11 & 96) >> 5;
                            i15 = b11 & 31;
                            if (i14 != i15) {
                                d10 *= (((double) i14) + 1.0d) / ((double) (i15 + 1));
                            }
                            j11 = (long) (1000000.0d / d10);
                        }
                        Pair pairCreate = Pair.create(zzvVarZzO, Long.valueOf(j11));
                        this.zzb.zzA((zzv) pairCreate.first);
                        this.zzm = ((Long) pairCreate.second).longValue();
                        this.zzl = true;
                    } else {
                        i11 = i25 * 16;
                        i12 = i23 * 9;
                    }
                    f10 = i11 / i12;
                    zzt zztVar2 = new zzt();
                    zztVar2.zza(str);
                    zztVar2.zzn(str2);
                    zztVar2.zzo(MimeTypes.VIDEO_MPEG2);
                    zztVar2.zzv(i23);
                    zztVar2.zzw(i25);
                    zztVar2.zzB(f10);
                    zztVar2.zzr(Collections.singletonList(bArrCopyOf));
                    zzv zzvVarZzO2 = zztVar2.zzO();
                    i13 = (bArrCopyOf[7] & 15) - 1;
                    j11 = 0;
                    if (i13 >= 0) {
                        d10 = zzc[i13];
                        byte b12 = bArrCopyOf[zzapuVar.zzb + 9];
                        i14 = (b12 & 96) >> 5;
                        i15 = b12 & 31;
                        if (i14 != i15) {
                            d10 *= (((double) i14) + 1.0d) / ((double) (i15 + 1));
                        }
                        j11 = (long) (1000000.0d / d10);
                    }
                    Pair pairCreate2 = Pair.create(zzvVarZzO2, Long.valueOf(j11));
                    this.zzb.zzA((zzv) pairCreate2.first);
                    this.zzm = ((Long) pairCreate2.second).longValue();
                    this.zzl = true;
                }
            }
            zzaqk zzaqkVar = this.zzg;
            if (zzaqkVar != null) {
                if (i18 > 0) {
                    zzaqkVar.zzd(bArrZzi, iZzg, iZzi);
                    i10 = 0;
                } else {
                    i10 = -i18;
                }
                if (zzaqkVar.zze(i10)) {
                    int iZza = zzgp.zza(zzaqkVar.zza, zzaqkVar.zzb);
                    zzet zzetVar2 = this.zzf;
                    String str3 = zzfl.zza;
                    zzetVar2.zzb(zzaqkVar.zza, iZza);
                    this.zzd.zzb(this.zzp, zzetVar2);
                }
                if (i17 == 178) {
                    if (zzetVar.zzi()[iZzi + 2] == 1) {
                        zzaqkVar.zzc(178);
                    }
                    i17 = 178;
                }
            }
            if (i17 == 0 || i17 == 179) {
                int i26 = iZze - iZzi;
                if (this.zzr && this.zzl) {
                    j10 = -9223372036854775807L;
                    long j12 = this.zzp;
                    if (j12 != C.TIME_UNSET) {
                        boolean z12 = this.zzq;
                        int i27 = ((int) (this.zzj - this.zzo)) - i26;
                        zzahk zzahkVar = this.zzb;
                        j10 = C.TIME_UNSET;
                        zzahkVar.zze(j12, z12 ? 1 : 0, i27, i26, null);
                    }
                } else {
                    j10 = -9223372036854775807L;
                }
                if (!this.zzk || this.zzr) {
                    this.zzo = this.zzj - ((long) i26);
                    long j13 = this.zzn;
                    if (j13 == j10) {
                        long j14 = this.zzp;
                        j13 = j14 != j10 ? j14 + this.zzm : j10;
                    }
                    this.zzp = j13;
                    z10 = false;
                    this.zzq = false;
                    this.zzn = j10;
                    z11 = true;
                    this.zzk = true;
                } else {
                    z11 = true;
                    z10 = false;
                }
                this.zzr = i17 == 0 ? z11 : z10;
            } else if (i17 == 184) {
                this.zzq = true;
            }
            iZzg = i16;
            iZze = iZze;
        }
        if (!this.zzl) {
            this.zzi.zzc(bArrZzi, iZzg, iZze);
        }
        zzaqk zzaqkVar2 = this.zzg;
        if (zzaqkVar2 != null) {
            zzaqkVar2.zzd(bArrZzi, iZzg, iZze);
        }
    }

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
    @Override // com.google.android.gms.internal.ads.zzapt
    public final void zze(boolean z10) {
        zzahk zzahkVar = this.zzb;
        zzahkVar.getClass();
        if (z10) {
            boolean z11 = this.zzq;
            long j10 = this.zzj - this.zzo;
            zzahkVar.zze(this.zzp, z11 ? 1 : 0, (int) j10, 0, null);
        }
    }
}
