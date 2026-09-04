package com.google.android.gms.internal.ads;

import em.o0;
import em.p0;
import em.r1;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzgbi {
    public static final zzgbg zza(final ExecutorService executorService) {
        s.h(executorService, "executorService");
        return new zzgbg() { // from class: com.google.android.gms.internal.ads.zzgbh
            @Override // com.google.android.gms.internal.ads.zzgbg
            public final /* synthetic */ o0 zza() {
                return p0.a(r1.b(executorService));
            }
        };
    }
}
