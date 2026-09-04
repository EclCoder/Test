package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.view.Surface;
import com.bytedance.sdk.openadsdk.api.reward.BackupConstant;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzlh extends zzf implements zzjv {
    public static final /* synthetic */ int zzd = 0;
    private final long zzA;
    private final zzdm zzB;
    private final zzfc zzC;
    private final zzlg zzD;
    private final zzjx zzE;
    private final zzjx zzF;
    private int zzG;
    private int zzH;
    private boolean zzI;
    private zznh zzJ;
    private zzni zzK;
    private zzju zzL;
    private zzax zzM;
    private zzan zzN;
    private Object zzO;
    private Surface zzP;
    private int zzQ;
    private zzeu zzR;
    private zzd zzS;
    private float zzT;
    private boolean zzU;
    private boolean zzV;
    private boolean zzW;
    private int zzX;
    private boolean zzY;
    private zzan zzZ;
    private zzms zzaa;
    private int zzab;
    private long zzac;
    private zzzf zzad;
    final zzabi zzb;
    final zzax zzc;
    private final zzds zze = new zzds(zzdo.zza);
    private final Context zzf;
    private final zzbb zzg;
    private final zzna[] zzh;
    private final zzna[] zzi;
    private final zzabh zzj;
    private final zzdz zzk;
    private final zzls zzl;
    private final zzlu zzm;
    private final zzef zzn;
    private final CopyOnWriteArraySet zzo;
    private final zzbd zzp;
    private final List zzq;
    private final boolean zzr;
    private final zznm zzs;
    private final Looper zzt;
    private final zzabq zzu;
    private final zzdo zzv;
    private final zzkd zzw;
    private final zzlc zzx;
    private final zzfr zzy;
    private final zzfs zzz;

    static {
        zzal.zzb("media3.exoplayer");
    }

    public zzlh(zzjt zzjtVar, zzbb zzbbVar) {
        try {
            String hexString = Integer.toHexString(System.identityHashCode(this));
            String str = zzfl.zza;
            StringBuilder sb2 = new StringBuilder(String.valueOf(hexString).length() + 36 + String.valueOf(str).length() + 1);
            sb2.append("Init ");
            sb2.append(hexString);
            sb2.append(" [AndroidXMedia3/1.10.0-rc02] [");
            sb2.append(str);
            sb2.append("]");
            zzeg.zzb("ExoPlayerImpl", sb2.toString());
            this.zzf = zzjtVar.zza.getApplicationContext();
            this.zzs = (zznm) zzjtVar.zzh.apply(zzjtVar.zzb);
            this.zzX = zzjtVar.zzj;
            this.zzS = zzjtVar.zzk;
            this.zzQ = zzjtVar.zzl;
            this.zzU = false;
            this.zzA = zzjtVar.zzq;
            zzkd zzkdVar = new zzkd(this, null);
            this.zzw = zzkdVar;
            this.zzx = new zzlc(null);
            zzna[] zznaVarArrZza = ((zznf) zzjtVar.zzc.zza()).zza(new Handler(zzjtVar.zzi), zzkdVar, zzkdVar, zzkdVar, zzkdVar);
            this.zzh = zznaVarArrZza;
            int length = zznaVarArrZza.length;
            this.zzi = new zzna[2];
            int i10 = 0;
            while (true) {
                zzna[] zznaVarArr = this.zzi;
                int length2 = zznaVarArr.length;
                if (i10 >= 2) {
                    break;
                }
                zzna zznaVar = this.zzh[i10];
                zznaVarArr[i10] = null;
                i10++;
            }
            zzabh zzabhVar = (zzabh) zzjtVar.zze.zza();
            this.zzj = zzabhVar;
            zzabq zzabqVar = (zzabq) zzjtVar.zzg.zza();
            this.zzu = zzabqVar;
            this.zzr = zzjtVar.zzm;
            this.zzK = zzjtVar.zzn;
            this.zzJ = zzjtVar.zzo;
            Looper looper = zzjtVar.zzi;
            this.zzt = looper;
            zzdo zzdoVar = zzjtVar.zzb;
            this.zzv = zzdoVar;
            this.zzg = zzbbVar;
            this.zzn = new zzef(looper, zzdoVar, new zzeb() { // from class: com.google.android.gms.internal.ads.zzlb
                @Override // com.google.android.gms.internal.ads.zzeb
                public final /* synthetic */ void zza(Object obj, zzs zzsVar) {
                    this.zza.zzJ((zzaz) obj, zzsVar);
                }
            });
            CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet();
            this.zzo = copyOnWriteArraySet;
            this.zzq = new ArrayList();
            this.zzad = new zzzf(0);
            this.zzL = zzju.zza;
            int length3 = this.zzh.length;
            zzabi zzabiVar = new zzabi(new zznd[2], new zzaba[2], zzbn.zza, null);
            this.zzb = zzabiVar;
            this.zzp = new zzbd();
            zzaw zzawVar = new zzaw();
            zzawVar.zzc(1, 2, 3, 13, 14, 15, 16, 17, 18, 19, 31, 20, 30, 21, 35, 22, 24, 27, 28, 32);
            zzabhVar.zzd();
            zzawVar.zzb(29, true);
            zzawVar.zzb(23, false);
            zzawVar.zzb(25, false);
            zzawVar.zzb(33, false);
            zzawVar.zzb(26, false);
            zzawVar.zzb(34, false);
            zzax zzaxVarZze = zzawVar.zze();
            this.zzc = zzaxVarZze;
            zzaw zzawVar2 = new zzaw();
            zzawVar2.zzd(zzaxVarZze);
            zzawVar2.zza(4);
            zzawVar2.zza(10);
            this.zzM = zzawVar2.zze();
            this.zzk = zzdoVar.zzd(looper, null);
            zzls zzlsVar = new zzls() { // from class: com.google.android.gms.internal.ads.zzke
                @Override // com.google.android.gms.internal.ads.zzls
                public final /* synthetic */ void zza(zzlr zzlrVar) {
                    this.zza.zzK(zzlrVar);
                }
            };
            this.zzl = zzlsVar;
            this.zzaa = zzms.zza(zzabiVar);
            this.zzs.zzx(zzbbVar, looper);
            final zzqf zzqfVar = new zzqf(zzjtVar.zzx);
            zzlu zzluVar = new zzlu(this.zzf, this.zzh, this.zzi, zzabhVar, zzabiVar, (zzly) zzjtVar.zzf.zza(), zzabqVar, 0, false, this.zzs, this.zzK, zzjtVar.zzz, zzjtVar.zzp, false, false, looper, zzdoVar, zzlsVar, zzqfVar, null, this.zzL, this.zzx, zzjtVar.zzy);
            this.zzm = zzluVar;
            Looper looperZzn = zzluVar.zzn();
            this.zzT = 1.0f;
            zzan zzanVar = zzan.zza;
            this.zzN = zzanVar;
            this.zzZ = zzanVar;
            this.zzab = -1;
            int i11 = zzcz.zza;
            this.zzV = true;
            zze(this.zzs);
            zzabqVar.zzf(new Handler(looper), this.zzs);
            copyOnWriteArraySet.add(this.zzw);
            int i12 = Build.VERSION.SDK_INT;
            if (i12 >= 31) {
                final Context context = this.zzf;
                final boolean z10 = zzjtVar.zzv;
                zzdoVar.zzd(zzluVar.zzn(), null).zzm(new Runnable() { // from class: com.google.android.gms.internal.ads.zzjw
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        zzqb zzqbVarZza = zzqb.zza(context);
                        if (zzqbVarZza == null) {
                            zzeg.zzc("ExoPlayerImpl", "MediaMetricsService unavailable.");
                            return;
                        }
                        if (z10) {
                            this.zzD(zzqbVarZza);
                        }
                        zzqfVar.zzb(zzqbVarZza.zzb());
                    }
                });
            }
            zzdm zzdmVar = new zzdm(0, looperZzn, looper, zzdoVar, new zzdl() { // from class: com.google.android.gms.internal.ads.zzkp
                @Override // com.google.android.gms.internal.ads.zzdl
                public final /* synthetic */ void zza(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    this.zza.zzL(((Integer) obj).intValue(), iIntValue);
                }
            });
            this.zzB = zzdmVar;
            zzdmVar.zzd(new Runnable() { // from class: com.google.android.gms.internal.ads.zzku
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzM();
                }
            });
            new zzbz(zzjtVar.zza, looperZzn, zzjtVar.zzi, this.zzw, zzdoVar);
            boolean z11 = (zzjtVar.zzs == Integer.MAX_VALUE || zzjtVar.zzt == Integer.MAX_VALUE) ? false : true;
            zzfr zzfrVar = new zzfr(zzjtVar.zza, looperZzn, zzdoVar);
            this.zzy = zzfrVar;
            zzfrVar.zza(z11);
            this.zzz = new zzfs(zzjtVar.zza, looperZzn, zzdoVar);
            int i13 = zzm.zza;
            zzbv zzbvVar = zzbv.zza;
            this.zzR = zzeu.zza;
            this.zzD = i12 >= 34 ? new zzlg(this, zzjtVar.zza, null) : null;
            this.zzE = new zzjx(this, 1, null);
            this.zzF = new zzjx(this, 2, null);
            this.zzC = new zzfc(this, this.zzw, zzdoVar, zzjtVar.zzr, zzjtVar.zzs, zzjtVar.zzt, zzjtVar.zzu);
            zzluVar.zzg(this.zzJ);
            zzluVar.zzi(this.zzS, false);
            zzau(1, 3, this.zzS);
            zzau(2, 4, Integer.valueOf(this.zzQ));
            zzau(2, 5, 0);
            zzau(1, 9, Boolean.valueOf(this.zzU));
            zzau(6, 8, this.zzx);
            zzau(-1, 16, Integer.valueOf(this.zzX));
        } finally {
            this.zze.zza();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzaf, reason: merged with bridge method [inline-methods] */
    public final void zzP(zzjk zzjkVar) {
        zzms zzmsVar = this.zzaa;
        zzms zzmsVarZzh = zzmsVar.zzh(zzmsVar.zzb);
        zzmsVarZzh.zzq = zzmsVarZzh.zzs;
        zzmsVarZzh.zzr = 0L;
        zzms zzmsVarZzam = zzam(zzmsVarZzh, 1);
        if (zzjkVar != null) {
            zzmsVarZzam = zzmsVarZzam.zzf(zzjkVar);
        }
        this.zzG++;
        this.zzm.zzh();
        zzaj(zzmsVarZzam, 0, false, 5, C.TIME_UNSET, -1, false);
    }

    private final int zzag(zzms zzmsVar) {
        zzbf zzbfVar = zzmsVar.zza;
        return zzbfVar.zzg() ? this.zzab : zzbfVar.zzo(zzmsVar.zzb.zza, this.zzp).zzc;
    }

    private final long zzah(zzms zzmsVar) {
        zzxk zzxkVar = zzmsVar.zzb;
        if (!zzxkVar.zzb()) {
            return zzfl.zzr(zzai(zzmsVar));
        }
        zzbf zzbfVar = zzmsVar.zza;
        zzbfVar.zzo(zzxkVar.zza, this.zzp);
        long j10 = zzmsVar.zzc;
        if (j10 != C.TIME_UNSET) {
            return zzfl.zzr(0L) + zzfl.zzr(j10);
        }
        long j11 = zzbfVar.zzb(zzag(zzmsVar), this.zza, 0L).zzl;
        return zzfl.zzr(0L);
    }

    private final long zzai(zzms zzmsVar) {
        zzbf zzbfVar = zzmsVar.zza;
        if (zzbfVar.zzg()) {
            return zzfl.zzs(this.zzac);
        }
        long j10 = zzmsVar.zzs;
        zzxk zzxkVar = zzmsVar.zzb;
        if (zzxkVar.zzb()) {
            return j10;
        }
        zzao(zzbfVar, zzxkVar, j10);
        return j10;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0286  */
    /* JADX WARN: Code duplicated, block: B:103:0x02a0  */
    /* JADX WARN: Code duplicated, block: B:104:0x02ad  */
    /* JADX WARN: Code duplicated, block: B:106:0x02cf  */
    /* JADX WARN: Code duplicated, block: B:108:0x02d8  */
    /* JADX WARN: Code duplicated, block: B:109:0x02e4  */
    /* JADX WARN: Code duplicated, block: B:112:0x02ed  */
    /* JADX WARN: Code duplicated, block: B:114:0x02f9  */
    /* JADX WARN: Code duplicated, block: B:117:0x0307  */
    /* JADX WARN: Code duplicated, block: B:119:0x031b  */
    /* JADX WARN: Code duplicated, block: B:121:0x032b  */
    /* JADX WARN: Code duplicated, block: B:124:0x033b  */
    /* JADX WARN: Code duplicated, block: B:127:0x0349  */
    /* JADX WARN: Code duplicated, block: B:132:0x035c  */
    /* JADX WARN: Code duplicated, block: B:135:0x036d  */
    /* JADX WARN: Code duplicated, block: B:138:0x0382  */
    /* JADX WARN: Code duplicated, block: B:141:0x0398  */
    /* JADX WARN: Code duplicated, block: B:144:0x03bb  */
    /* JADX WARN: Code duplicated, block: B:146:0x03cd  */
    /* JADX WARN: Code duplicated, block: B:148:0x03d1  */
    /* JADX WARN: Code duplicated, block: B:151:0x03de  */
    /* JADX WARN: Code duplicated, block: B:152:0x03e3  */
    /* JADX WARN: Code duplicated, block: B:154:0x03f5  */
    /* JADX WARN: Code duplicated, block: B:155:0x03f8  */
    /* JADX WARN: Code duplicated, block: B:158:0x0404  */
    /* JADX WARN: Code duplicated, block: B:159:0x0406  */
    /* JADX WARN: Code duplicated, block: B:161:0x0416  */
    /* JADX WARN: Code duplicated, block: B:164:0x0421  */
    /* JADX WARN: Code duplicated, block: B:166:0x0433  */
    /* JADX WARN: Code duplicated, block: B:168:0x0437  */
    /* JADX WARN: Code duplicated, block: B:171:0x0444  */
    /* JADX WARN: Code duplicated, block: B:174:0x0454  */
    /* JADX WARN: Code duplicated, block: B:177:0x046c A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:179:0x0470  */
    /* JADX WARN: Code duplicated, block: B:182:0x0476 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:184:0x047a  */
    /* JADX WARN: Code duplicated, block: B:187:0x0480 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:191:0x0487  */
    /* JADX WARN: Code duplicated, block: B:196:0x0491 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:198:0x0495  */
    /* JADX WARN: Code duplicated, block: B:201:0x049d A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:205:0x04a4  */
    /* JADX WARN: Code duplicated, block: B:210:0x04b5 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:212:0x04bb  */
    /* JADX WARN: Code duplicated, block: B:215:0x04c3 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:217:0x04c9  */
    /* JADX WARN: Code duplicated, block: B:220:0x04db  */
    /* JADX WARN: Code duplicated, block: B:39:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:41:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:42:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:44:0x0105  */
    /* JADX WARN: Code duplicated, block: B:48:0x0112  */
    /* JADX WARN: Code duplicated, block: B:51:0x0122  */
    /* JADX WARN: Code duplicated, block: B:54:0x0130 A[LOOP:1: B:52:0x012a->B:54:0x0130, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:59:0x014f  */
    /* JADX WARN: Code duplicated, block: B:60:0x0152  */
    /* JADX WARN: Code duplicated, block: B:63:0x017d  */
    /* JADX WARN: Code duplicated, block: B:64:0x017f  */
    /* JADX WARN: Code duplicated, block: B:67:0x0187  */
    /* JADX WARN: Code duplicated, block: B:68:0x0189  */
    /* JADX WARN: Code duplicated, block: B:71:0x018f  */
    /* JADX WARN: Code duplicated, block: B:74:0x0198  */
    /* JADX WARN: Code duplicated, block: B:75:0x019a  */
    /* JADX WARN: Code duplicated, block: B:77:0x019e  */
    /* JADX WARN: Code duplicated, block: B:79:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:81:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:82:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:84:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:86:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:87:0x0206  */
    /* JADX WARN: Code duplicated, block: B:89:0x020b  */
    /* JADX WARN: Code duplicated, block: B:91:0x0213  */
    /* JADX WARN: Code duplicated, block: B:92:0x0216  */
    /* JADX WARN: Code duplicated, block: B:94:0x021e  */
    /* JADX WARN: Code duplicated, block: B:95:0x0225  */
    /* JADX WARN: Code duplicated, block: B:98:0x0255  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v11 */
    /* JADX WARN: Type inference failed for: r15v19 */
    /* JADX WARN: Type inference failed for: r15v6 */
    /* JADX WARN: Type inference failed for: r15v7, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v6, types: [com.google.android.gms.internal.ads.zzbf] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v0, types: [com.google.android.gms.internal.ads.zzbf] */
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
    private final void zzaj(final zzms zzmsVar, final int i10, boolean z10, int i11, long j10, int i12, boolean z11) {
        int i13;
        int i14;
        final int i15;
        boolean z12;
        Pair pair;
        boolean z13;
        boolean z14;
        int i16;
        boolean zBooleanValue;
        final int iIntValue;
        final zzak zzakVar;
        zzam zzamVarZza;
        List list;
        int i17;
        zzap zzapVar;
        int i18;
        zzbf zzbfVarZzq;
        zzan zzanVarZzw;
        boolean zEquals;
        int i19;
        int i20;
        int i21;
        zzjk zzjkVar;
        zzjk zzjkVar2;
        zzabi zzabiVar;
        zzabi zzabiVar2;
        zzax zzaxVar;
        zzbb zzbbVar;
        zzf zzfVar;
        zzbf zzbfVarZzq2;
        zzbb zzbbVar2;
        boolean z15;
        zzbf zzbfVarZzq3;
        ?? r15;
        int iZzi;
        int i22;
        boolean z16;
        ?? Zzq;
        int iZzs;
        ?? r10;
        zzbf zzbfVarZzq4;
        long j11;
        zzbf zzbfVarZzq5;
        boolean z17;
        boolean zZzg;
        boolean z18;
        boolean z19;
        boolean z20;
        boolean z21;
        boolean z22;
        int i23;
        boolean z23;
        int i24;
        boolean z24;
        zzax zzaxVarZze;
        zzef zzefVar;
        zzbd zzbdVar;
        int i25;
        int i26;
        Object obj;
        zzak zzakVar2;
        Object obj2;
        long jZzak;
        long jZzak2;
        int iZzs2;
        int iZzr;
        Object obj3;
        zzak zzakVar3;
        Object obj4;
        long jZzr;
        long jZzr2;
        zzxk zzxkVar;
        int i27 = i11;
        zzms zzmsVar2 = this.zzaa;
        this.zzaa = zzmsVar;
        ?? r11 = zzmsVar2.zza;
        zzbf zzbfVar = zzmsVar.zza;
        boolean zEquals2 = r11.equals(zzbfVar);
        if (!zzbfVar.zzg() || !r11.zzg()) {
            i13 = 3;
            if (zzbfVar.zzg() != r11.zzg()) {
                pair = new Pair(Boolean.TRUE, 3);
            } else {
                zzxk zzxkVar2 = zzmsVar2.zzb;
                Object obj5 = zzxkVar2.zza;
                zzbd zzbdVar2 = this.zzp;
                int i28 = r11.zzo(obj5, zzbdVar2).zzc;
                zzbe zzbeVar = this.zza;
                Object obj6 = r11.zzb(i28, zzbeVar, 0L).zzb;
                i14 = 0;
                zzxk zzxkVar3 = zzmsVar.zzb;
                if (obj6.equals(zzbfVar.zzb(zzbfVar.zzo(zzxkVar3.zza, zzbdVar2).zzc, zzbeVar, 0L).zzb)) {
                    if (z10) {
                        if (i27 != 0) {
                            i15 = i27;
                        } else if (zzxkVar2.zzd < zzxkVar3.zzd) {
                            pair = new Pair(Boolean.TRUE, 0);
                            i15 = 0;
                            z12 = true;
                        } else {
                            i15 = 0;
                        }
                        z12 = true;
                    } else {
                        i15 = i27;
                        z12 = false;
                    }
                    pair = new Pair(Boolean.FALSE, -1);
                } else {
                    if (z10) {
                        if (i27 == 0) {
                            i27 = 0;
                            i16 = 1;
                            z14 = true;
                        } else {
                            z13 = true;
                            z14 = true;
                        }
                        pair = new Pair(Boolean.TRUE, Integer.valueOf(i16));
                        i15 = i27;
                        z12 = z14;
                    } else {
                        z13 = false;
                        z14 = false;
                    }
                    if (z13 && i27 == 1) {
                        i16 = 2;
                    } else {
                        if (zEquals2) {
                            throw new IllegalStateException();
                        }
                        i16 = 3;
                    }
                    pair = new Pair(Boolean.TRUE, Integer.valueOf(i16));
                    i15 = i27;
                    z12 = z14;
                }
            }
            zBooleanValue = ((Boolean) pair.first).booleanValue();
            iIntValue = ((Integer) pair.second).intValue();
            if (zBooleanValue) {
                if (zzbfVar.zzg()) {
                    zzakVar = null;
                } else {
                    zzakVar = zzbfVar.zzb(zzbfVar.zzo(zzmsVar.zzb.zza, this.zzp).zzc, this.zza, 0L).zzd;
                }
                this.zzZ = zzan.zza;
            } else {
                zzakVar = null;
            }
            if (zBooleanValue || !zzmsVar2.zzj.equals(zzmsVar.zzj)) {
                zzamVarZza = this.zzZ.zza();
                list = zzmsVar.zzj;
                for (i17 = i14; i17 < list.size(); i17++) {
                    zzapVar = (zzap) list.get(i17);
                    for (i18 = i14; i18 < zzapVar.zza(); i18++) {
                        zzapVar.zzb(i18).zza(zzamVarZza);
                    }
                }
                this.zzZ = zzamVarZza.zzw();
            }
            zzbfVarZzq = zzq();
            if (zzbfVarZzq.zzg()) {
                zzanVarZzw = this.zzZ;
            } else {
                zzak zzakVar4 = zzbfVarZzq.zzb(zzs(), this.zza, 0L).zzd;
                zzam zzamVarZza2 = this.zzZ.zza();
                zzamVarZza2.zzv(zzakVar4.zzd);
                zzanVarZzw = zzamVarZza2.zzw();
            }
            zEquals = zzanVarZzw.equals(this.zzN);
            this.zzN = zzanVarZzw;
            if (zzmsVar2.zzl != zzmsVar.zzl) {
                i19 = 1;
            } else {
                i19 = i14;
            }
            if (zzmsVar2.zze != zzmsVar.zze) {
                i20 = 1;
            } else {
                i20 = i14;
            }
            if (i20 == 0 || i19 != 0) {
                zzas();
            }
            if (zzmsVar2.zzg != zzmsVar.zzg) {
                i21 = 1;
            } else {
                i21 = i14;
            }
            if (!zEquals2) {
                this.zzn.zze(i14, new zzea() { // from class: com.google.android.gms.internal.ads.zzkx
                    @Override // com.google.android.gms.internal.ads.zzea
                    public final /* synthetic */ void zza(Object obj7) {
                        int i29 = zzlh.zzd;
                        ((zzaz) obj7).zzb(zzmsVar.zza, i10);
                    }
                });
            }
            if (z12) {
                zzbdVar = new zzbd();
                if (r11.zzg()) {
                    i25 = i12;
                    i26 = i25;
                    obj = null;
                    zzakVar2 = null;
                    obj2 = null;
                } else {
                    Object obj7 = zzmsVar2.zzb.zza;
                    r11.zzo(obj7, zzbdVar);
                    int i29 = zzbdVar.zzc;
                    int iZze = r11.zze(obj7);
                    zzbe zzbeVar2 = this.zza;
                    obj = r11.zzb(i29, zzbeVar2, 0L).zzb;
                    zzakVar2 = zzbeVar2.zzd;
                    obj2 = obj7;
                    i25 = i29;
                    i26 = iZze;
                }
                if (i15 == 0) {
                    zzxkVar = zzmsVar2.zzb;
                    if (zzxkVar.zzb()) {
                        jZzak = zzbdVar.zzh(zzxkVar.zzb, zzxkVar.zzc);
                        jZzak2 = zzak(zzmsVar2);
                    } else {
                        if (zzxkVar.zze != -1) {
                            jZzak = zzak(this.zzaa);
                        } else {
                            jZzak = zzbdVar.zzd;
                        }
                        jZzak2 = jZzak;
                    }
                } else if (zzmsVar2.zzb.zzb()) {
                    jZzak = zzmsVar2.zzs;
                    jZzak2 = zzak(zzmsVar2);
                } else {
                    jZzak = zzmsVar2.zzs;
                    jZzak2 = jZzak;
                }
                String str = zzfl.zza;
                zzxk zzxkVar4 = zzmsVar2.zzb;
                final zzba zzbaVar = new zzba(obj, i25, zzakVar2, obj2, i26, zzfl.zzr(jZzak), zzfl.zzr(jZzak2), zzxkVar4.zzb, zzxkVar4.zzc);
                iZzs2 = zzs();
                iZzr = zzr();
                if (this.zzaa.zza.zzg()) {
                    obj3 = null;
                    zzakVar3 = null;
                    obj4 = null;
                } else {
                    zzms zzmsVar3 = this.zzaa;
                    Object obj8 = zzmsVar3.zzb.zza;
                    zzmsVar3.zza.zzo(obj8, this.zzp);
                    iZzr = this.zzaa.zza.zze(obj8);
                    zzbf zzbfVar2 = this.zzaa.zza;
                    zzbe zzbeVar3 = this.zza;
                    obj4 = obj8;
                    obj3 = zzbfVar2.zzb(iZzs2, zzbeVar3, 0L).zzb;
                    zzakVar3 = zzbeVar3.zzd;
                }
                int i30 = iZzr;
                jZzr = zzfl.zzr(j10);
                if (this.zzaa.zzb.zzb()) {
                    jZzr2 = zzfl.zzr(zzak(this.zzaa));
                } else {
                    jZzr2 = jZzr;
                }
                zzxk zzxkVar5 = this.zzaa.zzb;
                final zzba zzbaVar2 = new zzba(obj3, iZzs2, zzakVar3, obj4, i30, jZzr, jZzr2, zzxkVar5.zzb, zzxkVar5.zzc);
                this.zzn.zze(11, new zzea() { // from class: com.google.android.gms.internal.ads.zzky
                    @Override // com.google.android.gms.internal.ads.zzea
                    public final /* synthetic */ void zza(Object obj9) {
                        int i31 = zzlh.zzd;
                        ((zzaz) obj9).zzo(zzbaVar, zzbaVar2, i15);
                    }
                });
            } else {
                i19 = i19;
                zEquals = zEquals;
                i20 = i20;
                i21 = i21;
            }
            if (zBooleanValue) {
                this.zzn.zze(1, new zzea() { // from class: com.google.android.gms.internal.ads.zzkz
                    @Override // com.google.android.gms.internal.ads.zzea
                    public final /* synthetic */ void zza(Object obj9) {
                        int i31 = zzlh.zzd;
                        ((zzaz) obj9).zzc(zzakVar, iIntValue);
                    }
                });
            }
            zzjkVar = zzmsVar2.zzf;
            zzjkVar2 = zzmsVar.zzf;
            if (zzjkVar != zzjkVar2) {
                zzefVar = this.zzn;
                zzefVar.zze(10, new zzea() { // from class: com.google.android.gms.internal.ads.zzla
                    @Override // com.google.android.gms.internal.ads.zzea
                    public final /* synthetic */ void zza(Object obj9) {
                        int i31 = zzlh.zzd;
                        ((zzaz) obj9).zzn(zzmsVar.zzf);
                    }
                });
                if (zzjkVar2 != null) {
                    zzefVar.zze(10, new zzea() { // from class: com.google.android.gms.internal.ads.zzkf
                        @Override // com.google.android.gms.internal.ads.zzea
                        public final /* synthetic */ void zza(Object obj9) {
                            int i31 = zzlh.zzd;
                            ((zzaz) obj9).zzm(zzmsVar.zzf);
                        }
                    });
                }
            }
            zzabiVar = zzmsVar2.zzi;
            zzabiVar2 = zzmsVar.zzi;
            if (zzabiVar != zzabiVar2) {
                this.zzj.zzq(zzabiVar2.zze);
                this.zzn.zze(2, new zzea() { // from class: com.google.android.gms.internal.ads.zzkg
                    @Override // com.google.android.gms.internal.ads.zzea
                    public final /* synthetic */ void zza(Object obj9) {
                        int i31 = zzlh.zzd;
                        ((zzaz) obj9).zzd(zzmsVar.zzi.zzd);
                    }
                });
            }
            if (!zEquals) {
                final zzan zzanVar = this.zzN;
                this.zzn.zze(14, new zzea() { // from class: com.google.android.gms.internal.ads.zzkh
                    @Override // com.google.android.gms.internal.ads.zzea
                    public final /* synthetic */ void zza(Object obj9) {
                        int i31 = zzlh.zzd;
                        ((zzaz) obj9).zze(zzanVar);
                    }
                });
            }
            if (i21 != 0) {
                this.zzn.zze(i13, new zzea() { // from class: com.google.android.gms.internal.ads.zzki
                    @Override // com.google.android.gms.internal.ads.zzea
                    public final /* synthetic */ void zza(Object obj9) {
                        int i31 = zzlh.zzd;
                        ((zzaz) obj9).zzf(zzmsVar.zzg);
                    }
                });
            }
            if (i20 == 0 || i19 != 0) {
                this.zzn.zze(-1, new zzea() { // from class: com.google.android.gms.internal.ads.zzkj
                    @Override // com.google.android.gms.internal.ads.zzea
                    public final /* synthetic */ void zza(Object obj9) {
                        int i31 = zzlh.zzd;
                        zzms zzmsVar4 = zzmsVar;
                        ((zzaz) obj9).zzh(zzmsVar4.zzl, zzmsVar4.zze);
                    }
                });
            }
            if (i20 != 0) {
                this.zzn.zze(4, new zzea() { // from class: com.google.android.gms.internal.ads.zzkk
                    @Override // com.google.android.gms.internal.ads.zzea
                    public final /* synthetic */ void zza(Object obj9) {
                        int i31 = zzlh.zzd;
                        ((zzaz) obj9).zzi(zzmsVar.zze);
                    }
                });
            }
            if (i19 == 0 || zzmsVar2.zzm != zzmsVar.zzm) {
                this.zzn.zze(5, new zzea() { // from class: com.google.android.gms.internal.ads.zzkl
                    @Override // com.google.android.gms.internal.ads.zzea
                    public final /* synthetic */ void zza(Object obj9) {
                        int i31 = zzlh.zzd;
                        zzms zzmsVar4 = zzmsVar;
                        ((zzaz) obj9).zzj(zzmsVar4.zzl, zzmsVar4.zzm);
                    }
                });
            }
            if (zzmsVar2.zzn != zzmsVar.zzn) {
                this.zzn.zze(6, new zzea() { // from class: com.google.android.gms.internal.ads.zzkm
                    @Override // com.google.android.gms.internal.ads.zzea
                    public final /* synthetic */ void zza(Object obj9) {
                        int i31 = zzlh.zzd;
                        ((zzaz) obj9).zzk(zzmsVar.zzn);
                    }
                });
            }
            if (zzmsVar2.zzj() != zzmsVar.zzj()) {
                this.zzn.zze(7, new zzea() { // from class: com.google.android.gms.internal.ads.zzkn
                    @Override // com.google.android.gms.internal.ads.zzea
                    public final /* synthetic */ void zza(Object obj9) {
                        int i31 = zzlh.zzd;
                        ((zzaz) obj9).zzl(zzmsVar.zzj());
                    }
                });
            }
            if (!zzmsVar2.zzo.equals(zzmsVar.zzo)) {
                this.zzn.zze(12, new zzea() { // from class: com.google.android.gms.internal.ads.zzko
                    @Override // com.google.android.gms.internal.ads.zzea
                    public final /* synthetic */ void zza(Object obj9) {
                        int i31 = zzlh.zzd;
                        ((zzaz) obj9).zzp(zzmsVar.zzo);
                    }
                });
            }
            zzaxVar = this.zzM;
            zzbbVar = this.zzg;
            zzax zzaxVar2 = this.zzc;
            String str2 = zzfl.zza;
            boolean zZzx = zzbbVar.zzx();
            zzfVar = (zzf) zzbbVar;
            zzbfVarZzq2 = zzfVar.zzq();
            if (!zzbfVarZzq2.zzg()) {
                zzbbVar2 = zzbbVar;
                z15 = zzbfVarZzq2.zzb(zzfVar.zzs(), zzfVar.zza, 0L).zzh;
                zzbfVarZzq3 = zzfVar.zzq();
                if (zzbfVarZzq3.zzg()) {
                    i22 = -1;
                    r15 = 0;
                    z16 = false;
                } else {
                    int iZzs3 = zzfVar.zzs();
                    zzfVar.zzl();
                    zzfVar.zzm();
                    r15 = 0;
                    r15 = 0;
                    iZzi = zzbfVarZzq3.zzi(iZzs3, 0, false);
                    i22 = -1;
                    if (iZzi != -1) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                }
                Zzq = zzfVar.zzq();
                if (Zzq.zzg()) {
                    r10 = r15;
                } else {
                    iZzs = zzfVar.zzs();
                    zzfVar.zzl();
                    zzfVar.zzm();
                    if (Zzq.zzh(iZzs, r15, r15) != i22) {
                        r10 = 1;
                    } else {
                        r10 = r15;
                    }
                }
                zzbfVarZzq4 = zzfVar.zzq();
                if (!zzbfVarZzq4.zzg()) {
                    j11 = 0;
                    boolean z25 = zzbfVarZzq4.zzb(zzfVar.zzs(), zzfVar.zza, 0L).zzb();
                    zzbfVarZzq5 = zzfVar.zzq();
                    if (zzbfVarZzq5.zzg() && zzbfVarZzq5.zzb(zzfVar.zzs(), zzfVar.zza, j11).zzi) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    zZzg = zzbbVar2.zzq().zzg();
                    zzaw zzawVar = new zzaw();
                    zzawVar.zzd(zzaxVar2);
                    boolean z26 = !zZzx;
                    zzawVar.zzb(4, z26);
                    if (z15 || zZzx) {
                        z18 = false;
                    } else {
                        z18 = true;
                    }
                    zzawVar.zzb(5, z18);
                    if (z16 || zZzx) {
                        z19 = false;
                    } else {
                        z19 = true;
                    }
                    zzawVar.zzb(6, z19);
                    if (!zZzg || (!(z16 || !z25 || z15) || zZzx)) {
                        z20 = false;
                    } else {
                        z20 = true;
                    }
                    zzawVar.zzb(7, z20);
                    if (r10 != 0 || zZzx) {
                        z21 = false;
                    } else {
                        z21 = true;
                    }
                    zzawVar.zzb(8, z21);
                    if (!zZzg || ((r10 == 0 && !(z25 && z17)) || zZzx)) {
                        z22 = false;
                    } else {
                        z22 = true;
                    }
                    zzawVar.zzb(9, z22);
                    zzawVar.zzb(10, z26);
                    if (z15 || zZzx) {
                        i23 = 11;
                        z23 = false;
                    } else {
                        i23 = 11;
                        z23 = true;
                    }
                    zzawVar.zzb(i23, z23);
                    if (z15 || zZzx) {
                        i24 = 12;
                        z24 = false;
                    } else {
                        i24 = 12;
                        z24 = true;
                    }
                    zzawVar.zzb(i24, z24);
                    zzaxVarZze = zzawVar.zze();
                    this.zzM = zzaxVarZze;
                    if (!zzaxVarZze.equals(zzaxVar)) {
                        this.zzn.zze(13, new zzea() { // from class: com.google.android.gms.internal.ads.zzkq
                            @Override // com.google.android.gms.internal.ads.zzea
                            public final /* synthetic */ void zza(Object obj9) {
                                this.zza.zzN((zzaz) obj9);
                            }
                        });
                    }
                    this.zzn.zzf();
                }
                j11 = 0;
                zzbfVarZzq5 = zzfVar.zzq();
                if (zzbfVarZzq5.zzg()) {
                    z17 = false;
                } else {
                    z17 = false;
                }
                zZzg = zzbbVar2.zzq().zzg();
                zzaw zzawVar2 = new zzaw();
                zzawVar2.zzd(zzaxVar2);
                boolean z27 = !zZzx;
                zzawVar2.zzb(4, z27);
                if (z15) {
                    z18 = false;
                } else {
                    z18 = false;
                }
                zzawVar2.zzb(5, z18);
                if (z16) {
                    z19 = false;
                } else {
                    z19 = false;
                }
                zzawVar2.zzb(6, z19);
                if (zZzg) {
                    z20 = false;
                } else {
                    z20 = false;
                }
                zzawVar2.zzb(7, z20);
                if (r10 != 0) {
                    z21 = false;
                } else {
                    z21 = false;
                }
                zzawVar2.zzb(8, z21);
                if (zZzg) {
                    z22 = false;
                } else {
                    z22 = false;
                }
                zzawVar2.zzb(9, z22);
                zzawVar2.zzb(10, z27);
                if (z15) {
                    i23 = 11;
                    z23 = false;
                } else {
                    i23 = 11;
                    z23 = false;
                }
                zzawVar2.zzb(i23, z23);
                if (z15) {
                    i24 = 12;
                    z24 = false;
                } else {
                    i24 = 12;
                    z24 = false;
                }
                zzawVar2.zzb(i24, z24);
                zzaxVarZze = zzawVar2.zze();
                this.zzM = zzaxVarZze;
                if (!zzaxVarZze.equals(zzaxVar)) {
                    this.zzn.zze(13, new zzea() { // from class: com.google.android.gms.internal.ads.zzkq
                        @Override // com.google.android.gms.internal.ads.zzea
                        public final /* synthetic */ void zza(Object obj9) {
                            this.zza.zzN((zzaz) obj9);
                        }
                    });
                }
                this.zzn.zzf();
            }
            zzbbVar2 = zzbbVar;
            zzbfVarZzq3 = zzfVar.zzq();
            if (zzbfVarZzq3.zzg()) {
                i22 = -1;
                r15 = 0;
                z16 = false;
            } else {
                int iZzs4 = zzfVar.zzs();
                zzfVar.zzl();
                zzfVar.zzm();
                r15 = 0;
                r15 = 0;
                iZzi = zzbfVarZzq3.zzi(iZzs4, 0, false);
                i22 = -1;
                if (iZzi != -1) {
                    z16 = true;
                } else {
                    z16 = false;
                }
            }
            Zzq = zzfVar.zzq();
            if (Zzq.zzg()) {
                r10 = r15;
            } else {
                iZzs = zzfVar.zzs();
                zzfVar.zzl();
                zzfVar.zzm();
                if (Zzq.zzh(iZzs, r15, r15) != i22) {
                    r10 = 1;
                } else {
                    r10 = r15;
                }
            }
            zzbfVarZzq4 = zzfVar.zzq();
            if (!zzbfVarZzq4.zzg()) {
                j11 = 0;
                if (zzbfVarZzq4.zzb(zzfVar.zzs(), zzfVar.zza, 0L).zzb()) {
                }
                zzbfVarZzq5 = zzfVar.zzq();
                if (zzbfVarZzq5.zzg()) {
                    z17 = false;
                } else {
                    z17 = false;
                }
                zZzg = zzbbVar2.zzq().zzg();
                zzaw zzawVar3 = new zzaw();
                zzawVar3.zzd(zzaxVar2);
                boolean z28 = !zZzx;
                zzawVar3.zzb(4, z28);
                if (z15) {
                    z18 = false;
                } else {
                    z18 = false;
                }
                zzawVar3.zzb(5, z18);
                if (z16) {
                    z19 = false;
                } else {
                    z19 = false;
                }
                zzawVar3.zzb(6, z19);
                if (zZzg) {
                    z20 = false;
                } else {
                    z20 = false;
                }
                zzawVar3.zzb(7, z20);
                if (r10 != 0) {
                    z21 = false;
                } else {
                    z21 = false;
                }
                zzawVar3.zzb(8, z21);
                if (zZzg) {
                    z22 = false;
                } else {
                    z22 = false;
                }
                zzawVar3.zzb(9, z22);
                zzawVar3.zzb(10, z28);
                if (z15) {
                    i23 = 11;
                    z23 = false;
                } else {
                    i23 = 11;
                    z23 = false;
                }
                zzawVar3.zzb(i23, z23);
                if (z15) {
                    i24 = 12;
                    z24 = false;
                } else {
                    i24 = 12;
                    z24 = false;
                }
                zzawVar3.zzb(i24, z24);
                zzaxVarZze = zzawVar3.zze();
                this.zzM = zzaxVarZze;
                if (!zzaxVarZze.equals(zzaxVar)) {
                    this.zzn.zze(13, new zzea() { // from class: com.google.android.gms.internal.ads.zzkq
                        @Override // com.google.android.gms.internal.ads.zzea
                        public final /* synthetic */ void zza(Object obj9) {
                            this.zza.zzN((zzaz) obj9);
                        }
                    });
                }
                this.zzn.zzf();
            }
            j11 = 0;
            zzbfVarZzq5 = zzfVar.zzq();
            if (zzbfVarZzq5.zzg()) {
                z17 = false;
            } else {
                z17 = false;
            }
            zZzg = zzbbVar2.zzq().zzg();
            zzaw zzawVar4 = new zzaw();
            zzawVar4.zzd(zzaxVar2);
            boolean z29 = !zZzx;
            zzawVar4.zzb(4, z29);
            if (z15) {
                z18 = false;
            } else {
                z18 = false;
            }
            zzawVar4.zzb(5, z18);
            if (z16) {
                z19 = false;
            } else {
                z19 = false;
            }
            zzawVar4.zzb(6, z19);
            if (zZzg) {
                z20 = false;
            } else {
                z20 = false;
            }
            zzawVar4.zzb(7, z20);
            if (r10 != 0) {
                z21 = false;
            } else {
                z21 = false;
            }
            zzawVar4.zzb(8, z21);
            if (zZzg) {
                z22 = false;
            } else {
                z22 = false;
            }
            zzawVar4.zzb(9, z22);
            zzawVar4.zzb(10, z29);
            if (z15) {
                i23 = 11;
                z23 = false;
            } else {
                i23 = 11;
                z23 = false;
            }
            zzawVar4.zzb(i23, z23);
            if (z15) {
                i24 = 12;
                z24 = false;
            } else {
                i24 = 12;
                z24 = false;
            }
            zzawVar4.zzb(i24, z24);
            zzaxVarZze = zzawVar4.zze();
            this.zzM = zzaxVarZze;
            if (!zzaxVarZze.equals(zzaxVar)) {
                this.zzn.zze(13, new zzea() { // from class: com.google.android.gms.internal.ads.zzkq
                    @Override // com.google.android.gms.internal.ads.zzea
                    public final /* synthetic */ void zza(Object obj9) {
                        this.zza.zzN((zzaz) obj9);
                    }
                });
            }
            this.zzn.zzf();
        }
        i13 = 3;
        pair = new Pair(Boolean.FALSE, -1);
        i15 = i27;
        i14 = 0;
        z12 = z10;
        zBooleanValue = ((Boolean) pair.first).booleanValue();
        iIntValue = ((Integer) pair.second).intValue();
        if (zBooleanValue) {
            if (zzbfVar.zzg()) {
                zzakVar = zzbfVar.zzb(zzbfVar.zzo(zzmsVar.zzb.zza, this.zzp).zzc, this.zza, 0L).zzd;
            } else {
                zzakVar = null;
            }
            this.zzZ = zzan.zza;
        } else {
            zzakVar = null;
        }
        if (zBooleanValue) {
            zzamVarZza = this.zzZ.zza();
            list = zzmsVar.zzj;
            while (i17 < list.size()) {
                zzapVar = (zzap) list.get(i17);
                while (i18 < zzapVar.zza()) {
                    zzapVar.zzb(i18).zza(zzamVarZza);
                }
            }
            this.zzZ = zzamVarZza.zzw();
        } else {
            zzamVarZza = this.zzZ.zza();
            list = zzmsVar.zzj;
            while (i17 < list.size()) {
                zzapVar = (zzap) list.get(i17);
                while (i18 < zzapVar.zza()) {
                    zzapVar.zzb(i18).zza(zzamVarZza);
                }
            }
            this.zzZ = zzamVarZza.zzw();
        }
        zzbfVarZzq = zzq();
        if (zzbfVarZzq.zzg()) {
            zzanVarZzw = this.zzZ;
        } else {
            zzak zzakVar5 = zzbfVarZzq.zzb(zzs(), this.zza, 0L).zzd;
            zzam zzamVarZza3 = this.zzZ.zza();
            zzamVarZza3.zzv(zzakVar5.zzd);
            zzanVarZzw = zzamVarZza3.zzw();
        }
        zEquals = zzanVarZzw.equals(this.zzN);
        this.zzN = zzanVarZzw;
        if (zzmsVar2.zzl != zzmsVar.zzl) {
            i19 = 1;
        } else {
            i19 = i14;
        }
        if (zzmsVar2.zze != zzmsVar.zze) {
            i20 = 1;
        } else {
            i20 = i14;
        }
        if (i20 == 0) {
            zzas();
        } else {
            zzas();
        }
        if (zzmsVar2.zzg != zzmsVar.zzg) {
            i21 = 1;
        } else {
            i21 = i14;
        }
        if (!zEquals2) {
            this.zzn.zze(i14, new zzea() { // from class: com.google.android.gms.internal.ads.zzkx
                @Override // com.google.android.gms.internal.ads.zzea
                public final /* synthetic */ void zza(Object obj9) {
                    int i210 = zzlh.zzd;
                    ((zzaz) obj9).zzb(zzmsVar.zza, i10);
                }
            });
        }
        if (z12) {
            zzbdVar = new zzbd();
            if (r11.zzg()) {
                Object obj9 = zzmsVar2.zzb.zza;
                r11.zzo(obj9, zzbdVar);
                int i210 = zzbdVar.zzc;
                int iZze2 = r11.zze(obj9);
                zzbe zzbeVar4 = this.zza;
                obj = r11.zzb(i210, zzbeVar4, 0L).zzb;
                zzakVar2 = zzbeVar4.zzd;
                obj2 = obj9;
                i25 = i210;
                i26 = iZze2;
            } else {
                i25 = i12;
                i26 = i25;
                obj = null;
                zzakVar2 = null;
                obj2 = null;
            }
            if (i15 == 0) {
                zzxkVar = zzmsVar2.zzb;
                if (zzxkVar.zzb()) {
                    jZzak = zzbdVar.zzh(zzxkVar.zzb, zzxkVar.zzc);
                    jZzak2 = zzak(zzmsVar2);
                } else {
                    if (zzxkVar.zze != -1) {
                        jZzak = zzak(this.zzaa);
                    } else {
                        jZzak = zzbdVar.zzd;
                    }
                    jZzak2 = jZzak;
                }
            } else if (zzmsVar2.zzb.zzb()) {
                jZzak = zzmsVar2.zzs;
                jZzak2 = zzak(zzmsVar2);
            } else {
                jZzak = zzmsVar2.zzs;
                jZzak2 = jZzak;
            }
            String str3 = zzfl.zza;
            zzxk zzxkVar6 = zzmsVar2.zzb;
            final zzba zzbaVar3 = new zzba(obj, i25, zzakVar2, obj2, i26, zzfl.zzr(jZzak), zzfl.zzr(jZzak2), zzxkVar6.zzb, zzxkVar6.zzc);
            iZzs2 = zzs();
            iZzr = zzr();
            if (this.zzaa.zza.zzg()) {
                zzms zzmsVar4 = this.zzaa;
                Object obj10 = zzmsVar4.zzb.zza;
                zzmsVar4.zza.zzo(obj10, this.zzp);
                iZzr = this.zzaa.zza.zze(obj10);
                zzbf zzbfVar3 = this.zzaa.zza;
                zzbe zzbeVar5 = this.zza;
                obj4 = obj10;
                obj3 = zzbfVar3.zzb(iZzs2, zzbeVar5, 0L).zzb;
                zzakVar3 = zzbeVar5.zzd;
            } else {
                obj3 = null;
                zzakVar3 = null;
                obj4 = null;
            }
            int i31 = iZzr;
            jZzr = zzfl.zzr(j10);
            if (this.zzaa.zzb.zzb()) {
                jZzr2 = zzfl.zzr(zzak(this.zzaa));
            } else {
                jZzr2 = jZzr;
            }
            zzxk zzxkVar7 = this.zzaa.zzb;
            final zzba zzbaVar4 = new zzba(obj3, iZzs2, zzakVar3, obj4, i31, jZzr, jZzr2, zzxkVar7.zzb, zzxkVar7.zzc);
            this.zzn.zze(11, new zzea() { // from class: com.google.android.gms.internal.ads.zzky
                @Override // com.google.android.gms.internal.ads.zzea
                public final /* synthetic */ void zza(Object obj11) {
                    int i32 = zzlh.zzd;
                    ((zzaz) obj11).zzo(zzbaVar3, zzbaVar4, i15);
                }
            });
        } else {
            i19 = i19;
            zEquals = zEquals;
            i20 = i20;
            i21 = i21;
        }
        if (zBooleanValue) {
            this.zzn.zze(1, new zzea() { // from class: com.google.android.gms.internal.ads.zzkz
                @Override // com.google.android.gms.internal.ads.zzea
                public final /* synthetic */ void zza(Object obj11) {
                    int i32 = zzlh.zzd;
                    ((zzaz) obj11).zzc(zzakVar, iIntValue);
                }
            });
        }
        zzjkVar = zzmsVar2.zzf;
        zzjkVar2 = zzmsVar.zzf;
        if (zzjkVar != zzjkVar2) {
            zzefVar = this.zzn;
            zzefVar.zze(10, new zzea() { // from class: com.google.android.gms.internal.ads.zzla
                @Override // com.google.android.gms.internal.ads.zzea
                public final /* synthetic */ void zza(Object obj11) {
                    int i32 = zzlh.zzd;
                    ((zzaz) obj11).zzn(zzmsVar.zzf);
                }
            });
            if (zzjkVar2 != null) {
                zzefVar.zze(10, new zzea() { // from class: com.google.android.gms.internal.ads.zzkf
                    @Override // com.google.android.gms.internal.ads.zzea
                    public final /* synthetic */ void zza(Object obj11) {
                        int i32 = zzlh.zzd;
                        ((zzaz) obj11).zzm(zzmsVar.zzf);
                    }
                });
            }
        }
        zzabiVar = zzmsVar2.zzi;
        zzabiVar2 = zzmsVar.zzi;
        if (zzabiVar != zzabiVar2) {
            this.zzj.zzq(zzabiVar2.zze);
            this.zzn.zze(2, new zzea() { // from class: com.google.android.gms.internal.ads.zzkg
                @Override // com.google.android.gms.internal.ads.zzea
                public final /* synthetic */ void zza(Object obj11) {
                    int i32 = zzlh.zzd;
                    ((zzaz) obj11).zzd(zzmsVar.zzi.zzd);
                }
            });
        }
        if (!zEquals) {
            final zzan zzanVar2 = this.zzN;
            this.zzn.zze(14, new zzea() { // from class: com.google.android.gms.internal.ads.zzkh
                @Override // com.google.android.gms.internal.ads.zzea
                public final /* synthetic */ void zza(Object obj11) {
                    int i32 = zzlh.zzd;
                    ((zzaz) obj11).zze(zzanVar2);
                }
            });
        }
        if (i21 != 0) {
            this.zzn.zze(i13, new zzea() { // from class: com.google.android.gms.internal.ads.zzki
                @Override // com.google.android.gms.internal.ads.zzea
                public final /* synthetic */ void zza(Object obj11) {
                    int i32 = zzlh.zzd;
                    ((zzaz) obj11).zzf(zzmsVar.zzg);
                }
            });
        }
        if (i20 == 0) {
            this.zzn.zze(-1, new zzea() { // from class: com.google.android.gms.internal.ads.zzkj
                @Override // com.google.android.gms.internal.ads.zzea
                public final /* synthetic */ void zza(Object obj11) {
                    int i32 = zzlh.zzd;
                    zzms zzmsVar5 = zzmsVar;
                    ((zzaz) obj11).zzh(zzmsVar5.zzl, zzmsVar5.zze);
                }
            });
        } else {
            this.zzn.zze(-1, new zzea() { // from class: com.google.android.gms.internal.ads.zzkj
                @Override // com.google.android.gms.internal.ads.zzea
                public final /* synthetic */ void zza(Object obj11) {
                    int i32 = zzlh.zzd;
                    zzms zzmsVar5 = zzmsVar;
                    ((zzaz) obj11).zzh(zzmsVar5.zzl, zzmsVar5.zze);
                }
            });
        }
        if (i20 != 0) {
            this.zzn.zze(4, new zzea() { // from class: com.google.android.gms.internal.ads.zzkk
                @Override // com.google.android.gms.internal.ads.zzea
                public final /* synthetic */ void zza(Object obj11) {
                    int i32 = zzlh.zzd;
                    ((zzaz) obj11).zzi(zzmsVar.zze);
                }
            });
        }
        if (i19 == 0) {
            this.zzn.zze(5, new zzea() { // from class: com.google.android.gms.internal.ads.zzkl
                @Override // com.google.android.gms.internal.ads.zzea
                public final /* synthetic */ void zza(Object obj11) {
                    int i32 = zzlh.zzd;
                    zzms zzmsVar5 = zzmsVar;
                    ((zzaz) obj11).zzj(zzmsVar5.zzl, zzmsVar5.zzm);
                }
            });
        } else {
            this.zzn.zze(5, new zzea() { // from class: com.google.android.gms.internal.ads.zzkl
                @Override // com.google.android.gms.internal.ads.zzea
                public final /* synthetic */ void zza(Object obj11) {
                    int i32 = zzlh.zzd;
                    zzms zzmsVar5 = zzmsVar;
                    ((zzaz) obj11).zzj(zzmsVar5.zzl, zzmsVar5.zzm);
                }
            });
        }
        if (zzmsVar2.zzn != zzmsVar.zzn) {
            this.zzn.zze(6, new zzea() { // from class: com.google.android.gms.internal.ads.zzkm
                @Override // com.google.android.gms.internal.ads.zzea
                public final /* synthetic */ void zza(Object obj11) {
                    int i32 = zzlh.zzd;
                    ((zzaz) obj11).zzk(zzmsVar.zzn);
                }
            });
        }
        if (zzmsVar2.zzj() != zzmsVar.zzj()) {
            this.zzn.zze(7, new zzea() { // from class: com.google.android.gms.internal.ads.zzkn
                @Override // com.google.android.gms.internal.ads.zzea
                public final /* synthetic */ void zza(Object obj11) {
                    int i32 = zzlh.zzd;
                    ((zzaz) obj11).zzl(zzmsVar.zzj());
                }
            });
        }
        if (!zzmsVar2.zzo.equals(zzmsVar.zzo)) {
            this.zzn.zze(12, new zzea() { // from class: com.google.android.gms.internal.ads.zzko
                @Override // com.google.android.gms.internal.ads.zzea
                public final /* synthetic */ void zza(Object obj11) {
                    int i32 = zzlh.zzd;
                    ((zzaz) obj11).zzp(zzmsVar.zzo);
                }
            });
        }
        zzaxVar = this.zzM;
        zzbbVar = this.zzg;
        zzax zzaxVar3 = this.zzc;
        String str4 = zzfl.zza;
        boolean zZzx2 = zzbbVar.zzx();
        zzfVar = (zzf) zzbbVar;
        zzbfVarZzq2 = zzfVar.zzq();
        if (!zzbfVarZzq2.zzg()) {
            zzbbVar2 = zzbbVar;
            if (zzbfVarZzq2.zzb(zzfVar.zzs(), zzfVar.zza, 0L).zzh) {
            }
            zzbfVarZzq3 = zzfVar.zzq();
            if (zzbfVarZzq3.zzg()) {
                i22 = -1;
                r15 = 0;
                z16 = false;
            } else {
                int iZzs5 = zzfVar.zzs();
                zzfVar.zzl();
                zzfVar.zzm();
                r15 = 0;
                r15 = 0;
                iZzi = zzbfVarZzq3.zzi(iZzs5, 0, false);
                i22 = -1;
                if (iZzi != -1) {
                    z16 = true;
                } else {
                    z16 = false;
                }
            }
            Zzq = zzfVar.zzq();
            if (Zzq.zzg()) {
                r10 = r15;
            } else {
                iZzs = zzfVar.zzs();
                zzfVar.zzl();
                zzfVar.zzm();
                if (Zzq.zzh(iZzs, r15, r15) != i22) {
                    r10 = 1;
                } else {
                    r10 = r15;
                }
            }
            zzbfVarZzq4 = zzfVar.zzq();
            if (!zzbfVarZzq4.zzg()) {
                j11 = 0;
                if (zzbfVarZzq4.zzb(zzfVar.zzs(), zzfVar.zza, 0L).zzb()) {
                }
                zzbfVarZzq5 = zzfVar.zzq();
                if (zzbfVarZzq5.zzg()) {
                    z17 = false;
                } else {
                    z17 = false;
                }
                zZzg = zzbbVar2.zzq().zzg();
                zzaw zzawVar5 = new zzaw();
                zzawVar5.zzd(zzaxVar3);
                boolean z210 = !zZzx2;
                zzawVar5.zzb(4, z210);
                if (z15) {
                    z18 = false;
                } else {
                    z18 = false;
                }
                zzawVar5.zzb(5, z18);
                if (z16) {
                    z19 = false;
                } else {
                    z19 = false;
                }
                zzawVar5.zzb(6, z19);
                if (zZzg) {
                    z20 = false;
                } else {
                    z20 = false;
                }
                zzawVar5.zzb(7, z20);
                if (r10 != 0) {
                    z21 = false;
                } else {
                    z21 = false;
                }
                zzawVar5.zzb(8, z21);
                if (zZzg) {
                    z22 = false;
                } else {
                    z22 = false;
                }
                zzawVar5.zzb(9, z22);
                zzawVar5.zzb(10, z210);
                if (z15) {
                    i23 = 11;
                    z23 = false;
                } else {
                    i23 = 11;
                    z23 = false;
                }
                zzawVar5.zzb(i23, z23);
                if (z15) {
                    i24 = 12;
                    z24 = false;
                } else {
                    i24 = 12;
                    z24 = false;
                }
                zzawVar5.zzb(i24, z24);
                zzaxVarZze = zzawVar5.zze();
                this.zzM = zzaxVarZze;
                if (!zzaxVarZze.equals(zzaxVar)) {
                    this.zzn.zze(13, new zzea() { // from class: com.google.android.gms.internal.ads.zzkq
                        @Override // com.google.android.gms.internal.ads.zzea
                        public final /* synthetic */ void zza(Object obj11) {
                            this.zza.zzN((zzaz) obj11);
                        }
                    });
                }
                this.zzn.zzf();
            }
            j11 = 0;
            zzbfVarZzq5 = zzfVar.zzq();
            if (zzbfVarZzq5.zzg()) {
                z17 = false;
            } else {
                z17 = false;
            }
            zZzg = zzbbVar2.zzq().zzg();
            zzaw zzawVar6 = new zzaw();
            zzawVar6.zzd(zzaxVar3);
            boolean z211 = !zZzx2;
            zzawVar6.zzb(4, z211);
            if (z15) {
                z18 = false;
            } else {
                z18 = false;
            }
            zzawVar6.zzb(5, z18);
            if (z16) {
                z19 = false;
            } else {
                z19 = false;
            }
            zzawVar6.zzb(6, z19);
            if (zZzg) {
                z20 = false;
            } else {
                z20 = false;
            }
            zzawVar6.zzb(7, z20);
            if (r10 != 0) {
                z21 = false;
            } else {
                z21 = false;
            }
            zzawVar6.zzb(8, z21);
            if (zZzg) {
                z22 = false;
            } else {
                z22 = false;
            }
            zzawVar6.zzb(9, z22);
            zzawVar6.zzb(10, z211);
            if (z15) {
                i23 = 11;
                z23 = false;
            } else {
                i23 = 11;
                z23 = false;
            }
            zzawVar6.zzb(i23, z23);
            if (z15) {
                i24 = 12;
                z24 = false;
            } else {
                i24 = 12;
                z24 = false;
            }
            zzawVar6.zzb(i24, z24);
            zzaxVarZze = zzawVar6.zze();
            this.zzM = zzaxVarZze;
            if (!zzaxVarZze.equals(zzaxVar)) {
                this.zzn.zze(13, new zzea() { // from class: com.google.android.gms.internal.ads.zzkq
                    @Override // com.google.android.gms.internal.ads.zzea
                    public final /* synthetic */ void zza(Object obj11) {
                        this.zza.zzN((zzaz) obj11);
                    }
                });
            }
            this.zzn.zzf();
        }
        zzbbVar2 = zzbbVar;
        zzbfVarZzq3 = zzfVar.zzq();
        if (zzbfVarZzq3.zzg()) {
            i22 = -1;
            r15 = 0;
            z16 = false;
        } else {
            int iZzs6 = zzfVar.zzs();
            zzfVar.zzl();
            zzfVar.zzm();
            r15 = 0;
            r15 = 0;
            iZzi = zzbfVarZzq3.zzi(iZzs6, 0, false);
            i22 = -1;
            if (iZzi != -1) {
                z16 = true;
            } else {
                z16 = false;
            }
        }
        Zzq = zzfVar.zzq();
        if (Zzq.zzg()) {
            r10 = r15;
        } else {
            iZzs = zzfVar.zzs();
            zzfVar.zzl();
            zzfVar.zzm();
            if (Zzq.zzh(iZzs, r15, r15) != i22) {
                r10 = 1;
            } else {
                r10 = r15;
            }
        }
        zzbfVarZzq4 = zzfVar.zzq();
        if (!zzbfVarZzq4.zzg()) {
            j11 = 0;
            if (zzbfVarZzq4.zzb(zzfVar.zzs(), zzfVar.zza, 0L).zzb()) {
            }
            zzbfVarZzq5 = zzfVar.zzq();
            if (zzbfVarZzq5.zzg()) {
                z17 = false;
            } else {
                z17 = false;
            }
            zZzg = zzbbVar2.zzq().zzg();
            zzaw zzawVar7 = new zzaw();
            zzawVar7.zzd(zzaxVar3);
            boolean z212 = !zZzx2;
            zzawVar7.zzb(4, z212);
            if (z15) {
                z18 = false;
            } else {
                z18 = false;
            }
            zzawVar7.zzb(5, z18);
            if (z16) {
                z19 = false;
            } else {
                z19 = false;
            }
            zzawVar7.zzb(6, z19);
            if (zZzg) {
                z20 = false;
            } else {
                z20 = false;
            }
            zzawVar7.zzb(7, z20);
            if (r10 != 0) {
                z21 = false;
            } else {
                z21 = false;
            }
            zzawVar7.zzb(8, z21);
            if (zZzg) {
                z22 = false;
            } else {
                z22 = false;
            }
            zzawVar7.zzb(9, z22);
            zzawVar7.zzb(10, z212);
            if (z15) {
                i23 = 11;
                z23 = false;
            } else {
                i23 = 11;
                z23 = false;
            }
            zzawVar7.zzb(i23, z23);
            if (z15) {
                i24 = 12;
                z24 = false;
            } else {
                i24 = 12;
                z24 = false;
            }
            zzawVar7.zzb(i24, z24);
            zzaxVarZze = zzawVar7.zze();
            this.zzM = zzaxVarZze;
            if (!zzaxVarZze.equals(zzaxVar)) {
                this.zzn.zze(13, new zzea() { // from class: com.google.android.gms.internal.ads.zzkq
                    @Override // com.google.android.gms.internal.ads.zzea
                    public final /* synthetic */ void zza(Object obj11) {
                        this.zza.zzN((zzaz) obj11);
                    }
                });
            }
            this.zzn.zzf();
        }
        j11 = 0;
        zzbfVarZzq5 = zzfVar.zzq();
        if (zzbfVarZzq5.zzg()) {
            z17 = false;
        } else {
            z17 = false;
        }
        zZzg = zzbbVar2.zzq().zzg();
        zzaw zzawVar8 = new zzaw();
        zzawVar8.zzd(zzaxVar3);
        boolean z213 = !zZzx2;
        zzawVar8.zzb(4, z213);
        if (z15) {
            z18 = false;
        } else {
            z18 = false;
        }
        zzawVar8.zzb(5, z18);
        if (z16) {
            z19 = false;
        } else {
            z19 = false;
        }
        zzawVar8.zzb(6, z19);
        if (zZzg) {
            z20 = false;
        } else {
            z20 = false;
        }
        zzawVar8.zzb(7, z20);
        if (r10 != 0) {
            z21 = false;
        } else {
            z21 = false;
        }
        zzawVar8.zzb(8, z21);
        if (zZzg) {
            z22 = false;
        } else {
            z22 = false;
        }
        zzawVar8.zzb(9, z22);
        zzawVar8.zzb(10, z213);
        if (z15) {
            i23 = 11;
            z23 = false;
        } else {
            i23 = 11;
            z23 = false;
        }
        zzawVar8.zzb(i23, z23);
        if (z15) {
            i24 = 12;
            z24 = false;
        } else {
            i24 = 12;
            z24 = false;
        }
        zzawVar8.zzb(i24, z24);
        zzaxVarZze = zzawVar8.zze();
        this.zzM = zzaxVarZze;
        if (!zzaxVarZze.equals(zzaxVar)) {
            this.zzn.zze(13, new zzea() { // from class: com.google.android.gms.internal.ads.zzkq
                @Override // com.google.android.gms.internal.ads.zzea
                public final /* synthetic */ void zza(Object obj11) {
                    this.zza.zzN((zzaz) obj11);
                }
            });
        }
        this.zzn.zzf();
    }

    private static long zzak(zzms zzmsVar) {
        zzbe zzbeVar = new zzbe();
        zzbd zzbdVar = new zzbd();
        zzbf zzbfVar = zzmsVar.zza;
        zzbfVar.zzo(zzmsVar.zzb.zza, zzbdVar);
        long j10 = zzmsVar.zzc;
        if (j10 != C.TIME_UNSET) {
            return j10;
        }
        long j11 = zzbfVar.zzb(zzbdVar.zzc, zzbeVar, 0L).zzl;
        return 0L;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0093  */
    private final zzms zzal(zzms zzmsVar, zzbf zzbfVar, Pair pair) {
        boolean z10;
        zzgtj.zza(zzbfVar.zzg() || pair != null);
        zzbf zzbfVar2 = zzmsVar.zza;
        long jZzah = zzah(zzmsVar);
        zzms zzmsVarZzd = zzmsVar.zzd(zzbfVar);
        if (zzbfVar.zzg()) {
            zzxk zzxkVarZzb = zzms.zzb();
            long jZzs = zzfl.zzs(this.zzac);
            zzms zzmsVarZzh = zzmsVarZzd.zzc(zzxkVarZzb, jZzs, jZzs, jZzs, 0L, zzzn.zza, this.zzb, zzgwm.zzi()).zzh(zzxkVarZzb);
            zzmsVarZzh.zzq = zzmsVarZzh.zzs;
            return zzmsVarZzh;
        }
        zzxk zzxkVar = zzmsVarZzd.zzb;
        Object obj = zzxkVar.zza;
        String str = zzfl.zza;
        boolean zEquals = obj.equals(pair.first);
        zzxk zzxkVar2 = !zEquals ? new zzxk(pair.first, -1L) : zzxkVar;
        long jLongValue = ((Long) pair.second).longValue();
        long jZzs2 = zzfl.zzs(jZzah);
        if (zzbfVar2.zzg()) {
            z10 = true;
        } else {
            zzbd zzbdVar = this.zzp;
            zzbfVar2.zzo(obj, zzbdVar);
            if (zEquals && jZzs2 - jLongValue == 1) {
                zzbd zzbdVarZzo = zzbfVar2.zzo(obj, zzbdVar);
                z10 = true;
                if (jZzs2 == zzbdVarZzo.zzd) {
                    jZzs2--;
                }
            } else {
                z10 = true;
            }
        }
        if (!zEquals || jLongValue < jZzs2) {
            zzgtj.zzi(zzxkVar2.zzb() ^ z10);
            zzxk zzxkVar3 = zzxkVar2;
            zzms zzmsVarZzh2 = zzmsVarZzd.zzc(zzxkVar3, jLongValue, jLongValue, jLongValue, 0L, !zEquals ? zzzn.zza : zzmsVarZzd.zzh, !zEquals ? this.zzb : zzmsVarZzd.zzi, !zEquals ? zzgwm.zzi() : zzmsVarZzd.zzj).zzh(zzxkVar3);
            zzmsVarZzh2.zzq = jLongValue;
            return zzmsVarZzh2;
        }
        if (jLongValue != jZzs2) {
            zzgtj.zzi(zzxkVar2.zzb() ^ z10);
            long jMax = Math.max(0L, zzmsVarZzd.zzr - (jLongValue - jZzs2));
            long j10 = zzmsVarZzd.zzq;
            if (zzmsVarZzd.zzk.equals(zzxkVar)) {
                j10 = jLongValue + jMax;
            }
            zzms zzmsVarZzc = zzmsVarZzd.zzc(zzxkVar2, jLongValue, jLongValue, jLongValue, jMax, zzmsVarZzd.zzh, zzmsVarZzd.zzi, zzmsVarZzd.zzj);
            zzmsVarZzc.zzq = j10;
            return zzmsVarZzc;
        }
        int iZze = zzbfVar.zze(zzmsVarZzd.zzk.zza);
        if (iZze != -1) {
            zzbd zzbdVar2 = this.zzp;
            if (zzbfVar.zzd(iZze, zzbdVar2, false).zzc == zzbfVar.zzo(zzxkVar2.zza, zzbdVar2).zzc) {
                return zzmsVarZzd;
            }
        }
        Object obj2 = zzxkVar2.zza;
        zzbd zzbdVar3 = this.zzp;
        zzbfVar.zzo(obj2, zzbdVar3);
        long jZzh = zzxkVar2.zzb() ? zzbdVar3.zzh(zzxkVar2.zzb, zzxkVar2.zzc) : zzbdVar3.zzd;
        zzxk zzxkVar4 = zzxkVar2;
        zzms zzmsVarZzh3 = zzmsVarZzd.zzc(zzxkVar4, zzmsVarZzd.zzs, zzmsVarZzd.zzs, zzmsVarZzd.zzd, jZzh - zzmsVarZzd.zzs, zzmsVarZzd.zzh, zzmsVarZzd.zzi, zzmsVarZzd.zzj).zzh(zzxkVar4);
        zzmsVarZzh3.zzq = jZzh;
        return zzmsVarZzh3;
    }

    private static zzms zzam(zzms zzmsVar, int i10) {
        zzms zzmsVarZze = zzmsVar.zze(i10);
        return (i10 == 1 || i10 == 4) ? zzmsVarZze.zzg(false) : zzmsVarZze;
    }

    private final Pair zzan(zzbf zzbfVar, int i10, long j10) {
        if (zzbfVar.zzg()) {
            this.zzab = i10;
            if (j10 == C.TIME_UNSET) {
                j10 = 0;
            }
            this.zzac = j10;
            return null;
        }
        if (i10 == -1 || i10 >= zzbfVar.zza()) {
            i10 = zzbfVar.zzk(false);
            long j11 = zzbfVar.zzb(i10, this.zza, 0L).zzl;
            j10 = zzfl.zzr(0L);
        }
        return zzbfVar.zzm(this.zza, this.zzp, i10, zzfl.zzs(j10));
    }

    private final long zzao(zzbf zzbfVar, zzxk zzxkVar, long j10) {
        zzbfVar.zzo(zzxkVar.zza, this.zzp);
        return j10;
    }

    private final zzmw zzap(zzmv zzmvVar) {
        int iZzag = zzag(this.zzaa);
        zzbf zzbfVar = this.zzaa.zza;
        if (iZzag == -1) {
            iZzag = 0;
        }
        zzdo zzdoVar = this.zzv;
        zzlu zzluVar = this.zzm;
        return new zzmw(zzluVar, zzmvVar, zzbfVar, iZzag, zzdoVar, zzluVar.zzn());
    }

    private final void zzaq(Object obj) {
        Object obj2 = this.zzO;
        boolean z10 = false;
        if (obj2 != null && obj2 != obj) {
            z10 = true;
        }
        boolean zZzl = this.zzm.zzl(obj, z10 ? this.zzA : C.TIME_UNSET);
        if (z10) {
            Object obj3 = this.zzO;
            Surface surface = this.zzP;
            if (obj3 == surface) {
                surface.release();
                this.zzP = null;
            }
        }
        this.zzO = obj;
        if (zZzl) {
            return;
        }
        zzP(zzjk.zzc(new zzlv(3), BackupConstant.SCENE_CLOSED_WITHOUT_SHOW));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzar, reason: merged with bridge method [inline-methods] */
    public final void zzS(final int i10, final int i11) {
        if (i10 == this.zzR.zza() && i11 == this.zzR.zzb()) {
            return;
        }
        this.zzR = new zzeu(i10, i11);
        zzef zzefVar = this.zzn;
        zzefVar.zze(24, new zzea() { // from class: com.google.android.gms.internal.ads.zzkr
            @Override // com.google.android.gms.internal.ads.zzea
            public final /* synthetic */ void zza(Object obj) {
                int i12 = zzlh.zzd;
                ((zzaz) obj).zzu(i10, i11);
            }
        });
        zzefVar.zzf();
        zzau(2, 14, new zzeu(i10, i11));
    }

    private final void zzas() {
        int iZzh = zzh();
        if (iZzh != 2 && iZzh != 3) {
            this.zzy.zzb(false);
            this.zzz.zza(false);
        } else {
            zzat();
            boolean z10 = this.zzaa.zzp;
            this.zzy.zzb(zzk());
            this.zzz.zza(zzk());
        }
    }

    private final void zzat() {
        this.zze.zzd();
        Looper looper = this.zzt;
        if (Thread.currentThread() != looper.getThread()) {
            Object[] objArr = {Thread.currentThread().getName(), looper.getThread().getName()};
            String str = zzfl.zza;
            String str2 = String.format(Locale.US, "Player is accessed on the wrong thread.\nCurrent thread: '%s'\nExpected thread: '%s'\nSee https://developer.android.com/guide/topics/media/issues/player-accessed-on-wrong-thread", objArr);
            if (this.zzV) {
                throw new IllegalStateException(str2);
            }
            zzeg.zzd("ExoPlayerImpl", str2, this.zzW ? null : new IllegalStateException());
            this.zzW = true;
        }
    }

    private final void zzau(int i10, int i11, Object obj) {
        zzna[] zznaVarArr = this.zzh;
        int length = zznaVarArr.length;
        for (int i12 = 0; i12 < 2; i12++) {
            zzna zznaVar = zznaVarArr[i12];
            if (i10 == -1 || zznaVar.zza() == i10) {
                zzmw zzmwVarZzap = zzap(zznaVar);
                zzmwVarZzap.zzb(i11);
                zzmwVarZzap.zzd(obj);
                zzmwVarZzap.zzg();
            }
        }
        zzna[] zznaVarArr2 = this.zzi;
        int length2 = zznaVarArr2.length;
        for (int i13 = 0; i13 < 2; i13++) {
            zzna zznaVar2 = zznaVarArr2[i13];
            if (zznaVar2 != null && (i10 == -1 || zznaVar2.zza() == i10)) {
                zzmw zzmwVarZzap2 = zzap(zznaVar2);
                zzmwVarZzap2.zzb(i11);
                zzmwVarZzap2.zzd(obj);
                zzmwVarZzap2.zzg();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final long zzA() {
        zzat();
        return zzah(this.zzaa);
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final void zzB(float f10) {
        zzat();
        String str = zzfl.zza;
        final float fMax = Math.max(0.0f, Math.min(f10, 1.0f));
        if (this.zzT == fMax) {
            return;
        }
        this.zzT = fMax;
        this.zzm.zzj(fMax);
        zzef zzefVar = this.zzn;
        zzefVar.zze(22, new zzea() { // from class: com.google.android.gms.internal.ads.zzkw
            @Override // com.google.android.gms.internal.ads.zzea
            public final /* synthetic */ void zza(Object obj) {
                int i10 = zzlh.zzd;
                ((zzaz) obj).zzr(fMax);
            }
        });
        zzefVar.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final void zzC(Surface surface) {
        zzat();
        zzaq(surface);
        int i10 = surface == null ? 0 : -1;
        zzS(i10, i10);
    }

    @Override // com.google.android.gms.internal.ads.zzjv
    public final void zzD(zznp zznpVar) {
        this.zzs.zzv(zznpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzjv
    public final void zzE(zznp zznpVar) {
        zzat();
        this.zzs.zzw(zznpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzjv
    public final int zzF() {
        zzat();
        int length = this.zzh.length;
        return 2;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0097  */
    @Override // com.google.android.gms.internal.ads.zzjv
    public final void zzG(zzxm zzxmVar) {
        zzat();
        List listSingletonList = Collections.singletonList(zzxmVar);
        zzat();
        zzat();
        zzag(this.zzaa);
        zzu();
        this.zzG++;
        List list = this.zzq;
        list.clear();
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < listSingletonList.size(); i10++) {
            zzmo zzmoVar = new zzmo((zzxm) listSingletonList.get(i10), this.zzr);
            arrayList.add(zzmoVar);
            list.add(i10, new zzld(zzmoVar.zzb, zzmoVar.zza));
        }
        this.zzad = this.zzad.zzg().zzf(0, arrayList.size());
        zzmy zzmyVar = new zzmy(list, this.zzad);
        if (!zzmyVar.zzg() && zzmyVar.zza() < 0) {
            throw new zzw(zzmyVar, -1, C.TIME_UNSET);
        }
        int iZzk = zzmyVar.zzk(false);
        zzms zzmsVarZzal = zzal(this.zzaa, zzmyVar, zzan(zzmyVar, iZzk, C.TIME_UNSET));
        int i11 = zzmsVarZzal.zze;
        if (i11 == 1) {
            i11 = 1;
        } else if (zzmyVar.zzg()) {
            i11 = 4;
        } else if (iZzk != -1) {
            if (iZzk >= zzmyVar.zza()) {
                i11 = 4;
            } else {
                i11 = 2;
            }
        }
        zzms zzmsVarZzam = zzam(zzmsVarZzal, i11);
        this.zzm.zzy(arrayList, iZzk, zzfl.zzs(C.TIME_UNSET), this.zzad);
        zzaj(zzmsVarZzam, 0, (this.zzaa.zzb.zza.equals(zzmsVarZzam.zzb.zza) || this.zzaa.zza.zzg()) ? false : true, 4, zzai(zzmsVarZzam), -1, false);
    }

    @Override // com.google.android.gms.internal.ads.zzjv
    public final void zzH() {
        String hexString = Integer.toHexString(System.identityHashCode(this));
        String str = zzfl.zza;
        String strZza = zzal.zza();
        int length = String.valueOf(hexString).length();
        StringBuilder sb2 = new StringBuilder(length + 39 + String.valueOf(str).length() + 3 + String.valueOf(strZza).length() + 1);
        sb2.append("Release ");
        sb2.append(hexString);
        sb2.append(" [AndroidXMedia3/1.10.0-rc02] [");
        sb2.append(str);
        sb2.append("] [");
        sb2.append(strZza);
        sb2.append("]");
        zzeg.zzb("ExoPlayerImpl", sb2.toString());
        zzat();
        this.zzy.zzb(false);
        this.zzz.zza(false);
        zzlg zzlgVar = this.zzD;
        if (zzlgVar != null && Build.VERSION.SDK_INT >= 34) {
            zzlgVar.zza();
        }
        this.zzC.zza();
        if (!this.zzm.zzm()) {
            zzef zzefVar = this.zzn;
            zzefVar.zze(10, zzkv.zza);
            zzefVar.zzf();
        }
        this.zzn.zzg();
        this.zzk.zzl(null);
        zzabq zzabqVar = this.zzu;
        zznm zznmVar = this.zzs;
        zzabqVar.zzg(zznmVar);
        zzms zzmsVar = this.zzaa;
        boolean z10 = zzmsVar.zzp;
        zzms zzmsVarZzam = zzam(zzmsVar, 1);
        this.zzaa = zzmsVarZzam;
        zzms zzmsVarZzh = zzmsVarZzam.zzh(zzmsVarZzam.zzb);
        this.zzaa = zzmsVarZzh;
        zzmsVarZzh.zzq = zzmsVarZzh.zzs;
        this.zzaa.zzr = 0L;
        zznmVar.zzy();
        Surface surface = this.zzP;
        if (surface != null) {
            surface.release();
            this.zzP = null;
        }
        int i10 = zzcz.zza;
        this.zzY = true;
    }

    public final zzjk zzI() {
        zzat();
        return this.zzaa.zzf;
    }

    final /* synthetic */ void zzJ(zzaz zzazVar, zzs zzsVar) {
        zzazVar.zza(this.zzg, new zzay(zzsVar));
    }

    final /* synthetic */ void zzK(final zzlr zzlrVar) {
        this.zzk.zzm(new Runnable() { // from class: com.google.android.gms.internal.ads.zzkt
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzO(zzlrVar);
            }
        });
    }

    final /* synthetic */ void zzL(int i10, final int i11) {
        zzat();
        Integer numValueOf = Integer.valueOf(i11);
        zzau(1, 10, numValueOf);
        zzau(2, 10, numValueOf);
        zzea zzeaVar = new zzea() { // from class: com.google.android.gms.internal.ads.zzks
            @Override // com.google.android.gms.internal.ads.zzea
            public final /* synthetic */ void zza(Object obj) {
                int i12 = zzlh.zzd;
                ((zzaz) obj).zzq(i11);
            }
        };
        zzef zzefVar = this.zzn;
        zzefVar.zze(21, zzeaVar);
        zzefVar.zzf();
    }

    final /* synthetic */ void zzM() {
        String str = zzfl.zza;
        int iGenerateAudioSessionId = zzcj.zza(this.zzf).generateAudioSessionId();
        if (iGenerateAudioSessionId == -1) {
            iGenerateAudioSessionId = 0;
        }
        zzdm zzdmVar = this.zzB;
        if (((Integer) zzdmVar.zza()).intValue() != iGenerateAudioSessionId) {
            Integer numValueOf = Integer.valueOf(iGenerateAudioSessionId);
            zzdmVar.zzc(numValueOf);
            zzau(1, 10, numValueOf);
            zzau(2, 10, numValueOf);
        }
    }

    final /* synthetic */ void zzN(zzaz zzazVar) {
        zzazVar.zzg(this.zzM);
    }

    final /* synthetic */ void zzO(zzlr zzlrVar) {
        int i10;
        long j10;
        boolean z10;
        int i11 = this.zzG - zzlrVar.zzb;
        this.zzG = i11;
        boolean z11 = true;
        if (zzlrVar.zzc) {
            this.zzH = zzlrVar.zzd;
            this.zzI = true;
        }
        if (i11 == 0) {
            zzbf zzbfVar = zzlrVar.zza.zza;
            int iZzs = -1;
            if (!this.zzaa.zza.zzg() && zzbfVar.zzg()) {
                this.zzab = -1;
                this.zzac = 0L;
            }
            if (!zzbfVar.zzg()) {
                List listZzw = ((zzmy) zzbfVar).zzw();
                int size = listZzw.size();
                List list = this.zzq;
                zzgtj.zzi(size == list.size());
                for (int i12 = 0; i12 < listZzw.size(); i12++) {
                    ((zzld) list.get(i12)).zzc((zzbf) listZzw.get(i12));
                }
            }
            boolean z12 = this.zzI;
            long j11 = C.TIME_UNSET;
            if (z12) {
                boolean z13 = zzlrVar.zza.zza.zzg() && this.zzaa.zza.zzg();
                boolean zEquals = zzlrVar.zza.zzb.equals(this.zzaa.zzb);
                long j12 = zzlrVar.zza.zzd;
                long j13 = this.zzaa.zzs;
                if (z13 || (zEquals && j12 == j13)) {
                    z11 = false;
                }
                if (z11) {
                    iZzs = zzs();
                    if (zzbfVar.zzg() || zzlrVar.zza.zzb.zzb()) {
                        j11 = zzlrVar.zza.zzd;
                    } else {
                        zzms zzmsVar = zzlrVar.zza;
                        zzxk zzxkVar = zzmsVar.zzb;
                        long j14 = zzmsVar.zzd;
                        zzao(zzbfVar, zzxkVar, j14);
                        j11 = j14;
                    }
                }
                z10 = z11;
                long j15 = j11;
                i10 = iZzs;
                j10 = j15;
            } else {
                i10 = -1;
                j10 = -9223372036854775807L;
                z10 = false;
            }
            this.zzI = false;
            zzaj(zzlrVar.zza, 1, z10, this.zzH, j10, i10, false);
        }
    }

    final /* synthetic */ void zzQ(SurfaceTexture surfaceTexture) {
        Surface surface = new Surface(surfaceTexture);
        zzaq(surface);
        this.zzP = surface;
    }

    final /* synthetic */ void zzR(Object obj) {
        zzaq(null);
    }

    final /* synthetic */ void zzT(int i10, int i11, Object obj) {
        zzau(1, 19, obj);
    }

    final /* synthetic */ zzef zzU() {
        return this.zzn;
    }

    final /* synthetic */ zznm zzV() {
        return this.zzs;
    }

    final /* synthetic */ Looper zzW() {
        return this.zzt;
    }

    final /* synthetic */ zzdo zzX() {
        return this.zzv;
    }

    final /* synthetic */ zzdm zzY() {
        return this.zzB;
    }

    final /* synthetic */ zzjx zzZ() {
        return this.zzE;
    }

    final /* synthetic */ zzjx zzaa() {
        return this.zzF;
    }

    final /* synthetic */ Object zzab() {
        return this.zzO;
    }

    final /* synthetic */ boolean zzac() {
        return this.zzU;
    }

    final /* synthetic */ void zzad(boolean z10) {
        this.zzU = z10;
    }

    final /* synthetic */ boolean zzae() {
        return this.zzY;
    }

    @Override // com.google.android.gms.internal.ads.zzf
    protected final void zzc(int i10, long j10, int i11, boolean z10) {
        zzat();
        if (i10 == -1) {
            return;
        }
        zzgtj.zza(i10 >= 0);
        zzbf zzbfVar = this.zzaa.zza;
        if (zzbfVar.zzg() || i10 < zzbfVar.zza()) {
            this.zzs.zzA();
            this.zzG++;
            if (zzx()) {
                zzeg.zzc("ExoPlayerImpl", "seekTo ignored because an ad is playing");
                zzlr zzlrVar = new zzlr(this.zzaa);
                zzlrVar.zza(1);
                this.zzl.zza(zzlrVar);
                return;
            }
            zzms zzmsVarZzam = this.zzaa;
            int i12 = zzmsVarZzam.zze;
            if (i12 == 3 || (i12 == 4 && !zzbfVar.zzg())) {
                zzmsVarZzam = zzam(this.zzaa, 2);
            }
            int iZzs = zzs();
            zzms zzmsVarZzal = zzal(zzmsVarZzam, zzbfVar, zzan(zzbfVar, i10, j10));
            this.zzm.zzf(zzbfVar, i10, zzfl.zzs(j10));
            zzaj(zzmsVarZzal, 0, true, 1, zzai(zzmsVarZzal), iZzs, false);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final Looper zzd() {
        return this.zzt;
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final void zze(zzaz zzazVar) {
        zzazVar.getClass();
        this.zzn.zzc(zzazVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final void zzf(zzaz zzazVar) {
        zzat();
        zzazVar.getClass();
        this.zzn.zzd(zzazVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final void zzg() {
        zzat();
        zzms zzmsVar = this.zzaa;
        if (zzmsVar.zze != 1) {
            return;
        }
        zzms zzmsVarZzf = zzmsVar.zzf(null);
        zzms zzmsVarZzam = zzam(zzmsVarZzf, true != zzmsVarZzf.zza.zzg() ? 2 : 4);
        this.zzG++;
        this.zzm.zzd();
        zzaj(zzmsVarZzam, 1, false, 5, C.TIME_UNSET, -1, false);
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final int zzh() {
        zzat();
        return this.zzaa.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final int zzi() {
        zzat();
        return this.zzaa.zzn;
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final void zzj(boolean z10) {
        zzat();
        zzms zzmsVar = this.zzaa;
        int i10 = zzmsVar.zzn;
        int i11 = 0;
        if (i10 == 1) {
            if (z10) {
                i10 = 1;
            } else {
                i10 = 1;
                i11 = 1;
            }
        }
        if (zzmsVar.zzl == z10 && i10 == i11 && zzmsVar.zzm == 1) {
            return;
        }
        this.zzG++;
        zzms zzmsVarZzi = zzmsVar.zzi(z10, 1, i11);
        this.zzm.zze(z10, 1, i11);
        zzaj(zzmsVarZzi, 0, false, 5, C.TIME_UNSET, -1, false);
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final boolean zzk() {
        zzat();
        return this.zzaa.zzl;
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final int zzl() {
        zzat();
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final boolean zzm() {
        zzat();
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final zzav zzn() {
        zzat();
        return this.zzaa.zzo;
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final void zzo() {
        zzat();
        zzP(null);
        new zzcz(zzgwm.zzi(), this.zzaa.zzs);
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final zzbn zzp() {
        zzat();
        return this.zzaa.zzi.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final zzbf zzq() {
        zzat();
        return this.zzaa.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final int zzr() {
        zzat();
        if (!this.zzaa.zza.zzg()) {
            zzms zzmsVar = this.zzaa;
            return zzmsVar.zza.zze(zzmsVar.zzb.zza);
        }
        int i10 = this.zzab;
        if (i10 == -1) {
            return 0;
        }
        return i10;
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final int zzs() {
        zzat();
        int iZzag = zzag(this.zzaa);
        if (iZzag == -1) {
            return 0;
        }
        return iZzag;
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final long zzt() {
        zzat();
        if (!zzx()) {
            zzbf zzbfVarZzq = zzq();
            return zzbfVarZzq.zzg() ? C.TIME_UNSET : zzfl.zzr(zzbfVarZzq.zzb(zzs(), this.zza, 0L).zzm);
        }
        zzms zzmsVar = this.zzaa;
        zzxk zzxkVar = zzmsVar.zzb;
        zzbf zzbfVar = zzmsVar.zza;
        Object obj = zzxkVar.zza;
        zzbd zzbdVar = this.zzp;
        zzbfVar.zzo(obj, zzbdVar);
        return zzfl.zzr(zzbdVar.zzh(zzxkVar.zzb, zzxkVar.zzc));
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final long zzu() {
        zzat();
        return zzfl.zzr(zzai(this.zzaa));
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final long zzv() {
        zzat();
        if (zzx()) {
            zzms zzmsVar = this.zzaa;
            return zzmsVar.zzk.equals(zzmsVar.zzb) ? zzfl.zzr(this.zzaa.zzq) : zzt();
        }
        zzat();
        if (this.zzaa.zza.zzg()) {
            return this.zzac;
        }
        zzms zzmsVar2 = this.zzaa;
        long j10 = 0;
        if (zzmsVar2.zzk.zzd != zzmsVar2.zzb.zzd) {
            return zzfl.zzr(zzmsVar2.zza.zzb(zzs(), this.zza, 0L).zzm);
        }
        long j11 = zzmsVar2.zzq;
        if (this.zzaa.zzk.zzb()) {
            zzms zzmsVar3 = this.zzaa;
            zzmsVar3.zza.zzo(zzmsVar3.zzk.zza, this.zzp).zzc(this.zzaa.zzk.zzb);
        } else {
            j10 = j11;
        }
        zzms zzmsVar4 = this.zzaa;
        zzao(zzmsVar4.zza, zzmsVar4.zzk, j10);
        return zzfl.zzr(j10);
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final long zzw() {
        zzat();
        return zzfl.zzr(this.zzaa.zzr);
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final boolean zzx() {
        zzat();
        return this.zzaa.zzb.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final int zzy() {
        zzat();
        if (zzx()) {
            return this.zzaa.zzb.zzb;
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final int zzz() {
        zzat();
        if (zzx()) {
            return this.zzaa.zzb.zzc;
        }
        return -1;
    }
}
