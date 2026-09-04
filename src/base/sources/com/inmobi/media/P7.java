package com.inmobi.media;

import android.view.Surface;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class P7 implements Zj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ R7 f25467a;

    public P7(R7 r10) {
        this.f25467a = r10;
    }

    @Override // com.inmobi.media.Zj
    public final void a() {
        this.f25467a.d();
    }

    @Override // com.inmobi.media.Zj
    public final void b() {
        this.f25467a.c();
    }

    @Override // com.inmobi.media.Zj
    public final void c() {
        Surface surface;
        R7 r10 = this.f25467a;
        if (r10.f25604q != null) {
            C3295s8 c3295s8 = r10.f25613z;
            if (c3295s8.f27449g || (surface = c3295s8.f27447e) == null) {
                return;
            }
            c3295s8.f27449g = true;
            c3295s8.f27444b.setVideoSurface(surface);
        }
    }
}
