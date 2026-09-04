package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzckv implements View.OnAttachStateChangeListener {
    final /* synthetic */ zzcdn zza;
    final /* synthetic */ zzclf zzb;

    zzckv(zzclf zzclfVar, zzcdn zzcdnVar) {
        this.zza = zzcdnVar;
        Objects.requireNonNull(zzclfVar);
        this.zzb = zzclfVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.zzb.zzZ(view, this.zza, 10);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
