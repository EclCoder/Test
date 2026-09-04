package com.inmobi.media;

import com.inmobi.media.videoPlayer.model.HtmlVideoPlaybackState;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class Aa extends kotlin.coroutines.jvm.internal.m implements tl.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Ca f24461a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.k0 f24462b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ CountDownLatch f24463c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Aa(Ca ca2, kotlin.jvm.internal.k0 k0Var, CountDownLatch countDownLatch, kl.f fVar) {
        super(2, fVar);
        this.f24461a = ca2;
        this.f24462b = k0Var;
        this.f24463c = countDownLatch;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kl.f create(Object obj, kl.f fVar) {
        return new Aa(this.f24461a, this.f24462b, this.f24463c, fVar);
    }

    @Override // tl.o
    public final Object invoke(Object obj, Object obj2) {
        return ((Aa) create((em.o0) obj, (kl.f) obj2)).invokeSuspend(fl.g0.f38750a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        ll.b.f();
        fl.s.b(obj);
        try {
            HtmlVideoPlaybackState obj2 = this.f24461a.f24583a.getPlaybackState();
            if (obj2 == null) {
                obj2 = new HtmlVideoPlaybackState();
            }
            kotlin.jvm.internal.k0 k0Var = this.f24462b;
            kotlin.jvm.internal.s.h(obj2, "obj");
            k0Var.f43597a = AbstractC3323ta.a(obj2, HtmlVideoPlaybackState.class);
            return fl.g0.f38750a;
        } finally {
            this.f24463c.countDown();
        }
    }
}
