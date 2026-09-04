package com.inmobi.media;

import java.util.Collection;
import java.util.LinkedList;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class J4 extends kotlin.coroutines.jvm.internal.m implements tl.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f25046a;

    public J4(kl.f fVar) {
        super(2, fVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kl.f create(Object obj, kl.f fVar) {
        return new J4(fVar);
    }

    @Override // tl.o
    public final Object invoke(Object obj, Object obj2) {
        return new J4((kl.f) obj2).invokeSuspend(fl.g0.f38750a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objF = ll.b.f();
        int i10 = this.f25046a;
        if (i10 == 0) {
            fl.s.b(obj);
            G4 g10 = (G4) O4.f25394b.getValue();
            this.f25046a = 1;
            obj = g10.a(this);
            if (obj == objF) {
                return objF;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            fl.s.b(obj);
        }
        LinkedList linkedList = new LinkedList((Collection) obj);
        O4.f25395c = linkedList;
        Object objClone = linkedList.clone();
        kotlin.jvm.internal.s.f(objClone, "null cannot be cast to non-null type java.util.LinkedList<com.inmobi.signals.contextualdata.EncryptedContextualData>");
        O4.f25396d = (LinkedList) objClone;
        return fl.g0.f38750a;
    }
}
