package com.google.android.gms.internal.measurement;

import com.google.common.util.concurrent.b;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzkz extends b {
    Object zza;

    zzkz(Object obj, Runnable runnable) {
        this.zza = obj;
    }

    @Override // com.google.common.util.concurrent.b
    protected final void afterDone() {
        this.zza = null;
    }

    @Override // com.google.common.util.concurrent.b
    public final String pendingToString() {
        Object obj = this.zza;
        return obj == null ? "" : obj.toString();
    }

    @Override // com.google.common.util.concurrent.b
    public final boolean set(Object obj) {
        return super.set(obj);
    }

    @Override // com.google.common.util.concurrent.b
    public final boolean setException(Throwable th2) {
        return super.setException(th2);
    }
}
