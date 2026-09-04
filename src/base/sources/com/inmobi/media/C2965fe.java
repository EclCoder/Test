package com.inmobi.media;

import android.media.MediaPlayer;

/* JADX INFO: renamed from: com.inmobi.media.fe, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class C2965fe extends kotlin.coroutines.jvm.internal.m implements tl.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3043ie f26552a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2965fe(C3043ie c3043ie, kl.f fVar) {
        super(2, fVar);
        this.f26552a = c3043ie;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kl.f create(Object obj, kl.f fVar) {
        return new C2965fe(this.f26552a, fVar);
    }

    @Override // tl.o
    public final Object invoke(Object obj, Object obj2) {
        return new C2965fe(this.f26552a, (kl.f) obj2).invokeSuspend(fl.g0.f38750a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        ll.b.f();
        fl.s.b(obj);
        this.f26552a.f26744g.setActivated(false);
        this.f26552a.f26744g.setFocusable(false);
        MediaPlayer mediaPlayer = this.f26552a.f26740c;
        kotlin.jvm.internal.s.h(mediaPlayer, "<this>");
        try {
            mediaPlayer.setVolume(0.0f, 0.0f);
        } catch (IllegalStateException unused) {
        }
        this.f26552a.f26743f.a();
        return fl.g0.f38750a;
    }
}
