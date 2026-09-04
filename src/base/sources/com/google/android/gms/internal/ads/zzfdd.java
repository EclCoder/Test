package com.google.android.gms.internal.ads;

import android.util.Base64;
import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final /* synthetic */ class zzfdd implements zzhbe {
    static final /* synthetic */ zzfdd zza = new zzfdd();

    private /* synthetic */ zzfdd() {
    }

    @Override // com.google.android.gms.internal.ads.zzhbe
    public final /* synthetic */ ListenableFuture zza(Object obj) {
        androidx.privacysandbox.ads.adservices.topics.c cVar = (androidx.privacysandbox.ads.adservices.topics.c) obj;
        if (cVar == null) {
            return zzhbw.zza(new zzfdf("", 1, null));
        }
        zzihy zzihyVarZzc = zzihz.zzc();
        for (androidx.privacysandbox.ads.adservices.topics.e eVar : cVar.a()) {
            zzihw zzihwVarZzc = zzihx.zzc();
            zzihwVarZzc.zza(eVar.c());
            zzihwVarZzc.zzb(eVar.a());
            zzihwVarZzc.zzc(eVar.b());
            zzihyVarZzc.zza((zzihx) zzihwVarZzc.zzbu());
        }
        return zzhbw.zza(new zzfdf(Base64.encodeToString(((zzihz) zzihyVarZzc.zzbu()).zzaN(), 1), 1, null));
    }
}
