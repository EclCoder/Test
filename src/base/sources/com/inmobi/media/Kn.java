package com.inmobi.media;

import android.view.View;
import android.view.ViewGroup;
import com.inmobi.media.Kn;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class Kn extends kotlin.coroutines.jvm.internal.m implements tl.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f25143a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f25144b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f25145c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f25146d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Kn(View view, ViewGroup viewGroup, kl.f fVar) {
        super(2, fVar);
        this.f25145c = view;
        this.f25146d = viewGroup;
    }

    public static final fl.g0 a(View view, Jn jn2) {
        view.removeOnAttachStateChangeListener(jn2);
        return fl.g0.f38750a;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kl.f create(Object obj, kl.f fVar) {
        Kn kn2 = new Kn(this.f25145c, this.f25146d, fVar);
        kn2.f25144b = obj;
        return kn2;
    }

    @Override // tl.o
    public final Object invoke(Object obj, Object obj2) {
        return ((Kn) create((gm.s) obj, (kl.f) obj2)).invokeSuspend(fl.g0.f38750a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objF = ll.b.f();
        int i10 = this.f25143a;
        if (i10 == 0) {
            fl.s.b(obj);
            gm.s sVar = (gm.s) this.f25144b;
            View view = this.f25145c;
            final Jn jn2 = new Jn(sVar, view, this.f25146d);
            view.addOnAttachStateChangeListener(jn2);
            sVar.e(kotlin.coroutines.jvm.internal.b.a(Mn.b(this.f25145c, this.f25146d)));
            final View view2 = this.f25145c;
            tl.a aVar = new tl.a() { // from class: yh.c2
                @Override // tl.a
                public final Object invoke() {
                    return Kn.a(view2, jn2);
                }
            };
            this.f25143a = 1;
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
}
