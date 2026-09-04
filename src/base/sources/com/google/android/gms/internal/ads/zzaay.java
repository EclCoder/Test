package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Point;
import android.os.Build;
import android.text.TextUtils;
import android.util.Pair;
import android.view.accessibility.CaptioningManager;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzaay extends zzabe implements zznb {
    public static final /* synthetic */ int zzb = 0;
    private static final zzgyg zzc = zzgyg.zzc(zzaah.zza);
    public final Context zza;
    private final Object zzd;
    private zzaam zze;
    private Thread zzf;
    private zzacm zzg;
    private zzd zzh;
    private Boolean zzi;
    private final zzzt zzj;

    public zzaay(Context context) {
        zzzt zzztVar = new zzzt();
        zzaam zzaamVar = zzaam.zzJ;
        this.zzd = new Object();
        byte[] bArr = null;
        this.zza = context != null ? context.getApplicationContext() : null;
        this.zzj = zzztVar;
        if (zzaamVar != null) {
            this.zze = zzaamVar;
        } else {
            zzaal zzaalVar = new zzaal(zzaamVar, bArr);
            zzaalVar.zzx((zzbl) zzaamVar);
            this.zze = new zzaam(zzaalVar, bArr);
        }
        this.zzh = zzd.zza;
        if (this.zze.zzU && context == null) {
            zzeg.zzc("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
    }

    private static Pair zzA(zzaaz[] zzaazVarArr, int i10) {
        for (int i11 = 0; i11 < 2; i11++) {
            zzaaz zzaazVar = zzaazVarArr[i11];
            if (zzaazVar != null && zzaazVar.zza.zzc == i10) {
                return Pair.create(zzaazVar, Integer.valueOf(i11));
            }
        }
        return null;
    }

    private static final Pair zzB(int i10, zzabd zzabdVar, int[][][] iArr, zzaap zzaapVar, Comparator comparator) {
        RandomAccess randomAccessZzj;
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < 2; i11++) {
            if (i10 == zzabdVar.zza(i11)) {
                zzzn zzznVarZzb = zzabdVar.zzb(i11);
                for (int i12 = 0; i12 < zzznVarZzb.zzb; i12++) {
                    zzbg zzbgVarZza = zzznVarZzb.zza(i12);
                    List listZza = zzaapVar.zza(i11, zzbgVarZza, iArr[i11][i12]);
                    int i13 = zzbgVarZza.zza;
                    boolean[] zArr = new boolean[i13];
                    int i14 = 0;
                    while (i14 < i13) {
                        int i15 = i14 + 1;
                        zzaaq zzaaqVar = (zzaaq) listZza.get(i14);
                        int iZza = zzaaqVar.zza();
                        if (!zArr[i14] && iZza != 0) {
                            if (iZza == 1) {
                                randomAccessZzj = zzgwm.zzj(zzaaqVar);
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add(zzaaqVar);
                                for (int i16 = i15; i16 < i13; i16++) {
                                    zzaaq zzaaqVar2 = (zzaaq) listZza.get(i16);
                                    if (zzaaqVar2.zza() == 2 && zzaaqVar.zzc(zzaaqVar2)) {
                                        arrayList2.add(zzaaqVar2);
                                        zArr[i16] = true;
                                    }
                                }
                                randomAccessZzj = arrayList2;
                            }
                            arrayList.add(randomAccessZzj);
                        }
                        i14 = i15;
                    }
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        List list = (List) Collections.max(arrayList, comparator);
        int[] iArr2 = new int[list.size()];
        for (int i17 = 0; i17 < list.size(); i17++) {
            iArr2[i17] = ((zzaaq) list.get(i17)).zzc;
        }
        zzaaq zzaaqVar3 = (zzaaq) list.get(0);
        return Pair.create(new zzaaz(zzaaqVar3.zzb, iArr2, 0), Integer.valueOf(zzaaqVar3.zza));
    }

    protected static String zzi(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, C.LANGUAGE_UNDETERMINED)) {
            return null;
        }
        return str;
    }

    protected static int zzj(zzv zzvVar, String str, boolean z10) {
        if (!TextUtils.isEmpty(str) && str.equals(zzvVar.zzd)) {
            return 4;
        }
        String strZzi = zzi(str);
        String strZzi2 = zzi(zzvVar.zzd);
        if (strZzi2 == null || strZzi == null) {
            return (z10 && strZzi2 == null) ? 1 : 0;
        }
        if (strZzi2.startsWith(strZzi) || strZzi.startsWith(strZzi2)) {
            return 3;
        }
        String str2 = zzfl.zza;
        return strZzi2.split("-", 2)[0].equals(strZzi.split("-", 2)[0]) ? 2 : 0;
    }

    static /* synthetic */ int zzm(int i10, int i11) {
        if (i10 == 0 || i10 != i11) {
            return Integer.bitCount(i10 & i11);
        }
        return Integer.MAX_VALUE;
    }

    static /* synthetic */ int zzn(zzv zzvVar, zzgwm zzgwmVar) {
        for (int i10 = 0; i10 < zzgwmVar.size(); i10++) {
            int i11 = 0;
            while (true) {
                List list = zzvVar.zzc;
                if (i11 < list.size()) {
                    if (((zzx) list.get(i11)).zzb.equals(zzgwmVar.get(i10))) {
                        return i10;
                    }
                    i11++;
                }
            }
        }
        return Integer.MAX_VALUE;
    }

    protected static final zzaaz zzp(int i10, zzzn zzznVar, int[][] iArr, zzaam zzaamVar) {
        int i11 = zzaamVar.zzw.zzb;
        int i12 = 0;
        zzbg zzbgVar = null;
        zzaak zzaakVar = null;
        for (int i13 = 0; i13 < zzznVar.zzb; i13++) {
            zzbg zzbgVarZza = zzznVar.zza(i13);
            int[] iArr2 = iArr[i13];
            for (int i14 = 0; i14 < zzbgVarZza.zza; i14++) {
                if (zznc.zzac(iArr2[i14], zzaamVar.zzV)) {
                    zzaak zzaakVar2 = new zzaak(zzbgVarZza.zza(i14), iArr2[i14]);
                    if (zzaakVar == null || zzaakVar2.compareTo(zzaakVar) > 0) {
                        zzbgVar = zzbgVarZza;
                        i12 = i14;
                        zzaakVar = zzaakVar2;
                    }
                }
            }
        }
        if (zzbgVar == null) {
            return null;
        }
        return new zzaaz(zzbgVar, new int[]{i12}, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzv, reason: merged with bridge method [inline-methods] */
    public final void zzk() {
        boolean z10;
        zzacm zzacmVar;
        synchronized (this.zzd) {
            try {
                z10 = false;
                if (this.zze.zzU && Build.VERSION.SDK_INT >= 32 && (zzacmVar = this.zzg) != null && zzacmVar.zzb()) {
                    z10 = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (z10) {
            zzt();
        }
    }

    private static void zzw(zzabd zzabdVar, zzbl zzblVar, zzaaz[] zzaazVarArr) {
        HashMap map = new HashMap();
        for (int i10 = 0; i10 < 2; i10++) {
            zzx(zzabdVar.zzb(i10), zzblVar, map);
        }
        zzx(zzabdVar.zze(), zzblVar, map);
        for (int i11 = 0; i11 < 2; i11++) {
            if (((zzbh) map.get(Integer.valueOf(zzabdVar.zza(i11)))) != null) {
                throw null;
            }
        }
    }

    private static void zzx(zzzn zzznVar, zzbl zzblVar, Map map) {
        for (int i10 = 0; i10 < zzznVar.zzb; i10++) {
            if (((zzbh) zzblVar.zzH.get(zzznVar.zza(i10))) != null) {
                throw null;
            }
        }
    }

    private static void zzy(zzabd zzabdVar, zzaam zzaamVar, zzaaz[] zzaazVarArr) {
        for (int i10 = 0; i10 < 2; i10++) {
            zzzn zzznVarZzb = zzabdVar.zzb(i10);
            if (zzaamVar.zzb(i10, zzznVarZzb)) {
                if (zzaamVar.zzc(i10, zzznVarZzb) != null) {
                    throw null;
                }
                zzaazVarArr[i10] = null;
            }
        }
    }

    private static void zzz(zzabd zzabdVar, zzaam zzaamVar, zzaaz[] zzaazVarArr) {
        for (int i10 = 0; i10 < 2; i10++) {
            int iZza = zzabdVar.zza(i10);
            if (zzaamVar.zza(i10) || zzaamVar.zzI.contains(Integer.valueOf(iZza))) {
                zzaazVarArr[i10] = null;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zznb
    public final void zza(zzna zznaVar) {
        synchronized (this.zzd) {
            boolean z10 = this.zze.zzY;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzabh
    public final void zzb() {
        zzacm zzacmVar;
        synchronized (this.zzd) {
            try {
                Thread thread = this.zzf;
                if (thread != null) {
                    zzgtj.zzj(thread == Thread.currentThread(), "DefaultTrackSelector is accessed on the wrong thread.");
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (Build.VERSION.SDK_INT >= 32 && (zzacmVar = this.zzg) != null) {
            zzacmVar.zzg();
            this.zzg = null;
        }
        super.zzb();
    }

    public final zzaam zzc() {
        zzaam zzaamVar;
        synchronized (this.zzd) {
            zzaamVar = this.zze;
        }
        return zzaamVar;
    }

    @Override // com.google.android.gms.internal.ads.zzabh
    public final boolean zzd() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzabh
    public final void zze(zzd zzdVar) {
        if (this.zzh.equals(zzdVar)) {
            return;
        }
        this.zzh = zzdVar;
        zzk();
    }

    public final void zzf(zzaal zzaalVar) {
        boolean zEquals;
        zzaam zzaamVar = new zzaam(zzaalVar, null);
        synchronized (this.zzd) {
            zEquals = this.zze.equals(zzaamVar);
            this.zze = zzaamVar;
        }
        if (zEquals) {
            return;
        }
        if (zzaamVar.zzU && this.zza == null) {
            zzeg.zzc("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
        zzt();
    }

    @Override // com.google.android.gms.internal.ads.zzabe
    protected final Pair zzh(zzabd zzabdVar, int[][][] iArr, final int[] iArr2, zzxk zzxkVar, zzbf zzbfVar) {
        final zzaam zzaamVar;
        final String str;
        zzzt zzztVar;
        int[] iArr3;
        int length;
        zzaba zzabaVarZza;
        int i10;
        int i11;
        final String languageTag;
        Context context;
        CaptioningManager captioningManager;
        Locale locale;
        Context context2;
        final boolean z10;
        Context context3;
        synchronized (this.zzd) {
            this.zzf = Thread.currentThread();
            zzaamVar = this.zze;
        }
        if (this.zzi == null && (context3 = this.zza) != null) {
            this.zzi = Boolean.valueOf(zzfl.zzP(context3));
        }
        if (zzaamVar.zzU && Build.VERSION.SDK_INT >= 32 && this.zzg == null) {
            this.zzg = new zzacm(this.zza, new Runnable() { // from class: com.google.android.gms.internal.ads.zzaai
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzk();
                }
            }, this.zzi);
        }
        zzaaz[] zzaazVarArr = new zzaaz[2];
        zzw(zzabdVar, zzaamVar, zzaazVarArr);
        zzy(zzabdVar, zzaamVar, zzaazVarArr);
        zzz(zzabdVar, zzaamVar, zzaazVarArr);
        Pair pairZzA = zzA(zzaazVarArr, 1);
        int i12 = 0;
        if (pairZzA == null) {
            int i13 = 0;
            while (true) {
                if (i13 >= 2) {
                    z10 = false;
                    break;
                }
                if (zzabdVar.zza(i13) == 2 && zzabdVar.zzb(i13).zzb > 0) {
                    z10 = true;
                    break;
                }
                i13++;
            }
            pairZzA = zzB(1, zzabdVar, iArr, new zzaap() { // from class: com.google.android.gms.internal.ads.zzaad
                @Override // com.google.android.gms.internal.ads.zzaap
                public final /* synthetic */ List zza(int i14, zzbg zzbgVar, int[] iArr4) {
                    final zzaay zzaayVar = this.zza;
                    final zzaam zzaamVar2 = zzaamVar;
                    zzgtk zzgtkVar = new zzgtk() { // from class: com.google.android.gms.internal.ads.zzaag
                        @Override // com.google.android.gms.internal.ads.zzgtk
                        public final /* synthetic */ boolean zza(Object obj) {
                            return zzaayVar.zzl(zzaamVar2, (zzv) obj);
                        }
                    };
                    int i15 = iArr2[i14];
                    int i16 = zzgwm.zzd;
                    zzgwj zzgwjVar = new zzgwj();
                    for (int i17 = 0; i17 < zzbgVar.zza; i17++) {
                        zzgwjVar.zzf(new zzzx(i14, zzbgVar, i17, zzaamVar2, iArr4[i17], z10, zzgtkVar, i15));
                    }
                    return zzgwjVar.zzi();
                }
            }, zzzy.zza);
            if (pairZzA != null) {
                zzaazVarArr[((Integer) pairZzA.second).intValue()] = (zzaaz) pairZzA.first;
            }
        }
        if (pairZzA == null) {
            str = null;
        } else {
            Object obj = pairZzA.first;
            str = ((zzaaz) obj).zza.zza(((zzaaz) obj).zzb[0]).zzd;
        }
        Pair pairZzA2 = zzA(zzaazVarArr, 2);
        Pair pairZzA3 = zzA(zzaazVarArr, 4);
        if (pairZzA2 == null && pairZzA3 == null) {
            int i14 = zzaamVar.zzw.zzb;
            final Point pointZzR = (!zzaamVar.zzk || (context2 = this.zza) == null) ? null : zzfl.zzR(context2);
            Pair pairZzB = zzB(2, zzabdVar, iArr, new zzaap() { // from class: com.google.android.gms.internal.ads.zzaac
                /* JADX WARN: Code duplicated, block: B:29:0x004d  */
                @Override // com.google.android.gms.internal.ads.zzaap
                public final /* synthetic */ List zza(int i15, zzbg zzbgVar, int[] iArr4) {
                    int i16;
                    int i17;
                    int i18;
                    int i19;
                    int i20;
                    int i21;
                    Point point;
                    zzbg zzbgVar2 = zzbgVar;
                    int i22 = zzaay.zzb;
                    Point point2 = pointZzR;
                    int i23 = iArr2[i15];
                    zzaam zzaamVar2 = zzaamVar;
                    int i24 = point2 != null ? point2.x : zzaamVar2.zzi;
                    int i25 = point2 != null ? point2.y : zzaamVar2.zzj;
                    boolean z11 = zzaamVar2.zzl;
                    if (i24 == Integer.MAX_VALUE) {
                        i16 = -1;
                        i17 = Integer.MAX_VALUE;
                    } else if (i25 == Integer.MAX_VALUE) {
                        i17 = Integer.MAX_VALUE;
                        i16 = -1;
                    } else {
                        int i26 = Integer.MAX_VALUE;
                        for (int i27 = 0; i27 < zzbgVar2.zza; i27++) {
                            zzv zzvVarZza = zzbgVar2.zza(i27);
                            int i28 = zzvVarZza.zzw;
                            if (i28 > 0 && (i19 = zzvVarZza.zzx) > 0) {
                                if (!z11) {
                                    i20 = i25;
                                    i21 = i24;
                                } else if ((i28 > i19) != (i24 > i25)) {
                                    i21 = i25;
                                    i20 = i24;
                                } else {
                                    i20 = i25;
                                    i21 = i24;
                                }
                                int i29 = i28 * i20;
                                int i30 = i19 * i21;
                                if (i29 >= i30) {
                                    String str2 = zzfl.zza;
                                    point = new Point(i21, ((i30 + i28) - 1) / i28);
                                } else {
                                    String str3 = zzfl.zza;
                                    point = new Point(((i29 + i19) - 1) / i19, i20);
                                }
                                int i31 = i28 * i19;
                                if (i28 >= ((int) (point.x * 0.98f)) && i19 >= ((int) (point.y * 0.98f)) && i31 < i26) {
                                    i26 = i31;
                                }
                            }
                        }
                        i16 = -1;
                        i17 = i26;
                    }
                    int i32 = zzgwm.zzd;
                    zzgwj zzgwjVar = new zzgwj();
                    int i33 = 0;
                    while (i33 < zzbgVar2.zza) {
                        int iZzc = zzbgVar2.zza(i33).zzc();
                        if (i17 != Integer.MAX_VALUE) {
                            i18 = i16;
                            boolean z12 = iZzc != i18 && iZzc <= i17;
                            zzgwjVar.zzf(new zzaax(i15, zzbgVar2, i33, zzaamVar2, iArr4[i33], str, i23, z12));
                            i33++;
                            zzbgVar2 = zzbgVar;
                            i16 = i18;
                        } else {
                            i18 = i16;
                        }
                        zzgwjVar.zzf(new zzaax(i15, zzbgVar2, i33, zzaamVar2, iArr4[i33], str, i23, z12));
                        i33++;
                        zzbgVar2 = zzbgVar;
                        i16 = i18;
                    }
                    return zzgwjVar.zzi();
                }
            }, zzaab.zza);
            Pair pairZzB2 = pairZzB == null ? zzB(4, zzabdVar, iArr, new zzaap() { // from class: com.google.android.gms.internal.ads.zzaaf
                @Override // com.google.android.gms.internal.ads.zzaap
                public final /* synthetic */ List zza(int i15, zzbg zzbgVar, int[] iArr4) {
                    int i16 = zzaay.zzb;
                    int i17 = zzgwm.zzd;
                    zzgwj zzgwjVar = new zzgwj();
                    for (int i18 = 0; i18 < zzbgVar.zza; i18++) {
                        zzgwjVar.zzf(new zzaaj(i15, zzbgVar, i18, zzaamVar, iArr4[i18]));
                    }
                    return zzgwjVar.zzi();
                }
            }, zzzz.zza) : null;
            if (pairZzB2 != null) {
                zzaazVarArr[((Integer) pairZzB2.second).intValue()] = (zzaaz) pairZzB2.first;
            } else if (pairZzB != null) {
                zzaazVarArr[((Integer) pairZzB.second).intValue()] = (zzaaz) pairZzB.first;
            }
        }
        if (zzA(zzaazVarArr, 3) == null) {
            int i15 = zzaamVar.zzw.zzb;
            if (!zzaamVar.zzB || (context = this.zza) == null || (captioningManager = (CaptioningManager) context.getSystemService("captioning")) == null || !captioningManager.isEnabled() || (locale = captioningManager.getLocale()) == null) {
                languageTag = null;
            } else {
                String str2 = zzfl.zza;
                languageTag = locale.toLanguageTag();
            }
            Pair pairZzB3 = zzB(3, zzabdVar, iArr, new zzaap() { // from class: com.google.android.gms.internal.ads.zzaae
                @Override // com.google.android.gms.internal.ads.zzaap
                public final /* synthetic */ List zza(int i16, zzbg zzbgVar, int[] iArr4) {
                    int i17 = zzaay.zzb;
                    int i18 = zzgwm.zzd;
                    zzgwj zzgwjVar = new zzgwj();
                    for (int i19 = 0; i19 < zzbgVar.zza; i19++) {
                        zzgwjVar.zzf(new zzaao(i16, zzbgVar, i19, zzaamVar, iArr4[i19], str, languageTag));
                    }
                    return zzgwjVar.zzi();
                }
            }, zzaaa.zza);
            if (pairZzB3 != null) {
                zzaazVarArr[((Integer) pairZzB3.second).intValue()] = (zzaaz) pairZzB3.first;
            }
        }
        int i16 = zzaamVar.zzw.zzb;
        zzgwv zzgwvVar = new zzgwv();
        int i17 = 0;
        while (i17 < 2) {
            zzaaz zzaazVar = zzaazVarArr[i17];
            if (zzaazVar == null || zzaamVar.zza(i17)) {
                i11 = i12;
            } else {
                zzgww zzgwwVar = zzaamVar.zzI;
                zzbg zzbgVar = zzaazVar.zza;
                i11 = i12;
                if (!zzgwwVar.contains(Integer.valueOf(zzbgVar.zzc))) {
                    zzgwvVar.zzf(zzbgVar.zzb);
                    int i18 = i11;
                    while (true) {
                        int[] iArr4 = zzaazVar.zzb;
                        if (i18 < iArr4.length) {
                            String str3 = zzbgVar.zza(iArr4[i18]).zzn;
                            if (str3 != null) {
                                zzgwvVar.zzf(str3);
                            }
                            i18++;
                        }
                    }
                }
            }
            i17++;
            i12 = i11;
        }
        int i19 = i12;
        zzgww zzgwwVarZzh = zzgwvVar.zzh();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i20 = i19; i20 < 2; i20++) {
            if (zzabdVar.zza(i20) == 5) {
                zzzn zzznVarZzb = zzabdVar.zzb(i20);
                for (int i21 = i19; i21 < zzznVarZzb.zzb; i21++) {
                    zzbg zzbgVarZza = zzznVarZzb.zza(i21);
                    arrayList.add(zzbgVarZza);
                    int[] iArr5 = (int[]) iArr[i20][i21].clone();
                    for (int i22 = i19; i22 < iArr5.length; i22++) {
                        String str4 = zzbgVarZza.zza(i22).zzn;
                        if (str4 != null && !zzgwwVarZzh.contains(str4)) {
                            iArr5[i22] = 128;
                        }
                    }
                    arrayList2.add(iArr5);
                }
            }
        }
        int i23 = 128;
        zzbg[] zzbgVarArr = new zzbg[arrayList.size()];
        zzfl.zzc(arrayList, zzbgVarArr);
        zzzn zzznVar = new zzzn(zzbgVarArr);
        int[][] iArr6 = new int[arrayList2.size()][];
        zzfl.zzc(arrayList2, iArr6);
        int i24 = i19;
        while (i24 < 2) {
            if (zzabdVar.zza(i24) == 5) {
                zzaaz zzaazVarZzp = zzp(5, zzznVar, iArr6, zzaamVar);
                zzaazVarArr[i24] = zzaazVarZzp;
                if (zzaazVarZzp == null) {
                    break;
                }
                i10 = i23;
                Arrays.fill(iArr6[zzznVar.zzb(zzaazVarZzp.zza)], i10);
            } else {
                i10 = i23;
            }
            i24++;
            i23 = i10;
        }
        for (int i25 = i19; i25 < 2; i25++) {
            int iZza = zzabdVar.zza(i25);
            if (iZza != 2 && iZza != 1) {
                if (iZza != 3 && iZza != 4 && iZza != 5 && zzaazVarArr[i25] == null) {
                    zzaazVarArr[i25] = zzp(iZza, zzabdVar.zzb(i25), iArr[i25], zzaamVar);
                }
            }
        }
        zzw(zzabdVar, zzaamVar, zzaazVarArr);
        zzy(zzabdVar, zzaamVar, zzaazVarArr);
        zzz(zzabdVar, zzaamVar, zzaazVarArr);
        zzzt zzztVar2 = this.zzj;
        zzabq zzabqVarZzu = zzu();
        zzgwm zzgwmVarZzd = zzzu.zzd(zzaazVarArr);
        zzaba[] zzabaVarArr = new zzaba[2];
        int i26 = i19;
        while (i26 < 2) {
            zzaaz zzaazVar2 = zzaazVarArr[i26];
            if (zzaazVar2 == null || (length = (iArr3 = zzaazVar2.zzb).length) == 0) {
                zzztVar = zzztVar2;
            } else {
                if (length == 1) {
                    zzabaVarZza = new zzabb(zzaazVar2.zza, iArr3[i19], 0, 0, null);
                    zzztVar = zzztVar2;
                } else {
                    zzztVar = zzztVar2;
                    zzabaVarZza = zzztVar.zza(zzaazVar2.zza, iArr3, 0, zzabqVarZzu, (zzgwm) zzgwmVarZzd.get(i26));
                }
                zzabaVarArr[i26] = zzabaVarZza;
            }
            i26++;
            zzztVar2 = zzztVar;
        }
        zznd[] zzndVarArr = new zznd[2];
        for (int i27 = i19; i27 < 2; i27++) {
            zzndVarArr[i27] = (zzaamVar.zza(i27) || zzaamVar.zzI.contains(Integer.valueOf(zzabdVar.zza(i27))) || (zzabdVar.zza(i27) != -2 && zzabaVarArr[i27] == null)) ? null : zznd.zza;
        }
        return Pair.create(zzndVarArr, zzabaVarArr);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:31:0x004b  */
    /* JADX WARN: Code duplicated, block: B:33:0x004f  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    final /* synthetic */ boolean zzl(zzaam zzaamVar, zzv zzvVar) {
        Boolean bool;
        int i10;
        zzacm zzacmVar;
        zzacm zzacmVar2;
        if (!zzaamVar.zzU || (((bool = this.zzi) != null && bool.booleanValue()) || (i10 = zzvVar.zzH) == -1 || i10 <= 2)) {
            return true;
        }
        String str = zzvVar.zzp;
        if (str != null) {
            switch (str.hashCode()) {
                case -2123537834:
                    if (str.equals(MimeTypes.AUDIO_E_AC3_JOC)) {
                        if (Build.VERSION.SDK_INT >= 32 || (zzacmVar2 = this.zzg) == null || !zzacmVar2.zzb()) {
                            return true;
                        }
                    }
                    break;
                case 187078296:
                    if (str.equals(MimeTypes.AUDIO_AC3)) {
                        if (Build.VERSION.SDK_INT >= 32) {
                            break;
                        }
                        return true;
                    }
                    break;
                case 187078297:
                    if (str.equals("audio/ac4")) {
                        if (Build.VERSION.SDK_INT >= 32) {
                            break;
                        }
                        return true;
                    }
                    break;
                case 1504578661:
                    if (str.equals(MimeTypes.AUDIO_E_AC3)) {
                        if (Build.VERSION.SDK_INT >= 32) {
                            break;
                        }
                        return true;
                    }
                    break;
            }
        }
        return Build.VERSION.SDK_INT >= 32 && (zzacmVar = this.zzg) != null && zzacmVar.zzb() && zzacmVar.zzc() && this.zzg.zzd() && this.zzg.zze(this.zzh, zzvVar);
    }

    @Override // com.google.android.gms.internal.ads.zzabh
    public final zznb zzg() {
        return this;
    }
}
