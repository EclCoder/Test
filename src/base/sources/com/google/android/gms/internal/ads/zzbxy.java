package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzbxy implements View.OnClickListener {
    final /* synthetic */ zzbya zza;

    zzbxy(zzbya zzbyaVar) {
        Objects.requireNonNull(zzbyaVar);
        this.zza = zzbyaVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.zza.zzb(true);
    }
}
