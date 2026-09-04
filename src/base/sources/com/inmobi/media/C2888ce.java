package com.inmobi.media;

import android.media.MediaPlayer;
import android.widget.RelativeLayout;
import com.inmobi.media.C2888ce;

/* JADX INFO: renamed from: com.inmobi.media.ce, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class C2888ce {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C3111l5 f26328a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final RelativeLayout f26329b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final MediaPlayer f26330c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C3348u9 f26331d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Yj f26332e;

    public C2888ce(C3111l5 textureView, RelativeLayout parentView, MediaPlayer mediaPlayer, C3348u9 c3348u9) {
        kotlin.jvm.internal.s.h(textureView, "textureView");
        kotlin.jvm.internal.s.h(parentView, "parentView");
        kotlin.jvm.internal.s.h(mediaPlayer, "mediaPlayer");
        this.f26328a = textureView;
        this.f26329b = parentView;
        this.f26330c = mediaPlayer;
        this.f26331d = c3348u9;
    }

    public final void a(Yj surfaceTextureListener) {
        kotlin.jvm.internal.s.h(surfaceTextureListener, "surfaceTextureListener");
        this.f26332e = surfaceTextureListener;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(13, -1);
        this.f26329b.addView(this.f26328a, layoutParams);
        a();
        int videoWidth = this.f26330c.getVideoWidth();
        int videoHeight = this.f26330c.getVideoHeight();
        if (videoHeight == 0) {
            this.f26328a.setAspectRatio(1.0f);
        } else {
            this.f26328a.setAspectRatio(videoWidth / videoHeight);
        }
        this.f26328a.setSurfaceTextureListener(new TextureViewSurfaceTextureListenerC2862be(this));
    }

    public final void a() {
        this.f26330c.setOnVideoSizeChangedListener(new MediaPlayer.OnVideoSizeChangedListener() { // from class: yh.h7
            @Override // android.media.MediaPlayer.OnVideoSizeChangedListener
            public final void onVideoSizeChanged(MediaPlayer mediaPlayer, int i10, int i11) {
                C2888ce.a(this.f57754a, mediaPlayer, i10, i11);
            }
        });
    }

    public static final void a(C2888ce c2888ce, MediaPlayer mediaPlayer, int i10, int i11) {
        C3348u9 c3348u9 = c2888ce.f26331d;
        if (c3348u9 != null) {
            c3348u9.a("NativePlayerTextureManager", "Video Size Changed: " + i10 + " x " + i11);
        }
        int videoWidth = c2888ce.f26330c.getVideoWidth();
        int videoHeight = c2888ce.f26330c.getVideoHeight();
        if (videoHeight == 0) {
            c2888ce.f26328a.setAspectRatio(1.0f);
        } else {
            c2888ce.f26328a.setAspectRatio(videoWidth / videoHeight);
        }
    }
}
