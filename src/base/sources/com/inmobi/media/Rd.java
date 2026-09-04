package com.inmobi.media;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class Rd implements C8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C2948en f25636a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f25637b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f25638c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Long f25639d;

    public Rd(C2948en videoMRC50Model) {
        kotlin.jvm.internal.s.h(videoMRC50Model, "videoMRC50Model");
        this.f25636a = videoMRC50Model;
        this.f25637b = new AtomicBoolean(false);
    }

    @Override // com.inmobi.media.C8
    public final hm.e b() {
        return hm.g.g(new Qd(this, null));
    }

    @Override // com.inmobi.media.C8
    public final void a() {
    }
}
