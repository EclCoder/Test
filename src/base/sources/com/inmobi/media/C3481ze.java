package com.inmobi.media;

import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import java.util.Map;

/* JADX INFO: renamed from: com.inmobi.media.ze, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class C3481ze extends kotlin.coroutines.jvm.internal.m implements tl.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f28014a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Be f28015b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3481ze(Be be2, kl.f fVar) {
        super(2, fVar);
        this.f28015b = be2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kl.f create(Object obj, kl.f fVar) {
        return new C3481ze(this.f28015b, fVar);
    }

    @Override // tl.o
    public final Object invoke(Object obj, Object obj2) {
        return new C3481ze(this.f28015b, (kl.f) obj2).invokeSuspend(fl.g0.f38750a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objF = ll.b.f();
        int i10 = this.f28014a;
        if (i10 == 0) {
            fl.s.b(obj);
            InterfaceC3322t9 interfaceC3322t9L = this.f28015b.l();
            if (interfaceC3322t9L != null) {
                ((C3348u9) interfaceC3322t9L).a("NativeRenderedState", "Track Views Attached to Telemetry Started - waiting for window state change");
            }
            hm.w wVar = ((Po) this.f28015b.f24536b.f24607l.getValue()).f25518b;
            C3456ye c3456ye = new C3456ye(null);
            this.f28014a = 1;
            if (hm.g.q(wVar, c3456ye, this) == objF) {
                return objF;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            fl.s.b(obj);
        }
        Ce ce2 = this.f28015b.f24536b;
        ce2.f24597b.f24793b = true;
        ce2.f24601f.f25893b.f25749e.a(C2863bf.f26261a);
        Be be2 = this.f28015b;
        AbstractC2938ed.a(be2.f24536b.f24598c, be2.l());
        C2874c0 c2874c0 = this.f28015b.f27890a.f27822a.f27106d;
        c2874c0.getClass();
        c2874c0.f26291e = SystemClock.elapsedRealtime();
        Lc lc2 = (Lc) this.f28015b.f24536b.f24602g.f25272f.getValue();
        C2865bh publisherNativeViewData = this.f28015b.f24536b.f24598c;
        lc2.getClass();
        kotlin.jvm.internal.s.h(publisherNativeViewData, "publisherNativeViewData");
        Map mapA = AbstractC3487zk.a(lc2.f25200a);
        ViewGroup parentView = publisherNativeViewData.f26265a.getParentView();
        int i11 = 0;
        for (fl.q qVar : AbstractC2938ed.a(publisherNativeViewData)) {
            View view = (View) qVar.d();
            short sShortValue = ((Number) qVar.g()).shortValue();
            if (view != null && view.getVisibility() == 0 && Mn.a(view, parentView)) {
                i11 |= 1 << sShortValue;
            }
        }
        mapA.put("viewState", Integer.valueOf(i11));
        C3178nk c3178nk = C3178nk.f27064a;
        C3178nk.b("ViewStateOnParentAttached", mapA, EnumC3281rk.SDK);
        return fl.g0.f38750a;
    }
}
