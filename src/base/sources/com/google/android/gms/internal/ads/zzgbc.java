package com.google.android.gms.internal.ads;

import android.content.Context;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzgbc implements zzimu {
    private final zzind zza;

    private zzgbc(zzind zzindVar, zzind zzindVar2) {
        this.zza = zzindVar;
    }

    public static zzgbc zza(zzind zzindVar, zzind zzindVar2) {
        return new zzgbc(zzindVar, zzindVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzinj, com.google.android.gms.internal.ads.zzini
    public final /* bridge */ /* synthetic */ Object zzb() {
        final Context context = ((zzcnq) this.zza).zza();
        zzgbg coroutineScopeProvider = zzcnu.zzc();
        s.h(context, "context");
        s.h(coroutineScopeProvider, "coroutineScopeProvider");
        z0.h hVarC = z0.i.c(z0.i.f58270a, zzgba.zza, null, null, coroutineScopeProvider.zza(), new tl.a() { // from class: com.google.android.gms.internal.ads.zzgbb
            @Override // tl.a
            public final /* synthetic */ Object invoke() {
                return y0.a.a(context, "ad_quality_data.pb");
            }
        }, 6, null);
        zzinc.zzb(hVarC);
        return hVarC;
    }
}
