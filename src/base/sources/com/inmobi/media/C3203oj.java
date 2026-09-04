package com.inmobi.media;

import android.location.LocationManager;
import com.google.android.gms.common.api.GoogleApiClient;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: com.inmobi.media.oj, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class C3203oj extends kotlin.coroutines.jvm.internal.m implements Function1 {
    public C3203oj(kl.f fVar) {
        super(1, fVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kl.f create(kl.f fVar) {
        return new C3203oj(fVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return new C3203oj((kl.f) obj).invokeSuspend(fl.g0.f38750a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        ll.b.f();
        fl.s.b(obj);
        kotlin.jvm.internal.s.g(AbstractC3229pj.f27270b, "access$getTAG$p(...)");
        C3350ub c3350ub = C3350ub.f27616a;
        if (C3350ub.d()) {
            LocationManager locationManager = C3350ub.f27617b;
            if (locationManager != null) {
                locationManager.removeUpdates(c3350ub);
            }
            GoogleApiClient googleApiClient = C3350ub.f27619d;
            if (googleApiClient != null) {
                googleApiClient.disconnect();
            }
        }
        C3350ub.f27619d = null;
        return fl.g0.f38750a;
    }
}
