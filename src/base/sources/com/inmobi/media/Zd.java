package com.inmobi.media;

import android.content.Context;
import android.media.MediaPlayer;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class Zd implements Zj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C2836ae f26140a;

    public Zd(C2836ae c2836ae) {
        this.f26140a = c2836ae;
    }

    @Override // com.inmobi.media.Zj
    public final void a() {
        C2836ae c2836ae = this.f26140a;
        Bg bg2 = c2836ae.f26205e;
        if (bg2 == Bg.STATE_PAUSED || bg2 == Bg.STATE_PREPARED) {
            Context context = c2836ae.f26207g.getContext();
            kotlin.jvm.internal.s.g(context, "getContext(...)");
            if (AbstractC3051in.a(context, c2836ae.f26202b.f26704a)) {
                C3043ie c3043ie = c2836ae.f26209i;
                T4.a(c3043ie.f26739b, new C2991ge(c3043ie, null));
                c2836ae.f26210j.b();
                MediaPlayer mediaPlayer = c2836ae.f26208h;
                kotlin.jvm.internal.s.h(mediaPlayer, "<this>");
                try {
                    mediaPlayer.start();
                } catch (IllegalStateException unused) {
                }
                T4.a(c2836ae.f26206f, c2836ae.f26201a, new C3465yn(c2836ae.f26208h.getCurrentPosition()));
                c2836ae.f26205e = Bg.STATE_PLAYING;
            }
        }
    }

    @Override // com.inmobi.media.Zj
    public final void b() {
        C2836ae c2836ae = this.f26140a;
        if (c2836ae.f26205e != Bg.STATE_PLAYING) {
            return;
        }
        MediaPlayer mediaPlayer = c2836ae.f26208h;
        kotlin.jvm.internal.s.h(mediaPlayer, "<this>");
        try {
            mediaPlayer.pause();
        } catch (IllegalStateException unused) {
        }
        c2836ae.f26210j.c();
        C3043ie c3043ie = c2836ae.f26209i;
        T4.a(c3043ie.f26739b, new C2965fe(c3043ie, null));
        T4.a(c2836ae.f26206f, c2836ae.f26201a, new C2974fn(c2836ae.f26208h.getCurrentPosition()));
        c2836ae.f26205e = Bg.STATE_PAUSED;
    }

    @Override // com.inmobi.media.Zj
    public final void c() {
        C2836ae c2836ae = this.f26140a;
        if (c2836ae.f26205e != Bg.STATE_PLAYBACK_COMPLETED) {
            return;
        }
        MediaPlayer mediaPlayer = c2836ae.f26208h;
        kotlin.jvm.internal.s.h(mediaPlayer, "<this>");
        try {
            mediaPlayer.seekTo(0);
        } catch (IllegalStateException unused) {
        }
    }
}
