package com.inmobi.media;

import android.graphics.SurfaceTexture;
import android.view.TextureView;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class S7 implements TextureView.SurfaceTextureListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ T7 f25677a;

    public S7(T7 t10) {
        this.f25677a = t10;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surface, int i10, int i11) {
        kotlin.jvm.internal.s.h(surface, "surface");
        Yj yj2 = this.f25677a.f25737e;
        if (yj2 != null) {
            yj2.a(surface);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surface) {
        kotlin.jvm.internal.s.h(surface, "surface");
        Yj yj2 = this.f25677a.f25737e;
        if (yj2 == null) {
            return true;
        }
        yj2.a();
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surface, int i10, int i11) {
        kotlin.jvm.internal.s.h(surface, "surface");
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surface) {
        kotlin.jvm.internal.s.h(surface, "surface");
    }
}
