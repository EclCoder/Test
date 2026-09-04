package em;

import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class w1 {

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class a extends kotlin.coroutines.jvm.internal.m implements tl.o {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f38065r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private /* synthetic */ Object f38066s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ tl.a f38067t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(tl.a aVar, kl.f fVar) {
            super(2, fVar);
            this.f38067t = aVar;
        }

        @Override // tl.o
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(o0 o0Var, kl.f fVar) {
            return ((a) create(o0Var, fVar)).invokeSuspend(fl.g0.f38750a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kl.f create(Object obj, kl.f fVar) {
            a aVar = new a(this.f38067t, fVar);
            aVar.f38066s = obj;
            return aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            o0 o0Var = (o0) this.f38066s;
            ll.b.f();
            if (this.f38065r != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            fl.s.b(obj);
            return w1.d(o0Var.i0(), this.f38067t);
        }
    }

    public static final Object b(kl.j jVar, tl.a aVar, kl.f fVar) {
        return i.j(jVar, new a(aVar, null), fVar);
    }

    public static /* synthetic */ Object c(kl.j jVar, tl.a aVar, kl.f fVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            jVar = kl.k.f43531a;
        }
        return b(jVar, aVar, fVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object d(kl.j jVar, tl.a aVar) throws Throwable {
        try {
            x2 x2Var = new x2();
            x2Var.B(b2.i(jVar));
            try {
                return aVar.invoke();
            } finally {
                x2Var.y();
            }
        } catch (InterruptedException e10) {
            throw new CancellationException("Blocking call was interrupted due to parent cancellation").initCause(e10);
        }
    }
}
