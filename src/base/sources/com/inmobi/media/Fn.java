package com.inmobi.media;

import android.graphics.SurfaceTexture;
import android.media.MediaPlayer;
import android.view.Surface;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class Fn implements Yj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Gn f24810a;

    public Fn(Gn gn2) {
        this.f24810a = gn2;
    }

    @Override // com.inmobi.media.Yj
    public final void a(SurfaceTexture surface) {
        kotlin.jvm.internal.s.h(surface, "surface");
        Surface surface2 = new Surface(surface);
        Gn gn2 = this.f24810a;
        gn2.f24898g = surface2;
        MediaPlayer mediaPlayer = gn2.f24893b;
        kotlin.jvm.internal.s.h(mediaPlayer, "<this>");
        try {
            mediaPlayer.setSurface(surface2);
        } catch (IllegalStateException unused) {
        }
        this.f24810a.a();
        Zj zj2 = this.f24810a.f24899h;
        if (zj2 != null) {
            zj2.c();
        }
    }

    @Override // com.inmobi.media.Yj
    public final void a() {
        Surface surface = this.f24810a.f24898g;
        if (surface != null) {
            surface.release();
        }
        Gn gn2 = this.f24810a;
        gn2.f24898g = null;
        MediaPlayer mediaPlayer = gn2.f24893b;
        kotlin.jvm.internal.s.h(mediaPlayer, "<this>");
        try {
            mediaPlayer.setSurface(null);
        } catch (IllegalStateException unused) {
        }
        this.f24810a.a();
    }
}
