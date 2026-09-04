package com.inmobi.media;

import android.content.Context;
import java.util.Calendar;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class Qb extends kotlin.coroutines.jvm.internal.m implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f25549a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Rb f25550b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f25551c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Qb(Rb rb2, Context context, kl.f fVar) {
        super(1, fVar);
        this.f25550b = rb2;
        this.f25551c = context;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kl.f create(kl.f fVar) {
        return new Qb(this.f25550b, this.f25551c, fVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return new Qb(this.f25550b, this.f25551c, (kl.f) obj).invokeSuspend(fl.g0.f38750a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objF = ll.b.f();
        int i10 = this.f25549a;
        if (i10 == 0) {
            fl.s.b(obj);
            if (this.f25550b.f25634g.get()) {
                return fl.g0.f38750a;
            }
            Rb rb2 = this.f25550b;
            Context context = this.f25551c;
            this.f25549a = 1;
            if (rb2.a(context, this) == objF) {
                return objF;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            fl.s.b(obj);
        }
        em.o0 o0Var = AbstractC2834ac.f26174a;
        Fb dao = (Fb) Gb.f24849a.getValue();
        long timeInMillis = Calendar.getInstance().getTimeInMillis();
        Rb rb3 = this.f25550b;
        long j10 = timeInMillis - rb3.f25630c;
        int i11 = rb3.f25632e;
        kotlin.jvm.internal.s.h(dao, "dao");
        if (!AbstractC2834ac.f26176c.getAndSet(true)) {
            Yb runnable = new Yb(dao, j10, i11, null);
            em.o0 o0Var2 = AbstractC3488zl.f28033a;
            kotlin.jvm.internal.s.h(runnable, "runnable");
            em.k.d(AbstractC3488zl.f28033a, null, null, new C3412wl(10000L, null, runnable), 3, null);
        }
        return fl.g0.f38750a;
    }
}
