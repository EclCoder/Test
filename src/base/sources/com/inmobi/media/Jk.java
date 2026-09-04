package com.inmobi.media;

import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class Jk extends kotlin.coroutines.jvm.internal.m implements tl.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f25084a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f25085b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ tl.a f25086c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Jk(long j10, tl.a aVar, kl.f fVar) {
        super(2, fVar);
        this.f25085b = j10;
        this.f25086c = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kl.f create(Object obj, kl.f fVar) {
        return new Jk(this.f25085b, this.f25086c, fVar);
    }

    @Override // tl.o
    public final Object invoke(Object obj, Object obj2) {
        return new Jk(this.f25085b, this.f25086c, (kl.f) obj2).invokeSuspend(fl.g0.f38750a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objF = ll.b.f();
        int i10 = this.f25084a;
        try {
            if (i10 == 0) {
                fl.s.b(obj);
                long j10 = this.f25085b;
                this.f25084a = 1;
                if (em.y0.a(j10, this) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                fl.s.b(obj);
            }
            this.f25086c.invoke();
        } catch (CancellationException unused) {
        }
        return fl.g0.f38750a;
    }
}
