package com.inmobi.media;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.inmobi.media.Vo;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class Vo extends kotlin.coroutines.jvm.internal.m implements tl.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f25913a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f25914b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f25915c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Vo(ViewGroup viewGroup, kl.f fVar) {
        super(2, fVar);
        this.f25915c = viewGroup;
    }

    public static final void a(gm.s sVar, int i10) {
        sVar.e(Boolean.valueOf(i10 == 0));
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kl.f create(Object obj, kl.f fVar) {
        Vo vo2 = new Vo(this.f25915c, fVar);
        vo2.f25914b = obj;
        return vo2;
    }

    @Override // tl.o
    public final Object invoke(Object obj, Object obj2) {
        Vo vo2 = new Vo(this.f25915c, (kl.f) obj2);
        vo2.f25914b = (gm.s) obj;
        return vo2.invokeSuspend(fl.g0.f38750a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objF = ll.b.f();
        int i10 = this.f25913a;
        if (i10 == 0) {
            fl.s.b(obj);
            final gm.s sVar = (gm.s) this.f25914b;
            sVar.e(kotlin.coroutines.jvm.internal.b.a(this.f25915c.getWindowVisibility() == 0));
            ViewTreeObserver.OnWindowVisibilityChangeListener onWindowVisibilityChangeListener = new ViewTreeObserver.OnWindowVisibilityChangeListener() { // from class: yh.i5
                @Override // android.view.ViewTreeObserver.OnWindowVisibilityChangeListener
                public final void onWindowVisibilityChanged(int i11) {
                    Vo.a(sVar, i11);
                }
            };
            this.f25915c.getViewTreeObserver().addOnWindowVisibilityChangeListener(onWindowVisibilityChangeListener);
            ViewGroup viewGroup = this.f25915c;
            if (n0.q0.S(viewGroup)) {
                viewGroup.addOnAttachStateChangeListener(new Uo(viewGroup, viewGroup, onWindowVisibilityChangeListener));
            } else {
                viewGroup.getViewTreeObserver().removeOnWindowVisibilityChangeListener(onWindowVisibilityChangeListener);
            }
            tl.a aVar = new tl.a() { // from class: yh.j5
                @Override // tl.a
                public final Object invoke() {
                    return Vo.a();
                }
            };
            this.f25913a = 1;
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
