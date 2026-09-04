package com.inmobi.media;

import android.content.Context;
import android.view.Surface;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.inmobi.media.s8, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class C3295s8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final em.o0 f27443a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final androidx.media3.exoplayer.o f27444b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f27445c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final T7 f27446d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Surface f27447e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Zj f27448f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f27449g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final C3269r8 f27450h;

    public C3295s8(em.o0 coroutineScope, androidx.media3.exoplayer.o mediaPlayer, G1 mediaPlayerLayout, InterfaceC3322t9 interfaceC3322t9) {
        kotlin.jvm.internal.s.h(coroutineScope, "coroutineScope");
        kotlin.jvm.internal.s.h(mediaPlayer, "mediaPlayer");
        kotlin.jvm.internal.s.h(mediaPlayerLayout, "mediaPlayerLayout");
        this.f27443a = coroutineScope;
        this.f27444b = mediaPlayer;
        this.f27445c = new ArrayList();
        Context context = mediaPlayerLayout.getContext();
        kotlin.jvm.internal.s.g(context, "getContext(...)");
        this.f27446d = new T7(new C3111l5(context), mediaPlayerLayout, mediaPlayer, interfaceC3322t9);
        this.f27450h = new C3269r8(this);
    }

    public final void a() {
        T4.a(this.f27445c);
        T7 t10 = this.f27446d;
        t10.f25737e = null;
        t10.f25733a.setSurfaceTextureListener(null);
        Surface surface = this.f27447e;
        if (surface != null) {
            surface.release();
        }
        this.f27447e = null;
        this.f27448f = null;
    }
}
