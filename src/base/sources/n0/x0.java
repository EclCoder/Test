package n0;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class x0 {

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class a extends kotlin.coroutines.jvm.internal.k implements tl.o {

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f46768s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private /* synthetic */ Object f46769t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        final /* synthetic */ View f46770u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(View view, kl.f fVar) {
            super(2, fVar);
            this.f46770u = view;
        }

        @Override // tl.o
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(am.i iVar, kl.f fVar) {
            return ((a) create(iVar, fVar)).invokeSuspend(fl.g0.f38750a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kl.f create(Object obj, kl.f fVar) {
            a aVar = new a(this.f46770u, fVar);
            aVar.f46769t = obj;
            return aVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x004c, code lost:
        
            if (r1.b(r5, r4) == r0) goto L17;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r5) {
            /*
                r4 = this;
                java.lang.Object r0 = ll.b.f()
                int r1 = r4.f46768s
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L22
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                fl.s.b(r5)
                goto L4f
            L12:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L1a:
                java.lang.Object r1 = r4.f46769t
                am.i r1 = (am.i) r1
                fl.s.b(r5)
                goto L37
            L22:
                fl.s.b(r5)
                java.lang.Object r5 = r4.f46769t
                r1 = r5
                am.i r1 = (am.i) r1
                android.view.View r5 = r4.f46770u
                r4.f46769t = r1
                r4.f46768s = r3
                java.lang.Object r5 = r1.a(r5, r4)
                if (r5 != r0) goto L37
                goto L4e
            L37:
                android.view.View r5 = r4.f46770u
                boolean r3 = r5 instanceof android.view.ViewGroup
                if (r3 == 0) goto L4f
                android.view.ViewGroup r5 = (android.view.ViewGroup) r5
                am.g r5 = n0.w0.b(r5)
                r3 = 0
                r4.f46769t = r3
                r4.f46768s = r2
                java.lang.Object r5 = r1.b(r5, r4)
                if (r5 != r0) goto L4f
            L4e:
                return r0
            L4f:
                fl.g0 r5 = fl.g0.f38750a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: n0.x0.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final am.g a(View view) {
        return am.j.b(new a(view, null));
    }
}
