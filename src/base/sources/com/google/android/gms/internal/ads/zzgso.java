package com.google.android.gms.internal.ads;

import em.o0;
import em.p0;
import fl.g0;
import fl.s;
import kotlin.coroutines.jvm.internal.m;
import tl.o;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzgso extends m implements o {
    Object zza;
    int zzb;
    final /* synthetic */ zzgsm zzc;
    final /* synthetic */ o zzd;
    private /* synthetic */ Object zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzgso(zzgsm zzgsmVar, o oVar, kl.f fVar) {
        super(2, fVar);
        this.zzc = zzgsmVar;
        this.zzd = oVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kl.f create(Object obj, kl.f fVar) {
        zzgso zzgsoVar = new zzgso(this.zzc, this.zzd, fVar);
        zzgsoVar.zze = obj;
        return zzgsoVar;
    }

    @Override // tl.o
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzgso) create((o0) obj, (kl.f) obj2)).invokeSuspend(g0.f38750a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        o oVar;
        nm.a aVarZza;
        nm.a aVar;
        Throwable th2;
        Object objF = ll.b.f();
        int i10 = this.zzb;
        try {
            if (i10 == 0) {
                s.b(obj);
                p0.e((o0) this.zze);
                zzgsm zzgsmVar = this.zzc;
                oVar = this.zzd;
                aVarZza = zzgsmVar.zza();
                this.zze = aVarZza;
                this.zza = oVar;
                this.zzb = 1;
                if (zzgsp.zze(aVarZza, this) != objF) {
                }
                return objF;
            }
            if (i10 != 1) {
                aVar = (nm.a) this.zze;
                try {
                    s.b(obj);
                    nm.a.b(aVar, null, 1, null);
                    return obj;
                } catch (Throwable th3) {
                    th2 = th3;
                    nm.a.b(aVar, null, 1, null);
                    throw th2;
                }
            }
            oVar = (o) this.zza;
            nm.a aVar2 = (nm.a) this.zze;
            s.b(obj);
            aVarZza = aVar2;
            this.zze = aVarZza;
            this.zza = null;
            this.zzb = 2;
            Object objD = p0.d(oVar, this);
            if (objD != objF) {
                aVar = aVarZza;
                obj = objD;
                nm.a.b(aVar, null, 1, null);
                return obj;
            }
            return objF;
        } catch (Throwable th4) {
            aVar = aVarZza;
            th2 = th4;
            nm.a.b(aVar, null, 1, null);
            throw th2;
        }
    }
}
