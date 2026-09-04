package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.media.metrics.LogSessionId;
import android.os.Build;
import android.os.Bundle;
import android.os.Trace;
import com.bytedance.adsdk.ugeno.ojm.hnj.mzIi.obFGmWgqyy;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public abstract class zzvt extends zzix {
    private static final byte[] zzb = {0, 0, 1, 103, 66, -64, 11, -38, 37, -112, 0, 0, 1, 104, -50, 15, 19, 32, 0, 0, 1, 101, -120, -124, 13, -50, 113, 24, -96, 0, 47, -65, 28, 49, -61, 39, 93, 120};
    private boolean zzA;
    private float zzB;
    private ArrayDeque zzC;
    private zzvp zzD;
    private zzvm zzE;
    private int zzF;
    private boolean zzG;
    private boolean zzH;
    private boolean zzI;
    private boolean zzJ;
    private boolean zzK;
    private long zzL;
    private boolean zzM;
    private long zzN;
    private int zzO;
    private int zzP;
    private ByteBuffer zzQ;
    private boolean zzR;
    private boolean zzS;
    private boolean zzT;
    private boolean zzU;
    private boolean zzV;
    private boolean zzW;
    private int zzX;
    private int zzY;
    private int zzZ;
    protected zzjb zza;
    private boolean zzaa;
    private boolean zzab;
    private boolean zzac;
    private long zzad;
    private boolean zzae;
    private boolean zzaf;
    private boolean zzag;
    private zzvs zzah;
    private long zzai;
    private boolean zzaj;
    private boolean zzak;
    private boolean zzal;
    private long zzam;
    private zziz zzan;
    private zziz zzao;
    private zzgww zzap;
    private final Context zzc;
    private final zzvh zzd;
    private final zzvv zze;
    private final float zzf;
    private final zziv zzg;
    private final zziv zzh;
    private final zziv zzi;
    private final zzva zzj;
    private final MediaCodec.BufferInfo zzk;
    private final ArrayDeque zzl;
    private final zzty zzm;
    private final AtomicInteger zzn;
    private zzv zzo;
    private zzv zzp;
    private zzug zzq;
    private zzug zzr;
    private zzmz zzs;
    private MediaCrypto zzt;
    private long zzu;
    private float zzv;
    private float zzw;
    private zzvj zzx;
    private zzv zzy;
    private MediaFormat zzz;

    public zzvt(Context context, int i10, zzvh zzvhVar, zzvv zzvvVar, boolean z10, float f10) {
        super(i10);
        this.zzc = context.getApplicationContext();
        this.zzd = zzvhVar;
        zzvvVar.getClass();
        this.zze = zzvvVar;
        this.zzf = f10;
        this.zzn = new AtomicInteger();
        this.zzg = new zziv(0, 0);
        this.zzh = new zziv(0, 0);
        this.zzi = new zziv(2, 0);
        zzva zzvaVar = new zzva();
        this.zzj = zzvaVar;
        this.zzk = new MediaCodec.BufferInfo();
        this.zzv = 1.0f;
        this.zzw = 1.0f;
        this.zzu = C.TIME_UNSET;
        this.zzl = new ArrayDeque();
        this.zzah = zzvs.zza;
        zzvaVar.zzj(0);
        zzvaVar.zzc.order(ByteOrder.nativeOrder());
        this.zzm = new zzty();
        this.zzB = -1.0f;
        this.zzF = 0;
        this.zzX = 0;
        this.zzO = -1;
        this.zzP = -1;
        this.zzN = C.TIME_UNSET;
        this.zzad = C.TIME_UNSET;
        this.zzai = C.TIME_UNSET;
        this.zzL = C.TIME_UNSET;
        this.zzY = 0;
        this.zzZ = 0;
        this.zza = new zzjb();
        this.zzal = false;
        this.zzam = 0L;
        this.zzap = zzgww.zzh();
        zziz zzizVar = zziz.zza;
        this.zzan = zzizVar;
        this.zzao = zzizVar;
    }

    private final boolean zzaA(int i10) throws zzjk {
        zzlw zzlwVarZzI = zzI();
        zziv zzivVar = this.zzg;
        zzivVar.zza();
        int iZzQ = zzQ(zzlwVarZzI, zzivVar, i10 | 4);
        if (iZzQ == -5) {
            zzao(zzlwVarZzI);
            return true;
        }
        if (iZzQ != -4 || !zzivVar.zzb()) {
            return false;
        }
        this.zzae = true;
        zzbr();
        return false;
    }

    private final boolean zzaB(long j10) {
        return this.zzu == C.TIME_UNSET || zzM().zzb() - j10 < this.zzu;
    }

    private final boolean zzaC() {
        return this.zzP >= 0;
    }

    private final void zzaq() {
        this.zzT = false;
        zzaw();
    }

    private final void zzaw() {
        zzaz();
        this.zzV = false;
        this.zzj.zza();
        this.zzi.zza();
        this.zzU = false;
        this.zzm.zzb();
    }

    private final boolean zzax() {
        if (this.zzx == null) {
            return false;
        }
        if (zzaO()) {
            zzaM();
            return true;
        }
        if (zzaP()) {
            zzay();
            return false;
        }
        this.zzal = true;
        return false;
    }

    private final void zzay() {
        try {
            zzvj zzvjVar = this.zzx;
            if (zzvjVar == null) {
                throw null;
            }
            zzvjVar.zzk();
            zzaR();
        } catch (Throwable th2) {
            zzaR();
            throw th2;
        }
    }

    private final void zzaz() {
        this.zzad = C.TIME_UNSET;
        zzbt().zzf = C.TIME_UNSET;
        this.zzai = C.TIME_UNSET;
    }

    protected static boolean zzbj(zzv zzvVar) {
        return zzvVar.zzO == 0;
    }

    private final void zzbm() {
        this.zzO = -1;
        this.zzh.zzc = null;
    }

    private final void zzbn() {
        this.zzP = -1;
        this.zzQ = null;
    }

    private final boolean zzbo(zzv zzvVar) throws zzjk {
        if (this.zzx != null && this.zzZ != 3 && zze() != 0) {
            float f10 = this.zzw;
            zzvVar.getClass();
            float fZzak = zzak(f10, zzvVar, zzJ());
            float f11 = this.zzB;
            if (f11 != fZzak) {
                if (fZzak == -1.0f) {
                    zzbq();
                    return false;
                }
                if (f11 != -1.0f || fZzak > this.zzf) {
                    Bundle bundle = new Bundle();
                    bundle.putFloat("operating-rate", fZzak);
                    zzvj zzvjVar = this.zzx;
                    zzvjVar.getClass();
                    zzvjVar.zzp(bundle);
                    this.zzB = fZzak;
                }
            }
        }
        return true;
    }

    private final boolean zzbp() {
        if (this.zzaa) {
            this.zzY = 1;
            if (this.zzH) {
                this.zzZ = 3;
                return false;
            }
            this.zzZ = 2;
        } else {
            zzbu();
        }
        return true;
    }

    private final void zzbq() throws zzjk {
        if (this.zzaa) {
            this.zzY = 1;
            this.zzZ = 3;
        } else {
            zzaM();
            zzaE();
        }
    }

    private final void zzbr() throws zzjk {
        int i10 = this.zzZ;
        if (i10 == 1) {
            zzay();
            return;
        }
        if (i10 == 2) {
            zzay();
            zzbu();
        } else if (i10 != 3) {
            this.zzaf = true;
            zzau();
        } else {
            zzaM();
            zzaE();
        }
    }

    private final void zzbs(zzvs zzvsVar) {
        this.zzah = zzvsVar;
        if (zzvsVar.zzd != C.TIME_UNSET) {
            this.zzaj = true;
        }
    }

    private final zzvs zzbt() {
        ArrayDeque arrayDeque = this.zzl;
        return !arrayDeque.isEmpty() ? (zzvs) arrayDeque.getLast() : this.zzah;
    }

    private final void zzbu() {
        zzug zzugVar = this.zzr;
        zzugVar.getClass();
        this.zzq = zzugVar;
        this.zzY = 0;
        this.zzZ = 0;
    }

    private final boolean zzbv(long j10, long j11) {
        if (j11 >= j10) {
            return false;
        }
        zzv zzvVar = this.zzp;
        return (zzvVar != null && Objects.equals(zzvVar.zzp, MimeTypes.AUDIO_OPUS) && zzgv.zzf(j10, j11)) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.zzix
    protected void zzA(long j10, boolean z10, boolean z11) throws zzjk {
        ArrayDeque arrayDeque = this.zzl;
        if (!arrayDeque.isEmpty()) {
            this.zzah = (zzvs) arrayDeque.getLast();
        }
        arrayDeque.clear();
        if (z11) {
            this.zzae = false;
            this.zzaf = false;
            if (this.zzT) {
                zzaw();
            } else {
                zzaN();
            }
            zzfh zzfhVar = this.zzah.zze;
            if (zzfhVar.zzc() > 0) {
                this.zzag = true;
            }
            zzfhVar.zzb();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzix
    protected void zzD() {
        this.zzo = null;
        zzbs(zzvs.zza);
        this.zzl.clear();
        if (this.zzT) {
            zzaq();
        } else {
            zzax();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzix
    protected void zzE() {
        try {
            zzaq();
            zzaM();
        } finally {
            this.zzr = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzna
    public final long zzV(long j10, long j11) {
        return zzaj(j10, j11, this.zzM);
    }

    @Override // com.google.android.gms.internal.ads.zzna
    public void zzX(float f10, float f11) throws zzjk {
        this.zzv = f10;
        this.zzw = f11;
        zzbo(this.zzy);
    }

    public final void zzaD() {
        this.zzak = true;
    }

    /* JADX WARN: Code duplicated, block: B:148:0x028d A[Catch: zzvp -> 0x0082, TryCatch #4 {zzvp -> 0x0082, blocks: (B:25:0x0055, B:27:0x005c, B:29:0x0060, B:31:0x0076, B:36:0x0087, B:40:0x0093, B:42:0x009b, B:44:0x009f, B:46:0x00a3, B:48:0x00ac, B:146:0x0274, B:148:0x028d, B:150:0x0296, B:153:0x029d, B:154:0x029f, B:149:0x0290, B:156:0x02a1, B:157:0x02a2, B:159:0x02a7, B:160:0x02a8, B:161:0x02b2, B:38:0x008a, B:39:0x0092, B:163:0x02b5), top: B:174:0x0055, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:149:0x0290 A[Catch: zzvp -> 0x0082, TryCatch #4 {zzvp -> 0x0082, blocks: (B:25:0x0055, B:27:0x005c, B:29:0x0060, B:31:0x0076, B:36:0x0087, B:40:0x0093, B:42:0x009b, B:44:0x009f, B:46:0x00a3, B:48:0x00ac, B:146:0x0274, B:148:0x028d, B:150:0x0296, B:153:0x029d, B:154:0x029f, B:149:0x0290, B:156:0x02a1, B:157:0x02a2, B:159:0x02a7, B:160:0x02a8, B:161:0x02b2, B:38:0x008a, B:39:0x0092, B:163:0x02b5), top: B:174:0x0055, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:152:0x029c  */
    /* JADX WARN: Code duplicated, block: B:183:0x029d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:84:0x0199  */
    /* JADX WARN: Code duplicated, block: B:96:0x01be  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v30, types: [com.google.android.gms.internal.ads.zzvh] */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v3, types: [com.google.android.gms.internal.ads.zzvm] */
    /* JADX WARN: Type inference failed for: r10v6, types: [com.google.android.gms.internal.ads.zzvg] */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r17v1, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r25v0, types: [com.google.android.gms.internal.ads.zzix, com.google.android.gms.internal.ads.zzvt] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.util.ArrayDeque] */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    protected final void zzaE() throws zzjk {
        zzv zzvVar;
        boolean z10;
        ?? r10;
        zzvp zzvpVar;
        zzvp zzvpVar2;
        long j10;
        int i10;
        boolean z11;
        if (this.zzx != null || this.zzT || (zzvVar = this.zzo) == null) {
            return;
        }
        boolean z12 = true;
        if (zzaF(zzvVar)) {
            zzaq();
            String str = zzvVar.zzp;
            if (MimeTypes.AUDIO_AAC.equals(str) || MimeTypes.AUDIO_MPEG.equals(str) || MimeTypes.AUDIO_OPUS.equals(str)) {
                this.zzj.zzm(32);
            } else {
                this.zzj.zzm(1);
            }
            this.zzT = true;
            return;
        }
        zzug zzugVar = this.zzr;
        this.zzq = zzugVar;
        if (zzugVar != null) {
            zzgtj.zzi(true);
            this.zzq.zza();
        }
        try {
            zzv zzvVar2 = this.zzo;
            MediaCrypto mediaCrypto = null;
            if (zzvVar2 == null) {
                throw null;
            }
            if (this.zzC == null) {
                try {
                    List listZzaf = zzaf(this.zze, zzvVar2, false);
                    listZzaf.isEmpty();
                    this.zzC = new ArrayDeque();
                    if (!listZzaf.isEmpty()) {
                        this.zzC.add((zzvm) listZzaf.get(0));
                    }
                    this.zzD = null;
                } catch (zzvx e10) {
                    throw new zzvp(zzvVar2, (Throwable) e10, false, -49998);
                }
            }
            if (this.zzC.isEmpty()) {
                throw new zzvp(zzvVar2, (Throwable) null, false, -49999);
            }
            ArrayDeque arrayDeque = this.zzC;
            if (arrayDeque == null) {
                throw null;
            }
            while (this.zzx == null) {
                zzvm zzvmVar = (zzvm) arrayDeque.peekFirst();
                if (zzvmVar == null) {
                    throw mediaCrypto;
                }
                zzaU(zzvVar2);
                if (!zzaG(zzvmVar)) {
                    return;
                }
                try {
                    this.zzE = zzvmVar;
                    zzv zzvVar3 = this.zzo;
                    if (zzvVar3 == null) {
                        throw mediaCrypto;
                    }
                    String str2 = zzvmVar.zza;
                    float fZzak = zzak(this.zzw, zzvVar3, zzJ());
                    if (fZzak <= this.zzf) {
                        fZzak = -1.0f;
                    }
                    long jZzb = zzM().zzb();
                    z10 = z12;
                    try {
                        ?? Zzah = zzah(zzvmVar, zzvVar3, mediaCrypto, fZzak);
                        int i11 = Build.VERSION.SDK_INT;
                        if (i11 >= 31) {
                            LogSessionId logSessionIdZza = zzL().zza();
                            j10 = jZzb;
                            if (!logSessionIdZza.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
                                Zzah.zzb.setString("log-session-id", logSessionIdZza.getStringId());
                            }
                        } else {
                            j10 = jZzb;
                        }
                        try {
                            StringBuilder sb2 = new StringBuilder(str2.length() + 12);
                            sb2.append("createCodec:");
                            sb2.append(str2);
                            Trace.beginSection(sb2.toString());
                            zzvj zzvjVarZzc = this.zzd.zzc(Zzah);
                            this.zzx = zzvjVarZzc;
                            this.zzM = zzvjVarZzc.zzm(new zzvr(this, null));
                            Trace.endSection();
                            long jZzb2 = zzM().zzb();
                            if (!zzvmVar.zzc(this.zzc, zzvVar3)) {
                                Object[] objArr = {zzv.zze(zzvVar3), str2};
                                String str3 = zzfl.zza;
                                zzeg.zzc("MediaCodecRenderer", String.format(Locale.US, "Format exceeds selected codec's capabilities [%s, %s]", objArr));
                            }
                            this.zzB = fZzak;
                            this.zzy = zzvVar3;
                            if (i11 > 25 || !"OMX.Exynos.avc.dec.secure".equals(str2)) {
                                i10 = 0;
                            } else {
                                String str4 = Build.MODEL;
                                if (str4.startsWith("SM-T585") || str4.startsWith("SM-A510") || str4.startsWith("SM-A520") || str4.startsWith("SM-J700")) {
                                    i10 = 2;
                                } else {
                                    i10 = 0;
                                }
                            }
                            this.zzF = i10;
                            this.zzG = (i11 == 29 && "c2.android.aac.decoder".equals(str2)) ? z10 : false;
                            this.zzH = false;
                            String str5 = zzvmVar.zza;
                            if (i11 <= 25 && "OMX.rk.video_decoder.avc".equals(str5)) {
                                z11 = z10;
                            } else if ((i11 > 29 || !("OMX.broadcom.video_decoder.tunnel".equals(str5) || "OMX.broadcom.video_decoder.tunnel.secure".equals(str5) || "OMX.bcm.vdec.avc.tunnel".equals(str5) || "OMX.bcm.vdec.avc.tunnel.secure".equals(str5) || "OMX.bcm.vdec.hevc.tunnel".equals(str5) || "OMX.bcm.vdec.hevc.tunnel.secure".equals(str5))) && !("Amazon".equals(Build.MANUFACTURER) && "AFTS".equals(Build.MODEL) && zzvmVar.zzf)) {
                                z11 = false;
                            } else {
                                z11 = z10;
                            }
                            this.zzK = z11;
                            if (this.zzx == null) {
                                throw null;
                            }
                            if (zze() == 2) {
                                this.zzN = zzM().zzb() + 1000;
                            }
                            this.zza.zza++;
                            long j11 = jZzb2 - j10;
                            if (i11 >= 31 && !this.zzap.isEmpty()) {
                                zzvj zzvjVar = this.zzx;
                                if (zzvjVar == null) {
                                    throw null;
                                }
                                zzvjVar.zzr(new ArrayList(this.zzap));
                            }
                            Zzah = zzvmVar;
                            try {
                                zzal(str2, Zzah, jZzb2, j11);
                            } catch (Exception e11) {
                                e = e11;
                                r10 = Zzah;
                                zzeg.zzd("MediaCodecRenderer", "Failed to initialize decoder: ".concat(r10.zza), e);
                                arrayDeque.removeFirst();
                                zzvpVar = new zzvp(zzvVar2, (Throwable) e, false, (zzvm) r10);
                                zzan(zzvpVar);
                                zzvpVar2 = this.zzD;
                                if (zzvpVar2 == null) {
                                    this.zzD = zzvpVar;
                                } else {
                                    this.zzD = zzvpVar2.zza(zzvpVar);
                                }
                                if (!arrayDeque.isEmpty()) {
                                    throw this.zzD;
                                }
                            }
                            z12 = z10;
                            mediaCrypto = null;
                        } catch (Throwable th2) {
                            Trace.endSection();
                            throw th2;
                        }
                    } catch (Exception e12) {
                        e = e12;
                        r10 = zzvmVar;
                    }
                } catch (Exception e13) {
                    e = e13;
                    z10 = z12;
                }
                r10 = zzvmVar;
                zzeg.zzd("MediaCodecRenderer", "Failed to initialize decoder: ".concat(r10.zza), e);
                arrayDeque.removeFirst();
                zzvpVar = new zzvp(zzvVar2, (Throwable) e, false, (zzvm) r10);
                zzan(zzvpVar);
                zzvpVar2 = this.zzD;
                if (zzvpVar2 == null) {
                    this.zzD = zzvpVar;
                } else {
                    this.zzD = zzvpVar2.zza(zzvpVar);
                }
                if (!arrayDeque.isEmpty()) {
                    throw this.zzD;
                }
                z12 = z10;
                mediaCrypto = null;
            }
            this.zzC = mediaCrypto;
        } catch (zzvp e14) {
            throw zzP(e14, zzvVar, false, 4001);
        }
    }

    protected final boolean zzaF(zzv zzvVar) {
        return this.zzr == null && zzag(zzvVar);
    }

    protected boolean zzaG(zzvm zzvmVar) {
        return true;
    }

    protected final boolean zzaH() {
        return this.zzT;
    }

    protected final zzvj zzaI() {
        return this.zzx;
    }

    protected final zzv zzaJ() {
        return this.zzy;
    }

    protected final MediaFormat zzaK() {
        return this.zzz;
    }

    protected final zzvm zzaL() {
        return this.zzE;
    }

    protected final void zzaM() {
        try {
            zzvj zzvjVar = this.zzx;
            if (zzvjVar != null) {
                zzvjVar.zzl();
                this.zza.zzb++;
                zzvm zzvmVar = this.zzE;
                if (zzvmVar == null) {
                    throw null;
                }
                zzam(zzvmVar.zza);
            }
            this.zzx = null;
            this.zzt = null;
            this.zzq = null;
            zzaS();
        } catch (Throwable th2) {
            this.zzx = null;
            this.zzt = null;
            this.zzq = null;
            zzaS();
            throw th2;
        }
    }

    protected final boolean zzaN() throws zzjk {
        boolean zZzax = zzax();
        if (zZzax) {
            zzaE();
        }
        return zZzax;
    }

    protected boolean zzaO() {
        int i10 = this.zzZ;
        if (i10 == 3 || ((this.zzG && !this.zzac) || (this.zzH && this.zzab))) {
            return true;
        }
        if (i10 != 2) {
            return false;
        }
        try {
            zzbu();
            return false;
        } catch (zzjk e10) {
            zzeg.zzd("MediaCodecRenderer", "Failed to update the DRM session, releasing the codec instead.", e10);
            return true;
        }
    }

    protected boolean zzaP() {
        return true;
    }

    protected final long zzaQ() {
        return this.zzam;
    }

    protected void zzaR() {
        zzbm();
        zzbn();
        zzaz();
        this.zzN = C.TIME_UNSET;
        this.zzab = false;
        this.zzL = C.TIME_UNSET;
        this.zzaa = false;
        this.zzI = false;
        this.zzJ = false;
        this.zzR = false;
        this.zzS = false;
        this.zzY = 0;
        this.zzZ = 0;
        this.zzX = this.zzW ? 1 : 0;
        this.zzal = false;
        this.zzam = 0L;
    }

    protected final void zzaS() {
        zzaR();
        this.zzC = null;
        this.zzE = null;
        this.zzy = null;
        this.zzz = null;
        this.zzA = false;
        this.zzac = false;
        this.zzB = -1.0f;
        this.zzF = 0;
        this.zzG = false;
        this.zzH = false;
        this.zzK = false;
        this.zzM = false;
        this.zzW = false;
        this.zzX = 0;
    }

    protected zzvl zzaT(Throwable th2, zzvm zzvmVar) {
        return new zzvl(th2, zzvmVar);
    }

    protected boolean zzaU(zzv zzvVar) {
        return true;
    }

    protected void zzaV(zziv zzivVar) {
    }

    protected int zzaW(zziv zzivVar) {
        return 0;
    }

    protected boolean zzaX(zziv zzivVar) {
        return false;
    }

    protected final long zzaY() {
        return this.zzai;
    }

    protected void zzaZ(long j10) {
        this.zzai = j10;
        while (true) {
            ArrayDeque arrayDeque = this.zzl;
            if (arrayDeque.isEmpty() || j10 < ((zzvs) arrayDeque.peek()).zzb) {
                return;
            }
            zzvs zzvsVar = (zzvs) arrayDeque.poll();
            zzvsVar.getClass();
            zzbs(zzvsVar);
            zzar();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzna
    public boolean zzaa() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzna
    public boolean zzab() {
        return this.zzaf;
    }

    @Override // com.google.android.gms.internal.ads.zznc
    public final int zzad(zzv zzvVar) throws zzjk {
        try {
            return zzae(this.zze, zzvVar);
        } catch (zzvx e10) {
            throw zzP(e10, zzvVar, false, 4002);
        }
    }

    protected abstract int zzae(zzvv zzvvVar, zzv zzvVar);

    protected abstract List zzaf(zzvv zzvvVar, zzv zzvVar, boolean z10);

    protected boolean zzag(zzv zzvVar) {
        return false;
    }

    protected abstract zzvg zzah(zzvm zzvmVar, zzv zzvVar, MediaCrypto mediaCrypto, float f10);

    protected zzjc zzai(zzvm zzvmVar, zzv zzvVar, zzv zzvVar2) {
        throw null;
    }

    protected long zzaj(long j10, long j11, boolean z10) {
        return super.zzV(j10, j11);
    }

    protected float zzak(float f10, zzv zzvVar, zzv[] zzvVarArr) {
        throw null;
    }

    protected void zzal(String str, zzvg zzvgVar, long j10, long j11) {
        throw null;
    }

    protected void zzam(String str) {
        throw null;
    }

    protected void zzan(Exception exc) {
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0081  */
    /* JADX WARN: Code duplicated, block: B:37:0x008e  */
    protected zzjc zzao(zzlw zzlwVar) throws zzjk {
        int i10;
        boolean z10 = true;
        this.zzag = true;
        zzv zzvVarZzO = zzlwVar.zzb;
        zzvVarZzO.getClass();
        String str = zzvVarZzO.zzp;
        if (str == null) {
            throw zzP(new IllegalArgumentException("Sample MIME type is null."), zzvVarZzO, false, 4005);
        }
        if ((str.equals("video/av01") || str.equals(MimeTypes.VIDEO_VP9) || (str.equals("video/dolby-vision") && Objects.equals(zzwf.zzg(zzvVarZzO), "video/av01"))) && !zzvVarZzO.zzs.isEmpty()) {
            zzt zztVarZza = zzvVarZzO.zza();
            zztVarZza.zzr(null);
            zzvVarZzO = zztVarZza.zzO();
        }
        zzv zzvVar = zzvVarZzO;
        this.zzr = zzlwVar.zza;
        this.zzo = zzvVar;
        if (this.zzT) {
            this.zzV = true;
            return null;
        }
        zzvj zzvjVar = this.zzx;
        if (zzvjVar == null) {
            this.zzC = null;
            zzaE();
            return null;
        }
        zzvm zzvmVar = this.zzE;
        zzvmVar.getClass();
        zzv zzvVar2 = this.zzy;
        zzvVar2.getClass();
        zzug zzugVar = this.zzq;
        zzug zzugVar2 = this.zzr;
        if (zzugVar != zzugVar2) {
            zzbq();
            return new zzjc(zzvmVar.zza, zzvVar2, zzvVar, 0, 128);
        }
        zzjc zzjcVarZzai = zzai(zzvmVar, zzvVar2, zzvVar);
        int i11 = zzjcVarZzai.zzd;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (zzbo(zzvVar)) {
                        this.zzy = zzvVar;
                        if (zzugVar2 != zzugVar && !zzbp()) {
                            i10 = 2;
                        }
                    } else {
                        i10 = 16;
                    }
                } else if (zzbo(zzvVar)) {
                    this.zzW = true;
                    this.zzX = 1;
                    int i12 = this.zzF;
                    if (i12 != 2 && (i12 != 1 || zzvVar.zzw != zzvVar2.zzw || zzvVar.zzx != zzvVar2.zzx)) {
                        z10 = false;
                    }
                    this.zzI = z10;
                    this.zzy = zzvVar;
                    if (zzugVar2 != zzugVar && !zzbp()) {
                        i10 = 2;
                    }
                } else {
                    i10 = 16;
                }
            } else if (zzbo(zzvVar)) {
                this.zzy = zzvVar;
                if (zzugVar2 != zzugVar) {
                    if (!zzbp()) {
                        i10 = 2;
                    }
                } else if (this.zzaa) {
                    this.zzY = 1;
                    if (this.zzH) {
                        this.zzZ = 3;
                        i10 = 2;
                    } else {
                        this.zzZ = 1;
                    }
                }
            } else {
                i10 = 16;
            }
            return (i11 != 0 || (this.zzx == zzvjVar && this.zzZ != 3)) ? zzjcVarZzai : new zzjc(zzvmVar.zza, zzvVar2, zzvVar, 0, i10);
        }
        zzbq();
        i10 = 0;
        if (i11 != 0) {
        }
    }

    protected void zzap(zzv zzvVar, MediaFormat mediaFormat) {
        throw null;
    }

    protected void zzar() {
    }

    protected abstract boolean zzas(long j10, long j11, zzvj zzvjVar, ByteBuffer byteBuffer, int i10, int i11, int i12, long j12, boolean z10, boolean z11, zzv zzvVar);

    protected abstract void zzat(zziz zzizVar);

    protected void zzau() {
        throw null;
    }

    protected void zzav(zziv zzivVar) {
        throw null;
    }

    protected final boolean zzba() {
        if (this.zzo == null) {
            return false;
        }
        if (zzS() || zzaC()) {
            return true;
        }
        return this.zzN != C.TIME_UNSET && zzM().zzb() < this.zzN;
    }

    protected final float zzbb() {
        return this.zzv;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final zzmz zzbc() {
        return this.zzs;
    }

    protected final boolean zzbd() {
        return zzbo(this.zzy);
    }

    protected final long zzbe() {
        return this.zzah.zzf;
    }

    protected final long zzbf() {
        return this.zzad;
    }

    protected final long zzbg() {
        return this.zzah.zzd;
    }

    protected final long zzbh() {
        return this.zzah.zzc;
    }

    protected final void zzbi(MediaFormat mediaFormat) {
        if (Build.VERSION.SDK_INT >= 29) {
            this.zzan.zzb(mediaFormat);
        }
    }

    final /* synthetic */ void zzbk(zzlw zzlwVar) {
        this.zzn.set(zzQ(zzlwVar, this.zzh, 0));
    }

    final /* synthetic */ zzmz zzbl() {
        return this.zzs;
    }

    @Override // com.google.android.gms.internal.ads.zzix, com.google.android.gms.internal.ads.zznc
    public final int zzu() {
        return 8;
    }

    @Override // com.google.android.gms.internal.ads.zzix, com.google.android.gms.internal.ads.zzmv
    public void zzx(int i10, Object obj) {
        if (i10 != 11) {
            return;
        }
        zzmz zzmzVar = (zzmz) obj;
        zzmzVar.getClass();
        this.zzs = zzmzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzix
    protected void zzy(boolean z10, boolean z11) {
        this.zza = new zzjb();
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003a, code lost:
    
        if (r4 >= r0) goto L16;
     */
    @Override // com.google.android.gms.internal.ads.zzix
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void zzz(com.google.android.gms.internal.ads.zzv[] r12, long r13, long r15, com.google.android.gms.internal.ads.zzxk r17) {
        /*
            r11 = this;
            com.google.android.gms.internal.ads.zzvs r12 = r11.zzah
            long r0 = r12.zzd
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r12 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r12 != 0) goto L24
            com.google.android.gms.internal.ads.zzvs r4 = new com.google.android.gms.internal.ads.zzvs
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r7 = r13
            r9 = r15
            r4.<init>(r5, r7, r9)
            r11.zzbs(r4)
            boolean r12 = r11.zzak
            if (r12 == 0) goto L56
            r11.zzar()
            return
        L24:
            java.util.ArrayDeque r12 = r11.zzl
            boolean r0 = r12.isEmpty()
            if (r0 == 0) goto L57
            long r0 = r11.zzad
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L3c
            long r4 = r11.zzai
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r6 == 0) goto L57
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 < 0) goto L57
        L3c:
            com.google.android.gms.internal.ads.zzvs r4 = new com.google.android.gms.internal.ads.zzvs
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r7 = r13
            r9 = r15
            r4.<init>(r5, r7, r9)
            r11.zzbs(r4)
            com.google.android.gms.internal.ads.zzvs r12 = r11.zzah
            long r12 = r12.zzd
            int r12 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r12 == 0) goto L56
            r11.zzar()
        L56:
            return
        L57:
            com.google.android.gms.internal.ads.zzvs r0 = new com.google.android.gms.internal.ads.zzvs
            long r1 = r11.zzad
            r3 = r13
            r5 = r15
            r0.<init>(r1, r3, r5)
            r12.add(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzvt.zzz(com.google.android.gms.internal.ads.zzv[], long, long, com.google.android.gms.internal.ads.zzxk):void");
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0191 A[Catch: IllegalStateException -> 0x009c, CryptoException -> 0x00a1, TryCatch #5 {IllegalStateException -> 0x009c, blocks: (B:121:0x01d9, B:46:0x0099, B:56:0x00ac, B:58:0x00b0, B:61:0x00b9, B:64:0x00c7, B:65:0x00d6, B:69:0x00e3, B:71:0x00e9, B:111:0x01c1, B:113:0x01c7, B:114:0x01ca, B:116:0x01d0, B:118:0x01d4, B:72:0x00f3, B:74:0x00f9, B:75:0x0105, B:77:0x0115, B:80:0x0125, B:83:0x012b, B:85:0x012f, B:87:0x0139, B:89:0x0143, B:90:0x0160, B:91:0x0168, B:92:0x0169, B:94:0x0170, B:96:0x0178, B:98:0x017e, B:99:0x0185, B:101:0x0191, B:102:0x019a, B:107:0x01b5, B:109:0x01bb, B:105:0x01a1, B:79:0x011d, B:110:0x01be, B:125:0x01e8, B:127:0x01ef, B:128:0x01fd, B:130:0x0201, B:137:0x0218, B:139:0x021e, B:141:0x0226, B:143:0x0230, B:145:0x0238, B:147:0x023e, B:149:0x0244, B:152:0x024e, B:153:0x025b, B:155:0x0261, B:157:0x026d, B:166:0x027e, B:167:0x0286, B:168:0x028e, B:169:0x0296, B:170:0x029e, B:171:0x02a6, B:173:0x02b2, B:174:0x02b7, B:175:0x02bd, B:176:0x02be, B:178:0x02c2, B:180:0x02c6, B:182:0x02ca, B:183:0x02cd, B:185:0x02d3, B:187:0x02e2), top: B:408:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:104:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:105:0x01a1 A[Catch: IllegalStateException -> 0x009c, CryptoException -> 0x00a1, TryCatch #5 {IllegalStateException -> 0x009c, blocks: (B:121:0x01d9, B:46:0x0099, B:56:0x00ac, B:58:0x00b0, B:61:0x00b9, B:64:0x00c7, B:65:0x00d6, B:69:0x00e3, B:71:0x00e9, B:111:0x01c1, B:113:0x01c7, B:114:0x01ca, B:116:0x01d0, B:118:0x01d4, B:72:0x00f3, B:74:0x00f9, B:75:0x0105, B:77:0x0115, B:80:0x0125, B:83:0x012b, B:85:0x012f, B:87:0x0139, B:89:0x0143, B:90:0x0160, B:91:0x0168, B:92:0x0169, B:94:0x0170, B:96:0x0178, B:98:0x017e, B:99:0x0185, B:101:0x0191, B:102:0x019a, B:107:0x01b5, B:109:0x01bb, B:105:0x01a1, B:79:0x011d, B:110:0x01be, B:125:0x01e8, B:127:0x01ef, B:128:0x01fd, B:130:0x0201, B:137:0x0218, B:139:0x021e, B:141:0x0226, B:143:0x0230, B:145:0x0238, B:147:0x023e, B:149:0x0244, B:152:0x024e, B:153:0x025b, B:155:0x0261, B:157:0x026d, B:166:0x027e, B:167:0x0286, B:168:0x028e, B:169:0x0296, B:170:0x029e, B:171:0x02a6, B:173:0x02b2, B:174:0x02b7, B:175:0x02bd, B:176:0x02be, B:178:0x02c2, B:180:0x02c6, B:182:0x02ca, B:183:0x02cd, B:185:0x02d3, B:187:0x02e2), top: B:408:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:113:0x01c7 A[Catch: IllegalStateException -> 0x009c, CryptoException -> 0x00a1, TryCatch #5 {IllegalStateException -> 0x009c, blocks: (B:121:0x01d9, B:46:0x0099, B:56:0x00ac, B:58:0x00b0, B:61:0x00b9, B:64:0x00c7, B:65:0x00d6, B:69:0x00e3, B:71:0x00e9, B:111:0x01c1, B:113:0x01c7, B:114:0x01ca, B:116:0x01d0, B:118:0x01d4, B:72:0x00f3, B:74:0x00f9, B:75:0x0105, B:77:0x0115, B:80:0x0125, B:83:0x012b, B:85:0x012f, B:87:0x0139, B:89:0x0143, B:90:0x0160, B:91:0x0168, B:92:0x0169, B:94:0x0170, B:96:0x0178, B:98:0x017e, B:99:0x0185, B:101:0x0191, B:102:0x019a, B:107:0x01b5, B:109:0x01bb, B:105:0x01a1, B:79:0x011d, B:110:0x01be, B:125:0x01e8, B:127:0x01ef, B:128:0x01fd, B:130:0x0201, B:137:0x0218, B:139:0x021e, B:141:0x0226, B:143:0x0230, B:145:0x0238, B:147:0x023e, B:149:0x0244, B:152:0x024e, B:153:0x025b, B:155:0x0261, B:157:0x026d, B:166:0x027e, B:167:0x0286, B:168:0x028e, B:169:0x0296, B:170:0x029e, B:171:0x02a6, B:173:0x02b2, B:174:0x02b7, B:175:0x02bd, B:176:0x02be, B:178:0x02c2, B:180:0x02c6, B:182:0x02ca, B:183:0x02cd, B:185:0x02d3, B:187:0x02e2), top: B:408:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:255:0x03eb A[LOOP:0: B:128:0x01fd->B:255:0x03eb, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:384:0x05fd  */
    /* JADX WARN: Code duplicated, block: B:386:0x0604  */
    /* JADX WARN: Code duplicated, block: B:390:0x0618  */
    /* JADX WARN: Code duplicated, block: B:393:0x0623  */
    /* JADX WARN: Code duplicated, block: B:395:0x0626  */
    /* JADX WARN: Code duplicated, block: B:398:0x0635  */
    /* JADX WARN: Code duplicated, block: B:399:0x0638  */
    /* JADX WARN: Code duplicated, block: B:424:0x03ea A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:465:0x0168 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:471:0x01be A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:472:0x00e3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:473:0x00f9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:474:0x01bb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:475:0x01bb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:476:? A[LOOP:5: B:65:0x00d6->B:476:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:64:0x00c7 A[Catch: IllegalStateException -> 0x009c, CryptoException -> 0x00a1, TryCatch #5 {IllegalStateException -> 0x009c, blocks: (B:121:0x01d9, B:46:0x0099, B:56:0x00ac, B:58:0x00b0, B:61:0x00b9, B:64:0x00c7, B:65:0x00d6, B:69:0x00e3, B:71:0x00e9, B:111:0x01c1, B:113:0x01c7, B:114:0x01ca, B:116:0x01d0, B:118:0x01d4, B:72:0x00f3, B:74:0x00f9, B:75:0x0105, B:77:0x0115, B:80:0x0125, B:83:0x012b, B:85:0x012f, B:87:0x0139, B:89:0x0143, B:90:0x0160, B:91:0x0168, B:92:0x0169, B:94:0x0170, B:96:0x0178, B:98:0x017e, B:99:0x0185, B:101:0x0191, B:102:0x019a, B:107:0x01b5, B:109:0x01bb, B:105:0x01a1, B:79:0x011d, B:110:0x01be, B:125:0x01e8, B:127:0x01ef, B:128:0x01fd, B:130:0x0201, B:137:0x0218, B:139:0x021e, B:141:0x0226, B:143:0x0230, B:145:0x0238, B:147:0x023e, B:149:0x0244, B:152:0x024e, B:153:0x025b, B:155:0x0261, B:157:0x026d, B:166:0x027e, B:167:0x0286, B:168:0x028e, B:169:0x0296, B:170:0x029e, B:171:0x02a6, B:173:0x02b2, B:174:0x02b7, B:175:0x02bd, B:176:0x02be, B:178:0x02c2, B:180:0x02c6, B:182:0x02ca, B:183:0x02cd, B:185:0x02d3, B:187:0x02e2), top: B:408:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:67:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:71:0x00e9 A[Catch: IllegalStateException -> 0x009c, CryptoException -> 0x00a1, EDGE_INSN: B:71:0x00e9->B:111:0x01c1 BREAK  A[LOOP:5: B:65:0x00d6->B:476:?], TryCatch #5 {IllegalStateException -> 0x009c, blocks: (B:121:0x01d9, B:46:0x0099, B:56:0x00ac, B:58:0x00b0, B:61:0x00b9, B:64:0x00c7, B:65:0x00d6, B:69:0x00e3, B:71:0x00e9, B:111:0x01c1, B:113:0x01c7, B:114:0x01ca, B:116:0x01d0, B:118:0x01d4, B:72:0x00f3, B:74:0x00f9, B:75:0x0105, B:77:0x0115, B:80:0x0125, B:83:0x012b, B:85:0x012f, B:87:0x0139, B:89:0x0143, B:90:0x0160, B:91:0x0168, B:92:0x0169, B:94:0x0170, B:96:0x0178, B:98:0x017e, B:99:0x0185, B:101:0x0191, B:102:0x019a, B:107:0x01b5, B:109:0x01bb, B:105:0x01a1, B:79:0x011d, B:110:0x01be, B:125:0x01e8, B:127:0x01ef, B:128:0x01fd, B:130:0x0201, B:137:0x0218, B:139:0x021e, B:141:0x0226, B:143:0x0230, B:145:0x0238, B:147:0x023e, B:149:0x0244, B:152:0x024e, B:153:0x025b, B:155:0x0261, B:157:0x026d, B:166:0x027e, B:167:0x0286, B:168:0x028e, B:169:0x0296, B:170:0x029e, B:171:0x02a6, B:173:0x02b2, B:174:0x02b7, B:175:0x02bd, B:176:0x02be, B:178:0x02c2, B:180:0x02c6, B:182:0x02ca, B:183:0x02cd, B:185:0x02d3, B:187:0x02e2), top: B:408:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:72:0x00f3 A[Catch: IllegalStateException -> 0x009c, CryptoException -> 0x00a1, TryCatch #5 {IllegalStateException -> 0x009c, blocks: (B:121:0x01d9, B:46:0x0099, B:56:0x00ac, B:58:0x00b0, B:61:0x00b9, B:64:0x00c7, B:65:0x00d6, B:69:0x00e3, B:71:0x00e9, B:111:0x01c1, B:113:0x01c7, B:114:0x01ca, B:116:0x01d0, B:118:0x01d4, B:72:0x00f3, B:74:0x00f9, B:75:0x0105, B:77:0x0115, B:80:0x0125, B:83:0x012b, B:85:0x012f, B:87:0x0139, B:89:0x0143, B:90:0x0160, B:91:0x0168, B:92:0x0169, B:94:0x0170, B:96:0x0178, B:98:0x017e, B:99:0x0185, B:101:0x0191, B:102:0x019a, B:107:0x01b5, B:109:0x01bb, B:105:0x01a1, B:79:0x011d, B:110:0x01be, B:125:0x01e8, B:127:0x01ef, B:128:0x01fd, B:130:0x0201, B:137:0x0218, B:139:0x021e, B:141:0x0226, B:143:0x0230, B:145:0x0238, B:147:0x023e, B:149:0x0244, B:152:0x024e, B:153:0x025b, B:155:0x0261, B:157:0x026d, B:166:0x027e, B:167:0x0286, B:168:0x028e, B:169:0x0296, B:170:0x029e, B:171:0x02a6, B:173:0x02b2, B:174:0x02b7, B:175:0x02bd, B:176:0x02be, B:178:0x02c2, B:180:0x02c6, B:182:0x02ca, B:183:0x02cd, B:185:0x02d3, B:187:0x02e2), top: B:408:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:75:0x0105 A[Catch: IllegalStateException -> 0x009c, CryptoException -> 0x00a1, TryCatch #5 {IllegalStateException -> 0x009c, blocks: (B:121:0x01d9, B:46:0x0099, B:56:0x00ac, B:58:0x00b0, B:61:0x00b9, B:64:0x00c7, B:65:0x00d6, B:69:0x00e3, B:71:0x00e9, B:111:0x01c1, B:113:0x01c7, B:114:0x01ca, B:116:0x01d0, B:118:0x01d4, B:72:0x00f3, B:74:0x00f9, B:75:0x0105, B:77:0x0115, B:80:0x0125, B:83:0x012b, B:85:0x012f, B:87:0x0139, B:89:0x0143, B:90:0x0160, B:91:0x0168, B:92:0x0169, B:94:0x0170, B:96:0x0178, B:98:0x017e, B:99:0x0185, B:101:0x0191, B:102:0x019a, B:107:0x01b5, B:109:0x01bb, B:105:0x01a1, B:79:0x011d, B:110:0x01be, B:125:0x01e8, B:127:0x01ef, B:128:0x01fd, B:130:0x0201, B:137:0x0218, B:139:0x021e, B:141:0x0226, B:143:0x0230, B:145:0x0238, B:147:0x023e, B:149:0x0244, B:152:0x024e, B:153:0x025b, B:155:0x0261, B:157:0x026d, B:166:0x027e, B:167:0x0286, B:168:0x028e, B:169:0x0296, B:170:0x029e, B:171:0x02a6, B:173:0x02b2, B:174:0x02b7, B:175:0x02bd, B:176:0x02be, B:178:0x02c2, B:180:0x02c6, B:182:0x02ca, B:183:0x02cd, B:185:0x02d3, B:187:0x02e2), top: B:408:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:79:0x011d A[Catch: IllegalStateException -> 0x009c, CryptoException -> 0x00a1, TryCatch #5 {IllegalStateException -> 0x009c, blocks: (B:121:0x01d9, B:46:0x0099, B:56:0x00ac, B:58:0x00b0, B:61:0x00b9, B:64:0x00c7, B:65:0x00d6, B:69:0x00e3, B:71:0x00e9, B:111:0x01c1, B:113:0x01c7, B:114:0x01ca, B:116:0x01d0, B:118:0x01d4, B:72:0x00f3, B:74:0x00f9, B:75:0x0105, B:77:0x0115, B:80:0x0125, B:83:0x012b, B:85:0x012f, B:87:0x0139, B:89:0x0143, B:90:0x0160, B:91:0x0168, B:92:0x0169, B:94:0x0170, B:96:0x0178, B:98:0x017e, B:99:0x0185, B:101:0x0191, B:102:0x019a, B:107:0x01b5, B:109:0x01bb, B:105:0x01a1, B:79:0x011d, B:110:0x01be, B:125:0x01e8, B:127:0x01ef, B:128:0x01fd, B:130:0x0201, B:137:0x0218, B:139:0x021e, B:141:0x0226, B:143:0x0230, B:145:0x0238, B:147:0x023e, B:149:0x0244, B:152:0x024e, B:153:0x025b, B:155:0x0261, B:157:0x026d, B:166:0x027e, B:167:0x0286, B:168:0x028e, B:169:0x0296, B:170:0x029e, B:171:0x02a6, B:173:0x02b2, B:174:0x02b7, B:175:0x02bd, B:176:0x02be, B:178:0x02c2, B:180:0x02c6, B:182:0x02ca, B:183:0x02cd, B:185:0x02d3, B:187:0x02e2), top: B:408:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:83:0x012b A[Catch: IllegalStateException -> 0x009c, CryptoException -> 0x00a1, TRY_ENTER, TryCatch #5 {IllegalStateException -> 0x009c, blocks: (B:121:0x01d9, B:46:0x0099, B:56:0x00ac, B:58:0x00b0, B:61:0x00b9, B:64:0x00c7, B:65:0x00d6, B:69:0x00e3, B:71:0x00e9, B:111:0x01c1, B:113:0x01c7, B:114:0x01ca, B:116:0x01d0, B:118:0x01d4, B:72:0x00f3, B:74:0x00f9, B:75:0x0105, B:77:0x0115, B:80:0x0125, B:83:0x012b, B:85:0x012f, B:87:0x0139, B:89:0x0143, B:90:0x0160, B:91:0x0168, B:92:0x0169, B:94:0x0170, B:96:0x0178, B:98:0x017e, B:99:0x0185, B:101:0x0191, B:102:0x019a, B:107:0x01b5, B:109:0x01bb, B:105:0x01a1, B:79:0x011d, B:110:0x01be, B:125:0x01e8, B:127:0x01ef, B:128:0x01fd, B:130:0x0201, B:137:0x0218, B:139:0x021e, B:141:0x0226, B:143:0x0230, B:145:0x0238, B:147:0x023e, B:149:0x0244, B:152:0x024e, B:153:0x025b, B:155:0x0261, B:157:0x026d, B:166:0x027e, B:167:0x0286, B:168:0x028e, B:169:0x0296, B:170:0x029e, B:171:0x02a6, B:173:0x02b2, B:174:0x02b7, B:175:0x02bd, B:176:0x02be, B:178:0x02c2, B:180:0x02c6, B:182:0x02ca, B:183:0x02cd, B:185:0x02d3, B:187:0x02e2), top: B:408:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:85:0x012f A[Catch: IllegalStateException -> 0x009c, CryptoException -> 0x00a1, TryCatch #5 {IllegalStateException -> 0x009c, blocks: (B:121:0x01d9, B:46:0x0099, B:56:0x00ac, B:58:0x00b0, B:61:0x00b9, B:64:0x00c7, B:65:0x00d6, B:69:0x00e3, B:71:0x00e9, B:111:0x01c1, B:113:0x01c7, B:114:0x01ca, B:116:0x01d0, B:118:0x01d4, B:72:0x00f3, B:74:0x00f9, B:75:0x0105, B:77:0x0115, B:80:0x0125, B:83:0x012b, B:85:0x012f, B:87:0x0139, B:89:0x0143, B:90:0x0160, B:91:0x0168, B:92:0x0169, B:94:0x0170, B:96:0x0178, B:98:0x017e, B:99:0x0185, B:101:0x0191, B:102:0x019a, B:107:0x01b5, B:109:0x01bb, B:105:0x01a1, B:79:0x011d, B:110:0x01be, B:125:0x01e8, B:127:0x01ef, B:128:0x01fd, B:130:0x0201, B:137:0x0218, B:139:0x021e, B:141:0x0226, B:143:0x0230, B:145:0x0238, B:147:0x023e, B:149:0x0244, B:152:0x024e, B:153:0x025b, B:155:0x0261, B:157:0x026d, B:166:0x027e, B:167:0x0286, B:168:0x028e, B:169:0x0296, B:170:0x029e, B:171:0x02a6, B:173:0x02b2, B:174:0x02b7, B:175:0x02bd, B:176:0x02be, B:178:0x02c2, B:180:0x02c6, B:182:0x02ca, B:183:0x02cd, B:185:0x02d3, B:187:0x02e2), top: B:408:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:98:0x017e A[Catch: IllegalStateException -> 0x009c, CryptoException -> 0x00a1, TryCatch #5 {IllegalStateException -> 0x009c, blocks: (B:121:0x01d9, B:46:0x0099, B:56:0x00ac, B:58:0x00b0, B:61:0x00b9, B:64:0x00c7, B:65:0x00d6, B:69:0x00e3, B:71:0x00e9, B:111:0x01c1, B:113:0x01c7, B:114:0x01ca, B:116:0x01d0, B:118:0x01d4, B:72:0x00f3, B:74:0x00f9, B:75:0x0105, B:77:0x0115, B:80:0x0125, B:83:0x012b, B:85:0x012f, B:87:0x0139, B:89:0x0143, B:90:0x0160, B:91:0x0168, B:92:0x0169, B:94:0x0170, B:96:0x0178, B:98:0x017e, B:99:0x0185, B:101:0x0191, B:102:0x019a, B:107:0x01b5, B:109:0x01bb, B:105:0x01a1, B:79:0x011d, B:110:0x01be, B:125:0x01e8, B:127:0x01ef, B:128:0x01fd, B:130:0x0201, B:137:0x0218, B:139:0x021e, B:141:0x0226, B:143:0x0230, B:145:0x0238, B:147:0x023e, B:149:0x0244, B:152:0x024e, B:153:0x025b, B:155:0x0261, B:157:0x026d, B:166:0x027e, B:167:0x0286, B:168:0x028e, B:169:0x0296, B:170:0x029e, B:171:0x02a6, B:173:0x02b2, B:174:0x02b7, B:175:0x02bd, B:176:0x02be, B:178:0x02c2, B:180:0x02c6, B:182:0x02ca, B:183:0x02cd, B:185:0x02d3, B:187:0x02e2), top: B:408:0x0028 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v20 */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r24v0, types: [com.google.android.gms.internal.ads.zzix, com.google.android.gms.internal.ads.zzvt] */
    /* JADX WARN: Type inference failed for: r2v12, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9, types: [android.media.MediaFormat, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v5 */
    @Override // com.google.android.gms.internal.ads.zzna
    public void zzZ(long j10, long j11) throws Throwable {
        boolean z10;
        ?? r12;
        ?? r13;
        boolean z11;
        ?? r10;
        zzvl zzvlVarZzaT;
        int i10;
        StackTraceElement[] stackTrace;
        boolean z12;
        ?? r11;
        boolean z13;
        zzlw zzlwVarZzI;
        zziv zzivVar;
        int iZzQ;
        byte b10;
        zzv zzvVar;
        long jZzH;
        zzv zzvVar2;
        Throwable th2;
        boolean z14 = true;
        try {
            try {
                if (this.zzaf) {
                    zzau();
                    return;
                }
                int i11 = 2;
                if (this.zzo == null && !zzaA(2)) {
                    return;
                }
                zzaE();
                byte b11 = -5;
                ?? r14 = 0;
                try {
                    try {
                        try {
                            try {
                                if (this.zzT) {
                                    try {
                                        try {
                                            Trace.beginSection("bypassRender");
                                            while (true) {
                                                zzgtj.zzi(this.zzaf ^ z14);
                                                zzva zzvaVar = this.zzj;
                                                try {
                                                    if (zzvaVar.zzp()) {
                                                        ByteBuffer byteBuffer = zzvaVar.zzc;
                                                        int i12 = this.zzP;
                                                        int iZzo = zzvaVar.zzo();
                                                        long j12 = zzvaVar.zze;
                                                        boolean zZzbv = zzbv(zzH(), zzvaVar.zzn());
                                                        boolean zZzb = zzvaVar.zzb();
                                                        zzv zzvVar3 = this.zzp;
                                                        if (zzvVar3 == null) {
                                                            throw r14;
                                                        }
                                                        if (zzas(j10, j11, null, byteBuffer, i12, 0, iZzo, j12, zZzbv, zZzb, zzvVar3)) {
                                                            zzaZ(zzvaVar.zzn());
                                                            zzvaVar.zza();
                                                            r11 = 0;
                                                        } else {
                                                            z14 = true;
                                                        }
                                                        z13 = false;
                                                        break;
                                                    }
                                                    r11 = r14;
                                                    if (this.zzae) {
                                                        z14 = true;
                                                        this.zzaf = true;
                                                        z13 = false;
                                                        break;
                                                    }
                                                    z14 = true;
                                                    if (this.zzU) {
                                                        zzgtj.zzi(zzvaVar.zzq(this.zzi));
                                                        z13 = false;
                                                        this.zzU = false;
                                                    } else {
                                                        z13 = false;
                                                    }
                                                    if (this.zzV) {
                                                        if (!zzvaVar.zzp()) {
                                                            zzaq();
                                                            this.zzV = z13;
                                                            zzaE();
                                                            if (!this.zzT) {
                                                                break;
                                                            }
                                                            zzgtj.zzi(!this.zzae);
                                                            zzlwVarZzI = zzI();
                                                            zzivVar = this.zzi;
                                                            zzivVar.zza();
                                                            while (true) {
                                                                zzivVar.zza();
                                                                iZzQ = zzQ(zzlwVarZzI, zzivVar, z13 ? 1 : 0);
                                                                b10 = -5;
                                                                if (iZzQ != -5) {
                                                                    zzao(zzlwVarZzI);
                                                                    break;
                                                                }
                                                                if (iZzQ != -4) {
                                                                    if (zzcW()) {
                                                                        break;
                                                                    }
                                                                    zzbt().zzf = this.zzad;
                                                                    break;
                                                                }
                                                                if (zzivVar.zzb()) {
                                                                    this.zzae = true;
                                                                    zzbt().zzf = this.zzad;
                                                                    break;
                                                                }
                                                                this.zzad = Math.max(this.zzad, zzivVar.zze);
                                                                if (zzcW()) {
                                                                    zzbt().zzf = this.zzad;
                                                                } else {
                                                                    zzbt().zzf = this.zzad;
                                                                }
                                                                if (this.zzag) {
                                                                    zzvVar2 = this.zzo;
                                                                    if (zzvVar2 != null) {
                                                                        throw r11;
                                                                    }
                                                                    this.zzp = zzvVar2;
                                                                    if (Objects.equals(zzvVar2.zzp, MimeTypes.AUDIO_OPUS)) {
                                                                        int iZze = zzgv.zze((byte[]) this.zzp.zzs.get(z13 ? 1 : 0));
                                                                        zzt zztVarZza = this.zzp.zza();
                                                                        zztVarZza.zzJ(iZze);
                                                                        this.zzp = zztVarZza.zzO();
                                                                    }
                                                                    zzap(this.zzp, r11);
                                                                    this.zzag = z13;
                                                                }
                                                                zzivVar.zzl();
                                                                zzvVar = this.zzp;
                                                                if (zzvVar != null) {
                                                                    if (zzivVar.zze()) {
                                                                        zzivVar.zza = this.zzp;
                                                                        zzav(zzivVar);
                                                                    }
                                                                    if (zzgv.zzf(zzH(), zzivVar.zze)) {
                                                                        this.zzm.zza(zzivVar, this.zzp.zzs);
                                                                    }
                                                                }
                                                                if (!zzvaVar.zzp()) {
                                                                    jZzH = zzH();
                                                                    if (zzbv(jZzH, zzvaVar.zzn()) == zzbv(jZzH, zzivVar.zze)) {
                                                                    }
                                                                    this.zzU = true;
                                                                    break;
                                                                }
                                                                if (!zzvaVar.zzq(zzivVar)) {
                                                                    this.zzU = true;
                                                                    break;
                                                                }
                                                            }
                                                            if (zzvaVar.zzp()) {
                                                                zzvaVar.zzl();
                                                            }
                                                            if (!zzvaVar.zzp()) {
                                                                break;
                                                                break;
                                                            }
                                                            continue;
                                                        } else {
                                                            b10 = -5;
                                                        }
                                                        r14 = r11;
                                                    } else {
                                                        zzgtj.zzi(!this.zzae);
                                                        zzlwVarZzI = zzI();
                                                        zzivVar = this.zzi;
                                                        zzivVar.zza();
                                                        while (true) {
                                                            zzivVar.zza();
                                                            iZzQ = zzQ(zzlwVarZzI, zzivVar, z13 ? 1 : 0);
                                                            b10 = -5;
                                                            if (iZzQ != -5) {
                                                                zzao(zzlwVarZzI);
                                                                break;
                                                            }
                                                            if (iZzQ != -4) {
                                                                if (zzcW()) {
                                                                    break;
                                                                }
                                                                zzbt().zzf = this.zzad;
                                                                break;
                                                            }
                                                            if (zzivVar.zzb()) {
                                                                this.zzae = true;
                                                                zzbt().zzf = this.zzad;
                                                                break;
                                                            }
                                                            this.zzad = Math.max(this.zzad, zzivVar.zze);
                                                            if (zzcW() || this.zzh.zzd()) {
                                                                zzbt().zzf = this.zzad;
                                                            }
                                                            if (this.zzag) {
                                                                zzvVar2 = this.zzo;
                                                                if (zzvVar2 != null) {
                                                                    throw r11;
                                                                }
                                                                this.zzp = zzvVar2;
                                                                if (Objects.equals(zzvVar2.zzp, MimeTypes.AUDIO_OPUS) && !this.zzp.zzs.isEmpty()) {
                                                                    int iZze2 = zzgv.zze((byte[]) this.zzp.zzs.get(z13 ? 1 : 0));
                                                                    zzt zztVarZza2 = this.zzp.zza();
                                                                    zztVarZza2.zzJ(iZze2);
                                                                    this.zzp = zztVarZza2.zzO();
                                                                }
                                                                zzap(this.zzp, r11);
                                                                this.zzag = z13;
                                                            }
                                                            zzivVar.zzl();
                                                            zzvVar = this.zzp;
                                                            if (zzvVar != null && Objects.equals(zzvVar.zzp, MimeTypes.AUDIO_OPUS)) {
                                                                if (zzivVar.zze()) {
                                                                    zzivVar.zza = this.zzp;
                                                                    zzav(zzivVar);
                                                                }
                                                                if (zzgv.zzf(zzH(), zzivVar.zze)) {
                                                                    this.zzm.zza(zzivVar, this.zzp.zzs);
                                                                }
                                                            }
                                                            if (!zzvaVar.zzp()) {
                                                                jZzH = zzH();
                                                                if (zzbv(jZzH, zzvaVar.zzn()) == zzbv(jZzH, zzivVar.zze)) {
                                                                }
                                                                this.zzU = true;
                                                                break;
                                                            }
                                                            if (!zzvaVar.zzq(zzivVar)) {
                                                                this.zzU = true;
                                                                break;
                                                            }
                                                        }
                                                        if (zzvaVar.zzp()) {
                                                            zzvaVar.zzl();
                                                        }
                                                        if (!zzvaVar.zzp() && !this.zzae && !this.zzV) {
                                                            break;
                                                        }
                                                        r14 = r11;
                                                    }
                                                } catch (IllegalStateException e10) {
                                                    e = e10;
                                                    z14 = true;
                                                    b11 = 0;
                                                    z10 = z14;
                                                    r13 = b11;
                                                    z11 = e instanceof MediaCodec.CodecException;
                                                    if (!z11) {
                                                        stackTrace = e.getStackTrace();
                                                        if (stackTrace.length > 0) {
                                                        }
                                                        throw e;
                                                    }
                                                    zzan(e);
                                                    if (z11) {
                                                        r10 = r13;
                                                    } else {
                                                        r10 = r13;
                                                    }
                                                    if (r10 != 0) {
                                                        zzaM();
                                                    }
                                                    zzvlVarZzaT = zzaT(e, this.zzE);
                                                    if (zzvlVarZzaT.zza == 1101) {
                                                        i10 = 4006;
                                                    } else {
                                                        i10 = 4003;
                                                    }
                                                    throw zzP(zzvlVarZzaT, this.zzo, r10, i10);
                                                }
                                            }
                                            Trace.endSection();
                                        } catch (MediaCodec.CryptoException e11) {
                                            e = e11;
                                            b11 = 0;
                                            r12 = b11;
                                            throw zzP(e, this.zzo, r12, zzfl.zzH(e.getErrorCode()));
                                        }
                                    } catch (IllegalStateException e12) {
                                        e = e12;
                                    }
                                } else {
                                    byte b12 = -5;
                                    Throwable th3 = null;
                                    boolean z15 = false;
                                    if (this.zzx != null) {
                                        long jZzb = zzM().zzb();
                                        Trace.beginSection("drainAndFeed");
                                        long j13 = jZzb;
                                        while (true) {
                                            zzvj zzvjVar = this.zzx;
                                            if (zzvjVar == null) {
                                                throw th3;
                                            }
                                            if (zzaC()) {
                                                th2 = th3;
                                            } else {
                                                try {
                                                    MediaCodec.BufferInfo bufferInfo = this.zzk;
                                                    int iZzf = zzvjVar.zzf(bufferInfo);
                                                    if (iZzf >= 0) {
                                                        th2 = th3;
                                                        bufferInfo.presentationTimeUs -= this.zzam;
                                                        if (!this.zzJ) {
                                                            if (bufferInfo.size == 0 && (bufferInfo.flags & 4) != 0) {
                                                                zzbr();
                                                                break;
                                                            }
                                                            this.zzP = iZzf;
                                                            ByteBuffer byteBufferZzj = zzvjVar.zzj(iZzf);
                                                            this.zzQ = byteBufferZzj;
                                                            if (byteBufferZzj != null) {
                                                                byteBufferZzj.position(bufferInfo.offset);
                                                                this.zzQ.limit(bufferInfo.offset + bufferInfo.size);
                                                            }
                                                            zzv zzvVar4 = (zzv) this.zzah.zze.zze(bufferInfo.presentationTimeUs);
                                                            if (zzvVar4 == null && this.zzaj && this.zzz != null) {
                                                                zzvVar4 = (zzv) this.zzah.zze.zzd();
                                                            }
                                                            if (zzvVar4 != null) {
                                                                this.zzp = zzvVar4;
                                                            } else if (this.zzA && this.zzp != null) {
                                                            }
                                                            zzv zzvVar5 = this.zzp;
                                                            if (zzvVar5 == null) {
                                                                throw th2;
                                                            }
                                                            zzap(zzvVar5, this.zzz);
                                                            this.zzA = z15;
                                                            this.zzaj = z15;
                                                        } else {
                                                            this.zzJ = z15;
                                                            zzvjVar.zzc(iZzf, z15);
                                                            if (!zzaB(j13)) {
                                                                break;
                                                                break;
                                                            }
                                                            th3 = th2;
                                                            z14 = true;
                                                            i11 = 2;
                                                            z15 = false;
                                                            b12 = -5;
                                                        }
                                                    } else {
                                                        if (iZzf != -2) {
                                                            if (this.zzK && (this.zzae || this.zzY == i11)) {
                                                                zzbr();
                                                            }
                                                            long j14 = this.zzL;
                                                            if (j14 != C.TIME_UNSET && j14 + 100 < zzM().zza()) {
                                                                zzbr();
                                                            }
                                                            th2 = th3;
                                                            break;
                                                        }
                                                        this.zzac = z14;
                                                        zzvj zzvjVar2 = this.zzx;
                                                        if (zzvjVar2 == null) {
                                                            throw th3;
                                                        }
                                                        MediaFormat mediaFormatZzg = zzvjVar2.zzg();
                                                        if (this.zzF != 0 && mediaFormatZzg.getInteger("width") == 32 && mediaFormatZzg.getInteger("height") == 32) {
                                                            this.zzJ = z14;
                                                        } else {
                                                            if (Build.VERSION.SDK_INT >= 29 && !this.zzap.isEmpty()) {
                                                                zzgww<String> zzgwwVar = this.zzap;
                                                                zziz zzizVar = zziz.zza;
                                                                zziy zziyVar = new zziy();
                                                                for (String str : zzgwwVar) {
                                                                    if (mediaFormatZzg.containsKey(str)) {
                                                                        int valueTypeForKey = mediaFormatZzg.getValueTypeForKey(str);
                                                                        if (valueTypeForKey == z14) {
                                                                            zziyVar.zza(str, mediaFormatZzg.getInteger(str));
                                                                        } else if (valueTypeForKey == i11) {
                                                                            zziyVar.zzb(str, mediaFormatZzg.getLong(str));
                                                                        } else if (valueTypeForKey == 3) {
                                                                            zziyVar.zzc(str, mediaFormatZzg.getFloat(str));
                                                                        } else if (valueTypeForKey == 4) {
                                                                            zziyVar.zzd(str, mediaFormatZzg.getString(str));
                                                                        } else if (valueTypeForKey == 5) {
                                                                            zziyVar.zze(str, mediaFormatZzg.getByteBuffer(str));
                                                                        }
                                                                    }
                                                                }
                                                                zziz zzizVarZzg = zziyVar.zzg();
                                                                if (!zzizVarZzg.equals(this.zzao)) {
                                                                    this.zzao = zzizVarZzg;
                                                                    zzat(zzizVarZzg);
                                                                }
                                                            }
                                                            this.zzz = mediaFormatZzg;
                                                            this.zzA = z14;
                                                        }
                                                        th2 = th3;
                                                        if (!zzaB(j13)) {
                                                            break;
                                                        }
                                                        th3 = th2;
                                                        z14 = true;
                                                        i11 = 2;
                                                        z15 = false;
                                                        b12 = -5;
                                                    }
                                                } catch (IllegalStateException e13) {
                                                    e = e13;
                                                    z12 = z15;
                                                    z10 = true;
                                                    r13 = z12;
                                                    z11 = e instanceof MediaCodec.CodecException;
                                                    if (!z11) {
                                                        stackTrace = e.getStackTrace();
                                                        if (stackTrace.length > 0) {
                                                        }
                                                        throw e;
                                                    }
                                                    zzan(e);
                                                    if (z11) {
                                                        r10 = r13;
                                                    } else {
                                                        r10 = r13;
                                                    }
                                                    if (r10 != 0) {
                                                        zzaM();
                                                    }
                                                    zzvlVarZzaT = zzaT(e, this.zzE);
                                                    if (zzvlVarZzaT.zza == 1101) {
                                                        i10 = 4006;
                                                    } else {
                                                        i10 = 4003;
                                                    }
                                                    throw zzP(zzvlVarZzaT, this.zzo, r10, i10);
                                                }
                                            }
                                            boolean z16 = (this.zzal || this.zzk.presentationTimeUs < zzH()) ? true : z15;
                                            this.zzR = z16;
                                            long j15 = this.zzah.zzf;
                                            boolean z17 = (j15 == C.TIME_UNSET || j15 > this.zzk.presentationTimeUs) ? z15 : true;
                                            this.zzS = z17;
                                            ByteBuffer byteBuffer2 = this.zzQ;
                                            int i13 = this.zzP;
                                            MediaCodec.BufferInfo bufferInfo2 = this.zzk;
                                            long j16 = j13;
                                            int i14 = bufferInfo2.flags;
                                            long j17 = bufferInfo2.presentationTimeUs;
                                            zzv zzvVar6 = this.zzp;
                                            if (zzvVar6 == null) {
                                                throw th2;
                                            }
                                            if (zzas(j10, j11, zzvjVar, byteBuffer2, i13, i14, 1, j17, z16, z17, zzvVar6)) {
                                                zzaZ(bufferInfo2.presentationTimeUs);
                                                boolean z18 = (bufferInfo2.flags & 4) != 0;
                                                if (!z18 && this.zzab && this.zzS) {
                                                    this.zzL = zzM().zza();
                                                }
                                                zzbn();
                                                if (z18) {
                                                    zzbr();
                                                } else {
                                                    j13 = j16;
                                                    if (!zzaB(j13)) {
                                                        break;
                                                        break;
                                                    }
                                                    th3 = th2;
                                                    z14 = true;
                                                    i11 = 2;
                                                    z15 = false;
                                                    b12 = -5;
                                                }
                                            }
                                            j13 = j16;
                                            break;
                                        }
                                        do {
                                            zzvj zzvjVar3 = this.zzx;
                                            if (zzvjVar3 != null && this.zzY != 2 && !this.zzae) {
                                                if (this.zzO < 0) {
                                                    int iZze3 = zzvjVar3.zze();
                                                    this.zzO = iZze3;
                                                    if (iZze3 >= 0) {
                                                        zziv zzivVar2 = this.zzh;
                                                        zzivVar2.zzc = zzvjVar3.zzh(iZze3);
                                                        zzivVar2.zza();
                                                    }
                                                }
                                                z10 = true;
                                                if (this.zzY == 1) {
                                                    if (!this.zzK) {
                                                        this.zzab = true;
                                                        zzvjVar3.zza(this.zzO, 0, 0, 0L, 4);
                                                        zzbm();
                                                    }
                                                    this.zzY = 2;
                                                    break;
                                                }
                                                try {
                                                    if (this.zzI) {
                                                        this.zzI = false;
                                                        ByteBuffer byteBuffer3 = this.zzh.zzc;
                                                        if (byteBuffer3 == null) {
                                                            throw th2;
                                                        }
                                                        byteBuffer3.put(zzb);
                                                        zzvjVar3.zza(this.zzO, 0, 38, 0L, 0);
                                                        zzbm();
                                                        this.zzaa = true;
                                                    } else {
                                                        if (this.zzX == 1) {
                                                            int i15 = 0;
                                                            while (true) {
                                                                zzv zzvVar7 = this.zzy;
                                                                if (zzvVar7 == null) {
                                                                    throw th2;
                                                                }
                                                                if (i15 >= zzvVar7.zzs.size()) {
                                                                    this.zzX = 2;
                                                                    break;
                                                                }
                                                                byte[] bArr = (byte[]) this.zzy.zzs.get(i15);
                                                                ByteBuffer byteBuffer4 = this.zzh.zzc;
                                                                if (byteBuffer4 == null) {
                                                                    throw th2;
                                                                }
                                                                byteBuffer4.put(bArr);
                                                                i15++;
                                                            }
                                                        }
                                                        ByteBuffer byteBuffer5 = this.zzh.zzc;
                                                        if (byteBuffer5 == null) {
                                                            throw th2;
                                                        }
                                                        int iPosition = byteBuffer5.position();
                                                        final zzlw zzlwVarZzI2 = zzI();
                                                        try {
                                                            zzvjVar3.zzi(new Runnable() { // from class: com.google.android.gms.internal.ads.zzvq
                                                                @Override // java.lang.Runnable
                                                                public final /* synthetic */ void run() {
                                                                    this.zza.zzbk(zzlwVarZzI2);
                                                                }
                                                            });
                                                            int i16 = this.zzn.get();
                                                            if (i16 == -3) {
                                                                if (!zzcW()) {
                                                                    break;
                                                                }
                                                                zzbt().zzf = this.zzad;
                                                                break;
                                                            }
                                                            if (i16 == -5) {
                                                                if (this.zzX == 2) {
                                                                    this.zzh.zza();
                                                                    this.zzX = 1;
                                                                }
                                                                zzao(zzlwVarZzI2);
                                                            } else {
                                                                zziv zzivVar3 = this.zzh;
                                                                if (zzivVar3.zzb()) {
                                                                    zzbt().zzf = this.zzad;
                                                                    if (this.zzX == 2) {
                                                                        zzivVar3.zza();
                                                                        this.zzX = 1;
                                                                    }
                                                                    this.zzae = true;
                                                                    if (this.zzaa) {
                                                                        if (!this.zzK) {
                                                                            this.zzab = true;
                                                                            zzvjVar3.zza(this.zzO, 0, 0, 0L, 4);
                                                                            zzbm();
                                                                            break;
                                                                        }
                                                                        break;
                                                                    }
                                                                    zzbr();
                                                                    break;
                                                                }
                                                                if (this.zzaa || zzivVar3.zzc()) {
                                                                    long j18 = zzivVar3.zze;
                                                                    if (!zzaX(zzivVar3)) {
                                                                        boolean zZzk = zzivVar3.zzk();
                                                                        if (zZzk) {
                                                                            zzivVar3.zzb.zzc(iPosition);
                                                                        }
                                                                        if (this.zzag) {
                                                                            zzfh zzfhVar = zzbt().zze;
                                                                            zzv zzvVar8 = this.zzo;
                                                                            if (zzvVar8 == null) {
                                                                                throw th2;
                                                                            }
                                                                            zzfhVar.zza(j18, zzvVar8);
                                                                            this.zzag = false;
                                                                        }
                                                                        this.zzad = Math.max(this.zzad, j18);
                                                                        if (zzcW() || zzivVar3.zzd()) {
                                                                            zzbt().zzf = this.zzad;
                                                                        }
                                                                        zzivVar3.zzl();
                                                                        if (zzivVar3.zze()) {
                                                                            zzav(zzivVar3);
                                                                        }
                                                                        if (this.zzal) {
                                                                            long j19 = this.zzad;
                                                                            if (j18 <= j19) {
                                                                                this.zzam += (j19 - j18) + 1;
                                                                            }
                                                                            this.zzad = j18;
                                                                            this.zzal = false;
                                                                        }
                                                                        zzaV(zzivVar3);
                                                                        int iZzaW = zzaW(zzivVar3);
                                                                        long j20 = j18 + this.zzam;
                                                                        if (zZzk) {
                                                                            zzvjVar3.zzb(this.zzO, 0, zzivVar3.zzb, j20, iZzaW);
                                                                        } else {
                                                                            int i17 = this.zzO;
                                                                            ByteBuffer byteBuffer6 = zzivVar3.zzc;
                                                                            if (byteBuffer6 == null) {
                                                                                throw th2;
                                                                            }
                                                                            zzvjVar3.zza(i17, 0, byteBuffer6.limit(), j20, iZzaW);
                                                                        }
                                                                        zzbm();
                                                                        this.zzaa = true;
                                                                        this.zzX = 0;
                                                                        this.zza.zzc++;
                                                                    }
                                                                } else {
                                                                    zzivVar3.zza();
                                                                    if (this.zzX == 2) {
                                                                        this.zzX = 1;
                                                                    }
                                                                }
                                                            }
                                                        } catch (zziu e14) {
                                                            zzan(e14);
                                                            zzaA(0);
                                                            zzay();
                                                        }
                                                    }
                                                } catch (IllegalStateException e15) {
                                                    e = e15;
                                                    r13 = 0;
                                                    z11 = e instanceof MediaCodec.CodecException;
                                                    if (!z11) {
                                                        stackTrace = e.getStackTrace();
                                                        if (stackTrace.length > 0 || !stackTrace[r13].getClassName().equals(obFGmWgqyy.CfViFqx)) {
                                                            throw e;
                                                        }
                                                    }
                                                    zzan(e);
                                                    if (z11 || !((MediaCodec.CodecException) e).isRecoverable()) {
                                                        r10 = r13;
                                                    } else {
                                                        r10 = z10;
                                                    }
                                                    if (r10 != 0) {
                                                        zzaM();
                                                    }
                                                    zzvlVarZzaT = zzaT(e, this.zzE);
                                                    if (zzvlVarZzaT.zza == 1101) {
                                                        i10 = 4006;
                                                    } else {
                                                        i10 = 4003;
                                                    }
                                                    throw zzP(zzvlVarZzaT, this.zzo, r10, i10);
                                                }
                                            }
                                            break;
                                        } while (zzaB(j13));
                                        Trace.endSection();
                                    } else {
                                        this.zza.zzd += zzR(j10);
                                        zzaA(1);
                                    }
                                }
                                this.zza.zza();
                            } catch (IllegalStateException e16) {
                                e = e16;
                                z12 = false;
                            }
                        } catch (IllegalStateException e17) {
                            e = e17;
                        }
                    } catch (MediaCodec.CryptoException e18) {
                        e = e18;
                    }
                } catch (MediaCodec.CryptoException e19) {
                    e = e19;
                    throw zzP(e, this.zzo, r12, zzfl.zzH(e.getErrorCode()));
                } catch (IllegalStateException e20) {
                    e = e20;
                    z11 = e instanceof MediaCodec.CodecException;
                    if (!z11) {
                        stackTrace = e.getStackTrace();
                        if (stackTrace.length > 0) {
                        }
                        throw e;
                    }
                    zzan(e);
                    if (z11) {
                        r10 = r13;
                    } else {
                        r10 = r13;
                    }
                    if (r10 != 0) {
                        zzaM();
                    }
                    zzvlVarZzaT = zzaT(e, this.zzE);
                    if (zzvlVarZzaT.zza == 1101) {
                        i10 = 4006;
                    } else {
                        i10 = 4003;
                    }
                    throw zzP(zzvlVarZzaT, this.zzo, r10, i10);
                }
            } catch (MediaCodec.CryptoException e21) {
                e = e21;
                r12 = 0;
            }
        } catch (IllegalStateException e22) {
            e = e22;
            z10 = true;
        }
    }
}
