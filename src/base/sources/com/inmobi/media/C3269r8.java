package com.inmobi.media;

import android.graphics.SurfaceTexture;
import android.view.Surface;

/* JADX INFO: renamed from: com.inmobi.media.r8, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class C3269r8 implements Yj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3295s8 f27379a;

    public C3269r8(C3295s8 c3295s8) {
        this.f27379a = c3295s8;
    }

    @Override // com.inmobi.media.Yj
    public final void a(SurfaceTexture surface) {
        kotlin.jvm.internal.s.h(surface, "surface");
        Surface surface2 = new Surface(surface);
        C3295s8 c3295s8 = this.f27379a;
        Surface surface3 = c3295s8.f27447e;
        if (surface3 != null) {
            surface3.release();
        }
        c3295s8.f27447e = surface2;
        Zj zj2 = this.f27379a.f27448f;
        if (zj2 != null) {
            zj2.c();
        }
    }

    @Override // com.inmobi.media.Yj
    public final void a() {
        this.f27379a.f27444b.clearVideoSurface();
        this.f27379a.f27444b.setVideoSurface(null);
        Surface surface = this.f27379a.f27447e;
        if (surface != null) {
            surface.release();
        }
        this.f27379a.f27447e = null;
    }
}
