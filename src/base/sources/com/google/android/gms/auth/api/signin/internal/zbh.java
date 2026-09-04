package com.google.android.gms.auth.api.signin.internal;

import com.google.android.gms.common.api.Status;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class zbh extends zba {
    final /* synthetic */ zbi zba;

    zbh(zbi zbiVar) {
        Objects.requireNonNull(zbiVar);
        this.zba = zbiVar;
    }

    @Override // com.google.android.gms.auth.api.signin.internal.zba, com.google.android.gms.auth.api.signin.internal.zbr
    public final void zbc(Status status) {
        this.zba.setResult(status);
    }
}
