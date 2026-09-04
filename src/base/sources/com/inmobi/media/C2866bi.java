package com.inmobi.media;

import android.view.ViewGroup;

/* JADX INFO: renamed from: com.inmobi.media.bi, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class C2866bi extends kotlin.coroutines.jvm.internal.m implements tl.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f26268a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ GestureDetectorOnGestureListenerC3228pi f26269b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2866bi(ViewGroup viewGroup, GestureDetectorOnGestureListenerC3228pi gestureDetectorOnGestureListenerC3228pi, kl.f fVar) {
        super(2, fVar);
        this.f26268a = viewGroup;
        this.f26269b = gestureDetectorOnGestureListenerC3228pi;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kl.f create(Object obj, kl.f fVar) {
        return new C2866bi(this.f26268a, this.f26269b, fVar);
    }

    @Override // tl.o
    public final Object invoke(Object obj, Object obj2) {
        return new C2866bi(this.f26268a, this.f26269b, (kl.f) obj2).invokeSuspend(fl.g0.f38750a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        ll.b.f();
        fl.s.b(obj);
        this.f26268a.removeView(this.f26269b);
        return fl.g0.f38750a;
    }
}
