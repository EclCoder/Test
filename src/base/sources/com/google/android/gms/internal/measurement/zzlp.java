package com.google.android.gms.internal.measurement;

import com.google.common.util.concurrent.g0;
import java.util.concurrent.Executors;
import sc.x;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final /* synthetic */ class zzlp implements x {
    static final /* synthetic */ zzlp zza = new zzlp();

    private /* synthetic */ zzlp() {
    }

    @Override // sc.x
    public final /* synthetic */ Object get() {
        int i10 = zzlk.zza;
        return g0.b(Executors.newSingleThreadScheduledExecutor(zzlo.zza));
    }
}
