package bj;

import em.c1;
import em.o0;
import em.p0;
import em.z1;
import fl.g0;
import kotlin.coroutines.jvm.internal.m;
import kotlin.jvm.internal.s;
import tl.o;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f8958a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private z1 f8959b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f8960c = 5;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile boolean f8961d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private volatile boolean f8962e;

    /* JADX INFO: renamed from: bj.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class C0115a extends m implements o {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f8963r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ tl.a f8965t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0115a(tl.a aVar, kl.f fVar) {
            super(2, fVar);
            this.f8965t = aVar;
        }

        @Override // tl.o
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(o0 o0Var, kl.f fVar) {
            return ((C0115a) create(o0Var, fVar)).invokeSuspend(g0.f38750a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kl.f create(Object obj, kl.f fVar) {
            return a.this.new C0115a(this.f8965t, fVar);
        }

        /* JADX WARN: Code duplicated, block: B:11:0x0022  */
        /* JADX WARN: Code duplicated, block: B:13:0x0034 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:16:0x003d  */
        /* JADX WARN: Code duplicated, block: B:17:0x0044  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0032 -> B:14:0x0035). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:11:0x0022
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.a
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = ll.b.f()
                int r1 = r7.f8963r
                r2 = 1
                if (r1 == 0) goto L17
                if (r1 != r2) goto Lf
                fl.s.b(r8)
                goto L35
            Lf:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L17:
                fl.s.b(r8)
            L1a:
                bj.a r8 = bj.a.this
                boolean r8 = bj.a.c(r8)
                if (r8 == 0) goto L4a
                r8 = 1000(0x3e8, float:1.401E-42)
                long r3 = (long) r8
                bj.a r8 = bj.a.this
                long r5 = bj.a.a(r8)
                long r3 = r3 / r5
                r7.f8963r = r2
                java.lang.Object r8 = em.y0.a(r3, r7)
                if (r8 != r0) goto L35
                return r0
            L35:
                bj.a r8 = bj.a.this
                boolean r8 = bj.a.b(r8)
                if (r8 == 0) goto L44
                bj.a r8 = bj.a.this
                r1 = 0
                bj.a.d(r8, r1)
                goto L1a
            L44:
                tl.a r8 = r7.f8965t
                r8.invoke()
                goto L1a
            L4a:
                fl.g0 r8 = fl.g0.f38750a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: bj.a.C0115a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public final void e() {
        this.f8962e = true;
    }

    public final void f(tl.a callback) {
        s.h(callback, "callback");
        if (this.f8958a) {
            this.f8961d = true;
            this.f8959b = em.k.d(p0.a(c1.b()), null, null, new C0115a(callback, null), 3, null);
        }
    }

    public final void g() {
        this.f8961d = false;
        z1 z1Var = this.f8959b;
        if (z1Var != null) {
            z1.c0(z1Var, null, 1, null);
        }
        this.f8962e = false;
    }
}
