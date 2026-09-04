package com.google.android.gms.internal.measurement;

import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.g0;
import com.google.common.util.concurrent.j;
import com.google.common.util.concurrent.x;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzvb extends zztf {
    private final zzafc zza;

    public zzvb(zzafc zzafcVar) {
        this.zza = zzafcVar;
    }

    @Override // com.google.android.gms.internal.measurement.zztf
    public final ListenableFuture zza(final IOException iOException, zztg zztgVar) {
        return !(iOException.getCause() instanceof zzaeh) ? x.f(iOException) : x.c(zztgVar.zza(x.g(this.zza)), IOException.class, new j() { // from class: com.google.android.gms.internal.measurement.zzva
            @Override // com.google.common.util.concurrent.j
            public final /* synthetic */ ListenableFuture apply(Object obj) throws IOException {
                IOException iOException2 = iOException;
                iOException2.addSuppressed((IOException) obj);
                throw iOException2;
            }
        }, g0.a());
    }
}
