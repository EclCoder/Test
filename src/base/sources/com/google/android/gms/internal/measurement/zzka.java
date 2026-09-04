package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.api.internal.ListenerHolder;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzka extends zzkn {
    final /* synthetic */ ListenerHolder zza;

    zzka(zzkk zzkkVar, ListenerHolder listenerHolder) {
        this.zza = listenerHolder;
        Objects.requireNonNull(zzkkVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzko
    public final void zzb(byte[] bArr) {
        this.zza.notifyListener(new zzjz(this, bArr));
    }
}
