package com.inmobi.media;

import android.graphics.drawable.Drawable;
import ta.QXA.YSHErhbVu;

/* JADX INFO: renamed from: com.inmobi.media.m5, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public final class C3137m5 extends kotlin.coroutines.jvm.internal.m implements tl.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f26974a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C3163n5 f26975b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f26976c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f26977d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f26978e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f26979f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f26980g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3137m5(C3163n5 c3163n5, int i10, int i11, int i12, int i13, int i14, kl.f fVar) {
        super(2, fVar);
        this.f26975b = c3163n5;
        this.f26976c = i10;
        this.f26977d = i11;
        this.f26978e = i12;
        this.f26979f = i13;
        this.f26980g = i14;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kl.f create(Object obj, kl.f fVar) {
        C3137m5 c3137m5 = new C3137m5(this.f26975b, this.f26976c, this.f26977d, this.f26978e, this.f26979f, this.f26980g, fVar);
        c3137m5.f26974a = obj;
        return c3137m5;
    }

    @Override // tl.o
    public final Object invoke(Object obj, Object obj2) {
        return ((C3137m5) create((em.o0) obj, (kl.f) obj2)).invokeSuspend(fl.g0.f38750a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        ll.b.f();
        fl.s.b(obj);
        Drawable drawable = androidx.core.content.a.getDrawable(this.f26975b.getContext(), this.f26976c);
        if (drawable == null) {
            C3163n5 c3163n5 = this.f26975b;
            InterfaceC3322t9 interfaceC3322t9 = c3163n5.f27033b;
            if (interfaceC3322t9 != null) {
                ((C3348u9) interfaceC3322t9).b("CustomView", YSHErhbVu.vCUPlaUgfo + ((int) c3163n5.f27032a) + " cannot be created");
            }
            return fl.g0.f38750a;
        }
        this.f26975b.a(drawable, this.f26977d, this.f26978e, this.f26979f, this.f26980g);
        return fl.g0.f38750a;
    }
}
