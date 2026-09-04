package com.inmobi.media;

import android.widget.FrameLayout;

/* JADX INFO: renamed from: com.inmobi.media.rm, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class C3283rm extends kotlin.coroutines.jvm.internal.m implements tl.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Fm f27408a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FrameLayout f27409b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3283rm(Fm fm2, FrameLayout frameLayout, kl.f fVar) {
        super(2, fVar);
        this.f27408a = fm2;
        this.f27409b = frameLayout;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kl.f create(Object obj, kl.f fVar) {
        return new C3283rm(this.f27408a, this.f27409b, fVar);
    }

    @Override // tl.o
    public final Object invoke(Object obj, Object obj2) {
        return new C3283rm(this.f27408a, this.f27409b, (kl.f) obj2).invokeSuspend(fl.g0.f38750a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        ll.b.f();
        fl.s.b(obj);
        C3348u9 c3348u9 = this.f27408a.f24804e;
        if (c3348u9 != null) {
            c3348u9.a("VideoExperienceManager", "inflate called - adding media player to parent layout");
        }
        Mn.a(this.f27408a.f24809j);
        this.f27409b.addView(this.f27408a.f24809j);
        return fl.g0.f38750a;
    }
}
