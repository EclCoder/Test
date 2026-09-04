package com.inmobi.media;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: com.inmobi.media.bn, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class C2871bn implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ androidx.media3.exoplayer.o f26277a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C2897cn f26278b;

    public C2871bn(androidx.media3.exoplayer.o oVar, C2897cn c2897cn) {
        this.f26277a = oVar;
        this.f26278b = c2897cn;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        this.f26277a.n(this.f26278b);
        this.f26277a.stop();
        this.f26277a.b();
        return fl.g0.f38750a;
    }
}
