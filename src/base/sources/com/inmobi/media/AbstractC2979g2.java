package com.inmobi.media;

import java.util.Objects;

/* JADX INFO: renamed from: com.inmobi.media.g2, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC2979g2 implements C2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final tl.a f26579a;

    public AbstractC2979g2(tl.a predicate) {
        kotlin.jvm.internal.s.h(predicate, "predicate");
        this.f26579a = predicate;
    }

    public final void a(D2 beaconExtras) {
        kotlin.jvm.internal.s.h(beaconExtras, "beaconExtras");
        if (((Boolean) this.f26579a.invoke()).booleanValue()) {
            Objects.toString(beaconExtras);
            b(beaconExtras);
        }
    }

    public abstract void b(D2 d10);
}
