package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Trace;
import android.util.Pair;
import android.view.Surface;
import com.facebook.ads.AdError;
import com.google.android.gms.common.Scopes;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.PriorityQueue;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzade extends zzvt implements zzadt {
    private static final int[] zzb = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};
    private static boolean zzc;
    private static boolean zzd;
    private int zzA;
    private long zzB;
    private int zzC;
    private int zzD;
    private int zzE;
    private zznh zzF;
    private long zzG;
    private boolean zzH;
    private long zzI;
    private int zzJ;
    private long zzK;
    private zzbv zzL;
    private zzbv zzM;
    private int zzN;
    private int zzO;
    private zzadr zzP;
    private long zzQ;
    private long zzR;
    private boolean zzS;
    private int zzT;
    private final Context zze;
    private final boolean zzf;
    private final zzaeo zzg;
    private final boolean zzh;
    private final zzadu zzi;
    private final zzads zzj;
    private final zzacn zzk;
    private final long zzl;
    private final zzadv zzm;
    private final PriorityQueue zzn;
    private zzadd zzo;
    private boolean zzp;
    private boolean zzq;
    private zzaeu zzr;
    private boolean zzs;
    private int zzt;
    private List zzu;
    private Surface zzv;
    private zzadg zzw;
    private zzeu zzx;
    private boolean zzy;
    private int zzz;

    protected zzade(zzadc zzadcVar) {
        super(zzadcVar.zze().getApplicationContext(), 2, zzadcVar.zzg(), zzadcVar.zzf(), false, 30.0f);
        Context applicationContext = zzadcVar.zze().getApplicationContext();
        this.zze = applicationContext;
        this.zzr = null;
        this.zzg = new zzaeo(zzadcVar.zzh(), zzadcVar.zzi());
        this.zzf = this.zzr == null;
        this.zzi = new zzadu(applicationContext, this, 0L);
        this.zzj = new zzads();
        this.zzh = "NVIDIA".equals(Build.MANUFACTURER);
        this.zzx = zzeu.zza;
        this.zzz = 1;
        this.zzA = 0;
        this.zzL = zzbv.zza;
        this.zzO = 0;
        this.zzM = null;
        this.zzN = -1000;
        this.zzQ = C.TIME_UNSET;
        this.zzR = C.TIME_UNSET;
        this.zzk = new zzacn();
        this.zzn = new PriorityQueue();
        this.zzl = -15000L;
        this.zzm = new zzadv(1.0f);
        this.zzF = null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:21:0x003f  */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x005c, code lost:
    
        if (r3.equals(com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes.VIDEO_VP8) != false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00a2, code lost:
    
        if (r3.equals(com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes.VIDEO_MP4V) != false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00ba, code lost:
    
        if (r3.equals("video/av01") != false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00c3, code lost:
    
        if (r3.equals(com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes.VIDEO_H263) != false) goto L57;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int zzaw(com.google.android.gms.internal.ads.zzvm r8, com.google.android.gms.internal.ads.zzv r9) {
        /*
            Method dump skipped, instruction units count: 234
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzade.zzaw(com.google.android.gms.internal.ads.zzvm, com.google.android.gms.internal.ads.zzv):int");
    }

    private final void zzbA() {
        zzadg zzadgVar = this.zzw;
        if (zzadgVar != null) {
            zzadgVar.release();
            this.zzw = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzbB, reason: merged with bridge method [inline-methods] */
    public final void zzbo() {
        this.zzg.zzg(this.zzv);
        this.zzy = true;
    }

    private final void zzbC() {
        zzbv zzbvVar = this.zzM;
        if (zzbvVar != null) {
            this.zzg.zzf(zzbvVar);
        }
    }

    protected static int zzbm(zzvm zzvmVar, zzv zzvVar) {
        int i10 = zzvVar.zzq;
        if (i10 == -1) {
            return zzaw(zzvmVar, zzvVar);
        }
        List list = zzvVar.zzs;
        int size = list.size();
        int length = 0;
        for (int i11 = 0; i11 < size; i11++) {
            length += ((byte[]) list.get(i11)).length;
        }
        return i10 + length;
    }

    protected static final boolean zzbr(zzvm zzvmVar) {
        return Build.VERSION.SDK_INT >= 35 && zzvmVar.zzh;
    }

    private static List zzbs(Context context, zzvv zzvvVar, zzv zzvVar, boolean z10, boolean z11) {
        String str = zzvVar.zzp;
        if (str == null) {
            return zzgwm.zzi();
        }
        if (Build.VERSION.SDK_INT >= 26 && "video/dolby-vision".equals(str) && !zzadb.zza(context)) {
            List listZzd = zzwf.zzd(zzvvVar, zzvVar, z10, z11);
            if (!listZzd.isEmpty()) {
                return listZzd;
            }
        }
        return zzwf.zzc(zzvvVar, zzvVar, z10, z11);
    }

    private final void zzbt(zzxk zzxkVar) {
        int iZze;
        zzbf zzbfVarZzN = zzN();
        if (zzbfVarZzN.zzg() || (iZze = zzbfVarZzN.zze(zzxkVar.zza)) == -1) {
            this.zzR = C.TIME_UNSET;
        } else {
            this.zzR = zzbfVarZzN.zzd(iZze, new zzbd(), false).zzd;
        }
    }

    private final void zzbu(Object obj) throws zzjk {
        Surface surface = obj instanceof Surface ? (Surface) obj : null;
        if (this.zzv == surface) {
            if (surface != null) {
                zzbC();
                Surface surface2 = this.zzv;
                if (surface2 == null || !this.zzy) {
                    return;
                }
                this.zzg.zzg(surface2);
                return;
            }
            return;
        }
        this.zzv = surface;
        if (this.zzr == null) {
            this.zzi.zzd(surface);
        }
        this.zzy = false;
        int iZze = zze();
        zzvj zzvjVarZzaI = zzaI();
        if (zzvjVarZzaI != null && this.zzr == null) {
            zzvm zzvmVarZzaL = zzaL();
            zzvmVarZzaL.getClass();
            if (!zzby(zzvmVarZzaL) || this.zzp) {
                zzaM();
                zzaE();
            } else {
                Surface surfaceZzbz = zzbz(zzvmVarZzaL);
                if (surfaceZzbz != null) {
                    zzvjVarZzaI.zzn(surfaceZzbz);
                } else {
                    if (Build.VERSION.SDK_INT < 35) {
                        throw new IllegalStateException();
                    }
                    zzvjVarZzaI.zzo();
                }
            }
        }
        if (surface != null) {
            zzbC();
        } else {
            this.zzM = null;
            zzaeu zzaeuVar = this.zzr;
            if (zzaeuVar != null) {
                zzaeuVar.zzq();
            }
        }
        if (iZze == 2) {
            zzaeu zzaeuVar2 = this.zzr;
            if (zzaeuVar2 != null) {
                zzaeuVar2.zzw(true);
            } else {
                this.zzi.zzj(true);
            }
        }
    }

    private final boolean zzbv(zziv zzivVar) {
        if (zzcW() || zzivVar.zzd() || this.zzR == C.TIME_UNSET) {
            return true;
        }
        return this.zzR - (zzivVar.zze - zzbg()) <= 100000;
    }

    private final boolean zzbw(zziv zzivVar) {
        return zzivVar.zze < zzH();
    }

    private final void zzbx(long j10, long j11, zzv zzvVar) {
        zzadr zzadrVar = this.zzP;
        if (zzadrVar != null) {
            zzadrVar.zzcS(j10, j11, zzvVar, zzaK());
        }
    }

    private final boolean zzby(zzvm zzvmVar) {
        if (this.zzr != null) {
            return true;
        }
        Surface surface = this.zzv;
        return (surface != null && surface.isValid()) || zzbr(zzvmVar) || zzaC(zzvmVar);
    }

    private final Surface zzbz(zzvm zzvmVar) {
        zzaeu zzaeuVar = this.zzr;
        if (zzaeuVar != null) {
            return zzaeuVar.zzk();
        }
        Surface surface = this.zzv;
        if (surface != null) {
            return surface;
        }
        if (zzbr(zzvmVar)) {
            return null;
        }
        zzgtj.zzi(zzaC(zzvmVar));
        zzadg zzadgVar = this.zzw;
        if (zzadgVar != null) {
            if (zzadgVar.zza != zzvmVar.zzf) {
                zzbA();
            }
        }
        if (this.zzw == null) {
            this.zzw = zzadg.zzb(this.zze, zzvmVar.zzf);
        }
        return this.zzw;
    }

    @Override // com.google.android.gms.internal.ads.zzvt, com.google.android.gms.internal.ads.zzix
    protected final void zzA(long j10, boolean z10, boolean z11) throws zzjk {
        zzaeu zzaeuVar = this.zzr;
        if (zzaeuVar != null && !z10) {
            zzaeuVar.zzg(true);
        }
        if (z11) {
            this.zzG = j10;
        }
        super.zzA(j10, z10, z11);
        if (this.zzr == null) {
            this.zzi.zzl();
        }
        zzadv zzadvVar = this.zzm;
        if (zzadvVar != null) {
            zzadvVar.zzd();
        }
        if (z10) {
            zzaeu zzaeuVar2 = this.zzr;
            if (zzaeuVar2 != null) {
                zzaeuVar2.zzw(false);
            } else {
                this.zzi.zzj(false);
            }
        }
        this.zzD = 0;
    }

    @Override // com.google.android.gms.internal.ads.zzix
    protected final void zzB() {
        this.zzC = 0;
        this.zzB = zzM().zzb();
        this.zzI = 0L;
        this.zzJ = 0;
        zzaeu zzaeuVar = this.zzr;
        if (zzaeuVar != null) {
            zzaeuVar.zza();
        } else {
            this.zzi.zzb();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzix
    protected final void zzC() {
        if (this.zzC > 0) {
            long jZzb = zzM().zzb();
            this.zzg.zzd(this.zzC, jZzb - this.zzB);
            this.zzC = 0;
            this.zzB = jZzb;
        }
        int i10 = this.zzJ;
        if (i10 != 0) {
            this.zzg.zze(this.zzI, i10);
            this.zzI = 0L;
            this.zzJ = 0;
        }
        zzaeu zzaeuVar = this.zzr;
        if (zzaeuVar != null) {
            zzaeuVar.zzb();
        } else {
            this.zzi.zzc();
        }
        zzadv zzadvVar = this.zzm;
        if (zzadvVar != null) {
            zzadvVar.zzd();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvt, com.google.android.gms.internal.ads.zzix
    protected final void zzD() {
        this.zzM = null;
        this.zzR = C.TIME_UNSET;
        this.zzy = false;
        this.zzH = true;
        try {
            super.zzD();
        } finally {
            zzaeo zzaeoVar = this.zzg;
            zzaeoVar.zzi(((zzvt) this).zza);
            zzaeoVar.zzf(zzbv.zza);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvt, com.google.android.gms.internal.ads.zzix
    protected final void zzE() {
        try {
            super.zzE();
        } finally {
            this.zzs = false;
            this.zzQ = C.TIME_UNSET;
            zzbA();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzix
    protected final void zzF() {
        zzaeu zzaeuVar = this.zzr;
        if (zzaeuVar == null || !this.zzf) {
            return;
        }
        zzaeuVar.zzx();
    }

    @Override // com.google.android.gms.internal.ads.zzix
    protected final void zzG(zzbf zzbfVar) {
        zzxk zzxkVarZzO = zzO();
        if (zzxkVarZzO != null) {
            zzbt(zzxkVarZzO);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzna, com.google.android.gms.internal.ads.zznc
    public final String zzU() {
        return "MediaCodecVideoRenderer";
    }

    @Override // com.google.android.gms.internal.ads.zzna
    public final boolean zzW(long j10) {
        if (zzbf() == C.TIME_UNSET || j10 < this.zzG) {
            return false;
        }
        long jZzaY = zzaY();
        return jZzaY == C.TIME_UNSET || j10 > jZzaY;
    }

    @Override // com.google.android.gms.internal.ads.zzvt, com.google.android.gms.internal.ads.zzna
    public final void zzX(float f10, float f11) throws zzjk {
        super.zzX(f10, f11);
        zzaeu zzaeuVar = this.zzr;
        if (zzaeuVar != null) {
            zzaeuVar.zzm(f10);
        } else {
            this.zzi.zzn(f10);
        }
        zzadv zzadvVar = this.zzm;
        if (zzadvVar != null) {
            zzadvVar.zzc(f10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzna
    public final void zzY() {
        zzaeu zzaeuVar = this.zzr;
        if (zzaeuVar == null) {
            this.zzi.zzh();
            return;
        }
        int i10 = this.zzt;
        if (i10 == 0 || i10 == 1) {
            this.zzt = 0;
        } else {
            zzaeuVar.zzt();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvt, com.google.android.gms.internal.ads.zzna
    public final void zzZ(long j10, long j11) throws Throwable {
        zzaeu zzaeuVar = this.zzr;
        if (zzaeuVar != null) {
            try {
                zzaeuVar.zzv(j10, j11);
            } catch (zzaet e10) {
                throw zzP(e10, e10.zza, false, AdError.SHOW_CALLED_BEFORE_LOAD_ERROR_CODE);
            }
        }
        super.zzZ(j10, j11);
    }

    protected final void zzaA(long j10) {
        zzjb zzjbVar = ((zzvt) this).zza;
        zzjbVar.zzk += j10;
        zzjbVar.zzl++;
        this.zzI += j10;
        this.zzJ++;
    }

    protected final void zzaB(zzvj zzvjVar, int i10, long j10, long j11) {
        Trace.beginSection("releaseOutputBuffer");
        zzvjVar.zzd(i10, j11);
        Trace.endSection();
        ((zzvt) this).zza.zze++;
        this.zzD = 0;
        if (this.zzr == null) {
            zzbv zzbvVar = this.zzL;
            if (!zzbvVar.equals(zzbv.zza) && !zzbvVar.equals(this.zzM)) {
                this.zzM = zzbvVar;
                this.zzg.zzf(zzbvVar);
            }
            if (!this.zzi.zzf() || this.zzv == null) {
                return;
            }
            zzbo();
        }
    }

    protected final boolean zzaC(zzvm zzvmVar) {
        if (zzbq(zzvmVar.zza)) {
            return false;
        }
        return !zzvmVar.zzf || zzadg.zza(this.zze);
    }

    @Override // com.google.android.gms.internal.ads.zzvt
    protected final boolean zzaG(zzvm zzvmVar) {
        return zzby(zzvmVar);
    }

    @Override // com.google.android.gms.internal.ads.zzvt
    protected final boolean zzaO() {
        zzvm zzvmVarZzaL = zzaL();
        if (this.zzr != null && zzvmVarZzaL != null) {
            String str = zzvmVarZzaL.zza;
            if (str.equals("c2.mtk.avc.decoder") || str.equals("c2.mtk.hevc.decoder")) {
                return true;
            }
        }
        return super.zzaO();
    }

    /* JADX WARN: Code duplicated, block: B:6:0x002a  */
    @Override // com.google.android.gms.internal.ads.zzvt
    protected final boolean zzaP() {
        boolean z10;
        zzv zzvVarZzaJ = zzaJ();
        long j10 = this.zzR;
        if (j10 != C.TIME_UNSET) {
            if (zzaQ() + j10 + 1 > Long.MAX_VALUE - (zzbg() + this.zzR)) {
                z10 = true;
            } else {
                z10 = false;
            }
        } else {
            z10 = true;
        }
        return this.zzF == null || this.zzH || (zzvVarZzaJ != null && zzvVarZzaJ.zzr > 0) || z10 || zzbe() != C.TIME_UNSET;
    }

    @Override // com.google.android.gms.internal.ads.zzvt
    protected final void zzaR() {
        super.zzaR();
        this.zzn.clear();
        this.zzE = 0;
        this.zzT = 0;
        this.zzH = false;
        zzacn zzacnVar = this.zzk;
        if (zzacnVar != null) {
            zzacnVar.zzc();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvt
    protected final zzvl zzaT(Throwable th2, zzvm zzvmVar) {
        return new zzacy(th2, zzvmVar, this.zzv);
    }

    @Override // com.google.android.gms.internal.ads.zzvt
    protected final boolean zzaU(zzv zzvVar) throws zzjk {
        zzaeu zzaeuVar = this.zzr;
        if (zzaeuVar == null || zzaeuVar.zze()) {
            return true;
        }
        try {
            zzaeuVar.zzd(zzvVar);
            return true;
        } catch (zzaet e10) {
            throw zzP(e10, zzvVar, false, 7000);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvt
    protected final void zzaV(zziv zzivVar) {
        ByteBuffer byteBuffer;
        zzacn zzacnVar = this.zzk;
        if (zzacnVar != null) {
            zzvm zzvmVarZzaL = zzaL();
            zzvmVarZzaL.getClass();
            if (zzvmVarZzaL.zzb.equals("video/av01") && zzivVar.zzc() && (byteBuffer = zzivVar.zzc) != null) {
                zzacnVar.zzb(byteBuffer);
            }
        }
        this.zzT = 0;
        int iZzaW = zzaW(zzivVar);
        if (Build.VERSION.SDK_INT < 34 || (iZzaW & 32) == 0) {
            this.zzE++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvt
    protected final int zzaW(zziv zzivVar) {
        return (Build.VERSION.SDK_INT < 34 || this.zzF == null || !zzbw(zzivVar) || zzbv(zzivVar)) ? 0 : 32;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0028  */
    /* JADX WARN: Code duplicated, block: B:45:0x0098 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:46:0x009a  */
    /* JADX WARN: Code duplicated, block: B:48:0x00a2  */
    @Override // com.google.android.gms.internal.ads.zzvt
    protected final boolean zzaX(zziv zzivVar) {
        boolean z10;
        ByteBuffer byteBuffer;
        boolean z11 = false;
        if (zzbv(zzivVar)) {
            return false;
        }
        boolean zZzbw = zzbw(zzivVar);
        zzadv zzadvVar = this.zzm;
        if (zzadvVar != null) {
            long jZzb = zzadvVar.zzb(zzivVar.zze);
            if (jZzb == C.TIME_UNSET || jZzb >= this.zzl) {
                z10 = false;
            } else {
                z10 = true;
            }
        } else {
            z10 = false;
        }
        if ((!zZzbw && !z10) || zzivVar.zze()) {
            return false;
        }
        if (!zzivVar.zzf()) {
            zzacn zzacnVar = this.zzk;
            if (zzacnVar != null) {
                zzvm zzvmVarZzaL = zzaL();
                zzvmVarZzaL.getClass();
                if (zzvmVarZzaL.zzb.equals("video/av01") && (byteBuffer = zzivVar.zzc) != null) {
                    boolean z12 = zZzbw || this.zzT <= 0;
                    ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
                    byteBufferAsReadOnlyBuffer.flip();
                    int iZza = zzacnVar.zza(byteBufferAsReadOnlyBuffer, z12);
                    if (iZza == 0) {
                        zzivVar.zza();
                    } else if (iZza != byteBufferAsReadOnlyBuffer.limit()) {
                        zzadd zzaddVar = this.zzo;
                        zzaddVar.getClass();
                        if (zzaddVar.zzc + iZza < byteBufferAsReadOnlyBuffer.capacity() && !zzivVar.zzk()) {
                            ByteBuffer byteBuffer2 = zzivVar.zzc;
                            byteBuffer2.getClass();
                            byteBuffer2.position(iZza);
                        }
                    }
                }
            }
            if (z11) {
                if (zZzbw) {
                    ((zzvt) this).zza.zzd++;
                    return z11;
                }
                this.zzn.add(Long.valueOf(zzivVar.zze));
                this.zzT++;
            }
            return z11;
        }
        zzivVar.zza();
        z11 = true;
        if (z11) {
            if (zZzbw) {
                ((zzvt) this).zza.zzd++;
                return z11;
            }
            this.zzn.add(Long.valueOf(zzivVar.zze));
            this.zzT++;
        }
        return z11;
    }

    @Override // com.google.android.gms.internal.ads.zzvt
    protected final void zzaZ(long j10) {
        super.zzaZ(j10);
        this.zzE--;
    }

    @Override // com.google.android.gms.internal.ads.zzvt, com.google.android.gms.internal.ads.zzna
    public final boolean zzaa() {
        boolean zZzba = zzba();
        zzaeu zzaeuVar = this.zzr;
        if (zzaeuVar != null) {
            return zzaeuVar.zzh(zZzba);
        }
        if (zZzba && zzaI() == null) {
            return true;
        }
        return this.zzi.zzi(zZzba);
    }

    @Override // com.google.android.gms.internal.ads.zzvt, com.google.android.gms.internal.ads.zzna
    public final boolean zzab() {
        if (!super.zzab()) {
            return false;
        }
        zzaeu zzaeuVar = this.zzr;
        return zzaeuVar == null || zzaeuVar.zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzvt
    protected final int zzae(zzvv zzvvVar, zzv zzvVar) {
        boolean z10;
        String str = zzvVar.zzp;
        if (!zzas.zzb(str)) {
            return 128;
        }
        Context context = this.zze;
        int i10 = 0;
        boolean z11 = zzvVar.zzt != null;
        List listZzbs = zzbs(context, zzvvVar, zzvVar, z11, false);
        if (z11 && listZzbs.isEmpty()) {
            listZzbs = zzbs(context, zzvvVar, zzvVar, false, false);
        }
        if (listZzbs.isEmpty()) {
            return 129;
        }
        if (!zzvt.zzbj(zzvVar)) {
            return 130;
        }
        zzvm zzvmVar = (zzvm) listZzbs.get(0);
        boolean zZzc = zzvmVar.zzc(context, zzvVar);
        if (!zZzc) {
            int i11 = 1;
            while (true) {
                if (i11 >= listZzbs.size()) {
                    z10 = true;
                    break;
                }
                zzvm zzvmVar2 = (zzvm) listZzbs.get(i11);
                if (zzvmVar2.zzc(context, zzvVar)) {
                    zZzc = true;
                    z10 = false;
                    zzvmVar = zzvmVar2;
                    break;
                }
                i11++;
            }
        } else {
            z10 = true;
            break;
        }
        int i12 = true != zZzc ? 3 : 4;
        int i13 = true != zzvmVar.zze(zzvVar) ? 8 : 16;
        int i14 = true != zzvmVar.zzg ? 0 : 64;
        int i15 = true != z10 ? 0 : 128;
        if (Build.VERSION.SDK_INT >= 26 && "video/dolby-vision".equals(str) && !zzadb.zza(context)) {
            i15 = 256;
        }
        if (zZzc) {
            List listZzbs2 = zzbs(context, zzvvVar, zzvVar, z11, true);
            if (!listZzbs2.isEmpty()) {
                zzvm zzvmVar3 = (zzvm) zzwf.zze(context, listZzbs2, zzvVar).get(0);
                if (zzvmVar3.zzc(context, zzvVar) && zzvmVar3.zze(zzvVar)) {
                    i10 = 32;
                }
            }
        }
        return i12 | i13 | i10 | i14 | i15;
    }

    @Override // com.google.android.gms.internal.ads.zzvt
    protected final List zzaf(zzvv zzvvVar, zzv zzvVar, boolean z10) {
        Context context = this.zze;
        return zzwf.zze(context, zzbs(context, zzvvVar, zzvVar, false, false), zzvVar);
    }

    @Override // com.google.android.gms.internal.ads.zzvt
    protected final zzvg zzah(zzvm zzvmVar, zzv zzvVar, MediaCrypto mediaCrypto, float f10) {
        int i10;
        zzadd zzaddVar;
        Point pointZzi;
        int i11;
        zzv[] zzvVarArr;
        byte b10;
        boolean z10;
        Pair pairZze;
        int iZzaw;
        zzv[] zzvVarArrZzJ = zzJ();
        int length = zzvVarArrZzJ.length;
        int iZzbm = zzbm(zzvmVar, zzvVar);
        int i12 = zzvVar.zzx;
        int i13 = zzvVar.zzw;
        if (length == 1) {
            if (iZzbm != -1 && (iZzaw = zzaw(zzvmVar, zzvVar)) != -1) {
                iZzbm = Math.min((int) (iZzbm * 1.5f), iZzaw);
            }
            zzaddVar = new zzadd(i13, i12, iZzbm);
            i10 = 35;
        } else {
            int iMax = i12;
            int iMax2 = i13;
            int i14 = 0;
            boolean z11 = false;
            i10 = 35;
            while (i14 < length) {
                zzv zzvVarZzO = zzvVarArrZzJ[i14];
                zzi zziVar = zzvVar.zzF;
                if (zziVar != null && zzvVarZzO.zzF == null) {
                    zzt zztVarZza = zzvVarZzO.zza();
                    zztVarZza.zzE(zziVar);
                    zzvVarZzO = zztVarZza.zzO();
                }
                if (zzvmVar.zzf(zzvVar, zzvVarZzO).zzd != 0) {
                    int i15 = zzvVarZzO.zzw;
                    b10 = -1;
                    if (i15 != -1) {
                        zzvVarArr = zzvVarArrZzJ;
                        if (zzvVarZzO.zzx != -1) {
                            z10 = false;
                        }
                        z11 |= z10;
                        iMax2 = Math.max(iMax2, i15);
                        iMax = Math.max(iMax, zzvVarZzO.zzx);
                        iZzbm = Math.max(iZzbm, zzbm(zzvmVar, zzvVarZzO));
                    } else {
                        zzvVarArr = zzvVarArrZzJ;
                    }
                    z10 = true;
                    z11 |= z10;
                    iMax2 = Math.max(iMax2, i15);
                    iMax = Math.max(iMax, zzvVarZzO.zzx);
                    iZzbm = Math.max(iZzbm, zzbm(zzvmVar, zzvVarZzO));
                } else {
                    zzvVarArr = zzvVarArrZzJ;
                    b10 = -1;
                }
                i14++;
                zzvVarArrZzJ = zzvVarArr;
            }
            if (z11) {
                StringBuilder sb2 = new StringBuilder(String.valueOf(iMax2).length() + 44 + String.valueOf(iMax).length());
                sb2.append("Resolutions unknown. Codec max resolution: ");
                sb2.append(iMax2);
                sb2.append("x");
                sb2.append(iMax);
                zzeg.zzc("MediaCodecVideoRenderer", sb2.toString());
                boolean z12 = i12 > i13;
                int i16 = z12 ? i12 : i13;
                int i17 = true != z12 ? i12 : i13;
                int[] iArr = zzb;
                int i18 = 0;
                while (true) {
                    if (i18 < 9) {
                        float f11 = i17;
                        float f12 = i16;
                        int i19 = iArr[i18];
                        int i20 = i18;
                        float f13 = i19;
                        if (i19 > i16 && (i11 = (int) (f13 * (f11 / f12))) > i17) {
                            int i21 = i16;
                            int i22 = true != z12 ? i19 : i11;
                            if (true != z12) {
                                i19 = i11;
                            }
                            pointZzi = zzvmVar.zzi(i22, i19);
                            float f14 = zzvVar.zzA;
                            if (pointZzi != null) {
                                if (zzvmVar.zzg(pointZzi.x, pointZzi.y, f14)) {
                                    break;
                                }
                            }
                            i18 = i20 + 1;
                            i16 = i21;
                            i17 = i17;
                            z12 = z12;
                        }
                    }
                    pointZzi = null;
                    break;
                }
                if (pointZzi != null) {
                    iMax2 = Math.max(iMax2, pointZzi.x);
                    iMax = Math.max(iMax, pointZzi.y);
                    zzt zztVarZza2 = zzvVar.zza();
                    zztVarZza2.zzv(iMax2);
                    zztVarZza2.zzw(iMax);
                    iZzbm = Math.max(iZzbm, zzaw(zzvmVar, zztVarZza2.zzO()));
                    StringBuilder sb3 = new StringBuilder(String.valueOf(iMax2).length() + 35 + String.valueOf(iMax).length());
                    sb3.append("Codec max resolution adjusted to: ");
                    sb3.append(iMax2);
                    sb3.append("x");
                    sb3.append(iMax);
                    zzeg.zzc("MediaCodecVideoRenderer", sb3.toString());
                }
            }
            zzaddVar = new zzadd(iMax2, iMax, iZzbm);
        }
        String str = zzvmVar.zzc;
        this.zzo = zzaddVar;
        boolean z13 = this.zzh;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("width", i13);
        mediaFormat.setInteger("height", i12);
        zzej.zza(mediaFormat, zzvVar.zzs);
        float f15 = zzvVar.zzA;
        if (f15 != -1.0f) {
            mediaFormat.setFloat("frame-rate", f15);
        }
        zzej.zzb(mediaFormat, "rotation-degrees", zzvVar.zzB);
        zzi zziVar2 = zzvVar.zzF;
        if (zziVar2 != null) {
            zzej.zzb(mediaFormat, "color-transfer", zziVar2.zzd);
            zzej.zzb(mediaFormat, "color-standard", zziVar2.zzb);
            zzej.zzb(mediaFormat, "color-range", zziVar2.zzc);
            byte[] bArr = zziVar2.zze;
            if (bArr != null) {
                mediaFormat.setByteBuffer("hdr-static-info", ByteBuffer.wrap(bArr));
            }
        }
        if ("video/dolby-vision".equals(zzvVar.zzp) && (pairZze = zzdq.zze(zzvVar)) != null) {
            zzej.zzb(mediaFormat, Scopes.PROFILE, ((Integer) pairZze.first).intValue());
        }
        mediaFormat.setInteger("max-width", zzaddVar.zza);
        mediaFormat.setInteger("max-height", zzaddVar.zzb);
        zzej.zzb(mediaFormat, "max-input-size", zzaddVar.zzc);
        mediaFormat.setInteger("priority", 0);
        if (f10 != -1.0f) {
            mediaFormat.setFloat("operating-rate", f10);
        }
        if (z13) {
            mediaFormat.setInteger("no-post-process", 1);
            mediaFormat.setInteger("auto-frc", 0);
        }
        if (Build.VERSION.SDK_INT >= i10) {
            mediaFormat.setInteger("importance", Math.max(0, -this.zzN));
        }
        zzbi(mediaFormat);
        Surface surfaceZzbz = zzbz(zzvmVar);
        if (this.zzr != null && !zzfl.zzU(this.zze)) {
            mediaFormat.setInteger("allow-frame-drop", 0);
        }
        return zzvg.zzb(zzvmVar, mediaFormat, zzvVar, surfaceZzbz, null);
    }

    @Override // com.google.android.gms.internal.ads.zzvt
    protected final zzjc zzai(zzvm zzvmVar, zzv zzvVar, zzv zzvVar2) {
        int i10;
        int i11;
        int i12;
        zzjc zzjcVarZzf = zzvmVar.zzf(zzvVar, zzvVar2);
        int i13 = zzjcVarZzf.zze;
        zzadd zzaddVar = this.zzo;
        zzaddVar.getClass();
        if (zzvVar2.zzw > zzaddVar.zza || zzvVar2.zzx > zzaddVar.zzb) {
            i13 |= 256;
        }
        if (zzbm(zzvmVar, zzvVar2) > zzaddVar.zzc) {
            i13 |= 64;
        }
        if (this.zzA != Integer.MIN_VALUE) {
            float f10 = zzvVar.zzA;
            if (f10 != -1.0f) {
                float f11 = zzvVar2.zzA;
                if (f11 != -1.0f && Math.abs(f11 - f10) > 1.0f && ((i12 = Build.VERSION.SDK_INT) < 30 || (i12 == 30 && Build.MODEL.startsWith("MiTV")))) {
                    i13 |= C.DEFAULT_BUFFER_SEGMENT_SIZE;
                }
            }
        }
        String str = zzvmVar.zza;
        if (i13 != 0) {
            i11 = 0;
            i10 = i13;
        } else {
            i10 = 0;
            i11 = zzjcVarZzf.zzd;
        }
        return new zzjc(str, zzvVar, zzvVar2, i11, i10);
    }

    @Override // com.google.android.gms.internal.ads.zzvt
    protected final float zzak(float f10, zzv zzvVar, zzv[] zzvVarArr) {
        zzvm zzvmVarZzaL;
        float fMax = -1.0f;
        for (zzv zzvVar2 : zzvVarArr) {
            float f11 = zzvVar2.zzA;
            if (f11 != -1.0f) {
                fMax = Math.max(fMax, f11);
            }
        }
        float f12 = fMax == -1.0f ? -1.0f : fMax * f10;
        if (this.zzF == null || (zzvmVarZzaL = zzaL()) == null) {
            return f12;
        }
        float fZzh = zzvmVarZzaL.zzh(zzvVar.zzw, zzvVar.zzx);
        return f12 != -1.0f ? Math.max(f12, fZzh) : fZzh;
    }

    @Override // com.google.android.gms.internal.ads.zzvt
    protected final void zzal(String str, zzvg zzvgVar, long j10, long j11) {
        this.zzg.zzb(str, j10, j11);
        this.zzp = zzbq(str);
        zzvm zzvmVarZzaL = zzaL();
        zzvmVarZzaL.getClass();
        boolean z10 = false;
        if (Build.VERSION.SDK_INT >= 29 && MimeTypes.VIDEO_VP9.equals(zzvmVarZzaL.zzb)) {
            for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : zzvmVarZzaL.zzb()) {
                if (codecProfileLevel.profile == 16384) {
                    z10 = true;
                    break;
                }
            }
        }
        this.zzq = z10;
    }

    @Override // com.google.android.gms.internal.ads.zzvt
    protected final void zzam(String str) {
        this.zzg.zzh(str);
    }

    @Override // com.google.android.gms.internal.ads.zzvt
    protected final void zzan(Exception exc) {
        zzeg.zzf("MediaCodecVideoRenderer", "Video codec error", exc);
        this.zzg.zzj(exc);
    }

    @Override // com.google.android.gms.internal.ads.zzvt
    protected final zzjc zzao(zzlw zzlwVar) throws zzjk {
        zzjc zzjcVarZzao = super.zzao(zzlwVar);
        zzv zzvVar = zzlwVar.zzb;
        zzvVar.getClass();
        this.zzg.zzc(zzvVar, zzjcVarZzao);
        zzadv zzadvVar = this.zzm;
        if (zzadvVar != null) {
            zzadvVar.zzd();
        }
        return zzjcVarZzao;
    }

    @Override // com.google.android.gms.internal.ads.zzvt
    protected final void zzap(zzv zzvVar, MediaFormat mediaFormat) {
        zzvj zzvjVarZzaI = zzaI();
        if (zzvjVarZzaI != null) {
            zzvjVarZzaI.zzq(this.zzz);
        }
        mediaFormat.getClass();
        boolean z10 = mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top");
        int integer = z10 ? (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1 : mediaFormat.getInteger("width");
        int integer2 = z10 ? (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1 : mediaFormat.getInteger("height");
        float f10 = zzvVar.zzC;
        int i10 = zzvVar.zzB;
        if (i10 == 90 || i10 == 270) {
            f10 = 1.0f / f10;
            int i11 = integer2;
            integer2 = integer;
            integer = i11;
        }
        this.zzL = new zzbv(integer, integer2, f10);
        zzaeu zzaeuVar = this.zzr;
        if (zzaeuVar == null || !this.zzS) {
            this.zzi.zze(zzvVar.zzA);
        } else {
            zzt zztVarZza = zzvVar.zza();
            zztVarZza.zzv(integer);
            zztVarZza.zzw(integer2);
            zztVarZza.zzB(f10);
            zzv zzvVarZzO = zztVarZza.zzO();
            int i12 = this.zzt;
            List listZzi = this.zzu;
            if (listZzi == null) {
                listZzi = zzgwm.zzi();
            }
            zzaeuVar.zzs(1, zzvVarZzO, zzbh(), i12, listZzi);
            this.zzt = 2;
        }
        this.zzS = false;
    }

    @Override // com.google.android.gms.internal.ads.zzadt
    public final boolean zzaq(long j10, long j11, long j12, boolean z10, boolean z11) throws zzjk {
        int iZzR;
        if (this.zzr != null && this.zzf) {
            j11 -= -this.zzQ;
        }
        if (j10 >= -500000 || z10 || (iZzR = zzR(j11)) == 0) {
            return false;
        }
        this.zzG = j11;
        if (z11) {
            zzjb zzjbVar = ((zzvt) this).zza;
            int i10 = zzjbVar.zzd + iZzR;
            zzjbVar.zzd = i10;
            zzjbVar.zzf += this.zzE;
            zzjbVar.zzd = i10 + this.zzn.size();
        } else {
            ((zzvt) this).zza.zzj++;
            zzaz(iZzR + this.zzn.size(), this.zzE);
        }
        zzaN();
        zzaeu zzaeuVar = this.zzr;
        if (zzaeuVar != null) {
            zzaeuVar.zzg(false);
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzvt
    protected final void zzar() {
        zzaeu zzaeuVar = this.zzr;
        if (zzaeuVar != null) {
            zzaeuVar.zzi();
            long jZzbh = this.zzQ;
            if (jZzbh == C.TIME_UNSET) {
                jZzbh = zzbh();
                this.zzQ = jZzbh;
            }
            this.zzr.zzo(-jZzbh);
        } else {
            this.zzi.zza(2);
        }
        this.zzS = true;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0077 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:25:0x0079  */
    /* JADX WARN: Code duplicated, block: B:27:0x007c  */
    /* JADX WARN: Code duplicated, block: B:30:0x0080  */
    /* JADX WARN: Code duplicated, block: B:32:0x008d  */
    /* JADX WARN: Code duplicated, block: B:34:0x009a  */
    /* JADX WARN: Code duplicated, block: B:36:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:37:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:40:0x00d0  */
    @Override // com.google.android.gms.internal.ads.zzvt
    protected final boolean zzas(long j10, long j11, zzvj zzvjVar, ByteBuffer byteBuffer, int i10, int i11, int i12, long j12, boolean z10, boolean z11, zzv zzvVar) {
        long jZzb;
        zzade zzadeVar;
        long j13;
        zzvjVar.getClass();
        long jZzbg = j12 - zzbg();
        int i13 = 0;
        while (true) {
            PriorityQueue priorityQueue = this.zzn;
            Long l10 = (Long) priorityQueue.peek();
            if (l10 == null || l10.longValue() >= j12) {
                break;
            }
            priorityQueue.poll();
            i13++;
        }
        zzaz(i13, 0);
        zzaeu zzaeuVar = this.zzr;
        if (zzaeuVar != null) {
            if (!z10 || z11) {
                return zzaeuVar.zzu(j12, new zzada(this, zzvjVar, i10, jZzbg));
            }
            zzax(zzvjVar, i10, jZzbg);
            return true;
        }
        zzadu zzaduVar = this.zzi;
        long jZzbh = zzbh();
        zzads zzadsVar = this.zzj;
        int iZzk = zzaduVar.zzk(j12, j10, j11, jZzbh, z10, z11, zzadsVar);
        zzadv zzadvVar = this.zzm;
        if (zzadvVar == null) {
            if (iZzk != 0) {
                long jZzc = zzM().zzc();
                zzbx(jZzbg, jZzc, zzvVar);
                zzaB(zzvjVar, i10, jZzbg, jZzc);
                zzaA(zzadsVar.zza());
                return true;
            }
            if (iZzk != 1) {
                jZzb = zzadsVar.zzb();
                long jZza = zzadsVar.zza();
                if (jZzb == this.zzK) {
                    zzax(zzvjVar, i10, jZzbg);
                    j13 = jZzb;
                    zzadeVar = this;
                } else {
                    zzbx(jZzbg, jZzb, zzvVar);
                    zzaB(zzvjVar, i10, jZzbg, jZzb);
                    zzadeVar = this;
                    j13 = jZzb;
                }
                zzadeVar.zzaA(jZza);
                zzadeVar.zzK = j13;
                return true;
            }
            if (iZzk != 2) {
                zzay(zzvjVar, i10, jZzbg);
                zzaA(zzadsVar.zza());
                return true;
            }
            if (iZzk == 3) {
                zzax(zzvjVar, i10, jZzbg);
                zzaA(zzadsVar.zza());
                return true;
            }
        } else if (iZzk != 5 && iZzk != 4) {
            zzadvVar.zza(j12, zzadsVar.zza());
            if (iZzk != 0) {
                long jZzc2 = zzM().zzc();
                zzbx(jZzbg, jZzc2, zzvVar);
                zzaB(zzvjVar, i10, jZzbg, jZzc2);
                zzaA(zzadsVar.zza());
                return true;
            }
            if (iZzk != 1) {
                jZzb = zzadsVar.zzb();
                long jZza2 = zzadsVar.zza();
                if (jZzb == this.zzK) {
                    zzax(zzvjVar, i10, jZzbg);
                    j13 = jZzb;
                    zzadeVar = this;
                } else {
                    zzbx(jZzbg, jZzb, zzvVar);
                    zzaB(zzvjVar, i10, jZzbg, jZzb);
                    zzadeVar = this;
                    j13 = jZzb;
                }
                zzadeVar.zzaA(jZza2);
                zzadeVar.zzK = j13;
                return true;
            }
            if (iZzk != 2) {
                zzay(zzvjVar, i10, jZzbg);
                zzaA(zzadsVar.zza());
                return true;
            }
            if (iZzk == 3) {
                zzax(zzvjVar, i10, jZzbg);
                zzaA(zzadsVar.zza());
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzvt
    protected final void zzat(zziz zzizVar) {
        this.zzg.zzk(zzizVar);
    }

    @Override // com.google.android.gms.internal.ads.zzvt
    protected final void zzau() {
        zzaeu zzaeuVar = this.zzr;
        if (zzaeuVar != null) {
            zzaeuVar.zzi();
        } else if (zzbe() != C.TIME_UNSET) {
            zzbe();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvt
    protected final void zzav(zziv zzivVar) {
        if (this.zzq) {
            ByteBuffer byteBuffer = zzivVar.zzf;
            byteBuffer.getClass();
            if (byteBuffer.remaining() >= 7) {
                byte b10 = byteBuffer.get();
                short s10 = byteBuffer.getShort();
                short s11 = byteBuffer.getShort();
                byte b11 = byteBuffer.get();
                byte b12 = byteBuffer.get();
                byteBuffer.position(0);
                if (b10 == -75 && s10 == 60 && s11 == 1 && b11 == 4) {
                    if (b12 == 0 || b12 == 1) {
                        byte[] bArr = new byte[byteBuffer.remaining()];
                        byteBuffer.get(bArr);
                        byteBuffer.position(0);
                        zzvj zzvjVarZzaI = zzaI();
                        zzvjVarZzaI.getClass();
                        Bundle bundle = new Bundle();
                        bundle.putByteArray("hdr10-plus-info", bArr);
                        zzvjVarZzaI.zzp(bundle);
                    }
                }
            }
        }
    }

    protected final void zzax(zzvj zzvjVar, int i10, long j10) {
        Trace.beginSection("skipVideoBuffer");
        zzvjVar.zzc(i10, false);
        Trace.endSection();
        ((zzvt) this).zza.zzf++;
    }

    protected final void zzay(zzvj zzvjVar, int i10, long j10) {
        Trace.beginSection("dropVideoBuffer");
        zzvjVar.zzc(i10, false);
        Trace.endSection();
        zzaz(0, 1);
    }

    protected final void zzaz(int i10, int i11) {
        zzjb zzjbVar = ((zzvt) this).zza;
        zzjbVar.zzh += i10;
        int i12 = i10 + i11;
        zzjbVar.zzg += i12;
        this.zzC += i12;
        int i13 = this.zzD + i12;
        this.zzD = i13;
        zzjbVar.zzi = Math.max(i13, zzjbVar.zzi);
    }

    final /* synthetic */ Surface zzbp() {
        return this.zzv;
    }

    @Override // com.google.android.gms.internal.ads.zzvt, com.google.android.gms.internal.ads.zzix, com.google.android.gms.internal.ads.zzmv
    public final void zzx(int i10, Object obj) throws zzjk {
        if (i10 == 1) {
            zzbu(obj);
            return;
        }
        if (i10 == 7) {
            obj.getClass();
            zzadr zzadrVar = (zzadr) obj;
            this.zzP = zzadrVar;
            zzaeu zzaeuVar = this.zzr;
            if (zzaeuVar != null) {
                zzaeuVar.zzl(zzadrVar);
                return;
            }
            return;
        }
        if (i10 == 10) {
            obj.getClass();
            int iIntValue = ((Integer) obj).intValue();
            if (this.zzO != iIntValue) {
                this.zzO = iIntValue;
                return;
            }
            return;
        }
        if (i10 == 4) {
            obj.getClass();
            int iIntValue2 = ((Integer) obj).intValue();
            this.zzz = iIntValue2;
            zzvj zzvjVarZzaI = zzaI();
            if (zzvjVarZzaI != null) {
                zzvjVarZzaI.zzq(iIntValue2);
                return;
            }
            return;
        }
        if (i10 == 5) {
            obj.getClass();
            int iIntValue3 = ((Integer) obj).intValue();
            this.zzA = iIntValue3;
            zzaeu zzaeuVar2 = this.zzr;
            if (zzaeuVar2 != null) {
                zzaeuVar2.zzr(iIntValue3);
                return;
            } else {
                this.zzi.zzm(iIntValue3);
                return;
            }
        }
        if (i10 == 13) {
            obj.getClass();
            List list = (List) obj;
            if (list.equals(zzbr.zza)) {
                zzaeu zzaeuVar3 = this.zzr;
                if (zzaeuVar3 == null || !zzaeuVar3.zze()) {
                    return;
                }
                zzaeuVar3.zzf();
                return;
            }
            this.zzu = list;
            zzaeu zzaeuVar4 = this.zzr;
            if (zzaeuVar4 != null) {
                zzaeuVar4.zzn(list);
                return;
            }
            return;
        }
        if (i10 == 14) {
            obj.getClass();
            zzeu zzeuVar = (zzeu) obj;
            if (zzeuVar.zza() == 0 || zzeuVar.zzb() == 0) {
                return;
            }
            this.zzx = zzeuVar;
            zzaeu zzaeuVar5 = this.zzr;
            if (zzaeuVar5 != null) {
                Surface surface = this.zzv;
                surface.getClass();
                zzaeuVar5.zzp(surface, zzeuVar);
                return;
            }
            return;
        }
        switch (i10) {
            case 16:
                obj.getClass();
                this.zzN = ((Integer) obj).intValue();
                zzvj zzvjVarZzaI2 = zzaI();
                if (zzvjVarZzaI2 != null && Build.VERSION.SDK_INT >= 35) {
                    Bundle bundle = new Bundle();
                    bundle.putInt("importance", Math.max(0, -this.zzN));
                    zzvjVarZzaI2.zzp(bundle);
                    break;
                }
                break;
            case 17:
                Surface surface2 = this.zzv;
                zzbu(null);
                obj.getClass();
                ((zzade) obj).zzx(1, surface2);
                break;
            case 18:
                boolean z10 = this.zzF != null;
                zznh zznhVar = (zznh) obj;
                this.zzF = zznhVar;
                if (z10 != (zznhVar != null)) {
                    zzbd();
                }
                break;
            default:
                super.zzx(i10, obj);
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvt, com.google.android.gms.internal.ads.zzix
    protected final void zzy(boolean z10, boolean z11) {
        super.zzy(z10, z11);
        zzK();
        this.zzg.zza(((zzvt) this).zza);
        if (!this.zzs) {
            if (this.zzu != null && this.zzr == null) {
                zzadi zzadiVar = new zzadi(this.zze, this.zzi);
                zzadiVar.zza(true);
                zzadiVar.zzc(-this.zzl);
                zzadiVar.zzb(zzM());
                zzadq zzadqVarZzd = zzadiVar.zzd();
                zzadqVarZzd.zza(1);
                this.zzr = zzadqVarZzd.zzb(0);
            }
            this.zzs = true;
        }
        int i10 = !z11 ? 1 : 0;
        zzaeu zzaeuVar = this.zzr;
        if (zzaeuVar == null) {
            zzadu zzaduVar = this.zzi;
            zzaduVar.zzg(zzM());
            zzaduVar.zza(i10);
            return;
        }
        zzaeuVar.zzc(new zzacz(this), zzhcn.zza());
        zzadr zzadrVar = this.zzP;
        if (zzadrVar != null) {
            this.zzr.zzl(zzadrVar);
        }
        if (this.zzv != null && !this.zzx.equals(zzeu.zza)) {
            this.zzr.zzp(this.zzv, this.zzx);
        }
        this.zzr.zzr(this.zzA);
        this.zzr.zzm(zzbb());
        List list = this.zzu;
        if (list != null) {
            this.zzr.zzn(list);
        }
        this.zzt = i10;
        zzaD();
    }

    @Override // com.google.android.gms.internal.ads.zzvt, com.google.android.gms.internal.ads.zzix
    protected final void zzz(zzv[] zzvVarArr, long j10, long j11, zzxk zzxkVar) {
        super.zzz(zzvVarArr, j10, j11, zzxkVar);
        zzbt(zzxkVar);
        zzadv zzadvVar = this.zzm;
        if (zzadvVar != null) {
            zzadvVar.zzd();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:102:0x0131  */
    /* JADX WARN: Code duplicated, block: B:105:0x013b  */
    /* JADX WARN: Code duplicated, block: B:108:0x0145  */
    /* JADX WARN: Code duplicated, block: B:111:0x014f  */
    /* JADX WARN: Code duplicated, block: B:114:0x0159  */
    /* JADX WARN: Code duplicated, block: B:117:0x0163  */
    /* JADX WARN: Code duplicated, block: B:120:0x016d  */
    /* JADX WARN: Code duplicated, block: B:123:0x0177  */
    /* JADX WARN: Code duplicated, block: B:126:0x0181  */
    /* JADX WARN: Code duplicated, block: B:129:0x018b  */
    /* JADX WARN: Code duplicated, block: B:132:0x0195  */
    /* JADX WARN: Code duplicated, block: B:135:0x019f  */
    /* JADX WARN: Code duplicated, block: B:138:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:141:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:144:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:147:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:150:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:153:0x01db  */
    /* JADX WARN: Code duplicated, block: B:156:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:159:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:162:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:165:0x0203  */
    /* JADX WARN: Code duplicated, block: B:168:0x020d  */
    /* JADX WARN: Code duplicated, block: B:171:0x0217  */
    /* JADX WARN: Code duplicated, block: B:174:0x0221  */
    /* JADX WARN: Code duplicated, block: B:177:0x022b  */
    /* JADX WARN: Code duplicated, block: B:180:0x0235  */
    /* JADX WARN: Code duplicated, block: B:183:0x023f  */
    /* JADX WARN: Code duplicated, block: B:186:0x0249  */
    /* JADX WARN: Code duplicated, block: B:189:0x0253  */
    /* JADX WARN: Code duplicated, block: B:192:0x025e  */
    /* JADX WARN: Code duplicated, block: B:195:0x0268  */
    /* JADX WARN: Code duplicated, block: B:198:0x0272  */
    /* JADX WARN: Code duplicated, block: B:201:0x027c  */
    /* JADX WARN: Code duplicated, block: B:204:0x0286  */
    /* JADX WARN: Code duplicated, block: B:207:0x0290  */
    /* JADX WARN: Code duplicated, block: B:210:0x029a  */
    /* JADX WARN: Code duplicated, block: B:213:0x02a4  */
    /* JADX WARN: Code duplicated, block: B:216:0x02ae  */
    /* JADX WARN: Code duplicated, block: B:219:0x02b8  */
    /* JADX WARN: Code duplicated, block: B:222:0x02c2  */
    /* JADX WARN: Code duplicated, block: B:225:0x02cc  */
    /* JADX WARN: Code duplicated, block: B:228:0x02d6  */
    /* JADX WARN: Code duplicated, block: B:231:0x02e0  */
    /* JADX WARN: Code duplicated, block: B:234:0x02ea  */
    /* JADX WARN: Code duplicated, block: B:237:0x02f4  */
    /* JADX WARN: Code duplicated, block: B:240:0x02fe  */
    /* JADX WARN: Code duplicated, block: B:243:0x0308  */
    /* JADX WARN: Code duplicated, block: B:246:0x0312  */
    /* JADX WARN: Code duplicated, block: B:249:0x031c  */
    /* JADX WARN: Code duplicated, block: B:252:0x0326  */
    /* JADX WARN: Code duplicated, block: B:255:0x0330  */
    /* JADX WARN: Code duplicated, block: B:258:0x033a  */
    /* JADX WARN: Code duplicated, block: B:261:0x0344  */
    /* JADX WARN: Code duplicated, block: B:264:0x034f  */
    /* JADX WARN: Code duplicated, block: B:267:0x0359  */
    /* JADX WARN: Code duplicated, block: B:270:0x0363  */
    /* JADX WARN: Code duplicated, block: B:273:0x036d  */
    /* JADX WARN: Code duplicated, block: B:276:0x0377  */
    /* JADX WARN: Code duplicated, block: B:279:0x0381  */
    /* JADX WARN: Code duplicated, block: B:282:0x038b  */
    /* JADX WARN: Code duplicated, block: B:285:0x0395  */
    /* JADX WARN: Code duplicated, block: B:288:0x039f  */
    /* JADX WARN: Code duplicated, block: B:291:0x03a9  */
    /* JADX WARN: Code duplicated, block: B:294:0x03b3  */
    /* JADX WARN: Code duplicated, block: B:297:0x03bd  */
    /* JADX WARN: Code duplicated, block: B:300:0x03c7  */
    /* JADX WARN: Code duplicated, block: B:303:0x03d1  */
    /* JADX WARN: Code duplicated, block: B:306:0x03db  */
    /* JADX WARN: Code duplicated, block: B:309:0x03e5  */
    /* JADX WARN: Code duplicated, block: B:312:0x03ef  */
    /* JADX WARN: Code duplicated, block: B:315:0x03f9  */
    /* JADX WARN: Code duplicated, block: B:318:0x0403  */
    /* JADX WARN: Code duplicated, block: B:321:0x040d  */
    /* JADX WARN: Code duplicated, block: B:324:0x0417  */
    /* JADX WARN: Code duplicated, block: B:327:0x0421  */
    /* JADX WARN: Code duplicated, block: B:330:0x042b  */
    /* JADX WARN: Code duplicated, block: B:333:0x0435  */
    /* JADX WARN: Code duplicated, block: B:336:0x043f  */
    /* JADX WARN: Code duplicated, block: B:339:0x044a  */
    /* JADX WARN: Code duplicated, block: B:342:0x0454  */
    /* JADX WARN: Code duplicated, block: B:345:0x045e  */
    /* JADX WARN: Code duplicated, block: B:348:0x0468  */
    /* JADX WARN: Code duplicated, block: B:351:0x0472  */
    /* JADX WARN: Code duplicated, block: B:354:0x047c  */
    /* JADX WARN: Code duplicated, block: B:357:0x0486  */
    /* JADX WARN: Code duplicated, block: B:360:0x0490  */
    /* JADX WARN: Code duplicated, block: B:363:0x049a  */
    /* JADX WARN: Code duplicated, block: B:366:0x04a4  */
    /* JADX WARN: Code duplicated, block: B:369:0x04ae  */
    /* JADX WARN: Code duplicated, block: B:372:0x04b8  */
    /* JADX WARN: Code duplicated, block: B:375:0x04c2  */
    /* JADX WARN: Code duplicated, block: B:378:0x04cc  */
    /* JADX WARN: Code duplicated, block: B:381:0x04d6  */
    /* JADX WARN: Code duplicated, block: B:384:0x04e0  */
    /* JADX WARN: Code duplicated, block: B:387:0x04ea  */
    /* JADX WARN: Code duplicated, block: B:38:0x006b  */
    /* JADX WARN: Code duplicated, block: B:390:0x04f4  */
    /* JADX WARN: Code duplicated, block: B:393:0x04fe  */
    /* JADX WARN: Code duplicated, block: B:396:0x0508  */
    /* JADX WARN: Code duplicated, block: B:399:0x0512  */
    /* JADX WARN: Code duplicated, block: B:402:0x051c  */
    /* JADX WARN: Code duplicated, block: B:405:0x0526  */
    /* JADX WARN: Code duplicated, block: B:408:0x0530  */
    /* JADX WARN: Code duplicated, block: B:411:0x053a  */
    /* JADX WARN: Code duplicated, block: B:414:0x0544  */
    /* JADX WARN: Code duplicated, block: B:417:0x054e  */
    /* JADX WARN: Code duplicated, block: B:41:0x0071  */
    /* JADX WARN: Code duplicated, block: B:420:0x0558  */
    /* JADX WARN: Code duplicated, block: B:423:0x0562  */
    /* JADX WARN: Code duplicated, block: B:426:0x056c  */
    /* JADX WARN: Code duplicated, block: B:429:0x0576  */
    /* JADX WARN: Code duplicated, block: B:432:0x0580  */
    /* JADX WARN: Code duplicated, block: B:435:0x058a  */
    /* JADX WARN: Code duplicated, block: B:438:0x0594  */
    /* JADX WARN: Code duplicated, block: B:43:0x0075 A[Catch: all -> 0x006e, TRY_ENTER, TryCatch #0 {, blocks: (B:7:0x000d, B:509:0x0674, B:10:0x0013, B:12:0x001a, B:508:0x0670, B:43:0x0075, B:46:0x0080, B:78:0x00e0, B:501:0x065c), top: B:514:0x000d }] */
    /* JADX WARN: Code duplicated, block: B:441:0x059e  */
    /* JADX WARN: Code duplicated, block: B:444:0x05a8  */
    /* JADX WARN: Code duplicated, block: B:447:0x05b2  */
    /* JADX WARN: Code duplicated, block: B:450:0x05bc  */
    /* JADX WARN: Code duplicated, block: B:453:0x05c6  */
    /* JADX WARN: Code duplicated, block: B:456:0x05d0  */
    /* JADX WARN: Code duplicated, block: B:459:0x05da  */
    /* JADX WARN: Code duplicated, block: B:462:0x05e4  */
    /* JADX WARN: Code duplicated, block: B:465:0x05ee  */
    /* JADX WARN: Code duplicated, block: B:468:0x05f8  */
    /* JADX WARN: Code duplicated, block: B:46:0x0080 A[Catch: all -> 0x006e, TRY_LEAVE, TryCatch #0 {, blocks: (B:7:0x000d, B:509:0x0674, B:10:0x0013, B:12:0x001a, B:508:0x0670, B:43:0x0075, B:46:0x0080, B:78:0x00e0, B:501:0x065c), top: B:514:0x000d }] */
    /* JADX WARN: Code duplicated, block: B:471:0x0601  */
    /* JADX WARN: Code duplicated, block: B:474:0x060a  */
    /* JADX WARN: Code duplicated, block: B:477:0x0613  */
    /* JADX WARN: Code duplicated, block: B:480:0x061c  */
    /* JADX WARN: Code duplicated, block: B:483:0x0625  */
    /* JADX WARN: Code duplicated, block: B:486:0x062e  */
    /* JADX WARN: Code duplicated, block: B:489:0x0637  */
    /* JADX WARN: Code duplicated, block: B:492:0x0640  */
    /* JADX WARN: Code duplicated, block: B:495:0x0649  */
    /* JADX WARN: Code duplicated, block: B:498:0x0652  */
    /* JADX WARN: Code duplicated, block: B:49:0x008a  */
    /* JADX WARN: Code duplicated, block: B:501:0x065c A[Catch: all -> 0x006e, TRY_ENTER, TRY_LEAVE, TryCatch #0 {, blocks: (B:7:0x000d, B:509:0x0674, B:10:0x0013, B:12:0x001a, B:508:0x0670, B:43:0x0075, B:46:0x0080, B:78:0x00e0, B:501:0x065c), top: B:514:0x000d }] */
    /* JADX WARN: Code duplicated, block: B:505:0x0666  */
    /* JADX WARN: Code duplicated, block: B:52:0x0093  */
    /* JADX WARN: Code duplicated, block: B:55:0x009d  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:61:0x00af  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:67:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:70:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:76:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:78:0x00e0 A[Catch: all -> 0x006e, TRY_ENTER, TRY_LEAVE, TryCatch #0 {, blocks: (B:7:0x000d, B:509:0x0674, B:10:0x0013, B:12:0x001a, B:508:0x0670, B:43:0x0075, B:46:0x0080, B:78:0x00e0, B:501:0x065c), top: B:514:0x000d }] */
    /* JADX WARN: Code duplicated, block: B:81:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:84:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:87:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:90:0x0109  */
    /* JADX WARN: Code duplicated, block: B:93:0x0113  */
    /* JADX WARN: Code duplicated, block: B:96:0x011d  */
    /* JADX WARN: Code duplicated, block: B:99:0x0127  */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:324:0x0417
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    protected static final boolean zzbq(java.lang.String r5) {
        /*
            Method dump skipped, instruction units count: 2292
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzade.zzbq(java.lang.String):boolean");
    }
}
