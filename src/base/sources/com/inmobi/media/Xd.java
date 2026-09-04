package com.inmobi.media;

import android.media.MediaPlayer;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class Xd extends kotlin.coroutines.jvm.internal.m implements tl.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C2836ae f26007a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Xd(C2836ae c2836ae, kl.f fVar) {
        super(2, fVar);
        this.f26007a = c2836ae;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kl.f create(Object obj, kl.f fVar) {
        return new Xd(this.f26007a, fVar);
    }

    @Override // tl.o
    public final Object invoke(Object obj, Object obj2) {
        return new Xd(this.f26007a, (kl.f) obj2).invokeSuspend(fl.g0.f38750a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        ll.b.f();
        fl.s.b(obj);
        C2836ae c2836ae = this.f26007a;
        if (c2836ae.f26202b.f26705b) {
            C3414wn c3414wn = c2836ae.f26210j;
            c3414wn.c();
            c3414wn.f27818g = -1;
            c3414wn.b();
            MediaPlayer mediaPlayer = this.f26007a.f26208h;
            kotlin.jvm.internal.s.h(mediaPlayer, "<this>");
            try {
                mediaPlayer.seekTo(0);
            } catch (IllegalStateException unused) {
            }
            MediaPlayer mediaPlayer2 = this.f26007a.f26208h;
            kotlin.jvm.internal.s.h(mediaPlayer2, "<this>");
            try {
                mediaPlayer2.start();
            } catch (IllegalStateException unused2) {
            }
        } else {
            c2836ae.f26210j.c();
            Fg fg2 = (Fg) this.f26007a.f26211k.f24900i.f27082d.getValue();
            fg2.f24784f.set(true);
            L6.a(fg2.f24783e);
            fg2.f24783e = null;
            this.f26007a.f26205e = Bg.STATE_PLAYBACK_COMPLETED;
        }
        return fl.g0.f38750a;
    }
}
