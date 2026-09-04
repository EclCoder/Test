package com.inmobi.media;

import com.inmobi.media.C3094ke;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: com.inmobi.media.ke, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class C3094ke extends kotlin.coroutines.jvm.internal.m implements tl.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Be f26856a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3094ke(Be be2, kl.f fVar) {
        super(2, fVar);
        this.f26856a = be2;
    }

    public static final fl.g0 a(Be be2, short s10) {
        InterfaceC3322t9 interfaceC3322t9L = be2.l();
        if (interfaceC3322t9L != null) {
            ((C3348u9) interfaceC3322t9L).a("NativeRenderedState", "onAssetClickEvent " + ((int) s10));
        }
        ((C2835ad) be2.f24536b.f24608m.getValue()).a(s10);
        return fl.g0.f38750a;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kl.f create(Object obj, kl.f fVar) {
        return new C3094ke(this.f26856a, fVar);
    }

    @Override // tl.o
    public final Object invoke(Object obj, Object obj2) {
        return new C3094ke(this.f26856a, (kl.f) obj2).invokeSuspend(fl.g0.f38750a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        ll.b.f();
        fl.s.b(obj);
        C2917dh c2917dh = (C2917dh) this.f26856a.f24536b.f24610o.getValue();
        final Be be2 = this.f26856a;
        C2865bh c2865bh = be2.f24536b.f24598c;
        Function1 function1 = new Function1() { // from class: yh.c9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return C3094ke.a(be2, ((Short) obj2).shortValue());
            }
        };
        c2917dh.getClass();
        C2917dh.a(c2865bh, function1);
        return fl.g0.f38750a;
    }
}
