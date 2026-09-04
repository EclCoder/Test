package com.inmobi.media;

import android.media.MediaPlayer;

/* JADX INFO: renamed from: com.inmobi.media.de, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class C2914de implements P1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3043ie f26408a;

    public C2914de(C3043ie c3043ie) {
        this.f26408a = c3043ie;
    }

    @Override // com.inmobi.media.P1
    public final void a() {
        this.f26408a.a();
    }

    @Override // com.inmobi.media.P1
    public final void b() {
        C3043ie c3043ie = this.f26408a;
        MediaPlayer mediaPlayer = c3043ie.f26740c;
        kotlin.jvm.internal.s.h(mediaPlayer, "<this>");
        try {
            mediaPlayer.setVolume(1.0f, 1.0f);
        } catch (IllegalStateException unused) {
        }
        c3043ie.a(c3043ie.f26748k, c3043ie.f26747j);
        T4.a(c3043ie.f26742e, c3043ie.f26739b, new S1(1.0f, false));
        c3043ie.f26746i = false;
    }
}
