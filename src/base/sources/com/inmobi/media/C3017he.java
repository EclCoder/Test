package com.inmobi.media;

import android.media.MediaPlayer;

/* JADX INFO: renamed from: com.inmobi.media.he, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class C3017he extends kotlin.coroutines.jvm.internal.m implements tl.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3043ie f26675a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3017he(C3043ie c3043ie, kl.f fVar) {
        super(2, fVar);
        this.f26675a = c3043ie;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kl.f create(Object obj, kl.f fVar) {
        return new C3017he(this.f26675a, fVar);
    }

    @Override // tl.o
    public final Object invoke(Object obj, Object obj2) {
        return new C3017he(this.f26675a, (kl.f) obj2).invokeSuspend(fl.g0.f38750a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        ll.b.f();
        fl.s.b(obj);
        if (this.f26675a.f26743f.e()) {
            C3043ie c3043ie = this.f26675a;
            MediaPlayer mediaPlayer = c3043ie.f26740c;
            kotlin.jvm.internal.s.h(mediaPlayer, "<this>");
            try {
                mediaPlayer.setVolume(1.0f, 1.0f);
            } catch (IllegalStateException unused) {
            }
            c3043ie.a(c3043ie.f26748k, c3043ie.f26747j);
            T4.a(c3043ie.f26742e, c3043ie.f26739b, new S1(1.0f, false));
            c3043ie.f26746i = false;
        } else {
            this.f26675a.a();
        }
        return fl.g0.f38750a;
    }
}
