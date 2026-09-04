package com.google.android.gms.internal.measurement;

import androidx.core.app.NotificationCompat;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzp extends zzai {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzp(zzt zztVar, String str) {
        super(NotificationCompat.GROUP_KEY_SILENT);
        Objects.requireNonNull(zztVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzai
    public final zzao zza(zzg zzgVar, List list) {
        return this;
    }
}
