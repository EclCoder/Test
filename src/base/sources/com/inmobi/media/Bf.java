package com.inmobi.media;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class Bf extends kotlin.coroutines.jvm.internal.m implements tl.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f24538a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Re f24539b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Bf(Re re2, kl.f fVar) {
        super(2, fVar);
        this.f24539b = re2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kl.f create(Object obj, kl.f fVar) {
        return new Bf(this.f24539b, fVar);
    }

    @Override // tl.o
    public final Object invoke(Object obj, Object obj2) {
        return new Bf(this.f24539b, (kl.f) obj2).invokeSuspend(fl.g0.f38750a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) throws IOException {
        Object objF = ll.b.f();
        int i10 = this.f24538a;
        if (i10 == 0) {
            fl.s.b(obj);
            B9 b10 = (B9) Pe.f25486c.getValue();
            Re re2 = this.f24539b;
            this.f24538a = 1;
            obj = b10.f24525a.a(re2, this);
            if (obj == objF) {
                return objF;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            fl.s.b(obj);
        }
        Ve ve2 = (Ve) obj;
        if (!AbstractC3438xl.a(ve2)) {
            throw new IOException();
        }
        yl.f fVar = AbstractC2837af.f26214a;
        kotlin.jvm.internal.s.h(ve2, "<this>");
        return ve2.d().F(bm.d.f9079b);
    }
}
