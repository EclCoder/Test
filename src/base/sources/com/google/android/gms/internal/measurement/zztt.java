package com.google.android.gms.internal.measurement;

import android.net.Uri;
import android.util.Pair;
import com.google.common.collect.c0;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.g0;
import com.google.common.util.concurrent.j;
import com.google.common.util.concurrent.x;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.Executor;
import sc.p;
import sc.w;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zztt {
    private final ConcurrentMap zza = new ConcurrentHashMap();
    private final Executor zzb;
    private final zzru zzc;
    private final j zzd;
    private final Map zze;
    private final zzvc zzf;

    zztt(Executor executor, zzru zzruVar, zzvc zzvcVar, Map map, zzvf zzvfVar) {
        this.zzb = (Executor) p.o(executor);
        this.zzc = (zzru) p.o(zzruVar);
        this.zzf = (zzvc) p.o(zzvcVar);
        Map map2 = (Map) p.o(map);
        this.zze = map2;
        p.d(!map2.isEmpty());
        this.zzd = zzts.zza;
    }

    public final zztp zza(zztr zztrVar) {
        zztr zztrVar2;
        ConcurrentMap concurrentMap = this.zza;
        Uri uriZza = zztrVar.zza();
        Pair pairCreate = (Pair) concurrentMap.get(uriZza);
        if (pairCreate == null) {
            Uri uriZza2 = zztrVar.zza();
            p.j(uriZza2.isHierarchical(), "Uri must be hierarchical: %s", uriZza2);
            String strE = w.e(uriZza2.getLastPathSegment());
            int iLastIndexOf = strE.lastIndexOf(46);
            p.j((iLastIndexOf == -1 ? "" : strE.substring(iLastIndexOf + 1)).equals("pb"), "Uri extension must be .pb: %s", uriZza2);
            p.e(true, "Proto schema cannot be null");
            p.e(zztrVar.zzc() != null, "Handler cannot be null");
            zzuw zzuwVar = (zzuw) this.zze.get("singleproc");
            p.j(zzuwVar != null, "No XDataStoreVariantFactory registered for ID %s", "singleproc");
            String strE2 = w.e(zztrVar.zza().getLastPathSegment());
            int iLastIndexOf2 = strE2.lastIndexOf(46);
            if (iLastIndexOf2 != -1) {
                strE2 = strE2.substring(0, iLastIndexOf2);
            }
            String str = strE2;
            ListenableFuture listenableFutureM = x.m(x.g(zztrVar.zza()), this.zzd, g0.a());
            Executor executor = this.zzb;
            zzru zzruVar = this.zzc;
            zzti zztiVar = zzti.ALLOWED;
            zztrVar2 = zztrVar;
            zztp zztpVar = new zztp(zzuwVar.zzb(zztrVar2, str, executor, zzruVar, zztiVar), this.zzf, listenableFutureM, false, zzuwVar.zza(zztiVar));
            c0 c0VarZzd = zztrVar2.zzd();
            if (!c0VarZzd.isEmpty()) {
                zztpVar.zza(zzto.zza(c0VarZzd, executor));
            }
            pairCreate = Pair.create(zztpVar, zztrVar2);
            Pair pair = (Pair) concurrentMap.putIfAbsent(uriZza, pairCreate);
            if (pair != null) {
                pairCreate = pair;
            }
        } else {
            zztrVar2 = zztrVar;
        }
        zztp zztpVar2 = (zztp) pairCreate.first;
        zztr zztrVar3 = (zztr) pairCreate.second;
        if (zztrVar2.equals(zztrVar3)) {
            return zztpVar2;
        }
        String strC = w.c("ProtoDataStoreConfig<%s> doesn't match previous call [uri=%s] [%s]", zztrVar2.zzb().getClass().getSimpleName(), zztrVar2.zza());
        p.j(zztrVar2.zza().equals(zztrVar3.zza()), strC, "uri");
        p.j(zztrVar2.zzb().equals(zztrVar3.zzb()), strC, "schema");
        p.j(zztrVar2.zzc().equals(zztrVar3.zzc()), strC, "handler");
        p.j(zztrVar2.zzd().equals(zztrVar3.zzd()), strC, "migrations");
        p.j(zztrVar2.zze().equals(zztrVar3.zze()), strC, "variantConfig");
        p.j(zztrVar2.zzf() == zztrVar3.zzf(), strC, "useGeneratedExtensionRegistry");
        zztrVar3.zzg();
        p.j(true, strC, "enableTracing");
        throw new IllegalArgumentException(w.c(strC, "unknown"));
    }
}
