package com.inmobi.media;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class Xb extends kotlin.coroutines.jvm.internal.m implements tl.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Fb f25999a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Iterator f26000b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f26001c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Fb f26002d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f26003e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f26004f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Xb(Fb fb2, long j10, int i10, kl.f fVar) {
        super(2, fVar);
        this.f26002d = fb2;
        this.f26003e = j10;
        this.f26004f = i10;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kl.f create(Object obj, kl.f fVar) {
        return new Xb(this.f26002d, this.f26003e, this.f26004f, fVar);
    }

    @Override // tl.o
    public final Object invoke(Object obj, Object obj2) {
        return ((Xb) create((em.o0) obj, (kl.f) obj2)).invokeSuspend(fl.g0.f38750a);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0045 A[Catch: all -> 0x0017, TRY_LEAVE, TryCatch #0 {all -> 0x0017, blocks: (B:7:0x0013, B:20:0x003f, B:22:0x0045, B:13:0x0021, B:19:0x0037, B:16:0x0028), top: B:29:0x0009 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x005e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:34:? A[LOOP:0: B:20:0x003f->B:34:?, LOOP_END, SYNTHETIC] */
    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Fb fb2;
        Iterator it;
        String str;
        Object objF = ll.b.f();
        int i10 = this.f26001c;
        try {
            if (i10 == 0) {
                fl.s.b(obj);
                Fb fb3 = this.f26002d;
                long j10 = this.f26003e;
                int i11 = this.f26004f;
                this.f26001c = 1;
                obj = fb3.a(j10, i11, this);
                if (obj == objF) {
                }
                return objF;
            }
            if (i10 == 1) {
                fl.s.b(obj);
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                it = this.f26000b;
                fb2 = this.f25999a;
                fl.s.b(obj);
            }
            while (it.hasNext()) {
                C3453yb c3453yb = (C3453yb) it.next();
                AbstractC2860bc.a(c3453yb.f27931a);
                str = c3453yb.f27931a;
                this.f25999a = fb2;
                this.f26000b = it;
                this.f26001c = 2;
                if (fb2.a(str, this) == objF) {
                    return objF;
                }
            }
            AbstractC2834ac.f26176c.set(false);
            return fl.g0.f38750a;
            fb2 = this.f26002d;
            it = ((List) obj).iterator();
            while (it.hasNext()) {
                C3453yb c3453yb2 = (C3453yb) it.next();
                AbstractC2860bc.a(c3453yb2.f27931a);
                str = c3453yb2.f27931a;
                this.f25999a = fb2;
                this.f26000b = it;
                this.f26001c = 2;
                if (fb2.a(str, this) == objF) {
                    return objF;
                }
            }
            AbstractC2834ac.f26176c.set(false);
            return fl.g0.f38750a;
        } catch (Throwable th2) {
            AbstractC2834ac.f26176c.set(false);
            throw th2;
        }
    }
}
