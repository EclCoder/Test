package com.inmobi.media;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.inmobi.media.To;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class To extends kotlin.coroutines.jvm.internal.m implements tl.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f25775a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f25776b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f25777c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public To(ViewGroup viewGroup, kl.f fVar) {
        super(2, fVar);
        this.f25777c = viewGroup;
    }

    public static final void a(gm.s sVar, boolean z10) {
        sVar.e(Boolean.valueOf(z10));
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kl.f create(Object obj, kl.f fVar) {
        To to2 = new To(this.f25777c, fVar);
        to2.f25776b = obj;
        return to2;
    }

    @Override // tl.o
    public final Object invoke(Object obj, Object obj2) {
        To to2 = new To(this.f25777c, (kl.f) obj2);
        to2.f25776b = (gm.s) obj;
        return to2.invokeSuspend(fl.g0.f38750a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objF = ll.b.f();
        int i10 = this.f25775a;
        if (i10 == 0) {
            fl.s.b(obj);
            final gm.s sVar = (gm.s) this.f25776b;
            ViewTreeObserver.OnWindowFocusChangeListener onWindowFocusChangeListener = new ViewTreeObserver.OnWindowFocusChangeListener() { // from class: yh.m4
                @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
                public final void onWindowFocusChanged(boolean z10) {
                    To.a(sVar, z10);
                }
            };
            this.f25777c.getViewTreeObserver().addOnWindowFocusChangeListener(onWindowFocusChangeListener);
            ViewGroup viewGroup = this.f25777c;
            if (n0.q0.S(viewGroup)) {
                viewGroup.addOnAttachStateChangeListener(new So(viewGroup, viewGroup, onWindowFocusChangeListener));
            } else {
                viewGroup.getViewTreeObserver().removeOnWindowFocusChangeListener(onWindowFocusChangeListener);
            }
            tl.a aVar = new tl.a() { // from class: yh.n4
                @Override // tl.a
                public final Object invoke() {
                    return To.a();
                }
            };
            this.f25775a = 1;
            if (gm.q.a(sVar, aVar, this) == objF) {
                return objF;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            fl.s.b(obj);
        }
        return fl.g0.f38750a;
    }

    public static final fl.g0 a() {
        return fl.g0.f38750a;
    }
}
