package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzbjm extends androidx.browser.customtabs.b {
    final /* synthetic */ zzbjp zza;

    zzbjm(zzbjp zzbjpVar) {
        Objects.requireNonNull(zzbjpVar);
        this.zza = zzbjpVar;
    }

    @Override // androidx.browser.customtabs.b
    public final void onNavigationEvent(int i10, Bundle bundle) {
        this.zza.zzc(i10);
    }
}
