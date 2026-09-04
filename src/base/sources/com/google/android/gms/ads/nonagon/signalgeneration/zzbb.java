package com.google.android.gms.ads.nonagon.signalgeneration;

import com.google.android.gms.internal.ads.zzefg;
import com.google.android.gms.internal.ads.zzfoa;
import com.google.android.gms.internal.ads.zzimu;
import com.google.android.gms.internal.ads.zzind;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class zzbb implements zzimu {
    private final zzind zza;

    private zzbb(zzind zzindVar, zzind zzindVar2) {
        this.zza = zzindVar2;
    }

    public static zzbb zzc(zzind zzindVar, zzind zzindVar2) {
        return new zzbb(zzindVar, zzindVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzinj, com.google.android.gms.internal.ads.zzini
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzba zzb() {
        return new zzba(zzfoa.zzc(), ((zzefg) this.zza).zzb());
    }
}
