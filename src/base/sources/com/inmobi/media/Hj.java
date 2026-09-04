package com.inmobi.media;

import android.widget.FrameLayout;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class Hj extends kotlin.coroutines.jvm.internal.m implements tl.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Nj f24955a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FrameLayout f24956b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Hj(Nj nj2, FrameLayout frameLayout, kl.f fVar) {
        super(2, fVar);
        this.f24955a = nj2;
        this.f24956b = frameLayout;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kl.f create(Object obj, kl.f fVar) {
        return new Hj(this.f24955a, this.f24956b, fVar);
    }

    @Override // tl.o
    public final Object invoke(Object obj, Object obj2) {
        return new Hj(this.f24955a, this.f24956b, (kl.f) obj2).invokeSuspend(fl.g0.f38750a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        ll.b.f();
        fl.s.b(obj);
        C3348u9 c3348u9 = this.f24955a.f25361e;
        if (c3348u9 != null) {
            c3348u9.a("StaticExperienceManager", "inflate called - adding ImageView to parent layout");
        }
        Mn.a(this.f24955a.f25363g);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        this.f24956b.addView(this.f24955a.f25363g, layoutParams);
        return fl.g0.f38750a;
    }
}
