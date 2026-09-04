package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzinl extends androidx.browser.customtabs.e {
    private final WeakReference zza;

    public zzinl(zzbjr zzbjrVar) {
        this.zza = new WeakReference(zzbjrVar);
    }

    @Override // androidx.browser.customtabs.e
    public final void onCustomTabsServiceConnected(ComponentName componentName, androidx.browser.customtabs.c cVar) {
        zzbjr zzbjrVar = (zzbjr) this.zza.get();
        if (zzbjrVar != null) {
            zzbjrVar.zzf(cVar);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        zzbjr zzbjrVar = (zzbjr) this.zza.get();
        if (zzbjrVar != null) {
            zzbjrVar.zzg();
        }
    }
}
