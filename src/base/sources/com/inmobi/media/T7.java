package com.inmobi.media;

import android.widget.FrameLayout;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class T7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C3111l5 f25733a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final G1 f25734b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final androidx.media3.exoplayer.o f25735c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final InterfaceC3322t9 f25736d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Yj f25737e;

    public T7(C3111l5 textureView, G1 parentView, androidx.media3.exoplayer.o mediaPlayer, InterfaceC3322t9 interfaceC3322t9) {
        kotlin.jvm.internal.s.h(textureView, "textureView");
        kotlin.jvm.internal.s.h(parentView, "parentView");
        kotlin.jvm.internal.s.h(mediaPlayer, "mediaPlayer");
        this.f25733a = textureView;
        this.f25734b = parentView;
        this.f25735c = mediaPlayer;
        this.f25736d = interfaceC3322t9;
    }

    public final void a(int i10, int i11) {
        InterfaceC3322t9 interfaceC3322t9 = this.f25736d;
        if (interfaceC3322t9 != null) {
            ((C3348u9) interfaceC3322t9).a("HtmlPlayerTextureManager", "Video Size Changed: " + i10 + " x " + i11);
        }
        int i12 = this.f25735c.i().f52694a;
        int i13 = this.f25735c.i().f52695b;
        if (i13 == 0) {
            this.f25733a.setAspectRatio(1.0f);
        } else {
            this.f25733a.setAspectRatio(i12 / i13);
        }
    }

    public final void a(Yj surfaceTextureListener) {
        kotlin.jvm.internal.s.h(surfaceTextureListener, "surfaceTextureListener");
        this.f25737e = surfaceTextureListener;
        this.f25734b.addView(this.f25733a, new FrameLayout.LayoutParams(-1, -1));
        int i10 = this.f25735c.i().f52694a;
        int i11 = this.f25735c.i().f52695b;
        if (i11 == 0) {
            this.f25733a.setAspectRatio(1.0f);
        } else {
            this.f25733a.setAspectRatio(i10 / i11);
        }
        this.f25733a.setSurfaceTextureListener(new S7(this));
    }
}
