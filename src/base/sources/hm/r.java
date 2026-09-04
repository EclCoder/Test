package hm;

import kotlin.jvm.functions.Function3;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
abstract /* synthetic */ class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f40643a = jm.e0.b("kotlinx.coroutines.flow.defaultConcurrency", 16, 1, Integer.MAX_VALUE);

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class a extends kotlin.coroutines.jvm.internal.m implements Function3 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f40644r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f40645s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private /* synthetic */ Object f40646t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        /* synthetic */ Object f40647u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        final /* synthetic */ tl.o f40648v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(tl.o oVar, kl.f fVar) {
            super(3, fVar);
            this.f40648v = oVar;
        }

        @Override // kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(f fVar, Object obj, kl.f fVar2) {
            a aVar = new a(this.f40648v, fVar2);
            aVar.f40646t = fVar;
            aVar.f40647u = obj;
            return aVar.invokeSuspend(fl.g0.f38750a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x005a, code lost:
        
            if (r3.emit(r7, r6) == r2) goto L16;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = r6.f40646t
                hm.f r0 = (hm.f) r0
                java.lang.Object r1 = r6.f40647u
                java.lang.Object r2 = ll.b.f()
                int r3 = r6.f40645s
                r4 = 2
                r5 = 1
                if (r3 == 0) goto L28
                if (r3 == r5) goto L20
                if (r3 != r4) goto L18
                fl.s.b(r7)
                goto L5d
            L18:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L20:
                java.lang.Object r3 = r6.f40644r
                hm.f r3 = (hm.f) r3
                fl.s.b(r7)
                goto L45
            L28:
                fl.s.b(r7)
                tl.o r7 = r6.f40648v
                java.lang.Object r3 = kotlin.coroutines.jvm.internal.l.a(r0)
                r6.f40646t = r3
                java.lang.Object r3 = kotlin.coroutines.jvm.internal.l.a(r1)
                r6.f40647u = r3
                r6.f40644r = r0
                r6.f40645s = r5
                java.lang.Object r7 = r7.invoke(r1, r6)
                if (r7 != r2) goto L44
                goto L5c
            L44:
                r3 = r0
            L45:
                java.lang.Object r0 = kotlin.coroutines.jvm.internal.l.a(r0)
                r6.f40646t = r0
                java.lang.Object r0 = kotlin.coroutines.jvm.internal.l.a(r1)
                r6.f40647u = r0
                r0 = 0
                r6.f40644r = r0
                r6.f40645s = r4
                java.lang.Object r7 = r3.emit(r7, r6)
                if (r7 != r2) goto L5d
            L5c:
                return r2
            L5d:
                fl.g0 r7 = fl.g0.f38750a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: hm.r.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final e a(e eVar, tl.o oVar) {
        return g.C(eVar, new a(oVar, null));
    }

    public static final e b(e eVar, Function3 function3) {
        return new im.h(function3, eVar, null, 0, null, 28, null);
    }
}
