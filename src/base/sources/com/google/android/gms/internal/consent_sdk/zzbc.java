package com.google.android.gms.internal.consent_sdk;

import rc.b;
import rc.e;
import rc.f;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzbc implements f.b, f.a {
    private final f.b zza;
    private final f.a zzb;

    /* synthetic */ zzbc(f.b bVar, f.a aVar, zzbd zzbdVar) {
        this.zza = bVar;
        this.zzb = aVar;
    }

    @Override // rc.f.a
    public final void onConsentFormLoadFailure(e eVar) {
        this.zzb.onConsentFormLoadFailure(eVar);
    }

    @Override // rc.f.b
    public final void onConsentFormLoadSuccess(b bVar) {
        this.zza.onConsentFormLoadSuccess(bVar);
    }
}
