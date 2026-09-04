package com.inmobi.media;

import android.view.View;
import android.view.ViewGroup;
import com.inmobi.media.Ro;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class Ro extends kotlin.coroutines.jvm.internal.m implements tl.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f25662a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f25663b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f25664c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ro(ViewGroup viewGroup, kl.f fVar) {
        super(2, fVar);
        this.f25664c = viewGroup;
    }

    public static final fl.g0 a(View view, Qo qo2) {
        view.removeOnAttachStateChangeListener(qo2);
        return fl.g0.f38750a;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kl.f create(Object obj, kl.f fVar) {
        Ro ro2 = new Ro(this.f25664c, fVar);
        ro2.f25663b = obj;
        return ro2;
    }

    @Override // tl.o
    public final Object invoke(Object obj, Object obj2) {
        Ro ro2 = new Ro(this.f25664c, (kl.f) obj2);
        ro2.f25663b = (gm.s) obj;
        return ro2.invokeSuspend(fl.g0.f38750a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objF = ll.b.f();
        int i10 = this.f25662a;
        if (i10 == 0) {
            fl.s.b(obj);
            gm.s sVar = (gm.s) this.f25663b;
            sVar.e(kotlin.coroutines.jvm.internal.b.a(this.f25664c.isAttachedToWindow()));
            final Qo qo2 = new Qo(sVar);
            this.f25664c.addOnAttachStateChangeListener(qo2);
            final ViewGroup viewGroup = this.f25664c;
            tl.a aVar = new tl.a() { // from class: yh.x3
                @Override // tl.a
                public final Object invoke() {
                    return Ro.a(viewGroup, qo2);
                }
            };
            this.f25662a = 1;
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
