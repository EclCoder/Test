package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.api.internal.ListenerHolder;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzjz implements ListenerHolder.Notifier {
    final /* synthetic */ byte[] zza;

    zzjz(zzka zzkaVar, byte[] bArr) {
        this.zza = bArr;
        Objects.requireNonNull(zzkaVar);
    }

    @Override // com.google.android.gms.common.api.internal.ListenerHolder.Notifier
    public final /* bridge */ /* synthetic */ void notifyListener(Object obj) {
        zzpm zzpmVar = (zzpm) obj;
        try {
            zzpmVar.zza(zzpl.zzb(this.zza, zzadf.zza()));
        } catch (zzaeh e10) {
            zzpmVar.zzb(e10);
        }
    }

    @Override // com.google.android.gms.common.api.internal.ListenerHolder.Notifier
    public final void onNotifyListenerFailed() {
    }
}
