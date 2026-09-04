package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzbyc implements DialogInterface.OnClickListener {
    final /* synthetic */ zzbyd zza;

    zzbyc(zzbyd zzbydVar) {
        Objects.requireNonNull(zzbydVar);
        this.zza = zzbydVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) {
        this.zza.zzg("User canceled the download.");
    }
}
