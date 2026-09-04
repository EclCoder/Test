package com.inmobi.media;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class H7 extends kotlin.coroutines.jvm.internal.m implements tl.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ R7 f24922a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H7(kl.f fVar, R7 r10) {
        super(2, fVar);
        this.f24922a = r10;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kl.f create(Object obj, kl.f fVar) {
        return new H7(fVar, this.f24922a);
    }

    @Override // tl.o
    public final Object invoke(Object obj, Object obj2) {
        return new H7((kl.f) obj2, this.f24922a).invokeSuspend(fl.g0.f38750a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        ll.b.f();
        fl.s.b(obj);
        this.f24922a.f25603p.pause();
        this.f24922a.f25611x.a();
        W7 w10 = this.f24922a.f25612y;
        w10.f25928b.setVolume(0.0f);
        w10.f25930d.a();
        R7 r10 = this.f24922a;
        r10.f25599l.set(Bg.STATE_PAUSED);
        R7 r11 = this.f24922a;
        r11.a(new C2974fn(r11.f25603p.getCurrentPosition()));
        return fl.g0.f38750a;
    }
}
