package com.inmobi.media;

import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class I8 implements InterfaceC2916dg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ J8 f24991a;

    public I8(J8 j10) {
        this.f24991a = j10;
    }

    @Override // com.inmobi.media.InterfaceC2916dg
    public final Object a(C2967fg c2967fg, kl.f fVar) {
        WeakReference weakReference = (WeakReference) this.f24991a.f27339b.get(c2967fg.f26556a.f26148h);
        InterfaceC3174ng interfaceC3174ng = weakReference != null ? (InterfaceC3174ng) weakReference.get() : null;
        if (!AbstractC3044ig.a(c2967fg)) {
            Object objA = this.f24991a.a(c2967fg, interfaceC3174ng, fVar);
            return objA == ll.b.f() ? objA : fl.g0.f38750a;
        }
        J8 j10 = this.f24991a;
        j10.getClass();
        AbstractC3252qg.a(c2967fg, interfaceC3174ng);
        Object objA2 = j10.f27338a.f27857a.a("pings", "id=?", new String[]{c2967fg.f26556a.f26142b}, fVar);
        if (objA2 != ll.b.f()) {
            objA2 = fl.g0.f38750a;
        }
        if (objA2 != ll.b.f()) {
            objA2 = fl.g0.f38750a;
        }
        return objA2 == ll.b.f() ? objA2 : fl.g0.f38750a;
    }
}
