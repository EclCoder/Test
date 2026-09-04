package com.inmobi.media;

import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class Dm extends kotlin.coroutines.jvm.internal.m implements tl.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Fm f24671a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ O3 f24672b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Dm(Fm fm2, O3 o10, kl.f fVar) {
        super(2, fVar);
        this.f24671a = fm2;
        this.f24672b = o10;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kl.f create(Object obj, kl.f fVar) {
        return new Dm(this.f24671a, this.f24672b, fVar);
    }

    @Override // tl.o
    public final Object invoke(Object obj, Object obj2) {
        return new Dm(this.f24671a, this.f24672b, (kl.f) obj2).invokeSuspend(fl.g0.f38750a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) throws M3 {
        String str;
        ll.b.f();
        fl.s.b(obj);
        C3348u9 c3348u9 = this.f24671a.f24804e;
        if (c3348u9 != null) {
            c3348u9.a("VideoExperienceManager", "Companion Ad Rendered");
        }
        ViewGroup viewGroup = this.f24671a.f24809j;
        ViewParent parent = viewGroup != null ? viewGroup.getParent() : null;
        FrameLayout parentView = parent instanceof FrameLayout ? (FrameLayout) parent : null;
        if (parentView != null) {
            parentView.removeAllViews();
        }
        Fm fm2 = this.f24671a;
        fm2.f24809j = null;
        InterfaceC3144mc interfaceC3144mc = fm2.f24807h;
        if (interfaceC3144mc == null) {
            kotlin.jvm.internal.s.w("mediaPlayer");
            interfaceC3144mc = null;
        }
        C2836ae c2836ae = (C2836ae) interfaceC3144mc;
        C3348u9 c3348u10 = c2836ae.f26203c;
        if (c3348u10 != null) {
            c3348u10.a("NativeMediaPlayer", "destroy called");
        }
        c2836ae.f26205e = Bg.STATE_DESTROYED;
        T4.a(c2836ae.f26204d);
        c2836ae.f26211k.b();
        C3043ie c3043ie = c2836ae.f26209i;
        c3043ie.f26744g.removeAllViews();
        c3043ie.f26743f.d();
        c2836ae.f26210j.c();
        c2836ae.f26207g.removeAllViews();
        c2836ae.f26208h.release();
        if (parentView == null) {
            return null;
        }
        O3 o10 = this.f24672b;
        o10.getClass();
        kotlin.jvm.internal.s.h(parentView, "parentView");
        if (!kotlin.jvm.internal.s.c(o10.f25391i, P3.f25452a)) {
            T3 t10 = o10.f25391i;
            if (kotlin.jvm.internal.s.c(t10, Q3.f25535a)) {
                str = "Companion ad has not started loading";
            } else if (kotlin.jvm.internal.s.c(t10, S3.f25668a)) {
                str = "Companion ad is still loading";
            } else {
                str = kotlin.jvm.internal.s.c(t10, R3.f25579a) ? "Companion ad failed to load" : "Companion ad view is not available";
            }
            throw new M3(str);
        }
        C3348u9 c3348u11 = o10.f25385c;
        if (c3348u11 != null) {
            c3348u11.a("CompanionAdManager", "renderCompanionView");
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        parentView.addView(o10.f25388f, layoutParams);
        o10.b();
        Dl dl2 = o10.f25389g;
        if (dl2 != null) {
            List listS0 = gl.r.s0(dl2.f24669b, dl2.f24670c);
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : listS0) {
                if (kotlin.jvm.internal.s.c(((De) obj2).f24653b, "creativeView")) {
                    arrayList.add(obj2);
                }
            }
            ArrayList arrayList2 = new ArrayList(gl.r.v(arrayList, 10));
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj3 = arrayList.get(i10);
                i10++;
                arrayList2.add(((De) obj3).f24652a);
            }
            Map mapA = AbstractC3487zk.a(o10.f25384b.f26112a);
            C3178nk c3178nk = C3178nk.f27064a;
            C3178nk.b("CompanionAdRendered", mapA, EnumC3281rk.SDK);
            T4.a(o10.f25386d, o10.f25383a, new C2826a4(arrayList2));
        }
        return fl.g0.f38750a;
    }
}
