package z0;

import em.z1;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.channels.ClosedSendChannelException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final em.o0 f58226a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final tl.o f58227b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final gm.g f58228c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final z0.b f58229d;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class a extends kotlin.jvm.internal.t implements Function1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function1 f58230a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ f0 f58231b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ tl.o f58232c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Function1 function1, f0 f0Var, tl.o oVar) {
            super(1);
            this.f58230a = function1;
            this.f58231b = f0Var;
            this.f58232c = oVar;
        }

        public final void a(Throwable th2) {
            fl.g0 g0Var;
            this.f58230a.invoke(th2);
            this.f58231b.f58228c.w(th2);
            do {
                Object objF = gm.k.f(this.f58231b.f58228c.g());
                if (objF != null) {
                    this.f58232c.invoke(objF, th2);
                    g0Var = fl.g0.f38750a;
                } else {
                    g0Var = null;
                }
            } while (g0Var != null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Throwable) obj);
            return fl.g0.f38750a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class b extends kotlin.coroutines.jvm.internal.m implements tl.o {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f58233r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f58234s;

        b(kl.f fVar) {
            super(2, fVar);
        }

        @Override // tl.o
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(em.o0 o0Var, kl.f fVar) {
            return ((b) create(o0Var, fVar)).invokeSuspend(fl.g0.f38750a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kl.f create(Object obj, kl.f fVar) {
            return f0.this.new b(fVar);
        }

        /* JADX WARN: Code duplicated, block: B:15:0x0051 A[PHI: r1 r6
          0x0051: PHI (r1v1 tl.o) = (r1v2 tl.o), (r1v4 tl.o) binds: [B:13:0x004e, B:9:0x001a] A[DONT_GENERATE, DONT_INLINE]
          0x0051: PHI (r6v5 java.lang.Object) = (r6v12 java.lang.Object), (r6v0 java.lang.Object) binds: [B:13:0x004e, B:9:0x001a] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x005a, code lost:
        
            if (r1.invoke(r6, r5) == r0) goto L17;
         */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x005a -> B:18:0x005d). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = ll.b.f()
                int r1 = r5.f58234s
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L22
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                fl.s.b(r6)
                goto L5d
            L12:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1a:
                java.lang.Object r1 = r5.f58233r
                tl.o r1 = (tl.o) r1
                fl.s.b(r6)
                goto L51
            L22:
                fl.s.b(r6)
                z0.f0 r6 = z0.f0.this
                z0.b r6 = z0.f0.c(r6)
                int r6 = r6.b()
                if (r6 <= 0) goto L6c
            L31:
                z0.f0 r6 = z0.f0.this
                em.o0 r6 = z0.f0.d(r6)
                em.p0.e(r6)
                z0.f0 r6 = z0.f0.this
                tl.o r1 = z0.f0.a(r6)
                z0.f0 r6 = z0.f0.this
                gm.g r6 = z0.f0.b(r6)
                r5.f58233r = r1
                r5.f58234s = r3
                java.lang.Object r6 = r6.b(r5)
                if (r6 != r0) goto L51
                goto L5c
            L51:
                r4 = 0
                r5.f58233r = r4
                r5.f58234s = r2
                java.lang.Object r6 = r1.invoke(r6, r5)
                if (r6 != r0) goto L5d
            L5c:
                return r0
            L5d:
                z0.f0 r6 = z0.f0.this
                z0.b r6 = z0.f0.c(r6)
                int r6 = r6.a()
                if (r6 != 0) goto L31
                fl.g0 r6 = fl.g0.f38750a
                return r6
            L6c:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "Check failed."
                r6.<init>(r0)
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: z0.f0.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public f0(em.o0 scope, Function1 onComplete, tl.o onUndeliveredElement, tl.o consumeMessage) {
        kotlin.jvm.internal.s.h(scope, "scope");
        kotlin.jvm.internal.s.h(onComplete, "onComplete");
        kotlin.jvm.internal.s.h(onUndeliveredElement, "onUndeliveredElement");
        kotlin.jvm.internal.s.h(consumeMessage, "consumeMessage");
        this.f58226a = scope;
        this.f58227b = consumeMessage;
        this.f58228c = gm.j.b(Integer.MAX_VALUE, null, null, 6, null);
        this.f58229d = new z0.b(0);
        z1 z1Var = (z1) scope.i0().get(z1.f38078x2);
        if (z1Var != null) {
            z1Var.q(new a(onComplete, this, onUndeliveredElement));
        }
    }

    public final void e(Object obj) {
        Object objE = this.f58228c.e(obj);
        if (objE instanceof gm.k.a) {
            Throwable thE = gm.k.e(objE);
            if (thE != null) {
                throw thE;
            }
            throw new ClosedSendChannelException("Channel was closed normally");
        }
        if (!gm.k.i(objE)) {
            throw new IllegalStateException("Check failed.");
        }
        if (this.f58229d.c() == 0) {
            em.k.d(this.f58226a, null, null, new b(null), 3, null);
        }
    }
}
