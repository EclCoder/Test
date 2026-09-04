package com.google.android.gms.internal.ads;

import em.o0;
import fl.g0;
import gl.r;
import java.util.List;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzgce implements zzgau {
    private final o0 zza;
    private final zzgsm zzb;
    private final nm.a zzc;
    private final nm.a zzd;
    private final nm.a zze;
    private boolean zzf;
    private zzgas zzg;
    private boolean zzh;
    private final z0.h zzi;
    private final zzdww zzj;

    public zzgce(z0.h adQualityDataStore, zzgbg coroutineScopeProvider, zzdww dataPinger, zzgbd clock) {
        s.h(adQualityDataStore, "adQualityDataStore");
        s.h(coroutineScopeProvider, "coroutineScopeProvider");
        s.h(dataPinger, "dataPinger");
        s.h(clock, "clock");
        this.zzj = dataPinger;
        this.zza = coroutineScopeProvider.zza();
        this.zzb = new zzgsm();
        this.zzc = nm.g.b(false, 1, null);
        this.zzd = nm.g.b(false, 1, null);
        this.zze = nm.g.b(false, 1, null);
        this.zzi = adQualityDataStore;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object zzA(kl.f fVar) throws Throwable {
        zzgbm zzgbmVar;
        nm.a aVar;
        nm.a aVar2;
        Throwable th2;
        if (fVar instanceof zzgbm) {
            zzgbmVar = (zzgbm) fVar;
            int i10 = zzgbmVar.zzd;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                zzgbmVar.zzd = i10 - Integer.MIN_VALUE;
            } else {
                zzgbmVar = new zzgbm(this, fVar);
            }
        } else {
            zzgbmVar = new zzgbm(this, fVar);
        }
        Object obj = zzgbmVar.zzb;
        Object objF = ll.b.f();
        int i11 = zzgbmVar.zzd;
        try {
            if (i11 == 0) {
                fl.s.b(obj);
                aVar = this.zze;
                zzgbmVar.zza = aVar;
                zzgbmVar.zzd = 1;
                if (aVar.e(null, zzgbmVar) != objF) {
                }
                return objF;
            }
            if (i11 != 1) {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aVar2 = (nm.a) zzgbmVar.zza;
                try {
                    fl.s.b(obj);
                    aVar2.f(null);
                    return g0.f38750a;
                } catch (Throwable th3) {
                    th2 = th3;
                    aVar2.f(null);
                    throw th2;
                }
            }
            nm.a aVar3 = (nm.a) zzgbmVar.zza;
            fl.s.b(obj);
            aVar = aVar3;
            z0.h hVar = this.zzi;
            zzgbn zzgbnVar = new zzgbn(null);
            zzgbmVar.zza = aVar;
            zzgbmVar.zzd = 2;
            Object objA = hVar.a(zzgbnVar, zzgbmVar);
            if (objA != objF) {
                aVar2 = aVar;
                obj = objA;
                aVar2.f(null);
                return g0.f38750a;
            }
            return objF;
        } catch (Throwable th4) {
            aVar2 = aVar;
            th2 = th4;
            aVar2.f(null);
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object zzB(long j10, kl.f fVar) {
        zzgbl zzgblVar;
        nm.a aVar;
        if (fVar instanceof zzgbl) {
            zzgblVar = (zzgbl) fVar;
            int i10 = zzgblVar.zze;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                zzgblVar.zze = i10 - Integer.MIN_VALUE;
            } else {
                zzgblVar = new zzgbl(this, fVar);
            }
        } else {
            zzgblVar = new zzgbl(this, fVar);
        }
        Object obj = zzgblVar.zzc;
        Object objF = ll.b.f();
        int i11 = zzgblVar.zze;
        if (i11 == 0) {
            fl.s.b(obj);
            nm.a aVar2 = this.zzc;
            zzgblVar.zzb = aVar2;
            zzgblVar.zza = j10;
            zzgblVar.zze = 1;
            if (aVar2.e(null, zzgblVar) == objF) {
                return objF;
            }
            aVar = aVar2;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j10 = zzgblVar.zza;
            aVar = (nm.a) zzgblVar.zzb;
            fl.s.b(obj);
        }
        try {
            zzgas zzgasVar = this.zzg;
            if (zzgasVar == null) {
                s.w("adQualityDataBuilder");
                zzgasVar = null;
            }
            zzgas zzgasVar2 = this.zzg;
            if (zzgasVar2 == null) {
                s.w("adQualityDataBuilder");
                zzgasVar2 = null;
            }
            long jZzi = j10 - zzgasVar2.zzi();
            zzgas zzgasVar3 = this.zzg;
            if (zzgasVar3 == null) {
                s.w("adQualityDataBuilder");
                zzgasVar3 = null;
            }
            zzgasVar.zzb(jZzi - zzgasVar3.zzg());
            return g0.f38750a;
        } finally {
            aVar.f(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:35:0x009e  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object zzC(kl.f fVar) throws Throwable {
        zzgbq zzgbqVar;
        nm.a aVar;
        nm.a aVar2;
        zzgat zzgatVar;
        nm.a aVar3;
        if (fVar instanceof zzgbq) {
            zzgbqVar = (zzgbq) fVar;
            int i10 = zzgbqVar.zze;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                zzgbqVar.zze = i10 - Integer.MIN_VALUE;
            } else {
                zzgbqVar = new zzgbq(this, fVar);
            }
        } else {
            zzgbqVar = new zzgbq(this, fVar);
        }
        Object objA = zzgbqVar.zzc;
        Object objF = ll.b.f();
        int i11 = zzgbqVar.zze;
        try {
            if (i11 == 0) {
                fl.s.b(objA);
                aVar = this.zzc;
                zzgbqVar.zza = aVar;
                zzgbqVar.zze = 1;
                if (aVar.e(null, zzgbqVar) != objF) {
                }
                return objF;
            }
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    aVar3 = (nm.a) zzgbqVar.zza;
                    try {
                        fl.s.b(objA);
                        aVar3.f(null);
                        return g0.f38750a;
                    } catch (Throwable th2) {
                        th = th2;
                        aVar3.f(null);
                        throw th;
                    }
                }
                aVar2 = (nm.a) zzgbqVar.zzb;
                zzgatVar = (zzgat) zzgbqVar.zza;
                fl.s.b(objA);
                try {
                    z0.h hVar = this.zzi;
                    zzgbr zzgbrVar = new zzgbr(zzgatVar, null);
                    zzgbqVar.zza = aVar2;
                    zzgbqVar.zzb = null;
                    zzgbqVar.zze = 3;
                    objA = hVar.a(zzgbrVar, zzgbqVar);
                    if (objA != objF) {
                        aVar3 = aVar2;
                        aVar3.f(null);
                        return g0.f38750a;
                    }
                    return objF;
                } catch (Throwable th3) {
                    th = th3;
                    aVar3 = aVar2;
                    aVar3.f(null);
                    throw th;
                }
            }
            aVar = (nm.a) zzgbqVar.zza;
            fl.s.b(objA);
            zzgas zzgasVar = this.zzg;
            if (zzgasVar == null) {
                s.w("adQualityDataBuilder");
                zzgasVar = null;
            }
            zzgat zzgatVar2 = (zzgat) zzgasVar.zzbu();
            aVar.f(null);
            s.e(zzgatVar2);
            aVar2 = this.zze;
            zzgbqVar.zza = zzgatVar2;
            zzgbqVar.zzb = aVar2;
            zzgbqVar.zze = 2;
            if (aVar2.e(null, zzgbqVar) != objF) {
                zzgatVar = zzgatVar2;
                z0.h hVar2 = this.zzi;
                zzgbr zzgbrVar2 = new zzgbr(zzgatVar, null);
                zzgbqVar.zza = aVar2;
                zzgbqVar.zzb = null;
                zzgbqVar.zze = 3;
                objA = hVar2.a(zzgbrVar2, zzgbqVar);
                if (objA != objF) {
                    aVar3 = aVar2;
                    aVar3.f(null);
                    return g0.f38750a;
                }
            }
            return objF;
        } catch (Throwable th4) {
            aVar.f(null);
            throw th4;
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0036  */
    private static final boolean zzD(zzgat zzgatVar) {
        boolean z10;
        List listZzk = zzgatVar.zzk();
        Long l10 = listZzk != null ? (Long) r.o0(listZzk) : null;
        boolean z11 = zzgatVar.zzl() > zzgatVar.zzm() && !zzgatVar.zzd();
        if (l10 != null) {
            if (zzgatVar.zzi() - l10.longValue() > 5000) {
                z10 = true;
            } else {
                z10 = false;
            }
        } else {
            z10 = false;
        }
        return z11 || z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00d0, code lost:
    
        if (zzA(r0) == r1) goto L49;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1, types: [nm.a] */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v5, types: [nm.a] */
    /* JADX WARN: Type inference failed for: r8v0, types: [com.google.android.gms.internal.ads.zzgce] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object zzs(kl.f r9) {
        /*
            Method dump skipped, instruction units count: 222
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgce.zzs(kl.f):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object zzt(String str, kl.f fVar) {
        zzgbt zzgbtVar;
        String str2;
        nm.a aVar;
        long j10;
        if (fVar instanceof zzgbt) {
            zzgbtVar = (zzgbt) fVar;
            int i10 = zzgbtVar.zze;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                zzgbtVar.zze = i10 - Integer.MIN_VALUE;
            } else {
                zzgbtVar = new zzgbt(this, fVar);
            }
        } else {
            zzgbtVar = new zzgbt(this, fVar);
        }
        Object obj = zzgbtVar.zzc;
        Object objF = ll.b.f();
        int i11 = zzgbtVar.zze;
        if (i11 == 0) {
            fl.s.b(obj);
            nm.a aVar2 = this.zzc;
            long jCurrentTimeMillis = System.currentTimeMillis();
            zzgbtVar.zzf = str;
            zzgbtVar.zza = aVar2;
            zzgbtVar.zzb = jCurrentTimeMillis;
            zzgbtVar.zze = 1;
            if (aVar2.e(null, zzgbtVar) == objF) {
                return objF;
            }
            str2 = str;
            aVar = aVar2;
            j10 = jCurrentTimeMillis;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j10 = zzgbtVar.zzb;
            aVar = (nm.a) zzgbtVar.zza;
            str2 = zzgbtVar.zzf;
            fl.s.b(obj);
        }
        try {
            if (this.zzf) {
                return g0.f38750a;
            }
            this.zzf = true;
            zzidy zzidyVarZzcc = zzgat.zzp().zzcc();
            s.g(zzidyVarZzcc, "toBuilder(...)");
            zzgas zzgasVar = (zzgas) zzidyVarZzcc;
            this.zzg = zzgasVar;
            if (zzgasVar == null) {
                s.w("adQualityDataBuilder");
                zzgasVar = null;
            }
            zzgasVar.zza(str2);
            zzgasVar.zzj(j10);
            return g0.f38750a;
        } finally {
            aVar.f(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:35:0x008b A[Catch: all -> 0x0092, TryCatch #0 {all -> 0x0092, blocks: (B:33:0x0087, B:35:0x008b, B:38:0x0094), top: B:51:0x0087 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00ab, code lost:
    
        if (zzC(r0) != r1) goto L44;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object zzu(kl.f r11) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof com.google.android.gms.internal.ads.zzgbp
            if (r0 == 0) goto L13
            r0 = r11
            com.google.android.gms.internal.ads.zzgbp r0 = (com.google.android.gms.internal.ads.zzgbp) r0
            int r1 = r0.zze
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.zze = r1
            goto L18
        L13:
            com.google.android.gms.internal.ads.zzgbp r0 = new com.google.android.gms.internal.ads.zzgbp
            r0.<init>(r10, r11)
        L18:
            java.lang.Object r11 = r0.zzc
            java.lang.Object r1 = ll.b.f()
            int r2 = r0.zze
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            r7 = 0
            if (r2 == 0) goto L52
            if (r2 == r6) goto L4a
            if (r2 == r5) goto L40
            if (r2 == r4) goto L3c
            if (r2 != r3) goto L34
            fl.s.b(r11)
            goto Lad
        L34:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L3c:
            fl.s.b(r11)
            goto La5
        L40:
            long r5 = r0.zzb
            java.lang.Object r2 = r0.zza
            nm.a r2 = (nm.a) r2
            fl.s.b(r11)
            goto L87
        L4a:
            java.lang.Object r2 = r0.zza
            nm.a r2 = (nm.a) r2
            fl.s.b(r11)
            goto L61
        L52:
            fl.s.b(r11)
            nm.a r2 = r10.zzd
            r0.zza = r2
            r0.zze = r6
            java.lang.Object r11 = r2.e(r7, r0)
            if (r11 == r1) goto Lb8
        L61:
            boolean r11 = r10.zzh     // Catch: java.lang.Throwable -> L6b
            if (r11 == 0) goto L6d
            fl.g0 r11 = fl.g0.f38750a     // Catch: java.lang.Throwable -> L6b
            r2.f(r7)
            return r11
        L6b:
            r11 = move-exception
            goto Lb4
        L6d:
            r10.zzh = r6     // Catch: java.lang.Throwable -> L6b
            fl.g0 r11 = fl.g0.f38750a     // Catch: java.lang.Throwable -> L6b
            r2.f(r7)
            nm.a r2 = r10.zzc
            long r8 = java.lang.System.currentTimeMillis()
            r0.zza = r2
            r0.zzb = r8
            r0.zze = r5
            java.lang.Object r11 = r2.e(r7, r0)
            if (r11 == r1) goto Lb8
            r5 = r8
        L87:
            com.google.android.gms.internal.ads.zzgas r11 = r10.zzg     // Catch: java.lang.Throwable -> L92
            if (r11 != 0) goto L94
            java.lang.String r11 = "adQualityDataBuilder"
            kotlin.jvm.internal.s.w(r11)     // Catch: java.lang.Throwable -> L92
            r11 = r7
            goto L94
        L92:
            r11 = move-exception
            goto Lb0
        L94:
            r11.zzo(r5)     // Catch: java.lang.Throwable -> L92
            r2.f(r7)
            r0.zza = r7
            r0.zze = r4
            java.lang.Object r11 = r10.zzB(r5, r0)
            if (r11 != r1) goto La5
            goto Lb8
        La5:
            r0.zze = r3
            java.lang.Object r11 = r10.zzC(r0)
            if (r11 == r1) goto Lb8
        Lad:
            fl.g0 r11 = fl.g0.f38750a
            return r11
        Lb0:
            r2.f(r7)
            throw r11
        Lb4:
            r2.f(r7)
            throw r11
        Lb8:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgce.zzu(kl.f):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:33:0x0081 A[Catch: all -> 0x0086, TRY_ENTER, TryCatch #0 {all -> 0x0086, blocks: (B:30:0x007b, B:33:0x0081, B:36:0x0089, B:39:0x0091, B:41:0x0095, B:42:0x0099, B:44:0x00b5, B:45:0x00b9, B:47:0x00c2, B:49:0x00c6, B:50:0x00ca, B:51:0x00d2, B:53:0x00d6, B:54:0x00da, B:56:0x00e0, B:58:0x00e4, B:59:0x00e8, B:61:0x0104, B:62:0x0108, B:63:0x0110, B:65:0x0114, B:66:0x0118), top: B:74:0x007b }] */
    /* JADX WARN: Code duplicated, block: B:39:0x0091 A[Catch: all -> 0x0086, TRY_ENTER, TryCatch #0 {all -> 0x0086, blocks: (B:30:0x007b, B:33:0x0081, B:36:0x0089, B:39:0x0091, B:41:0x0095, B:42:0x0099, B:44:0x00b5, B:45:0x00b9, B:47:0x00c2, B:49:0x00c6, B:50:0x00ca, B:51:0x00d2, B:53:0x00d6, B:54:0x00da, B:56:0x00e0, B:58:0x00e4, B:59:0x00e8, B:61:0x0104, B:62:0x0108, B:63:0x0110, B:65:0x0114, B:66:0x0118), top: B:74:0x007b }] */
    /* JADX WARN: Code duplicated, block: B:41:0x0095 A[Catch: all -> 0x0086, TryCatch #0 {all -> 0x0086, blocks: (B:30:0x007b, B:33:0x0081, B:36:0x0089, B:39:0x0091, B:41:0x0095, B:42:0x0099, B:44:0x00b5, B:45:0x00b9, B:47:0x00c2, B:49:0x00c6, B:50:0x00ca, B:51:0x00d2, B:53:0x00d6, B:54:0x00da, B:56:0x00e0, B:58:0x00e4, B:59:0x00e8, B:61:0x0104, B:62:0x0108, B:63:0x0110, B:65:0x0114, B:66:0x0118), top: B:74:0x007b }] */
    /* JADX WARN: Code duplicated, block: B:44:0x00b5 A[Catch: all -> 0x0086, TryCatch #0 {all -> 0x0086, blocks: (B:30:0x007b, B:33:0x0081, B:36:0x0089, B:39:0x0091, B:41:0x0095, B:42:0x0099, B:44:0x00b5, B:45:0x00b9, B:47:0x00c2, B:49:0x00c6, B:50:0x00ca, B:51:0x00d2, B:53:0x00d6, B:54:0x00da, B:56:0x00e0, B:58:0x00e4, B:59:0x00e8, B:61:0x0104, B:62:0x0108, B:63:0x0110, B:65:0x0114, B:66:0x0118), top: B:74:0x007b }] */
    /* JADX WARN: Code duplicated, block: B:47:0x00c2 A[Catch: all -> 0x0086, TryCatch #0 {all -> 0x0086, blocks: (B:30:0x007b, B:33:0x0081, B:36:0x0089, B:39:0x0091, B:41:0x0095, B:42:0x0099, B:44:0x00b5, B:45:0x00b9, B:47:0x00c2, B:49:0x00c6, B:50:0x00ca, B:51:0x00d2, B:53:0x00d6, B:54:0x00da, B:56:0x00e0, B:58:0x00e4, B:59:0x00e8, B:61:0x0104, B:62:0x0108, B:63:0x0110, B:65:0x0114, B:66:0x0118), top: B:74:0x007b }] */
    /* JADX WARN: Code duplicated, block: B:49:0x00c6 A[Catch: all -> 0x0086, TryCatch #0 {all -> 0x0086, blocks: (B:30:0x007b, B:33:0x0081, B:36:0x0089, B:39:0x0091, B:41:0x0095, B:42:0x0099, B:44:0x00b5, B:45:0x00b9, B:47:0x00c2, B:49:0x00c6, B:50:0x00ca, B:51:0x00d2, B:53:0x00d6, B:54:0x00da, B:56:0x00e0, B:58:0x00e4, B:59:0x00e8, B:61:0x0104, B:62:0x0108, B:63:0x0110, B:65:0x0114, B:66:0x0118), top: B:74:0x007b }] */
    /* JADX WARN: Code duplicated, block: B:53:0x00d6 A[Catch: all -> 0x0086, TryCatch #0 {all -> 0x0086, blocks: (B:30:0x007b, B:33:0x0081, B:36:0x0089, B:39:0x0091, B:41:0x0095, B:42:0x0099, B:44:0x00b5, B:45:0x00b9, B:47:0x00c2, B:49:0x00c6, B:50:0x00ca, B:51:0x00d2, B:53:0x00d6, B:54:0x00da, B:56:0x00e0, B:58:0x00e4, B:59:0x00e8, B:61:0x0104, B:62:0x0108, B:63:0x0110, B:65:0x0114, B:66:0x0118), top: B:74:0x007b }] */
    /* JADX WARN: Code duplicated, block: B:56:0x00e0 A[Catch: all -> 0x0086, TryCatch #0 {all -> 0x0086, blocks: (B:30:0x007b, B:33:0x0081, B:36:0x0089, B:39:0x0091, B:41:0x0095, B:42:0x0099, B:44:0x00b5, B:45:0x00b9, B:47:0x00c2, B:49:0x00c6, B:50:0x00ca, B:51:0x00d2, B:53:0x00d6, B:54:0x00da, B:56:0x00e0, B:58:0x00e4, B:59:0x00e8, B:61:0x0104, B:62:0x0108, B:63:0x0110, B:65:0x0114, B:66:0x0118), top: B:74:0x007b }] */
    /* JADX WARN: Code duplicated, block: B:58:0x00e4 A[Catch: all -> 0x0086, TryCatch #0 {all -> 0x0086, blocks: (B:30:0x007b, B:33:0x0081, B:36:0x0089, B:39:0x0091, B:41:0x0095, B:42:0x0099, B:44:0x00b5, B:45:0x00b9, B:47:0x00c2, B:49:0x00c6, B:50:0x00ca, B:51:0x00d2, B:53:0x00d6, B:54:0x00da, B:56:0x00e0, B:58:0x00e4, B:59:0x00e8, B:61:0x0104, B:62:0x0108, B:63:0x0110, B:65:0x0114, B:66:0x0118), top: B:74:0x007b }] */
    /* JADX WARN: Code duplicated, block: B:61:0x0104 A[Catch: all -> 0x0086, TryCatch #0 {all -> 0x0086, blocks: (B:30:0x007b, B:33:0x0081, B:36:0x0089, B:39:0x0091, B:41:0x0095, B:42:0x0099, B:44:0x00b5, B:45:0x00b9, B:47:0x00c2, B:49:0x00c6, B:50:0x00ca, B:51:0x00d2, B:53:0x00d6, B:54:0x00da, B:56:0x00e0, B:58:0x00e4, B:59:0x00e8, B:61:0x0104, B:62:0x0108, B:63:0x0110, B:65:0x0114, B:66:0x0118), top: B:74:0x007b }] */
    /* JADX WARN: Code duplicated, block: B:65:0x0114 A[Catch: all -> 0x0086, TryCatch #0 {all -> 0x0086, blocks: (B:30:0x007b, B:33:0x0081, B:36:0x0089, B:39:0x0091, B:41:0x0095, B:42:0x0099, B:44:0x00b5, B:45:0x00b9, B:47:0x00c2, B:49:0x00c6, B:50:0x00ca, B:51:0x00d2, B:53:0x00d6, B:54:0x00da, B:56:0x00e0, B:58:0x00e4, B:59:0x00e8, B:61:0x0104, B:62:0x0108, B:63:0x0110, B:65:0x0114, B:66:0x0118), top: B:74:0x007b }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object zzv(kl.f fVar) {
        zzgcd zzgcdVar;
        nm.a aVar;
        nm.a aVar2;
        long j10;
        zzgas zzgasVar;
        zzgas zzgasVar2;
        zzgas zzgasVar3;
        zzgas zzgasVar4;
        zzgas zzgasVar5;
        zzgas zzgasVar6;
        long jLongValue;
        zzgas zzgasVar7;
        zzgas zzgasVar8;
        if (fVar instanceof zzgcd) {
            zzgcdVar = (zzgcd) fVar;
            int i10 = zzgcdVar.zze;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                zzgcdVar.zze = i10 - Integer.MIN_VALUE;
            } else {
                zzgcdVar = new zzgcd(this, fVar);
            }
        } else {
            zzgcdVar = new zzgcd(this, fVar);
        }
        Object obj = zzgcdVar.zzc;
        Object objF = ll.b.f();
        int i11 = zzgcdVar.zze;
        try {
            if (i11 == 0) {
                fl.s.b(obj);
                aVar = this.zzd;
                zzgcdVar.zza = aVar;
                zzgcdVar.zze = 1;
                if (aVar.e(null, zzgcdVar) != objF) {
                }
                return objF;
            }
            if (i11 == 1) {
                aVar = (nm.a) zzgcdVar.zza;
                fl.s.b(obj);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j10 = zzgcdVar.zzb;
                aVar2 = (nm.a) zzgcdVar.zza;
                fl.s.b(obj);
            }
            try {
                zzgasVar = this.zzg;
                if (zzgasVar == null) {
                    s.w("adQualityDataBuilder");
                    zzgasVar = null;
                }
                if (zzgasVar.zzr() > 0) {
                    zzgasVar6 = this.zzg;
                    if (zzgasVar6 == null) {
                        s.w("adQualityDataBuilder");
                        zzgasVar6 = null;
                    }
                    List listZzq = zzgasVar6.zzq();
                    s.g(listZzq, "getAdClickTimestampsMsList(...)");
                    Object objN0 = r.n0(listZzq);
                    s.g(objN0, "last(...)");
                    jLongValue = j10 - ((Number) objN0).longValue();
                    zzgasVar7 = this.zzg;
                    if (zzgasVar7 == null) {
                        s.w("adQualityDataBuilder");
                        zzgasVar7 = null;
                    }
                    zzgasVar7.zzt();
                    if (jLongValue < 5000) {
                        zzgasVar8 = this.zzg;
                        if (zzgasVar8 == null) {
                            s.w("adQualityDataBuilder");
                            zzgasVar8 = null;
                        }
                        zzgasVar8.zzd(zzgasVar8.zzc() + 1);
                    }
                }
                zzgasVar2 = this.zzg;
                if (zzgasVar2 == null) {
                    s.w("adQualityDataBuilder");
                    zzgasVar2 = null;
                }
                if (zzgasVar2.zzn() > 0) {
                    zzgasVar4 = this.zzg;
                    if (zzgasVar4 == null) {
                        s.w("adQualityDataBuilder");
                        zzgasVar4 = null;
                    }
                    List listZzm = zzgasVar4.zzm();
                    s.g(listZzm, "getAppBackgroundTimestampsMsList(...)");
                    Object objN1 = r.n0(listZzm);
                    s.g(objN1, "last(...)");
                    long jLongValue2 = j10 - ((Number) objN1).longValue();
                    zzgasVar5 = this.zzg;
                    if (zzgasVar5 == null) {
                        s.w("adQualityDataBuilder");
                        zzgasVar5 = null;
                    }
                    zzgasVar5.zzh(zzgasVar5.zzg() + jLongValue2);
                }
                zzgasVar3 = this.zzg;
                if (zzgasVar3 == null) {
                    s.w("adQualityDataBuilder");
                    zzgasVar3 = null;
                }
                zzgasVar3.zzp(j10);
                return g0.f38750a;
            } finally {
                aVar2.f(null);
            }
            if (!this.zzh) {
                g0 g0Var = g0.f38750a;
                aVar.f(null);
                return g0Var;
            }
            this.zzh = false;
            g0 g0Var2 = g0.f38750a;
            aVar.f(null);
            nm.a aVar3 = this.zzc;
            long jCurrentTimeMillis = System.currentTimeMillis();
            zzgcdVar.zza = aVar3;
            zzgcdVar.zzb = jCurrentTimeMillis;
            zzgcdVar.zze = 2;
            if (aVar3.e(null, zzgcdVar) != objF) {
                aVar2 = aVar3;
                j10 = jCurrentTimeMillis;
                zzgasVar = this.zzg;
                if (zzgasVar == null) {
                    s.w("adQualityDataBuilder");
                    zzgasVar = null;
                }
                if (zzgasVar.zzr() > 0) {
                    zzgasVar6 = this.zzg;
                    if (zzgasVar6 == null) {
                        s.w("adQualityDataBuilder");
                        zzgasVar6 = null;
                    }
                    List listZzq2 = zzgasVar6.zzq();
                    s.g(listZzq2, "getAdClickTimestampsMsList(...)");
                    Object objN2 = r.n0(listZzq2);
                    s.g(objN2, "last(...)");
                    jLongValue = j10 - ((Number) objN2).longValue();
                    zzgasVar7 = this.zzg;
                    if (zzgasVar7 == null) {
                        s.w("adQualityDataBuilder");
                        zzgasVar7 = null;
                    }
                    zzgasVar7.zzt();
                    if (jLongValue < 5000) {
                        zzgasVar8 = this.zzg;
                        if (zzgasVar8 == null) {
                            s.w("adQualityDataBuilder");
                            zzgasVar8 = null;
                        }
                        zzgasVar8.zzd(zzgasVar8.zzc() + 1);
                    }
                }
                zzgasVar2 = this.zzg;
                if (zzgasVar2 == null) {
                    s.w("adQualityDataBuilder");
                    zzgasVar2 = null;
                }
                if (zzgasVar2.zzn() > 0) {
                    zzgasVar4 = this.zzg;
                    if (zzgasVar4 == null) {
                        s.w("adQualityDataBuilder");
                        zzgasVar4 = null;
                    }
                    List listZzm2 = zzgasVar4.zzm();
                    s.g(listZzm2, "getAppBackgroundTimestampsMsList(...)");
                    Object objN3 = r.n0(listZzm2);
                    s.g(objN3, "last(...)");
                    long jLongValue3 = j10 - ((Number) objN3).longValue();
                    zzgasVar5 = this.zzg;
                    if (zzgasVar5 == null) {
                        s.w("adQualityDataBuilder");
                        zzgasVar5 = null;
                    }
                    zzgasVar5.zzh(zzgasVar5.zzg() + jLongValue3);
                }
                zzgasVar3 = this.zzg;
                if (zzgasVar3 == null) {
                    s.w("adQualityDataBuilder");
                    zzgasVar3 = null;
                }
                zzgasVar3.zzp(j10);
                return g0.f38750a;
            }
            return objF;
        } catch (Throwable th2) {
            aVar.f(null);
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:37:0x0094 A[Catch: all -> 0x0099, TRY_ENTER, TryCatch #1 {all -> 0x0099, blocks: (B:34:0x008e, B:37:0x0094, B:40:0x009b, B:42:0x009f, B:43:0x00a3, B:45:0x00ad, B:46:0x00b1, B:48:0x00bd, B:49:0x00c1, B:51:0x00c8, B:52:0x00cc), top: B:69:0x008e }] */
    /* JADX WARN: Code duplicated, block: B:42:0x009f A[Catch: all -> 0x0099, TryCatch #1 {all -> 0x0099, blocks: (B:34:0x008e, B:37:0x0094, B:40:0x009b, B:42:0x009f, B:43:0x00a3, B:45:0x00ad, B:46:0x00b1, B:48:0x00bd, B:49:0x00c1, B:51:0x00c8, B:52:0x00cc), top: B:69:0x008e }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00ad A[Catch: all -> 0x0099, TryCatch #1 {all -> 0x0099, blocks: (B:34:0x008e, B:37:0x0094, B:40:0x009b, B:42:0x009f, B:43:0x00a3, B:45:0x00ad, B:46:0x00b1, B:48:0x00bd, B:49:0x00c1, B:51:0x00c8, B:52:0x00cc), top: B:69:0x008e }] */
    /* JADX WARN: Code duplicated, block: B:48:0x00bd A[Catch: all -> 0x0099, TryCatch #1 {all -> 0x0099, blocks: (B:34:0x008e, B:37:0x0094, B:40:0x009b, B:42:0x009f, B:43:0x00a3, B:45:0x00ad, B:46:0x00b1, B:48:0x00bd, B:49:0x00c1, B:51:0x00c8, B:52:0x00cc), top: B:69:0x008e }] */
    /* JADX WARN: Code duplicated, block: B:51:0x00c8 A[Catch: all -> 0x0099, TryCatch #1 {all -> 0x0099, blocks: (B:34:0x008e, B:37:0x0094, B:40:0x009b, B:42:0x009f, B:43:0x00a3, B:45:0x00ad, B:46:0x00b1, B:48:0x00bd, B:49:0x00c1, B:51:0x00c8, B:52:0x00cc), top: B:69:0x008e }] */
    /* JADX WARN: Code duplicated, block: B:55:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:58:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00fc, code lost:
    
        if (zzz(r14, r0) == r1) goto L67;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object zzw(kl.f r14) {
        /*
            Method dump skipped, instruction units count: 267
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgce.zzw(kl.f):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:36:0x0093 A[Catch: all -> 0x0098, TRY_ENTER, TryCatch #1 {all -> 0x0098, blocks: (B:33:0x008d, B:36:0x0093, B:39:0x009b, B:41:0x009f, B:42:0x00a3, B:44:0x00ad, B:45:0x00b1, B:47:0x00bd, B:48:0x00c1, B:50:0x00c8, B:51:0x00cc, B:53:0x00d3, B:54:0x00d7), top: B:71:0x008d }] */
    /* JADX WARN: Code duplicated, block: B:41:0x009f A[Catch: all -> 0x0098, TryCatch #1 {all -> 0x0098, blocks: (B:33:0x008d, B:36:0x0093, B:39:0x009b, B:41:0x009f, B:42:0x00a3, B:44:0x00ad, B:45:0x00b1, B:47:0x00bd, B:48:0x00c1, B:50:0x00c8, B:51:0x00cc, B:53:0x00d3, B:54:0x00d7), top: B:71:0x008d }] */
    /* JADX WARN: Code duplicated, block: B:44:0x00ad A[Catch: all -> 0x0098, TryCatch #1 {all -> 0x0098, blocks: (B:33:0x008d, B:36:0x0093, B:39:0x009b, B:41:0x009f, B:42:0x00a3, B:44:0x00ad, B:45:0x00b1, B:47:0x00bd, B:48:0x00c1, B:50:0x00c8, B:51:0x00cc, B:53:0x00d3, B:54:0x00d7), top: B:71:0x008d }] */
    /* JADX WARN: Code duplicated, block: B:47:0x00bd A[Catch: all -> 0x0098, TryCatch #1 {all -> 0x0098, blocks: (B:33:0x008d, B:36:0x0093, B:39:0x009b, B:41:0x009f, B:42:0x00a3, B:44:0x00ad, B:45:0x00b1, B:47:0x00bd, B:48:0x00c1, B:50:0x00c8, B:51:0x00cc, B:53:0x00d3, B:54:0x00d7), top: B:71:0x008d }] */
    /* JADX WARN: Code duplicated, block: B:50:0x00c8 A[Catch: all -> 0x0098, TryCatch #1 {all -> 0x0098, blocks: (B:33:0x008d, B:36:0x0093, B:39:0x009b, B:41:0x009f, B:42:0x00a3, B:44:0x00ad, B:45:0x00b1, B:47:0x00bd, B:48:0x00c1, B:50:0x00c8, B:51:0x00cc, B:53:0x00d3, B:54:0x00d7), top: B:71:0x008d }] */
    /* JADX WARN: Code duplicated, block: B:53:0x00d3 A[Catch: all -> 0x0098, TryCatch #1 {all -> 0x0098, blocks: (B:33:0x008d, B:36:0x0093, B:39:0x009b, B:41:0x009f, B:42:0x00a3, B:44:0x00ad, B:45:0x00b1, B:47:0x00bd, B:48:0x00c1, B:50:0x00c8, B:51:0x00cc, B:53:0x00d3, B:54:0x00d7), top: B:71:0x008d }] */
    /* JADX WARN: Code duplicated, block: B:57:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:60:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0107, code lost:
    
        if (zzz(r15, r0) == r1) goto L69;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object zzx(kl.f r15) {
        /*
            Method dump skipped, instruction units count: 278
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgce.zzx(kl.f):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object zzy(kl.f fVar) {
        zzgbv zzgbvVar;
        nm.a aVar;
        long j10;
        if (fVar instanceof zzgbv) {
            zzgbvVar = (zzgbv) fVar;
            int i10 = zzgbvVar.zze;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                zzgbvVar.zze = i10 - Integer.MIN_VALUE;
            } else {
                zzgbvVar = new zzgbv(this, fVar);
            }
        } else {
            zzgbvVar = new zzgbv(this, fVar);
        }
        Object obj = zzgbvVar.zzc;
        Object objF = ll.b.f();
        int i11 = zzgbvVar.zze;
        if (i11 == 0) {
            fl.s.b(obj);
            nm.a aVar2 = this.zzc;
            long jCurrentTimeMillis = System.currentTimeMillis();
            zzgbvVar.zzb = aVar2;
            zzgbvVar.zza = jCurrentTimeMillis;
            zzgbvVar.zze = 1;
            if (aVar2.e(null, zzgbvVar) == objF) {
                return objF;
            }
            aVar = aVar2;
            j10 = jCurrentTimeMillis;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j10 = zzgbvVar.zza;
            aVar = (nm.a) zzgbvVar.zzb;
            fl.s.b(obj);
        }
        try {
            zzgas zzgasVar = this.zzg;
            if (zzgasVar == null) {
                s.w("adQualityDataBuilder");
                zzgasVar = null;
            }
            zzgasVar.zzs(j10);
            return g0.f38750a;
        } finally {
            aVar.f(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object zzz(String str, kl.f fVar) throws Throwable {
        zzgbj zzgbjVar;
        nm.a aVar;
        Throwable th2;
        nm.a aVar2;
        if (fVar instanceof zzgbj) {
            zzgbjVar = (zzgbj) fVar;
            int i10 = zzgbjVar.zze;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                zzgbjVar.zze = i10 - Integer.MIN_VALUE;
            } else {
                zzgbjVar = new zzgbj(this, fVar);
            }
        } else {
            zzgbjVar = new zzgbj(this, fVar);
        }
        Object obj = zzgbjVar.zzc;
        Object objF = ll.b.f();
        int i11 = zzgbjVar.zze;
        try {
            if (i11 == 0) {
                fl.s.b(obj);
                aVar = this.zze;
                zzgbjVar.zza = str;
                zzgbjVar.zzb = aVar;
                zzgbjVar.zze = 1;
                if (aVar.e(null, zzgbjVar) != objF) {
                }
                return objF;
            }
            if (i11 != 1) {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aVar2 = (nm.a) zzgbjVar.zza;
                try {
                    fl.s.b(obj);
                    aVar2.f(null);
                    return g0.f38750a;
                } catch (Throwable th3) {
                    th2 = th3;
                    aVar2.f(null);
                    throw th2;
                }
            }
            nm.a aVar3 = (nm.a) zzgbjVar.zzb;
            String str2 = (String) zzgbjVar.zza;
            fl.s.b(obj);
            aVar = aVar3;
            str = str2;
            z0.h hVar = this.zzi;
            zzgbk zzgbkVar = new zzgbk(str, null);
            zzgbjVar.zza = aVar;
            zzgbjVar.zzb = null;
            zzgbjVar.zze = 2;
            Object objA = hVar.a(zzgbkVar, zzgbjVar);
            if (objA != objF) {
                nm.a aVar4 = aVar;
                obj = objA;
                aVar2 = aVar4;
                aVar2.f(null);
                return g0.f38750a;
            }
            return objF;
        } catch (Throwable th4) {
            nm.a aVar5 = aVar;
            th2 = th4;
            aVar2 = aVar5;
            aVar2.f(null);
            throw th2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgau
    public final void zza() {
        em.k.d(this.zza, null, null, new zzgby(this, null), 3, null);
    }

    @Override // com.google.android.gms.internal.ads.zzgau
    public final void zzb(String gwsQueryId) {
        s.h(gwsQueryId, "gwsQueryId");
        zzgsp.zza(this.zza, this.zzb, new zzgbs(this, gwsQueryId, null));
    }

    @Override // com.google.android.gms.internal.ads.zzgau
    public final void zzc() {
        zzgsp.zza(this.zza, this.zzb, new zzgbo(this, null));
    }

    @Override // com.google.android.gms.internal.ads.zzgau
    public final void zzd() {
        zzgsp.zza(this.zza, this.zzb, new zzgcc(this, null));
    }

    @Override // com.google.android.gms.internal.ads.zzgau
    public final void zze() {
        zzgsp.zza(this.zza, this.zzb, new zzgbw(this, null));
    }

    @Override // com.google.android.gms.internal.ads.zzgau
    public final void zzf() {
        zzgsp.zza(this.zza, this.zzb, new zzgca(this, null));
    }

    @Override // com.google.android.gms.internal.ads.zzgau
    public final void zzg() {
        zzgsp.zza(this.zza, this.zzb, new zzgbu(this, null));
    }
}
