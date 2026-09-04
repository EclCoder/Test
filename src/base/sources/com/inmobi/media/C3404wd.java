package com.inmobi.media;

import com.inmobi.ads.AdMetaInfo;

/* JADX INFO: renamed from: com.inmobi.media.wd, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class C3404wd extends kotlin.coroutines.jvm.internal.m implements tl.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3430xd f27792a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3404wd(C3430xd c3430xd, kl.f fVar) {
        super(2, fVar);
        this.f27792a = c3430xd;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kl.f create(Object obj, kl.f fVar) {
        return new C3404wd(this.f27792a, fVar);
    }

    @Override // tl.o
    public final Object invoke(Object obj, Object obj2) {
        return new C3404wd(this.f27792a, (kl.f) obj2).invokeSuspend(fl.g0.f38750a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        ll.b.f();
        fl.s.b(obj);
        InterfaceC3322t9 interfaceC3322t9L = this.f27792a.l();
        if (interfaceC3322t9L != null) {
            ((C3348u9) interfaceC3322t9L).a("AUM-NativeLoadedState", "Initialize - notifying publisher of load success");
        }
        C3430xd c3430xd = this.f27792a;
        Pc pc2 = c3430xd.f27850i;
        C3068je c3068je = c3430xd.f27847f;
        G g10 = c3430xd.f27890a.f27823b;
        pc2.a(c3068je, new AdMetaInfo(g10.f24815e, g10.f24822l));
        return fl.g0.f38750a;
    }
}
