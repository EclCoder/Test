package com.inmobi.media;

import android.graphics.SurfaceTexture;
import android.view.TextureView;

/* JADX INFO: renamed from: com.inmobi.media.be, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class TextureViewSurfaceTextureListenerC2862be implements TextureView.SurfaceTextureListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C2888ce f26260a;

    public TextureViewSurfaceTextureListenerC2862be(C2888ce c2888ce) {
        this.f26260a = c2888ce;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surface, int i10, int i11) {
        kotlin.jvm.internal.s.h(surface, "surface");
        Yj yj2 = this.f26260a.f26332e;
        if (yj2 != null) {
            yj2.a(surface);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surface) {
        kotlin.jvm.internal.s.h(surface, "surface");
        Yj yj2 = this.f26260a.f26332e;
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
